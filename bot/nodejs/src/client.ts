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

// 资源定位信息
export class BaiResourceLocation extends $tea.Model {
  // 资源定位类型
  // HTTP_URL：资源url
  // STRING_BASE64：资源base64字符串（不带base64头部）
  locationType: string;
  // 资源定位值
  locationValue: string;
  static names(): { [key: string]: string } {
    return {
      locationType: 'location_type',
      locationValue: 'location_value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      locationType: 'string',
      locationValue: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// iot平台权限数据
export class IotBasicPermissionData extends $tea.Model {
  // 权限编码
  permissionCode: string;
  // 权限名称
  permissionName: string;
  // 权限内容
  permissionData: string;
  // 权限类型
  permissionType: string;
  // 权限模块
  module: string;
  static names(): { [key: string]: string } {
    return {
      permissionCode: 'permission_code',
      permissionName: 'permission_name',
      permissionData: 'permission_data',
      permissionType: 'permission_type',
      module: 'module',
    };
  }

  static types(): { [key: string]: any } {
    return {
      permissionCode: 'string',
      permissionName: 'string',
      permissionData: 'string',
      permissionType: 'string',
      module: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// sdk信息
export class SdkModel extends $tea.Model {
  // 主键id
  id: number;
  // 创建时间
  gmtCreate: string;
  // 修改时间
  gmtModified: string;
  // 设备SDK公钥
  verifyKey: string;
  // SDK版本号
  sdkVersionStr?: string;
  // sdk模型
  metaModel?: string;
  // 平台
  platform?: string;
  // 公司名称
  corpName?: string;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      gmtCreate: 'gmt_create',
      gmtModified: 'gmt_modified',
      verifyKey: 'verify_key',
      sdkVersionStr: 'sdk_version_str',
      metaModel: 'meta_model',
      platform: 'platform',
      corpName: 'corp_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'number',
      gmtCreate: 'string',
      gmtModified: 'string',
      verifyKey: 'string',
      sdkVersionStr: 'string',
      metaModel: 'string',
      platform: 'string',
      corpName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// GoodsIdAndCount
export class GoodsIdAndCount extends $tea.Model {
  // 商品id
  goodsSkuId: number;
  // 商品采购数量
  count: number;
  static names(): { [key: string]: string } {
    return {
      goodsSkuId: 'goods_sku_id',
      count: 'count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      goodsSkuId: 'number',
      count: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// ProductKey信息
export class ProductKeyModel extends $tea.Model {
  // 主键id
  id: number;
  // 创建时间
  gmtCreate: string;
  // 更新时间
  gmtModified: string;
  // 设备端ProductKey
  productKey: string;
  // 场景码
  scene: string;
  // 租户Id 
  tenantName: string;
  // 数据模型id 
  dataModelId: string;
  // sdk前缀
  sdkVersionPrefix: string;
  // 制造商
  manufacturer?: string;
  // 顾客
  customer?: string;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      gmtCreate: 'gmt_create',
      gmtModified: 'gmt_modified',
      productKey: 'product_key',
      scene: 'scene',
      tenantName: 'tenant_name',
      dataModelId: 'data_model_id',
      sdkVersionPrefix: 'sdk_version_prefix',
      manufacturer: 'manufacturer',
      customer: 'customer',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'number',
      gmtCreate: 'string',
      gmtModified: 'string',
      productKey: 'string',
      scene: 'string',
      tenantName: 'string',
      dataModelId: 'string',
      sdkVersionPrefix: 'string',
      manufacturer: 'string',
      customer: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 场景码信息
export class SceneModel extends $tea.Model {
  // 主键id
  id: number;
  // 创建时间
  gmtCreate: string;
  // 修改时间
  gmtModified: string;
  // 场景名
  sceneName: string;
  // 是否托管
  escrowed?: string;
  // 私钥密码
  privateKeyPassword?: string;
  // 租户
  tenantName?: string;
  // 场景类型
  sceneType?: string;
  // 是否跳过中台数据校验处理
  skipPegasus?: boolean;
  // 定制数据处理类 , 使用用逗号分隔
  customerProcessor?: string;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      gmtCreate: 'gmt_create',
      gmtModified: 'gmt_modified',
      sceneName: 'scene_name',
      escrowed: 'escrowed',
      privateKeyPassword: 'private_key_password',
      tenantName: 'tenant_name',
      sceneType: 'scene_type',
      skipPegasus: 'skip_pegasus',
      customerProcessor: 'customer_processor',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'number',
      gmtCreate: 'string',
      gmtModified: 'string',
      sceneName: 'string',
      escrowed: 'string',
      privateKeyPassword: 'string',
      tenantName: 'string',
      sceneType: 'string',
      skipPegasus: 'boolean',
      customerProcessor: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 数据校验失败返回体
export class DataVerifyFailureData extends $tea.Model {
  // 主键id 
  id: number;
  // 创建时间
  gmtCreate: string;
  // Alipay-0101
  scene: string;
  // 设备ID 
  deviceId?: string;
  // 发行设备ID 
  disDeviceId?: string;
  // 类型：0:数据上报;1:数据完整性校验
  type: number;
  // c89b65a2e3afd604977c0....
  publicKey?: string;
  // 验签类型：0(RAW_DATA)；1(公钥格式为PEM)；2(公钥格式为DER)
  formatType?: number;
  // 验证内容hash
  contentId?: string;
  // 验证内容
  content?: string;
  // 签名
  signature?: string;
  // 错误信息
  failMessage?: string;
  // 补充数据
  extraData?: string;
  // 数据来源：0(普通数据上报)；1(MAAS数据上报)；2(设备业务数据上报);3(标签流转)
  source?: number;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      gmtCreate: 'gmt_create',
      scene: 'scene',
      deviceId: 'device_id',
      disDeviceId: 'dis_device_id',
      type: 'type',
      publicKey: 'public_key',
      formatType: 'format_type',
      contentId: 'content_id',
      content: 'content',
      signature: 'signature',
      failMessage: 'fail_message',
      extraData: 'extra_data',
      source: 'source',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'number',
      gmtCreate: 'string',
      scene: 'string',
      deviceId: 'string',
      disDeviceId: 'string',
      type: 'number',
      publicKey: 'string',
      formatType: 'number',
      contentId: 'string',
      content: 'string',
      signature: 'string',
      failMessage: 'string',
      extraData: 'string',
      source: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 租户信息
export class PermissionedTenantModel extends $tea.Model {
  // 主键Id
  id: number;
  // 创建时间
  gmtCreate: string;
  // 修改时间
  gmtModified: string;
  // 租户名称
  tenantName: string;
  // 公司名称
  orgName: string;
  // 租户所有人标识
  owner?: string;
  // 网关私钥
  gatewayPrivateKey?: string;
  // 网关公钥
  gatewayPublicKey?: string;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      gmtCreate: 'gmt_create',
      gmtModified: 'gmt_modified',
      tenantName: 'tenant_name',
      orgName: 'org_name',
      owner: 'owner',
      gatewayPrivateKey: 'gateway_private_key',
      gatewayPublicKey: 'gateway_public_key',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'number',
      gmtCreate: 'string',
      gmtModified: 'string',
      tenantName: 'string',
      orgName: 'string',
      owner: 'string',
      gatewayPrivateKey: 'string',
      gatewayPublicKey: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 查询业务数据交易结果对象数据
export class QueryChainDataTransactionResultData extends $tea.Model {
  // 所属业务
  bizScene: string;
  // 数据资产类型
  dataScene: string;
  // 资产ID
  assetId: string;
  // 租户id
  tenantId: string;
  // 业务数据hash
  textHash: string;
  // 时间
  timestamp?: number;
  static names(): { [key: string]: string } {
    return {
      bizScene: 'biz_scene',
      dataScene: 'data_scene',
      assetId: 'asset_id',
      tenantId: 'tenant_id',
      textHash: 'text_hash',
      timestamp: 'timestamp',
    };
  }

  static types(): { [key: string]: any } {
    return {
      bizScene: 'string',
      dataScene: 'string',
      assetId: 'string',
      tenantId: 'string',
      textHash: 'string',
      timestamp: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 商品单点鉴定结果
export class BaiGoodsPointIdentificationResult extends $tea.Model {
  // 鉴定点大项名称
  pointName: string;
  // 鉴定点子项名称
  subPointName: string;
  // 单点鉴定结果
  // REAL：鉴定为真
  // FAKE：鉴定为假
  // UNABLE_IDENTIFY：无法鉴定
  result: string;
  // 鉴定分数
  grade?: string;
  // 用户侧的鉴定点point_id，直接将用户传入的user_point_id返回
  userPointId?: string;
  // 鉴定评价
  appraiseMessage?: string;
  // 鉴定点图片资源定位符
  resourceLocation?: BaiResourceLocation;
  static names(): { [key: string]: string } {
    return {
      pointName: 'point_name',
      subPointName: 'sub_point_name',
      result: 'result',
      grade: 'grade',
      userPointId: 'user_point_id',
      appraiseMessage: 'appraise_message',
      resourceLocation: 'resource_location',
    };
  }

  static types(): { [key: string]: any } {
    return {
      pointName: 'string',
      subPointName: 'string',
      result: 'string',
      grade: 'string',
      userPointId: 'string',
      appraiseMessage: 'string',
      resourceLocation: BaiResourceLocation,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 商品数字指纹子鉴定项鉴定结果
export class GoodsDigitalFingerprintPointIdentificationResult extends $tea.Model {
  // 子鉴定项
  subPointName: string;
  // 商品数字指纹鉴定子项鉴定结果
  result: string;
  // 鉴定子项鉴定得分
  grade: string;
  static names(): { [key: string]: string } {
    return {
      subPointName: 'sub_point_name',
      result: 'result',
      grade: 'grade',
    };
  }

  static types(): { [key: string]: any } {
    return {
      subPointName: 'string',
      result: 'string',
      grade: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 二轮车操作日志
export class EBikeOperationLog extends $tea.Model {
  // 日志时间
  time: string;
  // 租户
  tenant: string;
  // 小程序应用Id
  appId: string;
  // 用户id
  userId: string;
  // 设备id
  deviceId?: string;
  // 操作时间
  operateTime: string;
  // 操作描述
  operateDesc: string;
  // 操作是否成功
  success: boolean;
  // 日志等级(info、warn、error)
  level?: string;
  static names(): { [key: string]: string } {
    return {
      time: 'time',
      tenant: 'tenant',
      appId: 'app_id',
      userId: 'user_id',
      deviceId: 'device_id',
      operateTime: 'operate_time',
      operateDesc: 'operate_desc',
      success: 'success',
      level: 'level',
    };
  }

  static types(): { [key: string]: any } {
    return {
      time: 'string',
      tenant: 'string',
      appId: 'string',
      userId: 'string',
      deviceId: 'string',
      operateTime: 'string',
      operateDesc: 'string',
      success: 'boolean',
      level: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 商品数字指纹鉴定点
export class GoodsDigitalFingerprintPoint extends $tea.Model {
  // 鉴定点子项
  subPointName: string;
  // 微观图片url
  microImageUrl: string;
  // 宏观图片url
  macroImageUrl: string;
  static names(): { [key: string]: string } {
    return {
      subPointName: 'sub_point_name',
      microImageUrl: 'micro_image_url',
      macroImageUrl: 'macro_image_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      subPointName: 'string',
      microImageUrl: 'string',
      macroImageUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 告警策略
export class AlertStrategy extends $tea.Model {
  // 主键ID 
  id: number;
  // 创建时间
  gmtCreate: string;
  // 更新时间
  gmtModified: string;
  // 租户
  tenantName: string;
  // 场景码
  // 
  scene?: string;
  // 策略类型：DEBUG（技术联调）；MONITOR（生产监控）
  strategyType: string;
  // 策略详情，json格式
  strategyDetail: string;
  // 是否启用，默认false
  enabled: boolean;
  // 备注
  remark?: string;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      gmtCreate: 'gmt_create',
      gmtModified: 'gmt_modified',
      tenantName: 'tenant_name',
      scene: 'scene',
      strategyType: 'strategy_type',
      strategyDetail: 'strategy_detail',
      enabled: 'enabled',
      remark: 'remark',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'number',
      gmtCreate: 'string',
      gmtModified: 'string',
      tenantName: 'string',
      scene: 'string',
      strategyType: 'string',
      strategyDetail: 'string',
      enabled: 'boolean',
      remark: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 商品的鉴定点图片信息
export class BaiGoodsPoint extends $tea.Model {
  // 鉴定点名称
  pointName: string;
  // 鉴定点子项
  subPointName: string;
  // 鉴定点图片的url
  imageUrl?: string;
  // 图片内容base64编码的字符串，该字段与image_url至少一个非空，同时传入以image_url为准
  imageBase64?: string;
  // 用户侧鉴定单关联id
  userPointId?: string;
  static names(): { [key: string]: string } {
    return {
      pointName: 'point_name',
      subPointName: 'sub_point_name',
      imageUrl: 'image_url',
      imageBase64: 'image_base64',
      userPointId: 'user_point_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      pointName: 'string',
      subPointName: 'string',
      imageUrl: 'string',
      imageBase64: 'string',
      userPointId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 设备采购订单元素
export class IotBasicDeviceOrderItem extends $tea.Model {
  // 蚂蚁链IoT平台设备唯一ID
  deviceDid: string;
  // 设备唯一编号
  deviceSn: string;
  // 设备金额，精确到小数后两位
  paymentAmount: string;
  static names(): { [key: string]: string } {
    return {
      deviceDid: 'device_did',
      deviceSn: 'device_sn',
      paymentAmount: 'payment_amount',
    };
  }

  static types(): { [key: string]: any } {
    return {
      deviceDid: 'string',
      deviceSn: 'string',
      paymentAmount: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 原始数据包
export class RawData extends $tea.Model {
  // 链上设备id
  chainDeviceId?: string;
  // 数据内容
  content: string;
  // 设备id
  deviceId?: string;
  // 上链哈希
  txHash: string;
  // 上链时间
  txTime: number;
  // 链上外围设备ID
  chainPeripheralId?: string;
  // 外围设备ID
  peripheralId?: string;
  static names(): { [key: string]: string } {
    return {
      chainDeviceId: 'chain_device_id',
      content: 'content',
      deviceId: 'device_id',
      txHash: 'tx_hash',
      txTime: 'tx_time',
      chainPeripheralId: 'chain_peripheral_id',
      peripheralId: 'peripheral_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      chainDeviceId: 'string',
      content: 'string',
      deviceId: 'string',
      txHash: 'string',
      txTime: 'number',
      chainPeripheralId: 'string',
      peripheralId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// iot平台角色信息
export class IotBasicRolePermission extends $tea.Model {
  // 角色编码
  roleCode: string;
  // 角色名称
  roleName: string;
  // 权限列表
  permissionList: IotBasicPermissionData[];
  static names(): { [key: string]: string } {
    return {
      roleCode: 'role_code',
      roleName: 'role_name',
      permissionList: 'permission_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      roleCode: 'string',
      roleName: 'string',
      permissionList: { 'type': 'array', 'itemType': IotBasicPermissionData },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 商品数字指纹鉴定结果
export class GoodsDigitalFingerprintIdentifyResultData extends $tea.Model {
  // 鉴定结果
  identificationResult: string;
  // 鉴定结果描述
  description: string;
  // 商品数字指纹鉴定点鉴定结果列表
  pointIdentificationResults: GoodsDigitalFingerprintPointIdentificationResult[];
  static names(): { [key: string]: string } {
    return {
      identificationResult: 'identification_result',
      description: 'description',
      pointIdentificationResults: 'point_identification_results',
    };
  }

  static types(): { [key: string]: any } {
    return {
      identificationResult: 'string',
      description: 'string',
      pointIdentificationResults: { 'type': 'array', 'itemType': GoodsDigitalFingerprintPointIdentificationResult },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 部标设备数据
export class JtData extends $tea.Model {
  // 数据的可信平台唯一ID
  trustiotId: number;
  // IoT可信平台设备唯一ID
  trustiotEntityId: number;
  // 上报原文解析处理之后的数据
  processedContent: string;
  // 和上一次上报数据里程对比，新增的里程数
  deltaMileage?: number;
  // 正常位置信息：LOCATION
  // 告警信息：ALARM_BASIC、 ALARM_ADAS、 ALARM_DSM、 ALARM_ACCELEROMETER
  bizType: string;
  // 告警子类型
  // //ADAS
  // 10001: 前向碰撞报警
  // 10002: 车辆偏离报警
  // 10003: 车距过近报警
  // 10004: 行人碰撞报警
  // 10005: 频繁变道报警
  // 10006: 道路标识超限报警
  // 10007: 障碍物报警 //10008~10015 保留
  // 10016: 道路标志识别事件
  // 10017: 主动抓拍事件 //10018~10031 保留
  // //DSM
  // 10101: 疲劳驾驶报警
  // 10102: 接打电话报警
  // 10103: 抽烟报警报警
  // 10104: 分神驾驶报警
  // 10105: 驾驶员异常报警 //10106~10115 保留
  // 10116: 自动抓拍事件
  // 10117: 驾驶员变更事件 //10118~10031 保留
  // //加速度
  // 11701: 急加速
  // 11702: 急减速
  // 11703: 急转弯
  alarmSubType?: number;
  // 关联设备唯一ID
  relatedTrustEntityId?: string;
  // 日报日期
  reportDate?: string;
  static names(): { [key: string]: string } {
    return {
      trustiotId: 'trustiot_id',
      trustiotEntityId: 'trustiot_entity_id',
      processedContent: 'processed_content',
      deltaMileage: 'delta_mileage',
      bizType: 'biz_type',
      alarmSubType: 'alarm_sub_type',
      relatedTrustEntityId: 'related_trust_entity_id',
      reportDate: 'report_date',
    };
  }

  static types(): { [key: string]: any } {
    return {
      trustiotId: 'number',
      trustiotEntityId: 'number',
      processedContent: 'string',
      deltaMileage: 'number',
      bizType: 'string',
      alarmSubType: 'number',
      relatedTrustEntityId: 'string',
      reportDate: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 租赁合同信息
export class RentContractInfo extends $tea.Model {
  // 租赁合同ID
  contractId: string;
  // 租约时间 
  leaseTime: string;
  // 入住时间
  checkinDate: string;
  // 退租时间
  checkoutDate: string;
  static names(): { [key: string]: string } {
    return {
      contractId: 'contract_id',
      leaseTime: 'lease_time',
      checkinDate: 'checkin_date',
      checkoutDate: 'checkout_date',
    };
  }

  static types(): { [key: string]: any } {
    return {
      contractId: 'string',
      leaseTime: 'string',
      checkinDate: 'string',
      checkoutDate: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 通过设备ID注册发行时的设备参数
export class RegByDeviceIdParm extends $tea.Model {
  // 一般是业务上唯一的设备ID/资产编码
  deviceId: string;
  // 数据模型ID
  deviceDataModelId: string;
  // 固定填写RAW_DATA
  deviceFeature: string;
  // true : 设备ID已存在时返回存在的设备关联字段;
  // false : 设备ID已存在时直接抛出异常；
  withExistDeviceId: boolean;
  // 设备类型编码，联系蚂蚁侧获取设备类型编码
  deviceTypeCode: number;
  // 设备单价 单位：分
  initialPrice?: number;
  // 出厂时间
  factoryTime?: string;
  // 投放时间
  releaseTime?: string;
  // 额外信息，联系蚂蚁侧获取参数格式
  extraInfo?: string;
  // 资产所有人标识（统一社会信用代码）
  owner?: string;
  // 资产所有人名称
  ownerName?: string;
  // 设备IMEI
  deviceImei?: string;
  // 设备名称/设备型号
  deviceName?: string;
  // 生产厂商名
  corpName?: string;
  static names(): { [key: string]: string } {
    return {
      deviceId: 'device_id',
      deviceDataModelId: 'device_data_model_id',
      deviceFeature: 'device_feature',
      withExistDeviceId: 'with_exist_device_id',
      deviceTypeCode: 'device_type_code',
      initialPrice: 'initial_price',
      factoryTime: 'factory_time',
      releaseTime: 'release_time',
      extraInfo: 'extra_info',
      owner: 'owner',
      ownerName: 'owner_name',
      deviceImei: 'device_imei',
      deviceName: 'device_name',
      corpName: 'corp_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      deviceId: 'string',
      deviceDataModelId: 'string',
      deviceFeature: 'string',
      withExistDeviceId: 'boolean',
      deviceTypeCode: 'number',
      initialPrice: 'number',
      factoryTime: 'string',
      releaseTime: 'string',
      extraInfo: 'string',
      owner: 'string',
      ownerName: 'string',
      deviceImei: 'string',
      deviceName: 'string',
      corpName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// Sdk分页查询结果
export class SdkPageResponse extends $tea.Model {
  // 页数
  // 
  pageIndex: number;
  // 页码
  // 
  pageSize: number;
  // 总记录数
  // 
  totalSize: number;
  // 总页数
  // 
  totalPages: number;
  // 数据
  pageData: SdkModel[];
  static names(): { [key: string]: string } {
    return {
      pageIndex: 'page_index',
      pageSize: 'page_size',
      totalSize: 'total_size',
      totalPages: 'total_pages',
      pageData: 'page_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      pageIndex: 'number',
      pageSize: 'number',
      totalSize: 'number',
      totalPages: 'number',
      pageData: { 'type': 'array', 'itemType': SdkModel },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// code,name
export class CodeListView extends $tea.Model {
  // 数据code
  dataCode: string;
  // 数据名称
  dataName: string;
  static names(): { [key: string]: string } {
    return {
      dataCode: 'data_code',
      dataName: 'data_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      dataCode: 'string',
      dataName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// iotbasic-应用列表信息
export class IotbasicAppManagerPageInfo extends $tea.Model {
  // 应用类型
  fileFormat: string;
  // 应用大小
  fileSize: number;
  // 应用模块名称
  moduleName: string;
  // 设备品类code
  deviceCategory: string;
  // 设备品类名称
  deviceCategoryName: string;
  // 应用模块包名
  packageName: string;
  // 应用描述
  remark?: string;
  // 应用版本号
  apkVersion: string;
  // 应用包类型（整包：0/差分：1）
  apkType: number;
  // 应用名称
  apkName: string;
  // 应用包id
  apkId: string;
  // 下载次数
  downloadCount: number;
  // 安装次数
  installCount: number;
  // 设备型号
  deviceModel?: string;
  static names(): { [key: string]: string } {
    return {
      fileFormat: 'file_format',
      fileSize: 'file_size',
      moduleName: 'module_name',
      deviceCategory: 'device_category',
      deviceCategoryName: 'device_category_name',
      packageName: 'package_name',
      remark: 'remark',
      apkVersion: 'apk_version',
      apkType: 'apk_type',
      apkName: 'apk_name',
      apkId: 'apk_id',
      downloadCount: 'download_count',
      installCount: 'install_count',
      deviceModel: 'device_model',
    };
  }

  static types(): { [key: string]: any } {
    return {
      fileFormat: 'string',
      fileSize: 'number',
      moduleName: 'string',
      deviceCategory: 'string',
      deviceCategoryName: 'string',
      packageName: 'string',
      remark: 'string',
      apkVersion: 'string',
      apkType: 'number',
      apkName: 'string',
      apkId: 'string',
      downloadCount: 'number',
      installCount: 'number',
      deviceModel: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 查询设备列表结构体
export class IotBasicDeviceQueryResponse extends $tea.Model {
  // 设备名称	
  // 
  deviceName: string;
  // 设备序列号
  deviceSn: string;
  // 设备品类名称	
  deviceCategoryName: string;
  // 设备型号
  deviceModel: string;
  // 设备状态
  deviceStatus?: string;
  // 设备安装位置
  location?: string;
  // 设备注册时间
  registerTime: string;
  // 设备厂商
  corpName: string;
  // 租户ID
  tenantId: string;
  // 客户名称
  customerName: string;
  // 异常错误码
  abnormalCode?: string;
  // 设备唯一身份id
  deviceDid?: string;
  // 账号ID
  accountId: string;
  // 账户名称
  accountName: string;
  // 设备服务状态
  serviceStatus: string;
  // 应用版本号
  appVersion: string;
  // 服务有效期
  validityTime?: string;
  static names(): { [key: string]: string } {
    return {
      deviceName: 'device_name',
      deviceSn: 'device_sn',
      deviceCategoryName: 'device_category_name',
      deviceModel: 'device_model',
      deviceStatus: 'device_status',
      location: 'location',
      registerTime: 'register_time',
      corpName: 'corp_name',
      tenantId: 'tenant_id',
      customerName: 'customer_name',
      abnormalCode: 'abnormal_code',
      deviceDid: 'device_did',
      accountId: 'account_id',
      accountName: 'account_name',
      serviceStatus: 'service_status',
      appVersion: 'app_version',
      validityTime: 'validity_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      deviceName: 'string',
      deviceSn: 'string',
      deviceCategoryName: 'string',
      deviceModel: 'string',
      deviceStatus: 'string',
      location: 'string',
      registerTime: 'string',
      corpName: 'string',
      tenantId: 'string',
      customerName: 'string',
      abnormalCode: 'string',
      deviceDid: 'string',
      accountId: 'string',
      accountName: 'string',
      serviceStatus: 'string',
      appVersion: 'string',
      validityTime: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 租户关联信息请求结构体
export class TenantBindInfoReq extends $tea.Model {
  // 租户关联扩展信息
  extension?: string;
  // 业务类型，默认空
  bizType?: string;
  // 组织机构代码，可为中文
  tenantUid: string;
  // 组织结构名称
  userName: string;
  static names(): { [key: string]: string } {
    return {
      extension: 'extension',
      bizType: 'biz_type',
      tenantUid: 'tenant_uid',
      userName: 'user_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      extension: 'string',
      bizType: 'string',
      tenantUid: 'string',
      userName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// iotbasic设备模型固定属性失败内容
export class IotbasicDeviceModelFixedAttributeFailInfo extends $tea.Model {
  // 属性说明
  attributeName: string;
  // 属性名称
  attributeValue: string;
  // 数据值类型 字符串：string 数字：long
  dataType: string;
  // dataType为string时，表示数据长度最小值 dataType为long时，表示数据范围最小值
  dataRangeMin: number;
  // dataType为string时，表示数据长度最大值 dataType为long时，表示数据范围最大值
  dataRangeMax: number;
  // 失败code
  errorCode: string;
  // 失败消息
  errorMessage: string;
  static names(): { [key: string]: string } {
    return {
      attributeName: 'attribute_name',
      attributeValue: 'attribute_value',
      dataType: 'data_type',
      dataRangeMin: 'data_range_min',
      dataRangeMax: 'data_range_max',
      errorCode: 'error_code',
      errorMessage: 'error_message',
    };
  }

  static types(): { [key: string]: any } {
    return {
      attributeName: 'string',
      attributeValue: 'string',
      dataType: 'string',
      dataRangeMin: 'number',
      dataRangeMax: 'number',
      errorCode: 'string',
      errorMessage: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// JT设备所关联实体设备信息
export class RelatedEntity extends $tea.Model {
  // 所关联实体的类型
  entityType: string;
  // 所关联实体的trustiot唯一ID
  relatedEntityTrustiotId: number;
  static names(): { [key: string]: string } {
    return {
      entityType: 'entity_type',
      relatedEntityTrustiotId: 'related_entity_trustiot_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      entityType: 'string',
      relatedEntityTrustiotId: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 设备注册 请求对象
export class IotBasicDeviceRegisterInfo extends $tea.Model {
  // 设备规格
  deviceSpecs: string;
  // 设备型号
  deviceModel: string;
  // 设备名称
  deviceName: string;
  // 设备sn
  deviceSn: string;
  // 设备标签
  nickName?: string;
  // 安装位置
  location?: string;
  // 设备扩展信息
  deviceExt?: string;
  // 设备安全认证ID
  secId?: string;
  static names(): { [key: string]: string } {
    return {
      deviceSpecs: 'device_specs',
      deviceModel: 'device_model',
      deviceName: 'device_name',
      deviceSn: 'device_sn',
      nickName: 'nick_name',
      location: 'location',
      deviceExt: 'device_ext',
      secId: 'sec_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      deviceSpecs: 'string',
      deviceModel: 'string',
      deviceName: 'string',
      deviceSn: 'string',
      nickName: 'string',
      location: 'string',
      deviceExt: 'string',
      secId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 客户自定义实体
export class CustomEntityInfo extends $tea.Model {
  // 客户自定义实体类型，默认为JSSDK_ACCOUNT
  customerEntityType: string;
  // 客户自定义实体内容
  customerEntityContent: string;
  static names(): { [key: string]: string } {
    return {
      customerEntityType: 'customer_entity_type',
      customerEntityContent: 'customer_entity_content',
    };
  }

  static types(): { [key: string]: any } {
    return {
      customerEntityType: 'string',
      customerEntityContent: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 溯源码比对请求体
export class BaiQrcodeComparisonReqData extends $tea.Model {
  // 扫码操作id，多次请求的trace_id相同代表短时间内在扫同一个码
  traceId: string;
  // query图片定位信息
  queryImageLocation: BaiResourceLocation;
  // gallery图片定位信息
  galleryImageLocation: BaiResourceLocation;
  // 是否允许降级
  downgrade: boolean;
  static names(): { [key: string]: string } {
    return {
      traceId: 'trace_id',
      queryImageLocation: 'query_image_location',
      galleryImageLocation: 'gallery_image_location',
      downgrade: 'downgrade',
    };
  }

  static types(): { [key: string]: any } {
    return {
      traceId: 'string',
      queryImageLocation: BaiResourceLocation,
      galleryImageLocation: BaiResourceLocation,
      downgrade: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 创建xr用户通行证结果信息
export class XrUserTicketResultInfo extends $tea.Model {
  // xr通行证资源池名称
  xrTicketPoolName: string;
  // 购买数量，失败列表有值
  count?: number;
  // 失败原因，失败列表有值
  errorMsg?: string;
  // 通行证编号，成功列表有值
  xrTicketCode?: string;
  static names(): { [key: string]: string } {
    return {
      xrTicketPoolName: 'xr_ticket_pool_name',
      count: 'count',
      errorMsg: 'error_msg',
      xrTicketCode: 'xr_ticket_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      xrTicketPoolName: 'string',
      count: 'number',
      errorMsg: 'string',
      xrTicketCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 仓库实体身份附加参数请求结构体，应用在注册/更新API的ThingExtraParams
export class WarehouseReqModel extends $tea.Model {
  // 详细地址
  address?: string;
  // 面积 平方米单位*1e4
  area?: number;
  // 海拔 米单位*1e2
  elevation?: number;
  // 仓库高度 米单位*1e2
  height?: number;
  // 纬度 度数单位*1e9
  latitude?: number;
  // 经度 度数单位*1e9
  longitude?: number;
  // 所在国家，中国
  nation?: string;
  // 其他信息
  otherInfo?: string;
  // 仓库状态, AVAILABLE, IN_USE, DELETED, 自定义
  status?: string;
  // 仓库类型
  type?: string;
  static names(): { [key: string]: string } {
    return {
      address: 'address',
      area: 'area',
      elevation: 'elevation',
      height: 'height',
      latitude: 'latitude',
      longitude: 'longitude',
      nation: 'nation',
      otherInfo: 'other_info',
      status: 'status',
      type: 'type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      address: 'string',
      area: 'number',
      elevation: 'number',
      height: 'number',
      latitude: 'number',
      longitude: 'number',
      nation: 'string',
      otherInfo: 'string',
      status: 'string',
      type: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// PurchaseOrderInfoDetail 
export class PurchaseOrderInfoDetail extends $tea.Model {
  // 租赁订单号
  // 
  orderNumber: string;
  // 收货人姓名
  // 
  consigneeName: string;
  // 收货人身份证号
  consigneeIdNumber: string;
  // 收货人手机号
  // 
  consigneePhone: string;
  // 收货人地址
  consigneeAddress: string;
  // 供货商名称
  // 
  supplierName: string;
  // 供货商租户id
  // 
  supplierId: string;
  // 采购商id
  // 
  leaseId: string;
  // 商品信息列表
  goodsIdAndCount: GoodsIdAndCount[];
  static names(): { [key: string]: string } {
    return {
      orderNumber: 'order_number',
      consigneeName: 'consignee_name',
      consigneeIdNumber: 'consignee_id_number',
      consigneePhone: 'consignee_phone',
      consigneeAddress: 'consignee_address',
      supplierName: 'supplier_name',
      supplierId: 'supplier_id',
      leaseId: 'lease_id',
      goodsIdAndCount: 'goods_id_and_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      orderNumber: 'string',
      consigneeName: 'string',
      consigneeIdNumber: 'string',
      consigneePhone: 'string',
      consigneeAddress: 'string',
      supplierName: 'string',
      supplierId: 'string',
      leaseId: 'string',
      goodsIdAndCount: { 'type': 'array', 'itemType': GoodsIdAndCount },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// iotbasic发布批次信息
export class IotbasicReleaseOrderInfo extends $tea.Model {
  // 应用名称
  apkName: string;
  // 应用版本号
  apkVersion: string;
  // 工单id
  orderId: string;
  // 工单名称
  orderName: string;
  // 发布批次状态
  // 升级中：IN_PROGRESS
  // 取消中：CANCELING
  // 部分成功：PARTIAL_SUCCESS
  // 部分失败：PARTIAL_FAILED
  // 部分取消：PARTIAL_CANCELED
  // 全部成功：ALL_SUCCESS
  // 全部失败：ALL_FAILED
  // 全部取消：ALL_CANCELED
  status: string;
  // 发布时间
  releaseTime: string;
  // 设备升级总数
  releaseTotal: number;
  // 设备升级完成数
  releaseFinished: number;
  // 工单状态变更时间
  statusChangeTime: string;
  static names(): { [key: string]: string } {
    return {
      apkName: 'apk_name',
      apkVersion: 'apk_version',
      orderId: 'order_id',
      orderName: 'order_name',
      status: 'status',
      releaseTime: 'release_time',
      releaseTotal: 'release_total',
      releaseFinished: 'release_finished',
      statusChangeTime: 'status_change_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      apkName: 'string',
      apkVersion: 'string',
      orderId: 'string',
      orderName: 'string',
      status: 'string',
      releaseTime: 'string',
      releaseTotal: 'number',
      releaseFinished: 'number',
      statusChangeTime: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// iotbasic项目空间信息
export class ProjectSpaceInfo extends $tea.Model {
  // 项目名称
  projectName: string;
  // 项目编码
  projectCode: string;
  // 项目描述
  projectDesc?: string;
  static names(): { [key: string]: string } {
    return {
      projectName: 'project_name',
      projectCode: 'project_code',
      projectDesc: 'project_desc',
    };
  }

  static types(): { [key: string]: any } {
    return {
      projectName: 'string',
      projectCode: 'string',
      projectDesc: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 实例信息列表
export class InstanceInfo extends $tea.Model {
  // 实例id
  instanceId: string;
  // 实例名称
  instanceName: string;
  static names(): { [key: string]: string } {
    return {
      instanceId: 'instance_id',
      instanceName: 'instance_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      instanceId: 'string',
      instanceName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 查询交易结果信息
export class QueryTransactionResultInfo extends $tea.Model {
  // 区块hash
  blockHash?: string;
  // 父区块hash
  parentBlockHash?: string;
  // 交易时间戳
  timestamp?: string;
  // 该交易所能消耗的最大gas
  gas?: number;
  // 交易发起方账户
  from?: string;
  // 交易接收方账户
  to?: string;
  // 交易类型
  txType?: string;
  // 交易返回的数据
  data?: QueryChainDataTransactionResultData;
  static names(): { [key: string]: string } {
    return {
      blockHash: 'block_hash',
      parentBlockHash: 'parent_block_hash',
      timestamp: 'timestamp',
      gas: 'gas',
      from: 'from',
      to: 'to',
      txType: 'tx_type',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      blockHash: 'string',
      parentBlockHash: 'string',
      timestamp: 'string',
      gas: 'number',
      from: 'string',
      to: 'string',
      txType: 'string',
      data: QueryChainDataTransactionResultData,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 设备不可操作标识类
export class DeviceDisableData extends $tea.Model {
  // 设备sn号
  deviceSn: string;
  // 厂商
  corpName: string;
  static names(): { [key: string]: string } {
    return {
      deviceSn: 'device_sn',
      corpName: 'corp_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      deviceSn: 'string',
      corpName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 设备属性关系对象
export class IotDeviceAttributeRelationshipData extends $tea.Model {
  // id
  id?: number;
  // 设备品类名称
  deviceCategory: string;
  // 关系类型
  relationType: string;
  // 厂商名称
  corpName?: string;
  // 设备型号
  deviceModel?: string;
  // 设备规格
  deviceSpecs?: string;
  // 硬件模块
  hardwareModule?: string;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      deviceCategory: 'device_category',
      relationType: 'relation_type',
      corpName: 'corp_name',
      deviceModel: 'device_model',
      deviceSpecs: 'device_specs',
      hardwareModule: 'hardware_module',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'number',
      deviceCategory: 'string',
      relationType: 'string',
      corpName: 'string',
      deviceModel: 'string',
      deviceSpecs: 'string',
      hardwareModule: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 创建订单失败的返回结构体
export class InsertPurchaseOrderFailInfo extends $tea.Model {
  // 订单ID
  orderId: string;
  // 订单保存失败的原因
  failReason: string;
  static names(): { [key: string]: string } {
    return {
      orderId: 'order_id',
      failReason: 'fail_reason',
    };
  }

  static types(): { [key: string]: any } {
    return {
      orderId: 'string',
      failReason: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 菜鸟分拣机设备监控信息
export class ScfLeaseEqpInfo extends $tea.Model {
  // 设备类型
  deviceType?: string;
  // 运营日期
  operationDate?: string;
  // 修改时间
  gmtModified?: string;
  // 维修金比例
  maintenanceMoney?: string;
  // 当日设备维修记录
  maintainRecord?: string;
  // 设备识别号
  deviceNo?: string;
  // 创建时间
  gmtCreate?: string;
  // 当日分拣单数
  sortingNum?: string;
  // 当日运营时长,单位分钟
  operationMinute?: string;
  // 04:00-16:00分拣单数/（派件分拣单数）
  amNum?: string;
  // 16:00-04:00分拣单数/ （揽件分拣单数)
  pmNum?: string;
  // id
  id?: string;
  // 设备验收日期
  deviceAcceptanceDate?: string;
  // 数据更新时间
  dataUpdateTime?: string;
  static names(): { [key: string]: string } {
    return {
      deviceType: 'device_type',
      operationDate: 'operation_date',
      gmtModified: 'gmt_modified',
      maintenanceMoney: 'maintenance_money',
      maintainRecord: 'maintain_record',
      deviceNo: 'device_no',
      gmtCreate: 'gmt_create',
      sortingNum: 'sorting_num',
      operationMinute: 'operation_minute',
      amNum: 'am_num',
      pmNum: 'pm_num',
      id: 'id',
      deviceAcceptanceDate: 'device_acceptance_date',
      dataUpdateTime: 'data_update_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      deviceType: 'string',
      operationDate: 'string',
      gmtModified: 'string',
      maintenanceMoney: 'string',
      maintainRecord: 'string',
      deviceNo: 'string',
      gmtCreate: 'string',
      sortingNum: 'string',
      operationMinute: 'string',
      amNum: 'string',
      pmNum: 'string',
      id: 'string',
      deviceAcceptanceDate: 'string',
      dataUpdateTime: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 房源信息同步实体类
export class HouseInfo extends $tea.Model {
  // 房源唯一ID
  houseId: string;
  // 租赁模式
  leaseMode?: string;
  // 面积平方
  acreage?: string;
  // 房源类型：0住宅、1别墅、
  // 2商铺、3写字楼
  structure: number;
  // 房屋地址
  addr?: string;
  // 门锁设备DID
  lockId?: string;
  // 电表设备DID
  ammeterId?: string;
  static names(): { [key: string]: string } {
    return {
      houseId: 'house_id',
      leaseMode: 'lease_mode',
      acreage: 'acreage',
      structure: 'structure',
      addr: 'addr',
      lockId: 'lock_id',
      ammeterId: 'ammeter_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      houseId: 'string',
      leaseMode: 'string',
      acreage: 'string',
      structure: 'number',
      addr: 'string',
      lockId: 'string',
      ammeterId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 信物链存证请求结构体
export class EvidenceStorageReq extends $tea.Model {
  // 业务数据，原文上链，或者加密（label若为CRYPTO）上链，上链后的业务数据，通过授权可被区块链其他业务方查询
  bizData?: string;
  // 不同上链方式
  // 空/"": 默认
  // "TTTS": 溯源
  // "IOTPAY": 支付
  // "CZ": 存证
  // "RAW":文本
  category: string;
  // 上链实体id(设备/空间)
  // 不可和project_uid同时为空
  iotDid?: string;
  // 需要上链的证据的哈希值
  hash?: string;
  // 上链的附属信息
  metaJson?: string;
  // 上链的项目id,
  // 不可和iot_did同时为空
  projectUid?: string;
  static names(): { [key: string]: string } {
    return {
      bizData: 'biz_data',
      category: 'category',
      iotDid: 'iot_did',
      hash: 'hash',
      metaJson: 'meta_json',
      projectUid: 'project_uid',
    };
  }

  static types(): { [key: string]: any } {
    return {
      bizData: 'string',
      category: 'string',
      iotDid: 'string',
      hash: 'string',
      metaJson: 'string',
      projectUid: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// iotbasic项目品类信息
export class CategoryInfo extends $tea.Model {
  // 品类名称
  categoryName: string;
  // 品类编码
  categoryCode: string;
  // 描述内容
  remark?: string;
  // 行业
  industry: string;
  // 场景
  scene: string;
  static names(): { [key: string]: string } {
    return {
      categoryName: 'category_name',
      categoryCode: 'category_code',
      remark: 'remark',
      industry: 'industry',
      scene: 'scene',
    };
  }

  static types(): { [key: string]: any } {
    return {
      categoryName: 'string',
      categoryCode: 'string',
      remark: 'string',
      industry: 'string',
      scene: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 收集信息
export class CollectContent extends $tea.Model {
  // 链上设备ID（与可信设备ID至少填一项）
  chainDeviceId?: string;
  // 可信设备ID（与链上设备ID至少填一项）
  trustiotDeviceId?: number;
  // 收集的内容
  content: string;
  // 对内容的签名
  signature: string;
  // 服务端发送的扩展数据（非可信设备直接产生的数据）
  extraData?: string;
  // 数据模型Id
  dataModelId?: string;
  static names(): { [key: string]: string } {
    return {
      chainDeviceId: 'chain_device_id',
      trustiotDeviceId: 'trustiot_device_id',
      content: 'content',
      signature: 'signature',
      extraData: 'extra_data',
      dataModelId: 'data_model_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      chainDeviceId: 'string',
      trustiotDeviceId: 'number',
      content: 'string',
      signature: 'string',
      extraData: 'string',
      dataModelId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 租期信息
export class RentBillItem extends $tea.Model {
  // 租约分期ID
  billItemId: string;
  // 租约分期名称
  billItemName?: string;
  // 租期开始日期
  billItemBegin: string;
  // 租期结束日期 
  billItemEnd: string;
  // 租约金额
  billItemMoney: string;
  // 租约支付状态
  paymentState?: string;
  static names(): { [key: string]: string } {
    return {
      billItemId: 'bill_item_id',
      billItemName: 'bill_item_name',
      billItemBegin: 'bill_item_begin',
      billItemEnd: 'bill_item_end',
      billItemMoney: 'bill_item_money',
      paymentState: 'payment_state',
    };
  }

  static types(): { [key: string]: any } {
    return {
      billItemId: 'string',
      billItemName: 'string',
      billItemBegin: 'string',
      billItemEnd: 'string',
      billItemMoney: 'string',
      paymentState: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 溯源二维码生成请求的请求数据
export class BaiQrcodeGenerateReqData extends $tea.Model {
  // 二维码的码值
  qrcodeContent: string;
  static names(): { [key: string]: string } {
    return {
      qrcodeContent: 'qrcode_content',
    };
  }

  static types(): { [key: string]: any } {
    return {
      qrcodeContent: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 实体上链数据
export class EntityChainData extends $tea.Model {
  // 实体ID
  entityId: string;
  // 数据原文
  content: string;
  // 数据原文对应的签名
  sign: string;
  // 数据原文上链哈希
  txHash: string;
  static names(): { [key: string]: string } {
    return {
      entityId: 'entity_id',
      content: 'content',
      sign: 'sign',
      txHash: 'tx_hash',
    };
  }

  static types(): { [key: string]: any } {
    return {
      entityId: 'string',
      content: 'string',
      sign: 'string',
      txHash: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 数据模型
export class DataModel extends $tea.Model {
  //  数据模型Id
  dataModelId: string;
  // 数据模型名称
  dataModelName?: string;
  // 数据模型
  dataModel: string;
  // 数据模型类别
  bizType?: string;
  // 用户自定义版本
  customerVersion?: string;
  // 数据样例
  dataDemo?: string;
  static names(): { [key: string]: string } {
    return {
      dataModelId: 'data_model_id',
      dataModelName: 'data_model_name',
      dataModel: 'data_model',
      bizType: 'biz_type',
      customerVersion: 'customer_version',
      dataDemo: 'data_demo',
    };
  }

  static types(): { [key: string]: any } {
    return {
      dataModelId: 'string',
      dataModelName: 'string',
      dataModel: 'string',
      bizType: 'string',
      customerVersion: 'string',
      dataDemo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 溯源防伪码生成请求的响应数据
export class BaiQrcodeGenerateRespData extends $tea.Model {
  // 二维码的base64字符串
  generateResult: string;
  // 生成结果码
  generateCode: string;
  // 用于异常场景下细化错误信息
  generateMessage: string;
  // 生成失败时的解决方案，用于异常场景下细化错误信息
  unableGenerateSolution: string;
  static names(): { [key: string]: string } {
    return {
      generateResult: 'generate_result',
      generateCode: 'generate_code',
      generateMessage: 'generate_message',
      unableGenerateSolution: 'unable_generate_solution',
    };
  }

  static types(): { [key: string]: any } {
    return {
      generateResult: 'string',
      generateCode: 'string',
      generateMessage: 'string',
      unableGenerateSolution: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 充电明细信息
export class ChargeDetail extends $tea.Model {
  // 开始时间
  detailStartTime: string;
  // 结束时间
  detailEndTime: string;
  // 时段电价，小数点后4位
  elecPrice?: string;
  // 时段服务费价格，小数点后4位
  servicePrice?: string;
  // 时段充电量，单位：度，小数点后2位
  detailPower: string;
  // 时段电费，小数点后2位
  detailElecMoney?: string;
  // 时段服务费，小数点后2位
  detailServiceMoney?: string;
  static names(): { [key: string]: string } {
    return {
      detailStartTime: 'detail_start_time',
      detailEndTime: 'detail_end_time',
      elecPrice: 'elec_price',
      servicePrice: 'service_price',
      detailPower: 'detail_power',
      detailElecMoney: 'detail_elec_money',
      detailServiceMoney: 'detail_service_money',
    };
  }

  static types(): { [key: string]: any } {
    return {
      detailStartTime: 'string',
      detailEndTime: 'string',
      elecPrice: 'string',
      servicePrice: 'string',
      detailPower: 'string',
      detailElecMoney: 'string',
      detailServiceMoney: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// xr通行证批量创建成功列表
export class XrTicketPoolSuccessList extends $tea.Model {
  // 租户id
  tenantId: string;
  // 资源id
  resourceId: string;
  // 有效期
  validTime: string;
  // 体验时长
  testTime: number;
  // vr设备集合
  xrApps?: string;
  // 券池最大数
  maxPoolCount: number;
  // 券池名称
  xrTicketPoolName: string;
  // 核销类型
  xrVerificationType: string;
  static names(): { [key: string]: string } {
    return {
      tenantId: 'tenant_id',
      resourceId: 'resource_id',
      validTime: 'valid_time',
      testTime: 'test_time',
      xrApps: 'xr_apps',
      maxPoolCount: 'max_pool_count',
      xrTicketPoolName: 'xr_ticket_pool_name',
      xrVerificationType: 'xr_verification_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      tenantId: 'string',
      resourceId: 'string',
      validTime: 'string',
      testTime: 'number',
      xrApps: 'string',
      maxPoolCount: 'number',
      xrTicketPoolName: 'string',
      xrVerificationType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 更新设备和空间关联请求结构体
export class UpdateDeviceSpaceReq extends $tea.Model {
  // API要更新的设备DID
  deviceDid: string;
  // 0-全部更新 (暂不支持)
  // 1-添加  
  // 2-删除
  // 
  updateMode: number;
  // API要更新的设备部署库位
  deviceSpace: string[];
  static names(): { [key: string]: string } {
    return {
      deviceDid: 'device_did',
      updateMode: 'update_mode',
      deviceSpace: 'device_space',
    };
  }

  static types(): { [key: string]: any } {
    return {
      deviceDid: 'string',
      updateMode: 'number',
      deviceSpace: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 设备注册失败对象
export class IotBasicDeviceRegisterFail extends $tea.Model {
  // 设备名称
  deviceName: string;
  // 设备sn
  deviceSn: string;
  // 错误编码
  code: string;
  // 错误描述
  message: string;
  static names(): { [key: string]: string } {
    return {
      deviceName: 'device_name',
      deviceSn: 'device_sn',
      code: 'code',
      message: 'message',
    };
  }

  static types(): { [key: string]: any } {
    return {
      deviceName: 'string',
      deviceSn: 'string',
      code: 'string',
      message: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 设备信息
export class Device extends $tea.Model {
  // 设备ID，一般是设备的出厂编码或业务上的资产ID
  deviceId: string;
  // 数据模型Id
  deviceDataModelId: string;
  // 场景码
  scene: string;
  // imei号
  deviceImei: string;
  // 设备名称
  deviceName?: string;
  // 设备厂商名称
  corpName?: string;
  // 设备ICCID
  // 
  // 
  deviceIccid?: string;
  // 设备扩展信息
  extraInfo?: string;
  // 设备链上Id
  chainDeviceId: string;
  // 上链哈希
  txHash: string;
  // 上链时间
  txTime: number;
  // 设备类型编码，必填，对应资管平台中的设备类型 
  // 
  // 枚举值：
  // 
  // 车辆 1000 
  // 车辆 四轮车 1001 
  // 车辆 四轮车 纯电四轮车 1002 
  // 车辆 四轮车 混动四轮车 1003 
  // 车辆 四轮车 燃油四轮车 1004 
  // 车辆 两轮车 1011 
  // 车辆 两轮车 两轮单车 1012 
  // 车辆 两轮车 两轮助力车 1013 
  // 
  // 换电柜 2000 
  // 换电柜 二轮车换电柜 2001 
  // 
  // 电池 3000 
  // 电池 磷酸铁电池 3001 
  // 电池 三元锂电池 3002 
  // 
  // 回收设备 4000 
  // 
  // 垃圾分类回收 4001 
  // 
  // 洗车机 5000
  deviceTypeCode: number;
  // 单价
  initialPrice: number;
  // 投放时间
  releaseTime: string;
  // 出厂时间
  factoryTime: string;
  // 设备状态，取值范围：NORMAL、OFFLINE、UNREGISTER
  deviceStatus?: string;
  // 可信设备ID
  trustiotDeviceId: number;
  static names(): { [key: string]: string } {
    return {
      deviceId: 'device_id',
      deviceDataModelId: 'device_data_model_id',
      scene: 'scene',
      deviceImei: 'device_imei',
      deviceName: 'device_name',
      corpName: 'corp_name',
      deviceIccid: 'device_iccid',
      extraInfo: 'extra_info',
      chainDeviceId: 'chain_device_id',
      txHash: 'tx_hash',
      txTime: 'tx_time',
      deviceTypeCode: 'device_type_code',
      initialPrice: 'initial_price',
      releaseTime: 'release_time',
      factoryTime: 'factory_time',
      deviceStatus: 'device_status',
      trustiotDeviceId: 'trustiot_device_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      deviceId: 'string',
      deviceDataModelId: 'string',
      scene: 'string',
      deviceImei: 'string',
      deviceName: 'string',
      corpName: 'string',
      deviceIccid: 'string',
      extraInfo: 'string',
      chainDeviceId: 'string',
      txHash: 'string',
      txTime: 'number',
      deviceTypeCode: 'number',
      initialPrice: 'number',
      releaseTime: 'string',
      factoryTime: 'string',
      deviceStatus: 'string',
      trustiotDeviceId: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 新增厂商字典时需要传的产品信息
export class AddProductInfo extends $tea.Model {
  // 产品名称
  productName: string;
  // 产品code
  productCode: string;
  // 产品描述
  remark?: string;
  static names(): { [key: string]: string } {
    return {
      productName: 'product_name',
      productCode: 'product_code',
      remark: 'remark',
    };
  }

  static types(): { [key: string]: any } {
    return {
      productName: 'string',
      productCode: 'string',
      remark: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 设备实体请求结构体，应用在注册/更新API的ThingsExtraParams
export class DeviceRegisterReqModel extends $tea.Model {
  // 保留
  authLevel?: number;
  // 设备属性字符串，
  // 阿里云设备类型，填入三元组
  deviceAttribute?: string;
  // 物模型ID，参考其他文档
  deviceModelId?: string;
  // 可传入自定义信息
  otherInfo?: string;
  // 业务自定义，可以传入该实体的w3c服务节点
  serviceEndpoint?: string;
  // 保留，默认
  //     STATUS_REGISTERED(3)
  status?: string;
  static names(): { [key: string]: string } {
    return {
      authLevel: 'auth_level',
      deviceAttribute: 'device_attribute',
      deviceModelId: 'device_model_id',
      otherInfo: 'other_info',
      serviceEndpoint: 'service_endpoint',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authLevel: 'number',
      deviceAttribute: 'string',
      deviceModelId: 'string',
      otherInfo: 'string',
      serviceEndpoint: 'string',
      status: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 设备远程操作对象
export class DeviceOperateInfo extends $tea.Model {
  // 蚂蚁链iot平台设备ID
  deviceDid: string;
  // 设备签名
  signature: string;
  static names(): { [key: string]: string } {
    return {
      deviceDid: 'device_did',
      signature: 'signature',
    };
  }

  static types(): { [key: string]: any } {
    return {
      deviceDid: 'string',
      signature: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 菜鸟设备监控信息获取请求体
export class ScfLeaseEqpInfoQueryRequest extends $tea.Model {
  // 设备识别号
  deviceNo: string;
  // 运营日期
  operationDate: string;
  static names(): { [key: string]: string } {
    return {
      deviceNo: 'device_no',
      operationDate: 'operation_date',
    };
  }

  static types(): { [key: string]: any } {
    return {
      deviceNo: 'string',
      operationDate: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 用户通行证详情
export class XrUserTicketDetail extends $tea.Model {
  // 业务类型
  bizScene: string;
  // 所属客户
  tenantId: string;
  // 用户通行证编码
  xrTicketCode: string;
  // xr通行证资源池名称
  xrTicketPoolName: string;
  // 用户id
  userId: string;
  // 资源id
  resourceId: string;
  // 资源名称
  resourceName: string;
  // 用户通行证状态
  status: string;
  // 有效期
  validTime: string;
  // 实例id
  instanceId?: string;
  // 核销时间
  xrVerificationTime?: string;
  // 体验开始时间
  sampleStartTime?: string;
  // 体验结束时间
  sampleEndTime?: string;
  // 核销类型
  xrVerificationType: string;
  // 实例名称
  instanceName?: string;
  // 体验时长，分
  testTime: number;
  // vr应用集合
  xrApps?: string;
  static names(): { [key: string]: string } {
    return {
      bizScene: 'biz_scene',
      tenantId: 'tenant_id',
      xrTicketCode: 'xr_ticket_code',
      xrTicketPoolName: 'xr_ticket_pool_name',
      userId: 'user_id',
      resourceId: 'resource_id',
      resourceName: 'resource_name',
      status: 'status',
      validTime: 'valid_time',
      instanceId: 'instance_id',
      xrVerificationTime: 'xr_verification_time',
      sampleStartTime: 'sample_start_time',
      sampleEndTime: 'sample_end_time',
      xrVerificationType: 'xr_verification_type',
      instanceName: 'instance_name',
      testTime: 'test_time',
      xrApps: 'xr_apps',
    };
  }

  static types(): { [key: string]: any } {
    return {
      bizScene: 'string',
      tenantId: 'string',
      xrTicketCode: 'string',
      xrTicketPoolName: 'string',
      userId: 'string',
      resourceId: 'string',
      resourceName: 'string',
      status: 'string',
      validTime: 'string',
      instanceId: 'string',
      xrVerificationTime: 'string',
      sampleStartTime: 'string',
      sampleEndTime: 'string',
      xrVerificationType: 'string',
      instanceName: 'string',
      testTime: 'number',
      xrApps: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 信物链查询实体身份请求结构体
export class DidBaseQueryReq extends $tea.Model {
  // * "thingId"       原始ID
  // * "certText"      证书文本
  // * "certPublicKey"证书公钥
  // * "didPublicKey" DID公钥
  // * "didExtension"  DID扩展，设备/企业组织/仓库/空间的解析同thingsExtraParams
  // * "didUsername"   DID用户名
  // * "ownerDid"      所有者DID
  // * "userDid"       使用者DID
  // * "thingType"     实体类型，设备/企业组织/仓库/空间等
  // * "thingStatus"   实体状态
  // * "thingModelId" 实体物模型类型
  // * "thingAttribute"实体属性
  // * "thingVersion"  实体版本
  // * "spacesAttached"关联空间列表
  // * "thingsAttached"关联实体列表（例：库位关联设备）
  // * "authLevel"     授权等级
  // * "thingServiceEndpoint" 服务列表
  dataFilter: string[];
  // 是否从链上查询，从链上查询将返回txHash值
  onChain: boolean;
  // 需要查询的实体Did列表，同一次查询的Did须为相同类型
  thingsDidList: string[];
  static names(): { [key: string]: string } {
    return {
      dataFilter: 'data_filter',
      onChain: 'on_chain',
      thingsDidList: 'things_did_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      dataFilter: { 'type': 'array', 'itemType': 'string' },
      onChain: 'boolean',
      thingsDidList: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 商品鉴定返回结果
export class BaiGoodsComparisonResponse extends $tea.Model {
  // 鉴定结果（REAL：为真   FAKE：为假   UNABLE_IDENTIFY：无法鉴定）
  identificationResult: string;
  // 鉴定补充信息
  identificationMessage?: string;
  // 鉴定信息code
  identificationCode?: string;
  static names(): { [key: string]: string } {
    return {
      identificationResult: 'identification_result',
      identificationMessage: 'identification_message',
      identificationCode: 'identification_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      identificationResult: 'string',
      identificationMessage: 'string',
      identificationCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 租户分页查询结果
export class PermissionedTenantPageResponse extends $tea.Model {
  // 页数
  pageIndex: number;
  // 页码
  pageSize: number;
  // 总记录数
  totalSize: number;
  // 总页数
  totalPages: number;
  // 数据
  pageData: PermissionedTenantModel[];
  static names(): { [key: string]: string } {
    return {
      pageIndex: 'page_index',
      pageSize: 'page_size',
      totalSize: 'total_size',
      totalPages: 'total_pages',
      pageData: 'page_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      pageIndex: 'number',
      pageSize: 'number',
      totalSize: 'number',
      totalPages: 'number',
      pageData: { 'type': 'array', 'itemType': PermissionedTenantModel },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 任务信息
export class TaskInfo extends $tea.Model {
  // 升级计划Id
  planId?: number;
  // 刷库计划步骤id
  planStepId?: number;
  // 任务id
  taskId?: number;
  // action_id
  actionId?: number;
  // 任务类型
  taskType: string;
  static names(): { [key: string]: string } {
    return {
      planId: 'plan_id',
      planStepId: 'plan_step_id',
      taskId: 'task_id',
      actionId: 'action_id',
      taskType: 'task_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      planId: 'number',
      planStepId: 'number',
      taskId: 'number',
      actionId: 'number',
      taskType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 商品鉴定返回结果
export class BaiGoodsIdentificationRespData extends $tea.Model {
  // 鉴定结果
  // REAL：鉴定为真
  // FAKE：鉴定为假
  // UNABLE_IDENTIFY：无法鉴定
  identificationResult: string;
  // 整体鉴定分数
  grade: string;
  // 整体鉴定报告描述
  description?: string;
  // 鉴定点鉴定结果列表
  pointIdentificationResults: BaiGoodsPointIdentificationResult[];
  // 鉴定评价
  appraiseMessage?: string;
  // 用户自定义字符串，系统不做处理，会在响应体中带回
  outState?: string;
  static names(): { [key: string]: string } {
    return {
      identificationResult: 'identification_result',
      grade: 'grade',
      description: 'description',
      pointIdentificationResults: 'point_identification_results',
      appraiseMessage: 'appraise_message',
      outState: 'out_state',
    };
  }

  static types(): { [key: string]: any } {
    return {
      identificationResult: 'string',
      grade: 'string',
      description: 'string',
      pointIdentificationResults: { 'type': 'array', 'itemType': BaiGoodsPointIdentificationResult },
      appraiseMessage: 'string',
      outState: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// iot平台用户信息
// 
export class IotBasicUserInfo extends $tea.Model {
  // 租户ID
  tenant: string;
  // 金融云用户Id
  // 
  cloudUserId: string;
  // 金融云平台的登录名
  // 
  loginName: string;
  // 权限集合
  permissionList: IotBasicRolePermission[];
  static names(): { [key: string]: string } {
    return {
      tenant: 'tenant',
      cloudUserId: 'cloud_user_id',
      loginName: 'login_name',
      permissionList: 'permission_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      tenant: 'string',
      cloudUserId: 'string',
      loginName: 'string',
      permissionList: { 'type': 'array', 'itemType': IotBasicRolePermission },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 发行数据包
export class DistributeDataPackage extends $tea.Model {
  // 原始数据
  dataList: RawData[];
  // 发行设备Id
  distributeDeviceId: string;
  // 打包时间
  packageTime: number;
  static names(): { [key: string]: string } {
    return {
      dataList: 'data_list',
      distributeDeviceId: 'distribute_device_id',
      packageTime: 'package_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      dataList: { 'type': 'array', 'itemType': RawData },
      distributeDeviceId: 'string',
      packageTime: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// iotbasic项目品类行业场景内容
export class IotbasicCategoryIndustrySceneInfo extends $tea.Model {
  // 行业
  industry: string;
  // 场景
  scene: string;
  static names(): { [key: string]: string } {
    return {
      industry: 'industry',
      scene: 'scene',
    };
  }

  static types(): { [key: string]: any } {
    return {
      industry: 'string',
      scene: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// iotbasic设备模型固定属性
export class IotbasicDeviceModelFixedAttributeInfo extends $tea.Model {
  // 属性说明
  attributeName: string;
  // 属性名称
  attributeValue: string;
  // 数据值类型
  // 字符串：string
  // 数字：long
  dataType: string;
  // dataType为string时，表示数据长度最小值
  // dataType为long时，表示数据范围最小值
  dataRangeMin: number;
  // dataType为string时，表示数据长度最大值
  // dataType为long时，表示数据范围最大值
  dataRangeMax: number;
  static names(): { [key: string]: string } {
    return {
      attributeName: 'attribute_name',
      attributeValue: 'attribute_value',
      dataType: 'data_type',
      dataRangeMin: 'data_range_min',
      dataRangeMax: 'data_range_max',
    };
  }

  static types(): { [key: string]: any } {
    return {
      attributeName: 'string',
      attributeValue: 'string',
      dataType: 'string',
      dataRangeMin: 'number',
      dataRangeMax: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 通行证批量创建失败列表
export class XrTicketPoolFailList extends $tea.Model {
  // 券名称
  xrTicketPoolName: string;
  // 资源id
  resourceId: string;
  // 错误码
  errorCode: string;
  // 租户id
  tenantId: string;
  // 错误信息
  errorMsg: string;
  // 核销类型
  xrVerificationType: string;
  static names(): { [key: string]: string } {
    return {
      xrTicketPoolName: 'xr_ticket_pool_name',
      resourceId: 'resource_id',
      errorCode: 'error_code',
      tenantId: 'tenant_id',
      errorMsg: 'error_msg',
      xrVerificationType: 'xr_verification_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      xrTicketPoolName: 'string',
      resourceId: 'string',
      errorCode: 'string',
      tenantId: 'string',
      errorMsg: 'string',
      xrVerificationType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// BAI提供的OCR接口返回值
export class BaiOcrResponse extends $tea.Model {
  // 返回的结果体
  data: string;
  static names(): { [key: string]: string } {
    return {
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      data: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 溯源防伪码质检请求的请求数据
export class BaiQrcodeVerifyReqData extends $tea.Model {
  // 二维码图片url
  queryImageUrl: string;
  static names(): { [key: string]: string } {
    return {
      queryImageUrl: 'query_image_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      queryImageUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 线下场设备元素
export class XrVerificationModelVo extends $tea.Model {
  // 核销资源生成的实例，xr设备对应设备did
  instanceId: string;
  // 生成的实例名称，xr设备就的对应的具体设备sn
  instanceName: string;
  // 线下场有效期
  validTime: string;
  // 服务状态：INIT初始化、SERVICING服务中、PAUSED已暂停、EXPIRED停用
  seviceStatus: string;
  // 设备状态：INIT 初始化、ONLINE 在线、OFFLINE 离线、FAULT 故障、ACTIVATED 激活
  deviceStatus: string;
  // 唯一ID，对应线下场code
  resourceId: string;
  // 对应线下场名称
  resourceName: string;
  // 核销类型
  type: string;
  static names(): { [key: string]: string } {
    return {
      instanceId: 'instance_id',
      instanceName: 'instance_name',
      validTime: 'valid_time',
      seviceStatus: 'sevice_status',
      deviceStatus: 'device_status',
      resourceId: 'resource_id',
      resourceName: 'resource_name',
      type: 'type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      instanceId: 'string',
      instanceName: 'string',
      validTime: 'string',
      seviceStatus: 'string',
      deviceStatus: 'string',
      resourceId: 'string',
      resourceName: 'string',
      type: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 业务状态信息
export class BizStatusInfoOp extends $tea.Model {
  // 业务状态类型
  bizType: string;
  // 业务状态
  bizStatus: string;
  // 时间
  opTime: string;
  static names(): { [key: string]: string } {
    return {
      bizType: 'biz_type',
      bizStatus: 'biz_status',
      opTime: 'op_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      bizType: 'string',
      bizStatus: 'string',
      opTime: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 实体身份注册请求结构体
export class ThingsDidRegisterReq extends $tea.Model {
  // 业务编码，暂时保留，不需传入
  bizType?: string;
  // 信物链实体的所有者的分布式身份
  ownerTenantDid?: string;
  // 信物链实体附加信息 不同实体身份，有不同的json组织格式...
  // 参考
  // DeviceRegisterReqModel，
  // SpaceRegisterReqModel，
  // CorporateReqModel，
  // WarehouseReqModel，
  // 
  thingExtraParams?: string;
  // 原始id，租户内同一类型实体唯一
  thingOriginId: string;
  // 实体原始名称
  thingOriginName: string;
  // 信物链实体身份 
  // DID_TYPE_DEVICE_ALIYUN(0): 阿里云设备 
  // DID_TYPE_DEVICE_PEGASUS(1): 链机设备 
  // DID_TYPE_DEVICE_MCU(2): MCU设备 
  // DID_TYPE_DEVICE_INTEL(3): intel设备 
  // DID_TYPE_DEVICE_DEVICE(16384): 默认设备 ... 
  // DID_TYPE_CORPORATE(65536): 组织实体 
  // DID_TYPE_WAREHOUSE(131072)：仓库实体 
  // DID_TYPE_SPACE(196608)： 空间实体
  thingType: number;
  // 实体版本
  thingVersion: string;
  // 信物链实体的使用方的分布式身份列表
  userDid?: string[];
  static names(): { [key: string]: string } {
    return {
      bizType: 'biz_type',
      ownerTenantDid: 'owner_tenant_did',
      thingExtraParams: 'thing_extra_params',
      thingOriginId: 'thing_origin_id',
      thingOriginName: 'thing_origin_name',
      thingType: 'thing_type',
      thingVersion: 'thing_version',
      userDid: 'user_did',
    };
  }

  static types(): { [key: string]: any } {
    return {
      bizType: 'string',
      ownerTenantDid: 'string',
      thingExtraParams: 'string',
      thingOriginId: 'string',
      thingOriginName: 'string',
      thingType: 'number',
      thingVersion: 'string',
      userDid: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 数据上链失败结果
export class DeviceCollectFail extends $tea.Model {
  // 上链数据采集ID
  collectId: string;
  // 错误码
  code: string;
  // 错误信息
  message: string;
  static names(): { [key: string]: string } {
    return {
      collectId: 'collect_id',
      code: 'code',
      message: 'message',
    };
  }

  static types(): { [key: string]: any } {
    return {
      collectId: 'string',
      code: 'string',
      message: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 商品鉴定点鉴定响应体
export class BaiGoodsPointQueryRespData extends $tea.Model {
  // 识别结果
  // true：识别到鉴定点
  // false：未识别到鉴定点
  detection: boolean;
  // 鉴定结果
  // REAL：鉴定为真
  // FAKE：鉴定为假
  // UNABLE_IDENTIFY：无法鉴定
  identificationResult: string;
  static names(): { [key: string]: string } {
    return {
      detection: 'detection',
      identificationResult: 'identification_result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      detection: 'boolean',
      identificationResult: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 溯源防伪码质检响应数据
export class BaiQrcodeVerifyRespData extends $tea.Model {
  // 鉴定结果
  // REAL：通过
  // UNABLE_IDENTIFY：无法鉴定
  identificationResult: string;
  // 辅助识别结果码
  identificationCode: string;
  // 辅助识别信息
  identificationMessage: string;
  // 无法鉴定时的解决方案
  unableIdentifySolution: string;
  static names(): { [key: string]: string } {
    return {
      identificationResult: 'identification_result',
      identificationCode: 'identification_code',
      identificationMessage: 'identification_message',
      unableIdentifySolution: 'unable_identify_solution',
    };
  }

  static types(): { [key: string]: any } {
    return {
      identificationResult: 'string',
      identificationCode: 'string',
      identificationMessage: 'string',
      unableIdentifySolution: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 多媒体文件
export class JtMedia extends $tea.Model {
  // 多媒体ID
  mediaId: string;
  // 文件名称
  name: string;
  // 可访问的url
  url: string;
  // 上传时间
  gmtCreate: number;
  // 多媒体类型枚举：IMAGE 图像；AUDIO 音频；VIDEO视频； UN_KNOW  未知；
  mediaType: string;
  static names(): { [key: string]: string } {
    return {
      mediaId: 'media_id',
      name: 'name',
      url: 'url',
      gmtCreate: 'gmt_create',
      mediaType: 'media_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      mediaId: 'string',
      name: 'string',
      url: 'string',
      gmtCreate: 'number',
      mediaType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 商品鉴定点检测接口响应数据
export class BaiGoodsPointCheckRespData extends $tea.Model {
  // 图片是否有效，无效则需要提示重拍
  valid: boolean;
  static names(): { [key: string]: string } {
    return {
      valid: 'valid',
    };
  }

  static types(): { [key: string]: any } {
    return {
      valid: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 数据校验失败分页查询结果
export class DataVerifyFailureDataPageResponse extends $tea.Model {
  // 页数
  // 
  pageIndex: number;
  // 页码
  // 
  pageSize: number;
  // 总记录数
  // 
  totalSize: number;
  // 总页数
  // 
  totalPages: number;
  // 数据
  pageData: DataVerifyFailureData[];
  static names(): { [key: string]: string } {
    return {
      pageIndex: 'page_index',
      pageSize: 'page_size',
      totalSize: 'total_size',
      totalPages: 'total_pages',
      pageData: 'page_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      pageIndex: 'number',
      pageSize: 'number',
      totalSize: 'number',
      totalPages: 'number',
      pageData: { 'type': 'array', 'itemType': DataVerifyFailureData },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// TSM CommonCmd
export class TsmCommonCmd extends $tea.Model {
  // private byte cla;
  cla: number;
  //  host challenge data.
  data: number[];
  // private byte ins;
  ins: number;
  //  private byte lc;
  lc: number;
  // private byte le = (byte) 0x00;
  le?: number;
  // private Boolean needSecurityHandle = Boolean.TRUE;
  needSecurityHandle?: boolean;
  // private byte p1;
  p1: number;
  // private byte p2 = (byte) 0x00;
  p2: number;
  static names(): { [key: string]: string } {
    return {
      cla: 'cla',
      data: 'data',
      ins: 'ins',
      lc: 'lc',
      le: 'le',
      needSecurityHandle: 'need_security_handle',
      p1: 'p1',
      p2: 'p2',
    };
  }

  static types(): { [key: string]: any } {
    return {
      cla: 'number',
      data: { 'type': 'array', 'itemType': 'number' },
      ins: 'number',
      lc: 'number',
      le: 'number',
      needSecurityHandle: 'boolean',
      p1: 'number',
      p2: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// xr通行证批量创建请求
export class XrTicketPoolBatchReq extends $tea.Model {
  // 资源id
  resourceId: string;
  // 通行证有效期
  validTime: string;
  // 体验时长
  testTime: number;
  // vr设备集合
  xrApps?: string;
  // 券池最大出票数
  maxPoolCount: number;
  // 通行证名称
  xrTicketPoolName: string;
  // 核销类型
  xrVerificationType: string;
  static names(): { [key: string]: string } {
    return {
      resourceId: 'resource_id',
      validTime: 'valid_time',
      testTime: 'test_time',
      xrApps: 'xr_apps',
      maxPoolCount: 'max_pool_count',
      xrTicketPoolName: 'xr_ticket_pool_name',
      xrVerificationType: 'xr_verification_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      resourceId: 'string',
      validTime: 'string',
      testTime: 'number',
      xrApps: 'string',
      maxPoolCount: 'number',
      xrTicketPoolName: 'string',
      xrVerificationType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 设备管控 失败对象
export class DeviceControlFail extends $tea.Model {
  // 设备did
  deviceDid: string;
  // 操作失败code
  code: string;
  // 操作失败信息
  message: string;
  static names(): { [key: string]: string } {
    return {
      deviceDid: 'device_did',
      code: 'code',
      message: 'message',
    };
  }

  static types(): { [key: string]: any } {
    return {
      deviceDid: 'string',
      code: 'string',
      message: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 通过设备注册发行时的设备参数 （与RegByDeviceIdParam的区别在于设备端有无植入蚂蚁SDK或模组）
// 
export class RegByDeviceParm extends $tea.Model {
  // 一般是业务上唯一的设备ID/资产编码
  // 
  deviceId: string;
  // 数据模型ID
  deviceDataModelId: string;
  // 设备端经过蚂蚁SDK或模组初始化得到的注册信息
  deviceRegContent: string;
  // 蚂蚁侧SDK或模组对device_reg_content的签名
  deviceRegSignature: string;
  // sdk版本号，由蚂蚁侧提供
  sdkId: string;
  // 设备类型编码，联系蚂蚁侧获取设备类型编码
  // 
  deviceTypeCode: number;
  // 设备单价 单位：分
  // 
  initialPrice?: number;
  // 出厂时间
  // 
  factoryTime?: string;
  // 投放时间
  // 
  releaseTime?: string;
  // 额外信息，联系蚂蚁侧获取参数格式
  // 
  extraInfo?: string;
  // 资产所有人标识（统一社会信用代码）
  // 
  owner?: string;
  // 资产所有人名称
  ownerName?: string;
  // 设备名称/型号
  deviceName?: string;
  // 设备IMEI
  deviceImei?: string;
  static names(): { [key: string]: string } {
    return {
      deviceId: 'device_id',
      deviceDataModelId: 'device_data_model_id',
      deviceRegContent: 'device_reg_content',
      deviceRegSignature: 'device_reg_signature',
      sdkId: 'sdk_id',
      deviceTypeCode: 'device_type_code',
      initialPrice: 'initial_price',
      factoryTime: 'factory_time',
      releaseTime: 'release_time',
      extraInfo: 'extra_info',
      owner: 'owner',
      ownerName: 'owner_name',
      deviceName: 'device_name',
      deviceImei: 'device_imei',
    };
  }

  static types(): { [key: string]: any } {
    return {
      deviceId: 'string',
      deviceDataModelId: 'string',
      deviceRegContent: 'string',
      deviceRegSignature: 'string',
      sdkId: 'string',
      deviceTypeCode: 'number',
      initialPrice: 'number',
      factoryTime: 'string',
      releaseTime: 'string',
      extraInfo: 'string',
      owner: 'string',
      ownerName: 'string',
      deviceName: 'string',
      deviceImei: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// xr通行证券池分页返回
export class XrTicketPoolItem extends $tea.Model {
  // 业务类型
  bizScene?: string;
  // 通行证名称
  xrTicketPoolName?: string;
  // 资源id
  resourceId?: string;
  // 有效期
  validTime?: string;
  // 体验时长
  testTime?: number;
  // 通行证状态：EXPIRED：已过期  VALID：有效  SALED：已出售
  status?: string;
  // 判断已发放数量>0(USED：已使用)  判断已发放数量=0(NOT_USED：未使用)
  useStatus?: string;
  // 资源名称
  resourceName?: string;
  // 设备集合
  xrApps?: string;
  // 券池最大票数
  maxPoolCount?: number;
  // 租户id
  tenantId?: string;
  // 核销类型
  xrVerificationType?: string;
  // 剩余可用券数量
  surplusCount?: number;
  // 已发放数量 （总数-剩余数量）
  issuedCount?: number;
  static names(): { [key: string]: string } {
    return {
      bizScene: 'biz_scene',
      xrTicketPoolName: 'xr_ticket_pool_name',
      resourceId: 'resource_id',
      validTime: 'valid_time',
      testTime: 'test_time',
      status: 'status',
      useStatus: 'use_status',
      resourceName: 'resource_name',
      xrApps: 'xr_apps',
      maxPoolCount: 'max_pool_count',
      tenantId: 'tenant_id',
      xrVerificationType: 'xr_verification_type',
      surplusCount: 'surplus_count',
      issuedCount: 'issued_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      bizScene: 'string',
      xrTicketPoolName: 'string',
      resourceId: 'string',
      validTime: 'string',
      testTime: 'number',
      status: 'string',
      useStatus: 'string',
      resourceName: 'string',
      xrApps: 'string',
      maxPoolCount: 'number',
      tenantId: 'string',
      xrVerificationType: 'string',
      surplusCount: 'number',
      issuedCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 信物链证据基本组成结构体
export class EvidenceBaseModel extends $tea.Model {
  // 业务数据
  bizData?: string;
  // 证据哈希值
  hash?: string;
  // 证据附属信息字段
  metaJson?: string;
  static names(): { [key: string]: string } {
    return {
      bizData: 'biz_data',
      hash: 'hash',
      metaJson: 'meta_json',
    };
  }

  static types(): { [key: string]: any } {
    return {
      bizData: 'string',
      hash: 'string',
      metaJson: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// tlsnotary文件认证成功后上传到oss的文件链接列表
export class TlsnotaryUploadOssLinks extends $tea.Model {
  // 证书链摘要文件的oss链接
  certChainDigestLink: string;
  // 邮件eml文件的oss链接
  emlFileLink: string;
  static names(): { [key: string]: string } {
    return {
      certChainDigestLink: 'cert_chain_digest_link',
      emlFileLink: 'eml_file_link',
    };
  }

  static types(): { [key: string]: any } {
    return {
      certChainDigestLink: 'string',
      emlFileLink: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 二维码识别响应结构体
export class BaiQrcodeParseRespData extends $tea.Model {
  // 二维码内容
  codeValue: string[];
  static names(): { [key: string]: string } {
    return {
      codeValue: 'code_value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      codeValue: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 实体身份更新请求结构体，设备/仓库/空间/组织
export class ThingsDidUpdateReq extends $tea.Model {
  // 业务类型，默认空
  bizType?: string;
  // 待更新的实体did
  thingDid: string;
  // 更新内容，参考更新请求不同实体类型结构体，对应不同实体类型不一样
  // 信物链实体附加信息 不同实体身份，有不同的json组织格式，
  // 参考 DeviceRegisterReqModel， SpaceRegisterReqModel， CorporateReqModel， WarehouseReqModel，
  thingExtraParams?: string;
  // 更新后的实体版本
  thingVersion: string;
  static names(): { [key: string]: string } {
    return {
      bizType: 'biz_type',
      thingDid: 'thing_did',
      thingExtraParams: 'thing_extra_params',
      thingVersion: 'thing_version',
    };
  }

  static types(): { [key: string]: any } {
    return {
      bizType: 'string',
      thingDid: 'string',
      thingExtraParams: 'string',
      thingVersion: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 标签流转上链返回txHash
export class LabelChainResult extends $tea.Model {
  // 标签ID
  labelId: string;
  // 业务资产ID，接入方自行定义
  assetId?: string;
  // 标签最近一次上链的txHash
  txHash: string;
  // 错误码
  errorCode?: string;
  // 错误信息
  errorMsg: string;
  static names(): { [key: string]: string } {
    return {
      labelId: 'label_id',
      assetId: 'asset_id',
      txHash: 'tx_hash',
      errorCode: 'error_code',
      errorMsg: 'error_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      labelId: 'string',
      assetId: 'string',
      txHash: 'string',
      errorCode: 'string',
      errorMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// iotbasic数控设备信息
export class IotbasicDigitalKeyDeviceInfo extends $tea.Model {
  // 设备id
  devid: string;
  // 设备名称
  devName: string;
  // 设备sn
  sn: string;
  // Ccid
  ccid: string;
  // Msisdn
  msisdn: string;
  // tbox固件版本号(16进制)
  ver: string;
  static names(): { [key: string]: string } {
    return {
      devid: 'devid',
      devName: 'dev_name',
      sn: 'sn',
      ccid: 'ccid',
      msisdn: 'msisdn',
      ver: 'ver',
    };
  }

  static types(): { [key: string]: any } {
    return {
      devid: 'string',
      devName: 'string',
      sn: 'string',
      ccid: 'string',
      msisdn: 'string',
      ver: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 二维码识别请求
export class BaiQrcodeParseReqData extends $tea.Model {
  // 待识别图片的url
  imageUrl: string;
  static names(): { [key: string]: string } {
    return {
      imageUrl: 'image_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      imageUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 部标设备信息
export class JtDevice extends $tea.Model {
  // 设备ID
  deviceId: string;
  // 场景码
  scene: string;
  // 可信设备ID
  trustiotDeviceId: number;
  // 设备注册时间
  gmtCreate: number;
  // 设备是否在线
  online: boolean;
  // 设备型号
  deviceModel?: string;
  // 终端型号
  terminalType?: string;
  static names(): { [key: string]: string } {
    return {
      deviceId: 'device_id',
      scene: 'scene',
      trustiotDeviceId: 'trustiot_device_id',
      gmtCreate: 'gmt_create',
      online: 'online',
      deviceModel: 'device_model',
      terminalType: 'terminal_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      deviceId: 'string',
      scene: 'string',
      trustiotDeviceId: 'number',
      gmtCreate: 'number',
      online: 'boolean',
      deviceModel: 'string',
      terminalType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// iotbasic ota模块信息
export class IotbasicOtaModuleInfo extends $tea.Model {
  // OTA模块名称
  moduleName: string;
  // 最新版本号
  lastVersion?: string;
  static names(): { [key: string]: string } {
    return {
      moduleName: 'module_name',
      lastVersion: 'last_version',
    };
  }

  static types(): { [key: string]: any } {
    return {
      moduleName: 'string',
      lastVersion: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 电脑型号信息
export class ComputerInfo extends $tea.Model {
  // 颜色
  colour?: string;
  // 色值
  colourNumber?: string;
  // 电脑型号
  computerModel?: string;
  // 配置参数
  configParam?: string;
  // 显卡
  videoCard?: string;
  // 屏幕
  screenSize?: string;
  // 电脑CPU
  cpu: string;
  // 电脑内存
  memory: string;
  // 电脑硬盘
  diskSize: string;
  static names(): { [key: string]: string } {
    return {
      colour: 'colour',
      colourNumber: 'colour_number',
      computerModel: 'computer_model',
      configParam: 'config_param',
      videoCard: 'video_card',
      screenSize: 'screen_size',
      cpu: 'cpu',
      memory: 'memory',
      diskSize: 'disk_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      colour: 'string',
      colourNumber: 'string',
      computerModel: 'string',
      configParam: 'string',
      videoCard: 'string',
      screenSize: 'string',
      cpu: 'string',
      memory: 'string',
      diskSize: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 信物链存证查询请求结构体
export class EvidenceQueryInfoReq extends $tea.Model {
  // 暂时保留
  deviceSignature?: string;
  // 暂时保留
  deviceUid?: string;
  // 不同上链方式
  // "CZ": 普通存证
  // "IOTPAY": 支付存证
  // "RAW": 文本上链
  // "TTTS": 溯源存证
  queryType: string;
  // 查询的链上交易txHash
  txHash: string;
  static names(): { [key: string]: string } {
    return {
      deviceSignature: 'device_signature',
      deviceUid: 'device_uid',
      queryType: 'query_type',
      txHash: 'tx_hash',
    };
  }

  static types(): { [key: string]: any } {
    return {
      deviceSignature: 'string',
      deviceUid: 'string',
      queryType: 'string',
      txHash: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// AI商品鉴定请求信息
export class BaiGoodsComparisonReqData extends $tea.Model {
  // 品类
  category: string;
  // 品牌
  brand: string;
  // 款式
  style: string;
  // 商品鉴定点列表
  goodsPoints: BaiGoodsPoint[];
  // 用户自定义字符串，系统不做处理，会在响应体中带回
  outState?: string;
  static names(): { [key: string]: string } {
    return {
      category: 'category',
      brand: 'brand',
      style: 'style',
      goodsPoints: 'goods_points',
      outState: 'out_state',
    };
  }

  static types(): { [key: string]: any } {
    return {
      category: 'string',
      brand: 'string',
      style: 'string',
      goodsPoints: { 'type': 'array', 'itemType': BaiGoodsPoint },
      outState: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// iotbasic设备模型属性失败结果
export class IotbasicDeviceModelAttributeFailInfo extends $tea.Model {
  // 型号
  modelValue: string;
  // 规格列表 为空表示使用标准规格
  specsList?: string[];
  // 失败code
  errorCode: string;
  // 失败消息
  errorMessage: string;
  static names(): { [key: string]: string } {
    return {
      modelValue: 'model_value',
      specsList: 'specs_list',
      errorCode: 'error_code',
      errorMessage: 'error_message',
    };
  }

  static types(): { [key: string]: any } {
    return {
      modelValue: 'string',
      specsList: { 'type': 'array', 'itemType': 'string' },
      errorCode: 'string',
      errorMessage: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 收集数据返回的上链结果
export class SendCollectorResult extends $tea.Model {
  // 数据内容content的上链交易哈希
  txHash: string;
  // 原入参的数组索引
  originalIndex: number;
  static names(): { [key: string]: string } {
    return {
      txHash: 'tx_hash',
      originalIndex: 'original_index',
    };
  }

  static types(): { [key: string]: any } {
    return {
      txHash: 'string',
      originalIndex: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 二轮车操作日志分页查询结果
export class EBikeOperationLogPageResponse extends $tea.Model {
  // 页数
  // 
  pageIndex: number;
  // 页码
  pageSize: number;
  // 总记录数
  // 
  totalSize: number;
  // 总页数
  // 
  totalPages: number;
  // 数据
  pageData: EBikeOperationLog[];
  static names(): { [key: string]: string } {
    return {
      pageIndex: 'page_index',
      pageSize: 'page_size',
      totalSize: 'total_size',
      totalPages: 'total_pages',
      pageData: 'page_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      pageIndex: 'number',
      pageSize: 'number',
      totalSize: 'number',
      totalPages: 'number',
      pageData: { 'type': 'array', 'itemType': EBikeOperationLog },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 指纹图片入库是否成功
export class GoodsDigitalFingerprintRegisterResultData extends $tea.Model {
  // 指纹图片入库是否成功
  success: boolean;
  // 失败原因
  describe?: string;
  static names(): { [key: string]: string } {
    return {
      success: 'success',
      describe: 'describe',
    };
  }

  static types(): { [key: string]: any } {
    return {
      success: 'boolean',
      describe: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// iotbasic设备升级列表信息
export class IotbasicReleaseDeviceInfo extends $tea.Model {
  // 应用名称
  apkName: string;
  // 应用版本号
  apkVersion: string;
  // 工单id
  orderId: string;
  // 工单名称
  orderName: string;
  // 任务id
  taskId: string;
  // 设备升级任务唯一id
  orderDetailId: string;
  // 设备sn
  deviceSn: string;
  // 设备id
  deviceId: string;
  // 设备升级状态
  // 待确认：CONFIRM
  // 待推送：QUEUED
  // 已推送：NOTIFIED
  // 升级中：IN_PROGRESS
  // 升级成功：SUCCEEDED
  // 升级失败：FAILED
  // 已取消：CANCELED
  // 升级超时：TIMEOUT
  status: string;
  // 发布时间
  releaseTime?: string;
  // 升级完成时间
  upgradeTime?: string;
  static names(): { [key: string]: string } {
    return {
      apkName: 'apk_name',
      apkVersion: 'apk_version',
      orderId: 'order_id',
      orderName: 'order_name',
      taskId: 'task_id',
      orderDetailId: 'order_detail_id',
      deviceSn: 'device_sn',
      deviceId: 'device_id',
      status: 'status',
      releaseTime: 'release_time',
      upgradeTime: 'upgrade_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      apkName: 'string',
      apkVersion: 'string',
      orderId: 'string',
      orderName: 'string',
      taskId: 'string',
      orderDetailId: 'string',
      deviceSn: 'string',
      deviceId: 'string',
      status: 'string',
      releaseTime: 'string',
      upgradeTime: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 租户项目创建请求结构体模型
export class TenantProjectCreateReq extends $tea.Model {
  // 业务类型，默认空
  bizType?: string;
  // 可选的，项目关联的区块链类型，1/2/3代表存证/合约等类型
  blockchainType?: number;
  // 可选的，项目关联的区块链uid
  blockchainUid?: string;
  // 租户下唯一项目名称，用以标识项目聚合的存证等信息
  projectName: string;
  static names(): { [key: string]: string } {
    return {
      bizType: 'biz_type',
      blockchainType: 'blockchain_type',
      blockchainUid: 'blockchain_uid',
      projectName: 'project_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      bizType: 'string',
      blockchainType: 'number',
      blockchainUid: 'string',
      projectName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 设备硬件模块信息体
export class IotBasicDeviceHardWareModule extends $tea.Model {
  // 所属规格
  specsId: number;
  // 硬件模块ID
  hardwareModuleId: number;
  // 模块名称
  hardwareModuleName: string;
  // 模块编码
  hardwareModuleValue: string;
  // 模块参数
  hardwareModuleParam: string;
  static names(): { [key: string]: string } {
    return {
      specsId: 'specs_id',
      hardwareModuleId: 'hardware_module_id',
      hardwareModuleName: 'hardware_module_name',
      hardwareModuleValue: 'hardware_module_value',
      hardwareModuleParam: 'hardware_module_param',
    };
  }

  static types(): { [key: string]: any } {
    return {
      specsId: 'number',
      hardwareModuleId: 'number',
      hardwareModuleName: 'string',
      hardwareModuleValue: 'string',
      hardwareModuleParam: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 订单同步失败结果
export class DeviceOrderFail extends $tea.Model {
  // 订单id
  orderId: string;
  // 设备did
  deviceDid: string;
  // 返回code
  code: string;
  // 失败
  message: string;
  static names(): { [key: string]: string } {
    return {
      orderId: 'order_id',
      deviceDid: 'device_did',
      code: 'code',
      message: 'message',
    };
  }

  static types(): { [key: string]: any } {
    return {
      orderId: 'string',
      deviceDid: 'string',
      code: 'string',
      message: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 二维码验真接口返回值
export class BaiQrcodeComparisonRespData extends $tea.Model {
  // 识别结果（REAL：真   FAKE：假   UNABLE_IDENTIFY：无法识别）
  identificationResult: string;
  // 辅助识别结果码
  identificationCode?: string;
  // 辅助识别信息
  identificationMessage?: string;
  // 无法识别时提示的解决方案
  unableIdentifySolution?: string;
  static names(): { [key: string]: string } {
    return {
      identificationResult: 'identification_result',
      identificationCode: 'identification_code',
      identificationMessage: 'identification_message',
      unableIdentifySolution: 'unable_identify_solution',
    };
  }

  static types(): { [key: string]: any } {
    return {
      identificationResult: 'string',
      identificationCode: 'string',
      identificationMessage: 'string',
      unableIdentifySolution: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 收集标签数据
export class CollectLabelContent extends $tea.Model {
  // 链上设备ID
  chainDeviceId: string;
  // 1.设备端上报数据内容  
  // 2.与设备上报的数据一致，服务端不可修改
  // 3.解析后需与DataModel匹配 
  // 4.映射 Label 对象结构化存储
  // 5.转为JSON后如果是JSONObject 映射单个 Label
  // 6.转为JSON后如果是JSONArray 映射多个 Label
  content: string;
  // content的签名
  // 与设备上报的签名保持一致，服务端不可修改
  signature: string;
  // 未经设备签名的附加数据JSON String
  // 注意：如果 content 批量解析 ，extraData也会批量复制融入解析后的content
  extraData?: string;
  static names(): { [key: string]: string } {
    return {
      chainDeviceId: 'chain_device_id',
      content: 'content',
      signature: 'signature',
      extraData: 'extra_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      chainDeviceId: 'string',
      content: 'string',
      signature: 'string',
      extraData: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 数据上链成功结果数据
export class DeviceCollectResult extends $tea.Model {
  // 上链数据采集ID
  collectId: string;
  // 上链id
  antchainId?: string;
  static names(): { [key: string]: string } {
    return {
      collectId: 'collect_id',
      antchainId: 'antchain_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      collectId: 'string',
      antchainId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 可信设备ID及其关联的设备ID
export class TrustiotDeviceIdMap extends $tea.Model {
  // 可信设备ID
  trustiotDeviceId: number;
  // 设备ID	
  deviceId: string;
  // 设备注册的上链哈希
  chainDeviceId: string;
  static names(): { [key: string]: string } {
    return {
      trustiotDeviceId: 'trustiot_device_id',
      deviceId: 'device_id',
      chainDeviceId: 'chain_device_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      trustiotDeviceId: 'number',
      deviceId: 'string',
      chainDeviceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// ProductKey分页查询结果
export class ProductKeyPageResponse extends $tea.Model {
  // 页数
  // 
  pageIndex: number;
  // 页码
  // 
  pageSize: number;
  // 总记录数
  // 
  totalSize: number;
  // 总页数
  // 
  totalPages: number;
  // 数据
  pageData: ProductKeyModel[];
  static names(): { [key: string]: string } {
    return {
      pageIndex: 'page_index',
      pageSize: 'page_size',
      totalSize: 'total_size',
      totalPages: 'total_pages',
      pageData: 'page_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      pageIndex: 'number',
      pageSize: 'number',
      totalSize: 'number',
      totalPages: 'number',
      pageData: { 'type': 'array', 'itemType': ProductKeyModel },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 代扣服务返回对象
export class AntdigitalWithHoldResponse extends $tea.Model {
  // 网关返回码
  code: string;
  // 网关返回码描述
  msg: string;
  // 务返回码
  subCode: string;
  // 业务返回码描述
  subMsg: string;
  // 结果返回内容
  data?: string;
  // 响应签名
  signature: string;
  static names(): { [key: string]: string } {
    return {
      code: 'code',
      msg: 'msg',
      subCode: 'sub_code',
      subMsg: 'sub_msg',
      data: 'data',
      signature: 'signature',
    };
  }

  static types(): { [key: string]: any } {
    return {
      code: 'string',
      msg: 'string',
      subCode: 'string',
      subMsg: 'string',
      data: 'string',
      signature: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 二级商户信息
export class SubMerchantParams extends $tea.Model {
  // 子商户的商户id
  subMerchantId: string;
  // 子商户的商户名称
  subMerchantName: string;
  // 子商户的服务名称
  subMerchantServiceName: string;
  // 子商户的服务描述
  subMerchantServiceDescription: string;
  static names(): { [key: string]: string } {
    return {
      subMerchantId: 'sub_merchant_id',
      subMerchantName: 'sub_merchant_name',
      subMerchantServiceName: 'sub_merchant_service_name',
      subMerchantServiceDescription: 'sub_merchant_service_description',
    };
  }

  static types(): { [key: string]: any } {
    return {
      subMerchantId: 'string',
      subMerchantName: 'string',
      subMerchantServiceName: 'string',
      subMerchantServiceDescription: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 上链数据结果集
export class ChainModelResult extends $tea.Model {
  // 所属业务
  bizScene: string;
  // 资产类型
  dataScene: string;
  // 资产id
  assetId: string;
  // 资产数据内容json
  assetData: string;
  // 租户id
  tenantId: string;
  // 上链时间
  txTime: string;
  // 业务ID
  businessId: string;
  // 上链id
  antchainId: string;
  static names(): { [key: string]: string } {
    return {
      bizScene: 'biz_scene',
      dataScene: 'data_scene',
      assetId: 'asset_id',
      assetData: 'asset_data',
      tenantId: 'tenant_id',
      txTime: 'tx_time',
      businessId: 'business_id',
      antchainId: 'antchain_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      bizScene: 'string',
      dataScene: 'string',
      assetId: 'string',
      assetData: 'string',
      tenantId: 'string',
      txTime: 'string',
      businessId: 'string',
      antchainId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 空间实体身份附加参数请求结构体，应用在注册/更新API的ThingExtraParams
export class SpaceRegisterReqModel extends $tea.Model {
  // 面积 平方米单位*1e4	
  area?: number;
  // 自定义业务类型，例如选择：危险品/非危险品/食品
  bizType?: string;
  // 海拔 米单位*1e2
  elevation?: number;
  // 高度 米单位*1e2	
  height?: number;
  // 纬度 度数单位*1e9	
  latitude?: number;
  // 经度 度数单位*1e9	
  longitude?: number;
  // 自定义其他字段
  otherInfo?: string;
  // 父类型，在业务中自定义关联，例如仓位的父节点是仓库
  parentDid?: string;
  // 可填入符合w3c did定义的服务节点
  serviceEndpoint?: string;
  // 空间状态，自定义	
  status?: string;
  // 空间类型，例如冷藏/冷冻/通道/平面/立体	
  type?: string;
  static names(): { [key: string]: string } {
    return {
      area: 'area',
      bizType: 'biz_type',
      elevation: 'elevation',
      height: 'height',
      latitude: 'latitude',
      longitude: 'longitude',
      otherInfo: 'other_info',
      parentDid: 'parent_did',
      serviceEndpoint: 'service_endpoint',
      status: 'status',
      type: 'type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      area: 'number',
      bizType: 'string',
      elevation: 'number',
      height: 'number',
      latitude: 'number',
      longitude: 'number',
      otherInfo: 'string',
      parentDid: 'string',
      serviceEndpoint: 'string',
      status: 'string',
      type: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// xr用户通行证分页结果信息
export class XrUserTicketPageInfo extends $tea.Model {
  // 用户id
  userId: string;
  // 用户通行证编码
  xrTicketCode: string;
  // xr通行证资源池名称
  xrTicketPoolName: string;
  // 资源名称
  resourceName: string;
  // 用户通行证状态
  status: string;
  // 有效期
  validTime: string;
  // 所属业务
  bizScene: string;
  // 租户id
  tenantId: string;
  // 核销类型
  xrVerificationType: string;
  static names(): { [key: string]: string } {
    return {
      userId: 'user_id',
      xrTicketCode: 'xr_ticket_code',
      xrTicketPoolName: 'xr_ticket_pool_name',
      resourceName: 'resource_name',
      status: 'status',
      validTime: 'valid_time',
      bizScene: 'biz_scene',
      tenantId: 'tenant_id',
      xrVerificationType: 'xr_verification_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      userId: 'string',
      xrTicketCode: 'string',
      xrTicketPoolName: 'string',
      resourceName: 'string',
      status: 'string',
      validTime: 'string',
      bizScene: 'string',
      tenantId: 'string',
      xrVerificationType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 标签流转历史
export class LabelTrace extends $tea.Model {
  // 操作内容
  content?: string;
  // 链上哈希
  txHash: string;
  // 上链时间
  txTime?: string;
  // 上链失败的错误码
  errorCode?: string;
  // 上链失败的错误信息
  errorMsg?: string;
  // 是否上链成功
  isSuccess?: boolean;
  // 标签对应资产版本号
  version?: number;
  static names(): { [key: string]: string } {
    return {
      content: 'content',
      txHash: 'tx_hash',
      txTime: 'tx_time',
      errorCode: 'error_code',
      errorMsg: 'error_msg',
      isSuccess: 'is_success',
      version: 'version',
    };
  }

  static types(): { [key: string]: any } {
    return {
      content: 'string',
      txHash: 'string',
      txTime: 'string',
      errorCode: 'string',
      errorMsg: 'string',
      isSuccess: 'boolean',
      version: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 外围设备信息
export class Peripheral extends $tea.Model {
  // 外围设备Id
  peripheralId: string;
  // 数据模型id
  // 
  peripheralDataModelId: string;
  // 场景码
  // 
  scene: string;
  // 外围设备名称
  // 
  peripheralName?: string;
  // 厂商名称
  // 
  corpName?: string;
  // 链上外围设备Id
  // 
  chainPeripheralId: string;
  // 链上哈希
  txHash: string;
  // 上链时间
  txTime: number;
  // 设备类型编码，必填，对应资管平台中的设备类型 
  // 
  // 枚举值：
  // 
  // 车辆 1000 
  // 车辆 四轮车 1001 
  // 车辆 四轮车 纯电四轮车 1002 
  // 车辆 四轮车 混动四轮车 1003 
  // 车辆 四轮车 燃油四轮车 1004 
  // 车辆 两轮车 1011 
  // 车辆 两轮车 两轮单车 1012 
  // 车辆 两轮车 两轮助力车 1013 
  // 
  // 换电柜 2000 
  // 换电柜 二轮车换电柜 2001 
  // 
  // 电池 3000 
  // 电池 磷酸铁电池 3001 
  // 电池 三元锂电池 3002 
  // 
  // 回收设备 4000 
  // 
  // 垃圾分类回收 4001 
  // 
  // 洗车机 5000
  deviceTypeCode: number;
  // 单价，单位分
  initialPrice: number;
  // 出厂时间
  factoryTime: string;
  // 投放时间
  releaseTime: string;
  static names(): { [key: string]: string } {
    return {
      peripheralId: 'peripheral_id',
      peripheralDataModelId: 'peripheral_data_model_id',
      scene: 'scene',
      peripheralName: 'peripheral_name',
      corpName: 'corp_name',
      chainPeripheralId: 'chain_peripheral_id',
      txHash: 'tx_hash',
      txTime: 'tx_time',
      deviceTypeCode: 'device_type_code',
      initialPrice: 'initial_price',
      factoryTime: 'factory_time',
      releaseTime: 'release_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      peripheralId: 'string',
      peripheralDataModelId: 'string',
      scene: 'string',
      peripheralName: 'string',
      corpName: 'string',
      chainPeripheralId: 'string',
      txHash: 'string',
      txTime: 'number',
      deviceTypeCode: 'number',
      initialPrice: 'number',
      factoryTime: 'string',
      releaseTime: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 订单计费数据
export class OrderPushInfo extends $tea.Model {
  // 订单号
  orderId: string;
  // 时间戳，取订单上链timestamp字段
  orderCollectTime: string;
  // 订单总金额
  totalAmount: string;
  // 租户id
  tenantId: string;
  static names(): { [key: string]: string } {
    return {
      orderId: 'order_id',
      orderCollectTime: 'order_collect_time',
      totalAmount: 'total_amount',
      tenantId: 'tenant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      orderId: 'string',
      orderCollectTime: 'string',
      totalAmount: 'string',
      tenantId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 证书授权信息查询结果
export class SkuGrantStockInfoResp extends $tea.Model {
  // 产品型号
  productModel?: string;
  // 产品形式，取值范围： SOFTWARE_HARDWARE：软硬一体（SE方案）, SOFTWARE：纯软（非SE方案）
  productForm?: string;
  // 凭证种类列表，取值范围： ["PAYMENT"]：支付码， ["PAYMENT","TRANSIT"]：支付码+乘车码
  features?: string[];
  // 授权数量(指当前证书凭证种类下未消耗的证书数量)
  certNum?: number;
  static names(): { [key: string]: string } {
    return {
      productModel: 'product_model',
      productForm: 'product_form',
      features: 'features',
      certNum: 'cert_num',
    };
  }

  static types(): { [key: string]: any } {
    return {
      productModel: 'string',
      productForm: 'string',
      features: { 'type': 'array', 'itemType': 'string' },
      certNum: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 订单同步成功列表
export class DeviceOrderResult extends $tea.Model {
  // 上链id
  antchainId: string;
  // 订单id
  orderId: string;
  static names(): { [key: string]: string } {
    return {
      antchainId: 'antchain_id',
      orderId: 'order_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      antchainId: 'string',
      orderId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 物模型事件VO
export class ThingModelEventVO extends $tea.Model {
  // 名称
  name: string;
  // 物模型功能Id
  featureId: string;
  // 业务标识
  bizType: string;
  // 事件属性列表
  eventProperties: string;
  static names(): { [key: string]: string } {
    return {
      name: 'name',
      featureId: 'feature_id',
      bizType: 'biz_type',
      eventProperties: 'event_properties',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
      featureId: 'string',
      bizType: 'string',
      eventProperties: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 设备注册结果对象
export class IotBasicDeviceRegisterResult extends $tea.Model {
  // 设备did
  deviceDid: string;
  // 设备密钥
  privateKey: string;
  // 设备名称
  deviceName: string;
  // 设备sn
  deviceSn: string;
  static names(): { [key: string]: string } {
    return {
      deviceDid: 'device_did',
      privateKey: 'private_key',
      deviceName: 'device_name',
      deviceSn: 'device_sn',
    };
  }

  static types(): { [key: string]: any } {
    return {
      deviceDid: 'string',
      privateKey: 'string',
      deviceName: 'string',
      deviceSn: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// iotbasic设备模型属性
export class IotbasicDeviceModelAttributeInfo extends $tea.Model {
  // 型号
  modelValue: string;
  // 规格列表
  // 为空表示使用标准规格
  specsList?: string[];
  static names(): { [key: string]: string } {
    return {
      modelValue: 'model_value',
      specsList: 'specs_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      modelValue: 'string',
      specsList: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 信物链实体身份注册请求结构体
export class ThingsDidBaseRegisterRequest extends $tea.Model {
  // 信物链实体的所有者的分布式身份
  ownerTenantDid?: string;
  // 信物链实体的使用方的分布式身份列表
  userDid?: string[];
  // 信物链实体身份
  // DID_TYPE_DEVICE_ALIYUN: 阿里云设备
  // DID_TYPE_DEVICE_PEGASUS: 链机设备
  // DID_TYPE_DEVICE_MCU: MCU设备
  // DID_TYPE_DEVICE_INTEL: intel设备
  // DID_TYPE_DEVICE_DEVICE: 默认设备
  // ...
  // DID_TYPE_CORPORATE:  组织实体
  // DID_TYPE_WAREHOUSE：仓库实体
  // DID_TYPE_SPACE： 空间实体
  thingType: string;
  // 原始id，租户内同一类型实体唯一
  thingOriginId: string;
  // 实体原始名称
  thingOriginName: string;
  // 实体版本
  thingVersion: string;
  // 业务编码
  bizType?: string;
  // 信物链实体附加信息
  // 不同实体身份，有不同的json组织格式，参考另外技术文档
  thingExtraParams?: string;
  static names(): { [key: string]: string } {
    return {
      ownerTenantDid: 'owner_tenant_did',
      userDid: 'user_did',
      thingType: 'thing_type',
      thingOriginId: 'thing_origin_id',
      thingOriginName: 'thing_origin_name',
      thingVersion: 'thing_version',
      bizType: 'biz_type',
      thingExtraParams: 'thing_extra_params',
    };
  }

  static types(): { [key: string]: any } {
    return {
      ownerTenantDid: 'string',
      userDid: { 'type': 'array', 'itemType': 'string' },
      thingType: 'string',
      thingOriginId: 'string',
      thingOriginName: 'string',
      thingVersion: 'string',
      bizType: 'string',
      thingExtraParams: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 告警策略分页查询结果
export class AlertStrategyPageResponse extends $tea.Model {
  // 页数
  // 
  pageIndex: number;
  // 页码
  // 
  pageSize: number;
  // 总记录数
  // 
  totalSize: number;
  // 总页数
  // 
  totalPages: number;
  // 数据
  pageData: AlertStrategy[];
  static names(): { [key: string]: string } {
    return {
      pageIndex: 'page_index',
      pageSize: 'page_size',
      totalSize: 'total_size',
      totalPages: 'total_pages',
      pageData: 'page_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      pageIndex: 'number',
      pageSize: 'number',
      totalSize: 'number',
      totalPages: 'number',
      pageData: { 'type': 'array', 'itemType': AlertStrategy },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 场景分页查询结果
export class ScenePageResponse extends $tea.Model {
  // 页数
  // 
  pageIndex: number;
  // 页码
  // 
  pageSize: number;
  // 总记录数
  // 
  totalSize: number;
  // 总页数
  // 
  totalPages: number;
  // 数据
  pageData: SceneModel[];
  static names(): { [key: string]: string } {
    return {
      pageIndex: 'page_index',
      pageSize: 'page_size',
      totalSize: 'total_size',
      totalPages: 'total_pages',
      pageData: 'page_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      pageIndex: 'number',
      pageSize: 'number',
      totalSize: 'number',
      totalPages: 'number',
      pageData: { 'type': 'array', 'itemType': SceneModel },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 产线压测任务对象
export class OnlinePressureTestTask extends $tea.Model {
  // DATE
  gmtCreate?: string;
  // 修改时间	
  // 
  gmtModified?: string;
  // 产线场景码	
  // 
  scene: string;
  // 压测的目标设备可信信根设备的唯一标识，JSONArray字符串	
  // 
  componentIdList: string;
  // 客户侧的压测报告	
  // 
  customerPtReport?: string;
  // 压测开始时间	
  // 
  ptStartTime: string;
  // 压测结束时间	
  // 
  ptEndTime: string;
  // RUNNING: 正在执行 SUCCESS : 测试通过 FAILED : 测试不通过	
  // 
  ptStatus: string;
  // 关联SIT环境的工单ID	
  // 
  workOrderId?: string;
  // 关联SIT环境的项目ID	
  // 
  projectId: string;
  // 产线压测任务ID
  ptTaskId: string;
  // 压测不通过的原因
  failureReason: string;
  static names(): { [key: string]: string } {
    return {
      gmtCreate: 'gmt_create',
      gmtModified: 'gmt_modified',
      scene: 'scene',
      componentIdList: 'component_id_list',
      customerPtReport: 'customer_pt_report',
      ptStartTime: 'pt_start_time',
      ptEndTime: 'pt_end_time',
      ptStatus: 'pt_status',
      workOrderId: 'work_order_id',
      projectId: 'project_id',
      ptTaskId: 'pt_task_id',
      failureReason: 'failure_reason',
    };
  }

  static types(): { [key: string]: any } {
    return {
      gmtCreate: 'string',
      gmtModified: 'string',
      scene: 'string',
      componentIdList: 'string',
      customerPtReport: 'string',
      ptStartTime: 'string',
      ptEndTime: 'string',
      ptStatus: 'string',
      workOrderId: 'string',
      projectId: 'string',
      ptTaskId: 'string',
      failureReason: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 客户对应设备
export class CustomerDeviceItem extends $tea.Model {
  // id
  id: number;
  // 租户id
  tenantId: string;
  // 账号id
  accountId: string;
  //  设备品类-型号-规格  
  deviceType: string;
  // 设备sn
  deviceSn: string;
  // 设备did
  deviceDid: string;
  // 服务有效期
  valideTime: string;
  // 设备状态
  deviceStatus: string;
  // 服务状态
  serviceStatus: string;
  // 屏幕状态 开屏、锁屏
  screenStatus?: string;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      tenantId: 'tenant_id',
      accountId: 'account_id',
      deviceType: 'device_type',
      deviceSn: 'device_sn',
      deviceDid: 'device_did',
      valideTime: 'valide_time',
      deviceStatus: 'device_status',
      serviceStatus: 'service_status',
      screenStatus: 'screen_status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'number',
      tenantId: 'string',
      accountId: 'string',
      deviceType: 'string',
      deviceSn: 'string',
      deviceDid: 'string',
      valideTime: 'string',
      deviceStatus: 'string',
      serviceStatus: 'string',
      screenStatus: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 部标数据查询接口中返回的聚合统计指标结构体
export class JtExtraData extends $tea.Model {
  // 查询的时间范围内的行驶总里程
  deltaMileage: number;
  // 最大车速
  maxSpeed: number;
  // 平均车速
  avgSpeed: number;
  static names(): { [key: string]: string } {
    return {
      deltaMileage: 'delta_mileage',
      maxSpeed: 'max_speed',
      avgSpeed: 'avg_speed',
    };
  }

  static types(): { [key: string]: any } {
    return {
      deltaMileage: 'number',
      maxSpeed: 'number',
      avgSpeed: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 信物链实体查询返回的数据结构，对应数据表字段
export class DidBaseQueryResp extends $tea.Model {
  // 授权水平，0-默认关联授权
  authLevel?: number;
  // 证书公钥，特定实体可查询
  certPublicKey?: string;
  // 证书文本，特定实体可以查询
  certText?: string;
  // DID扩展，设备/企业组织/仓库/空间的解析同ThingExtraParams
  didExtension?: string;
  // did公钥，特定w3c did实体可查询
  didPublicKey?: string;
  // DID用户名，w3c did实体可查询
  didUsername?: string;
  // 所有者DID
  ownerDid?: string;
  // 实体附属空间列表，例如仓库下属库位，设备关联库位等
  spacesAttached?: string[];
  // 实体附属实体列表，例如空间关联设备列表
  thingsAttached?: string[];
  // 实体属性，在阿里云iot设备，对应三元组
  thingAttribute?: string;
  // 原始ID
  thingId?: string;
  // 实体物模型id
  thingModelId?: string;
  // 服务端点，可实现w3c service endpoint
  thingServiceEndpoint?: string;
  // 设备状态需要是通过 updateStatus api更新，
  // 其他状态通过updateThingsDid api更新
  thingStatus?: string;
  // 实体类型，注册时候的类型
  // 0: 阿里云设备
  // 1: 链机设备
  // 2: MCU设备
  // 3: INTEL设备
  // 16384:  默认设备
  // 65536: 组织身份
  // 131072: 仓库身份
  // 196608: 空间身份
  thingType?: number;
  // 实体版本
  thingVersion?: string;
  // 使用者DID列表
  userDidList?: string[];
  // 查询的did
  did?: string;
  static names(): { [key: string]: string } {
    return {
      authLevel: 'auth_level',
      certPublicKey: 'cert_public_key',
      certText: 'cert_text',
      didExtension: 'did_extension',
      didPublicKey: 'did_public_key',
      didUsername: 'did_username',
      ownerDid: 'owner_did',
      spacesAttached: 'spaces_attached',
      thingsAttached: 'things_attached',
      thingAttribute: 'thing_attribute',
      thingId: 'thing_id',
      thingModelId: 'thing_model_id',
      thingServiceEndpoint: 'thing_service_endpoint',
      thingStatus: 'thing_status',
      thingType: 'thing_type',
      thingVersion: 'thing_version',
      userDidList: 'user_did_list',
      did: 'did',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authLevel: 'number',
      certPublicKey: 'string',
      certText: 'string',
      didExtension: 'string',
      didPublicKey: 'string',
      didUsername: 'string',
      ownerDid: 'string',
      spacesAttached: { 'type': 'array', 'itemType': 'string' },
      thingsAttached: { 'type': 'array', 'itemType': 'string' },
      thingAttribute: 'string',
      thingId: 'string',
      thingModelId: 'string',
      thingServiceEndpoint: 'string',
      thingStatus: 'string',
      thingType: 'number',
      thingVersion: 'string',
      userDidList: { 'type': 'array', 'itemType': 'string' },
      did: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 用户通行证创建详情
export class XrUserTicketInfo extends $tea.Model {
  // xr通行证资源池名称
  xrTicketPoolName: string;
  // 购买数量
  count: number;
  static names(): { [key: string]: string } {
    return {
      xrTicketPoolName: 'xr_ticket_pool_name',
      count: 'count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      xrTicketPoolName: 'string',
      count: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 用户操作集合
export class IotBasicUserRequest extends $tea.Model {
  // 租户ID
  tenantId: string;
  // 金融云用户id
  cloudUserId?: string;
  // 登录名
  loginName?: string;
  static names(): { [key: string]: string } {
    return {
      tenantId: 'tenant_id',
      cloudUserId: 'cloud_user_id',
      loginName: 'login_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      tenantId: 'string',
      cloudUserId: 'string',
      loginName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 设备业务数据
export class BizContentGroup extends $tea.Model {
  // 设备链上ID（与scene参数、可信设备ID至少有一个参数不为空）
  chainDeviceId?: string;
  // 可信设备ID（与scene参数、设备链上ID至少有一个参数不为空）
  trustiotDeviceId?: number;
  // 业务Id
  // 
  // 
  bizId: string;
  // 业务类型
  // 
  // 
  bizType: string;
  // 数据内容 JSON字符串
  // 
  // 
  content: string;
  static names(): { [key: string]: string } {
    return {
      chainDeviceId: 'chain_device_id',
      trustiotDeviceId: 'trustiot_device_id',
      bizId: 'biz_id',
      bizType: 'biz_type',
      content: 'content',
    };
  }

  static types(): { [key: string]: any } {
    return {
      chainDeviceId: 'string',
      trustiotDeviceId: 'number',
      bizId: 'string',
      bizType: 'string',
      content: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 查询设备交易结果对象数据
export class QueryDeviceTransactionResultData extends $tea.Model {
  // 设备所属厂商
  corpName: string;
  // 场景码,所属项目
  scene: string;
  // IMEI
  deviceImei?: string;
  // 设备sn
  deviceSn: string;
  // 设备金额
  price?: string;
  // 设备分布式身份did
  deviceDid: string;
  // 设备终端唯一ID
  deviceTuid?: string;
  // 设备参数:品类+型号+规格
  deviceSpecs: string;
  // 所属租户
  tenantId: string;
  // 所属账号
  accountName: string;
  static names(): { [key: string]: string } {
    return {
      corpName: 'corp_name',
      scene: 'scene',
      deviceImei: 'device_imei',
      deviceSn: 'device_sn',
      price: 'price',
      deviceDid: 'device_did',
      deviceTuid: 'device_tuid',
      deviceSpecs: 'device_specs',
      tenantId: 'tenant_id',
      accountName: 'account_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      corpName: 'string',
      scene: 'string',
      deviceImei: 'string',
      deviceSn: 'string',
      price: 'string',
      deviceDid: 'string',
      deviceTuid: 'string',
      deviceSpecs: 'string',
      tenantId: 'string',
      accountName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 组织请求注册更新结构体，应用在注册/更新API的ThingExtraParams
export class CorporateReqModel extends $tea.Model {
  // 组织地址
  address?: string;
  // 运营地址
  businessAddress?: string;
  // 经营类目
  businessScope?: string;
  // 注册时间，字符串类型
  certifyDate?: string;
  // 营业执照有效期，字符串
  licenceExpireDate?: string;
  // 国家
  nation?: string;
  // 组织类型
  type?: string;
  static names(): { [key: string]: string } {
    return {
      address: 'address',
      businessAddress: 'business_address',
      businessScope: 'business_scope',
      certifyDate: 'certify_date',
      licenceExpireDate: 'licence_expire_date',
      nation: 'nation',
      type: 'type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      address: 'string',
      businessAddress: 'string',
      businessScope: 'string',
      certifyDate: 'string',
      licenceExpireDate: 'string',
      nation: 'string',
      type: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 商品数字指纹注册用户信息
export class GoodsDigitalFingerprintUserInfo extends $tea.Model {
  // 平台注册用户id
  userId: string;
  // 用户角色
  userRole: string;
  // 用户登录id来源
  channel: string;
  // 作为平台使用方，提供对应的渠道用户id列表
  relationUserIdList?: string[];
  static names(): { [key: string]: string } {
    return {
      userId: 'user_id',
      userRole: 'user_role',
      channel: 'channel',
      relationUserIdList: 'relation_user_id_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      userId: 'string',
      userRole: 'string',
      channel: 'string',
      relationUserIdList: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 收集标签数据（元数据，无签名）
export class CollectLabelRawContent extends $tea.Model {
  // 1.设备端上报数据内容 2.与设备上报的数据一致，服务端不可修改 3.解析后需与DataModel匹配 4.映射 Label 对象结构化存储 5.转为JSON后如果是JSONObject 映射单个 Label 6.转为JSON后如果是JSONArray 映射多个 Label
  content: string;
  // 数据模型ID 
  dataModelId: string;
  static names(): { [key: string]: string } {
    return {
      content: 'content',
      dataModelId: 'data_model_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      content: 'string',
      dataModelId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// iotbasic数控设备信息（不包含出库信息）
export class IotbasicDigitalKeyDeviceNoShipInfo extends $tea.Model {
  // 设备id
  devid: string;
  // 设备sn
  sn: string;
  // ccid
  ccid: string;
  // imei
  imei: string;
  // tbox固件版本号(16进制)
  ver: string;
  // PEPS系统固件版本号(16进制)
  pepsVer: string;
  // 蓝牙固件版本号(16进制)
  bleVer: string;
  static names(): { [key: string]: string } {
    return {
      devid: 'devid',
      sn: 'sn',
      ccid: 'ccid',
      imei: 'imei',
      ver: 'ver',
      pepsVer: 'peps_ver',
      bleVer: 'ble_ver',
    };
  }

  static types(): { [key: string]: any } {
    return {
      devid: 'string',
      sn: 'string',
      ccid: 'string',
      imei: 'string',
      ver: 'string',
      pepsVer: 'string',
      bleVer: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 发行设备
export class DistributeDevice extends $tea.Model {
  // 链上设备Id  （deviceType=DEVICE 时有值)
  chainDeviceId?: string;
  // 设备id
  deviceId: string;
  // 发行设备Id
  distributeDeviceId: string;
  // 场景码
  scene: string;
  // 设备类型 DEVICE : 设备 、PERIPHERAL : 外围设备
  deviceType: string;
  // 链上外围设备Id（deviceType=PERIPHERAL 时有值)
  chainPeripheralId?: string;
  // 设备状态，取值范围：NORMAL、OFFLINE、UNREGISTER
  deviceStatus?: string;
  static names(): { [key: string]: string } {
    return {
      chainDeviceId: 'chain_device_id',
      deviceId: 'device_id',
      distributeDeviceId: 'distribute_device_id',
      scene: 'scene',
      deviceType: 'device_type',
      chainPeripheralId: 'chain_peripheral_id',
      deviceStatus: 'device_status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      chainDeviceId: 'string',
      deviceId: 'string',
      distributeDeviceId: 'string',
      scene: 'string',
      deviceType: 'string',
      chainPeripheralId: 'string',
      deviceStatus: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 设备概览统计信息
export class DeviceOverViewResponse extends $tea.Model {
  // 设备品类名称
  deviceCategoryName: string;
  // 设备总数
  deviceTotal: number;
  static names(): { [key: string]: string } {
    return {
      deviceCategoryName: 'device_category_name',
      deviceTotal: 'device_total',
    };
  }

  static types(): { [key: string]: any } {
    return {
      deviceCategoryName: 'string',
      deviceTotal: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 手机型号信息
export class PhoneInfo extends $tea.Model {
  // 颜色
  colour: string;
  // 色值
  colourNumber: string;
  // 内存大小
  memory: string;
  static names(): { [key: string]: string } {
    return {
      colour: 'colour',
      colourNumber: 'colour_number',
      memory: 'memory',
    };
  }

  static types(): { [key: string]: any } {
    return {
      colour: 'string',
      colourNumber: 'string',
      memory: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 设备规格信息体
export class IotBasicDeviceSpecs extends $tea.Model {
  // 厂商编码
  corpValue: string;
  // 厂商名称
  corpName: string;
  // 型号名称
  modelName: string;
  // 型号编码
  modelValue: string;
  // 防疫机
  categoryName: string;
  // 设备品类编码
  categoryCode: string;
  // 规格ID
  specsId: number;
  // 规格名称
  specsName: string;
  // 规格编码
  specsValue: string;
  // 规格参数
  specsParam: string;
  static names(): { [key: string]: string } {
    return {
      corpValue: 'corp_value',
      corpName: 'corp_name',
      modelName: 'model_name',
      modelValue: 'model_value',
      categoryName: 'category_name',
      categoryCode: 'category_code',
      specsId: 'specs_id',
      specsName: 'specs_name',
      specsValue: 'specs_value',
      specsParam: 'specs_param',
    };
  }

  static types(): { [key: string]: any } {
    return {
      corpValue: 'string',
      corpName: 'string',
      modelName: 'string',
      modelValue: 'string',
      categoryName: 'string',
      categoryCode: 'string',
      specsId: 'number',
      specsName: 'string',
      specsValue: 'string',
      specsParam: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 商品数字指纹信息
export class GoodsDigitalFingerprintInfo extends $tea.Model {
  // 品类
  category: string;
  // 品牌
  brand: string;
  // 款式
  style: string;
  // 商品数字指纹鉴定点列表
  goodsPoints: GoodsDigitalFingerprintPoint[];
  // 商品id
  goodsId: string;
  static names(): { [key: string]: string } {
    return {
      category: 'category',
      brand: 'brand',
      style: 'style',
      goodsPoints: 'goods_points',
      goodsId: 'goods_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      category: 'string',
      brand: 'string',
      style: 'string',
      goodsPoints: { 'type': 'array', 'itemType': GoodsDigitalFingerprintPoint },
      goodsId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 具备实体权限访问者更新请求
export class DidUpdateTenantReq extends $tea.Model {
  // 待更新实体身份did
  thingDid: string;
  // 待更新访问者列表
  tenantList: string[];
  // 权限角色
  // TENANT_ROLE_OWNER
  // TENANT_ROLE_USER
  // TENANT_ROLE_OBSERVER
  tenantRole: string;
  // 增加权限：THINGS_OP_MODE_ADD
  // 删除权限：THINGS_OP_MODE_REMOVE
  opMode: string;
  static names(): { [key: string]: string } {
    return {
      thingDid: 'thing_did',
      tenantList: 'tenant_list',
      tenantRole: 'tenant_role',
      opMode: 'op_mode',
    };
  }

  static types(): { [key: string]: any } {
    return {
      thingDid: 'string',
      tenantList: { 'type': 'array', 'itemType': 'string' },
      tenantRole: 'string',
      opMode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 订单批量同步单个请求体
export class DeviceorderRequest extends $tea.Model {
  // 订单id
  orderId: string;
  // 支付状态
  orderStatus: string;
  // 商家唯一id
  merchantId: string;
  // 设备订单元素集合
  orderDeviceList: IotBasicDeviceOrderItem[];
  // 订单总金额，精确到小数点后两位
  totalAmount: string;
  static names(): { [key: string]: string } {
    return {
      orderId: 'order_id',
      orderStatus: 'order_status',
      merchantId: 'merchant_id',
      orderDeviceList: 'order_device_list',
      totalAmount: 'total_amount',
    };
  }

  static types(): { [key: string]: any } {
    return {
      orderId: 'string',
      orderStatus: 'string',
      merchantId: 'string',
      orderDeviceList: { 'type': 'array', 'itemType': IotBasicDeviceOrderItem },
      totalAmount: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 上链数据
export class CollectInfo extends $tea.Model {
  // 资产ID
  assetId: string;
  // 数据资产类型
  dataScene: string;
  // 资产数据内容，业务要上链的数据JSON格式
  assetData: string;
  // 上链数据采集id
  collectId: string;
  static names(): { [key: string]: string } {
    return {
      assetId: 'asset_id',
      dataScene: 'data_scene',
      assetData: 'asset_data',
      collectId: 'collect_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      assetId: 'string',
      dataScene: 'string',
      assetData: 'string',
      collectId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// id,name
export class IdListView extends $tea.Model {
  // 数据id
  dataId: number;
  // 数据名称
  dataName: string;
  static names(): { [key: string]: string } {
    return {
      dataId: 'data_id',
      dataName: 'data_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      dataId: 'number',
      dataName: 'string',
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

export class OpenAcecContractRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单号
  orderNo: string;
  // 产品码，全局唯一
  productCode: string;
  // 开通产品的租户ID
  tenantId: string;
  // 实例Id
  instanceId: string;
  // 服务接入码
  accessCode: string;
  // 用户自定义数据
  customData?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderNo: 'order_no',
      productCode: 'product_code',
      tenantId: 'tenant_id',
      instanceId: 'instance_id',
      accessCode: 'access_code',
      customData: 'custom_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderNo: 'string',
      productCode: 'string',
      tenantId: 'string',
      instanceId: 'string',
      accessCode: 'string',
      customData: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class OpenAcecContractResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 业务返回字段
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

export class StopAcecContractRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单号
  orderNo: string;
  // 产品码，全局唯一
  productCode: string;
  // 产品实例Id
  instanceId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderNo: 'order_no',
      productCode: 'product_code',
      instanceId: 'instance_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderNo: 'string',
      productCode: 'string',
      instanceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class StopAcecContractResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 业务返回字段
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

export class ResumeAcecContractRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 服务接入码
  accessCode: string;
  // 实例Id
  instanceId: string;
  // 订单号
  orderNo: string;
  // 产品码，全局唯一
  productCode: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      accessCode: 'access_code',
      instanceId: 'instance_id',
      orderNo: 'order_no',
      productCode: 'product_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      accessCode: 'string',
      instanceId: 'string',
      orderNo: 'string',
      productCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ResumeAcecContractResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 业务返回字段
  // 
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

export class CreateLeaseRealpersonRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 身份信息来源类型，当前仅支持证件（CERT_INFO）
  identityType: string;
  // 证件类型，当前仅支持身份证（IDENTITY_CARD）
  certType: string;
  // 真实姓名
  certName: string;
  // 证件号码
  certNo: string;
  // 商户请求的唯一标识。
  // 值为 32 位长度的字母数字组合。其中，前面几位字符是商户自定义的简称，中间几位可以使用一段时间，后段可以使用一个随机或递增序列。该值也可以使用 UUID
  outerOrderNo: string;
  // 认证结束回跳地址
  returnUrl: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      identityType: 'identity_type',
      certType: 'cert_type',
      certName: 'cert_name',
      certNo: 'cert_no',
      outerOrderNo: 'outer_order_no',
      returnUrl: 'return_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      identityType: 'string',
      certType: 'string',
      certName: 'string',
      certNo: 'string',
      outerOrderNo: 'string',
      returnUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateLeaseRealpersonResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 业务返回字段，JSON格式
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

export class QueryLeaseRealpersonRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 实人认证的唯一标识
  certifyId: string;
  // 商户请求的唯一标识。 值为 32 位长度的字母数字组合。其中，前面几位字符是商户自定义的简称，中间几位可以使用一段时间，后段可以使用一个随机或递增序列。该值也可以使用 UUID
  outerOrderNo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      certifyId: 'certify_id',
      outerOrderNo: 'outer_order_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      certifyId: 'string',
      outerOrderNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryLeaseRealpersonResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 业务返回字段，JSON格式
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

export class QueryLeaseRiskRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 外部系统的用户唯一ID
  userId: string;
  // 用户姓名
  userName: string;
  // 用户身份证号码
  certNo: string;
  // 用户手机号码
  mobile: string;
  // 用户IP地址
  ip: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      userId: 'user_id',
      userName: 'user_name',
      certNo: 'cert_no',
      mobile: 'mobile',
      ip: 'ip',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      userId: 'string',
      userName: 'string',
      certNo: 'string',
      mobile: 'string',
      ip: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryLeaseRiskResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 业务返回字段，JSON格式
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

export class CreateXrUserticketRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 所属业务
  bizScene: string;
  // 用户id
  userId: string;
  // 购买的通行证列表详情
  xrUserTicketList: XrUserTicketInfo[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizScene: 'biz_scene',
      userId: 'user_id',
      xrUserTicketList: 'xr_user_ticket_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizScene: 'string',
      userId: 'string',
      xrUserTicketList: { 'type': 'array', 'itemType': XrUserTicketInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateXrUserticketResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 是否成功
  success?: boolean;
  // 成功列表
  successList?: XrUserTicketResultInfo[];
  // 失败列表
  failList?: XrUserTicketResultInfo[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      success: 'success',
      successList: 'success_list',
      failList: 'fail_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      success: 'boolean',
      successList: { 'type': 'array', 'itemType': XrUserTicketResultInfo },
      failList: { 'type': 'array', 'itemType': XrUserTicketResultInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListXrXrticketpoolRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 所属业务
  bizScene: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizScene: 'biz_scene',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizScene: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListXrXrticketpoolResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 是否成功
  success?: boolean;
  // 资源池列表
  xrTicketPoolList?: IdListView[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      success: 'success',
      xrTicketPoolList: 'xr_ticket_pool_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      success: 'boolean',
      xrTicketPoolList: { 'type': 'array', 'itemType': IdListView },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequeryXrUserticketRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 所属业务
  bizScene: string;
  // 资源id
  resourceId?: string;
  // 用户id
  userId?: string;
  // 用户通行证状态，
  // VALID：待核销
  // WRITE_OFF：已核销
  // EXPIRED：已过期
  status?: string;
  // 当前页
  current: number;
  // 每页数量
  pageSize: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizScene: 'biz_scene',
      resourceId: 'resource_id',
      userId: 'user_id',
      status: 'status',
      current: 'current',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizScene: 'string',
      resourceId: 'string',
      userId: 'string',
      status: 'string',
      current: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequeryXrUserticketResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 是否成功
  success?: boolean;
  // 用户通行证列表
  xrUserTicketList?: XrUserTicketPageInfo[];
  // 当前页码
  current?: number;
  // 每页条数
  pageSize?: number;
  // 总数量
  total?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      success: 'success',
      xrUserTicketList: 'xr_user_ticket_list',
      current: 'current',
      pageSize: 'page_size',
      total: 'total',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      success: 'boolean',
      xrUserTicketList: { 'type': 'array', 'itemType': XrUserTicketPageInfo },
      current: 'number',
      pageSize: 'number',
      total: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetXrUserticketRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 所属业务
  bizScene: string;
  // 用户通行证编码
  xrTicketCode: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizScene: 'biz_scene',
      xrTicketCode: 'xr_ticket_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizScene: 'string',
      xrTicketCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetXrUserticketResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 是否成功
  success?: boolean;
  // 用户通行证详情
  xrUserTicket?: XrUserTicketDetail;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      success: 'success',
      xrUserTicket: 'xr_user_ticket',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      success: 'boolean',
      xrUserTicket: XrUserTicketDetail,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class OperateXrUserticketRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 所属业务
  bizScene: string;
  // 用户通行证编码
  xrTicketCode: string;
  // 用户id
  userId: string;
  // 实例id
  instanceId: string;
  // 核销动作
  // open_screen（设备开屏）
  xrVerificationOperate?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizScene: 'biz_scene',
      xrTicketCode: 'xr_ticket_code',
      userId: 'user_id',
      instanceId: 'instance_id',
      xrVerificationOperate: 'xr_verification_operate',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizScene: 'string',
      xrTicketCode: 'string',
      userId: 'string',
      instanceId: 'string',
      xrVerificationOperate: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class OperateXrUserticketResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 是否成功
  success?: boolean;
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
      success: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListXrResourceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 所属业务
  bizScene: string;
  // 核销资源类型
  xrVerificationType: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizScene: 'biz_scene',
      xrVerificationType: 'xr_verification_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizScene: 'string',
      xrVerificationType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListXrResourceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 是否成功
  success?: boolean;
  // 资源列表
  resourceList?: CodeListView[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      success: 'success',
      resourceList: 'resource_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      success: 'boolean',
      resourceList: { 'type': 'array', 'itemType': CodeListView },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequeryXrXrverificationmodelRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 唯一ID，对应线下场code
  resourceId?: string;
  // 唯一ID，对应线下场名称
  resourceName?: string;
  // 设备sn
  instanceName?: string;
  // 设备did
  instanceId?: string;
  // 当前页
  current: number;
  // 每页大小
  pageSize: number;
  // 业务类型
  bizScene: string;
  // 核销类型
  type?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      resourceId: 'resource_id',
      resourceName: 'resource_name',
      instanceName: 'instance_name',
      instanceId: 'instance_id',
      current: 'current',
      pageSize: 'page_size',
      bizScene: 'biz_scene',
      type: 'type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      resourceId: 'string',
      resourceName: 'string',
      instanceName: 'string',
      instanceId: 'string',
      current: 'number',
      pageSize: 'number',
      bizScene: 'string',
      type: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequeryXrXrverificationmodelResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 是否成功
  success?: boolean;
  // 核销实例列表
  xrVerificationModelList?: XrVerificationModelVo[];
  // 当前页
  current?: number;
  // 每页数据量
  pageSize?: number;
  // 数据总条数
  total?: number;
  // 总页数
  totalPage?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      success: 'success',
      xrVerificationModelList: 'xr_verification_model_list',
      current: 'current',
      pageSize: 'page_size',
      total: 'total',
      totalPage: 'total_page',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      success: 'boolean',
      xrVerificationModelList: { 'type': 'array', 'itemType': XrVerificationModelVo },
      current: 'number',
      pageSize: 'number',
      total: 'number',
      totalPage: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequeryXrCustomerdeviceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 设备sn
  deviceSn?: string;
  // 服务状态
  serviceStatus?: string;
  // 设备状态
  deviceStatus?: string;
  //  设备品类-型号-规格  
  deviceType?: string;
  // 当前页
  current: number;
  // 每页数据
  pageSize: number;
  // 业务类型
  bizScene: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      deviceSn: 'device_sn',
      serviceStatus: 'service_status',
      deviceStatus: 'device_status',
      deviceType: 'device_type',
      current: 'current',
      pageSize: 'page_size',
      bizScene: 'biz_scene',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      deviceSn: 'string',
      serviceStatus: 'string',
      deviceStatus: 'string',
      deviceType: 'string',
      current: 'number',
      pageSize: 'number',
      bizScene: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequeryXrCustomerdeviceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 是否成功
  success?: boolean;
  // 当前页
  current?: number;
  // 客户对应设备列表
  customerDeviceList?: CustomerDeviceItem[];
  // 每页数据
  pageSize?: number;
  // 数据总条数
  total?: number;
  // 总页数
  totalPage?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      success: 'success',
      current: 'current',
      customerDeviceList: 'customer_device_list',
      pageSize: 'page_size',
      total: 'total',
      totalPage: 'total_page',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      success: 'boolean',
      current: 'number',
      customerDeviceList: { 'type': 'array', 'itemType': CustomerDeviceItem },
      pageSize: 'number',
      total: 'number',
      totalPage: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateXrXrticketpoolRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 业务类型
  bizScene: string;
  // 资源id
  resourceId: string;
  // 有效期
  validTime: string;
  // 体验时长
  testTime: number;
  // vr设备集合
  xrApps?: string;
  // 券池数量，能发多少张券
  maxPoolCount: number;
  // 券池名称
  xrTicketPoolName: string;
  // 核销类型
  xrVerificationType: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizScene: 'biz_scene',
      resourceId: 'resource_id',
      validTime: 'valid_time',
      testTime: 'test_time',
      xrApps: 'xr_apps',
      maxPoolCount: 'max_pool_count',
      xrTicketPoolName: 'xr_ticket_pool_name',
      xrVerificationType: 'xr_verification_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizScene: 'string',
      resourceId: 'string',
      validTime: 'string',
      testTime: 'number',
      xrApps: 'string',
      maxPoolCount: 'number',
      xrTicketPoolName: 'string',
      xrVerificationType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateXrXrticketpoolResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 是否成功
  success?: boolean;
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
      success: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateXrXrticketpoolRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 券池名称
  xrTicketPoolName: string;
  // 资源id
  resourceId?: string;
  // 通行证有效期
  validTime?: string;
  // 体验时长
  testTime?: number;
  // vr设备集合
  xrApps?: string;
  // 券池剩余数量
  surplusCount?: number;
  // 核销类型，资源id改变时必须有值
  xrVerificationType?: string;
  // 业务类型
  bizScene: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      xrTicketPoolName: 'xr_ticket_pool_name',
      resourceId: 'resource_id',
      validTime: 'valid_time',
      testTime: 'test_time',
      xrApps: 'xr_apps',
      surplusCount: 'surplus_count',
      xrVerificationType: 'xr_verification_type',
      bizScene: 'biz_scene',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      xrTicketPoolName: 'string',
      resourceId: 'string',
      validTime: 'string',
      testTime: 'number',
      xrApps: 'string',
      surplusCount: 'number',
      xrVerificationType: 'string',
      bizScene: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateXrXrticketpoolResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 是否成功
  success?: boolean;
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
      success: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequeryXrXrticketpoolRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 业务类型
  bizScene: string;
  // 资源id
  resourceId?: string;
  // 券池名称
  xrTicketPoolName?: string;
  // 通行证状态，
  // EXPIRED：已过期
  // VALID：有效
  // SALED：已出售
  status?: string;
  // 当前页
  // 
  current: number;
  // 每页大小
  pageSize: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizScene: 'biz_scene',
      resourceId: 'resource_id',
      xrTicketPoolName: 'xr_ticket_pool_name',
      status: 'status',
      current: 'current',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizScene: 'string',
      resourceId: 'string',
      xrTicketPoolName: 'string',
      status: 'string',
      current: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequeryXrXrticketpoolResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 通行证列表
  xrTicketPoolList?: XrTicketPoolItem[];
  // 是否成功
  success?: boolean;
  // 当前页
  current?: number;
  // 每页数据条数
  pageSize?: number;
  // 总数量
  total?: number;
  // 总页数
  totalPage?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      xrTicketPoolList: 'xr_ticket_pool_list',
      success: 'success',
      current: 'current',
      pageSize: 'page_size',
      total: 'total',
      totalPage: 'total_page',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      xrTicketPoolList: { 'type': 'array', 'itemType': XrTicketPoolItem },
      success: 'boolean',
      current: 'number',
      pageSize: 'number',
      total: 'number',
      totalPage: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SyncDeviceScreenstatusRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 所属业务
  bizScene: string;
  // 设备did
  deviceDid: string;
  // 设备屏幕状态
  deviceScreenStatus: string;
  // 租户id
  tenantId: string;
  // 状态改变时间
  statusChangeTime: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizScene: 'biz_scene',
      deviceDid: 'device_did',
      deviceScreenStatus: 'device_screen_status',
      tenantId: 'tenant_id',
      statusChangeTime: 'status_change_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizScene: 'string',
      deviceDid: 'string',
      deviceScreenStatus: 'string',
      tenantId: 'string',
      statusChangeTime: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SyncDeviceScreenstatusResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 是否成功
  success?: boolean;
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
      success: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchcreateXrXrticketpoolRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // xr通行证批量创建请求列表
  xrTicketPoolReqs: XrTicketPoolBatchReq[];
  // 业务类型
  bizScene: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      xrTicketPoolReqs: 'xr_ticket_pool_reqs',
      bizScene: 'biz_scene',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      xrTicketPoolReqs: { 'type': 'array', 'itemType': XrTicketPoolBatchReq },
      bizScene: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchcreateXrXrticketpoolResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 是否成功
  success?: boolean;
  // xr通行证创建成功列表
  successList?: XrTicketPoolSuccessList[];
  // xr通行证创建失败列表
  failList?: XrTicketPoolFailList[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      success: 'success',
      successList: 'success_list',
      failList: 'fail_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      success: 'boolean',
      successList: { 'type': 'array', 'itemType': XrTicketPoolSuccessList },
      failList: { 'type': 'array', 'itemType': XrTicketPoolFailList },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListXrXrverificationmodelinstanceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 业务类型
  bizScene: string;
  // 资源id
  resourceId: string;
  // 核销类型
  xrVerificationType: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizScene: 'biz_scene',
      resourceId: 'resource_id',
      xrVerificationType: 'xr_verification_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizScene: 'string',
      resourceId: 'string',
      xrVerificationType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListXrXrverificationmodelinstanceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 是否成功
  success?: boolean;
  // 实例信息列表
  instanceInfoList?: InstanceInfo[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      success: 'success',
      instanceInfoList: 'instance_info_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      success: 'boolean',
      instanceInfoList: { 'type': 'array', 'itemType': InstanceInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DetailXrXrticketpoolRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 业务类型
  bizScene: string;
  // 券名称
  xrTicketPoolName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizScene: 'biz_scene',
      xrTicketPoolName: 'xr_ticket_pool_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizScene: 'string',
      xrTicketPoolName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DetailXrXrticketpoolResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 是否成功
  success?: boolean;
  // 通行证对象
  xrTicketPoolDetail?: XrTicketPoolItem;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      success: 'success',
      xrTicketPoolDetail: 'xr_ticket_pool_detail',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      success: 'boolean',
      xrTicketPoolDetail: XrTicketPoolItem,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class OperateAiotnextbsOpenapiRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 操作类型
  operateType: string;
  // 参数签名
  paramSign: string;
  // 业务操作类型
  bizType: string;
  // 操作人id
  operatorId: string;
  // 类名（实现类），首字母小写
  interfaceName: string;
  // 方法名
  methodName: string;
  // 参数类路径
  paramClass: string;
  // 参数数据
  paramList: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      operateType: 'operate_type',
      paramSign: 'param_sign',
      bizType: 'biz_type',
      operatorId: 'operator_id',
      interfaceName: 'interface_name',
      methodName: 'method_name',
      paramClass: 'param_class',
      paramList: 'param_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      operateType: 'string',
      paramSign: 'string',
      bizType: 'string',
      operatorId: 'string',
      interfaceName: 'string',
      methodName: 'string',
      paramClass: 'string',
      paramList: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class OperateAiotnextbsOpenapiResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 操作是否成功
  success?: boolean;
  // 结果数据
  result?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      success: 'success',
      result: 'result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      success: 'boolean',
      result: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class FinishTraceConfigRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 私有化端配置成功标志
  success: boolean;
  // 租户
  privatedTenant: string;
  // 私有化端唯一标识
  uniqueNum: string;
  // 任务信息，用于消费者回告
  taskInfo: TaskInfo;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      success: 'success',
      privatedTenant: 'privated_tenant',
      uniqueNum: 'unique_num',
      taskInfo: 'task_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      success: 'boolean',
      privatedTenant: 'string',
      uniqueNum: 'string',
      taskInfo: TaskInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class FinishTraceConfigResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 业务结果码
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

export class QueryBaiOcrRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 调用业务方身份标识，指明调用来源
  appKey: string;
  // OCR服务的业务类型，目前支持：
  // businessLicense，营业执照识别
  // idCard，身份证识别
  // bankCard，银行卡识别
  // VATInvoice，增值税发票识别
  ocrType: string;
  // 请求的资源类型，目前支持：
  // image，图片
  // pdf，PDF复印件
  sourceType: string;
  // 图片或PDF等内容的base64内容字符串
  sourceBase64: string;
  // 资源的附加属性
  // 如针对身份证识别，需要指定face(人像面)或back(国徽面)
  sourceConfigSide?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      appKey: 'app_key',
      ocrType: 'ocr_type',
      sourceType: 'source_type',
      sourceBase64: 'source_base64',
      sourceConfigSide: 'source_config_side',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      appKey: 'string',
      ocrType: 'string',
      sourceType: 'string',
      sourceBase64: 'string',
      sourceConfigSide: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBaiOcrResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回结果体，JSON字符串
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

export class QueryAiidentificationQrcodeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 用户身份标识
  appKey: string;
  // BaiQrcodeComparisonReqData转为JSONString后再getBytes
  fileObject?: Readable;
  fileObjectName?: string;
  fileId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      appKey: 'app_key',
      fileObject: 'fileObject',
      fileObjectName: 'fileObjectName',
      fileId: 'file_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      appKey: 'string',
      fileObject: 'Readable',
      fileObjectName: 'string',
      fileId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAiidentificationQrcodeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回结果
  data?: BaiQrcodeComparisonRespData;
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
      data: BaiQrcodeComparisonRespData,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAiidentificationGoodsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 用户身份标识
  appKey: string;
  // 鉴定商品信息
  goodsInfo: BaiGoodsComparisonReqData;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      appKey: 'app_key',
      goodsInfo: 'goods_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      appKey: 'string',
      goodsInfo: BaiGoodsComparisonReqData,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAiidentificationGoodsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回结果
  data?: BaiGoodsIdentificationRespData;
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
      data: BaiGoodsIdentificationRespData,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckAiidentificationGoodspointRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 用户调用标识
  appKey: string;
  // 品类
  category: string;
  // 品牌
  brand: string;
  // 款式
  style: string;
  // 鉴定点信息
  pointInfo: BaiGoodsPoint;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      appKey: 'app_key',
      category: 'category',
      brand: 'brand',
      style: 'style',
      pointInfo: 'point_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      appKey: 'string',
      category: 'string',
      brand: 'string',
      style: 'string',
      pointInfo: BaiGoodsPoint,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckAiidentificationGoodspointResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 商品鉴定点检测响应数据
  data?: BaiGoodsPointCheckRespData;
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
      data: BaiGoodsPointCheckRespData,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckAiidentificationQrcodeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 用户标识
  appKey: string;
  // 请求data
  data: BaiQrcodeComparisonReqData;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      appKey: 'app_key',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      appKey: 'string',
      data: BaiQrcodeComparisonReqData,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckAiidentificationQrcodeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回结果
  data?: BaiQrcodeComparisonRespData;
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
      data: BaiQrcodeComparisonRespData,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateAiidentificationQrcodeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 用户身份标识
  appKey: string;
  // 二维码生成请求的请求数据
  data: BaiQrcodeGenerateReqData;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      appKey: 'app_key',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      appKey: 'string',
      data: BaiQrcodeGenerateReqData,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateAiidentificationQrcodeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回结果
  data?: BaiQrcodeGenerateRespData;
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
      data: BaiQrcodeGenerateRespData,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class VerifyAiidentificationQrcodeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 用户身份标识
  appKey: string;
  // 溯源防伪码质检请求数据
  data: BaiQrcodeVerifyReqData;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      appKey: 'app_key',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      appKey: 'string',
      data: BaiQrcodeVerifyReqData,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class VerifyAiidentificationQrcodeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 溯源防伪码质检响应结果
  data?: BaiQrcodeVerifyRespData;
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
      data: BaiQrcodeVerifyRespData,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAiidentificationGoodspointRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 用户调用标识
  appKey: string;
  // 品类
  category: string;
  // 品牌
  brand: string;
  // 款式
  style: string;
  // 鉴定点信息
  pointInfo: BaiGoodsPoint;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      appKey: 'app_key',
      category: 'category',
      brand: 'brand',
      style: 'style',
      pointInfo: 'point_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      appKey: 'string',
      category: 'string',
      brand: 'string',
      style: 'string',
      pointInfo: BaiGoodsPoint,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAiidentificationGoodspointResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 商品鉴定点鉴定响应体
  data?: BaiGoodsPointQueryRespData;
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
      data: BaiGoodsPointQueryRespData,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RegisterAiidentificationGoodsdigitalfingerprintRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 用户身份标识
  appKey: string;
  // 商品数字指纹信息
  goodsInfo: GoodsDigitalFingerprintInfo;
  // 商品数字指纹用户信息
  userInfo: GoodsDigitalFingerprintUserInfo;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      appKey: 'app_key',
      goodsInfo: 'goods_info',
      userInfo: 'user_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      appKey: 'string',
      goodsInfo: GoodsDigitalFingerprintInfo,
      userInfo: GoodsDigitalFingerprintUserInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RegisterAiidentificationGoodsdigitalfingerprintResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 指纹图片入库是否成功
  data?: GoodsDigitalFingerprintRegisterResultData;
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
      data: GoodsDigitalFingerprintRegisterResultData,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckAiidentificationGoodsdigitalfingerprintRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 用户身份标识
  appKey: string;
  // 商品数字指纹鉴定信息
  goodsInfo: GoodsDigitalFingerprintInfo;
  // 商品数字指纹注册用户信息
  userInfo: GoodsDigitalFingerprintUserInfo;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      appKey: 'app_key',
      goodsInfo: 'goods_info',
      userInfo: 'user_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      appKey: 'string',
      goodsInfo: GoodsDigitalFingerprintInfo,
      userInfo: GoodsDigitalFingerprintUserInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckAiidentificationGoodsdigitalfingerprintResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 商品数字指纹整体鉴定结果
  data?: GoodsDigitalFingerprintIdentifyResultData;
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
      data: GoodsDigitalFingerprintIdentifyResultData,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetAiidentificationQrcodeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 请求id
  requestId?: string;
  // 二维码识别请求体
  data: BaiQrcodeParseReqData;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      requestId: 'request_id',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      requestId: 'string',
      data: BaiQrcodeParseReqData,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetAiidentificationQrcodeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 请求id
  requestId?: string;
  // 返回码
  code?: string;
  // 返回信息
  message?: string;
  // 二维码识别结果
  data?: BaiQrcodeParseRespData;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      requestId: 'request_id',
      code: 'code',
      message: 'message',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      requestId: 'string',
      code: 'string',
      message: 'string',
      data: BaiQrcodeParseRespData,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateAcsDeviceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 设备ID
  deviceId: string;
  // 场景码-对应acs iot管控后台项目code
  scene: string;
  // 设备类型编码-对应acs iot管控后台设备类型编码
  classCode: string;
  // 设备注册信息
  content: string;
  // 设备注册信息 签名
  signature: string;
  // 设备名称
  deviceName: string;
  // 设备单价 单位：分
  initialPrice?: number;
  // 设备出厂时间
  factoryTime?: string;
  // 设备投放时间
  releaseTime?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      deviceId: 'device_id',
      scene: 'scene',
      classCode: 'class_code',
      content: 'content',
      signature: 'signature',
      deviceName: 'device_name',
      initialPrice: 'initial_price',
      factoryTime: 'factory_time',
      releaseTime: 'release_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      deviceId: 'string',
      scene: 'string',
      classCode: 'string',
      content: 'string',
      signature: 'string',
      deviceName: 'string',
      initialPrice: 'number',
      factoryTime: 'string',
      releaseTime: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateAcsDeviceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 链上设备Id
  chainDeviceid?: string;
  // 发行设备ID
  distributeDeviceId?: string;
  // 设备激活文本-设备直连上链方式使用
  activeData?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      chainDeviceid: 'chain_deviceid',
      distributeDeviceId: 'distribute_device_id',
      activeData: 'active_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      chainDeviceid: 'string',
      distributeDeviceId: 'string',
      activeData: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SendAcsCollectorRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链上设备Id
  // 
  chainDeviceId: string;
  // 收集内容
  collectContentList: CollectContent[];
  // 随机数，防重放
  nonce: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      chainDeviceId: 'chain_device_id',
      collectContentList: 'collect_content_list',
      nonce: 'nonce',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      chainDeviceId: 'string',
      collectContentList: { 'type': 'array', 'itemType': CollectContent },
      nonce: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SendAcsCollectorResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 收集数据返回的上链结果
  resultList?: SendCollectorResult[];
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
      resultList: { 'type': 'array', 'itemType': SendCollectorResult },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryIotbasicDeviceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户ID
  tenantId: string;
  // 当前登录用户ID
  userId: string;
  // 设备SN
  deviceSn?: string;
  // 设备品类code
  categoryCode?: string;
  // 设备型号
  deviceModel?: string;
  // 厂商名称
  corpName?: string;
  // 安装位置
  location?: string;
  // 设备状态，在线/离线、故障
  deviceStatus?: string;
  // 指定显示返回结果中的第几页。
  // 
  currentPage: number;
  // 指定返回结果中每页显示的产品数量，最大值是200。
  // 
  // 
  pageSize: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      userId: 'user_id',
      deviceSn: 'device_sn',
      categoryCode: 'category_code',
      deviceModel: 'device_model',
      corpName: 'corp_name',
      location: 'location',
      deviceStatus: 'device_status',
      currentPage: 'current_page',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      userId: 'string',
      deviceSn: 'string',
      categoryCode: 'string',
      deviceModel: 'string',
      corpName: 'string',
      location: 'string',
      deviceStatus: 'string',
      currentPage: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryIotbasicDeviceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 当前页号。
  // 
  // 
  currentPage?: number;
  // 总页数
  pageCount?: number;
  // 每页显示条数
  pageSize?: number;
  // 总记录数
  total?: number;
  // 设备列表
  deviceList?: IotBasicDeviceQueryResponse[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      currentPage: 'current_page',
      pageCount: 'page_count',
      pageSize: 'page_size',
      total: 'total',
      deviceList: 'device_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      currentPage: 'number',
      pageCount: 'number',
      pageSize: 'number',
      total: 'number',
      deviceList: { 'type': 'array', 'itemType': IotBasicDeviceQueryResponse },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RecognizeIotbasicCustomerRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户ID
  tenantId: string;
  // 用户ID或操作员ID
  userId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      userId: 'user_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      userId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RecognizeIotbasicCustomerResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 是否授权开通IoT产品
  authorized?: boolean;
  // 设备数量列表
  deviceList?: DeviceOverViewResponse[];
  // 角色
  iotRole?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      authorized: 'authorized',
      deviceList: 'device_list',
      iotRole: 'iot_role',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      authorized: 'boolean',
      deviceList: { 'type': 'array', 'itemType': DeviceOverViewResponse },
      iotRole: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CertifyIotbasicDeviceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 设备序列号
  deviceSn: string;
  // 设备厂商
  corpName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      deviceSn: 'device_sn',
      corpName: 'corp_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      deviceSn: 'string',
      corpName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CertifyIotbasicDeviceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 设备名称
  deviceName?: string;
  // 设备型号
  deviceModel?: string;
  // 设备状态
  deviceStatus?: string;
  // 注册时间
  registerTime?: string;
  // 客户名称
  customerName?: string;
  // 客户对应租户ID
  tenantId?: string;
  // 客户端版本
  appVersion?: string;
  // 服务状态
  serviceStatus?: string;
  // 子账号ID
  accountId?: string;
  // 所属账号名称
  accountName?: string;
  // 子账号角色
  userRole?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      deviceName: 'device_name',
      deviceModel: 'device_model',
      deviceStatus: 'device_status',
      registerTime: 'register_time',
      customerName: 'customer_name',
      tenantId: 'tenant_id',
      appVersion: 'app_version',
      serviceStatus: 'service_status',
      accountId: 'account_id',
      accountName: 'account_name',
      userRole: 'user_role',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      deviceName: 'string',
      deviceModel: 'string',
      deviceStatus: 'string',
      registerTime: 'string',
      customerName: 'string',
      tenantId: 'string',
      appVersion: 'string',
      serviceStatus: 'string',
      accountId: 'string',
      accountName: 'string',
      userRole: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class OperateIotbasicUserRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 操作用户集合
  userList: IotBasicUserRequest[];
  // 要开通的角色
  iotRole?: string;
  // 操作类型
  action: string;
  // 操作人
  operatorId: string;
  // 参数签名校验
  paramSign?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      userList: 'user_list',
      iotRole: 'iot_role',
      action: 'action',
      operatorId: 'operator_id',
      paramSign: 'param_sign',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      userList: { 'type': 'array', 'itemType': IotBasicUserRequest },
      iotRole: 'string',
      action: 'string',
      operatorId: 'string',
      paramSign: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class OperateIotbasicUserResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 操作结果
  success?: boolean;
  // 操作失败集合
  failList?: IotBasicUserRequest[];
  // 用户信息
  queryList?: IotBasicUserInfo[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      success: 'success',
      failList: 'fail_list',
      queryList: 'query_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      success: 'boolean',
      failList: { 'type': 'array', 'itemType': IotBasicUserRequest },
      queryList: { 'type': 'array', 'itemType': IotBasicUserInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class OperateIotbasicPermissionRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 操作人
  // 
  operatorId: string;
  // 角色
  iotRole?: string;
  // 待添加的权限集合
  permissionList?: IotBasicPermissionData[];
  // 操作类型
  action: string;
  // 绑定权限集合
  bindPermision?: string[];
  // 参数签名校验
  paramSign?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      operatorId: 'operator_id',
      iotRole: 'iot_role',
      permissionList: 'permission_list',
      action: 'action',
      bindPermision: 'bind_permision',
      paramSign: 'param_sign',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      operatorId: 'string',
      iotRole: 'string',
      permissionList: { 'type': 'array', 'itemType': IotBasicPermissionData },
      action: 'string',
      bindPermision: { 'type': 'array', 'itemType': 'string' },
      paramSign: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class OperateIotbasicPermissionResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 操作结果
  success?: boolean;
  // 权限列表	
  roleList?: IotBasicRolePermission[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      success: 'success',
      roleList: 'role_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      success: 'boolean',
      roleList: { 'type': 'array', 'itemType': IotBasicRolePermission },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryIotbasicSnRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户ID
  tenantId: string;
  // 当前登录用户ID
  // 
  userId: string;
  // 指定显示返回结果中的第几页。
  // 
  currentPage: number;
  // 指定返回结果中每页显示的产品数量，最大值是300。
  // 
  pageSize: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      userId: 'user_id',
      currentPage: 'current_page',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      userId: 'string',
      currentPage: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryIotbasicSnResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 当前页号。
  // 
  currentPage?: number;
  // 总页数
  // 
  pageCount?: number;
  // 每页显示条数
  // 
  pageSize?: number;
  // 总记录数
  // 
  total?: number;
  // sn集合
  snList?: string[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      currentPage: 'current_page',
      pageCount: 'page_count',
      pageSize: 'page_size',
      total: 'total',
      snList: 'sn_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      currentPage: 'number',
      pageCount: 'number',
      pageSize: 'number',
      total: 'number',
      snList: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDeviceSpecsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 设备SN
  deviceSn: string;
  // 厂商编码
  corpName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      deviceSn: 'device_sn',
      corpName: 'corp_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      deviceSn: 'string',
      corpName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDeviceSpecsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 设备规格描述
  deviceSpecs?: IotBasicDeviceSpecs;
  // 硬件模块集合
  hardwareModuleList?: IotBasicDeviceHardWareModule[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      deviceSpecs: 'device_specs',
      hardwareModuleList: 'hardware_module_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      deviceSpecs: IotBasicDeviceSpecs,
      hardwareModuleList: { 'type': 'array', 'itemType': IotBasicDeviceHardWareModule },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class OperateIotbasicRelrationRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 设备属性关系id
  id?: number;
  // 设备品类名称
  deviceCategory: string;
  // 数据关系类型
  relationType: string;
  // 厂商名称
  corpName?: string;
  // TPS980	设备型号
  deviceModel?: string;
  // 设备规格
  deviceSpecs?: string;
  // 硬件模块
  hardwareModule?: string;
  // ADD,EDIT,DELETE，QUERY；选择操作
  operate: string;
  // 参数签名校验
  paramSign?: string;
  // 项目空间
  projectSpace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      id: 'id',
      deviceCategory: 'device_category',
      relationType: 'relation_type',
      corpName: 'corp_name',
      deviceModel: 'device_model',
      deviceSpecs: 'device_specs',
      hardwareModule: 'hardware_module',
      operate: 'operate',
      paramSign: 'param_sign',
      projectSpace: 'project_space',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      id: 'number',
      deviceCategory: 'string',
      relationType: 'string',
      corpName: 'string',
      deviceModel: 'string',
      deviceSpecs: 'string',
      hardwareModule: 'string',
      operate: 'string',
      paramSign: 'string',
      projectSpace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class OperateIotbasicRelrationResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 操作结果
  success?: boolean;
  // 设备属性关系数据
  iotDeviceAttributeRelationshipData?: IotDeviceAttributeRelationshipData;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      success: 'success',
      iotDeviceAttributeRelationshipData: 'iot_device_attribute_relationship_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      success: 'boolean',
      iotDeviceAttributeRelationshipData: IotDeviceAttributeRelationshipData,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class OperateIotbasicDictionaryRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // id
  id?: number;
  // 设备品类编码
  deviceCategory?: string;
  // 字典数据类型
  dictionaryType?: string;
  // 字典数据名称
  dictionaryName?: string;
  // 字典数据值
  dictionaryValue?: string;
  // 硬件模块参数
  dictionaryParam?: string;
  // 选择操作
  action: string;
  // 参数签名校验
  paramSign?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      id: 'id',
      deviceCategory: 'device_category',
      dictionaryType: 'dictionary_type',
      dictionaryName: 'dictionary_name',
      dictionaryValue: 'dictionary_value',
      dictionaryParam: 'dictionary_param',
      action: 'action',
      paramSign: 'param_sign',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      id: 'number',
      deviceCategory: 'string',
      dictionaryType: 'string',
      dictionaryName: 'string',
      dictionaryValue: 'string',
      dictionaryParam: 'string',
      action: 'string',
      paramSign: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class OperateIotbasicDictionaryResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 是否成功
  success?: boolean;
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
      success: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class OperateIotbasicCategoryRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 品类名称
  categoryName: string;
  // 行业
  industry: string;
  // 场景
  scene: string;
  // 品类类型：标准 | 自定义
  categoryType: string;
  // 描述内容
  remark?: string;
  // 操作类型
  action: string;
  // 操作人id
  operatorId: string;
  // 参数签名校验
  paramSign: string;
  // 品类code
  categoryCode?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      categoryName: 'category_name',
      industry: 'industry',
      scene: 'scene',
      categoryType: 'category_type',
      remark: 'remark',
      action: 'action',
      operatorId: 'operator_id',
      paramSign: 'param_sign',
      categoryCode: 'category_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      categoryName: 'string',
      industry: 'string',
      scene: 'string',
      categoryType: 'string',
      remark: 'string',
      action: 'string',
      operatorId: 'string',
      paramSign: 'string',
      categoryCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class OperateIotbasicCategoryResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 操作结果
  success?: boolean;
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
      success: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class OperateIotbasicControlconfigRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 设备品类编码
  categoryCode: string;
  // 厂商
  corpName: string;
  // 设备型号
  deviceModel?: string;
  // 管控模式
  controlModel: string;
  // 是否上链--注册设备后需上链存证，记录存证hash
  isRegisterNotify: string;
  // 是否标准设备-- 设备注册时 判断扩展属性 或展示时 显示扩展属性
  isStandard: string;
  // 是否生成密钥--注册设备时 生成密钥对， 存到 设备公钥(public_key)、deviceSecrect
  isGenSecret: string;
  // 接口地址
  serviceProvider?: string;
  // 接口参数
  controlParam?: string;
  // 操作类型
  action: string;
  // 操作人id
  operatorId: string;
  // 参数签名校验
  paramSign: string;
  // 是否接入安全认证
  isSupportSec: string;
  // 设备规格ID
  deviceSpecs?: number;
  // 厂商ID
  corpId: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      categoryCode: 'category_code',
      corpName: 'corp_name',
      deviceModel: 'device_model',
      controlModel: 'control_model',
      isRegisterNotify: 'is_register_notify',
      isStandard: 'is_standard',
      isGenSecret: 'is_gen_secret',
      serviceProvider: 'service_provider',
      controlParam: 'control_param',
      action: 'action',
      operatorId: 'operator_id',
      paramSign: 'param_sign',
      isSupportSec: 'is_support_sec',
      deviceSpecs: 'device_specs',
      corpId: 'corp_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      categoryCode: 'string',
      corpName: 'string',
      deviceModel: 'string',
      controlModel: 'string',
      isRegisterNotify: 'string',
      isStandard: 'string',
      isGenSecret: 'string',
      serviceProvider: 'string',
      controlParam: 'string',
      action: 'string',
      operatorId: 'string',
      paramSign: 'string',
      isSupportSec: 'string',
      deviceSpecs: 'number',
      corpId: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class OperateIotbasicControlconfigResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 是否成功
  success?: boolean;
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
      success: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class OperateIotbasicChainmodelRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 操作类型
  action: string;
  // 操作人id
  operatorId: string;
  // 参数签名校验
  paramSign: string;
  // 所属业务
  bizScene: string;
  // 资产数据类型
  dataScene: string;
  // 资产ID-key
  assetsIdKey: string;
  // 资产ID-类型
  assetsIdType: string;
  // 签名验证方式
  signatureCheckType: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      action: 'action',
      operatorId: 'operator_id',
      paramSign: 'param_sign',
      bizScene: 'biz_scene',
      dataScene: 'data_scene',
      assetsIdKey: 'assets_id_key',
      assetsIdType: 'assets_id_type',
      signatureCheckType: 'signature_check_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      action: 'string',
      operatorId: 'string',
      paramSign: 'string',
      bizScene: 'string',
      dataScene: 'string',
      assetsIdKey: 'string',
      assetsIdType: 'string',
      signatureCheckType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class OperateIotbasicChainmodelResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 是否成功
  success?: boolean;
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
      success: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class OperateIotbasicDeviceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 设备不可操作列表
  deviceDisableList: DeviceDisableData[];
  // 不允许操作类型
  // DISABLE_CHAGE：不允许变更租户
  // DISABLE_EDIT：不允许编辑设备
  // DISABLE_DEL：不允许删除设备
  disableOperateType: string;
  // 操作状态
  status: string;
  // 不允许操作提示，操作状态为true时必须有值
  message?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      deviceDisableList: 'device_disable_list',
      disableOperateType: 'disable_operate_type',
      status: 'status',
      message: 'message',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      deviceDisableList: { 'type': 'array', 'itemType': DeviceDisableData },
      disableOperateType: 'string',
      status: 'string',
      message: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class OperateIotbasicDeviceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 是否成功
  success?: boolean;
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
      success: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateIotbasicDeviceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 设备厂商名称
  corpName: string;
  // 设备品类编码
  deviceCategoryCode: string;
  // A1
  deviceModel: string;
  // xxx
  deviceName: string;
  // xe21d
  deviceSn: string;
  // standard
  deviceSpecs: string;
  // 安装位置
  location?: string;
  // 设备标签
  nickName?: string;
  // secid
  secId?: string;
  // 设备扩展信息
  deviceExt?: string;
  // 业务场景编码
  bizScene: string;
  // 所属租户ID
  tenantId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      corpName: 'corp_name',
      deviceCategoryCode: 'device_category_code',
      deviceModel: 'device_model',
      deviceName: 'device_name',
      deviceSn: 'device_sn',
      deviceSpecs: 'device_specs',
      location: 'location',
      nickName: 'nick_name',
      secId: 'sec_id',
      deviceExt: 'device_ext',
      bizScene: 'biz_scene',
      tenantId: 'tenant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      corpName: 'string',
      deviceCategoryCode: 'string',
      deviceModel: 'string',
      deviceName: 'string',
      deviceSn: 'string',
      deviceSpecs: 'string',
      location: 'string',
      nickName: 'string',
      secId: 'string',
      deviceExt: 'string',
      bizScene: 'string',
      tenantId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateIotbasicDeviceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // ddi
  deviceDid?: string;
  // 设备私钥
  privateKey?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      deviceDid: 'device_did',
      privateKey: 'private_key',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      deviceDid: 'string',
      privateKey: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchcreateIotbasicDeviceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 设备厂商
  corpName: string;
  // 设备品类编码
  deviceCategoryCode: string;
  // 业务场景码
  bizScene: string;
  // 所属租户ID
  tenantId?: string;
  // 注册设备集合
  deviceList: IotBasicDeviceRegisterInfo[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      corpName: 'corp_name',
      deviceCategoryCode: 'device_category_code',
      bizScene: 'biz_scene',
      tenantId: 'tenant_id',
      deviceList: 'device_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      corpName: 'string',
      deviceCategoryCode: 'string',
      bizScene: 'string',
      tenantId: 'string',
      deviceList: { 'type': 'array', 'itemType': IotBasicDeviceRegisterInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchcreateIotbasicDeviceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 注册成功集合
  successList?: IotBasicDeviceRegisterResult[];
  // 注册失败集合
  failList?: IotBasicDeviceRegisterFail[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      successList: 'success_list',
      failList: 'fail_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      successList: { 'type': 'array', 'itemType': IotBasicDeviceRegisterResult },
      failList: { 'type': 'array', 'itemType': IotBasicDeviceRegisterFail },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SyncIotbasicDevicestatusRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 设备did
  deviceDid: string;
  // 设备状态
  deviceStatus?: string;
  // 设备签名
  deviceSignature: string;
  // 业务状态
  bizStatusInfo?: BizStatusInfoOp;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      deviceDid: 'device_did',
      deviceStatus: 'device_status',
      deviceSignature: 'device_signature',
      bizStatusInfo: 'biz_status_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      deviceDid: 'string',
      deviceStatus: 'string',
      deviceSignature: 'string',
      bizStatusInfo: BizStatusInfoOp,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SyncIotbasicDevicestatusResponse extends $tea.Model {
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

export class VerifyIotbasicIdentifyRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 设备did
  deviceDid: string;
  // 设备认证参数
  verifyParam: string;
  // 设备签名，用设备pri_key 进行签名
  deviceSignature: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      deviceDid: 'device_did',
      verifyParam: 'verify_param',
      deviceSignature: 'device_signature',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      deviceDid: 'string',
      verifyParam: 'string',
      deviceSignature: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class VerifyIotbasicIdentifyResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 认证结果
  verifyResult?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      verifyResult: 'verify_result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      verifyResult: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateIotbasicDeviceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 设备did
  deviceDid: string;
  // 设备名称
  deviceName?: string;
  // 安装位置
  location?: string;
  // 设备扩展信息
  deviceExt?: string;
  // 设备标签
  nickName?: string;
  // 设备签名
  deviceSignature: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      deviceDid: 'device_did',
      deviceName: 'device_name',
      location: 'location',
      deviceExt: 'device_ext',
      nickName: 'nick_name',
      deviceSignature: 'device_signature',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      deviceDid: 'string',
      deviceName: 'string',
      location: 'string',
      deviceExt: 'string',
      nickName: 'string',
      deviceSignature: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateIotbasicDeviceResponse extends $tea.Model {
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

export class OperateIotbasicDevicecollectRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户id
  tenantId?: string;
  // 资产ID
  assetId?: string;
  // 数据资产类型
  dataScene: string;
  // 所属业务
  bizScene: string;
  // 资产数据内容，业务要上链的数据JSON格式
  assetData: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      assetId: 'asset_id',
      dataScene: 'data_scene',
      bizScene: 'biz_scene',
      assetData: 'asset_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      assetId: 'string',
      dataScene: 'string',
      bizScene: 'string',
      assetData: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class OperateIotbasicDevicecollectResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 是否成功
  success?: boolean;
  // 上链id
  antchainId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      success: 'success',
      antchainId: 'antchain_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      success: 'boolean',
      antchainId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class OperateIotbasicProjectspaceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 项目空间id
  id?: number;
  // 项目名称
  projectName?: string;
  // 项目编码（device_base表字段biz_scene）
  projectCode?: string;
  // 项目描述
  projectDesc?: string;
  // 项目负责人（PD）
  projectLeader?: string;
  // 上链ID（数据上到哪个业务链）
  upchainId?: string;
  // 上链方式（通过IOT可信平台，banRest）
  upchainType?: string;
  // 上链参数（账号，秘钥），json字符串格式
  upchainParams?: string;
  // 是否上链
  isUpchain?: boolean;
  // 操作类型
  action: string;
  // 操作人id
  operatorId: string;
  // 参数签名校验
  paramSign: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      id: 'id',
      projectName: 'project_name',
      projectCode: 'project_code',
      projectDesc: 'project_desc',
      projectLeader: 'project_leader',
      upchainId: 'upchain_id',
      upchainType: 'upchain_type',
      upchainParams: 'upchain_params',
      isUpchain: 'is_upchain',
      action: 'action',
      operatorId: 'operator_id',
      paramSign: 'param_sign',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      id: 'number',
      projectName: 'string',
      projectCode: 'string',
      projectDesc: 'string',
      projectLeader: 'string',
      upchainId: 'string',
      upchainType: 'string',
      upchainParams: 'string',
      isUpchain: 'boolean',
      action: 'string',
      operatorId: 'string',
      paramSign: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class OperateIotbasicProjectspaceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 是否成功
  success?: boolean;
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
      success: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PushRentMerchantRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 企业法人名称(个人可空)
  legalPersonName?: string;
  // 企业法人证件号(个人可空)
  legalPersionIdcard?: string;
  // 企业名称(个人名称)
  merchantName: string;
  // 企业社会信用代码(个人身份证)
  merchantCreditNo: string;
  // 支付宝监管户账号
  alipayAccount?: string;
  // 个人或企业
  // 个人：P
  // 企业：E
  merchantType: string;
  // 企业联系人
  contacts?: string;
  // 企业位置
  addr?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      legalPersonName: 'legal_person_name',
      legalPersionIdcard: 'legal_persion_idcard',
      merchantName: 'merchant_name',
      merchantCreditNo: 'merchant_credit_no',
      alipayAccount: 'alipay_account',
      merchantType: 'merchant_type',
      contacts: 'contacts',
      addr: 'addr',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      legalPersonName: 'string',
      legalPersionIdcard: 'string',
      merchantName: 'string',
      merchantCreditNo: 'string',
      alipayAccount: 'string',
      merchantType: 'string',
      contacts: 'string',
      addr: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PushRentMerchantResponse extends $tea.Model {
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

export class PushRentBillRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 业主房屋账单ID(
  leaseBillId: string;
  // 房源ID
  houseId: string;
  // 总账单开始日期
  billBeginDate: string;
  // 总账单结束日期
  billEndDate: string;
  // 总账单金额
  billMoney: string;
  // 提醒缴租日期范围(天数)
  remindRange: string;
  // 逾期未缴租警告日期范围(天数)
  warnRange: string;
  // 风险干预日期天数
  riskRange: string;
  // 账单租期集合
  billItemList: RentBillItem[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      leaseBillId: 'lease_bill_id',
      houseId: 'house_id',
      billBeginDate: 'bill_begin_date',
      billEndDate: 'bill_end_date',
      billMoney: 'bill_money',
      remindRange: 'remind_range',
      warnRange: 'warn_range',
      riskRange: 'risk_range',
      billItemList: 'bill_item_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      leaseBillId: 'string',
      houseId: 'string',
      billBeginDate: 'string',
      billEndDate: 'string',
      billMoney: 'string',
      remindRange: 'string',
      warnRange: 'string',
      riskRange: 'string',
      billItemList: { 'type': 'array', 'itemType': RentBillItem },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PushRentBillResponse extends $tea.Model {
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

export class PushRentRenterRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租客id
  renterId: string;
  // 租客名称
  renterName: string;
  // 租客联系电话
  renterPhone: string;
  // 租客身份证号
  renterIdCard?: string;
  // 房源唯一ID
  houseId: string;
  // 租赁合同信息
  rentContract: RentContractInfo;
  // 企业(业主)身份识别码
  merchantIdCard: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      renterId: 'renter_id',
      renterName: 'renter_name',
      renterPhone: 'renter_phone',
      renterIdCard: 'renter_id_card',
      houseId: 'house_id',
      rentContract: 'rent_contract',
      merchantIdCard: 'merchant_id_card',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      renterId: 'string',
      renterName: 'string',
      renterPhone: 'string',
      renterIdCard: 'string',
      houseId: 'string',
      rentContract: RentContractInfo,
      merchantIdCard: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PushRentRenterResponse extends $tea.Model {
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

export class SyncRentRentpaymentRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租金缴纳账单ID
  leaseBillId: string;
  // 租约分期ID
  billItemId: string;
  // 租约支付状态
  paymentState: string;
  // 支付操作日期，已支付或支付失败需要有值
  paymentDate?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      leaseBillId: 'lease_bill_id',
      billItemId: 'bill_item_id',
      paymentState: 'payment_state',
      paymentDate: 'payment_date',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      leaseBillId: 'string',
      billItemId: 'string',
      paymentState: 'string',
      paymentDate: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SyncRentRentpaymentResponse extends $tea.Model {
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

export class PushRentHouseRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 房源信息集合 数组
  houseList: HouseInfo[];
  // 企业(业主)身份识别码
  merchantIdCard: string;
  // 联系电话
  phone?: string;
  // 联系人
  contract?: string;
  // 对应会员用户id
  userId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      houseList: 'house_list',
      merchantIdCard: 'merchant_id_card',
      phone: 'phone',
      contract: 'contract',
      userId: 'user_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      houseList: { 'type': 'array', 'itemType': HouseInfo },
      merchantIdCard: 'string',
      phone: 'string',
      contract: 'string',
      userId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PushRentHouseResponse extends $tea.Model {
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

export class SyncIotbasicDevicegenerateRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 设备厂商名称
  corpName: string;
  // 设备sn
  deviceSn: string;
  // 公钥
  pubKey: string;
  // 所属业务
  bizScene: string;
  // 分组标签，标识密钥的分组
  tag: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      corpName: 'corp_name',
      deviceSn: 'device_sn',
      pubKey: 'pub_key',
      bizScene: 'biz_scene',
      tag: 'tag',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      corpName: 'string',
      deviceSn: 'string',
      pubKey: 'string',
      bizScene: 'string',
      tag: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SyncIotbasicDevicegenerateResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 设备私钥
  deviceKey?: string;
  // 设备认证id
  secId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      deviceKey: 'device_key',
      secId: 'sec_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      deviceKey: 'string',
      secId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class OperateIotbasicBatchcollectRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 所属业务
  bizScene: string;
  // 租户id
  tenantId?: string;
  // 上链数据列表
  collectInfoList: CollectInfo[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizScene: 'biz_scene',
      tenantId: 'tenant_id',
      collectInfoList: 'collect_info_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizScene: 'string',
      tenantId: 'string',
      collectInfoList: { 'type': 'array', 'itemType': CollectInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class OperateIotbasicBatchcollectResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 是否成功
  success?: boolean;
  // 上链成功列表
  successList?: DeviceCollectResult[];
  // 上链失败列表
  failList?: DeviceCollectFail[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      success: 'success',
      successList: 'success_list',
      failList: 'fail_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      success: 'boolean',
      successList: { 'type': 'array', 'itemType': DeviceCollectResult },
      failList: { 'type': 'array', 'itemType': DeviceCollectFail },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ImportIotbasicDeviceorderRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 所属业务
  bizScene: string;
  // 订单ID
  orderId: string;
  // 订单状态: 已支付
  orderStatus: string;
  // 订单采购设备清单
  orderDeviceList: IotBasicDeviceOrderItem[];
  // 商家ID，唯一编号
  merchantId?: string;
  // 订单总金额，精确到小数后两位
  totalAmount: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizScene: 'biz_scene',
      orderId: 'order_id',
      orderStatus: 'order_status',
      orderDeviceList: 'order_device_list',
      merchantId: 'merchant_id',
      totalAmount: 'total_amount',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizScene: 'string',
      orderId: 'string',
      orderStatus: 'string',
      orderDeviceList: { 'type': 'array', 'itemType': IotBasicDeviceOrderItem },
      merchantId: 'string',
      totalAmount: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ImportIotbasicDeviceorderResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 链上hash地址
  antchainId?: string;
  // 代表接口是否处理成功
  success?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      antchainId: 'antchain_id',
      success: 'success',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      antchainId: 'string',
      success: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ImportIotbasicDeviceorderbatchRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 业务类型
  bizScene: string;
  // 订单同步批量请求体
  orderBatchSyncReq: DeviceorderRequest[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizScene: 'biz_scene',
      orderBatchSyncReq: 'order_batch_sync_req',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizScene: 'string',
      orderBatchSyncReq: { 'type': 'array', 'itemType': DeviceorderRequest },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ImportIotbasicDeviceorderbatchResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 接口是否执行成功
  success?: boolean;
  // 订单上链成功的集合
  successList?: DeviceOrderResult[];
  // 订单上链失败的集合
  failList?: DeviceOrderFail[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      success: 'success',
      successList: 'success_list',
      failList: 'fail_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      success: 'boolean',
      successList: { 'type': 'array', 'itemType': DeviceOrderResult },
      failList: { 'type': 'array', 'itemType': DeviceOrderFail },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteIotbasicDeviceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 设备did
  deviceDid: string;
  // 设备所属用户
  userId?: string;
  // 设备did签名
  signature: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      deviceDid: 'device_did',
      userId: 'user_id',
      signature: 'signature',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      deviceDid: 'string',
      userId: 'string',
      signature: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteIotbasicDeviceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 是否成功
  success?: boolean;
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
      success: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class OperateIotbasicDevicecontrolRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 设备did 集合
  deviceDidList?: string;
  // 设备did 集合
  deviceOperateInfos?: DeviceOperateInfo[];
  // 设备操作类型
  deviceOperation: string;
  // 所属账号名称
  userId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      deviceDidList: 'device_did_list',
      deviceOperateInfos: 'device_operate_infos',
      deviceOperation: 'device_operation',
      userId: 'user_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      deviceDidList: 'string',
      deviceOperateInfos: { 'type': 'array', 'itemType': DeviceOperateInfo },
      deviceOperation: 'string',
      userId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class OperateIotbasicDevicecontrolResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 是否成功
  success?: boolean;
  // 操作成功的设备did列表
  successList?: string[];
  // 操作失败的设备did及失败信息列表
  failList?: DeviceControlFail[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      success: 'success',
      successList: 'success_list',
      failList: 'fail_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      success: 'boolean',
      successList: { 'type': 'array', 'itemType': 'string' },
      failList: { 'type': 'array', 'itemType': DeviceControlFail },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDeviceRegisterresultRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 设备SN，可以传deviceSn和corpName，或者deviceDid，都传的以deviceDid为准
  deviceSn?: string;
  // 设备厂商名称，可以传deviceSn和corpName，或者deviceDid，都传的以deviceDid为准
  corpName?: string;
  // 设备did，可以传deviceSn和corpName，或者deviceDid，都传的以deviceDid为准
  deviceDid?: string;
  // 租户id
  tenantId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      deviceSn: 'device_sn',
      corpName: 'corp_name',
      deviceDid: 'device_did',
      tenantId: 'tenant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      deviceSn: 'string',
      corpName: 'string',
      deviceDid: 'string',
      tenantId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDeviceRegisterresultResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 操作是否成功
  success?: boolean;
  // 设备did
  deviceDid?: string;
  // 设备秘钥
  privateKey?: string;
  // 设备sn
  deviceSn?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      success: 'success',
      deviceDid: 'device_did',
      privateKey: 'private_key',
      deviceSn: 'device_sn',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      success: 'boolean',
      deviceDid: 'string',
      privateKey: 'string',
      deviceSn: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDeviceStatusRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 设备did
  deviceDid: string;
  // 设备did签名
  signature: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      deviceDid: 'device_did',
      signature: 'signature',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      deviceDid: 'string',
      signature: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDeviceStatusResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 设备did
  deviceDid?: string;
  // 操作是否成功
  success?: boolean;
  // 设备状态
  deviceStatus?: string;
  // 设备认证状态
  authStatus?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      deviceDid: 'device_did',
      success: 'success',
      deviceStatus: 'device_status',
      authStatus: 'auth_status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      deviceDid: 'string',
      success: 'boolean',
      deviceStatus: 'string',
      authStatus: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class OperateIotbasicOpenapiRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 操作类型
  operateType: string;
  // 参数签名
  paramSign: string;
  // 业务操作类型
  bizType: string;
  // 操作人id
  operatorId: string;
  // 类名（实现类），首字母小写
  interfaceName: string;
  // 方法名
  methodName: string;
  // 参数类路径
  paramClass: string;
  // 参数数据
  paramList: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      operateType: 'operate_type',
      paramSign: 'param_sign',
      bizType: 'biz_type',
      operatorId: 'operator_id',
      interfaceName: 'interface_name',
      methodName: 'method_name',
      paramClass: 'param_class',
      paramList: 'param_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      operateType: 'string',
      paramSign: 'string',
      bizType: 'string',
      operatorId: 'string',
      interfaceName: 'string',
      methodName: 'string',
      paramClass: 'string',
      paramList: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class OperateIotbasicOpenapiResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 操作是否成功
  success?: boolean;
  // 结果数据
  result?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      success: 'success',
      result: 'result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      success: 'boolean',
      result: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryIotbasicDevicecollectRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 查询结束时间
  endTime?: string;
  // 资产类型
  dataScene: string;
  // 所属业务
  bizScene: string;
  // 租户id
  tenantId?: string;
  // 上链hash
  antchainId?: string;
  // 上链数据内容 json
  assetData?: string;
  // 每页数量
  pageSize: number;
  // 当前页码
  currentPage: number;
  // 业务id
  businessId?: string;
  // 查询开始时间
  startTime?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      endTime: 'end_time',
      dataScene: 'data_scene',
      bizScene: 'biz_scene',
      tenantId: 'tenant_id',
      antchainId: 'antchain_id',
      assetData: 'asset_data',
      pageSize: 'page_size',
      currentPage: 'current_page',
      businessId: 'business_id',
      startTime: 'start_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      endTime: 'string',
      dataScene: 'string',
      bizScene: 'string',
      tenantId: 'string',
      antchainId: 'string',
      assetData: 'string',
      pageSize: 'number',
      currentPage: 'number',
      businessId: 'string',
      startTime: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryIotbasicDevicecollectResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 当前页码
  current?: number;
  // 每页数据大小
  pageSize?: number;
  // 数据总条数
  total?: number;
  // 总页数
  totalPage?: number;
  // 查询结果
  data?: ChainModelResult[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      current: 'current',
      pageSize: 'page_size',
      total: 'total',
      totalPage: 'total_page',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      current: 'number',
      pageSize: 'number',
      total: 'number',
      totalPage: 'number',
      data: { 'type': 'array', 'itemType': ChainModelResult },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryIotbasicDeviceorderRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户id
  tenantId: string;
  // 开始时间
  startTime?: string;
  // 结束时间
  endTime?: string;
  // 所属业务
  bizScene: string;
  // 每页数据条数
  pageSize: number;
  // 当前页数
  currentPage: number;
  // 订单ID
  orderId?: string;
  // 设备did
  deviceDid?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      startTime: 'start_time',
      endTime: 'end_time',
      bizScene: 'biz_scene',
      pageSize: 'page_size',
      currentPage: 'current_page',
      orderId: 'order_id',
      deviceDid: 'device_did',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      startTime: 'string',
      endTime: 'string',
      bizScene: 'string',
      pageSize: 'number',
      currentPage: 'number',
      orderId: 'string',
      deviceDid: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryIotbasicDeviceorderResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 订单明细
  orderDetail?: IotBasicDeviceOrderItem[];
  // 总记录数
  total?: number;
  // 总页数
  totalPage?: number;
  // 当前页码
  current?: number;
  // 每页条数
  pageSize?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      orderDetail: 'order_detail',
      total: 'total',
      totalPage: 'total_page',
      current: 'current',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      orderDetail: { 'type': 'array', 'itemType': IotBasicDeviceOrderItem },
      total: 'number',
      totalPage: 'number',
      current: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PushIotbasicMeterdataRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户id
  tenantId: string;
  // 订单id
  orderId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      orderId: 'order_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      orderId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PushIotbasicMeterdataResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 是否成功
  success?: boolean;
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
      success: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SaveIotbasicCustomerRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户id
  tenantId: string;
  // 商品code
  productCode: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      productCode: 'product_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      productCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SaveIotbasicCustomerResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 成功标志
  success?: boolean;
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
      success: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class NotifyThirddeviceMessageRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 设备did
  deviceDid: string;
  // 设备信息同步命令
  command: string;
  // 设备签名，用设备pri_key 进行签名，只对deviceDid加签
  signature: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      deviceDid: 'device_did',
      command: 'command',
      signature: 'signature',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      deviceDid: 'string',
      command: 'string',
      signature: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class NotifyThirddeviceMessageResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 处理结果
  success?: boolean;
  // 设备信息同步命令
  command?: string;
  // 处理结果数据
  result?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      success: 'success',
      command: 'command',
      result: 'result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      success: 'boolean',
      command: 'string',
      result: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RegisterIotbasicCorpjoinRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 厂商value
  corpCode: string;
  // 厂商名称
  corpName: string;
  // 厂商签约产品码
  productCode: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      corpCode: 'corp_code',
      corpName: 'corp_name',
      productCode: 'product_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      corpCode: 'string',
      corpName: 'string',
      productCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RegisterIotbasicCorpjoinResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 是否成功
  success?: boolean;
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
      success: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTxtransactionDeviceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 设备did
  deviceDid: string;
  // 设备签名
  deviceSignature: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      deviceDid: 'device_did',
      deviceSignature: 'device_signature',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      deviceDid: 'string',
      deviceSignature: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTxtransactionDeviceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 请求结果
  success?: boolean;
  // 区块hash
  blockHash?: string;
  // 父区块hash
  parentBlockHash?: string;
  // 交易时间戳
  timestamp?: string;
  // 该交易所能消耗的最大gas
  gas?: number;
  // 交易发起方账户
  from?: string;
  // 交易接收方账户
  to?: string;
  // 交易类型
  txType?: string;
  // 交易返回的数据
  data?: QueryDeviceTransactionResultData;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      success: 'success',
      blockHash: 'block_hash',
      parentBlockHash: 'parent_block_hash',
      timestamp: 'timestamp',
      gas: 'gas',
      from: 'from',
      to: 'to',
      txType: 'tx_type',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      success: 'boolean',
      blockHash: 'string',
      parentBlockHash: 'string',
      timestamp: 'string',
      gas: 'number',
      from: 'string',
      to: 'string',
      txType: 'string',
      data: QueryDeviceTransactionResultData,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTxtransactionChaindataRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 上链hash值，和request_id必须有一个有值
  txHash?: string;
  // 上链请求消息id，和tx_hash必须有一个有值
  requestId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      txHash: 'tx_hash',
      requestId: 'request_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      txHash: 'string',
      requestId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTxtransactionChaindataResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 请求结果
  success?: boolean;
  // 区块hash
  blockHash?: string;
  // 父区块hash
  parentBlockHash?: string;
  // 交易时间戳
  timestamp?: string;
  // 该交易所能消耗的最大gas
  gas?: number;
  // 交易发起方账户
  from?: string;
  // 交易接收方账户
  to?: string;
  // 交易类型
  txType?: string;
  // 交易返回的数据
  data?: QueryChainDataTransactionResultData;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      success: 'success',
      blockHash: 'block_hash',
      parentBlockHash: 'parent_block_hash',
      timestamp: 'timestamp',
      gas: 'gas',
      from: 'from',
      to: 'to',
      txType: 'tx_type',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      success: 'boolean',
      blockHash: 'string',
      parentBlockHash: 'string',
      timestamp: 'string',
      gas: 'number',
      from: 'string',
      to: 'string',
      txType: 'string',
      data: QueryChainDataTransactionResultData,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class InitIotbasicDevicekeyRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 所属业务
  bizScene: string;
  // 设备厂商名称
  corpName: string;
  // 产品code
  productCode: string;
  // 设备品类
  deviceType?: string;
  // json字符串，包含设备sn等信息
  deviceInfo: string;
  // RSA公钥
  pubKey?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizScene: 'biz_scene',
      corpName: 'corp_name',
      productCode: 'product_code',
      deviceType: 'device_type',
      deviceInfo: 'device_info',
      pubKey: 'pub_key',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizScene: 'string',
      corpName: 'string',
      productCode: 'string',
      deviceType: 'string',
      deviceInfo: 'string',
      pubKey: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class InitIotbasicDevicekeyResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 设备私钥
  deviceKey?: string;
  // 操作结果
  success?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      deviceKey: 'device_key',
      success: 'success',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      deviceKey: 'string',
      success: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SetDevicePropertyRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 设备did
  deviceDid: string;
  // json格式属性信息，由标识符与属性值（key:value）构成，多个属性用英文逗号隔开。
  property: string;
  // 签名，用设备秘钥进行签名，只对deviceDid加签
  signature: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      deviceDid: 'device_did',
      property: 'property',
      signature: 'signature',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      deviceDid: 'string',
      property: 'string',
      signature: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SetDevicePropertyResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 处理结果
  success?: boolean;
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
      success: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SetDevicelistPropertyRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 设备did列表
  deviceDidList: string[];
  // json格式属性信息，由标识符与属性值（key:value）构成，多个属性用英文逗号隔开。
  property: string;
  // 签名，用预置秘钥进行签名，只对deviceDidList加签
  signature: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      deviceDidList: 'device_did_list',
      property: 'property',
      signature: 'signature',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      deviceDidList: { 'type': 'array', 'itemType': 'string' },
      property: 'string',
      signature: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SetDevicelistPropertyResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 处理结果
  success?: boolean;
  // 失败列表
  result?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      success: 'success',
      result: 'result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      success: 'boolean',
      result: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryIotbasicCategorylistRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 项目编码
  projectCode: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      projectCode: 'project_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      projectCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryIotbasicCategorylistResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 接口调用结果
  success?: boolean;
  // 品类信息列表
  data?: CategoryInfo[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      success: 'success',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      success: 'boolean',
      data: { 'type': 'array', 'itemType': CategoryInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryIotbasicProjectspacelistRequest extends $tea.Model {
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

export class QueryIotbasicProjectspacelistResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 接口调用结果
  success?: boolean;
  // 项目空间信息列表
  data?: ProjectSpaceInfo[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      success: 'success',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      success: 'boolean',
      data: { 'type': 'array', 'itemType': ProjectSpaceInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RegisterDevicecorpCustomerRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 项目code
  projectCode: string;
  // 企业名称
  companyName: string;
  // 企业品牌名称
  companyBrandName: string;
  // 主联系人
  contacts?: string;
  // 主联系方式
  contactNumber?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      projectCode: 'project_code',
      companyName: 'company_name',
      companyBrandName: 'company_brand_name',
      contacts: 'contacts',
      contactNumber: 'contact_number',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      projectCode: 'string',
      companyName: 'string',
      companyBrandName: 'string',
      contacts: 'string',
      contactNumber: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RegisterDevicecorpCustomerResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 接口调用结果
  success?: boolean;
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
      success: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetDevicecorpProductinfoRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 品类code
  categoryCode: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      categoryCode: 'category_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      categoryCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetDevicecorpProductinfoResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 接口调用结果
  success?: boolean;
  // 产品信息，json字符串
  // productName:产品名称
  // productCode:产品code
  // createTime:产品创建时间
  // productKey:产品key，用于设备的接入认证信息
  // deviceTotalCount:产品下的设备总数
  // mqttHost:设备的接入域名
  data?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      success: 'success',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      success: 'boolean',
      data: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddDevicecorpDeviceattributesRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 品类code
  categoryCode: string;
  // 型号名称
  modelName: string;
  // 型号值
  modelValue: string;
  // 规格列表，列表json字符串
  // 没值默认使用标准规格
  specs?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      categoryCode: 'category_code',
      modelName: 'model_name',
      modelValue: 'model_value',
      specs: 'specs',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      categoryCode: 'string',
      modelName: 'string',
      modelValue: 'string',
      specs: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddDevicecorpDeviceattributesResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 接口调用结果
  success?: boolean;
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
      success: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecDeviceThingserviceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 设备did
  deviceDid: string;
  // 签名
  signature: string;
  // 服务调用标识符
  serviceIdentifier: string;
  // 服务调用参数
  // key-value，json字符串
  serviceArgs?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      deviceDid: 'device_did',
      signature: 'signature',
      serviceIdentifier: 'service_identifier',
      serviceArgs: 'service_args',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      deviceDid: 'string',
      signature: 'string',
      serviceIdentifier: 'string',
      serviceArgs: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecDeviceThingserviceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 接口调用结果
  success?: boolean;
  // 云端向设备下发服务调用的消息ID
  messageId?: string;
  // 调用结果
  result?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      success: 'success',
      messageId: 'message_id',
      result: 'result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      success: 'boolean',
      messageId: 'string',
      result: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDeviceThingmodelRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 品类code
  categoryCode: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      categoryCode: 'category_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      categoryCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDeviceThingmodelResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 接口调用结果
  success?: boolean;
  // 物模型的功能定义
  data?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      success: 'success',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      success: 'boolean',
      data: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDeviceModeldataRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 设备did
  deviceDid: string;
  // 签名
  signature: string;
  // 数据类型
  // HOT_STORAGE：时序数据
  // ORIGINAL_PROPERTY：原始属性
  // ORIGINAL_EVENT：原始事件
  // ORIGINAL_SERVICE：原始服务
  dataType: string;
  // 返回结果中数据记录的排序方式，取值：
  // ● true：正序。
  // ● false：倒序。
  asc: boolean;
  // 要查询的数据记录的开始时间，必须小于结束时间EndTime。
  startTime: number;
  // 要查询的数据记录的结束时间，必须大于起始时间StartTime。
  endTime: number;
  // 标识符，不同的datatype意思不同
  // HOT_STORAGE：已存储时序数据中的字段标识符。
  // ORIGINAL_PROPERTY：属性标识符
  // ORIGINAL_EVENT：事件标识符
  // ORIGINAL_SERVICE：服务标识符
  identifier: string;
  // 单个字段标识符可返回的数据记录数量，最大值为100。
  // 任意一个字段返回的数据记录数量均不超过该值。
  pageSize: number;
  // 要查询数据所属自定义Topic。从user类目开始，输入自定义Topic的后续所有类目。
  // dataType为HOT_STORAGE时需要有值
  userTopic?: string;
  // 下一页标识。如果存在下一页，服务会返回此Token，下次请求带上即可。
  nextPageToken?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      deviceDid: 'device_did',
      signature: 'signature',
      dataType: 'data_type',
      asc: 'asc',
      startTime: 'start_time',
      endTime: 'end_time',
      identifier: 'identifier',
      pageSize: 'page_size',
      userTopic: 'user_topic',
      nextPageToken: 'next_page_token',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      deviceDid: 'string',
      signature: 'string',
      dataType: 'string',
      asc: 'boolean',
      startTime: 'number',
      endTime: 'number',
      identifier: 'string',
      pageSize: 'number',
      userTopic: 'string',
      nextPageToken: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDeviceModeldataResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 接口调用结果
  success?: boolean;
  // 下一页标识。
  nextPageToken?: string;
  // 具体查看data示例
  data?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      success: 'success',
      nextPageToken: 'next_page_token',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      success: 'boolean',
      nextPageToken: 'string',
      data: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateDevicecorpDeviceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 项目编码
  projectCode: string;
  // 品类code
  categoryCode: string;
  // 设备型号值
  deviceModel: string;
  // 设备规格值
  deviceSpecs: string;
  // 设备名称
  deviceName: string;
  // 设备sn
  deviceSn: string;
  // 设备标签
  nickName?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      projectCode: 'project_code',
      categoryCode: 'category_code',
      deviceModel: 'device_model',
      deviceSpecs: 'device_specs',
      deviceName: 'device_name',
      deviceSn: 'device_sn',
      nickName: 'nick_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      projectCode: 'string',
      categoryCode: 'string',
      deviceModel: 'string',
      deviceSpecs: 'string',
      deviceName: 'string',
      deviceSn: 'string',
      nickName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateDevicecorpDeviceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // did
  deviceDid?: string;
  // 设备私钥
  privateKey?: string;
  // 操作结果
  success?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      deviceDid: 'device_did',
      privateKey: 'private_key',
      success: 'success',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      deviceDid: 'string',
      privateKey: 'string',
      success: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchcreateDevicecorpDeviceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 项目编码
  projectCode: string;
  // 品类code
  categoryCode: string;
  // 注册设备集合
  deviceList: IotBasicDeviceRegisterInfo[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      projectCode: 'project_code',
      categoryCode: 'category_code',
      deviceList: 'device_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      projectCode: 'string',
      categoryCode: 'string',
      deviceList: { 'type': 'array', 'itemType': IotBasicDeviceRegisterInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchcreateDevicecorpDeviceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 操作结果
  success?: boolean;
  // 注册成功集合
  successList?: IotBasicDeviceRegisterResult[];
  // 注册失败集合
  failList?: IotBasicDeviceRegisterFail[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      success: 'success',
      successList: 'success_list',
      failList: 'fail_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      success: 'boolean',
      successList: { 'type': 'array', 'itemType': IotBasicDeviceRegisterResult },
      failList: { 'type': 'array', 'itemType': IotBasicDeviceRegisterFail },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDevicecorpCustomerregisterresultRequest extends $tea.Model {
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

export class QueryDevicecorpCustomerregisterresultResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 操作结果
  success?: boolean;
  // 结果
  data?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      success: 'success',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      success: 'boolean',
      data: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class OperateDevicecorpDevicecontrolRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 设备列表
  deviceInfos: DeviceOperateInfo[];
  // 设备管控操作；OPEN：设备开启；CLOSE：设备关闭；RESET：设备重置。
  deviceOperation: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      deviceInfos: 'device_infos',
      deviceOperation: 'device_operation',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      deviceInfos: { 'type': 'array', 'itemType': DeviceOperateInfo },
      deviceOperation: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class OperateDevicecorpDevicecontrolResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 操作结果
  success?: boolean;
  // 操作成功设备did列表
  successList?: string[];
  // 操作失败列表
  failList?: DeviceControlFail[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      success: 'success',
      successList: 'success_list',
      failList: 'fail_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      success: 'boolean',
      successList: { 'type': 'array', 'itemType': 'string' },
      failList: { 'type': 'array', 'itemType': DeviceControlFail },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateDevicecorpThingmodelRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 新增的功能定义详情
  thingModelJson: string;
  // 品类code
  categoryCode: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      thingModelJson: 'thing_model_json',
      categoryCode: 'category_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      thingModelJson: 'string',
      categoryCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateDevicecorpThingmodelResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 操作结果
  success?: boolean;
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
      success: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateDevicecorpThingmodelRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 功能原有的标识符
  identifier?: string;
  // 新的功能定义详情
  thingModelJson?: string;
  // 品类code
  categoryCode: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      identifier: 'identifier',
      thingModelJson: 'thing_model_json',
      categoryCode: 'category_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      identifier: 'string',
      thingModelJson: 'string',
      categoryCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateDevicecorpThingmodelResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 操作结果
  success?: boolean;
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
      success: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteDevicecorpThingmodelRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 需要删除的属性标识符列表
  propertyIdentifier?: string[];
  // 需要删除的服务标识符列表
  serviceIdentifier?: string[];
  // 需要删除的事件标识符列表
  eventIdentifier?: string[];
  // 品类code
  categoryCode: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      propertyIdentifier: 'property_identifier',
      serviceIdentifier: 'service_identifier',
      eventIdentifier: 'event_identifier',
      categoryCode: 'category_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      propertyIdentifier: { 'type': 'array', 'itemType': 'string' },
      serviceIdentifier: { 'type': 'array', 'itemType': 'string' },
      eventIdentifier: { 'type': 'array', 'itemType': 'string' },
      categoryCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteDevicecorpThingmodelResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 操作结果
  success?: boolean;
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
      success: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PublishDevicecorpThingmodelRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 品类code
  categoryCode: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      categoryCode: 'category_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      categoryCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PublishDevicecorpThingmodelResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 操作结果
  success?: boolean;
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
      success: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateDigitalkeyWithholdsignRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 个人签约产品码
  personalProductCode: string;
  // 销售产品码
  productCode: string;
  // 请按当前接入的方式进行填充，且输入值必须为文档中的参数取值范围。 扫码或者短信页面签约需要拼装http的请求地址访问中间页面，钱包h5页面签约可直接拼接scheme的请求地址
  channel: string;
  // 支付宝App主动回跳商户App里指定的页面 http/https 路径。建议商户使用 https。
  returnUrl: string;
  // 用户在商户网站的登录账号，用于在签约页面展示
  externalLogonId: string;
  // 支付宝用户ID
  alipayUserId?: string;
  // 商户签约号，代扣协议中标示用户的唯一签约号（确保在商户系统中唯一）。 格式规则：支持大写小写字母和数字，最长32位。 商户系统按需自定义传入，如果同一用户在同一产品码、同一签约场景下，签订了多份代扣协议，那么需要指定并传入该值
  signScene: string;
  // 商户签约号，代扣协议中标示用户的唯一签约号（确保在商户系统中唯一）。 格式规则：支持大写小写字母和数字，最长32位。 商户系统按需自定义传入，如果同一用户在同一产品码、同一签约场景下，签订了多份代扣协议，那么需要指定并传入该值
  externalAgreementNo: string;
  // 子商户信息
  subMerchant?: SubMerchantParams;
  // 当前用户签约请求的协议有效周期。 整形数字加上时间单位的协议有效期，从发起签约请求的时间开始算起。 目前支持的时间单位： 1. d：天 2. m：月 如果未传入，默认为长期有效。
  signValidityPeriod?: string;
  // 签约有效时间限制，单位是秒，有效范围是0-86400，商户传入此字段会用商户传入的值否则使用支付宝侧默认值，在有效时间外进行签约，会进行安全拦截；（备注：此字段适用于需要开通安全防控的商户，且依赖商户传入生成签约时的时间戳字段timestamp）
  effectTime?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      personalProductCode: 'personal_product_code',
      productCode: 'product_code',
      channel: 'channel',
      returnUrl: 'return_url',
      externalLogonId: 'external_logon_id',
      alipayUserId: 'alipay_user_id',
      signScene: 'sign_scene',
      externalAgreementNo: 'external_agreement_no',
      subMerchant: 'sub_merchant',
      signValidityPeriod: 'sign_validity_period',
      effectTime: 'effect_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      personalProductCode: 'string',
      productCode: 'string',
      channel: 'string',
      returnUrl: 'string',
      externalLogonId: 'string',
      alipayUserId: 'string',
      signScene: 'string',
      externalAgreementNo: 'string',
      subMerchant: SubMerchantParams,
      signValidityPeriod: 'string',
      effectTime: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateDigitalkeyWithholdsignResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 明细返回码
  subCode?: string;
  // 明细返回码描述
  subMsg?: string;
  // 生成的签约链接地址
  data?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      subCode: 'sub_code',
      subMsg: 'sub_msg',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      subCode: 'string',
      subMsg: 'string',
      data: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UnbindDigitalkeyWithholdsignRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 用户的支付宝账号对应的支付宝唯一用户号，以 2088 开头的 16 位纯数字组成。
  alipayUserId: string;
  // 协议产品码，商户和支付宝签约时确定，不同业务场景对应不同的签约产品码，解约时传入签约时的产品码，销售产品码，商户代扣场景固定为 GENERAL_WITHHOLDING_P。
  personalProductCode: string;
  // 签约协议场景，商户和支付宝签约时确定，解约时，传入签约指定的场景信息。
  signScene: string;
  // 代扣协议中标示用户的唯一签约号(确保在商户系统中唯一)，传入签约时传入的签约号。
  externalAgreementNo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      alipayUserId: 'alipay_user_id',
      personalProductCode: 'personal_product_code',
      signScene: 'sign_scene',
      externalAgreementNo: 'external_agreement_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      alipayUserId: 'string',
      personalProductCode: 'string',
      signScene: 'string',
      externalAgreementNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UnbindDigitalkeyWithholdsignResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 明细返回码
  subCode?: string;
  // 明细返回码描述
  subMsg?: string;
  // 返回内容
  data?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      subCode: 'sub_code',
      subMsg: 'sub_msg',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      subCode: 'string',
      subMsg: 'string',
      data: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PayDigitalkeyWithholdRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 商户订单号，需要保证不重复
  outTradeNo: string;
  // 订单标题
  subject: string;
  // 签约时支付宝返回的用户ID
  alipayUserId: string;
  // 销售产品码，商户代扣场景固定为GENERAL_WITHHOLDING
  productCode: string;
  // 订单总金额，单位为元，精确到小数点后两位，取值范围[0.01,100000000]
  totalAmount: number;
  // 商户代扣扣款许可
  deductPermission?: string;
  // 代扣协议号, 对应于签约时外部商户传入的协议号
  externalAgreementNo: string;
  // 该笔订单允许的最晚付款时间，逾期将关闭交易，超时关闭交易无法继续付款。取值范围：1m～15d。m-分钟，h-小时，d-天，1c-当天 该参数数值不接受小数点， 如：1.5 h，可转换为 90m。
  timeoutExpress?: string;
  // 异步支付类型
  asyncType: string;
  // 可打折金额。 参与优惠计算的金额，单位为元，精确到小数点后两位，取值范围[0.01,100000000]。 如果同时传入了【可打折金额】、【不可打折金额】和【订单总金额】，则必须满足如下条件：【订单总金额】=【可打折金额】+【不可打折金额】。 如果订单金额全部参与优惠计算，则【可打折金额】和【不可打折金额】都无需传入。
  discountableAmount?: number;
  // 二级商户信息
  subMerchant?: SubMerchantParams;
  // 订单附加信息。 如果请求时传递了该参数，将在异步通知、对账单中原样返回，同时会在商户和用户的pc账单详情中作为交易描述展示
  body?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      outTradeNo: 'out_trade_no',
      subject: 'subject',
      alipayUserId: 'alipay_user_id',
      productCode: 'product_code',
      totalAmount: 'total_amount',
      deductPermission: 'deduct_permission',
      externalAgreementNo: 'external_agreement_no',
      timeoutExpress: 'timeout_express',
      asyncType: 'async_type',
      discountableAmount: 'discountable_amount',
      subMerchant: 'sub_merchant',
      body: 'body',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      outTradeNo: 'string',
      subject: 'string',
      alipayUserId: 'string',
      productCode: 'string',
      totalAmount: 'number',
      deductPermission: 'string',
      externalAgreementNo: 'string',
      timeoutExpress: 'string',
      asyncType: 'string',
      discountableAmount: 'number',
      subMerchant: SubMerchantParams,
      body: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PayDigitalkeyWithholdResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 子返回码
  subCode?: string;
  // 子返回描述
  subMsg?: string;
  // 返回内容，json格式
  data?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      subCode: 'sub_code',
      subMsg: 'sub_msg',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      subCode: 'string',
      subMsg: 'string',
      data: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RefuseDigitalkeyWithholdpayRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单支付时传入的商户订单号,不能和 trade_no同时为空。
  outTradeNo: string;
  // 需要退款的金额，该金额不能大于订单金额,单位为元，支持两位小数
  refundAmount: number;
  // 标识一次退款请求，同一笔交易多次退款需要保证唯一。
  outRequestNo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      outTradeNo: 'out_trade_no',
      refundAmount: 'refund_amount',
      outRequestNo: 'out_request_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      outTradeNo: 'string',
      refundAmount: 'number',
      outRequestNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RefuseDigitalkeyWithholdpayResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 明细返回码
  subCode?: string;
  // 明细返回码描述
  subMsg?: string;
  // 退款返回信息 
  data?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      subCode: 'sub_code',
      subMsg: 'sub_msg',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      subCode: 'string',
      subMsg: 'string',
      data: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDigitalkeyWithholdsignRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 用户的支付宝账号对应的支付宝唯一用户号，以 2088 开头的 16 位纯数字组成。	
  // 
  alipayUserId: string;
  // 协议产品码，商户和支付宝签约时确定，不同业务场景对应不同的签约产品码，解约时传入签约时的产品码，销售产品码，商户代扣场景固定为 GENERAL_WITHHOLDING_P。
  personalProductCode: string;
  // 签约协议场景，商户和支付宝签约时确定，解约时，传入签约指定的场景信息。
  signScene: string;
  // 代扣协议中标示用户的唯一签约号(确保在商户系统中唯一)，传入签约时传入的签约号。
  externalAgreementNo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      alipayUserId: 'alipay_user_id',
      personalProductCode: 'personal_product_code',
      signScene: 'sign_scene',
      externalAgreementNo: 'external_agreement_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      alipayUserId: 'string',
      personalProductCode: 'string',
      signScene: 'string',
      externalAgreementNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDigitalkeyWithholdsignResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 明细返回码
  subCode?: string;
  // 明细返回码描述
  subMsg?: string;
  // 协议查询返回信息 
  data?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      subCode: 'sub_code',
      subMsg: 'sub_msg',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      subCode: 'string',
      subMsg: 'string',
      data: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CancelDigitalkeyWithholdpayRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 商户传入外部交易订单号
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

export class CancelDigitalkeyWithholdpayResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 子返回码
  subCode?: string;
  // 子返回码描述
  subMsg?: string;
  // 返回内容，json格式
  data?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      subCode: 'sub_code',
      subMsg: 'sub_msg',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      subCode: 'string',
      subMsg: 'string',
      data: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class NotifyDigitalkeyWithholdpreRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 商户请求号。 由商家自定义，64个字符以内，仅支持字母、数字、下划线且需保证在商户端不重复
  outRequestNo: string;
  // 订单总金额，单位为元，精确到小数点后两位，取值范围[0.01,100000000]
  totalAmount: number;
  // 代扣协议中标示用户的唯一签约号(确保在商户系统中唯一)，传入签约时传入的签约号。
  externalAgreementNo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      outRequestNo: 'out_request_no',
      totalAmount: 'total_amount',
      externalAgreementNo: 'external_agreement_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      outRequestNo: 'string',
      totalAmount: 'number',
      externalAgreementNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class NotifyDigitalkeyWithholdpreResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 子返回码
  subCode?: string;
  // 子返回码描述
  subMsg?: string;
  // 返回内容
  data?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      subCode: 'sub_code',
      subMsg: 'sub_msg',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      subCode: 'string',
      subMsg: 'string',
      data: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCategoryIndustryscenelistRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 品类类型
  // 标准品类：standard
  // 自定义品类：custom
  categoryType: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      categoryType: 'category_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      categoryType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCategoryIndustryscenelistResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 接口调用结果
  success?: boolean;
  // 行业场景列表
  data?: IotbasicCategoryIndustrySceneInfo[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      success: 'success',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      success: 'boolean',
      data: { 'type': 'array', 'itemType': IotbasicCategoryIndustrySceneInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateCategoryCustomRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 行业
  industry: string;
  // 场景
  scene: string;
  // 品类名称
  categoryName: string;
  // 品类标识符
  categoryCode: string;
  // 描述内容
  remark?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      industry: 'industry',
      scene: 'scene',
      categoryName: 'category_name',
      categoryCode: 'category_code',
      remark: 'remark',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      industry: 'string',
      scene: 'string',
      categoryName: 'string',
      categoryCode: 'string',
      remark: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateCategoryCustomResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 接口调用结果
  success?: boolean;
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
      success: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateDeviceModelRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 品类类型
  // 标准品类：standard
  // 自定义品类：custom
  categoryType: string;
  // 品类编码
  categoryCode: string;
  // 属性列表，与固定属性列表不能同时为空
  attributeInfoList?: IotbasicDeviceModelAttributeInfo[];
  // 固定属性列表，与属性列表不能同时为空
  fixedAttributeInfoList?: IotbasicDeviceModelFixedAttributeInfo[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      categoryType: 'category_type',
      categoryCode: 'category_code',
      attributeInfoList: 'attribute_info_list',
      fixedAttributeInfoList: 'fixed_attribute_info_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      categoryType: 'string',
      categoryCode: 'string',
      attributeInfoList: { 'type': 'array', 'itemType': IotbasicDeviceModelAttributeInfo },
      fixedAttributeInfoList: { 'type': 'array', 'itemType': IotbasicDeviceModelFixedAttributeInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateDeviceModelResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 接口调用结果
  success?: boolean;
  // 属性失败列表
  attributeFailList?: IotbasicDeviceModelAttributeFailInfo[];
  // 固定属性失败列表
  fixedAttributeFailList?: IotbasicDeviceModelFixedAttributeFailInfo[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      success: 'success',
      attributeFailList: 'attribute_fail_list',
      fixedAttributeFailList: 'fixed_attribute_fail_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      success: 'boolean',
      attributeFailList: { 'type': 'array', 'itemType': IotbasicDeviceModelAttributeFailInfo },
      fixedAttributeFailList: { 'type': 'array', 'itemType': IotbasicDeviceModelFixedAttributeFailInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateIotbasicProductRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 产品名称
  productName: string;
  // 品类类型
  // 标准品类：standard
  // 自定义品类：custom
  categoryType: string;
  // 品类编码
  categoryCode: string;
  // 连网方式
  // WIFI： Wi-Fi
  // CELLULAR：蜂窝网ETHERNET：以太网OTHER：其他
  netType: string;
  // 设备种类
  // 0：直连网络设备
  // 1：网关设备
  nodeType: number;
  // 安全SDK接入模式
  // NO_SEC：不进行安全认证
  // PRODUCTION_PRESET：产线预置
  // AIR_DISTRIBUTION：空中发行
  authType: string;
  // 产品描述
  // 长度不超过100个字符
  description?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      productName: 'product_name',
      categoryType: 'category_type',
      categoryCode: 'category_code',
      netType: 'net_type',
      nodeType: 'node_type',
      authType: 'auth_type',
      description: 'description',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      productName: 'string',
      categoryType: 'string',
      categoryCode: 'string',
      netType: 'string',
      nodeType: 'number',
      authType: 'string',
      description: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateIotbasicProductResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 接口调用结果
  success?: boolean;
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
      success: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDigitalkeyWithholdpayRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 20150320010101001
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

export class QueryDigitalkeyWithholdpayResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回内容
  data?: string;
  // 子返回码
  subCode?: string;
  // 子返回描述
  subMsg?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
      subCode: 'sub_code',
      subMsg: 'sub_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: 'string',
      subCode: 'string',
      subMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDigitalkeyTradepayRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单支付时传入的商户订单号
  outTradeNo: string;
  // 签约绑定的用户支付宝ID
  alipayUserId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      outTradeNo: 'out_trade_no',
      alipayUserId: 'alipay_user_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      outTradeNo: 'string',
      alipayUserId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDigitalkeyTradepayResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // test
  x?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      x: 'x',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      x: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetDigitalkeyDeviceinfoRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 设备DID，注册蚂蚁链返回的设备唯一ID
  deviceDid: string;
  // 使用deviceSecret对deviceDid进行加签
  signature: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      deviceDid: 'device_did',
      signature: 'signature',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      deviceDid: 'string',
      signature: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetDigitalkeyDeviceinfoResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 操作结果
  success?: boolean;
  // iotbasic数控设备信息
  data?: IotbasicDigitalKeyDeviceInfo;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      success: 'success',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      success: 'boolean',
      data: IotbasicDigitalKeyDeviceInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateIotlinkAppmanagerRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 应用文件
  fileObject?: Readable;
  fileObjectName?: string;
  fileId?: string;
  // 应用模块名称，由查询应用类型列表获取。默认使用default模块
  moduleName?: string;
  // OTA升级包名称，需在iot账号下唯一，创建后不可修改。支持中文、英文字母、日文、数字、短划线（-）、下划线（_）和半角圆括号（()），必须以中文、英文、日文或数字开头，长度限制为1~40个字符。
  apkName: string;
  // 品类code
  categoryCode: string;
  // 设备型号值
  deviceModelValue?: string;
  // 应用包描述
  // 最大字符为100
  remark?: string;
  // 当前OTA升级包的版本号，仅支持英文字母、数字、半角句号（.）、短划线（-）和下划线（_）。长度限制为1~64个字符。
  // 最新模块版本好可通过查询应用类型列表接口获取
  apkVersion: string;
  // 文件地址
  fileUrl?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      fileObject: 'fileObject',
      fileObjectName: 'fileObjectName',
      fileId: 'file_id',
      moduleName: 'module_name',
      apkName: 'apk_name',
      categoryCode: 'category_code',
      deviceModelValue: 'device_model_value',
      remark: 'remark',
      apkVersion: 'apk_version',
      fileUrl: 'file_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      fileObject: 'Readable',
      fileObjectName: 'string',
      fileId: 'string',
      moduleName: 'string',
      apkName: 'string',
      categoryCode: 'string',
      deviceModelValue: 'string',
      remark: 'string',
      apkVersion: 'string',
      fileUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateIotlinkAppmanagerResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 接口调用结果
  success?: boolean;
  // 文件id
  data?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      success: 'success',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      success: 'boolean',
      data: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListIotlinkOtamoduleRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 品类code
  categoryCode: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      categoryCode: 'category_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      categoryCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListIotlinkOtamoduleResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 操作结果
  success?: boolean;
  // 应用模块列表
  data?: IotbasicOtaModuleInfo[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      success: 'success',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      success: 'boolean',
      data: { 'type': 'array', 'itemType': IotbasicOtaModuleInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequeryIotlinkAppmanagerRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 应用名称
  apkName?: string;
  // 应用版本号
  apkVersion?: string;
  // 当前页
  // 默认第一页
  current: number;
  // 每页数量
  // 默认20条，最大100条
  pageSize: number;
  // 品类code
  categoryCode?: string;
  // 应用模块名称，由查询应用类型列表获取
  moduleName?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      apkName: 'apk_name',
      apkVersion: 'apk_version',
      current: 'current',
      pageSize: 'page_size',
      categoryCode: 'category_code',
      moduleName: 'module_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      apkName: 'string',
      apkVersion: 'string',
      current: 'number',
      pageSize: 'number',
      categoryCode: 'string',
      moduleName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequeryIotlinkAppmanagerResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 操作结果
  success?: boolean;
  // 当前页
  current?: number;
  // 每页数量
  pageSize?: number;
  // 总数量
  total?: number;
  // 列表数据
  data?: IotbasicAppManagerPageInfo[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      success: 'success',
      current: 'current',
      pageSize: 'page_size',
      total: 'total',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      success: 'boolean',
      current: 'number',
      pageSize: 'number',
      total: 'number',
      data: { 'type': 'array', 'itemType': IotbasicAppManagerPageInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetIotlinkAppmanagerfileurlRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 应用包id
  apkId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      apkId: 'apk_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      apkId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetIotlinkAppmanagerfileurlResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 操作结果
  success?: boolean;
  // 应用下载地址
  data?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      success: 'success',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      success: 'boolean',
      data: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequeryIotlinkAppreleaseorderRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 应用名称
  apkName?: string;
  // 应用版本号
  apkVersion?: string;
  // 工单id
  orderId?: string;
  // 发布批次状态
  // 升级中：IN_PROGRESS
  // 取消中：CANCELING
  // 部分成功：PARTIAL_SUCCESS
  // 部分失败：PARTIAL_FAILED
  // 部分取消：PARTIAL_CANCELED
  // 全部成功：ALL_SUCCESS
  // 全部失败：ALL_FAILED
  // 全部取消：ALL_CANCELED
  status?: string;
  // 当前页
  current: number;
  // 每页数量
  pageSize: number;
  // 品类code
  categoryCode?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      apkName: 'apk_name',
      apkVersion: 'apk_version',
      orderId: 'order_id',
      status: 'status',
      current: 'current',
      pageSize: 'page_size',
      categoryCode: 'category_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      apkName: 'string',
      apkVersion: 'string',
      orderId: 'string',
      status: 'string',
      current: 'number',
      pageSize: 'number',
      categoryCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequeryIotlinkAppreleaseorderResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 接口调用结果
  success?: boolean;
  // 当前页
  current?: number;
  // 每页数量
  pageSize?: number;
  // 总记录
  total?: number;
  // 分页查询结果列表
  data?: IotbasicReleaseOrderInfo[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      success: 'success',
      current: 'current',
      pageSize: 'page_size',
      total: 'total',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      success: 'boolean',
      current: 'number',
      pageSize: 'number',
      total: 'number',
      data: { 'type': 'array', 'itemType': IotbasicReleaseOrderInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequeryIotlinkAppreleasedeviceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 应用名称
  apkName?: string;
  // 应用版本号
  apkVersion?: string;
  // 工单id
  orderId?: string;
  // 设备sn
  deviceSn?: string;
  // 设备升级状态
  // 待确认：CONFIRM
  // 待推送：QUEUED
  // 已推送：NOTIFIED
  // 升级中：IN_PROGRESS
  // 升级成功：SUCCEEDED
  // 升级失败：FAILED
  // 已取消：CANCELED
  // 升级超时：TIMEOUT
  status?: string;
  // 当前页
  current: number;
  // 每页数量
  pageSize: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      apkName: 'apk_name',
      apkVersion: 'apk_version',
      orderId: 'order_id',
      deviceSn: 'device_sn',
      status: 'status',
      current: 'current',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      apkName: 'string',
      apkVersion: 'string',
      orderId: 'string',
      deviceSn: 'string',
      status: 'string',
      current: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequeryIotlinkAppreleasedeviceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 接口调用结果
  success?: boolean;
  // 当前页
  current?: number;
  // 每页数量
  pageSize?: number;
  // 总记录
  total?: number;
  // 结果列表数据
  data?: IotbasicReleaseDeviceInfo[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      success: 'success',
      current: 'current',
      pageSize: 'page_size',
      total: 'total',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      success: 'boolean',
      current: 'number',
      pageSize: 'number',
      total: 'number',
      data: { 'type': 'array', 'itemType': IotbasicReleaseDeviceInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PublishIotlinkAppreleaseorderRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 应用包id
  apkId: string;
  // 发布方式
  // DEVICE：指定设备发布
  // VERSION：指定版本发布
  releaseMode: string;
  // 指定发布方式的数据列表
  // 发布方式为DEVICE，字段为设备did列表；
  // 发布方式为VERSION，字段为应用包id列表；
  dataList: string[];
  // 对于数据列表中的设备存在升级中的任务是否覆盖安装？否：返回升级中的设备列表；是：取消升级中的设备升级任务，使用新的任务覆盖升级
  cover: boolean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      apkId: 'apk_id',
      releaseMode: 'release_mode',
      dataList: 'data_list',
      cover: 'cover',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      apkId: 'string',
      releaseMode: 'string',
      dataList: { 'type': 'array', 'itemType': 'string' },
      cover: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PublishIotlinkAppreleaseorderResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 接口调用结果
  success?: boolean;
  // 未完成的设备升级列表
  unfinishedList?: IotbasicReleaseDeviceInfo[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      success: 'success',
      unfinishedList: 'unfinished_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      success: 'boolean',
      unfinishedList: { 'type': 'array', 'itemType': IotbasicReleaseDeviceInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CancelIotlinkAppreleaseorderRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 工单id
  orderId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderId: 'order_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CancelIotlinkAppreleaseorderResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 接口调用结果
  success?: boolean;
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
      success: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CancelIotlinkAppreleasedeviceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 设备升级任务唯一id列表
  orderDetailIdList: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderDetailIdList: 'order_detail_id_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderDetailIdList: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CancelIotlinkAppreleasedeviceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 接口调用结果
  success?: boolean;
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
      success: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RetryIotlinkAppreleasedeviceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 设备升级任务唯一id列表
  orderDetailIdList: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderDetailIdList: 'order_detail_id_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderDetailIdList: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RetryIotlinkAppreleasedeviceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 接口调用结果
  success?: boolean;
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
      success: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateIotlinkOtamoduleRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 品类code
  categoryCode: string;
  // OTA模块名称，产品下唯一且不可修改。仅支持英文字母、数字、英文句号（.）、短划线（-）和下划线（_）。长度限制为1~64个字符。
  // 英文字母不区分大小写，例如“scanner”和“Scanner”被认为是相同的模块名称，不可重复使用
  moduleName: string;
  // OTA模块别名。支持中文、英文字母、数字、英文句号（.）、短划线（-）和下划线（_），长度限制为1~64个字符。
  aliasName?: string;
  // OTA模块的描述信息，支持最多100个字符。
  desc?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      categoryCode: 'category_code',
      moduleName: 'module_name',
      aliasName: 'alias_name',
      desc: 'desc',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      categoryCode: 'string',
      moduleName: 'string',
      aliasName: 'string',
      desc: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateIotlinkOtamoduleResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 操作结果
  success?: boolean;
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
      success: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateIotlinkOtamoduleRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 品类code
  categoryCode: string;
  // OTA模块名称，产品下唯一且不可修改。仅支持英文字母、数字、英文句号（.）、短划线（-）和下划线（_）。长度限制为1~64个字符。 英文字母不区分大小写，例如“scanner”和“Scanner”被认为是相同的模块名称，不可重复使用
  moduleName: string;
  // OTA模块别名。支持中文、英文字母、数字、英文句号（.）、短划线（-）和下划线（_），长度限制为1~64个字符。
  aliasName?: string;
  // OTA模块的描述信息，支持最多100个字符。
  desc?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      categoryCode: 'category_code',
      moduleName: 'module_name',
      aliasName: 'alias_name',
      desc: 'desc',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      categoryCode: 'string',
      moduleName: 'string',
      aliasName: 'string',
      desc: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateIotlinkOtamoduleResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 操作结果
  success?: boolean;
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
      success: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteIotlinkOtamoduleRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 品类code
  categoryCode: string;
  // 要删除的OTA模块名称。
  moduleName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      categoryCode: 'category_code',
      moduleName: 'module_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      categoryCode: 'string',
      moduleName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteIotlinkOtamoduleResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 操作结果
  success?: boolean;
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
      success: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ImportIotlinkThingmodeltslRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 品类code
  categoryCode: string;
  // 您编辑的物模型（TSL）。JSON格式的字符串。产品的物模型（TSL）包含属性、服务和事件的定义。
  tslStr: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      categoryCode: 'category_code',
      tslStr: 'tsl_str',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      categoryCode: 'string',
      tslStr: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ImportIotlinkThingmodeltslResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 操作结果
  success?: boolean;
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
      success: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryIotplatformPurchaseorderRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户id
  tenantId: string;
  // 设备串号
  serialNumber: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      serialNumber: 'serial_number',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      serialNumber: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryIotplatformPurchaseorderResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 是否为链上采购商品，true：是，false：否
  goodsFromChain?: boolean;
  // 采购时间
  purchaseTime?: string;
  // 采购商名称
  leaseName?: string;
  // 采购价
  purchaseOrderPrice?: string;
  // 商品名称
  goodsName?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      goodsFromChain: 'goods_from_chain',
      purchaseTime: 'purchase_time',
      leaseName: 'lease_name',
      purchaseOrderPrice: 'purchase_order_price',
      goodsName: 'goods_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      goodsFromChain: 'boolean',
      purchaseTime: 'string',
      leaseName: 'string',
      purchaseOrderPrice: 'string',
      goodsName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ImportIotplatformMeshidRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 客户的金融云租户ID
  tenantId: string;
  // 客户的公司名称
  companyName: string;
  // 设备按照MeshAgent后获取的MeshId
  meshId: string;
  // 客户自定义的业务上使用的设备标识，需要与租赁业务上使用的ID进行对应
  deviceSn: string;
  // 设备类型字段
  type?: string;
  // 代理商名称，用于二级代理模式
  agentName?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      companyName: 'company_name',
      meshId: 'mesh_id',
      deviceSn: 'device_sn',
      type: 'type',
      agentName: 'agent_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      companyName: 'string',
      meshId: 'string',
      deviceSn: 'string',
      type: 'string',
      agentName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ImportIotplatformMeshidResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 提交绑定时的SN号，用于确认
  deviceSn?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      deviceSn: 'device_sn',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      deviceSn: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ImportPurchaseorderThirdpartyRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租赁订单号
  orderNumber: string;
  // 收货人姓名
  consigneeName: string;
  // 收货人身份证号
  consigneeIdNumber: string;
  // 收货人手机号
  consigneePhone: string;
  // 收货人地址
  consigneeAddress: string;
  // 供货商名称
  supplierName: string;
  // 供货商租户id
  supplierId: string;
  // 采购商租户id
  leaseId: string;
  // 商品信息列表
  goodsList: GoodsIdAndCount[];
  // 幂等号
  idempotId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderNumber: 'order_number',
      consigneeName: 'consignee_name',
      consigneeIdNumber: 'consignee_id_number',
      consigneePhone: 'consignee_phone',
      consigneeAddress: 'consignee_address',
      supplierName: 'supplier_name',
      supplierId: 'supplier_id',
      leaseId: 'lease_id',
      goodsList: 'goods_list',
      idempotId: 'idempot_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderNumber: 'string',
      consigneeName: 'string',
      consigneeIdNumber: 'string',
      consigneePhone: 'string',
      consigneeAddress: 'string',
      supplierName: 'string',
      supplierId: 'string',
      leaseId: 'string',
      goodsList: { 'type': 'array', 'itemType': GoodsIdAndCount },
      idempotId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ImportPurchaseorderThirdpartyResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 采购平台-采购详情id
  purchaseOrderId?: string;
  // 当前状态
  // READY_DELIVER(0, "待发货"),
  // DELIVERED(1, "已发货"),
  // REFUSED(2, "已拒发"),
  // CANCELED(4, "已取消"),
  // REFUNDED(5, "已退货");
  // 
  status?: string;
  // InsertPurchaseOrderFailInfo
  failMap?: InsertPurchaseOrderFailInfo;
  // 真实订单信息，成功不返回
  // 
  purchaseOrderInfoDetail?: PurchaseOrderInfoDetail;
  // 幂等号
  idempotId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      purchaseOrderId: 'purchase_order_id',
      status: 'status',
      failMap: 'fail_map',
      purchaseOrderInfoDetail: 'purchase_order_info_detail',
      idempotId: 'idempot_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      purchaseOrderId: 'string',
      status: 'string',
      failMap: InsertPurchaseOrderFailInfo,
      purchaseOrderInfoDetail: PurchaseOrderInfoDetail,
      idempotId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddUserRoleRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 账号标识，蚂蚁金融科技租户ID
  tenantId: string;
  // 租户名称
  tenantName: string;
  // 权限标识
  //     LEASER(0),
  //     BUYERS(1),
  //     OWNER(2),
  //     ADMIN(9);
  role: string;
  // 是否支持abm远程
  supportAbm: boolean;
  // 是否含税
  includTax: boolean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      tenantName: 'tenant_name',
      role: 'role',
      supportAbm: 'support_abm',
      includTax: 'includ_tax',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      tenantName: 'string',
      role: 'string',
      supportAbm: 'boolean',
      includTax: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddUserRoleResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 新增的用户id
  userId?: number;
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
      userId: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddGoodsSkuRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // GoodsTypeEnum,商品一级类目
  type: string;
  // 商品二级类目
  secondType: string;
  // 商品品牌
  brand: string;
  // 商品名称，型号
  model: string;
  // 市场价
  marketPrice: number;
  // 手机型号信息
  phoneInfo?: PhoneInfo;
  // 电脑型号信息
  computerInfo?: ComputerInfo;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      type: 'type',
      secondType: 'second_type',
      brand: 'brand',
      model: 'model',
      marketPrice: 'market_price',
      phoneInfo: 'phone_info',
      computerInfo: 'computer_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      type: 'string',
      secondType: 'string',
      brand: 'string',
      model: 'string',
      marketPrice: 'number',
      phoneInfo: PhoneInfo,
      computerInfo: ComputerInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddGoodsSkuResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // SKU id
  skuId?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      skuId: 'sku_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      skuId: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PushMeterdataOrderRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户id
  tenantId: string;
  // 订单计费数据列表
  orderPushList: OrderPushInfo[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      orderPushList: 'order_push_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      orderPushList: { 'type': 'array', 'itemType': OrderPushInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PushMeterdataOrderResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 操作是否成功
  success?: boolean;
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
      success: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class OpenIotplantformProductRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 8位租户ID
  bizTenant: string;
  // 商品码
  productCode: string;
  // 实例ID
  instanceId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizTenant: 'biz_tenant',
      productCode: 'product_code',
      instanceId: 'instance_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizTenant: 'string',
      productCode: 'string',
      instanceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class OpenIotplantformProductResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 商品计量表主键ID
  meterDataId?: number;
  // 商品实例是否处于可用状态
  status?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      meterDataId: 'meter_data_id',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      meterDataId: 'number',
      status: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class StopIotplantformProductRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 8位租户ID
  bizTenant: string;
  // 商品码
  productCode: string;
  // 实例ID
  instanceId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizTenant: 'biz_tenant',
      productCode: 'product_code',
      instanceId: 'instance_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizTenant: 'string',
      productCode: 'string',
      instanceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class StopIotplantformProductResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 商品计量表主键ID
  // 
  meterDataId?: number;
  // 商品实例是否处于可用状态，1可用，0不可用
  status?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      meterDataId: 'meter_data_id',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      meterDataId: 'number',
      status: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ResumeIotplantformProductRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 8位租户ID	
  // 
  bizTenant: string;
  // 商品码	
  // 
  productCode: string;
  // 实例ID	
  // 
  instanceId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizTenant: 'biz_tenant',
      productCode: 'product_code',
      instanceId: 'instance_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizTenant: 'string',
      productCode: 'string',
      instanceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ResumeIotplantformProductResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 商品计量表主键ID
  meterDataId?: number;
  // 商品实例是否处于可用状态，1可用，0不可用
  status?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      meterDataId: 'meter_data_id',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      meterDataId: 'number',
      status: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateDeviceDatamodelRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 数据模型
  dataModel: string;
  // 数据模型名称
  dataModelName?: string;
  // 数据模型类别
  bizType?: string;
  // 用户自定义版本
  customerVersion?: string;
  // 数据样例
  dataDemo?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      dataModel: 'data_model',
      dataModelName: 'data_model_name',
      bizType: 'biz_type',
      customerVersion: 'customer_version',
      dataDemo: 'data_demo',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      dataModel: 'string',
      dataModelName: 'string',
      bizType: 'string',
      customerVersion: 'string',
      dataDemo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateDeviceDatamodelResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 数据模型id
  deviceDataModelId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      deviceDataModelId: 'device_data_model_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      deviceDataModelId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetDeviceDatamodelRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 数据模型Id
  dataModelId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      dataModelId: 'data_model_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      dataModelId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetDeviceDatamodelResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 数据模型
  dataModel?: DataModel;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      dataModel: 'data_model',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      dataModel: DataModel,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ImportDeviceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 设备Id
  deviceId: string;
  // 数据模型id
  deviceDataModelId?: string;
  // 场景码
  scene: string;
  // 设备imei
  deviceImei: string;
  // 设备名称
  deviceName?: string;
  // 厂商名称
  corpName?: string;
  // 枚举值： SIGNED_DATA 、RAW_DATA ，默认填写 SIGNED_DATA（需要验签的设备）
  deviceFeature: string;
  // 设备类型编码，必填，对应资管平台中的设备类型 
  // 
  // 枚举值：
  // 
  // 车辆 1000 
  // 车辆 四轮车 1001 
  // 车辆 四轮车 纯电四轮车 1002 
  // 车辆 四轮车 混动四轮车 1003 
  // 车辆 四轮车 燃油四轮车 1004 
  // 车辆 两轮车 1011 
  // 车辆 两轮车 两轮单车 1012 
  // 车辆 两轮车 两轮助力车 1013 
  // 
  // 换电柜 2000 
  // 换电柜 二轮车换电柜 2001 
  // 
  // 电池 3000 
  // 电池 磷酸铁电池 3001 
  // 电池 三元锂电池 3002 
  // 
  // 回收设备 4000 
  // 
  // 垃圾分类回收 4001 
  // 
  // 洗车机 5000
  // 通用计算设备	                6000
  // 	移动设备		        6001
  // 		智能手机	        6002
  // 		工业掌机	        6003
  // 		平板电脑	        6004
  // 	云设备		        6011
  // 		云计算服务器	6012
  deviceTypeCode: number;
  // 设备单价 单位：分
  initialPrice: number;
  // 出厂时间
  factoryTime: string;
  // 投放时间
  releaseTime: string;
  // 设备类型，需要提前约定好
  deviceTypeId?: string;
  // 可信根派生公钥
  devicePublicKey?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      deviceId: 'device_id',
      deviceDataModelId: 'device_data_model_id',
      scene: 'scene',
      deviceImei: 'device_imei',
      deviceName: 'device_name',
      corpName: 'corp_name',
      deviceFeature: 'device_feature',
      deviceTypeCode: 'device_type_code',
      initialPrice: 'initial_price',
      factoryTime: 'factory_time',
      releaseTime: 'release_time',
      deviceTypeId: 'device_type_id',
      devicePublicKey: 'device_public_key',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      deviceId: 'string',
      deviceDataModelId: 'string',
      scene: 'string',
      deviceImei: 'string',
      deviceName: 'string',
      corpName: 'string',
      deviceFeature: 'string',
      deviceTypeCode: 'number',
      initialPrice: 'number',
      factoryTime: 'string',
      releaseTime: 'string',
      deviceTypeId: 'string',
      devicePublicKey: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ImportDeviceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 链上设备Id
  chainDeviceId?: string;
  // 可信设备ID
  trustiotDeviceId?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      chainDeviceId: 'chain_device_id',
      trustiotDeviceId: 'trustiot_device_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      chainDeviceId: 'string',
      trustiotDeviceId: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetDeviceBychainidRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链上设备Id
  chainDeviceId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      chainDeviceId: 'chain_device_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      chainDeviceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetDeviceBychainidResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 设备详情
  device?: Device;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      device: 'device',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      device: Device,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetDeviceBydeviceidRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 设备id集合
  deviceIdList: string[];
  // 场景码
  scene: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      deviceIdList: 'device_id_list',
      scene: 'scene',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      deviceIdList: { 'type': 'array', 'itemType': 'string' },
      scene: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetDeviceBydeviceidResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 设备详情
  deviceList?: Device[];
  // 设备信息不存在的deviceid集合
  missDeviceIdList?: string[];
  // 成功获取到设备信息的deviceid集合
  successDeviceIdList?: string[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      deviceList: 'device_list',
      missDeviceIdList: 'miss_device_id_list',
      successDeviceIdList: 'success_device_id_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      deviceList: { 'type': 'array', 'itemType': Device },
      missDeviceIdList: { 'type': 'array', 'itemType': 'string' },
      successDeviceIdList: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListDeviceBysceneRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 场景码
  scene: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      scene: 'scene',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      scene: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListDeviceBysceneResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 设备列表
  deviceList?: Device[];
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
      deviceList: { 'type': 'array', 'itemType': Device },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateDeviceInfoRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链上设备Id
  chainDeviceId: string;
  // 设备imei号
  deviceImei?: string;
  // 设备数据模型Id
  // 
  // 
  dataModelId?: string;
  // 设备ICCID
  // 
  // 
  deviceIccid?: string;
  // deviceTypeCode 枚举 
  // 
  // 车辆: 1000
  // 四轮车: 1001
  // 纯电四轮车:1002
  // 混动四轮车 1003
  // 燃油四轮车 : 1004
  // 
  // 两轮车:1011
  // 两轮单车:1012
  // 两轮助力车:1013
  // 
  // 换电柜 :2000
  // 二轮车换电柜:2001
  // 
  // 电池 :3000
  // 磷酸铁电池:3001
  // 三元锂电池:3002
  // 
  // 回收设备:4000
  // 垃圾分类回收:4001
  // 
  // 洗车机 :5000
  // 通用计算设备	                6000
  // 	移动设备		        6001
  // 		智能手机	        6002
  // 		工业掌机	        6003
  // 		平板电脑	        6004
  // 	云设备		        6011
  // 		云计算服务器	6012
  deviceTypeCode?: number;
  // 设备单价 单位：分
  initialPrice?: number;
  // 出厂时间
  factoryTime?: string;
  // 投放时间
  releaseTime?: string;
  // 设备型号
  deviceName?: string;
  // 额外信息
  extraInfo?: string;
  // 资产所有人标识（统一社会信用代码）
  owner?: string;
  // 资产所有人名称
  ownerName?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      chainDeviceId: 'chain_device_id',
      deviceImei: 'device_imei',
      dataModelId: 'data_model_id',
      deviceIccid: 'device_iccid',
      deviceTypeCode: 'device_type_code',
      initialPrice: 'initial_price',
      factoryTime: 'factory_time',
      releaseTime: 'release_time',
      deviceName: 'device_name',
      extraInfo: 'extra_info',
      owner: 'owner',
      ownerName: 'owner_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      chainDeviceId: 'string',
      deviceImei: 'string',
      dataModelId: 'string',
      deviceIccid: 'string',
      deviceTypeCode: 'number',
      initialPrice: 'number',
      factoryTime: 'string',
      releaseTime: 'string',
      deviceName: 'string',
      extraInfo: 'string',
      owner: 'string',
      ownerName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateDeviceInfoResponse extends $tea.Model {
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

export class CreateDistributedeviceBydeviceidRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 厂商名
  corpName?: string;
  // 数据模型Id
  deviceDataModelId?: string;
  // 设备Id
  deviceId: string;
  // 设备imei号
  deviceImei?: string;
  // 设备名称
  deviceName?: string;
  // 场景码
  scene: string;
  // 枚举值： SIGNED_DATA 、RAW_DATA ，默认填写 SIGNED_DATA（需要验签的设备）
  deviceFeature?: string;
  // 当用已发行设备发行时返回已发行id或返回错误
  withExistDeviceId?: boolean;
  // 设备类型编码
  deviceTypeCode?: number;
  // 设备单价 单位：分
  initialPrice?: number;
  // 出厂时间
  factoryTime?: string;
  // 投放时间
  releaseTime?: string;
  // 额外信息
  extraInfo?: string;
  // 资产所有人标识（统一社会信用代码）
  owner?: string;
  // 资产所有人名称
  ownerName?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      corpName: 'corp_name',
      deviceDataModelId: 'device_data_model_id',
      deviceId: 'device_id',
      deviceImei: 'device_imei',
      deviceName: 'device_name',
      scene: 'scene',
      deviceFeature: 'device_feature',
      withExistDeviceId: 'with_exist_device_id',
      deviceTypeCode: 'device_type_code',
      initialPrice: 'initial_price',
      factoryTime: 'factory_time',
      releaseTime: 'release_time',
      extraInfo: 'extra_info',
      owner: 'owner',
      ownerName: 'owner_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      corpName: 'string',
      deviceDataModelId: 'string',
      deviceId: 'string',
      deviceImei: 'string',
      deviceName: 'string',
      scene: 'string',
      deviceFeature: 'string',
      withExistDeviceId: 'boolean',
      deviceTypeCode: 'number',
      initialPrice: 'number',
      factoryTime: 'string',
      releaseTime: 'string',
      extraInfo: 'string',
      owner: 'string',
      ownerName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateDistributedeviceBydeviceidResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 链上设备Id
  chainDeviceId?: string;
  // 发行设备Id
  distributeDeviceId?: string;
  // 可信设备ID
  trustiotDeviceId?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      chainDeviceId: 'chain_device_id',
      distributeDeviceId: 'distribute_device_id',
      trustiotDeviceId: 'trustiot_device_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      chainDeviceId: 'string',
      distributeDeviceId: 'string',
      trustiotDeviceId: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateDistributedeviceBychainidRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链上设备Id
  chainDeviceId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      chainDeviceId: 'chain_device_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      chainDeviceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateDistributedeviceBychainidResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 发行设备Id
  distributeDeviceId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      distributeDeviceId: 'distribute_device_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      distributeDeviceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ReplaceDistributedeviceBychainidRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链上设备Id
  chainDeviceId: string;
  // 发行设备Id
  distributeDeviceId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      chainDeviceId: 'chain_device_id',
      distributeDeviceId: 'distribute_device_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      chainDeviceId: 'string',
      distributeDeviceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ReplaceDistributedeviceBychainidResponse extends $tea.Model {
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

export class SendCollectorBychainidRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链上设备Id
  chainDeviceId: string;
  // 收集数据
  collectContentList: CollectContent[];
  // 随机数，防重放
  nonce: string;
  // 数据模型Id
  dataModelId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      chainDeviceId: 'chain_device_id',
      collectContentList: 'collect_content_list',
      nonce: 'nonce',
      dataModelId: 'data_model_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      chainDeviceId: 'string',
      collectContentList: { 'type': 'array', 'itemType': CollectContent },
      nonce: 'string',
      dataModelId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SendCollectorBychainidResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 收集数据返回的上链结果
  resultList?: SendCollectorResult[];
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
      resultList: { 'type': 'array', 'itemType': SendCollectorResult },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetDistributedeviceBychainidRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 发行设备Id
  chainIdList: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      chainIdList: 'chain_id_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      chainIdList: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetDistributedeviceBychainidResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 发行设备
  distributeDeviceList?: DistributeDevice[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      distributeDeviceList: 'distribute_device_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      distributeDeviceList: { 'type': 'array', 'itemType': DistributeDevice },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListDistributedeviceBysceneRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 场景码
  scene: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      scene: 'scene',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      scene: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListDistributedeviceBysceneResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 发行设备
  distributeDeviceList?: DistributeDevice[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      distributeDeviceList: 'distribute_device_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      distributeDeviceList: { 'type': 'array', 'itemType': DistributeDevice },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateConsumerRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 消费者名称
  consumerName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      consumerName: 'consumer_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      consumerName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateConsumerResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 消费者Id
  consumerId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      consumerId: 'consumer_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      consumerId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SetConsumerSubscribeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 消费者Id
  consumerId: string;
  // 订阅的发行设备Id列表
  distributeDeviceIdList: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      consumerId: 'consumer_id',
      distributeDeviceIdList: 'distribute_device_id_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      consumerId: 'string',
      distributeDeviceIdList: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SetConsumerSubscribeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 订阅的发行设备列表
  distributeDeviceList?: string[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      distributeDeviceList: 'distribute_device_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      distributeDeviceList: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SetConsumerUnsubscribeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 消费者id
  consumerId: string;
  // 发型设备Id列表
  distributeDeviceIdList: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      consumerId: 'consumer_id',
      distributeDeviceIdList: 'distribute_device_id_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      consumerId: 'string',
      distributeDeviceIdList: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SetConsumerUnsubscribeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 发行设备列表
  distributeDeviceList?: string[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      distributeDeviceList: 'distribute_device_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      distributeDeviceList: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PullConsumerDatasourceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 消费者id
  consumerId: string;
  // 分页游标
  cursor: string;
  // 获取的时间范围
  timeSpan?: string[];
  // 类型：DEVICE、PERIPHERAL、ALL 默认为 ALL
  deviceType?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      consumerId: 'consumer_id',
      cursor: 'cursor',
      timeSpan: 'time_span',
      deviceType: 'device_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      consumerId: 'string',
      cursor: 'string',
      timeSpan: { 'type': 'array', 'itemType': 'string' },
      deviceType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PullConsumerDatasourceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 分页游标
  cursor?: string;
  // 数据包列表
  dataPackageList?: DistributeDataPackage[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      cursor: 'cursor',
      dataPackageList: 'data_package_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      cursor: 'string',
      dataPackageList: { 'type': 'array', 'itemType': DistributeDataPackage },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetDistributedeviceBydeviceidRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 设备Id
  deviceIdList: string[];
  // 场景码
  scene: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      deviceIdList: 'device_id_list',
      scene: 'scene',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      deviceIdList: { 'type': 'array', 'itemType': 'string' },
      scene: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetDistributedeviceBydeviceidResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 发行设备
  distributeDeviceList?: DistributeDevice[];
  // 发行设备信息不存在的deviceid集合
  missDeviceIdList?: string[];
  // 成功获取到发行设备信息的deviceid集合
  successDeviceIdList?: string[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      distributeDeviceList: 'distribute_device_list',
      missDeviceIdList: 'miss_device_id_list',
      successDeviceIdList: 'success_device_id_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      distributeDeviceList: { 'type': 'array', 'itemType': DistributeDevice },
      missDeviceIdList: { 'type': 'array', 'itemType': 'string' },
      successDeviceIdList: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetDistributedeviceBydisidRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 发行设备id列表
  distributeDeviceIdList: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      distributeDeviceIdList: 'distribute_device_id_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      distributeDeviceIdList: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetDistributedeviceBydisidResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 发行设备列表
  distributeDeviceList?: DistributeDevice[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      distributeDeviceList: 'distribute_device_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      distributeDeviceList: { 'type': 'array', 'itemType': DistributeDevice },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ImportPeripheralRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 厂商名称
  corpName?: string;
  // 数据模型id
  peripheralDataModelId: string;
  // 外围设备ID
  peripheralId: string;
  // 外围设备名称
  peripheralName?: string;
  // 场景码
  scene: string;
  // 设备类型编码，必填，对应资管平台中的设备类型 
  // 
  // 枚举值：
  // 
  // 车辆 1000 
  // 车辆 四轮车 1001 
  // 车辆 四轮车 纯电四轮车 1002 
  // 车辆 四轮车 混动四轮车 1003 
  // 车辆 四轮车 燃油四轮车 1004 
  // 车辆 两轮车 1011 
  // 车辆 两轮车 两轮单车 1012 
  // 车辆 两轮车 两轮助力车 1013 
  // 
  // 换电柜 2000 
  // 换电柜 二轮车换电柜 2001 
  // 
  // 电池 3000 
  // 电池 磷酸铁电池 3001 
  // 电池 三元锂电池 3002 
  // 
  // 回收设备 4000 
  // 
  // 垃圾分类回收 4001 
  // 
  // 洗车机 5000
  deviceTypeCode?: number;
  // 设备单价 单位：分
  initialPrice?: number;
  // 出厂时间
  factoryTime?: string;
  // 投放时间
  releaseTime?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      corpName: 'corp_name',
      peripheralDataModelId: 'peripheral_data_model_id',
      peripheralId: 'peripheral_id',
      peripheralName: 'peripheral_name',
      scene: 'scene',
      deviceTypeCode: 'device_type_code',
      initialPrice: 'initial_price',
      factoryTime: 'factory_time',
      releaseTime: 'release_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      corpName: 'string',
      peripheralDataModelId: 'string',
      peripheralId: 'string',
      peripheralName: 'string',
      scene: 'string',
      deviceTypeCode: 'number',
      initialPrice: 'number',
      factoryTime: 'string',
      releaseTime: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ImportPeripheralResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 链上外围设备Id
  // 
  // 
  chainPeripheralId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      chainPeripheralId: 'chain_peripheral_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      chainPeripheralId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetPeripheralBychainperipheralidRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链上外围设备Id
  chainPeripheralId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      chainPeripheralId: 'chain_peripheral_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      chainPeripheralId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetPeripheralBychainperipheralidResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 外围设备信息
  peripheral?: Peripheral;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      peripheral: 'peripheral',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      peripheral: Peripheral,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetPeripheralByperipheralidRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 外围设备ID
  peripheralId: string;
  // 场景码
  // 
  scene: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      peripheralId: 'peripheral_id',
      scene: 'scene',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      peripheralId: 'string',
      scene: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetPeripheralByperipheralidResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 外围设备信息
  // 
  // 
  peripheral?: Peripheral;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      peripheral: 'peripheral',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      peripheral: Peripheral,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListPeripheralBysceneRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 场景码
  // 
  scene: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      scene: 'scene',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      scene: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListPeripheralBysceneResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 外围设备信息列表
  // 
  // 
  peripheralList?: Peripheral[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      peripheralList: 'peripheral_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      peripheralList: { 'type': 'array', 'itemType': Peripheral },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateDistributedeviceByperipheralidRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 厂商名称
  corpName?: string;
  // 数据模型id
  peripheralDataModelId: string;
  // 外围设备ID
  peripheralId: string;
  // 外围设备名称
  // 
  peripheralName?: string;
  // 场景码
  scene: string;
  // 设备类型编码
  deviceTypeCode?: number;
  // 设备单价 单位：分
  initialPrice?: number;
  // 出厂时间
  factoryTime?: string;
  // 投放时间
  releaseTime?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      corpName: 'corp_name',
      peripheralDataModelId: 'peripheral_data_model_id',
      peripheralId: 'peripheral_id',
      peripheralName: 'peripheral_name',
      scene: 'scene',
      deviceTypeCode: 'device_type_code',
      initialPrice: 'initial_price',
      factoryTime: 'factory_time',
      releaseTime: 'release_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      corpName: 'string',
      peripheralDataModelId: 'string',
      peripheralId: 'string',
      peripheralName: 'string',
      scene: 'string',
      deviceTypeCode: 'number',
      initialPrice: 'number',
      factoryTime: 'string',
      releaseTime: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateDistributedeviceByperipheralidResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 发行设备Id
  // 
  distributeDeviceId?: string;
  // 链上外围设备Id
  // 
  chainPeripheralId?: string;
  // 可信设备ID
  trustiotPeripheralId?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      distributeDeviceId: 'distribute_device_id',
      chainPeripheralId: 'chain_peripheral_id',
      trustiotPeripheralId: 'trustiot_peripheral_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      distributeDeviceId: 'string',
      chainPeripheralId: 'string',
      trustiotPeripheralId: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateDistributedeviceBychainperipheralidRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链上外围设备Id
  // 
  chainPeripheralId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      chainPeripheralId: 'chain_peripheral_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      chainPeripheralId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateDistributedeviceBychainperipheralidResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 发行外围设备Id
  // 
  distributeDeviceId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      distributeDeviceId: 'distribute_device_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      distributeDeviceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ReplaceDistributedeviceBychainperipheralidRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 发行外围设备Id
  // 
  // 
  distributeDeviceId: string;
  // 链上外围设备ID
  chainPeripheralId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      distributeDeviceId: 'distribute_device_id',
      chainPeripheralId: 'chain_peripheral_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      distributeDeviceId: 'string',
      chainPeripheralId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ReplaceDistributedeviceBychainperipheralidResponse extends $tea.Model {
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

export class ListDistributedeviceByperipheralsceneRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 场景码
  scene: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      scene: 'scene',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      scene: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListDistributedeviceByperipheralsceneResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 发行的外围设备信息数组
  // 
  distributeDeviceList?: DistributeDevice[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      distributeDeviceList: 'distribute_device_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      distributeDeviceList: { 'type': 'array', 'itemType': DistributeDevice },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetDistributedeviceByperipheralidRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 外围设备Id数组
  peripheralIdList: string[];
  // 场景码
  scene: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      peripheralIdList: 'peripheral_id_list',
      scene: 'scene',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      peripheralIdList: { 'type': 'array', 'itemType': 'string' },
      scene: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetDistributedeviceByperipheralidResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 发行设备信息数组
  distributeDeviceList?: DistributeDevice[];
  // 发行设备信息不存在的外围设备ID集合
  missPeripheralIdList?: string[];
  // 获取外围设备信息成功的外围设备ID集合
  successPeripheralIdList?: string[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      distributeDeviceList: 'distribute_device_list',
      missPeripheralIdList: 'miss_peripheral_id_list',
      successPeripheralIdList: 'success_peripheral_id_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      distributeDeviceList: { 'type': 'array', 'itemType': DistributeDevice },
      missPeripheralIdList: { 'type': 'array', 'itemType': 'string' },
      successPeripheralIdList: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateDistributedeviceBydeviceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 设备Id
  // 
  deviceId: string;
  // 设备数据模型Id
  // 
  // 
  dataModelId?: string;
  // 场景码 
  // 
  // 
  scene: string;
  // 设备注册信息
  // 
  // 
  content: string;
  // 签名
  // 
  // 
  signature: string;
  // sdk版本号
  // 
  // 
  sdkId: string;
  // 设备类型编码，必填，对应资管平台中的设备类型 
  // 
  // 枚举值：
  // 
  // 车辆 1000 
  // 车辆 四轮车 1001 
  // 车辆 四轮车 纯电四轮车 1002 
  // 车辆 四轮车 混动四轮车 1003 
  // 车辆 四轮车 燃油四轮车 1004 
  // 车辆 两轮车 1011 
  // 车辆 两轮车 两轮单车 1012 
  // 车辆 两轮车 两轮助力车 1013 
  // 
  // 换电柜 2000 
  // 换电柜 二轮车换电柜 2001 
  // 
  // 电池 3000 
  // 电池 磷酸铁电池 3001 
  // 电池 三元锂电池 3002 
  // 
  // 回收设备 4000 
  // 
  // 垃圾分类回收 4001 
  // 
  // 洗车机 5000
  // 
  // 通用计算设备	                6000
  // 	移动设备		        6001
  // 		智能手机	        6002
  // 		工业掌机	        6003
  // 		平板电脑	        6004
  // 	云设备		        6011
  // 		云计算服务器	6012
  deviceTypeCode?: number;
  // 设备单价 单位：分
  initialPrice?: number;
  // 出厂时间
  factoryTime?: string;
  // 投放时间
  releaseTime?: string;
  // 设备型号
  deviceName?: string;
  // 资产所有人标识（统一社会信用代码）
  owner?: string;
  // 资产所有人名称
  ownerName?: string;
  // 额外信息
  extraInfo?: string;
  // 设备IMEI
  deviceImei?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      deviceId: 'device_id',
      dataModelId: 'data_model_id',
      scene: 'scene',
      content: 'content',
      signature: 'signature',
      sdkId: 'sdk_id',
      deviceTypeCode: 'device_type_code',
      initialPrice: 'initial_price',
      factoryTime: 'factory_time',
      releaseTime: 'release_time',
      deviceName: 'device_name',
      owner: 'owner',
      ownerName: 'owner_name',
      extraInfo: 'extra_info',
      deviceImei: 'device_imei',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      deviceId: 'string',
      dataModelId: 'string',
      scene: 'string',
      content: 'string',
      signature: 'string',
      sdkId: 'string',
      deviceTypeCode: 'number',
      initialPrice: 'number',
      factoryTime: 'string',
      releaseTime: 'string',
      deviceName: 'string',
      owner: 'string',
      ownerName: 'string',
      extraInfo: 'string',
      deviceImei: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateDistributedeviceBydeviceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 链上设备Id
  // 
  // 
  chainDeviceid?: string;
  // 发行设备Id
  // 
  // 
  distributeDeviceId?: string;
  // 可信设备ID
  trustiotDeviceId?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      chainDeviceid: 'chain_deviceid',
      distributeDeviceId: 'distribute_device_id',
      trustiotDeviceId: 'trustiot_device_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      chainDeviceid: 'string',
      distributeDeviceId: 'string',
      trustiotDeviceId: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateTaskRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 设备Id
  // 
  // 
  deviceId: string;
  // 远程命令
  // 
  // 
  cmd: string;
  // 附加信息
  // 
  // 
  extra: string;
  // 场景码 
  // 
  // 
  scene: string;
  // 设备类型
  deviceType: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      deviceId: 'device_id',
      cmd: 'cmd',
      extra: 'extra',
      scene: 'scene',
      deviceType: 'device_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      deviceId: 'string',
      cmd: 'string',
      extra: 'string',
      scene: 'string',
      deviceType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateTaskResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 任务Id
  // 
  // 
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

export class QueryTaskRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 任务Id
  // 
  // 
  taskId: string;
  // 场景码 
  // 
  // 
  scene: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      taskId: 'task_id',
      scene: 'scene',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      taskId: 'string',
      scene: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTaskResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 任务状态
  // 
  // 
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

export class QueryAnalysisRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 发行设备Id集合
  // 
  // 
  disIdList?: string[];
  // 时间，格式YYYYMMDD
  // 
  // 
  time: string;
  // 场景码
  scene: string;
  // SCENE : 场景设备资产分析   DEVICE：设备分析 BIZ：订单分析   ， 默认为DEVICE
  scope?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      disIdList: 'dis_id_list',
      time: 'time',
      scene: 'scene',
      scope: 'scope',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      disIdList: { 'type': 'array', 'itemType': 'string' },
      time: 'string',
      scene: 'string',
      scope: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAnalysisResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 分析数据，根据不同场景的不同json串
  resultList?: string[];
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
      resultList: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SendCollectorBychainidmulRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 上传数据
  // 
  // 
  content: CollectContent[];
  // 随机业务号，防重放
  // 
  // 
  nonce: string;
  // 开启后接口返回值中包含txHash
  waitCheckAndHash?: boolean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      content: 'content',
      nonce: 'nonce',
      waitCheckAndHash: 'wait_check_and_hash',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      content: { 'type': 'array', 'itemType': CollectContent },
      nonce: 'string',
      waitCheckAndHash: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SendCollectorBychainidmulResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 数据上链哈希
  resultList?: SendCollectorResult[];
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
      resultList: { 'type': 'array', 'itemType': SendCollectorResult },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SendCollectorDevicebizdataRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 数据模型Id
  // 
  // 
  dataModelId: string;
  // 业务号，防重放
  // 
  // 
  nonce: string;
  // 上传数据
  content: BizContentGroup[];
  // 场景码，与content中的chainDeviceId至少有一个不为空
  scene?: string;
  // 开启后，接口返回值中包含txHash
  waitCheckAndHash?: boolean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      dataModelId: 'data_model_id',
      nonce: 'nonce',
      content: 'content',
      scene: 'scene',
      waitCheckAndHash: 'wait_check_and_hash',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      dataModelId: 'string',
      nonce: 'string',
      content: { 'type': 'array', 'itemType': BizContentGroup },
      scene: 'string',
      waitCheckAndHash: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SendCollectorDevicebizdataResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 数据上链哈希
  resultList?: SendCollectorResult[];
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
      resultList: { 'type': 'array', 'itemType': SendCollectorResult },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateDeviceInfobydeviceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 设备Id
  deviceId: string;
  // 设备数据模型Id
  // 
  // 
  dataModelId: string;
  // 场景码 
  // 
  // 
  scene: string;
  // sdk版本号
  // 
  // 
  sdkId: string;
  // 设备注册信息
  // 
  // 
  content: string;
  // 签名
  signature: string;
  // 设备类型编码，必填，对应资管平台中的设备类型 
  // 
  // 枚举值：
  // 
  // 车辆 1000 
  // 车辆 四轮车 1001 
  // 车辆 四轮车 纯电四轮车 1002 
  // 车辆 四轮车 混动四轮车 1003 
  // 车辆 四轮车 燃油四轮车 1004 
  // 车辆 两轮车 1011 
  // 车辆 两轮车 两轮单车 1012 
  // 车辆 两轮车 两轮助力车 1013 
  // 
  // 换电柜 2000 
  // 换电柜 二轮车换电柜 2001 
  // 
  // 电池 3000 
  // 电池 磷酸铁电池 3001 
  // 电池 三元锂电池 3002 
  // 
  // 回收设备 4000 
  // 
  // 垃圾分类回收 4001 
  // 
  // 洗车机 5000
  // 
  // 通用计算设备	                6000
  // 	移动设备		        6001
  // 		智能手机	        6002
  // 		工业掌机	        6003
  // 		平板电脑	        6004
  // 	云设备		        6011
  // 		云计算服务器	6012
  deviceTypeCode: number;
  // 设备单价 单位：分
  initialPrice: number;
  // 出厂时间
  // 
  factoryTime: string;
  // 投放时间
  // 
  releaseTime: string;
  // 设备型号
  deviceName?: string;
  // 设备上报数据是否需要验签，取值范围（RAW_DATA、SIGNED_DATA），
  // SIGNED_DATA：需要验签
  // RAW_DATA：不需要验签
  deviceFeature?: string;
  // 额外信息
  extraInfo?: string;
  // 资产所有人标识（统一社会信用代码）
  owner?: string;
  // 资产所有人名称
  ownerName?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      deviceId: 'device_id',
      dataModelId: 'data_model_id',
      scene: 'scene',
      sdkId: 'sdk_id',
      content: 'content',
      signature: 'signature',
      deviceTypeCode: 'device_type_code',
      initialPrice: 'initial_price',
      factoryTime: 'factory_time',
      releaseTime: 'release_time',
      deviceName: 'device_name',
      deviceFeature: 'device_feature',
      extraInfo: 'extra_info',
      owner: 'owner',
      ownerName: 'owner_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      deviceId: 'string',
      dataModelId: 'string',
      scene: 'string',
      sdkId: 'string',
      content: 'string',
      signature: 'string',
      deviceTypeCode: 'number',
      initialPrice: 'number',
      factoryTime: 'string',
      releaseTime: 'string',
      deviceName: 'string',
      deviceFeature: 'string',
      extraInfo: 'string',
      owner: 'string',
      ownerName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateDeviceInfobydeviceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 链上设备Id
  // 
  // 
  chainDeviceId?: string;
  // 发行设备Id
  // 
  // 
  distributeDeviceId?: string;
  // 可信设备ID
  trustiotDeviceId?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      chainDeviceId: 'chain_device_id',
      distributeDeviceId: 'distribute_device_id',
      trustiotDeviceId: 'trustiot_device_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      chainDeviceId: 'string',
      distributeDeviceId: 'string',
      trustiotDeviceId: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class OfflineDeviceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 设备链上Id
  // 
  // 
  chainDeviceId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      chainDeviceId: 'chain_device_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      chainDeviceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class OfflineDeviceResponse extends $tea.Model {
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

export class ApplyMqtokenRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 场景码
  scene: string;
  // 设备ID
  deviceId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      scene: 'scene',
      deviceId: 'device_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      scene: 'string',
      deviceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyMqtokenResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 服务端返回的Token值，用于阿里云 MQTT连接
  token?: string;
  // 接入阿里云LMQ的所需的accessKey
  accessKey?: string;
  // mqtt的instanceId
  instanceId?: string;
  // mqtt的topic
  subTopic?: string;
  // mqtt的topic
  pubTopic?: string;
  // mqtt的groupId
  groupId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      token: 'token',
      accessKey: 'access_key',
      instanceId: 'instance_id',
      subTopic: 'sub_topic',
      pubTopic: 'pub_topic',
      groupId: 'group_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      token: 'string',
      accessKey: 'string',
      instanceId: 'string',
      subTopic: 'string',
      pubTopic: 'string',
      groupId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDeviceRegistrationRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 设备Id，由接入方提供，场景内唯一
  deviceId: string;
  // 场景号
  scene: string;
  // 可信根派生公钥
  devicePublicKey: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      deviceId: 'device_id',
      scene: 'scene',
      devicePublicKey: 'device_public_key',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      deviceId: 'string',
      scene: 'string',
      devicePublicKey: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDeviceRegistrationResponse extends $tea.Model {
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

export class AddAbnormalRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 设备Id，由接入方提供，场景内唯一 
  deviceId: string;
  // 场景号
  scene: string;
  // 异常类型编码KEY_NOT_FOUND、DEVICE_ID_MISMATCH 等
  abnormalCode: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      deviceId: 'device_id',
      scene: 'scene',
      abnormalCode: 'abnormal_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      deviceId: 'string',
      scene: 'string',
      abnormalCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddAbnormalResponse extends $tea.Model {
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

export class OnlineDeviceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 设备链上ID
  chainDeviceId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      chainDeviceId: 'chain_device_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      chainDeviceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class OnlineDeviceResponse extends $tea.Model {
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

export class OfflineDeviceByunregisterRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 通过链上设备ID注销设备
  chainDeviceId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      chainDeviceId: 'chain_device_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      chainDeviceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class OfflineDeviceByunregisterResponse extends $tea.Model {
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

export class QueryLabelTraceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 场景码 , 使用asset_id 查询时，scene也必须传入
  scene?: string;
  // 标签Id
  labelId?: string;
  // 标签状态
  labelStatus?: string;
  // 资产Id
  assetId?: string;
  // 操作员
  operator?: string;
  // 标签拥有者
  owner?: string;
  // 标签所处流程
  process?: string;
  // 标签操作
  action?: string;
  // 开始时间
  startTime?: string;
  // 结束时间
  endTime?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      scene: 'scene',
      labelId: 'label_id',
      labelStatus: 'label_status',
      assetId: 'asset_id',
      operator: 'operator',
      owner: 'owner',
      process: 'process',
      action: 'action',
      startTime: 'start_time',
      endTime: 'end_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      scene: 'string',
      labelId: 'string',
      labelStatus: 'string',
      assetId: 'string',
      operator: 'string',
      owner: 'string',
      process: 'string',
      action: 'string',
      startTime: 'string',
      endTime: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryLabelTraceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 标签流转历史
  labelTraceList?: LabelTrace[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      labelTraceList: 'label_trace_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      labelTraceList: { 'type': 'array', 'itemType': LabelTrace },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SyncLabelTransferRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 场景码
  scene: string;
  // 收集标签数据
  collectLabelContentList: CollectLabelContent[];
  // 业务号
  nonce: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      scene: 'scene',
      collectLabelContentList: 'collect_label_content_list',
      nonce: 'nonce',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      scene: 'string',
      collectLabelContentList: { 'type': 'array', 'itemType': CollectLabelContent },
      nonce: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SyncLabelTransferResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 标签上链hash返回
  resultList?: LabelChainResult[];
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
      resultList: { 'type': 'array', 'itemType': LabelChainResult },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddLabelAssetRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 场景码
  scene: string;
  // 标签Id
  labelId: string;
  // 资产Id
  assetId: string;
  // 资产对应的设备类型码，对应资管平台中的设备类型
  deviceTypeCode?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      scene: 'scene',
      labelId: 'label_id',
      assetId: 'asset_id',
      deviceTypeCode: 'device_type_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      scene: 'string',
      labelId: 'string',
      assetId: 'string',
      deviceTypeCode: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddLabelAssetResponse extends $tea.Model {
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

export class QueryDataBytxhashRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 场景码
  scene: string;
  // 链上交易hash
  txHash: string;
  // 上链类型枚举： 
  // REGISTER_DEVICE	设备注册
  // DISTRIBUTE_DEVICE	设备发行
  // LABEL_DATA	标签流转数据收集
  // COLLECT_DATA	设备数据收集
  // DEVICE_BIZ_DATA	设备业务订单数据收集
  // REGISTER_PERIPHERAL_DEVICE	外围设备注册
  contractMethod: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      scene: 'scene',
      txHash: 'tx_hash',
      contractMethod: 'contract_method',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      scene: 'string',
      txHash: 'string',
      contractMethod: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDataBytxhashResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回信息
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

export class ExecUnprocessedTaskRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 任务ID
  taskId: string;
  // 任务名称枚举
  // confirm_device_state : 确认设备状态变更
  action: string;
  // 任务参数
  params: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      taskId: 'task_id',
      action: 'action',
      params: 'params',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      taskId: 'string',
      action: 'string',
      params: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecUnprocessedTaskResponse extends $tea.Model {
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

export class SendCollectorSummarydataRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 汇总所属的场景码
  scene: string;
  // 汇总的业务类型，同一个scene下可以有不同的业务类型，此字段用于区分业务类型
  bizType: string;
  // 提交日期（汇总所属的日期）
  submitDate: string;
  // 汇总数据的数据模型ID
  dataModelId: string;
  // 汇总数据的内容，格式遵循data_model_id制定的格式
  content: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      scene: 'scene',
      bizType: 'biz_type',
      submitDate: 'submit_date',
      dataModelId: 'data_model_id',
      content: 'content',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      scene: 'string',
      bizType: 'string',
      submitDate: 'string',
      dataModelId: 'string',
      content: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SendCollectorSummarydataResponse extends $tea.Model {
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

export class AddCertificateRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 机构Id
  organizationId?: number;
  // 证书内容
  certificate: string;
  // 设备ID
  deviceId: string;
  // 主机设备ID
  hostDeviceId: string;
  // 场景码
  projectId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      organizationId: 'organization_id',
      certificate: 'certificate',
      deviceId: 'device_id',
      hostDeviceId: 'host_device_id',
      projectId: 'project_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      organizationId: 'number',
      certificate: 'string',
      deviceId: 'string',
      hostDeviceId: 'string',
      projectId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddCertificateResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 原始数据
  rawData?: string;
  // 对raw_data的签名
  platformSignature?: string;
  // 执行结果成功与否
  success?: boolean;
  // 错误码
  errorCode?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      rawData: 'raw_data',
      platformSignature: 'platform_signature',
      success: 'success',
      errorCode: 'error_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      rawData: 'string',
      platformSignature: 'string',
      success: 'boolean',
      errorCode: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddTenantRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户
  tenantName: string;
  // 组织名称
  orgName: string;
  // 企业执照号
  owner?: string;
  // 网关私钥
  gatewayPrivateKey?: string;
  // 网关公钥
  gatewayPublicKey?: string;
  // 是否需要生成秘钥对，默认为false
  generateGatewayKeys?: boolean;
  // 是否为测试租户
  mock?: boolean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantName: 'tenant_name',
      orgName: 'org_name',
      owner: 'owner',
      gatewayPrivateKey: 'gateway_private_key',
      gatewayPublicKey: 'gateway_public_key',
      generateGatewayKeys: 'generate_gateway_keys',
      mock: 'mock',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantName: 'string',
      orgName: 'string',
      owner: 'string',
      gatewayPrivateKey: 'string',
      gatewayPublicKey: 'string',
      generateGatewayKeys: 'boolean',
      mock: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddTenantResponse extends $tea.Model {
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

export class AddSceneRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 场景名称
  sceneName: string;
  // 是否托管,取值范围为：NON_ESCROWED、ESCROWED
  escrowed: string;
  // 私钥密码
  privateKeyPassword: string;
  // 租户
  tenantName: string;
  // 场景类型
  sceneType: string;
  // 是否为测试数据
  mock?: boolean;
  // 拉块解析后是否推送至业务方
  ledgerstreamPushEnable?: boolean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      sceneName: 'scene_name',
      escrowed: 'escrowed',
      privateKeyPassword: 'private_key_password',
      tenantName: 'tenant_name',
      sceneType: 'scene_type',
      mock: 'mock',
      ledgerstreamPushEnable: 'ledgerstream_push_enable',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      sceneName: 'string',
      escrowed: 'string',
      privateKeyPassword: 'string',
      tenantName: 'string',
      sceneType: 'string',
      mock: 'boolean',
      ledgerstreamPushEnable: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddSceneResponse extends $tea.Model {
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

export class DeploySceneRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 场景名称
  sceneName: string;
  // bnaas did
  bnaasBasicServiceDid?: string;
  // baas rest bizId
  baasRestBizId?: string;
  // 合约版本号
  contractVersion?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      sceneName: 'scene_name',
      bnaasBasicServiceDid: 'bnaas_basic_service_did',
      baasRestBizId: 'baas_rest_biz_id',
      contractVersion: 'contract_version',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      sceneName: 'string',
      bnaasBasicServiceDid: 'string',
      baasRestBizId: 'string',
      contractVersion: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeploySceneResponse extends $tea.Model {
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

export class AddSdkRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 设备SDK公钥
  verifyKey: string;
  // SDK版本号
  sdkVersionStr: string;
  // sdk模型，格式为json
  metaModel: string;
  // 平台
  platform?: string;
  // 公司名称
  corpName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      verifyKey: 'verify_key',
      sdkVersionStr: 'sdk_version_str',
      metaModel: 'meta_model',
      platform: 'platform',
      corpName: 'corp_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      verifyKey: 'string',
      sdkVersionStr: 'string',
      metaModel: 'string',
      platform: 'string',
      corpName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddSdkResponse extends $tea.Model {
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

export class UpdateSdkRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 主键id
  id: number;
  // 设备SDK公钥
  verifyKey?: string;
  // SDK版本号
  sdkVersionStr?: string;
  // sdk模型，格式为json
  metaModel?: string;
  // 平台
  platform?: string;
  // 公司名称
  // 
  corpName?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      id: 'id',
      verifyKey: 'verify_key',
      sdkVersionStr: 'sdk_version_str',
      metaModel: 'meta_model',
      platform: 'platform',
      corpName: 'corp_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      id: 'number',
      verifyKey: 'string',
      sdkVersionStr: 'string',
      metaModel: 'string',
      platform: 'string',
      corpName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateSdkResponse extends $tea.Model {
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

export class AddProductkeyRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 设备端productKey
  productKey: string;
  // 场景码
  scene: string;
  // 租户ID
  tenantName: string;
  // 数据模型
  dataModelId: string;
  // sdk前缀
  sdkVersionPrefix: string;
  // 制造商
  manufacturer: string;
  // 顾客
  customer: string;
  // 是否为测试数据
  mock?: boolean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      productKey: 'product_key',
      scene: 'scene',
      tenantName: 'tenant_name',
      dataModelId: 'data_model_id',
      sdkVersionPrefix: 'sdk_version_prefix',
      manufacturer: 'manufacturer',
      customer: 'customer',
      mock: 'mock',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      productKey: 'string',
      scene: 'string',
      tenantName: 'string',
      dataModelId: 'string',
      sdkVersionPrefix: 'string',
      manufacturer: 'string',
      customer: 'string',
      mock: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddProductkeyResponse extends $tea.Model {
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

export class UpdateProductkeyRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 主键id
  id: number;
  // 设备端productKey
  // 
  productKey?: string;
  // 场景码
  // 
  scene?: string;
  // 租户ID
  // 
  tenantName?: string;
  // 数据模型
  // 
  dataModelId?: string;
  // sdk前缀
  sdkVersionPrefix?: string;
  // 制造商
  // 
  manufacturer?: string;
  // 顾客
  customer?: string;
  // 是否为测试数据
  mock?: boolean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      id: 'id',
      productKey: 'product_key',
      scene: 'scene',
      tenantName: 'tenant_name',
      dataModelId: 'data_model_id',
      sdkVersionPrefix: 'sdk_version_prefix',
      manufacturer: 'manufacturer',
      customer: 'customer',
      mock: 'mock',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      id: 'number',
      productKey: 'string',
      scene: 'string',
      tenantName: 'string',
      dataModelId: 'string',
      sdkVersionPrefix: 'string',
      manufacturer: 'string',
      customer: 'string',
      mock: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateProductkeyResponse extends $tea.Model {
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

export class UpdateTenantRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 主键Id
  id: number;
  // 租户
  tenantName?: string;
  // 组织名称
  orgName?: string;
  // 企业执照号
  // 
  owner?: string;
  // 网关私钥
  // 
  gatewayPrivateKey?: string;
  // 网关公钥
  // 
  gatewayPublicKey?: string;
  // 是否为测试租户
  mock?: boolean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      id: 'id',
      tenantName: 'tenant_name',
      orgName: 'org_name',
      owner: 'owner',
      gatewayPrivateKey: 'gateway_private_key',
      gatewayPublicKey: 'gateway_public_key',
      mock: 'mock',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      id: 'number',
      tenantName: 'string',
      orgName: 'string',
      owner: 'string',
      gatewayPrivateKey: 'string',
      gatewayPublicKey: 'string',
      mock: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateTenantResponse extends $tea.Model {
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

export class UpdateSceneRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 主键Id 
  id: number;
  // 是否跳过中台数据校验处理
  skipPegasus: boolean;
  // 场景名称
  // 
  sceneName?: string;
  // 租户
  // 
  tenantName?: string;
  // 场景类型
  // 
  sceneType?: string;
  // 定制数据处理类 , 使用用逗号分隔
  customerProcessor?: string;
  // 是否为测试数据
  mock?: boolean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      id: 'id',
      skipPegasus: 'skip_pegasus',
      sceneName: 'scene_name',
      tenantName: 'tenant_name',
      sceneType: 'scene_type',
      customerProcessor: 'customer_processor',
      mock: 'mock',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      id: 'number',
      skipPegasus: 'boolean',
      sceneName: 'string',
      tenantName: 'string',
      sceneType: 'string',
      customerProcessor: 'string',
      mock: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateSceneResponse extends $tea.Model {
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

export class SendLabelTransferonasyncRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 场景码
  // 
  scene: string;
  // 收集的标签流转数据
  collectLabelContentList: CollectLabelContent[];
  // 业务号，防重放
  nonce: string;
  // 1 业务端查询结果的最晚时间
  // 2 单位：天，最大值为30 天
  // 3 在responsePeriod 天之后，调用异步接口结果查询 将 无法获取异步接口的执行结果
  responsePeriod: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      scene: 'scene',
      collectLabelContentList: 'collect_label_content_list',
      nonce: 'nonce',
      responsePeriod: 'response_period',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      scene: 'string',
      collectLabelContentList: { 'type': 'array', 'itemType': CollectLabelContent },
      nonce: 'string',
      responsePeriod: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SendLabelTransferonasyncResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 接口请求的唯一标识
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

export class QueryAsyncRequestRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 请求的唯一标识
  requestId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      requestId: 'request_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      requestId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAsyncRequestResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 执行状态 枚举
  // RUNNING	请求正在处理
  // SUCCESS	请求处理成功
  // FAILED	请求处理失败
  status?: string;
  // 异步接口的执行结果 ：根据同步接口的出参构建的JSON字符串
  response?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      status: 'status',
      response: 'response',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      status: 'string',
      response: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequeryTenantRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 页数，默认1
  pageIndex: number;
  // 页码大小，默认10，最大100
  pageSize: number;
  // 租户
  tenantName?: string;
  // 是否为测试数据
  mock?: boolean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      pageIndex: 'page_index',
      pageSize: 'page_size',
      tenantName: 'tenant_name',
      mock: 'mock',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      pageIndex: 'number',
      pageSize: 'number',
      tenantName: 'string',
      mock: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequeryTenantResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 分页查询结果
  data?: PermissionedTenantPageResponse;
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
      data: PermissionedTenantPageResponse,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequerySceneRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 页数，默认1
  pageIndex: number;
  // 页码大小，默认10
  pageSize: number;
  // 场景码
  sceneName?: string;
  // 租户
  tenantName?: string;
  // 是否为测试数据
  mock?: boolean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      pageIndex: 'page_index',
      pageSize: 'page_size',
      sceneName: 'scene_name',
      tenantName: 'tenant_name',
      mock: 'mock',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      pageIndex: 'number',
      pageSize: 'number',
      sceneName: 'string',
      tenantName: 'string',
      mock: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequerySceneResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 分页查询结果
  data?: ScenePageResponse;
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
      data: ScenePageResponse,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequerySdkRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 页数，默认1
  pageIndex: number;
  // 页码大小，默认10，最大100
  pageSize: number;
  // sdk版本号
  sdkVersionStr?: string;
  // 公司名称
  corpName?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      pageIndex: 'page_index',
      pageSize: 'page_size',
      sdkVersionStr: 'sdk_version_str',
      corpName: 'corp_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      pageIndex: 'number',
      pageSize: 'number',
      sdkVersionStr: 'string',
      corpName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequerySdkResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 分页查询结果
  data?: SdkPageResponse;
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
      data: SdkPageResponse,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequeryProductkeyRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 页数，默认1
  pageIndex: number;
  // 页码大小，默认10，最大100
  pageSize: number;
  // 设备端productKey
  productKey?: string;
  // 场景码
  // 
  scene?: string;
  // 租户ID
  // 
  tenantName?: string;
  // 是否为测试数据
  mock?: boolean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      pageIndex: 'page_index',
      pageSize: 'page_size',
      productKey: 'product_key',
      scene: 'scene',
      tenantName: 'tenant_name',
      mock: 'mock',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      pageIndex: 'number',
      pageSize: 'number',
      productKey: 'string',
      scene: 'string',
      tenantName: 'string',
      mock: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequeryProductkeyResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 分页查询结果
  data?: ProductKeyPageResponse;
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
      data: ProductKeyPageResponse,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequeryDataverifyFailureRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 页数，默认1
  pageIndex: number;
  // 页码大小，默认10
  pageSize: number;
  // 场景码
  // 
  scene: string;
  // 起始查询时间
  startDate: string;
  // 结束查询时间
  endDate: string;
  // 设备ID（模糊查询）
  deviceId?: string;
  // 数据来源：0(普通数据上报)；1(MAAS数据上报)；2(设备业务数据上报);3(标签流转)
  source?: number;
  // 类型：0:数据上报;1:数据完整性校验
  type?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      pageIndex: 'page_index',
      pageSize: 'page_size',
      scene: 'scene',
      startDate: 'start_date',
      endDate: 'end_date',
      deviceId: 'device_id',
      source: 'source',
      type: 'type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      pageIndex: 'number',
      pageSize: 'number',
      scene: 'string',
      startDate: 'string',
      endDate: 'string',
      deviceId: 'string',
      source: 'number',
      type: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequeryDataverifyFailureResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 数据
  data?: DataVerifyFailureDataPageResponse;
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
      data: DataVerifyFailureDataPageResponse,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddAlertStrategyRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户
  tenantName: string;
  // 场景码
  scene?: string;
  // 策略类型：DEBUG（技术联调）；MONITOR（生产监控）
  strategyType: string;
  // 策略详情，json格式
  strategyDetail: string;
  // 是否启用，默认false
  enabled: boolean;
  // 备注
  remark?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantName: 'tenant_name',
      scene: 'scene',
      strategyType: 'strategy_type',
      strategyDetail: 'strategy_detail',
      enabled: 'enabled',
      remark: 'remark',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantName: 'string',
      scene: 'string',
      strategyType: 'string',
      strategyDetail: 'string',
      enabled: 'boolean',
      remark: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddAlertStrategyResponse extends $tea.Model {
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

export class UpdateAlertStrategyRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 主键ID，更新依据
  id: number;
  // 租户
  tenantName?: string;
  // 场景码
  // 
  scene?: string;
  // 策略类型：DEBUG（技术联调）；MONITOR（生产监控）
  strategyType?: string;
  // 策略详情，json格式
  strategyDetail?: string;
  // 是否启用，默认false
  enabled: boolean;
  // 备注
  // 
  remark?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      id: 'id',
      tenantName: 'tenant_name',
      scene: 'scene',
      strategyType: 'strategy_type',
      strategyDetail: 'strategy_detail',
      enabled: 'enabled',
      remark: 'remark',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      id: 'number',
      tenantName: 'string',
      scene: 'string',
      strategyType: 'string',
      strategyDetail: 'string',
      enabled: 'boolean',
      remark: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateAlertStrategyResponse extends $tea.Model {
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

export class PagequeryAlertStrategyRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 页数，默认1
  pageIndex: number;
  // 页码大小，默认10
  pageSize: number;
  // 租户
  tenantName?: string;
  // 场景码
  // 
  scene?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      pageIndex: 'page_index',
      pageSize: 'page_size',
      tenantName: 'tenant_name',
      scene: 'scene',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      pageIndex: 'number',
      pageSize: 'number',
      tenantName: 'string',
      scene: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequeryAlertStrategyResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 数据
  data?: AlertStrategyPageResponse;
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
      data: AlertStrategyPageResponse,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SyncLabelTransferrawRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 场景码
  // 
  scene: string;
  // 收集标签数据
  collectLabelRawContentList: CollectLabelRawContent[];
  // 业务号
  nonce: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      scene: 'scene',
      collectLabelRawContentList: 'collect_label_raw_content_list',
      nonce: 'nonce',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      scene: 'string',
      collectLabelRawContentList: { 'type': 'array', 'itemType': CollectLabelRawContent },
      nonce: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SyncLabelTransferrawResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 标签上链hash返回
  resultList?: LabelChainResult[];
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
      resultList: { 'type': 'array', 'itemType': LabelChainResult },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SendLabelTransferrawonasyncRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 场景码
  // 
  scene: string;
  // 收集的标签流转数据
  collectLabelRawContentList: CollectLabelRawContent[];
  // 业务号，防重放
  nonce: string;
  // 1 业务端查询结果的最晚时间 2 单位：天，最大值为30 天 3 在responsePeriod 天之后，调用异步接口结果查询 将 无法获取异步接口的执行结果
  responsePeriod: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      scene: 'scene',
      collectLabelRawContentList: 'collect_label_raw_content_list',
      nonce: 'nonce',
      responsePeriod: 'response_period',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      scene: 'string',
      collectLabelRawContentList: { 'type': 'array', 'itemType': CollectLabelRawContent },
      nonce: 'string',
      responsePeriod: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SendLabelTransferrawonasyncResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 接口请求的唯一标识
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

export class QueryDockedDataRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 1. 已对接的接口名 ; 
  // 2. docked_method可通过 实例化SDK中的Request模型后获取，例如：
  // String dockedMethod = new CreateDeviceDatamodelRequest().getMethod();
  dockedMethod: string;
  // 关键key为chainDeviceId 时不填
  scene?: string;
  // 1. 接口中的关键key ，例如 deviceId ；
  // 2. key为chainDeviceId时，scene字段不填
  // 
  key?: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      dockedMethod: 'docked_method',
      scene: 'scene',
      key: 'key',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      dockedMethod: 'string',
      scene: 'string',
      key: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDockedDataResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 1. 根据不同的method返回不同的数据内容
  // 2. markdown格式的内容
  result?: string[];
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
      result: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateDeviceRelationRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 主设备链上id
  subjectChainDeviceId: string;
  // 关系谓语，目前的取值范围：SUB_DEVICE（子设备）
  predicate: string;
  // 关联设备链上id列表
  objectChainDeviceIdList: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      subjectChainDeviceId: 'subject_chain_device_id',
      predicate: 'predicate',
      objectChainDeviceIdList: 'object_chain_device_id_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      subjectChainDeviceId: 'string',
      predicate: 'string',
      objectChainDeviceIdList: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateDeviceRelationResponse extends $tea.Model {
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

export class DeleteDeviceRelationRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 主设备链上id
  subjectChainDeviceId: string;
  // 关系谓语，目前取值范围：SUB_DEVICE（子设备）
  predicate: string;
  // 关联设备链上id
  objectChainDeviceId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      subjectChainDeviceId: 'subject_chain_device_id',
      predicate: 'predicate',
      objectChainDeviceId: 'object_chain_device_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      subjectChainDeviceId: 'string',
      predicate: 'string',
      objectChainDeviceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteDeviceRelationResponse extends $tea.Model {
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

export class PushCollectotBychainidRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链上设备Id
  chainDeviceId: string;
  // 收集数据
  collectContentList: CollectContent[];
  // 随机数，防重放
  nonce: string;
  // 数据模型Id
  dataModelId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      chainDeviceId: 'chain_device_id',
      collectContentList: 'collect_content_list',
      nonce: 'nonce',
      dataModelId: 'data_model_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      chainDeviceId: 'string',
      collectContentList: { 'type': 'array', 'itemType': CollectContent },
      nonce: 'string',
      dataModelId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PushCollectotBychainidResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 推送结果
  pushResult?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      pushResult: 'push_result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      pushResult: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class NotifyPullstrategyChangestatusRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 运营商标识
  operatorId: string;
  // 加密后的核心数据
  data: string;
  // 接口请求时的时间戳信息，格式为yyyyMMddHHmmss
  timeStamp: string;
  // 自增序列，4位自增序列取自时间戳，同一秒内按序列自增长，新秒重计
  seq: string;
  // 参数签名，原文为operatorId+data+timeStamp+seq
  sig: string;
  // 场景码
  scene: string;
  // 数据模型ID，用于校验data原文数据
  dataModelId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      operatorId: 'operator_id',
      data: 'data',
      timeStamp: 'time_stamp',
      seq: 'seq',
      sig: 'sig',
      scene: 'scene',
      dataModelId: 'data_model_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      operatorId: 'string',
      data: 'string',
      timeStamp: 'string',
      seq: 'string',
      sig: 'string',
      scene: 'string',
      dataModelId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class NotifyPullstrategyChangestatusResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回参数密文
  data?: string;
  // 返回消息
  msg?: string;
  // 返回值
  ret?: number;
  // 签名，原文为ret+msg+data密文
  sig?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
      msg: 'msg',
      ret: 'ret',
      sig: 'sig',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: 'string',
      msg: 'string',
      ret: 'number',
      sig: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class NotifyPullstrategyChargeorderinfoRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 运营商标识
  operatorId: string;
  // 加密后的核心数据
  data: string;
  // 接口请求时的时间戳信息，格式为yyyyMMddHHmmss
  timeStamp: string;
  // 自增序列，4位自增序列取自时间戳，同一秒内按序列自增长，新秒重计
  seq: string;
  // 参数签名，原文为operatorId+data+timeStamp+seq
  sig: string;
  // 场景码
  scene: string;
  // 数据模型ID，用于校验data原文数据
  dataModelId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      operatorId: 'operator_id',
      data: 'data',
      timeStamp: 'time_stamp',
      seq: 'seq',
      sig: 'sig',
      scene: 'scene',
      dataModelId: 'data_model_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      operatorId: 'string',
      data: 'string',
      timeStamp: 'string',
      seq: 'string',
      sig: 'string',
      scene: 'string',
      dataModelId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class NotifyPullstrategyChargeorderinfoResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回参数密文
  data?: string;
  // 返回消息
  msg?: string;
  // 返回值
  ret?: number;
  // 签名，原文为ret+msg+data密文
  sig?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
      msg: 'msg',
      ret: 'ret',
      sig: 'sig',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: 'string',
      msg: 'string',
      ret: 'number',
      sig: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryScfleaseEqpinfoRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 请求体
  request: ScfLeaseEqpInfoQueryRequest[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      request: 'request',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      request: { 'type': 'array', 'itemType': ScfLeaseEqpInfoQueryRequest },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryScfleaseEqpinfoResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 查询结果
  result?: ScfLeaseEqpInfo[];
  // 成功/失败
  success?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      result: 'result',
      success: 'success',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      result: { 'type': 'array', 'itemType': ScfLeaseEqpInfo },
      success: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateCustomerEntityRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 场景码，由蚂蚁提供
  scene: string;
  // 实体ID，场景内实体ID需要具有唯一性
  entityId: string;
  // 实体名称, 例如：服务区地理围栏
  entityName: string;
  // 实体内容 , 类型为字符串
  content: string;
  // 实体类别 (枚举) ，由蚂蚁提供 ，例如地理围栏：GEOFENCE
  entityType: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      scene: 'scene',
      entityId: 'entity_id',
      entityName: 'entity_name',
      content: 'content',
      entityType: 'entity_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      scene: 'string',
      entityId: 'string',
      entityName: 'string',
      content: 'string',
      entityType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateCustomerEntityResponse extends $tea.Model {
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

export class UpdateCustomerEntityRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 场景码，由蚂蚁提供
  scene: string;
  // 实体ID
  // 
  entityId: string;
  // 实体名称, 例如：服务区A地理围栏
  entityName: string;
  // 实体内容 , 类型为字符串
  // 
  content: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      scene: 'scene',
      entityId: 'entity_id',
      entityName: 'entity_name',
      content: 'content',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      scene: 'string',
      entityId: 'string',
      entityName: 'string',
      content: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateCustomerEntityResponse extends $tea.Model {
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

export class CreateThingmodelRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 物模型内容（多个物模型功能拼合的json）
  thingModel: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      thingModel: 'thing_model',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      thingModel: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateThingmodelResponse extends $tea.Model {
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

export class QueryThingmodelRequest extends $tea.Model {
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

export class QueryThingmodelResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 租户的物模型内容（多个物模型功能拼合的json）
  thingModel?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      thingModel: 'thing_model',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      thingModel: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateDistributedeviceBydevicemulRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 场景码，由蚂蚁侧定义
  scene: string;
  // 设备注册信息集合, 数组长度不超过50
  deviceParamList: RegByDeviceParm[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      scene: 'scene',
      deviceParamList: 'device_param_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      scene: 'string',
      deviceParamList: { 'type': 'array', 'itemType': RegByDeviceParm },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateDistributedeviceBydevicemulResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 可信设备ID集合
  trustiotDeviceIdList?: TrustiotDeviceIdMap[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      trustiotDeviceIdList: 'trustiot_device_id_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      trustiotDeviceIdList: { 'type': 'array', 'itemType': TrustiotDeviceIdMap },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateDistributedeviceBydeviceidmulRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 场景码
  scene: string;
  // 设备注册信息集合
  deviceParamList: RegByDeviceIdParm[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      scene: 'scene',
      deviceParamList: 'device_param_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      scene: 'string',
      deviceParamList: { 'type': 'array', 'itemType': RegByDeviceIdParm },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateDistributedeviceBydeviceidmulResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 可信设备ID集合
  // 
  trustiotDeviceIdList?: TrustiotDeviceIdMap[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      trustiotDeviceIdList: 'trustiot_device_id_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      trustiotDeviceIdList: { 'type': 'array', 'itemType': TrustiotDeviceIdMap },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BindEntityrelationRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // [主]实体场景码
  subjectScene: string;
  // [主]实体ID（当[主]实体平台唯一ID（subject_trustiot_id）为空时，此项不能为空）
  subjectEntityId?: string;
  // [主]实体平台唯一ID（当[主]实体ID（subject_entity_id）为空时，此项不能为空）
  subjectTrustiotId?: number;
  // 关系谓语, 取值范围：SUB_DEVICE、USER、LOCATION
  predicate: string;
  // [宾]实体类型，取值范围：DEVICE、PERIPHERAL、LABEL、CUSTOMER_ENTITY
  objectEntityType: string;
  // [宾]场景码（当[宾]实体唯一ID为空时，此项必填）
  objectScene?: string;
  // [宾]实体ID（当[宾]实体唯一ID为空时，此项必填）
  objectEntityId?: string;
  // [宾]平台唯一ID，与[宾]实体场景码+[宾]实体ID（object_scene+object_entity_id）不能同时为空
  objectTrustiotId?: number;
  // 绑定请求中，主语或宾语有历史关系，是否删除历史，写入新关系
  // (只处理1对1关系，即生效的前提是{RelationProperty}的maxObjectCount=1 & maxSubjectCount=1)
  upsert: boolean;
  // 备注
  remark?: string;
  // 自定义实体信息（如果object_entity_type=CUSTOMER_ENTITY，则custom_entity_info必填）
  customEntityInfo?: CustomEntityInfo;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      subjectScene: 'subject_scene',
      subjectEntityId: 'subject_entity_id',
      subjectTrustiotId: 'subject_trustiot_id',
      predicate: 'predicate',
      objectEntityType: 'object_entity_type',
      objectScene: 'object_scene',
      objectEntityId: 'object_entity_id',
      objectTrustiotId: 'object_trustiot_id',
      upsert: 'upsert',
      remark: 'remark',
      customEntityInfo: 'custom_entity_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      subjectScene: 'string',
      subjectEntityId: 'string',
      subjectTrustiotId: 'number',
      predicate: 'string',
      objectEntityType: 'string',
      objectScene: 'string',
      objectEntityId: 'string',
      objectTrustiotId: 'number',
      upsert: 'boolean',
      remark: 'string',
      customEntityInfo: CustomEntityInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BindEntityrelationResponse extends $tea.Model {
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

export class UnbindEntityrelationRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // [主]实体场景码
  subjectScene: string;
  // [主]实体ID（当[主]实体平台唯一ID（subject_trustiot_id）为空时，此项不能为空）
  subjectEntityId?: string;
  // [主]实体平台唯一ID（当[主]实体ID（subject_entity_id）为空时，此项不能为空）
  subjectTrustiotId?: number;
  // 关系谓语, 取值范围：SUB_DEVICE、USER、LOCATION
  predicate: string;
  // [宾]实体类型，取值范围：DEVICE、PERIPHERAL、LABEL、CUSTOMER_ENTITY
  objectEntityType: string;
  // [宾]场景码（当[宾]实体唯一ID列表(object_trustiotiot_id_list)为空时，此项必填）
  objectScene?: string;
  // [宾]实体ID列表（当[宾]实体唯一ID列表(object_trustiotiot_id_list)为空时，此项必填）
  // 
  objectEntityIdList?: string[];
  // [宾]实体唯一ID列表,与[宾]实体场景码+[宾]实体ID列表（object_scene+object_entity_id）不能同时为空
  objectTrustiotiotIdList?: number[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      subjectScene: 'subject_scene',
      subjectEntityId: 'subject_entity_id',
      subjectTrustiotId: 'subject_trustiot_id',
      predicate: 'predicate',
      objectEntityType: 'object_entity_type',
      objectScene: 'object_scene',
      objectEntityIdList: 'object_entity_id_list',
      objectTrustiotiotIdList: 'object_trustiotiot_id_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      subjectScene: 'string',
      subjectEntityId: 'string',
      subjectTrustiotId: 'number',
      predicate: 'string',
      objectEntityType: 'string',
      objectScene: 'string',
      objectEntityIdList: { 'type': 'array', 'itemType': 'string' },
      objectTrustiotiotIdList: { 'type': 'array', 'itemType': 'number' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UnbindEntityrelationResponse extends $tea.Model {
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

export class DetailThingmodelDeviceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 场景码
  scene: string;
  // 设备ID（当device_imei号为空时，会根据scene+device_id查询设备记录，获取device_imei）
  deviceId: string;
  // 设备imei号
  deviceImei?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      scene: 'scene',
      deviceId: 'device_id',
      deviceImei: 'device_imei',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      scene: 'string',
      deviceId: 'string',
      deviceImei: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DetailThingmodelDeviceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 设备状态
  status?: string;
  // 设备状态是否可用
  statusAvailable?: boolean;
  // SDK版本号
  sdkVersion?: string;
  // SDK版本号是否可用
  sdkVersionAvailable?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      status: 'status',
      statusAvailable: 'status_available',
      sdkVersion: 'sdk_version',
      sdkVersionAvailable: 'sdk_version_available',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      status: 'string',
      statusAvailable: 'boolean',
      sdkVersion: 'string',
      sdkVersionAvailable: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateCollectorUploadfileurlRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 场景码
  scene: string;
  // 待上传文件的业务类型，
  // 设备心跳数据：COLLECT_MUL
  // 设备业务数据： COLLECT_DEVICE_BIZ_DATA
  dataType: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      scene: 'scene',
      dataType: 'data_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      scene: 'string',
      dataType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateCollectorUploadfileurlResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 可以上传文件的预签名URL
  uploadFileUrl?: string;
  // 上传任务唯一ID，后续流程中会用到
  uploadId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      uploadFileUrl: 'upload_file_url',
      uploadId: 'upload_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      uploadFileUrl: 'string',
      uploadId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ConfirmCollectorUploadfileRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 上报文件任务ID，blockchain.bot.collector.uploadfileurl.create接口中获取
  uploadId: string;
  // 上报数据的总数，用于和CSV文件中的数据进行核验
  total: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      uploadId: 'upload_id',
      total: 'total',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      uploadId: 'string',
      total: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ConfirmCollectorUploadfileResponse extends $tea.Model {
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

export class CreateThingmodelEventRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 物模型事件json
  thingModelEventJson: string;
  // 数据样例
  dataDemo?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      thingModelEventJson: 'thing_model_event_json',
      dataDemo: 'data_demo',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      thingModelEventJson: 'string',
      dataDemo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateThingmodelEventResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 物模型事件ID
  eventId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      eventId: 'event_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      eventId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryThingmodelEventRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 物模型事件ID
  eventId: string;
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

export class QueryThingmodelEventResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 物模型事件json
  // 
  thingModelEventJson?: string;
  // 数据样例
  dataDemo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      thingModelEventJson: 'thing_model_event_json',
      dataDemo: 'data_demo',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      thingModelEventJson: 'string',
      dataDemo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryEntityrelationJtdevicebycarRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 车辆ID： 车辆车牌颜色+车牌号
  deviceId: string;
  // 场景码
  scene: string;
  // 标识设别来源：分为SERVER(服务端)、JT808(部标机设备等)
  fromType?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      deviceId: 'device_id',
      scene: 'scene',
      fromType: 'from_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      deviceId: 'string',
      scene: 'string',
      fromType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryEntityrelationJtdevicebycarResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 车辆关联的部标设备列表
  deviceList?: JtDevice[];
  // 所关联车辆实体信息
  carEntity?: RelatedEntity;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      deviceList: 'device_list',
      carEntity: 'car_entity',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      deviceList: { 'type': 'array', 'itemType': JtDevice },
      carEntity: RelatedEntity,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCollectorJtfluxRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 查询类型，支持LOCATION, TRACE,  ALARM,  REPORT四类
  queryType: string;
  // 查询模式，支持抽样SAMPLE和分页PAGE两类，query_type不是LOCATION时必填
  queryMode?: string;
  // 场景码
  scene: string;
  // 部标设备可信平台唯一ID列表
  trustiotDeviceIdList?: number[];
  // 开始时间，查询TRACE,  ALARM时必填
  startTime?: number;
  // 结束时间，查询TRACE,  ALARM时必填
  endTime?: number;
  // 查询ALARM的类型，默认查全部类型，包括ALARM_BASIC,ALARM_ADAS ,ALARM_DSM,ALARM_ACCELEROMETER四类
  alarmTypes?: string[];
  // 页码
  pageIndex?: number;
  // 单页数量
  pageSize?: number;
  // 告警子类型
  alarmSubTypes?: number[];
  // 设备所关联的related_entity_trustiot_id列表
  relatedEntityList?: number[];
  // 所关联实体类型，传related_entity_list时必填
  relatedEntityType?: string;
  // 报告日期，查询REPORT时必填
  reportDate?: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      queryType: 'query_type',
      queryMode: 'query_mode',
      scene: 'scene',
      trustiotDeviceIdList: 'trustiot_device_id_list',
      startTime: 'start_time',
      endTime: 'end_time',
      alarmTypes: 'alarm_types',
      pageIndex: 'page_index',
      pageSize: 'page_size',
      alarmSubTypes: 'alarm_sub_types',
      relatedEntityList: 'related_entity_list',
      relatedEntityType: 'related_entity_type',
      reportDate: 'report_date',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      queryType: 'string',
      queryMode: 'string',
      scene: 'string',
      trustiotDeviceIdList: { 'type': 'array', 'itemType': 'number' },
      startTime: 'number',
      endTime: 'number',
      alarmTypes: { 'type': 'array', 'itemType': 'string' },
      pageIndex: 'number',
      pageSize: 'number',
      alarmSubTypes: { 'type': 'array', 'itemType': 'number' },
      relatedEntityList: { 'type': 'array', 'itemType': 'number' },
      relatedEntityType: 'string',
      reportDate: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCollectorJtfluxResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 1
  pageIndex?: number;
  // 单页数量
  pageSize?: number;
  // 总记录数
  totalSize?: number;
  // 总页数
  totalPages?: number;
  // 部标数据列表
  pageData?: JtData[];
  // 聚合统计指标
  extraData?: JtExtraData;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      pageIndex: 'page_index',
      pageSize: 'page_size',
      totalSize: 'total_size',
      totalPages: 'total_pages',
      pageData: 'page_data',
      extraData: 'extra_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      pageIndex: 'number',
      pageSize: 'number',
      totalSize: 'number',
      totalPages: 'number',
      pageData: { 'type': 'array', 'itemType': JtData },
      extraData: JtExtraData,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCollectorJtmediaRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 场景码
  scene: string;
  // 异常事件ID，由告警事件标识生成，在blockchain.bot.collector.jtflux.query接口中可获取
  alarmEventId: string;
  // 异常事件媒体文件ID列表
  mediaIdList?: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      scene: 'scene',
      alarmEventId: 'alarm_event_id',
      mediaIdList: 'media_id_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      scene: 'string',
      alarmEventId: 'string',
      mediaIdList: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCollectorJtmediaResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 多媒体文件列表
  mediaList?: JtMedia[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      mediaList: 'media_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      mediaList: { 'type': 'array', 'itemType': JtMedia },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryOnlinepressuretestRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 项目ID
  projectId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      projectId: 'project_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      projectId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryOnlinepressuretestResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 产线压测任务对象
  testTask?: OnlinePressureTestTask;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      testTask: 'test_task',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      testTask: OnlinePressureTestTask,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateOnlinepressuretestRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 产线压测任务对象
  // 
  testTask: OnlinePressureTestTask;
  // 项目ID
  projectId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      testTask: 'test_task',
      projectId: 'project_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      testTask: OnlinePressureTestTask,
      projectId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateOnlinepressuretestResponse extends $tea.Model {
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

export class UpdateOnlinepressuretestCustomerreportRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 联调项目ID
  projectId: string;
  // 客户侧的压测报告
  customerPtReport: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      projectId: 'project_id',
      customerPtReport: 'customer_pt_report',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      projectId: 'string',
      customerPtReport: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateOnlinepressuretestCustomerreportResponse extends $tea.Model {
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

export class QueryThingmodeleventBycustomertenantRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 客户的租户ID
  customerTenant: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      customerTenant: 'customer_tenant',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      customerTenant: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryThingmodeleventBycustomertenantResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 物模型事件列表
  eventList?: ThingModelEventVO[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      eventList: 'event_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      eventList: { 'type': 'array', 'itemType': ThingModelEventVO },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeployThingudfRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // UDF 唯一ID
  udfId: string;
  // 场景码
  scene: string;
  // 物模型功能ID
  featureId: string;
  // 租户ID
  customerTenant: string;
  // UDF类型枚举
  udfType: string;
  // 物模型UDF实例表
  value: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      udfId: 'udf_id',
      scene: 'scene',
      featureId: 'feature_id',
      customerTenant: 'customer_tenant',
      udfType: 'udf_type',
      value: 'value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      udfId: 'string',
      scene: 'string',
      featureId: 'string',
      customerTenant: 'string',
      udfType: 'string',
      value: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeployThingudfResponse extends $tea.Model {
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

export class PagequeryEbikeOperationlogRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 第几页
  pageIndex: number;
  // 单页记录数
  pageSize: number;
  // 开始时间（日志记录的时间）
  startDate: string;
  // 结束时间（日志记录的时间）
  endDate: string;
  // 小程序AppId
  appId?: string;
  // 用户Id
  userId?: string;
  // 用户手机号，当user_id不为空时，该值无效
  userPhone?: string;
  // 设备Id
  deviceId?: string;
  // 操作描述
  operateDesc?: string;
  // 操作是否成功
  success?: boolean;
  // 日志等级（info、warn、error）
  level?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      pageIndex: 'page_index',
      pageSize: 'page_size',
      startDate: 'start_date',
      endDate: 'end_date',
      appId: 'app_id',
      userId: 'user_id',
      userPhone: 'user_phone',
      deviceId: 'device_id',
      operateDesc: 'operate_desc',
      success: 'success',
      level: 'level',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      pageIndex: 'number',
      pageSize: 'number',
      startDate: 'string',
      endDate: 'string',
      appId: 'string',
      userId: 'string',
      userPhone: 'string',
      deviceId: 'string',
      operateDesc: 'string',
      success: 'boolean',
      level: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequeryEbikeOperationlogResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 数据
  data?: EBikeOperationLogPageResponse;
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
      data: EBikeOperationLogPageResponse,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCustomerentityServiceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 场景码
  scene: string;
  // 客户实体id
  entityId: string;
  // 请求客户实体服务类型
  serviceType: string;
  // 查询参数json串
  param?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      scene: 'scene',
      entityId: 'entity_id',
      serviceType: 'service_type',
      param: 'param',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      scene: 'string',
      entityId: 'string',
      serviceType: 'string',
      param: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCustomerentityServiceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回电子围栏 or 路径纠偏处理结果 json字符串
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

export class ApplyTechintegrationSkushipRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 产品型号
  deviceModel: string;
  // 出货数量，上限8
  quota: number;
  // 产品类型
  productType: string;
  // 安全方案
  securityMechanism: string;
  // 证书类型
  certType: string;
  // 凭证种类
  features: string[];
  // 证书拉取任务ID
  taskId?: string;
  // 证书拉取任务批次
  taskBatchNum?: string;
  // 重试标志
  retryFlag?: boolean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      deviceModel: 'device_model',
      quota: 'quota',
      productType: 'product_type',
      securityMechanism: 'security_mechanism',
      certType: 'cert_type',
      features: 'features',
      taskId: 'task_id',
      taskBatchNum: 'task_batch_num',
      retryFlag: 'retry_flag',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      deviceModel: 'string',
      quota: 'number',
      productType: 'string',
      securityMechanism: 'string',
      certType: 'string',
      features: { 'type': 'array', 'itemType': 'string' },
      taskId: 'string',
      taskBatchNum: 'string',
      retryFlag: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyTechintegrationSkushipResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 支付芯证书列表
  data?: string[];
  // 证书拉取任务ID
  taskId?: string;
  // 证书拉取任务批次
  taskBatchNum?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
      taskId: 'task_id',
      taskBatchNum: 'task_batch_num',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: { 'type': 'array', 'itemType': 'string' },
      taskId: 'string',
      taskBatchNum: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyTechintegrationSkushipbyuidRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 产品型号
  deviceModel: string;
  // 产品类型
  productType: string;
  // 安全方案
  // 
  securityMechanism: string;
  // 证书类型
  // 
  certType: string;
  // 凭证种类
  // 
  features: string[];
  // 设备唯一编码类型
  uidType: string;
  // 设备唯一编码值
  uid: string;
  // 场景码
  scene: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      deviceModel: 'device_model',
      productType: 'product_type',
      securityMechanism: 'security_mechanism',
      certType: 'cert_type',
      features: 'features',
      uidType: 'uid_type',
      uid: 'uid',
      scene: 'scene',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      deviceModel: 'string',
      productType: 'string',
      securityMechanism: 'string',
      certType: 'string',
      features: { 'type': 'array', 'itemType': 'string' },
      uidType: 'string',
      uid: 'string',
      scene: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyTechintegrationSkushipbyuidResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 证书字符串
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

export class QueryOnlinepressuretestDataRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 项目ID
  projectId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      projectId: 'project_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      projectId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryOnlinepressuretestDataResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 实体上链数据列表
  entityChainDataList?: EntityChainData[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      entityChainDataList: 'entity_chain_data_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      entityChainDataList: { 'type': 'array', 'itemType': EntityChainData },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecThingServiceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 场景码
  scene: string;
  // 服务标识
  identifier: string;
  // 可信设备唯一ID
  entityIdList: string[];
  // 物模型服务入参
  inputData?: string;
  // 实体类型
  entityType: string;
  // 是否使用trustiotId
  useTrustiotId: boolean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      scene: 'scene',
      identifier: 'identifier',
      entityIdList: 'entity_id_list',
      inputData: 'input_data',
      entityType: 'entity_type',
      useTrustiotId: 'use_trustiot_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      scene: 'string',
      identifier: 'string',
      entityIdList: { 'type': 'array', 'itemType': 'string' },
      inputData: 'string',
      entityType: 'string',
      useTrustiotId: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecThingServiceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 设备返回的数据
  outputdata?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      outputdata: 'outputdata',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      outputdata: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CallbackThingServicebyeventRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 场景码
  scene: string;
  // 业务类型，同一个scene下可以有不同的业务类型，此字段用于区分业务类型
  bizType?: string;
  // 回复日期
  submitDate?: string;
  // 物模型服务回复数据的模型ID
  dataModelId: string;
  // 物模型服务回复数据的内容，格式遵循dataModelId约定的格式
  content: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      scene: 'scene',
      bizType: 'biz_type',
      submitDate: 'submit_date',
      dataModelId: 'data_model_id',
      content: 'content',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      scene: 'string',
      bizType: 'string',
      submitDate: 'string',
      dataModelId: 'string',
      content: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CallbackThingServicebyeventResponse extends $tea.Model {
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

export class ImportTechintegrationSkugrantwhitelistRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 产品型号
  skuModel: string;
  // 产品形态，取值范围：RTOS、TEE、Android
  schemeType: string;
  // 场景码
  scene: string;
  // SN列表，单次最多100条
  snList: string[];
  // 凭证种类列表，取值范围： ["PAYMENT"]：支付码， ["PAYMENT","TRANSIT"]：支付码+乘车码
  features?: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      skuModel: 'sku_model',
      schemeType: 'scheme_type',
      scene: 'scene',
      snList: 'sn_list',
      features: 'features',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      skuModel: 'string',
      schemeType: 'string',
      scene: 'string',
      snList: { 'type': 'array', 'itemType': 'string' },
      features: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ImportTechintegrationSkugrantwhitelistResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 成功导入的sn列表
  successSnList?: string[];
  // 已经存在的sn列表（不会导入）
  existedSnList?: string[];
  // 不合法的sn列表（不会导入）
  invalidSnList?: string[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      successSnList: 'success_sn_list',
      existedSnList: 'existed_sn_list',
      invalidSnList: 'invalid_sn_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      successSnList: { 'type': 'array', 'itemType': 'string' },
      existedSnList: { 'type': 'array', 'itemType': 'string' },
      invalidSnList: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SendThingDataRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 场景码
  scene: string;
  // 上报数据模型ID
  dataModelId: string;
  // 物模型数据集合
  thingDataList: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      scene: 'scene',
      dataModelId: 'data_model_id',
      thingDataList: 'thing_data_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      scene: 'string',
      dataModelId: 'string',
      thingDataList: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SendThingDataResponse extends $tea.Model {
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

export class QueryTechintegrationSkugrantstockinfoRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 产品型号
  productModel?: string;
  // 产品形式，取值范围：
  // SOFTWARE_HARDWARE：软硬一体（SE方案）,
  // SOFTWARE：纯软（非SE方案）
  productForm?: string;
  // 凭证种类列表，取值范围：
  // ["PAYMENT"]：支付码，
  // ["PAYMENT","TRANSIT"]：支付码+乘车码
  features?: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      productModel: 'product_model',
      productForm: 'product_form',
      features: 'features',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      productModel: 'string',
      productForm: 'string',
      features: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTechintegrationSkugrantstockinfoResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 证书授权信息列表
  grantStockInfoList?: SkuGrantStockInfoResp[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      grantStockInfoList: 'grant_stock_info_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      grantStockInfoList: { 'type': 'array', 'itemType': SkuGrantStockInfoResp },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecThingsdidOneapiRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 暂无
  bizContent: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizContent: 'biz_content',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizContent: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecThingsdidOneapiResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 暂无
  rawResponse?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      rawResponse: 'raw_response',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      rawResponse: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class StartEvidenceStoreRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 信物链存证结构体参数
  evidenceStorageReq: EvidenceStorageReq;
  // 输入唯一交易ID序号，客户端管理短时内唯一
  nonce: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      evidenceStorageReq: 'evidence_storage_req',
      nonce: 'nonce',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      evidenceStorageReq: EvidenceStorageReq,
      nonce: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class StartEvidenceStoreResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // API消耗时间（毫秒单位）
  costMillis?: number;
  // 暂保留
  dataIndex?: string;
  // 上链附加备注信息，不做上链存储。
  extInfo?: string;
  // 交易ID，等于输入参数同名字段
  nonce?: string;
  // 本地unix时间戳（毫秒单位）
  timestamp?: number;
  // unix链上存储时间戳
  txTimestamp?: number;
  // 链上交易地址txHash
  txHash?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      costMillis: 'cost_millis',
      dataIndex: 'data_index',
      extInfo: 'ext_info',
      nonce: 'nonce',
      timestamp: 'timestamp',
      txTimestamp: 'tx_timestamp',
      txHash: 'tx_hash',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      costMillis: 'number',
      dataIndex: 'string',
      extInfo: 'string',
      nonce: 'string',
      timestamp: 'number',
      txTimestamp: 'number',
      txHash: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class StartEvidenceQueryRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 信物链单条存证查询请求结构体
  evidenceQueryInfoReq: EvidenceQueryInfoReq;
  // 输入交易唯一ID，短时内唯一
  nonce: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      evidenceQueryInfoReq: 'evidence_query_info_req',
      nonce: 'nonce',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      evidenceQueryInfoReq: EvidenceQueryInfoReq,
      nonce: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class StartEvidenceQueryResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 交易在区块链所在块高度
  blockHeight?: number;
  // API消耗时间（毫秒单位）
  costMillis?: number;
  // 唯一ID，等于输入同名参数
  nonce?: string;
  // unix时间戳(毫秒单位)
  timestamp?: number;
  // 区块链交易地址txHash
  txHash?: string;
  // 交易存储区块链的链上unix时间戳
  txTimestamp?: number;
  // 信物链查询链上获取的数据，参考结构体定义
  data?: EvidenceBaseModel;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      blockHeight: 'block_height',
      costMillis: 'cost_millis',
      nonce: 'nonce',
      timestamp: 'timestamp',
      txHash: 'tx_hash',
      txTimestamp: 'tx_timestamp',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      blockHeight: 'number',
      costMillis: 'number',
      nonce: 'string',
      timestamp: 'number',
      txHash: 'string',
      txTimestamp: 'number',
      data: EvidenceBaseModel,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class StartThingsdidRegisterRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 信物链交易唯一ID，代表需要标识的操作ID
  nonce: string;
  // 注册信物链身份实体请求结构体
  registerReq: ThingsDidRegisterReq;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      nonce: 'nonce',
      registerReq: 'register_req',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      nonce: 'string',
      registerReq: ThingsDidRegisterReq,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class StartThingsdidRegisterResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 代表本操作是否是异步调用
  // true: 执行完全，非异步操作
  // false: 异步执行，需要根据nonce轮训状态
  executed?: boolean;
  // 代表唯一交易ID，等于输入参数同名字段
  nonce?: string;
  // 注册成功返回的实体身份DID
  thingDid?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      executed: 'executed',
      nonce: 'nonce',
      thingDid: 'thing_did',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      executed: 'boolean',
      nonce: 'string',
      thingDid: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryThingsdidAsyncprocessRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 需要查询的实体Did，可为空
  thingDid?: string;
  // 随机数唯一ID, 用以标识智能合约执行的索引交易ID，需要等于需要轮询的API的nonce
  nonce: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      thingDid: 'thing_did',
      nonce: 'nonce',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      thingDid: 'string',
      nonce: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryThingsdidAsyncprocessResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 需要查询的实体Did，可为空
  thingDid?: string;
  // 随机数, 用以标识智能合约执行的索引，等于输入
  nonce?: string;
  // 交易执行当前状态，原始文本，和async_code, async_subcode匹配，将来可能会删除此字段
  asyncStatus?: string;
  // 从智能合约执行返回的结果编码，200成功，其他参考相应文档
  asyncCode?: string;
  // 可为空，代表async_code信息不能表示完整语义时的子结果码
  asyncSubcode?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      thingDid: 'thing_did',
      nonce: 'nonce',
      asyncStatus: 'async_status',
      asyncCode: 'async_code',
      asyncSubcode: 'async_subcode',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      thingDid: 'string',
      nonce: 'string',
      asyncStatus: 'string',
      asyncCode: 'string',
      asyncSubcode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateThingsdidStatusRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 交易唯一ID
  nonce: string;
  // 状态取如下状态，注册设备身份，默认处于STATUS_REGISTERED，
  // 要更新为STATUS_COMMAND_STOP的设备必须处于STATUS_COMMAND_START，
  // 更新为STATUS_COMMAND_UNREGISTER后，无法更新为其他状态。
  // STATUS_COMMAND_UNREGISTER(注销),
  // STATUS_COMMAND_START(启用),
  // STATUS_COMMAND_STOP(),
  // STATUS_REGISTERED(3),
  status: string;
  // 需要更新的实体did
  thingDid: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      nonce: 'nonce',
      status: 'status',
      thingDid: 'thing_did',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      nonce: 'string',
      status: 'string',
      thingDid: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateThingsdidStatusResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 代表本操作是否是异步调用 true: 执行完全，非异步操作...
  executed?: boolean;
  // 代表唯一交易ID，等于输入参数同名字段
  nonce?: string;
  // 注册成功返回的实体身份DID
  thingDid?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      executed: 'executed',
      nonce: 'nonce',
      thingDid: 'thing_did',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      executed: 'boolean',
      nonce: 'string',
      thingDid: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateThingsdidDevicespaceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 参考结构体定义
  updateDeviceSpaceReq: UpdateDeviceSpaceReq;
  // 交易唯一ID
  nonce: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      updateDeviceSpaceReq: 'update_device_space_req',
      nonce: 'nonce',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      updateDeviceSpaceReq: UpdateDeviceSpaceReq,
      nonce: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateThingsdidDevicespaceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 代表本操作是否是异步调用 true: 执行完全，非异步操作
  executed?: boolean;
  // 代表唯一交易ID，等于输入参数同名字段
  nonce?: string;
  // 注册成功返回的实体身份DID
  thingDid?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      executed: 'executed',
      nonce: 'nonce',
      thingDid: 'thing_did',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      executed: 'boolean',
      nonce: 'string',
      thingDid: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryThingsdidDidRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 查询请求结构体，参考结构体定义
  baseQueryReq: DidBaseQueryReq;
  // 唯一交易ID
  nonce: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      baseQueryReq: 'base_query_req',
      nonce: 'nonce',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      baseQueryReq: DidBaseQueryReq,
      nonce: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryThingsdidDidResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 查询请求返回结构体的数组列表，每一个元素对应一个did
  didBaseQueryResp?: DidBaseQueryResp[];
  // 交易唯一ID
  nonce?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      didBaseQueryResp: 'did_base_query_resp',
      nonce: 'nonce',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      didBaseQueryResp: { 'type': 'array', 'itemType': DidBaseQueryResp },
      nonce: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateThingsdidDidRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 参考更新请求结构体
  didUpdateReq: ThingsDidUpdateReq;
  // 交易唯一ID
  nonce: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      didUpdateReq: 'did_update_req',
      nonce: 'nonce',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      didUpdateReq: ThingsDidUpdateReq,
      nonce: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateThingsdidDidResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 更新的实体DID，等于输入
  thingDid?: string;
  // 异步执行标识，true代表已经完成执行，false代表异步返回，需要轮询nonce代表的交易
  executed?: boolean;
  // 交易唯一ID
  nonce?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      thingDid: 'thing_did',
      executed: 'executed',
      nonce: 'nonce',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      thingDid: 'string',
      executed: 'boolean',
      nonce: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class StartTenantBindinfoRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 参考结构体
  bindInfoReq: TenantBindInfoReq;
  // 交易唯一ID
  nonce: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bindInfoReq: 'bind_info_req',
      nonce: 'nonce',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bindInfoReq: TenantBindInfoReq,
      nonce: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class StartTenantBindinfoResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 实体did
  did?: string;
  // 非openapi访问模式https鉴权key_id,  暂保留
  keyId?: string;
  // 非openapi访问模式https鉴权key_secret,  暂保留
  keySecret?: string;
  // 交易唯一ID
  nonce?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      did: 'did',
      keyId: 'key_id',
      keySecret: 'key_secret',
      nonce: 'nonce',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      did: 'string',
      keyId: 'string',
      keySecret: 'string',
      nonce: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateTenantProjectRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 交易唯一ID
  nonce: string;
  // 参考结构体
  projectCreateReq: TenantProjectCreateReq;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      nonce: 'nonce',
      projectCreateReq: 'project_create_req',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      nonce: 'string',
      projectCreateReq: TenantProjectCreateReq,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateTenantProjectResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回租户唯一的项目id，可以用以管理不同业务。
  projectUid?: string;
  // 交易唯一ID
  nonce?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      projectUid: 'project_uid',
      nonce: 'nonce',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      projectUid: 'string',
      nonce: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateThingsdidTenantRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 交易唯一ID
  nonce: string;
  // 实体更新访问权限参与方的请求结构体
  updateTenantReq: DidUpdateTenantReq;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      nonce: 'nonce',
      updateTenantReq: 'update_tenant_req',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      nonce: 'string',
      updateTenantReq: DidUpdateTenantReq,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateThingsdidTenantResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 交易唯一ID，等于输入
  nonce?: string;
  // 代表本操作是否是异步调用 
  // true: 执行完全，非异步操作.
  executed?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      nonce: 'nonce',
      executed: 'executed',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      nonce: 'string',
      executed: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class LoadTsmCertificatetsmRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // certificate
  certificate?: string;
  // BOT
  deviceCode: string;
  // H0
  deviceModel: string;
  // SE
  deviceModule: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      certificate: 'certificate',
      deviceCode: 'device_code',
      deviceModel: 'device_model',
      deviceModule: 'device_module',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      certificate: 'string',
      deviceCode: 'string',
      deviceModel: 'string',
      deviceModule: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class LoadTsmCertificatetsmResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  //  LoadCertificateTSMCmdResponse implements Serializable
  cmdList?: TsmCommonCmd[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      cmdList: 'cmd_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      cmdList: { 'type': 'array', 'itemType': TsmCommonCmd },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class LoadTsmResourcefileRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // BOT
  deviceCode: string;
  // H0
  deviceModel: string;
  // SE
  deviceModule: string;
  // version
  fileVersion?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      deviceCode: 'device_code',
      deviceModel: 'device_model',
      deviceModule: 'device_module',
      fileVersion: 'file_version',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      deviceCode: 'string',
      deviceModel: 'string',
      deviceModule: 'string',
      fileVersion: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class LoadTsmResourcefileResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // appId
  appId?: string;
  // cmd_list
  cmdList?: TsmCommonCmd[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      appId: 'app_id',
      cmdList: 'cmd_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      appId: 'string',
      cmdList: { 'type': 'array', 'itemType': TsmCommonCmd },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class StartTlsnotaryTaskRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 唯一的业务tlsnotary任务id
  taskId: string;
  // 加固文件的oss链接
  ossLink: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      taskId: 'task_id',
      ossLink: 'oss_link',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      taskId: 'string',
      ossLink: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class StartTlsnotaryTaskResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 唯一的业务tlsnotary任务id
  taskId?: string;
  // 业务错误码
  errorCode?: number;
  // 错误信息
  errorMsg?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      taskId: 'task_id',
      errorCode: 'error_code',
      errorMsg: 'error_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      taskId: 'string',
      errorCode: 'number',
      errorMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTlsnotaryTaskRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 唯一的业务 tlsnotary 任务 id
  taskId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      taskId: 'task_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      taskId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTlsnotaryTaskResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 唯一的业务 tlsnotary 任务 id
  taskId?: string;
  // tlsnotary任务执行状态
  state?: number;
  // 上传文件oss链接
  uploadOssLinks?: TlsnotaryUploadOssLinks;
  // 认证签名
  notarySignature?: string;
  // 业务错误码
  errorCode?: number;
  // 业务错误信息
  errorMsg?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      taskId: 'task_id',
      state: 'state',
      uploadOssLinks: 'upload_oss_links',
      notarySignature: 'notary_signature',
      errorCode: 'error_code',
      errorMsg: 'error_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      taskId: 'string',
      state: 'number',
      uploadOssLinks: TlsnotaryUploadOssLinks,
      notarySignature: 'string',
      errorCode: 'number',
      errorMsg: 'string',
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
          sdk_version: "1.11.42",
          _prod_code: "BOT",
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
   * Description: acec提供的SPI服务开通接口
   * Summary: acec提供的SPI服务开通接口
   */
  async openAcecContract(request: OpenAcecContractRequest): Promise<OpenAcecContractResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.openAcecContractEx(request, headers, runtime);
  }

  /**
   * Description: acec提供的SPI服务开通接口
   * Summary: acec提供的SPI服务开通接口
   */
  async openAcecContractEx(request: OpenAcecContractRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<OpenAcecContractResponse> {
    Util.validateModel(request);
    return $tea.cast<OpenAcecContractResponse>(await this.doRequest("1.0", "blockchain.bot.acec.contract.open", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new OpenAcecContractResponse({}));
  }

  /**
   * Description: AI服务组提供的SPI服务停止接口
   * Summary: acec提供的SPI服务停止接口
   */
  async stopAcecContract(request: StopAcecContractRequest): Promise<StopAcecContractResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.stopAcecContractEx(request, headers, runtime);
  }

  /**
   * Description: AI服务组提供的SPI服务停止接口
   * Summary: acec提供的SPI服务停止接口
   */
  async stopAcecContractEx(request: StopAcecContractRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<StopAcecContractResponse> {
    Util.validateModel(request);
    return $tea.cast<StopAcecContractResponse>(await this.doRequest("1.0", "blockchain.bot.acec.contract.stop", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new StopAcecContractResponse({}));
  }

  /**
   * Description: acec提供的SPI服务复入接口
   * Summary: acec提供的SPI服务复入接口
   */
  async resumeAcecContract(request: ResumeAcecContractRequest): Promise<ResumeAcecContractResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.resumeAcecContractEx(request, headers, runtime);
  }

  /**
   * Description: acec提供的SPI服务复入接口
   * Summary: acec提供的SPI服务复入接口
   */
  async resumeAcecContractEx(request: ResumeAcecContractRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ResumeAcecContractResponse> {
    Util.validateModel(request);
    return $tea.cast<ResumeAcecContractResponse>(await this.doRequest("1.0", "blockchain.bot.acec.contract.resume", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ResumeAcecContractResponse({}));
  }

  /**
   * Description: 租赁智能中心实人认证创建服务
   * Summary: 租赁智能中心实人认证创建服务
   */
  async createLeaseRealperson(request: CreateLeaseRealpersonRequest): Promise<CreateLeaseRealpersonResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createLeaseRealpersonEx(request, headers, runtime);
  }

  /**
   * Description: 租赁智能中心实人认证创建服务
   * Summary: 租赁智能中心实人认证创建服务
   */
  async createLeaseRealpersonEx(request: CreateLeaseRealpersonRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateLeaseRealpersonResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateLeaseRealpersonResponse>(await this.doRequest("1.0", "blockchain.bot.lease.realperson.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateLeaseRealpersonResponse({}));
  }

  /**
   * Description: 租赁智能中心实人认证查询服务
   * Summary: 租赁智能中心实人认证查询服务
   */
  async queryLeaseRealperson(request: QueryLeaseRealpersonRequest): Promise<QueryLeaseRealpersonResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryLeaseRealpersonEx(request, headers, runtime);
  }

  /**
   * Description: 租赁智能中心实人认证查询服务
   * Summary: 租赁智能中心实人认证查询服务
   */
  async queryLeaseRealpersonEx(request: QueryLeaseRealpersonRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryLeaseRealpersonResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryLeaseRealpersonResponse>(await this.doRequest("1.0", "blockchain.bot.lease.realperson.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryLeaseRealpersonResponse({}));
  }

  /**
   * Description: 租赁智能中心风控查询服务
   * Summary: 租赁智能中心风控查询服务
   */
  async queryLeaseRisk(request: QueryLeaseRiskRequest): Promise<QueryLeaseRiskResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryLeaseRiskEx(request, headers, runtime);
  }

  /**
   * Description: 租赁智能中心风控查询服务
   * Summary: 租赁智能中心风控查询服务
   */
  async queryLeaseRiskEx(request: QueryLeaseRiskRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryLeaseRiskResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryLeaseRiskResponse>(await this.doRequest("1.0", "blockchain.bot.lease.risk.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryLeaseRiskResponse({}));
  }

  /**
   * Description: aiot-创建用户通行证
   * Summary: aiot-创建用户通行证
   */
  async createXrUserticket(request: CreateXrUserticketRequest): Promise<CreateXrUserticketResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createXrUserticketEx(request, headers, runtime);
  }

  /**
   * Description: aiot-创建用户通行证
   * Summary: aiot-创建用户通行证
   */
  async createXrUserticketEx(request: CreateXrUserticketRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateXrUserticketResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateXrUserticketResponse>(await this.doRequest("1.0", "blockchain.bot.xr.userticket.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateXrUserticketResponse({}));
  }

  /**
   * Description: aiot-获取通行证资源池列表
   * Summary: aiot-获取通行证资源池列表
   */
  async listXrXrticketpool(request: ListXrXrticketpoolRequest): Promise<ListXrXrticketpoolResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listXrXrticketpoolEx(request, headers, runtime);
  }

  /**
   * Description: aiot-获取通行证资源池列表
   * Summary: aiot-获取通行证资源池列表
   */
  async listXrXrticketpoolEx(request: ListXrXrticketpoolRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListXrXrticketpoolResponse> {
    Util.validateModel(request);
    return $tea.cast<ListXrXrticketpoolResponse>(await this.doRequest("1.0", "blockchain.bot.xr.xrticketpool.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListXrXrticketpoolResponse({}));
  }

  /**
   * Description: aiot-分页查询用户通行证
   * Summary: aiot-分页查询用户通行证
   */
  async pagequeryXrUserticket(request: PagequeryXrUserticketRequest): Promise<PagequeryXrUserticketResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pagequeryXrUserticketEx(request, headers, runtime);
  }

  /**
   * Description: aiot-分页查询用户通行证
   * Summary: aiot-分页查询用户通行证
   */
  async pagequeryXrUserticketEx(request: PagequeryXrUserticketRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PagequeryXrUserticketResponse> {
    Util.validateModel(request);
    return $tea.cast<PagequeryXrUserticketResponse>(await this.doRequest("1.0", "blockchain.bot.xr.userticket.pagequery", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PagequeryXrUserticketResponse({}));
  }

  /**
   * Description: aiot-查询用户通行证
   * Summary: aiot-查询用户通行证
   */
  async getXrUserticket(request: GetXrUserticketRequest): Promise<GetXrUserticketResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getXrUserticketEx(request, headers, runtime);
  }

  /**
   * Description: aiot-查询用户通行证
   * Summary: aiot-查询用户通行证
   */
  async getXrUserticketEx(request: GetXrUserticketRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetXrUserticketResponse> {
    Util.validateModel(request);
    return $tea.cast<GetXrUserticketResponse>(await this.doRequest("1.0", "blockchain.bot.xr.userticket.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetXrUserticketResponse({}));
  }

  /**
   * Description: aiot-核销用户通行证
   * Summary: aiot-核销用户通行证
   */
  async operateXrUserticket(request: OperateXrUserticketRequest): Promise<OperateXrUserticketResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.operateXrUserticketEx(request, headers, runtime);
  }

  /**
   * Description: aiot-核销用户通行证
   * Summary: aiot-核销用户通行证
   */
  async operateXrUserticketEx(request: OperateXrUserticketRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<OperateXrUserticketResponse> {
    Util.validateModel(request);
    return $tea.cast<OperateXrUserticketResponse>(await this.doRequest("1.0", "blockchain.bot.xr.userticket.operate", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new OperateXrUserticketResponse({}));
  }

  /**
   * Description: aiot-获取资源列表
   * Summary: aiot-获取资源列表
   */
  async listXrResource(request: ListXrResourceRequest): Promise<ListXrResourceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listXrResourceEx(request, headers, runtime);
  }

  /**
   * Description: aiot-获取资源列表
   * Summary: aiot-获取资源列表
   */
  async listXrResourceEx(request: ListXrResourceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListXrResourceResponse> {
    Util.validateModel(request);
    return $tea.cast<ListXrResourceResponse>(await this.doRequest("1.0", "blockchain.bot.xr.resource.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListXrResourceResponse({}));
  }

  /**
   * Description: aiot-核销实例分页查询
   * Summary: aiot-核销实例分页查询
   */
  async pagequeryXrXrverificationmodel(request: PagequeryXrXrverificationmodelRequest): Promise<PagequeryXrXrverificationmodelResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pagequeryXrXrverificationmodelEx(request, headers, runtime);
  }

  /**
   * Description: aiot-核销实例分页查询
   * Summary: aiot-核销实例分页查询
   */
  async pagequeryXrXrverificationmodelEx(request: PagequeryXrXrverificationmodelRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PagequeryXrXrverificationmodelResponse> {
    Util.validateModel(request);
    return $tea.cast<PagequeryXrXrverificationmodelResponse>(await this.doRequest("1.0", "blockchain.bot.xr.xrverificationmodel.pagequery", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PagequeryXrXrverificationmodelResponse({}));
  }

  /**
   * Description: aiot-客户对应设备分页查询
   * Summary: aiot-客户对应设备分页查询
   */
  async pagequeryXrCustomerdevice(request: PagequeryXrCustomerdeviceRequest): Promise<PagequeryXrCustomerdeviceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pagequeryXrCustomerdeviceEx(request, headers, runtime);
  }

  /**
   * Description: aiot-客户对应设备分页查询
   * Summary: aiot-客户对应设备分页查询
   */
  async pagequeryXrCustomerdeviceEx(request: PagequeryXrCustomerdeviceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PagequeryXrCustomerdeviceResponse> {
    Util.validateModel(request);
    return $tea.cast<PagequeryXrCustomerdeviceResponse>(await this.doRequest("1.0", "blockchain.bot.xr.customerdevice.pagequery", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PagequeryXrCustomerdeviceResponse({}));
  }

  /**
   * Description: aiot-xr通行证创建
   * Summary: aiot-xr通行证创建
   */
  async createXrXrticketpool(request: CreateXrXrticketpoolRequest): Promise<CreateXrXrticketpoolResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createXrXrticketpoolEx(request, headers, runtime);
  }

  /**
   * Description: aiot-xr通行证创建
   * Summary: aiot-xr通行证创建
   */
  async createXrXrticketpoolEx(request: CreateXrXrticketpoolRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateXrXrticketpoolResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateXrXrticketpoolResponse>(await this.doRequest("1.0", "blockchain.bot.xr.xrticketpool.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateXrXrticketpoolResponse({}));
  }

  /**
   * Description: aiot-xr通行证修改
   * Summary: aiot-xr通行证修改
   */
  async updateXrXrticketpool(request: UpdateXrXrticketpoolRequest): Promise<UpdateXrXrticketpoolResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateXrXrticketpoolEx(request, headers, runtime);
  }

  /**
   * Description: aiot-xr通行证修改
   * Summary: aiot-xr通行证修改
   */
  async updateXrXrticketpoolEx(request: UpdateXrXrticketpoolRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateXrXrticketpoolResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateXrXrticketpoolResponse>(await this.doRequest("1.0", "blockchain.bot.xr.xrticketpool.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateXrXrticketpoolResponse({}));
  }

  /**
   * Description: aiot-xr通行证分页查询
   * Summary: aiot-xr通行证分页查询
   */
  async pagequeryXrXrticketpool(request: PagequeryXrXrticketpoolRequest): Promise<PagequeryXrXrticketpoolResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pagequeryXrXrticketpoolEx(request, headers, runtime);
  }

  /**
   * Description: aiot-xr通行证分页查询
   * Summary: aiot-xr通行证分页查询
   */
  async pagequeryXrXrticketpoolEx(request: PagequeryXrXrticketpoolRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PagequeryXrXrticketpoolResponse> {
    Util.validateModel(request);
    return $tea.cast<PagequeryXrXrticketpoolResponse>(await this.doRequest("1.0", "blockchain.bot.xr.xrticketpool.pagequery", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PagequeryXrXrticketpoolResponse({}));
  }

  /**
   * Description: aiot-同步设备屏幕状态
   * Summary: aiot-同步设备屏幕状态
   */
  async syncDeviceScreenstatus(request: SyncDeviceScreenstatusRequest): Promise<SyncDeviceScreenstatusResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.syncDeviceScreenstatusEx(request, headers, runtime);
  }

  /**
   * Description: aiot-同步设备屏幕状态
   * Summary: aiot-同步设备屏幕状态
   */
  async syncDeviceScreenstatusEx(request: SyncDeviceScreenstatusRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SyncDeviceScreenstatusResponse> {
    Util.validateModel(request);
    return $tea.cast<SyncDeviceScreenstatusResponse>(await this.doRequest("1.0", "blockchain.bot.device.screenstatus.sync", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SyncDeviceScreenstatusResponse({}));
  }

  /**
   * Description: xr通行证批量创建
   * Summary: xr通行证批量创建
   */
  async batchcreateXrXrticketpool(request: BatchcreateXrXrticketpoolRequest): Promise<BatchcreateXrXrticketpoolResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.batchcreateXrXrticketpoolEx(request, headers, runtime);
  }

  /**
   * Description: xr通行证批量创建
   * Summary: xr通行证批量创建
   */
  async batchcreateXrXrticketpoolEx(request: BatchcreateXrXrticketpoolRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BatchcreateXrXrticketpoolResponse> {
    Util.validateModel(request);
    return $tea.cast<BatchcreateXrXrticketpoolResponse>(await this.doRequest("1.0", "blockchain.bot.xr.xrticketpool.batchcreate", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BatchcreateXrXrticketpoolResponse({}));
  }

  /**
   * Description: aiot-获取资源实例列表
   * Summary: aiot-获取资源实例列表
   */
  async listXrXrverificationmodelinstance(request: ListXrXrverificationmodelinstanceRequest): Promise<ListXrXrverificationmodelinstanceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listXrXrverificationmodelinstanceEx(request, headers, runtime);
  }

  /**
   * Description: aiot-获取资源实例列表
   * Summary: aiot-获取资源实例列表
   */
  async listXrXrverificationmodelinstanceEx(request: ListXrXrverificationmodelinstanceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListXrXrverificationmodelinstanceResponse> {
    Util.validateModel(request);
    return $tea.cast<ListXrXrverificationmodelinstanceResponse>(await this.doRequest("1.0", "blockchain.bot.xr.xrverificationmodelinstance.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListXrXrverificationmodelinstanceResponse({}));
  }

  /**
   * Description: aiot-xr通行证详情查询
   * Summary: aiot-xr通行证详情查询
   */
  async detailXrXrticketpool(request: DetailXrXrticketpoolRequest): Promise<DetailXrXrticketpoolResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.detailXrXrticketpoolEx(request, headers, runtime);
  }

  /**
   * Description: aiot-xr通行证详情查询
   * Summary: aiot-xr通行证详情查询
   */
  async detailXrXrticketpoolEx(request: DetailXrXrticketpoolRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DetailXrXrticketpoolResponse> {
    Util.validateModel(request);
    return $tea.cast<DetailXrXrticketpoolResponse>(await this.doRequest("1.0", "blockchain.bot.xr.xrticketpool.detail", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DetailXrXrticketpoolResponse({}));
  }

  /**
   * Description: aiotnextbs-openApi操作
   * Summary: aiotnextbs-openApi操作
   */
  async operateAiotnextbsOpenapi(request: OperateAiotnextbsOpenapiRequest): Promise<OperateAiotnextbsOpenapiResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.operateAiotnextbsOpenapiEx(request, headers, runtime);
  }

  /**
   * Description: aiotnextbs-openApi操作
   * Summary: aiotnextbs-openApi操作
   */
  async operateAiotnextbsOpenapiEx(request: OperateAiotnextbsOpenapiRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<OperateAiotnextbsOpenapiResponse> {
    Util.validateModel(request);
    return $tea.cast<OperateAiotnextbsOpenapiResponse>(await this.doRequest("1.0", "blockchain.bot.aiotnextbs.openapi.operate", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new OperateAiotnextbsOpenapiResponse({}));
  }

  /**
   * Description: 私有化配置推送回告API 
   * Summary: 私有化配置推送回告API 
   */
  async finishTraceConfig(request: FinishTraceConfigRequest): Promise<FinishTraceConfigResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.finishTraceConfigEx(request, headers, runtime);
  }

  /**
   * Description: 私有化配置推送回告API 
   * Summary: 私有化配置推送回告API 
   */
  async finishTraceConfigEx(request: FinishTraceConfigRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<FinishTraceConfigResponse> {
    Util.validateModel(request);
    return $tea.cast<FinishTraceConfigResponse>(await this.doRequest("1.0", "blockchain.bot.trace.config.finish", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new FinishTraceConfigResponse({}));
  }

  /**
   * Description: BAI提供的OCR服务接口
   * Summary: BAI提供的OCR服务
   */
  async queryBaiOcr(request: QueryBaiOcrRequest): Promise<QueryBaiOcrResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryBaiOcrEx(request, headers, runtime);
  }

  /**
   * Description: BAI提供的OCR服务接口
   * Summary: BAI提供的OCR服务
   */
  async queryBaiOcrEx(request: QueryBaiOcrRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryBaiOcrResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryBaiOcrResponse>(await this.doRequest("1.0", "blockchain.bot.bai.ocr.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryBaiOcrResponse({}));
  }

  /**
   * Description: AI二维码验真
   * Summary: AI二维码验真
   */
  async queryAiidentificationQrcode(request: QueryAiidentificationQrcodeRequest): Promise<QueryAiidentificationQrcodeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAiidentificationQrcodeEx(request, headers, runtime);
  }

  /**
   * Description: AI二维码验真
   * Summary: AI二维码验真
   */
  async queryAiidentificationQrcodeEx(request: QueryAiidentificationQrcodeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAiidentificationQrcodeResponse> {
    if (!Util.isUnset(request.fileObject)) {
      let uploadReq = new CreateAntcloudGatewayxFileUploadRequest({
        authToken: request.authToken,
        apiCode: "blockchain.bot.aiidentification.qrcode.query",
        fileName: request.fileObjectName,
      });
      let uploadResp = await this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
      if (!AntchainUtil.isSuccess(uploadResp.resultCode, "ok")) {
        let queryAiidentificationQrcodeResponse = new QueryAiidentificationQrcodeResponse({
          reqMsgId: uploadResp.reqMsgId,
          resultCode: uploadResp.resultCode,
          resultMsg: uploadResp.resultMsg,
        });
        return queryAiidentificationQrcodeResponse;
      }

      let uploadHeaders = AntchainUtil.parseUploadHeaders(uploadResp.uploadHeaders);
      await AntchainUtil.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
      request.fileId = uploadResp.fileId;
    }

    Util.validateModel(request);
    return $tea.cast<QueryAiidentificationQrcodeResponse>(await this.doRequest("1.0", "blockchain.bot.aiidentification.qrcode.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAiidentificationQrcodeResponse({}));
  }

  /**
   * Description: AI商品鉴定
   * Summary: AI商品鉴定
   */
  async queryAiidentificationGoods(request: QueryAiidentificationGoodsRequest): Promise<QueryAiidentificationGoodsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAiidentificationGoodsEx(request, headers, runtime);
  }

  /**
   * Description: AI商品鉴定
   * Summary: AI商品鉴定
   */
  async queryAiidentificationGoodsEx(request: QueryAiidentificationGoodsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAiidentificationGoodsResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAiidentificationGoodsResponse>(await this.doRequest("1.0", "blockchain.bot.aiidentification.goods.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAiidentificationGoodsResponse({}));
  }

  /**
   * Description: 商品鉴定点图片检测
   * Summary: 商品鉴定点图片检测
   */
  async checkAiidentificationGoodspoint(request: CheckAiidentificationGoodspointRequest): Promise<CheckAiidentificationGoodspointResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.checkAiidentificationGoodspointEx(request, headers, runtime);
  }

  /**
   * Description: 商品鉴定点图片检测
   * Summary: 商品鉴定点图片检测
   */
  async checkAiidentificationGoodspointEx(request: CheckAiidentificationGoodspointRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CheckAiidentificationGoodspointResponse> {
    Util.validateModel(request);
    return $tea.cast<CheckAiidentificationGoodspointResponse>(await this.doRequest("1.0", "blockchain.bot.aiidentification.goodspoint.check", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CheckAiidentificationGoodspointResponse({}));
  }

  /**
   * Description: 溯源码比对服务
   * Summary: AI溯源码验真
   */
  async checkAiidentificationQrcode(request: CheckAiidentificationQrcodeRequest): Promise<CheckAiidentificationQrcodeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.checkAiidentificationQrcodeEx(request, headers, runtime);
  }

  /**
   * Description: 溯源码比对服务
   * Summary: AI溯源码验真
   */
  async checkAiidentificationQrcodeEx(request: CheckAiidentificationQrcodeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CheckAiidentificationQrcodeResponse> {
    Util.validateModel(request);
    return $tea.cast<CheckAiidentificationQrcodeResponse>(await this.doRequest("1.0", "blockchain.bot.aiidentification.qrcode.check", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CheckAiidentificationQrcodeResponse({}));
  }

  /**
   * Description: 用于生成溯源防伪码
   * Summary: 溯源防伪码生成接口
   */
  async createAiidentificationQrcode(request: CreateAiidentificationQrcodeRequest): Promise<CreateAiidentificationQrcodeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createAiidentificationQrcodeEx(request, headers, runtime);
  }

  /**
   * Description: 用于生成溯源防伪码
   * Summary: 溯源防伪码生成接口
   */
  async createAiidentificationQrcodeEx(request: CreateAiidentificationQrcodeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateAiidentificationQrcodeResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateAiidentificationQrcodeResponse>(await this.doRequest("1.0", "blockchain.bot.aiidentification.qrcode.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateAiidentificationQrcodeResponse({}));
  }

  /**
   * Description: B端二维码质检
   * Summary: B端二维码质检
   */
  async verifyAiidentificationQrcode(request: VerifyAiidentificationQrcodeRequest): Promise<VerifyAiidentificationQrcodeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.verifyAiidentificationQrcodeEx(request, headers, runtime);
  }

  /**
   * Description: B端二维码质检
   * Summary: B端二维码质检
   */
  async verifyAiidentificationQrcodeEx(request: VerifyAiidentificationQrcodeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<VerifyAiidentificationQrcodeResponse> {
    Util.validateModel(request);
    return $tea.cast<VerifyAiidentificationQrcodeResponse>(await this.doRequest("1.0", "blockchain.bot.aiidentification.qrcode.verify", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new VerifyAiidentificationQrcodeResponse({}));
  }

  /**
   * Description: 商品鉴定
   * Summary: 商品鉴定
   */
  async queryAiidentificationGoodspoint(request: QueryAiidentificationGoodspointRequest): Promise<QueryAiidentificationGoodspointResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAiidentificationGoodspointEx(request, headers, runtime);
  }

  /**
   * Description: 商品鉴定
   * Summary: 商品鉴定
   */
  async queryAiidentificationGoodspointEx(request: QueryAiidentificationGoodspointRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAiidentificationGoodspointResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAiidentificationGoodspointResponse>(await this.doRequest("1.0", "blockchain.bot.aiidentification.goodspoint.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAiidentificationGoodspointResponse({}));
  }

  /**
   * Description: AI商品数字指纹注册
   * Summary: AI数字指纹注册
   */
  async registerAiidentificationGoodsdigitalfingerprint(request: RegisterAiidentificationGoodsdigitalfingerprintRequest): Promise<RegisterAiidentificationGoodsdigitalfingerprintResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.registerAiidentificationGoodsdigitalfingerprintEx(request, headers, runtime);
  }

  /**
   * Description: AI商品数字指纹注册
   * Summary: AI数字指纹注册
   */
  async registerAiidentificationGoodsdigitalfingerprintEx(request: RegisterAiidentificationGoodsdigitalfingerprintRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<RegisterAiidentificationGoodsdigitalfingerprintResponse> {
    Util.validateModel(request);
    return $tea.cast<RegisterAiidentificationGoodsdigitalfingerprintResponse>(await this.doRequest("1.0", "blockchain.bot.aiidentification.goodsdigitalfingerprint.register", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new RegisterAiidentificationGoodsdigitalfingerprintResponse({}));
  }

  /**
   * Description: AI商品数字指纹鉴定
   * Summary: AI商品数字指纹鉴定
   */
  async checkAiidentificationGoodsdigitalfingerprint(request: CheckAiidentificationGoodsdigitalfingerprintRequest): Promise<CheckAiidentificationGoodsdigitalfingerprintResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.checkAiidentificationGoodsdigitalfingerprintEx(request, headers, runtime);
  }

  /**
   * Description: AI商品数字指纹鉴定
   * Summary: AI商品数字指纹鉴定
   */
  async checkAiidentificationGoodsdigitalfingerprintEx(request: CheckAiidentificationGoodsdigitalfingerprintRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CheckAiidentificationGoodsdigitalfingerprintResponse> {
    Util.validateModel(request);
    return $tea.cast<CheckAiidentificationGoodsdigitalfingerprintResponse>(await this.doRequest("1.0", "blockchain.bot.aiidentification.goodsdigitalfingerprint.check", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CheckAiidentificationGoodsdigitalfingerprintResponse({}));
  }

  /**
   * Description: 识别票据上的二维码
   * Summary: AI二维码识别
   */
  async getAiidentificationQrcode(request: GetAiidentificationQrcodeRequest): Promise<GetAiidentificationQrcodeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getAiidentificationQrcodeEx(request, headers, runtime);
  }

  /**
   * Description: 识别票据上的二维码
   * Summary: AI二维码识别
   */
  async getAiidentificationQrcodeEx(request: GetAiidentificationQrcodeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetAiidentificationQrcodeResponse> {
    Util.validateModel(request);
    return $tea.cast<GetAiidentificationQrcodeResponse>(await this.doRequest("1.0", "blockchain.bot.aiidentification.qrcode.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetAiidentificationQrcodeResponse({}));
  }

  /**
   * Description: biot 私有化 设备注册接口
   * Summary: biot 私有化 设备注册接口
   */
  async createAcsDevice(request: CreateAcsDeviceRequest): Promise<CreateAcsDeviceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createAcsDeviceEx(request, headers, runtime);
  }

  /**
   * Description: biot 私有化 设备注册接口
   * Summary: biot 私有化 设备注册接口
   */
  async createAcsDeviceEx(request: CreateAcsDeviceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateAcsDeviceResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateAcsDeviceResponse>(await this.doRequest("1.0", "blockchain.bot.acs.device.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateAcsDeviceResponse({}));
  }

  /**
   * Description: biot 私有化 业务数据上报
   * Summary: biot 私有化 业务数据上报
   */
  async sendAcsCollector(request: SendAcsCollectorRequest): Promise<SendAcsCollectorResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.sendAcsCollectorEx(request, headers, runtime);
  }

  /**
   * Description: biot 私有化 业务数据上报
   * Summary: biot 私有化 业务数据上报
   */
  async sendAcsCollectorEx(request: SendAcsCollectorRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SendAcsCollectorResponse> {
    Util.validateModel(request);
    return $tea.cast<SendAcsCollectorResponse>(await this.doRequest("1.0", "blockchain.bot.acs.collector.send", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SendAcsCollectorResponse({}));
  }

  /**
   * Description: 提供设备基础信息查询服务
   * Summary: IoT设备平台-设备查询
   */
  async queryIotbasicDevice(request: QueryIotbasicDeviceRequest): Promise<QueryIotbasicDeviceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryIotbasicDeviceEx(request, headers, runtime);
  }

  /**
   * Description: 提供设备基础信息查询服务
   * Summary: IoT设备平台-设备查询
   */
  async queryIotbasicDeviceEx(request: QueryIotbasicDeviceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryIotbasicDeviceResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryIotbasicDeviceResponse>(await this.doRequest("1.0", "blockchain.bot.iotbasic.device.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryIotbasicDeviceResponse({}));
  }

  /**
   * Description: IoT产品开通状态查询
   * Summary: IoT产品开通状态查询
   */
  async recognizeIotbasicCustomer(request: RecognizeIotbasicCustomerRequest): Promise<RecognizeIotbasicCustomerResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.recognizeIotbasicCustomerEx(request, headers, runtime);
  }

  /**
   * Description: IoT产品开通状态查询
   * Summary: IoT产品开通状态查询
   */
  async recognizeIotbasicCustomerEx(request: RecognizeIotbasicCustomerRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<RecognizeIotbasicCustomerResponse> {
    Util.validateModel(request);
    return $tea.cast<RecognizeIotbasicCustomerResponse>(await this.doRequest("1.0", "blockchain.bot.iotbasic.customer.recognize", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new RecognizeIotbasicCustomerResponse({}));
  }

  /**
   * Description: IoT设备平台-设备认证
   * Summary: IoT设备平台-设备认证
   */
  async certifyIotbasicDevice(request: CertifyIotbasicDeviceRequest): Promise<CertifyIotbasicDeviceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.certifyIotbasicDeviceEx(request, headers, runtime);
  }

  /**
   * Description: IoT设备平台-设备认证
   * Summary: IoT设备平台-设备认证
   */
  async certifyIotbasicDeviceEx(request: CertifyIotbasicDeviceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CertifyIotbasicDeviceResponse> {
    Util.validateModel(request);
    return $tea.cast<CertifyIotbasicDeviceResponse>(await this.doRequest("1.0", "blockchain.bot.iotbasic.device.certify", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CertifyIotbasicDeviceResponse({}));
  }

  /**
   * Description: iot平台用户注册操作，新增用户，删除用户，绑定角色等操作
   * Summary: iot平台用户注册操作
   */
  async operateIotbasicUser(request: OperateIotbasicUserRequest): Promise<OperateIotbasicUserResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.operateIotbasicUserEx(request, headers, runtime);
  }

  /**
   * Description: iot平台用户注册操作，新增用户，删除用户，绑定角色等操作
   * Summary: iot平台用户注册操作
   */
  async operateIotbasicUserEx(request: OperateIotbasicUserRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<OperateIotbasicUserResponse> {
    Util.validateModel(request);
    return $tea.cast<OperateIotbasicUserResponse>(await this.doRequest("1.0", "blockchain.bot.iotbasic.user.operate", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new OperateIotbasicUserResponse({}));
  }

  /**
   * Description: iot 平台权限操作
   * Summary: iot 平台权限操作
   */
  async operateIotbasicPermission(request: OperateIotbasicPermissionRequest): Promise<OperateIotbasicPermissionResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.operateIotbasicPermissionEx(request, headers, runtime);
  }

  /**
   * Description: iot 平台权限操作
   * Summary: iot 平台权限操作
   */
  async operateIotbasicPermissionEx(request: OperateIotbasicPermissionRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<OperateIotbasicPermissionResponse> {
    Util.validateModel(request);
    return $tea.cast<OperateIotbasicPermissionResponse>(await this.doRequest("1.0", "blockchain.bot.iotbasic.permission.operate", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new OperateIotbasicPermissionResponse({}));
  }

  /**
   * Description: IoT设备平台-设备sn列表查询
   * Summary: IoT设备平台-设备sn列表查询
   */
  async queryIotbasicSn(request: QueryIotbasicSnRequest): Promise<QueryIotbasicSnResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryIotbasicSnEx(request, headers, runtime);
  }

  /**
   * Description: IoT设备平台-设备sn列表查询
   * Summary: IoT设备平台-设备sn列表查询
   */
  async queryIotbasicSnEx(request: QueryIotbasicSnRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryIotbasicSnResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryIotbasicSnResponse>(await this.doRequest("1.0", "blockchain.bot.iotbasic.sn.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryIotbasicSnResponse({}));
  }

  /**
   * Description: IoT设备平台-设备规格查询
   * Summary: IoT设备平台-设备规格查询
   */
  async queryDeviceSpecs(request: QueryDeviceSpecsRequest): Promise<QueryDeviceSpecsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryDeviceSpecsEx(request, headers, runtime);
  }

  /**
   * Description: IoT设备平台-设备规格查询
   * Summary: IoT设备平台-设备规格查询
   */
  async queryDeviceSpecsEx(request: QueryDeviceSpecsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryDeviceSpecsResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDeviceSpecsResponse>(await this.doRequest("1.0", "blockchain.bot.device.specs.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryDeviceSpecsResponse({}));
  }

  /**
   * Description: IoT设备平台-设备规格关系维护
   * Summary: IoT设备平台-设备规格关系维护
   */
  async operateIotbasicRelration(request: OperateIotbasicRelrationRequest): Promise<OperateIotbasicRelrationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.operateIotbasicRelrationEx(request, headers, runtime);
  }

  /**
   * Description: IoT设备平台-设备规格关系维护
   * Summary: IoT设备平台-设备规格关系维护
   */
  async operateIotbasicRelrationEx(request: OperateIotbasicRelrationRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<OperateIotbasicRelrationResponse> {
    Util.validateModel(request);
    return $tea.cast<OperateIotbasicRelrationResponse>(await this.doRequest("1.0", "blockchain.bot.iotbasic.relration.operate", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new OperateIotbasicRelrationResponse({}));
  }

  /**
   * Description: IoT设备平台-设备字典数据维护
   * Summary: IoT设备平台-设备字典数据维护
   */
  async operateIotbasicDictionary(request: OperateIotbasicDictionaryRequest): Promise<OperateIotbasicDictionaryResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.operateIotbasicDictionaryEx(request, headers, runtime);
  }

  /**
   * Description: IoT设备平台-设备字典数据维护
   * Summary: IoT设备平台-设备字典数据维护
   */
  async operateIotbasicDictionaryEx(request: OperateIotbasicDictionaryRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<OperateIotbasicDictionaryResponse> {
    Util.validateModel(request);
    return $tea.cast<OperateIotbasicDictionaryResponse>(await this.doRequest("1.0", "blockchain.bot.iotbasic.dictionary.operate", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new OperateIotbasicDictionaryResponse({}));
  }

  /**
   * Description: IoT设备平台-设备品类数据维护
   * Summary: IoT设备平台-设备品类数据维护
   */
  async operateIotbasicCategory(request: OperateIotbasicCategoryRequest): Promise<OperateIotbasicCategoryResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.operateIotbasicCategoryEx(request, headers, runtime);
  }

  /**
   * Description: IoT设备平台-设备品类数据维护
   * Summary: IoT设备平台-设备品类数据维护
   */
  async operateIotbasicCategoryEx(request: OperateIotbasicCategoryRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<OperateIotbasicCategoryResponse> {
    Util.validateModel(request);
    return $tea.cast<OperateIotbasicCategoryResponse>(await this.doRequest("1.0", "blockchain.bot.iotbasic.category.operate", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new OperateIotbasicCategoryResponse({}));
  }

  /**
   * Description: IoT设备平台-设备管控配置维护
   * Summary: IoT设备平台-设备管控配置维护
   */
  async operateIotbasicControlconfig(request: OperateIotbasicControlconfigRequest): Promise<OperateIotbasicControlconfigResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.operateIotbasicControlconfigEx(request, headers, runtime);
  }

  /**
   * Description: IoT设备平台-设备管控配置维护
   * Summary: IoT设备平台-设备管控配置维护
   */
  async operateIotbasicControlconfigEx(request: OperateIotbasicControlconfigRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<OperateIotbasicControlconfigResponse> {
    Util.validateModel(request);
    return $tea.cast<OperateIotbasicControlconfigResponse>(await this.doRequest("1.0", "blockchain.bot.iotbasic.controlconfig.operate", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new OperateIotbasicControlconfigResponse({}));
  }

  /**
   * Description: IoT设备平台-上链业务模型配置维护
   * Summary: IoT设备平台-上链业务模型配置维护
   */
  async operateIotbasicChainmodel(request: OperateIotbasicChainmodelRequest): Promise<OperateIotbasicChainmodelResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.operateIotbasicChainmodelEx(request, headers, runtime);
  }

  /**
   * Description: IoT设备平台-上链业务模型配置维护
   * Summary: IoT设备平台-上链业务模型配置维护
   */
  async operateIotbasicChainmodelEx(request: OperateIotbasicChainmodelRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<OperateIotbasicChainmodelResponse> {
    Util.validateModel(request);
    return $tea.cast<OperateIotbasicChainmodelResponse>(await this.doRequest("1.0", "blockchain.bot.iotbasic.chainmodel.operate", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new OperateIotbasicChainmodelResponse({}));
  }

  /**
   * Description: IoT设备平台-设备不可操作标记更新
   * Summary: IoT设备平台-设备不可操作标记更新
   */
  async operateIotbasicDevice(request: OperateIotbasicDeviceRequest): Promise<OperateIotbasicDeviceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.operateIotbasicDeviceEx(request, headers, runtime);
  }

  /**
   * Description: IoT设备平台-设备不可操作标记更新
   * Summary: IoT设备平台-设备不可操作标记更新
   */
  async operateIotbasicDeviceEx(request: OperateIotbasicDeviceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<OperateIotbasicDeviceResponse> {
    Util.validateModel(request);
    return $tea.cast<OperateIotbasicDeviceResponse>(await this.doRequest("1.0", "blockchain.bot.iotbasic.device.operate", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new OperateIotbasicDeviceResponse({}));
  }

  /**
   * Description: biot设备注册-创建设备
   * Summary: biot设备注册-创建设备
   */
  async createIotbasicDevice(request: CreateIotbasicDeviceRequest): Promise<CreateIotbasicDeviceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createIotbasicDeviceEx(request, headers, runtime);
  }

  /**
   * Description: biot设备注册-创建设备
   * Summary: biot设备注册-创建设备
   */
  async createIotbasicDeviceEx(request: CreateIotbasicDeviceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateIotbasicDeviceResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateIotbasicDeviceResponse>(await this.doRequest("1.0", "blockchain.bot.iotbasic.device.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateIotbasicDeviceResponse({}));
  }

  /**
   * Description: biot设备注册-批量创建设备
   * Summary: biot设备注册-批量创建设备
   */
  async batchcreateIotbasicDevice(request: BatchcreateIotbasicDeviceRequest): Promise<BatchcreateIotbasicDeviceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.batchcreateIotbasicDeviceEx(request, headers, runtime);
  }

  /**
   * Description: biot设备注册-批量创建设备
   * Summary: biot设备注册-批量创建设备
   */
  async batchcreateIotbasicDeviceEx(request: BatchcreateIotbasicDeviceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BatchcreateIotbasicDeviceResponse> {
    Util.validateModel(request);
    return $tea.cast<BatchcreateIotbasicDeviceResponse>(await this.doRequest("1.0", "blockchain.bot.iotbasic.device.batchcreate", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BatchcreateIotbasicDeviceResponse({}));
  }

  /**
   * Description: biot设备状态同步
   * Summary: iot平台-设备状态同步
   */
  async syncIotbasicDevicestatus(request: SyncIotbasicDevicestatusRequest): Promise<SyncIotbasicDevicestatusResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.syncIotbasicDevicestatusEx(request, headers, runtime);
  }

  /**
   * Description: biot设备状态同步
   * Summary: iot平台-设备状态同步
   */
  async syncIotbasicDevicestatusEx(request: SyncIotbasicDevicestatusRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SyncIotbasicDevicestatusResponse> {
    Util.validateModel(request);
    return $tea.cast<SyncIotbasicDevicestatusResponse>(await this.doRequest("1.0", "blockchain.bot.iotbasic.devicestatus.sync", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SyncIotbasicDevicestatusResponse({}));
  }

  /**
   * Description: biot设备-安全认证
   * Summary: biot设备-安全认证
   */
  async verifyIotbasicIdentify(request: VerifyIotbasicIdentifyRequest): Promise<VerifyIotbasicIdentifyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.verifyIotbasicIdentifyEx(request, headers, runtime);
  }

  /**
   * Description: biot设备-安全认证
   * Summary: biot设备-安全认证
   */
  async verifyIotbasicIdentifyEx(request: VerifyIotbasicIdentifyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<VerifyIotbasicIdentifyResponse> {
    Util.validateModel(request);
    return $tea.cast<VerifyIotbasicIdentifyResponse>(await this.doRequest("1.0", "blockchain.bot.iotbasic.identify.verify", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new VerifyIotbasicIdentifyResponse({}));
  }

  /**
   * Description: IoT设备平台-更新设备信息
   * Summary: IoT设备平台-更新设备信息
   */
  async updateIotbasicDevice(request: UpdateIotbasicDeviceRequest): Promise<UpdateIotbasicDeviceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateIotbasicDeviceEx(request, headers, runtime);
  }

  /**
   * Description: IoT设备平台-更新设备信息
   * Summary: IoT设备平台-更新设备信息
   */
  async updateIotbasicDeviceEx(request: UpdateIotbasicDeviceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateIotbasicDeviceResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateIotbasicDeviceResponse>(await this.doRequest("1.0", "blockchain.bot.iotbasic.device.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateIotbasicDeviceResponse({}));
  }

  /**
   * Description: IoT设备平台-设备上链
   * Summary: IoT设备平台-设备上链
   */
  async operateIotbasicDevicecollect(request: OperateIotbasicDevicecollectRequest): Promise<OperateIotbasicDevicecollectResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.operateIotbasicDevicecollectEx(request, headers, runtime);
  }

  /**
   * Description: IoT设备平台-设备上链
   * Summary: IoT设备平台-设备上链
   */
  async operateIotbasicDevicecollectEx(request: OperateIotbasicDevicecollectRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<OperateIotbasicDevicecollectResponse> {
    Util.validateModel(request);
    return $tea.cast<OperateIotbasicDevicecollectResponse>(await this.doRequest("1.0", "blockchain.bot.iotbasic.devicecollect.operate", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new OperateIotbasicDevicecollectResponse({}));
  }

  /**
   * Description: IoT设备平台-项目空间数据维护
   * Summary: IoT设备平台-项目空间数据维护
   */
  async operateIotbasicProjectspace(request: OperateIotbasicProjectspaceRequest): Promise<OperateIotbasicProjectspaceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.operateIotbasicProjectspaceEx(request, headers, runtime);
  }

  /**
   * Description: IoT设备平台-项目空间数据维护
   * Summary: IoT设备平台-项目空间数据维护
   */
  async operateIotbasicProjectspaceEx(request: OperateIotbasicProjectspaceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<OperateIotbasicProjectspaceResponse> {
    Util.validateModel(request);
    return $tea.cast<OperateIotbasicProjectspaceResponse>(await this.doRequest("1.0", "blockchain.bot.iotbasic.projectspace.operate", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new OperateIotbasicProjectspaceResponse({}));
  }

  /**
   * Description: 租房saas-企业信息同步(个人房东)
   * Summary: 租房saas-企业信息同步(个人房东)
   */
  async pushRentMerchant(request: PushRentMerchantRequest): Promise<PushRentMerchantResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pushRentMerchantEx(request, headers, runtime);
  }

  /**
   * Description: 租房saas-企业信息同步(个人房东)
   * Summary: 租房saas-企业信息同步(个人房东)
   */
  async pushRentMerchantEx(request: PushRentMerchantRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PushRentMerchantResponse> {
    Util.validateModel(request);
    return $tea.cast<PushRentMerchantResponse>(await this.doRequest("1.0", "blockchain.bot.rent.merchant.push", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PushRentMerchantResponse({}));
  }

  /**
   * Description: 租房saas-业主账单信息同步
   * Summary: 租房saas-业主账单信息同步
   */
  async pushRentBill(request: PushRentBillRequest): Promise<PushRentBillResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pushRentBillEx(request, headers, runtime);
  }

  /**
   * Description: 租房saas-业主账单信息同步
   * Summary: 租房saas-业主账单信息同步
   */
  async pushRentBillEx(request: PushRentBillRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PushRentBillResponse> {
    Util.validateModel(request);
    return $tea.cast<PushRentBillResponse>(await this.doRequest("1.0", "blockchain.bot.rent.bill.push", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PushRentBillResponse({}));
  }

  /**
   * Description: 租房saas-租客入住信息同步
   * Summary: 租房saas-租客入住信息同步
   */
  async pushRentRenter(request: PushRentRenterRequest): Promise<PushRentRenterResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pushRentRenterEx(request, headers, runtime);
  }

  /**
   * Description: 租房saas-租客入住信息同步
   * Summary: 租房saas-租客入住信息同步
   */
  async pushRentRenterEx(request: PushRentRenterRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PushRentRenterResponse> {
    Util.validateModel(request);
    return $tea.cast<PushRentRenterResponse>(await this.doRequest("1.0", "blockchain.bot.rent.renter.push", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PushRentRenterResponse({}));
  }

  /**
   * Description: 租房saas-租金缴纳支付状态通知
   * Summary: 租房saas-租金缴纳支付状态通知
   */
  async syncRentRentpayment(request: SyncRentRentpaymentRequest): Promise<SyncRentRentpaymentResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.syncRentRentpaymentEx(request, headers, runtime);
  }

  /**
   * Description: 租房saas-租金缴纳支付状态通知
   * Summary: 租房saas-租金缴纳支付状态通知
   */
  async syncRentRentpaymentEx(request: SyncRentRentpaymentRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SyncRentRentpaymentResponse> {
    Util.validateModel(request);
    return $tea.cast<SyncRentRentpaymentResponse>(await this.doRequest("1.0", "blockchain.bot.rent.rentpayment.sync", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SyncRentRentpaymentResponse({}));
  }

  /**
   * Description: 租房saas-房源信息同步
   * Summary: 租房saas-房源信息同步
   */
  async pushRentHouse(request: PushRentHouseRequest): Promise<PushRentHouseResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pushRentHouseEx(request, headers, runtime);
  }

  /**
   * Description: 租房saas-房源信息同步
   * Summary: 租房saas-房源信息同步
   */
  async pushRentHouseEx(request: PushRentHouseRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PushRentHouseResponse> {
    Util.validateModel(request);
    return $tea.cast<PushRentHouseResponse>(await this.doRequest("1.0", "blockchain.bot.rent.house.push", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PushRentHouseResponse({}));
  }

  /**
   * Description: IoT设备平台-生成设备认证密钥
   * Summary: IoT设备平台-生成设备认证密钥
   */
  async syncIotbasicDevicegenerate(request: SyncIotbasicDevicegenerateRequest): Promise<SyncIotbasicDevicegenerateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.syncIotbasicDevicegenerateEx(request, headers, runtime);
  }

  /**
   * Description: IoT设备平台-生成设备认证密钥
   * Summary: IoT设备平台-生成设备认证密钥
   */
  async syncIotbasicDevicegenerateEx(request: SyncIotbasicDevicegenerateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SyncIotbasicDevicegenerateResponse> {
    Util.validateModel(request);
    return $tea.cast<SyncIotbasicDevicegenerateResponse>(await this.doRequest("1.0", "blockchain.bot.iotbasic.devicegenerate.sync", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SyncIotbasicDevicegenerateResponse({}));
  }

  /**
   * Description: IoT设备平台-批量数据上链
   * Summary: IoT设备平台-批量数据上链
   */
  async operateIotbasicBatchcollect(request: OperateIotbasicBatchcollectRequest): Promise<OperateIotbasicBatchcollectResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.operateIotbasicBatchcollectEx(request, headers, runtime);
  }

  /**
   * Description: IoT设备平台-批量数据上链
   * Summary: IoT设备平台-批量数据上链
   */
  async operateIotbasicBatchcollectEx(request: OperateIotbasicBatchcollectRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<OperateIotbasicBatchcollectResponse> {
    Util.validateModel(request);
    return $tea.cast<OperateIotbasicBatchcollectResponse>(await this.doRequest("1.0", "blockchain.bot.iotbasic.batchcollect.operate", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new OperateIotbasicBatchcollectResponse({}));
  }

  /**
   * Description: IoT设备平台-设备订单导入
   * Summary: IoT设备平台-设备订单导入
   */
  async importIotbasicDeviceorder(request: ImportIotbasicDeviceorderRequest): Promise<ImportIotbasicDeviceorderResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.importIotbasicDeviceorderEx(request, headers, runtime);
  }

  /**
   * Description: IoT设备平台-设备订单导入
   * Summary: IoT设备平台-设备订单导入
   */
  async importIotbasicDeviceorderEx(request: ImportIotbasicDeviceorderRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ImportIotbasicDeviceorderResponse> {
    Util.validateModel(request);
    return $tea.cast<ImportIotbasicDeviceorderResponse>(await this.doRequest("1.0", "blockchain.bot.iotbasic.deviceorder.import", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ImportIotbasicDeviceorderResponse({}));
  }

  /**
   * Description: IoT设备平台-订单批量同步
   * Summary: IoT设备平台-订单批量同步
   */
  async importIotbasicDeviceorderbatch(request: ImportIotbasicDeviceorderbatchRequest): Promise<ImportIotbasicDeviceorderbatchResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.importIotbasicDeviceorderbatchEx(request, headers, runtime);
  }

  /**
   * Description: IoT设备平台-订单批量同步
   * Summary: IoT设备平台-订单批量同步
   */
  async importIotbasicDeviceorderbatchEx(request: ImportIotbasicDeviceorderbatchRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ImportIotbasicDeviceorderbatchResponse> {
    Util.validateModel(request);
    return $tea.cast<ImportIotbasicDeviceorderbatchResponse>(await this.doRequest("1.0", "blockchain.bot.iotbasic.deviceorderbatch.import", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ImportIotbasicDeviceorderbatchResponse({}));
  }

  /**
   * Description: IoT设备平台-删除设备信息
   * Summary: IoT设备平台-删除设备信息
   */
  async deleteIotbasicDevice(request: DeleteIotbasicDeviceRequest): Promise<DeleteIotbasicDeviceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteIotbasicDeviceEx(request, headers, runtime);
  }

  /**
   * Description: IoT设备平台-删除设备信息
   * Summary: IoT设备平台-删除设备信息
   */
  async deleteIotbasicDeviceEx(request: DeleteIotbasicDeviceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteIotbasicDeviceResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteIotbasicDeviceResponse>(await this.doRequest("1.0", "blockchain.bot.iotbasic.device.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteIotbasicDeviceResponse({}));
  }

  /**
   * Description: IoT设备平台-设备远程管控
   * Summary: IoT设备平台-设备远程管控
   */
  async operateIotbasicDevicecontrol(request: OperateIotbasicDevicecontrolRequest): Promise<OperateIotbasicDevicecontrolResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.operateIotbasicDevicecontrolEx(request, headers, runtime);
  }

  /**
   * Description: IoT设备平台-设备远程管控
   * Summary: IoT设备平台-设备远程管控
   */
  async operateIotbasicDevicecontrolEx(request: OperateIotbasicDevicecontrolRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<OperateIotbasicDevicecontrolResponse> {
    Util.validateModel(request);
    return $tea.cast<OperateIotbasicDevicecontrolResponse>(await this.doRequest("1.0", "blockchain.bot.iotbasic.devicecontrol.operate", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new OperateIotbasicDevicecontrolResponse({}));
  }

  /**
   * Description: IoT设备平台-设备注册结果查询
   * Summary: IoT设备平台-设备注册结果查询
   */
  async queryDeviceRegisterresult(request: QueryDeviceRegisterresultRequest): Promise<QueryDeviceRegisterresultResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryDeviceRegisterresultEx(request, headers, runtime);
  }

  /**
   * Description: IoT设备平台-设备注册结果查询
   * Summary: IoT设备平台-设备注册结果查询
   */
  async queryDeviceRegisterresultEx(request: QueryDeviceRegisterresultRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryDeviceRegisterresultResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDeviceRegisterresultResponse>(await this.doRequest("1.0", "blockchain.bot.device.registerresult.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryDeviceRegisterresultResponse({}));
  }

  /**
   * Description: IoT设备平台-设备状态查询
   * Summary: IoT设备平台-设备状态查询
   */
  async queryDeviceStatus(request: QueryDeviceStatusRequest): Promise<QueryDeviceStatusResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryDeviceStatusEx(request, headers, runtime);
  }

  /**
   * Description: IoT设备平台-设备状态查询
   * Summary: IoT设备平台-设备状态查询
   */
  async queryDeviceStatusEx(request: QueryDeviceStatusRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryDeviceStatusResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDeviceStatusResponse>(await this.doRequest("1.0", "blockchain.bot.device.status.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryDeviceStatusResponse({}));
  }

  /**
   * Description: IoT设备平台-openApi操作
   * Summary: IoT设备平台-openApi操作
   */
  async operateIotbasicOpenapi(request: OperateIotbasicOpenapiRequest): Promise<OperateIotbasicOpenapiResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.operateIotbasicOpenapiEx(request, headers, runtime);
  }

  /**
   * Description: IoT设备平台-openApi操作
   * Summary: IoT设备平台-openApi操作
   */
  async operateIotbasicOpenapiEx(request: OperateIotbasicOpenapiRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<OperateIotbasicOpenapiResponse> {
    Util.validateModel(request);
    return $tea.cast<OperateIotbasicOpenapiResponse>(await this.doRequest("1.0", "blockchain.bot.iotbasic.openapi.operate", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new OperateIotbasicOpenapiResponse({}));
  }

  /**
   * Description: 上链数据分页查询
   * Summary: 上链数据分页查询
   */
  async queryIotbasicDevicecollect(request: QueryIotbasicDevicecollectRequest): Promise<QueryIotbasicDevicecollectResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryIotbasicDevicecollectEx(request, headers, runtime);
  }

  /**
   * Description: 上链数据分页查询
   * Summary: 上链数据分页查询
   */
  async queryIotbasicDevicecollectEx(request: QueryIotbasicDevicecollectRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryIotbasicDevicecollectResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryIotbasicDevicecollectResponse>(await this.doRequest("1.0", "blockchain.bot.iotbasic.devicecollect.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryIotbasicDevicecollectResponse({}));
  }

  /**
   * Description: 订单上链数据分页查询
   * Summary: 订单上链数据分页查询
   */
  async queryIotbasicDeviceorder(request: QueryIotbasicDeviceorderRequest): Promise<QueryIotbasicDeviceorderResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryIotbasicDeviceorderEx(request, headers, runtime);
  }

  /**
   * Description: 订单上链数据分页查询
   * Summary: 订单上链数据分页查询
   */
  async queryIotbasicDeviceorderEx(request: QueryIotbasicDeviceorderRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryIotbasicDeviceorderResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryIotbasicDeviceorderResponse>(await this.doRequest("1.0", "blockchain.bot.iotbasic.deviceorder.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryIotbasicDeviceorderResponse({}));
  }

  /**
   * Description: IoT设备平台-订单数据推送中台
   * Summary: IoT设备平台-订单数据推送中台
   */
  async pushIotbasicMeterdata(request: PushIotbasicMeterdataRequest): Promise<PushIotbasicMeterdataResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pushIotbasicMeterdataEx(request, headers, runtime);
  }

  /**
   * Description: IoT设备平台-订单数据推送中台
   * Summary: IoT设备平台-订单数据推送中台
   */
  async pushIotbasicMeterdataEx(request: PushIotbasicMeterdataRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PushIotbasicMeterdataResponse> {
    Util.validateModel(request);
    return $tea.cast<PushIotbasicMeterdataResponse>(await this.doRequest("1.0", "blockchain.bot.iotbasic.meterdata.push", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PushIotbasicMeterdataResponse({}));
  }

  /**
   * Description: IoT设备平台-客户新增
   * Summary: IoT设备平台-中台签约客户同步
   */
  async saveIotbasicCustomer(request: SaveIotbasicCustomerRequest): Promise<SaveIotbasicCustomerResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.saveIotbasicCustomerEx(request, headers, runtime);
  }

  /**
   * Description: IoT设备平台-客户新增
   * Summary: IoT设备平台-中台签约客户同步
   */
  async saveIotbasicCustomerEx(request: SaveIotbasicCustomerRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SaveIotbasicCustomerResponse> {
    Util.validateModel(request);
    return $tea.cast<SaveIotbasicCustomerResponse>(await this.doRequest("1.0", "blockchain.bot.iotbasic.customer.save", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SaveIotbasicCustomerResponse({}));
  }

  /**
   * Description: IoT设备平台-设备消息同步
   * Summary: IoT设备平台-设备消息同步
   */
  async notifyThirddeviceMessage(request: NotifyThirddeviceMessageRequest): Promise<NotifyThirddeviceMessageResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.notifyThirddeviceMessageEx(request, headers, runtime);
  }

  /**
   * Description: IoT设备平台-设备消息同步
   * Summary: IoT设备平台-设备消息同步
   */
  async notifyThirddeviceMessageEx(request: NotifyThirddeviceMessageRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<NotifyThirddeviceMessageResponse> {
    Util.validateModel(request);
    return $tea.cast<NotifyThirddeviceMessageResponse>(await this.doRequest("1.0", "blockchain.bot.thirddevice.message.notify", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new NotifyThirddeviceMessageResponse({}));
  }

  /**
   * Description: Iotbasic-厂商入驻
   * Summary: Iotbasic-厂商入驻
   */
  async registerIotbasicCorpjoin(request: RegisterIotbasicCorpjoinRequest): Promise<RegisterIotbasicCorpjoinResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.registerIotbasicCorpjoinEx(request, headers, runtime);
  }

  /**
   * Description: Iotbasic-厂商入驻
   * Summary: Iotbasic-厂商入驻
   */
  async registerIotbasicCorpjoinEx(request: RegisterIotbasicCorpjoinRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<RegisterIotbasicCorpjoinResponse> {
    Util.validateModel(request);
    return $tea.cast<RegisterIotbasicCorpjoinResponse>(await this.doRequest("1.0", "blockchain.bot.iotbasic.corpjoin.register", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new RegisterIotbasicCorpjoinResponse({}));
  }

  /**
   * Description: IoT设备平台-查询设备链上资产详情
   * Summary: IoT设备平台-查询设备链上资产详情
   */
  async queryTxtransactionDevice(request: QueryTxtransactionDeviceRequest): Promise<QueryTxtransactionDeviceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryTxtransactionDeviceEx(request, headers, runtime);
  }

  /**
   * Description: IoT设备平台-查询设备链上资产详情
   * Summary: IoT设备平台-查询设备链上资产详情
   */
  async queryTxtransactionDeviceEx(request: QueryTxtransactionDeviceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryTxtransactionDeviceResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryTxtransactionDeviceResponse>(await this.doRequest("1.0", "blockchain.bot.txtransaction.device.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryTxtransactionDeviceResponse({}));
  }

  /**
   * Description: IoT设备平台-查询业务数据链上资产详情
   * Summary: IoT设备平台-查询业务数据链上资产详情
   */
  async queryTxtransactionChaindata(request: QueryTxtransactionChaindataRequest): Promise<QueryTxtransactionChaindataResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryTxtransactionChaindataEx(request, headers, runtime);
  }

  /**
   * Description: IoT设备平台-查询业务数据链上资产详情
   * Summary: IoT设备平台-查询业务数据链上资产详情
   */
  async queryTxtransactionChaindataEx(request: QueryTxtransactionChaindataRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryTxtransactionChaindataResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryTxtransactionChaindataResponse>(await this.doRequest("1.0", "blockchain.bot.txtransaction.chaindata.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryTxtransactionChaindataResponse({}));
  }

  /**
   * Description: IoT设备平台-生成云上认证设备认证密钥
   * Summary: IoT设备平台-生成云上认证设备认证密钥
   */
  async initIotbasicDevicekey(request: InitIotbasicDevicekeyRequest): Promise<InitIotbasicDevicekeyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.initIotbasicDevicekeyEx(request, headers, runtime);
  }

  /**
   * Description: IoT设备平台-生成云上认证设备认证密钥
   * Summary: IoT设备平台-生成云上认证设备认证密钥
   */
  async initIotbasicDevicekeyEx(request: InitIotbasicDevicekeyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<InitIotbasicDevicekeyResponse> {
    Util.validateModel(request);
    return $tea.cast<InitIotbasicDevicekeyResponse>(await this.doRequest("1.0", "blockchain.bot.iotbasic.devicekey.init", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new InitIotbasicDevicekeyResponse({}));
  }

  /**
   * Description: IoT设备平台-设置设备属性
   * Summary: IoT设备平台-设置设备属性
   */
  async setDeviceProperty(request: SetDevicePropertyRequest): Promise<SetDevicePropertyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.setDevicePropertyEx(request, headers, runtime);
  }

  /**
   * Description: IoT设备平台-设置设备属性
   * Summary: IoT设备平台-设置设备属性
   */
  async setDevicePropertyEx(request: SetDevicePropertyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SetDevicePropertyResponse> {
    Util.validateModel(request);
    return $tea.cast<SetDevicePropertyResponse>(await this.doRequest("1.0", "blockchain.bot.device.property.set", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SetDevicePropertyResponse({}));
  }

  /**
   * Description: IoT设备平台-批量设置设备属性
   * Summary: IoT设备平台-批量设置设备属性
   */
  async setDevicelistProperty(request: SetDevicelistPropertyRequest): Promise<SetDevicelistPropertyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.setDevicelistPropertyEx(request, headers, runtime);
  }

  /**
   * Description: IoT设备平台-批量设置设备属性
   * Summary: IoT设备平台-批量设置设备属性
   */
  async setDevicelistPropertyEx(request: SetDevicelistPropertyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SetDevicelistPropertyResponse> {
    Util.validateModel(request);
    return $tea.cast<SetDevicelistPropertyResponse>(await this.doRequest("1.0", "blockchain.bot.devicelist.property.set", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SetDevicelistPropertyResponse({}));
  }

  /**
   * Description: iotbasic-查询品类列表
   * Summary: iotbasic-查询品类列表
   */
  async queryIotbasicCategorylist(request: QueryIotbasicCategorylistRequest): Promise<QueryIotbasicCategorylistResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryIotbasicCategorylistEx(request, headers, runtime);
  }

  /**
   * Description: iotbasic-查询品类列表
   * Summary: iotbasic-查询品类列表
   */
  async queryIotbasicCategorylistEx(request: QueryIotbasicCategorylistRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryIotbasicCategorylistResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryIotbasicCategorylistResponse>(await this.doRequest("1.0", "blockchain.bot.iotbasic.categorylist.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryIotbasicCategorylistResponse({}));
  }

  /**
   * Description: iotbasic-查询项目空间列表
   * Summary: iotbasic-查询项目空间列表
   */
  async queryIotbasicProjectspacelist(request: QueryIotbasicProjectspacelistRequest): Promise<QueryIotbasicProjectspacelistResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryIotbasicProjectspacelistEx(request, headers, runtime);
  }

  /**
   * Description: iotbasic-查询项目空间列表
   * Summary: iotbasic-查询项目空间列表
   */
  async queryIotbasicProjectspacelistEx(request: QueryIotbasicProjectspacelistRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryIotbasicProjectspacelistResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryIotbasicProjectspacelistResponse>(await this.doRequest("1.0", "blockchain.bot.iotbasic.projectspacelist.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryIotbasicProjectspacelistResponse({}));
  }

  /**
   * Description: iotbasic-设备厂商入驻
   * Summary: iotbasic-设备厂商入驻
   */
  async registerDevicecorpCustomer(request: RegisterDevicecorpCustomerRequest): Promise<RegisterDevicecorpCustomerResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.registerDevicecorpCustomerEx(request, headers, runtime);
  }

  /**
   * Description: iotbasic-设备厂商入驻
   * Summary: iotbasic-设备厂商入驻
   */
  async registerDevicecorpCustomerEx(request: RegisterDevicecorpCustomerRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<RegisterDevicecorpCustomerResponse> {
    Util.validateModel(request);
    return $tea.cast<RegisterDevicecorpCustomerResponse>(await this.doRequest("1.0", "blockchain.bot.devicecorp.customer.register", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new RegisterDevicecorpCustomerResponse({}));
  }

  /**
   * Description: iotbasic-设备厂商产品查询
   * Summary: iotbasic-设备厂商产品查询
   */
  async getDevicecorpProductinfo(request: GetDevicecorpProductinfoRequest): Promise<GetDevicecorpProductinfoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getDevicecorpProductinfoEx(request, headers, runtime);
  }

  /**
   * Description: iotbasic-设备厂商产品查询
   * Summary: iotbasic-设备厂商产品查询
   */
  async getDevicecorpProductinfoEx(request: GetDevicecorpProductinfoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetDevicecorpProductinfoResponse> {
    Util.validateModel(request);
    return $tea.cast<GetDevicecorpProductinfoResponse>(await this.doRequest("1.0", "blockchain.bot.devicecorp.productinfo.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetDevicecorpProductinfoResponse({}));
  }

  /**
   * Description: iotbasic-添加设备厂商设备属性
   * Summary: iotbasic-添加设备厂商设备属性
   */
  async addDevicecorpDeviceattributes(request: AddDevicecorpDeviceattributesRequest): Promise<AddDevicecorpDeviceattributesResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.addDevicecorpDeviceattributesEx(request, headers, runtime);
  }

  /**
   * Description: iotbasic-添加设备厂商设备属性
   * Summary: iotbasic-添加设备厂商设备属性
   */
  async addDevicecorpDeviceattributesEx(request: AddDevicecorpDeviceattributesRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AddDevicecorpDeviceattributesResponse> {
    Util.validateModel(request);
    return $tea.cast<AddDevicecorpDeviceattributesResponse>(await this.doRequest("1.0", "blockchain.bot.devicecorp.deviceattributes.add", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AddDevicecorpDeviceattributesResponse({}));
  }

  /**
   * Description: iotbasic-指定设备上调用指定服务
   * Summary: iotbasic-指定设备上调用指定服务
   */
  async execDeviceThingservice(request: ExecDeviceThingserviceRequest): Promise<ExecDeviceThingserviceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.execDeviceThingserviceEx(request, headers, runtime);
  }

  /**
   * Description: iotbasic-指定设备上调用指定服务
   * Summary: iotbasic-指定设备上调用指定服务
   */
  async execDeviceThingserviceEx(request: ExecDeviceThingserviceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExecDeviceThingserviceResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecDeviceThingserviceResponse>(await this.doRequest("1.0", "blockchain.bot.device.thingservice.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExecDeviceThingserviceResponse({}));
  }

  /**
   * Description: iotbasic-查看产品物模型功能定义
   * Summary: iotbasic-查看产品物模型功能定义
   */
  async queryDeviceThingmodel(request: QueryDeviceThingmodelRequest): Promise<QueryDeviceThingmodelResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryDeviceThingmodelEx(request, headers, runtime);
  }

  /**
   * Description: iotbasic-查看产品物模型功能定义
   * Summary: iotbasic-查看产品物模型功能定义
   */
  async queryDeviceThingmodelEx(request: QueryDeviceThingmodelRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryDeviceThingmodelResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDeviceThingmodelResponse>(await this.doRequest("1.0", "blockchain.bot.device.thingmodel.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryDeviceThingmodelResponse({}));
  }

  /**
   * Description: iotbasic-查询设备物模型数据
   * Summary: iotbasic-查询设备物模型数据
   */
  async queryDeviceModeldata(request: QueryDeviceModeldataRequest): Promise<QueryDeviceModeldataResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryDeviceModeldataEx(request, headers, runtime);
  }

  /**
   * Description: iotbasic-查询设备物模型数据
   * Summary: iotbasic-查询设备物模型数据
   */
  async queryDeviceModeldataEx(request: QueryDeviceModeldataRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryDeviceModeldataResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDeviceModeldataResponse>(await this.doRequest("1.0", "blockchain.bot.device.modeldata.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryDeviceModeldataResponse({}));
  }

  /**
   * Description: iotbasic-设备厂商注册设备
   * Summary: iotbasic-设备厂商注册设备
   */
  async createDevicecorpDevice(request: CreateDevicecorpDeviceRequest): Promise<CreateDevicecorpDeviceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createDevicecorpDeviceEx(request, headers, runtime);
  }

  /**
   * Description: iotbasic-设备厂商注册设备
   * Summary: iotbasic-设备厂商注册设备
   */
  async createDevicecorpDeviceEx(request: CreateDevicecorpDeviceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateDevicecorpDeviceResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateDevicecorpDeviceResponse>(await this.doRequest("1.0", "blockchain.bot.devicecorp.device.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateDevicecorpDeviceResponse({}));
  }

  /**
   * Description: iotbasic-设备厂商批量注册设备
   * Summary: iotbasic-设备厂商批量注册设备
   */
  async batchcreateDevicecorpDevice(request: BatchcreateDevicecorpDeviceRequest): Promise<BatchcreateDevicecorpDeviceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.batchcreateDevicecorpDeviceEx(request, headers, runtime);
  }

  /**
   * Description: iotbasic-设备厂商批量注册设备
   * Summary: iotbasic-设备厂商批量注册设备
   */
  async batchcreateDevicecorpDeviceEx(request: BatchcreateDevicecorpDeviceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BatchcreateDevicecorpDeviceResponse> {
    Util.validateModel(request);
    return $tea.cast<BatchcreateDevicecorpDeviceResponse>(await this.doRequest("1.0", "blockchain.bot.devicecorp.device.batchcreate", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BatchcreateDevicecorpDeviceResponse({}));
  }

  /**
   * Description: iotbasic-查询设备厂商企业注册结果
   * Summary: 查询设备厂商企业注册结果
   */
  async queryDevicecorpCustomerregisterresult(request: QueryDevicecorpCustomerregisterresultRequest): Promise<QueryDevicecorpCustomerregisterresultResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryDevicecorpCustomerregisterresultEx(request, headers, runtime);
  }

  /**
   * Description: iotbasic-查询设备厂商企业注册结果
   * Summary: 查询设备厂商企业注册结果
   */
  async queryDevicecorpCustomerregisterresultEx(request: QueryDevicecorpCustomerregisterresultRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryDevicecorpCustomerregisterresultResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDevicecorpCustomerregisterresultResponse>(await this.doRequest("1.0", "blockchain.bot.devicecorp.customerregisterresult.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryDevicecorpCustomerregisterresultResponse({}));
  }

  /**
   * Description: iotbasic-管控设备厂商设备
   * Summary: iotbasic-管控设备厂商设备
   */
  async operateDevicecorpDevicecontrol(request: OperateDevicecorpDevicecontrolRequest): Promise<OperateDevicecorpDevicecontrolResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.operateDevicecorpDevicecontrolEx(request, headers, runtime);
  }

  /**
   * Description: iotbasic-管控设备厂商设备
   * Summary: iotbasic-管控设备厂商设备
   */
  async operateDevicecorpDevicecontrolEx(request: OperateDevicecorpDevicecontrolRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<OperateDevicecorpDevicecontrolResponse> {
    Util.validateModel(request);
    return $tea.cast<OperateDevicecorpDevicecontrolResponse>(await this.doRequest("1.0", "blockchain.bot.devicecorp.devicecontrol.operate", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new OperateDevicecorpDevicecontrolResponse({}));
  }

  /**
   * Description: iotbasic-设备厂商创建物模型
   * Summary: iotbasic-设备厂商创建物模型
   */
  async createDevicecorpThingmodel(request: CreateDevicecorpThingmodelRequest): Promise<CreateDevicecorpThingmodelResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createDevicecorpThingmodelEx(request, headers, runtime);
  }

  /**
   * Description: iotbasic-设备厂商创建物模型
   * Summary: iotbasic-设备厂商创建物模型
   */
  async createDevicecorpThingmodelEx(request: CreateDevicecorpThingmodelRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateDevicecorpThingmodelResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateDevicecorpThingmodelResponse>(await this.doRequest("1.0", "blockchain.bot.devicecorp.thingmodel.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateDevicecorpThingmodelResponse({}));
  }

  /**
   * Description: iotbasic-设备厂商修改物模型
   * Summary: iotbasic-设备厂商修改物模型
   */
  async updateDevicecorpThingmodel(request: UpdateDevicecorpThingmodelRequest): Promise<UpdateDevicecorpThingmodelResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateDevicecorpThingmodelEx(request, headers, runtime);
  }

  /**
   * Description: iotbasic-设备厂商修改物模型
   * Summary: iotbasic-设备厂商修改物模型
   */
  async updateDevicecorpThingmodelEx(request: UpdateDevicecorpThingmodelRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateDevicecorpThingmodelResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateDevicecorpThingmodelResponse>(await this.doRequest("1.0", "blockchain.bot.devicecorp.thingmodel.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateDevicecorpThingmodelResponse({}));
  }

  /**
   * Description: iotbasic-设备厂商删除物模型
   * Summary: iotbasic-设备厂商删除物模型
   */
  async deleteDevicecorpThingmodel(request: DeleteDevicecorpThingmodelRequest): Promise<DeleteDevicecorpThingmodelResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteDevicecorpThingmodelEx(request, headers, runtime);
  }

  /**
   * Description: iotbasic-设备厂商删除物模型
   * Summary: iotbasic-设备厂商删除物模型
   */
  async deleteDevicecorpThingmodelEx(request: DeleteDevicecorpThingmodelRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteDevicecorpThingmodelResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteDevicecorpThingmodelResponse>(await this.doRequest("1.0", "blockchain.bot.devicecorp.thingmodel.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteDevicecorpThingmodelResponse({}));
  }

  /**
   * Description: iotbasic-设备厂商发布物模型
   * Summary: iotbasic-设备厂商发布物模型
   */
  async publishDevicecorpThingmodel(request: PublishDevicecorpThingmodelRequest): Promise<PublishDevicecorpThingmodelResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.publishDevicecorpThingmodelEx(request, headers, runtime);
  }

  /**
   * Description: iotbasic-设备厂商发布物模型
   * Summary: iotbasic-设备厂商发布物模型
   */
  async publishDevicecorpThingmodelEx(request: PublishDevicecorpThingmodelRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PublishDevicecorpThingmodelResponse> {
    Util.validateModel(request);
    return $tea.cast<PublishDevicecorpThingmodelResponse>(await this.doRequest("1.0", "blockchain.bot.devicecorp.thingmodel.publish", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PublishDevicecorpThingmodelResponse({}));
  }

  /**
   * Description: 代扣签约链接获取
   * Summary: 代扣签约链接获取
   */
  async createDigitalkeyWithholdsign(request: CreateDigitalkeyWithholdsignRequest): Promise<CreateDigitalkeyWithholdsignResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createDigitalkeyWithholdsignEx(request, headers, runtime);
  }

  /**
   * Description: 代扣签约链接获取
   * Summary: 代扣签约链接获取
   */
  async createDigitalkeyWithholdsignEx(request: CreateDigitalkeyWithholdsignRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateDigitalkeyWithholdsignResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateDigitalkeyWithholdsignResponse>(await this.doRequest("1.0", "blockchain.bot.digitalkey.withholdsign.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateDigitalkeyWithholdsignResponse({}));
  }

  /**
   * Description: 代扣签约解除
   * Summary: 代扣签约解除
   */
  async unbindDigitalkeyWithholdsign(request: UnbindDigitalkeyWithholdsignRequest): Promise<UnbindDigitalkeyWithholdsignResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.unbindDigitalkeyWithholdsignEx(request, headers, runtime);
  }

  /**
   * Description: 代扣签约解除
   * Summary: 代扣签约解除
   */
  async unbindDigitalkeyWithholdsignEx(request: UnbindDigitalkeyWithholdsignRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UnbindDigitalkeyWithholdsignResponse> {
    Util.validateModel(request);
    return $tea.cast<UnbindDigitalkeyWithholdsignResponse>(await this.doRequest("1.0", "blockchain.bot.digitalkey.withholdsign.unbind", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UnbindDigitalkeyWithholdsignResponse({}));
  }

  /**
   * Description: 网约车代扣支付
   * Summary: 网约车代扣支付
   */
  async payDigitalkeyWithhold(request: PayDigitalkeyWithholdRequest): Promise<PayDigitalkeyWithholdResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.payDigitalkeyWithholdEx(request, headers, runtime);
  }

  /**
   * Description: 网约车代扣支付
   * Summary: 网约车代扣支付
   */
  async payDigitalkeyWithholdEx(request: PayDigitalkeyWithholdRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PayDigitalkeyWithholdResponse> {
    Util.validateModel(request);
    return $tea.cast<PayDigitalkeyWithholdResponse>(await this.doRequest("1.0", "blockchain.bot.digitalkey.withhold.pay", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PayDigitalkeyWithholdResponse({}));
  }

  /**
   * Description: 代扣支付交易退款 
   * Summary: 代扣支付交易退款 
   */
  async refuseDigitalkeyWithholdpay(request: RefuseDigitalkeyWithholdpayRequest): Promise<RefuseDigitalkeyWithholdpayResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.refuseDigitalkeyWithholdpayEx(request, headers, runtime);
  }

  /**
   * Description: 代扣支付交易退款 
   * Summary: 代扣支付交易退款 
   */
  async refuseDigitalkeyWithholdpayEx(request: RefuseDigitalkeyWithholdpayRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<RefuseDigitalkeyWithholdpayResponse> {
    Util.validateModel(request);
    return $tea.cast<RefuseDigitalkeyWithholdpayResponse>(await this.doRequest("1.0", "blockchain.bot.digitalkey.withholdpay.refuse", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new RefuseDigitalkeyWithholdpayResponse({}));
  }

  /**
   * Description: 代扣协议查询
   * Summary: 代扣协议查询
   */
  async queryDigitalkeyWithholdsign(request: QueryDigitalkeyWithholdsignRequest): Promise<QueryDigitalkeyWithholdsignResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryDigitalkeyWithholdsignEx(request, headers, runtime);
  }

  /**
   * Description: 代扣协议查询
   * Summary: 代扣协议查询
   */
  async queryDigitalkeyWithholdsignEx(request: QueryDigitalkeyWithholdsignRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryDigitalkeyWithholdsignResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDigitalkeyWithholdsignResponse>(await this.doRequest("1.0", "blockchain.bot.digitalkey.withholdsign.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryDigitalkeyWithholdsignResponse({}));
  }

  /**
   * Description: 代扣支付撤销
   * Summary: 代扣支付撤销
   */
  async cancelDigitalkeyWithholdpay(request: CancelDigitalkeyWithholdpayRequest): Promise<CancelDigitalkeyWithholdpayResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.cancelDigitalkeyWithholdpayEx(request, headers, runtime);
  }

  /**
   * Description: 代扣支付撤销
   * Summary: 代扣支付撤销
   */
  async cancelDigitalkeyWithholdpayEx(request: CancelDigitalkeyWithholdpayRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CancelDigitalkeyWithholdpayResponse> {
    Util.validateModel(request);
    return $tea.cast<CancelDigitalkeyWithholdpayResponse>(await this.doRequest("1.0", "blockchain.bot.digitalkey.withholdpay.cancel", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CancelDigitalkeyWithholdpayResponse({}));
  }

  /**
   * Description: 代扣扣款前预通知
   * Summary: 代扣扣款前预通知
   */
  async notifyDigitalkeyWithholdpre(request: NotifyDigitalkeyWithholdpreRequest): Promise<NotifyDigitalkeyWithholdpreResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.notifyDigitalkeyWithholdpreEx(request, headers, runtime);
  }

  /**
   * Description: 代扣扣款前预通知
   * Summary: 代扣扣款前预通知
   */
  async notifyDigitalkeyWithholdpreEx(request: NotifyDigitalkeyWithholdpreRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<NotifyDigitalkeyWithholdpreResponse> {
    Util.validateModel(request);
    return $tea.cast<NotifyDigitalkeyWithholdpreResponse>(await this.doRequest("1.0", "blockchain.bot.digitalkey.withholdpre.notify", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new NotifyDigitalkeyWithholdpreResponse({}));
  }

  /**
   * Description: iotbasic-查询品类行业，场景列表
   * Summary: iotbasic-查询品类行业，场景列表
   */
  async queryCategoryIndustryscenelist(request: QueryCategoryIndustryscenelistRequest): Promise<QueryCategoryIndustryscenelistResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryCategoryIndustryscenelistEx(request, headers, runtime);
  }

  /**
   * Description: iotbasic-查询品类行业，场景列表
   * Summary: iotbasic-查询品类行业，场景列表
   */
  async queryCategoryIndustryscenelistEx(request: QueryCategoryIndustryscenelistRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryCategoryIndustryscenelistResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryCategoryIndustryscenelistResponse>(await this.doRequest("1.0", "blockchain.bot.category.industryscenelist.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryCategoryIndustryscenelistResponse({}));
  }

  /**
   * Description: iotbasic-创建自定义品类
   * Summary: iotbasic-创建自定义品类
   */
  async createCategoryCustom(request: CreateCategoryCustomRequest): Promise<CreateCategoryCustomResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createCategoryCustomEx(request, headers, runtime);
  }

  /**
   * Description: iotbasic-创建自定义品类
   * Summary: iotbasic-创建自定义品类
   */
  async createCategoryCustomEx(request: CreateCategoryCustomRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateCategoryCustomResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateCategoryCustomResponse>(await this.doRequest("1.0", "blockchain.bot.category.custom.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateCategoryCustomResponse({}));
  }

  /**
   * Description: iotbasic-设备模型创建
   * Summary: iotbasic-设备模型创建
   */
  async createDeviceModel(request: CreateDeviceModelRequest): Promise<CreateDeviceModelResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createDeviceModelEx(request, headers, runtime);
  }

  /**
   * Description: iotbasic-设备模型创建
   * Summary: iotbasic-设备模型创建
   */
  async createDeviceModelEx(request: CreateDeviceModelRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateDeviceModelResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateDeviceModelResponse>(await this.doRequest("1.0", "blockchain.bot.device.model.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateDeviceModelResponse({}));
  }

  /**
   * Description: iotbasic-创建iot产品
   * Summary: iotbasic-创建iot产品
   */
  async createIotbasicProduct(request: CreateIotbasicProductRequest): Promise<CreateIotbasicProductResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createIotbasicProductEx(request, headers, runtime);
  }

  /**
   * Description: iotbasic-创建iot产品
   * Summary: iotbasic-创建iot产品
   */
  async createIotbasicProductEx(request: CreateIotbasicProductRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateIotbasicProductResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateIotbasicProductResponse>(await this.doRequest("1.0", "blockchain.bot.iotbasic.product.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateIotbasicProductResponse({}));
  }

  /**
   * Description: 代扣支付订单查询
   * Summary: 代扣支付订单查询
   */
  async queryDigitalkeyWithholdpay(request: QueryDigitalkeyWithholdpayRequest): Promise<QueryDigitalkeyWithholdpayResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryDigitalkeyWithholdpayEx(request, headers, runtime);
  }

  /**
   * Description: 代扣支付订单查询
   * Summary: 代扣支付订单查询
   */
  async queryDigitalkeyWithholdpayEx(request: QueryDigitalkeyWithholdpayRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryDigitalkeyWithholdpayResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDigitalkeyWithholdpayResponse>(await this.doRequest("1.0", "blockchain.bot.digitalkey.withholdpay.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryDigitalkeyWithholdpayResponse({}));
  }

  /**
   * Description: 代扣支付查询
   * Summary: 代扣支付查询
   */
  async queryDigitalkeyTradepay(request: QueryDigitalkeyTradepayRequest): Promise<QueryDigitalkeyTradepayResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryDigitalkeyTradepayEx(request, headers, runtime);
  }

  /**
   * Description: 代扣支付查询
   * Summary: 代扣支付查询
   */
  async queryDigitalkeyTradepayEx(request: QueryDigitalkeyTradepayRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryDigitalkeyTradepayResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDigitalkeyTradepayResponse>(await this.doRequest("1.0", "blockchain.bot.digitalkey.tradepay.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryDigitalkeyTradepayResponse({}));
  }

  /**
   * Description: iotbasic-查询数控设备信息
   * Summary: iotbasic-查询数控设备信息
   */
  async getDigitalkeyDeviceinfo(request: GetDigitalkeyDeviceinfoRequest): Promise<GetDigitalkeyDeviceinfoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getDigitalkeyDeviceinfoEx(request, headers, runtime);
  }

  /**
   * Description: iotbasic-查询数控设备信息
   * Summary: iotbasic-查询数控设备信息
   */
  async getDigitalkeyDeviceinfoEx(request: GetDigitalkeyDeviceinfoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetDigitalkeyDeviceinfoResponse> {
    Util.validateModel(request);
    return $tea.cast<GetDigitalkeyDeviceinfoResponse>(await this.doRequest("1.0", "blockchain.bot.digitalkey.deviceinfo.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetDigitalkeyDeviceinfoResponse({}));
  }

  /**
   * Description: iotbasic-新增应用
   * Summary: iotbasic-新增应用
   */
  async createIotlinkAppmanager(request: CreateIotlinkAppmanagerRequest): Promise<CreateIotlinkAppmanagerResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createIotlinkAppmanagerEx(request, headers, runtime);
  }

  /**
   * Description: iotbasic-新增应用
   * Summary: iotbasic-新增应用
   */
  async createIotlinkAppmanagerEx(request: CreateIotlinkAppmanagerRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateIotlinkAppmanagerResponse> {
    if (!Util.isUnset(request.fileObject)) {
      let uploadReq = new CreateAntcloudGatewayxFileUploadRequest({
        authToken: request.authToken,
        apiCode: "blockchain.bot.iotlink.appmanager.create",
        fileName: request.fileObjectName,
      });
      let uploadResp = await this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
      if (!AntchainUtil.isSuccess(uploadResp.resultCode, "ok")) {
        let createIotlinkAppmanagerResponse = new CreateIotlinkAppmanagerResponse({
          reqMsgId: uploadResp.reqMsgId,
          resultCode: uploadResp.resultCode,
          resultMsg: uploadResp.resultMsg,
        });
        return createIotlinkAppmanagerResponse;
      }

      let uploadHeaders = AntchainUtil.parseUploadHeaders(uploadResp.uploadHeaders);
      await AntchainUtil.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
      request.fileId = uploadResp.fileId;
    }

    Util.validateModel(request);
    return $tea.cast<CreateIotlinkAppmanagerResponse>(await this.doRequest("1.0", "blockchain.bot.iotlink.appmanager.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateIotlinkAppmanagerResponse({}));
  }

  /**
   * Description: iotbasic-获取应用模块列表
   * Summary: iotbasic-获取应用模块列表
   */
  async listIotlinkOtamodule(request: ListIotlinkOtamoduleRequest): Promise<ListIotlinkOtamoduleResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listIotlinkOtamoduleEx(request, headers, runtime);
  }

  /**
   * Description: iotbasic-获取应用模块列表
   * Summary: iotbasic-获取应用模块列表
   */
  async listIotlinkOtamoduleEx(request: ListIotlinkOtamoduleRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListIotlinkOtamoduleResponse> {
    Util.validateModel(request);
    return $tea.cast<ListIotlinkOtamoduleResponse>(await this.doRequest("1.0", "blockchain.bot.iotlink.otamodule.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListIotlinkOtamoduleResponse({}));
  }

  /**
   * Description: iotbasic-分页查询应用列表
   * Summary: iotbasic-分页查询应用列表
   */
  async pagequeryIotlinkAppmanager(request: PagequeryIotlinkAppmanagerRequest): Promise<PagequeryIotlinkAppmanagerResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pagequeryIotlinkAppmanagerEx(request, headers, runtime);
  }

  /**
   * Description: iotbasic-分页查询应用列表
   * Summary: iotbasic-分页查询应用列表
   */
  async pagequeryIotlinkAppmanagerEx(request: PagequeryIotlinkAppmanagerRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PagequeryIotlinkAppmanagerResponse> {
    Util.validateModel(request);
    return $tea.cast<PagequeryIotlinkAppmanagerResponse>(await this.doRequest("1.0", "blockchain.bot.iotlink.appmanager.pagequery", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PagequeryIotlinkAppmanagerResponse({}));
  }

  /**
   * Description: iotbasic-获取应用下载地址
   * Summary: iotbasic-获取应用下载地址
   */
  async getIotlinkAppmanagerfileurl(request: GetIotlinkAppmanagerfileurlRequest): Promise<GetIotlinkAppmanagerfileurlResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getIotlinkAppmanagerfileurlEx(request, headers, runtime);
  }

  /**
   * Description: iotbasic-获取应用下载地址
   * Summary: iotbasic-获取应用下载地址
   */
  async getIotlinkAppmanagerfileurlEx(request: GetIotlinkAppmanagerfileurlRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetIotlinkAppmanagerfileurlResponse> {
    Util.validateModel(request);
    return $tea.cast<GetIotlinkAppmanagerfileurlResponse>(await this.doRequest("1.0", "blockchain.bot.iotlink.appmanagerfileurl.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetIotlinkAppmanagerfileurlResponse({}));
  }

  /**
   * Description: iotbasic-分页查询发布批次列表
   * Summary: iotbasic-分页查询发布批次列表
   */
  async pagequeryIotlinkAppreleaseorder(request: PagequeryIotlinkAppreleaseorderRequest): Promise<PagequeryIotlinkAppreleaseorderResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pagequeryIotlinkAppreleaseorderEx(request, headers, runtime);
  }

  /**
   * Description: iotbasic-分页查询发布批次列表
   * Summary: iotbasic-分页查询发布批次列表
   */
  async pagequeryIotlinkAppreleaseorderEx(request: PagequeryIotlinkAppreleaseorderRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PagequeryIotlinkAppreleaseorderResponse> {
    Util.validateModel(request);
    return $tea.cast<PagequeryIotlinkAppreleaseorderResponse>(await this.doRequest("1.0", "blockchain.bot.iotlink.appreleaseorder.pagequery", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PagequeryIotlinkAppreleaseorderResponse({}));
  }

  /**
   * Description: iotbasic-分页查询设备升级列表
   * Summary: iotbasic-分页查询设备升级列表
   */
  async pagequeryIotlinkAppreleasedevice(request: PagequeryIotlinkAppreleasedeviceRequest): Promise<PagequeryIotlinkAppreleasedeviceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pagequeryIotlinkAppreleasedeviceEx(request, headers, runtime);
  }

  /**
   * Description: iotbasic-分页查询设备升级列表
   * Summary: iotbasic-分页查询设备升级列表
   */
  async pagequeryIotlinkAppreleasedeviceEx(request: PagequeryIotlinkAppreleasedeviceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PagequeryIotlinkAppreleasedeviceResponse> {
    Util.validateModel(request);
    return $tea.cast<PagequeryIotlinkAppreleasedeviceResponse>(await this.doRequest("1.0", "blockchain.bot.iotlink.appreleasedevice.pagequery", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PagequeryIotlinkAppreleasedeviceResponse({}));
  }

  /**
   * Description: iotbasic-发布工单
   * Summary: iotbasic-发布工单
   */
  async publishIotlinkAppreleaseorder(request: PublishIotlinkAppreleaseorderRequest): Promise<PublishIotlinkAppreleaseorderResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.publishIotlinkAppreleaseorderEx(request, headers, runtime);
  }

  /**
   * Description: iotbasic-发布工单
   * Summary: iotbasic-发布工单
   */
  async publishIotlinkAppreleaseorderEx(request: PublishIotlinkAppreleaseorderRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PublishIotlinkAppreleaseorderResponse> {
    Util.validateModel(request);
    return $tea.cast<PublishIotlinkAppreleaseorderResponse>(await this.doRequest("1.0", "blockchain.bot.iotlink.appreleaseorder.publish", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PublishIotlinkAppreleaseorderResponse({}));
  }

  /**
   * Description: iotbasic-取消工单发布
   * Summary: iotbasic-取消工单发布
   */
  async cancelIotlinkAppreleaseorder(request: CancelIotlinkAppreleaseorderRequest): Promise<CancelIotlinkAppreleaseorderResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.cancelIotlinkAppreleaseorderEx(request, headers, runtime);
  }

  /**
   * Description: iotbasic-取消工单发布
   * Summary: iotbasic-取消工单发布
   */
  async cancelIotlinkAppreleaseorderEx(request: CancelIotlinkAppreleaseorderRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CancelIotlinkAppreleaseorderResponse> {
    Util.validateModel(request);
    return $tea.cast<CancelIotlinkAppreleaseorderResponse>(await this.doRequest("1.0", "blockchain.bot.iotlink.appreleaseorder.cancel", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CancelIotlinkAppreleaseorderResponse({}));
  }

  /**
   * Description: iotbasic-取消设备升级
   * Summary: iotbasic-取消设备升级
   */
  async cancelIotlinkAppreleasedevice(request: CancelIotlinkAppreleasedeviceRequest): Promise<CancelIotlinkAppreleasedeviceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.cancelIotlinkAppreleasedeviceEx(request, headers, runtime);
  }

  /**
   * Description: iotbasic-取消设备升级
   * Summary: iotbasic-取消设备升级
   */
  async cancelIotlinkAppreleasedeviceEx(request: CancelIotlinkAppreleasedeviceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CancelIotlinkAppreleasedeviceResponse> {
    Util.validateModel(request);
    return $tea.cast<CancelIotlinkAppreleasedeviceResponse>(await this.doRequest("1.0", "blockchain.bot.iotlink.appreleasedevice.cancel", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CancelIotlinkAppreleasedeviceResponse({}));
  }

  /**
   * Description: iotbasic-重试设备升级
   * Summary: iotbasic-重试设备升级
   */
  async retryIotlinkAppreleasedevice(request: RetryIotlinkAppreleasedeviceRequest): Promise<RetryIotlinkAppreleasedeviceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.retryIotlinkAppreleasedeviceEx(request, headers, runtime);
  }

  /**
   * Description: iotbasic-重试设备升级
   * Summary: iotbasic-重试设备升级
   */
  async retryIotlinkAppreleasedeviceEx(request: RetryIotlinkAppreleasedeviceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<RetryIotlinkAppreleasedeviceResponse> {
    Util.validateModel(request);
    return $tea.cast<RetryIotlinkAppreleasedeviceResponse>(await this.doRequest("1.0", "blockchain.bot.iotlink.appreleasedevice.retry", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new RetryIotlinkAppreleasedeviceResponse({}));
  }

  /**
   * Description: iotbasic-创建应用类型
   * Summary: iotbasic-创建应用类型
   */
  async createIotlinkOtamodule(request: CreateIotlinkOtamoduleRequest): Promise<CreateIotlinkOtamoduleResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createIotlinkOtamoduleEx(request, headers, runtime);
  }

  /**
   * Description: iotbasic-创建应用类型
   * Summary: iotbasic-创建应用类型
   */
  async createIotlinkOtamoduleEx(request: CreateIotlinkOtamoduleRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateIotlinkOtamoduleResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateIotlinkOtamoduleResponse>(await this.doRequest("1.0", "blockchain.bot.iotlink.otamodule.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateIotlinkOtamoduleResponse({}));
  }

  /**
   * Description: iotbasic-修改应用类型
   * Summary: iotbasic-修改应用类型
   */
  async updateIotlinkOtamodule(request: UpdateIotlinkOtamoduleRequest): Promise<UpdateIotlinkOtamoduleResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateIotlinkOtamoduleEx(request, headers, runtime);
  }

  /**
   * Description: iotbasic-修改应用类型
   * Summary: iotbasic-修改应用类型
   */
  async updateIotlinkOtamoduleEx(request: UpdateIotlinkOtamoduleRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateIotlinkOtamoduleResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateIotlinkOtamoduleResponse>(await this.doRequest("1.0", "blockchain.bot.iotlink.otamodule.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateIotlinkOtamoduleResponse({}));
  }

  /**
   * Description: iotbasic-删除应用类型
   * Summary: iotbasic-删除应用类型
   */
  async deleteIotlinkOtamodule(request: DeleteIotlinkOtamoduleRequest): Promise<DeleteIotlinkOtamoduleResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteIotlinkOtamoduleEx(request, headers, runtime);
  }

  /**
   * Description: iotbasic-删除应用类型
   * Summary: iotbasic-删除应用类型
   */
  async deleteIotlinkOtamoduleEx(request: DeleteIotlinkOtamoduleRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteIotlinkOtamoduleResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteIotlinkOtamoduleResponse>(await this.doRequest("1.0", "blockchain.bot.iotlink.otamodule.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteIotlinkOtamoduleResponse({}));
  }

  /**
   * Description: iotbasic-设备厂商导入物模型
   * Summary: iotbasic-设备厂商导入物模型
   */
  async importIotlinkThingmodeltsl(request: ImportIotlinkThingmodeltslRequest): Promise<ImportIotlinkThingmodeltslResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.importIotlinkThingmodeltslEx(request, headers, runtime);
  }

  /**
   * Description: iotbasic-设备厂商导入物模型
   * Summary: iotbasic-设备厂商导入物模型
   */
  async importIotlinkThingmodeltslEx(request: ImportIotlinkThingmodeltslRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ImportIotlinkThingmodeltslResponse> {
    Util.validateModel(request);
    return $tea.cast<ImportIotlinkThingmodeltslResponse>(await this.doRequest("1.0", "blockchain.bot.iotlink.thingmodeltsl.import", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ImportIotlinkThingmodeltslResponse({}));
  }

  /**
   * Description: 根据设备串号查询采购设备
   * Summary: 根据设备串号查询采购设备
   */
  async queryIotplatformPurchaseorder(request: QueryIotplatformPurchaseorderRequest): Promise<QueryIotplatformPurchaseorderResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryIotplatformPurchaseorderEx(request, headers, runtime);
  }

  /**
   * Description: 根据设备串号查询采购设备
   * Summary: 根据设备串号查询采购设备
   */
  async queryIotplatformPurchaseorderEx(request: QueryIotplatformPurchaseorderRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryIotplatformPurchaseorderResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryIotplatformPurchaseorderResponse>(await this.doRequest("1.0", "blockchain.bot.iotplatform.purchaseorder.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryIotplatformPurchaseorderResponse({}));
  }

  /**
   * Description: 设备租赁业务中在PC设备出厂时进行MeshId及SN号的关联绑定
   * Summary: 绑定MeshId及设备SN
   */
  async importIotplatformMeshid(request: ImportIotplatformMeshidRequest): Promise<ImportIotplatformMeshidResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.importIotplatformMeshidEx(request, headers, runtime);
  }

  /**
   * Description: 设备租赁业务中在PC设备出厂时进行MeshId及SN号的关联绑定
   * Summary: 绑定MeshId及设备SN
   */
  async importIotplatformMeshidEx(request: ImportIotplatformMeshidRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ImportIotplatformMeshidResponse> {
    Util.validateModel(request);
    return $tea.cast<ImportIotplatformMeshidResponse>(await this.doRequest("1.0", "blockchain.bot.iotplatform.meshid.import", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ImportIotplatformMeshidResponse({}));
  }

  /**
   * Description: 与租赁宝对接采购订单导入的接口
   * Summary: 与租赁宝对接采购订单导入的接口
   */
  async importPurchaseorderThirdparty(request: ImportPurchaseorderThirdpartyRequest): Promise<ImportPurchaseorderThirdpartyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.importPurchaseorderThirdpartyEx(request, headers, runtime);
  }

  /**
   * Description: 与租赁宝对接采购订单导入的接口
   * Summary: 与租赁宝对接采购订单导入的接口
   */
  async importPurchaseorderThirdpartyEx(request: ImportPurchaseorderThirdpartyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ImportPurchaseorderThirdpartyResponse> {
    Util.validateModel(request);
    return $tea.cast<ImportPurchaseorderThirdpartyResponse>(await this.doRequest("1.0", "blockchain.bot.purchaseorder.thirdparty.import", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ImportPurchaseorderThirdpartyResponse({}));
  }

  /**
   * Description: 采购平台新增供应商角色
   * Summary: 采购平台新增供应商角色
   */
  async addUserRole(request: AddUserRoleRequest): Promise<AddUserRoleResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.addUserRoleEx(request, headers, runtime);
  }

  /**
   * Description: 采购平台新增供应商角色
   * Summary: 采购平台新增供应商角色
   */
  async addUserRoleEx(request: AddUserRoleRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AddUserRoleResponse> {
    Util.validateModel(request);
    return $tea.cast<AddUserRoleResponse>(await this.doRequest("1.0", "blockchain.bot.user.role.add", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AddUserRoleResponse({}));
  }

  /**
   * Description: 采购平台新增SKU
   * Summary: 采购平台新增SKU
   */
  async addGoodsSku(request: AddGoodsSkuRequest): Promise<AddGoodsSkuResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.addGoodsSkuEx(request, headers, runtime);
  }

  /**
   * Description: 采购平台新增SKU
   * Summary: 采购平台新增SKU
   */
  async addGoodsSkuEx(request: AddGoodsSkuRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AddGoodsSkuResponse> {
    Util.validateModel(request);
    return $tea.cast<AddGoodsSkuResponse>(await this.doRequest("1.0", "blockchain.bot.goods.sku.add", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AddGoodsSkuResponse({}));
  }

  /**
   * Description: Iotplatform-设备订单计费上传
   * Summary: Iotplatform-设备订单计费上传
   */
  async pushMeterdataOrder(request: PushMeterdataOrderRequest): Promise<PushMeterdataOrderResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pushMeterdataOrderEx(request, headers, runtime);
  }

  /**
   * Description: Iotplatform-设备订单计费上传
   * Summary: Iotplatform-设备订单计费上传
   */
  async pushMeterdataOrderEx(request: PushMeterdataOrderRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PushMeterdataOrderResponse> {
    Util.validateModel(request);
    return $tea.cast<PushMeterdataOrderResponse>(await this.doRequest("1.0", "blockchain.bot.meterdata.order.push", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PushMeterdataOrderResponse({}));
  }

  /**
   * Description: 3c商品开通消息转发
   * Summary: 3c商品开通消息转发
   */
  async openIotplantformProduct(request: OpenIotplantformProductRequest): Promise<OpenIotplantformProductResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.openIotplantformProductEx(request, headers, runtime);
  }

  /**
   * Description: 3c商品开通消息转发
   * Summary: 3c商品开通消息转发
   */
  async openIotplantformProductEx(request: OpenIotplantformProductRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<OpenIotplantformProductResponse> {
    Util.validateModel(request);
    return $tea.cast<OpenIotplantformProductResponse>(await this.doRequest("1.0", "blockchain.bot.iotplantform.product.open", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new OpenIotplantformProductResponse({}));
  }

  /**
   * Description: 3c商品停止消息转发
   * Summary: 3c商品停止消息转发
   */
  async stopIotplantformProduct(request: StopIotplantformProductRequest): Promise<StopIotplantformProductResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.stopIotplantformProductEx(request, headers, runtime);
  }

  /**
   * Description: 3c商品停止消息转发
   * Summary: 3c商品停止消息转发
   */
  async stopIotplantformProductEx(request: StopIotplantformProductRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<StopIotplantformProductResponse> {
    Util.validateModel(request);
    return $tea.cast<StopIotplantformProductResponse>(await this.doRequest("1.0", "blockchain.bot.iotplantform.product.stop", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new StopIotplantformProductResponse({}));
  }

  /**
   * Description: 3c商品恢复消息转发
   * Summary: 3c商品恢复消息转发
   */
  async resumeIotplantformProduct(request: ResumeIotplantformProductRequest): Promise<ResumeIotplantformProductResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.resumeIotplantformProductEx(request, headers, runtime);
  }

  /**
   * Description: 3c商品恢复消息转发
   * Summary: 3c商品恢复消息转发
   */
  async resumeIotplantformProductEx(request: ResumeIotplantformProductRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ResumeIotplantformProductResponse> {
    Util.validateModel(request);
    return $tea.cast<ResumeIotplantformProductResponse>(await this.doRequest("1.0", "blockchain.bot.iotplantform.product.resume", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ResumeIotplantformProductResponse({}));
  }

  /**
   * Description: 创建数据模型
   * Summary: 创建数据模型
   */
  async createDeviceDatamodel(request: CreateDeviceDatamodelRequest): Promise<CreateDeviceDatamodelResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createDeviceDatamodelEx(request, headers, runtime);
  }

  /**
   * Description: 创建数据模型
   * Summary: 创建数据模型
   */
  async createDeviceDatamodelEx(request: CreateDeviceDatamodelRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateDeviceDatamodelResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateDeviceDatamodelResponse>(await this.doRequest("1.0", "blockchain.bot.device.datamodel.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateDeviceDatamodelResponse({}));
  }

  /**
   * Description: 获取数据模型
   * Summary: 获取数据模型
   */
  async getDeviceDatamodel(request: GetDeviceDatamodelRequest): Promise<GetDeviceDatamodelResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getDeviceDatamodelEx(request, headers, runtime);
  }

  /**
   * Description: 获取数据模型
   * Summary: 获取数据模型
   */
  async getDeviceDatamodelEx(request: GetDeviceDatamodelRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetDeviceDatamodelResponse> {
    Util.validateModel(request);
    return $tea.cast<GetDeviceDatamodelResponse>(await this.doRequest("1.0", "blockchain.bot.device.datamodel.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetDeviceDatamodelResponse({}));
  }

  /**
   * Description: 注册设备
   * Summary: 注册设备
   */
  async importDevice(request: ImportDeviceRequest): Promise<ImportDeviceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.importDeviceEx(request, headers, runtime);
  }

  /**
   * Description: 注册设备
   * Summary: 注册设备
   */
  async importDeviceEx(request: ImportDeviceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ImportDeviceResponse> {
    Util.validateModel(request);
    return $tea.cast<ImportDeviceResponse>(await this.doRequest("1.0", "blockchain.bot.device.import", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ImportDeviceResponse({}));
  }

  /**
   * Description: 通过chainId获取设备详情
   * Summary: 通过chainId获取设备详情
   */
  async getDeviceBychainid(request: GetDeviceBychainidRequest): Promise<GetDeviceBychainidResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getDeviceBychainidEx(request, headers, runtime);
  }

  /**
   * Description: 通过chainId获取设备详情
   * Summary: 通过chainId获取设备详情
   */
  async getDeviceBychainidEx(request: GetDeviceBychainidRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetDeviceBychainidResponse> {
    Util.validateModel(request);
    return $tea.cast<GetDeviceBychainidResponse>(await this.doRequest("1.0", "blockchain.bot.device.bychainid.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetDeviceBychainidResponse({}));
  }

  /**
   * Description: 通过deviceId获取设备详情
   * Summary: 通过deviceId获取设备详情
   */
  async getDeviceBydeviceid(request: GetDeviceBydeviceidRequest): Promise<GetDeviceBydeviceidResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getDeviceBydeviceidEx(request, headers, runtime);
  }

  /**
   * Description: 通过deviceId获取设备详情
   * Summary: 通过deviceId获取设备详情
   */
  async getDeviceBydeviceidEx(request: GetDeviceBydeviceidRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetDeviceBydeviceidResponse> {
    Util.validateModel(request);
    return $tea.cast<GetDeviceBydeviceidResponse>(await this.doRequest("1.0", "blockchain.bot.device.bydeviceid.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetDeviceBydeviceidResponse({}));
  }

  /**
   * Description: 通过场景码列举设备
   * Summary: 通过场景码列举设备
   */
  async listDeviceByscene(request: ListDeviceBysceneRequest): Promise<ListDeviceBysceneResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listDeviceBysceneEx(request, headers, runtime);
  }

  /**
   * Description: 通过场景码列举设备
   * Summary: 通过场景码列举设备
   */
  async listDeviceBysceneEx(request: ListDeviceBysceneRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListDeviceBysceneResponse> {
    Util.validateModel(request);
    return $tea.cast<ListDeviceBysceneResponse>(await this.doRequest("1.0", "blockchain.bot.device.byscene.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListDeviceBysceneResponse({}));
  }

  /**
   * Description: 更新设备信息
   * Summary: 更新设备信息
   */
  async updateDeviceInfo(request: UpdateDeviceInfoRequest): Promise<UpdateDeviceInfoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateDeviceInfoEx(request, headers, runtime);
  }

  /**
   * Description: 更新设备信息
   * Summary: 更新设备信息
   */
  async updateDeviceInfoEx(request: UpdateDeviceInfoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateDeviceInfoResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateDeviceInfoResponse>(await this.doRequest("1.0", "blockchain.bot.device.info.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateDeviceInfoResponse({}));
  }

  /**
   * Description: 通过deviceId发行设备
   * Summary: 通过deviceId发行设备
   */
  async createDistributedeviceBydeviceid(request: CreateDistributedeviceBydeviceidRequest): Promise<CreateDistributedeviceBydeviceidResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createDistributedeviceBydeviceidEx(request, headers, runtime);
  }

  /**
   * Description: 通过deviceId发行设备
   * Summary: 通过deviceId发行设备
   */
  async createDistributedeviceBydeviceidEx(request: CreateDistributedeviceBydeviceidRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateDistributedeviceBydeviceidResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateDistributedeviceBydeviceidResponse>(await this.doRequest("1.0", "blockchain.bot.distributedevice.bydeviceid.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateDistributedeviceBydeviceidResponse({}));
  }

  /**
   * Description: 通过链上设备Id发行
   * Summary: 通过链上设备Id发行
   */
  async createDistributedeviceBychainid(request: CreateDistributedeviceBychainidRequest): Promise<CreateDistributedeviceBychainidResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createDistributedeviceBychainidEx(request, headers, runtime);
  }

  /**
   * Description: 通过链上设备Id发行
   * Summary: 通过链上设备Id发行
   */
  async createDistributedeviceBychainidEx(request: CreateDistributedeviceBychainidRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateDistributedeviceBychainidResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateDistributedeviceBychainidResponse>(await this.doRequest("1.0", "blockchain.bot.distributedevice.bychainid.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateDistributedeviceBychainidResponse({}));
  }

  /**
   * Description: 替换发行设备
   * Summary: 替换发行设备
   */
  async replaceDistributedeviceBychainid(request: ReplaceDistributedeviceBychainidRequest): Promise<ReplaceDistributedeviceBychainidResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.replaceDistributedeviceBychainidEx(request, headers, runtime);
  }

  /**
   * Description: 替换发行设备
   * Summary: 替换发行设备
   */
  async replaceDistributedeviceBychainidEx(request: ReplaceDistributedeviceBychainidRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ReplaceDistributedeviceBychainidResponse> {
    Util.validateModel(request);
    return $tea.cast<ReplaceDistributedeviceBychainidResponse>(await this.doRequest("1.0", "blockchain.bot.distributedevice.bychainid.replace", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ReplaceDistributedeviceBychainidResponse({}));
  }

  /**
   * Description: 上传单个设备所产生的设备数据 
   * Summary: 上传设备数据
   */
  async sendCollectorBychainid(request: SendCollectorBychainidRequest): Promise<SendCollectorBychainidResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.sendCollectorBychainidEx(request, headers, runtime);
  }

  /**
   * Description: 上传单个设备所产生的设备数据 
   * Summary: 上传设备数据
   */
  async sendCollectorBychainidEx(request: SendCollectorBychainidRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SendCollectorBychainidResponse> {
    Util.validateModel(request);
    return $tea.cast<SendCollectorBychainidResponse>(await this.doRequest("1.0", "blockchain.bot.collector.bychainid.send", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SendCollectorBychainidResponse({}));
  }

  /**
   * Description: 通过Id获取发行设备
   * Summary: 通过Id获取发行设备
   */
  async getDistributedeviceBychainid(request: GetDistributedeviceBychainidRequest): Promise<GetDistributedeviceBychainidResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getDistributedeviceBychainidEx(request, headers, runtime);
  }

  /**
   * Description: 通过Id获取发行设备
   * Summary: 通过Id获取发行设备
   */
  async getDistributedeviceBychainidEx(request: GetDistributedeviceBychainidRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetDistributedeviceBychainidResponse> {
    Util.validateModel(request);
    return $tea.cast<GetDistributedeviceBychainidResponse>(await this.doRequest("1.0", "blockchain.bot.distributedevice.bychainid.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetDistributedeviceBychainidResponse({}));
  }

  /**
   * Description: 通过场景码列举发行设备
   * Summary: 通过场景码列举发行设备
   */
  async listDistributedeviceByscene(request: ListDistributedeviceBysceneRequest): Promise<ListDistributedeviceBysceneResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listDistributedeviceBysceneEx(request, headers, runtime);
  }

  /**
   * Description: 通过场景码列举发行设备
   * Summary: 通过场景码列举发行设备
   */
  async listDistributedeviceBysceneEx(request: ListDistributedeviceBysceneRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListDistributedeviceBysceneResponse> {
    Util.validateModel(request);
    return $tea.cast<ListDistributedeviceBysceneResponse>(await this.doRequest("1.0", "blockchain.bot.distributedevice.byscene.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListDistributedeviceBysceneResponse({}));
  }

  /**
   * Description: 创建消费者
   * Summary: 创建消费者
   */
  async createConsumer(request: CreateConsumerRequest): Promise<CreateConsumerResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createConsumerEx(request, headers, runtime);
  }

  /**
   * Description: 创建消费者
   * Summary: 创建消费者
   */
  async createConsumerEx(request: CreateConsumerRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateConsumerResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateConsumerResponse>(await this.doRequest("1.0", "blockchain.bot.consumer.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateConsumerResponse({}));
  }

  /**
   * Description: 消费者订阅
   * Summary: 消费者订阅
   */
  async setConsumerSubscribe(request: SetConsumerSubscribeRequest): Promise<SetConsumerSubscribeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.setConsumerSubscribeEx(request, headers, runtime);
  }

  /**
   * Description: 消费者订阅
   * Summary: 消费者订阅
   */
  async setConsumerSubscribeEx(request: SetConsumerSubscribeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SetConsumerSubscribeResponse> {
    Util.validateModel(request);
    return $tea.cast<SetConsumerSubscribeResponse>(await this.doRequest("1.0", "blockchain.bot.consumer.subscribe.set", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SetConsumerSubscribeResponse({}));
  }

  /**
   * Description: 消费者取消订阅设备
   * Summary: 消费者取消订阅设备
   */
  async setConsumerUnsubscribe(request: SetConsumerUnsubscribeRequest): Promise<SetConsumerUnsubscribeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.setConsumerUnsubscribeEx(request, headers, runtime);
  }

  /**
   * Description: 消费者取消订阅设备
   * Summary: 消费者取消订阅设备
   */
  async setConsumerUnsubscribeEx(request: SetConsumerUnsubscribeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SetConsumerUnsubscribeResponse> {
    Util.validateModel(request);
    return $tea.cast<SetConsumerUnsubscribeResponse>(await this.doRequest("1.0", "blockchain.bot.consumer.unsubscribe.set", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SetConsumerUnsubscribeResponse({}));
  }

  /**
   * Description: 消费者获取数据
   * Summary: 消费者获取数据
   */
  async pullConsumerDatasource(request: PullConsumerDatasourceRequest): Promise<PullConsumerDatasourceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pullConsumerDatasourceEx(request, headers, runtime);
  }

  /**
   * Description: 消费者获取数据
   * Summary: 消费者获取数据
   */
  async pullConsumerDatasourceEx(request: PullConsumerDatasourceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PullConsumerDatasourceResponse> {
    Util.validateModel(request);
    return $tea.cast<PullConsumerDatasourceResponse>(await this.doRequest("1.0", "blockchain.bot.consumer.datasource.pull", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PullConsumerDatasourceResponse({}));
  }

  /**
   * Description: 通过设备id获取发行设备详情
   * Summary: 通过设备id获取发行设备详情
   */
  async getDistributedeviceBydeviceid(request: GetDistributedeviceBydeviceidRequest): Promise<GetDistributedeviceBydeviceidResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getDistributedeviceBydeviceidEx(request, headers, runtime);
  }

  /**
   * Description: 通过设备id获取发行设备详情
   * Summary: 通过设备id获取发行设备详情
   */
  async getDistributedeviceBydeviceidEx(request: GetDistributedeviceBydeviceidRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetDistributedeviceBydeviceidResponse> {
    Util.validateModel(request);
    return $tea.cast<GetDistributedeviceBydeviceidResponse>(await this.doRequest("1.0", "blockchain.bot.distributedevice.bydeviceid.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetDistributedeviceBydeviceidResponse({}));
  }

  /**
   * Description: 通过发行id获取设备
   * Summary: 通过发行id获取设备
   */
  async getDistributedeviceBydisid(request: GetDistributedeviceBydisidRequest): Promise<GetDistributedeviceBydisidResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getDistributedeviceBydisidEx(request, headers, runtime);
  }

  /**
   * Description: 通过发行id获取设备
   * Summary: 通过发行id获取设备
   */
  async getDistributedeviceBydisidEx(request: GetDistributedeviceBydisidRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetDistributedeviceBydisidResponse> {
    Util.validateModel(request);
    return $tea.cast<GetDistributedeviceBydisidResponse>(await this.doRequest("1.0", "blockchain.bot.distributedevice.bydisid.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetDistributedeviceBydisidResponse({}));
  }

  /**
   * Description: 注册外围设备
   * Summary: 注册外围设备
   */
  async importPeripheral(request: ImportPeripheralRequest): Promise<ImportPeripheralResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.importPeripheralEx(request, headers, runtime);
  }

  /**
   * Description: 注册外围设备
   * Summary: 注册外围设备
   */
  async importPeripheralEx(request: ImportPeripheralRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ImportPeripheralResponse> {
    Util.validateModel(request);
    return $tea.cast<ImportPeripheralResponse>(await this.doRequest("1.0", "blockchain.bot.peripheral.import", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ImportPeripheralResponse({}));
  }

  /**
   * Description: 通过链上外围设备ID获取详情
   * Summary: 通过链上外围设备ID获取详情
   */
  async getPeripheralBychainperipheralid(request: GetPeripheralBychainperipheralidRequest): Promise<GetPeripheralBychainperipheralidResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getPeripheralBychainperipheralidEx(request, headers, runtime);
  }

  /**
   * Description: 通过链上外围设备ID获取详情
   * Summary: 通过链上外围设备ID获取详情
   */
  async getPeripheralBychainperipheralidEx(request: GetPeripheralBychainperipheralidRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetPeripheralBychainperipheralidResponse> {
    Util.validateModel(request);
    return $tea.cast<GetPeripheralBychainperipheralidResponse>(await this.doRequest("1.0", "blockchain.bot.peripheral.bychainperipheralid.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetPeripheralBychainperipheralidResponse({}));
  }

  /**
   * Description: 通过外围设备ID获取详情
   * Summary: 通过外围设备ID获取详情
   */
  async getPeripheralByperipheralid(request: GetPeripheralByperipheralidRequest): Promise<GetPeripheralByperipheralidResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getPeripheralByperipheralidEx(request, headers, runtime);
  }

  /**
   * Description: 通过外围设备ID获取详情
   * Summary: 通过外围设备ID获取详情
   */
  async getPeripheralByperipheralidEx(request: GetPeripheralByperipheralidRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetPeripheralByperipheralidResponse> {
    Util.validateModel(request);
    return $tea.cast<GetPeripheralByperipheralidResponse>(await this.doRequest("1.0", "blockchain.bot.peripheral.byperipheralid.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetPeripheralByperipheralidResponse({}));
  }

  /**
   * Description: 根据场景列举外围设备
   * Summary: 根据场景列举外围设备
   */
  async listPeripheralByscene(request: ListPeripheralBysceneRequest): Promise<ListPeripheralBysceneResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listPeripheralBysceneEx(request, headers, runtime);
  }

  /**
   * Description: 根据场景列举外围设备
   * Summary: 根据场景列举外围设备
   */
  async listPeripheralBysceneEx(request: ListPeripheralBysceneRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListPeripheralBysceneResponse> {
    Util.validateModel(request);
    return $tea.cast<ListPeripheralBysceneResponse>(await this.doRequest("1.0", "blockchain.bot.peripheral.byscene.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListPeripheralBysceneResponse({}));
  }

  /**
   * Description: 通过外围设备Id发行
   * Summary: 通过外围设备Id发行
   */
  async createDistributedeviceByperipheralid(request: CreateDistributedeviceByperipheralidRequest): Promise<CreateDistributedeviceByperipheralidResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createDistributedeviceByperipheralidEx(request, headers, runtime);
  }

  /**
   * Description: 通过外围设备Id发行
   * Summary: 通过外围设备Id发行
   */
  async createDistributedeviceByperipheralidEx(request: CreateDistributedeviceByperipheralidRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateDistributedeviceByperipheralidResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateDistributedeviceByperipheralidResponse>(await this.doRequest("1.0", "blockchain.bot.distributedevice.byperipheralid.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateDistributedeviceByperipheralidResponse({}));
  }

  /**
   * Description: 通过链上外围设备Id发行
   * Summary: 通过链上外围设备Id发行
   */
  async createDistributedeviceBychainperipheralid(request: CreateDistributedeviceBychainperipheralidRequest): Promise<CreateDistributedeviceBychainperipheralidResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createDistributedeviceBychainperipheralidEx(request, headers, runtime);
  }

  /**
   * Description: 通过链上外围设备Id发行
   * Summary: 通过链上外围设备Id发行
   */
  async createDistributedeviceBychainperipheralidEx(request: CreateDistributedeviceBychainperipheralidRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateDistributedeviceBychainperipheralidResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateDistributedeviceBychainperipheralidResponse>(await this.doRequest("1.0", "blockchain.bot.distributedevice.bychainperipheralid.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateDistributedeviceBychainperipheralidResponse({}));
  }

  /**
   * Description: 替换发行外围设备 by 链上外围设备ID
   * Summary: 替换发行外围设备 by 链上外围设备ID
   */
  async replaceDistributedeviceBychainperipheralid(request: ReplaceDistributedeviceBychainperipheralidRequest): Promise<ReplaceDistributedeviceBychainperipheralidResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.replaceDistributedeviceBychainperipheralidEx(request, headers, runtime);
  }

  /**
   * Description: 替换发行外围设备 by 链上外围设备ID
   * Summary: 替换发行外围设备 by 链上外围设备ID
   */
  async replaceDistributedeviceBychainperipheralidEx(request: ReplaceDistributedeviceBychainperipheralidRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ReplaceDistributedeviceBychainperipheralidResponse> {
    Util.validateModel(request);
    return $tea.cast<ReplaceDistributedeviceBychainperipheralidResponse>(await this.doRequest("1.0", "blockchain.bot.distributedevice.bychainperipheralid.replace", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ReplaceDistributedeviceBychainperipheralidResponse({}));
  }

  /**
   * Description: 根据场景列举发行外围设备
   * Summary: 根据场景列举发行外围设备
   */
  async listDistributedeviceByperipheralscene(request: ListDistributedeviceByperipheralsceneRequest): Promise<ListDistributedeviceByperipheralsceneResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listDistributedeviceByperipheralsceneEx(request, headers, runtime);
  }

  /**
   * Description: 根据场景列举发行外围设备
   * Summary: 根据场景列举发行外围设备
   */
  async listDistributedeviceByperipheralsceneEx(request: ListDistributedeviceByperipheralsceneRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListDistributedeviceByperipheralsceneResponse> {
    Util.validateModel(request);
    return $tea.cast<ListDistributedeviceByperipheralsceneResponse>(await this.doRequest("1.0", "blockchain.bot.distributedevice.byperipheralscene.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListDistributedeviceByperipheralsceneResponse({}));
  }

  /**
   * Description: 通过外围设备ID获取发行外围设备信息
   * Summary: 通过外围设备ID获取发行外围设备信息
   */
  async getDistributedeviceByperipheralid(request: GetDistributedeviceByperipheralidRequest): Promise<GetDistributedeviceByperipheralidResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getDistributedeviceByperipheralidEx(request, headers, runtime);
  }

  /**
   * Description: 通过外围设备ID获取发行外围设备信息
   * Summary: 通过外围设备ID获取发行外围设备信息
   */
  async getDistributedeviceByperipheralidEx(request: GetDistributedeviceByperipheralidRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetDistributedeviceByperipheralidResponse> {
    Util.validateModel(request);
    return $tea.cast<GetDistributedeviceByperipheralidResponse>(await this.doRequest("1.0", "blockchain.bot.distributedevice.byperipheralid.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetDistributedeviceByperipheralidResponse({}));
  }

  /**
   * Description: 发行设备by_devcie
   * Summary: 发行设备by_devcie
   */
  async createDistributedeviceBydevice(request: CreateDistributedeviceBydeviceRequest): Promise<CreateDistributedeviceBydeviceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createDistributedeviceBydeviceEx(request, headers, runtime);
  }

  /**
   * Description: 发行设备by_devcie
   * Summary: 发行设备by_devcie
   */
  async createDistributedeviceBydeviceEx(request: CreateDistributedeviceBydeviceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateDistributedeviceBydeviceResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateDistributedeviceBydeviceResponse>(await this.doRequest("1.0", "blockchain.bot.distributedevice.bydevice.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateDistributedeviceBydeviceResponse({}));
  }

  /**
   * Description: 远程任务创建
   * Summary: 远程任务创建
   */
  async createTask(request: CreateTaskRequest): Promise<CreateTaskResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createTaskEx(request, headers, runtime);
  }

  /**
   * Description: 远程任务创建
   * Summary: 远程任务创建
   */
  async createTaskEx(request: CreateTaskRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateTaskResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateTaskResponse>(await this.doRequest("1.0", "blockchain.bot.task.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateTaskResponse({}));
  }

  /**
   * Description: 远程任务查询
   * Summary: 远程任务查询
   */
  async queryTask(request: QueryTaskRequest): Promise<QueryTaskResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryTaskEx(request, headers, runtime);
  }

  /**
   * Description: 远程任务查询
   * Summary: 远程任务查询
   */
  async queryTaskEx(request: QueryTaskRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryTaskResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryTaskResponse>(await this.doRequest("1.0", "blockchain.bot.task.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryTaskResponse({}));
  }

  /**
   * Description: 分析数据查询
   * Summary: 分析数据查询
   */
  async queryAnalysis(request: QueryAnalysisRequest): Promise<QueryAnalysisResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAnalysisEx(request, headers, runtime);
  }

  /**
   * Description: 分析数据查询
   * Summary: 分析数据查询
   */
  async queryAnalysisEx(request: QueryAnalysisRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAnalysisResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAnalysisResponse>(await this.doRequest("1.0", "blockchain.bot.analysis.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAnalysisResponse({}));
  }

  /**
   * Description: 上传数据mul（可能是多个不同的设备分别产生的多条数据）
   * Summary: 上传设备数据mul
   */
  async sendCollectorBychainidmul(request: SendCollectorBychainidmulRequest): Promise<SendCollectorBychainidmulResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.sendCollectorBychainidmulEx(request, headers, runtime);
  }

  /**
   * Description: 上传数据mul（可能是多个不同的设备分别产生的多条数据）
   * Summary: 上传设备数据mul
   */
  async sendCollectorBychainidmulEx(request: SendCollectorBychainidmulRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SendCollectorBychainidmulResponse> {
    Util.validateModel(request);
    return $tea.cast<SendCollectorBychainidmulResponse>(await this.doRequest("1.0", "blockchain.bot.collector.bychainidmul.send", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SendCollectorBychainidmulResponse({}));
  }

  /**
   * Description: 上传设备业务数据
   * Summary: 上传设备业务数据
   */
  async sendCollectorDevicebizdata(request: SendCollectorDevicebizdataRequest): Promise<SendCollectorDevicebizdataResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.sendCollectorDevicebizdataEx(request, headers, runtime);
  }

  /**
   * Description: 上传设备业务数据
   * Summary: 上传设备业务数据
   */
  async sendCollectorDevicebizdataEx(request: SendCollectorDevicebizdataRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SendCollectorDevicebizdataResponse> {
    Util.validateModel(request);
    return $tea.cast<SendCollectorDevicebizdataResponse>(await this.doRequest("1.0", "blockchain.bot.collector.devicebizdata.send", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SendCollectorDevicebizdataResponse({}));
  }

  /**
   * Description: 更新设备信息by_devcie
   * Summary: 更新设备信息by_devcie
   */
  async updateDeviceInfobydevice(request: UpdateDeviceInfobydeviceRequest): Promise<UpdateDeviceInfobydeviceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateDeviceInfobydeviceEx(request, headers, runtime);
  }

  /**
   * Description: 更新设备信息by_devcie
   * Summary: 更新设备信息by_devcie
   */
  async updateDeviceInfobydeviceEx(request: UpdateDeviceInfobydeviceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateDeviceInfobydeviceResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateDeviceInfobydeviceResponse>(await this.doRequest("1.0", "blockchain.bot.device.infobydevice.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateDeviceInfobydeviceResponse({}));
  }

  /**
   * Description: 下线设备
   * Summary: 下线设备
   */
  async offlineDevice(request: OfflineDeviceRequest): Promise<OfflineDeviceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.offlineDeviceEx(request, headers, runtime);
  }

  /**
   * Description: 下线设备
   * Summary: 下线设备
   */
  async offlineDeviceEx(request: OfflineDeviceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<OfflineDeviceResponse> {
    Util.validateModel(request);
    return $tea.cast<OfflineDeviceResponse>(await this.doRequest("1.0", "blockchain.bot.device.offline", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new OfflineDeviceResponse({}));
  }

  /**
   * Description: 申请MQTT token
   * Summary: 申请MQTT token
   */
  async applyMqtoken(request: ApplyMqtokenRequest): Promise<ApplyMqtokenResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.applyMqtokenEx(request, headers, runtime);
  }

  /**
   * Description: 申请MQTT token
   * Summary: 申请MQTT token
   */
  async applyMqtokenEx(request: ApplyMqtokenRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ApplyMqtokenResponse> {
    Util.validateModel(request);
    return $tea.cast<ApplyMqtokenResponse>(await this.doRequest("1.0", "blockchain.bot.mqtoken.apply", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ApplyMqtokenResponse({}));
  }

  /**
   * Description: 查询设备所注册的公钥是否正确
   * Summary: 查询注册信息
   */
  async queryDeviceRegistration(request: QueryDeviceRegistrationRequest): Promise<QueryDeviceRegistrationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryDeviceRegistrationEx(request, headers, runtime);
  }

  /**
   * Description: 查询设备所注册的公钥是否正确
   * Summary: 查询注册信息
   */
  async queryDeviceRegistrationEx(request: QueryDeviceRegistrationRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryDeviceRegistrationResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDeviceRegistrationResponse>(await this.doRequest("1.0", "blockchain.bot.device.registration.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryDeviceRegistrationResponse({}));
  }

  /**
   * Description: 设备异常上报
   * Summary: 设备异常上报
   */
  async addAbnormal(request: AddAbnormalRequest): Promise<AddAbnormalResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.addAbnormalEx(request, headers, runtime);
  }

  /**
   * Description: 设备异常上报
   * Summary: 设备异常上报
   */
  async addAbnormalEx(request: AddAbnormalRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AddAbnormalResponse> {
    Util.validateModel(request);
    return $tea.cast<AddAbnormalResponse>(await this.doRequest("1.0", "blockchain.bot.abnormal.add", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AddAbnormalResponse({}));
  }

  /**
   * Description: 设备下线后，可通过此接口重新上线
   * Summary: 设置设备状态为上线
   */
  async onlineDevice(request: OnlineDeviceRequest): Promise<OnlineDeviceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.onlineDeviceEx(request, headers, runtime);
  }

  /**
   * Description: 设备下线后，可通过此接口重新上线
   * Summary: 设置设备状态为上线
   */
  async onlineDeviceEx(request: OnlineDeviceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<OnlineDeviceResponse> {
    Util.validateModel(request);
    return $tea.cast<OnlineDeviceResponse>(await this.doRequest("1.0", "blockchain.bot.device.online", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new OnlineDeviceResponse({}));
  }

  /**
   * Description: 注销设备
   * Summary: 注销设备
   */
  async offlineDeviceByunregister(request: OfflineDeviceByunregisterRequest): Promise<OfflineDeviceByunregisterResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.offlineDeviceByunregisterEx(request, headers, runtime);
  }

  /**
   * Description: 注销设备
   * Summary: 注销设备
   */
  async offlineDeviceByunregisterEx(request: OfflineDeviceByunregisterRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<OfflineDeviceByunregisterResponse> {
    Util.validateModel(request);
    return $tea.cast<OfflineDeviceByunregisterResponse>(await this.doRequest("1.0", "blockchain.bot.device.byunregister.offline", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new OfflineDeviceByunregisterResponse({}));
  }

  /**
   * Description: 标签状态查询
   * Summary: 标签状态查询
   */
  async queryLabelTrace(request: QueryLabelTraceRequest): Promise<QueryLabelTraceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryLabelTraceEx(request, headers, runtime);
  }

  /**
   * Description: 标签状态查询
   * Summary: 标签状态查询
   */
  async queryLabelTraceEx(request: QueryLabelTraceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryLabelTraceResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryLabelTraceResponse>(await this.doRequest("1.0", "blockchain.bot.label.trace.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryLabelTraceResponse({}));
  }

  /**
   * Description: 标签流转状态同步
   * Summary: 标签流转状态同步
   */
  async syncLabelTransfer(request: SyncLabelTransferRequest): Promise<SyncLabelTransferResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.syncLabelTransferEx(request, headers, runtime);
  }

  /**
   * Description: 标签流转状态同步
   * Summary: 标签流转状态同步
   */
  async syncLabelTransferEx(request: SyncLabelTransferRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SyncLabelTransferResponse> {
    Util.validateModel(request);
    return $tea.cast<SyncLabelTransferResponse>(await this.doRequest("1.0", "blockchain.bot.label.transfer.sync", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SyncLabelTransferResponse({}));
  }

  /**
   * Description: 标签资产绑定
   * Summary: 标签资产绑定
   */
  async addLabelAsset(request: AddLabelAssetRequest): Promise<AddLabelAssetResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.addLabelAssetEx(request, headers, runtime);
  }

  /**
   * Description: 标签资产绑定
   * Summary: 标签资产绑定
   */
  async addLabelAssetEx(request: AddLabelAssetRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AddLabelAssetResponse> {
    Util.validateModel(request);
    return $tea.cast<AddLabelAssetResponse>(await this.doRequest("1.0", "blockchain.bot.label.asset.add", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AddLabelAssetResponse({}));
  }

  /**
   * Description: 通过tx_hash查询上链信息
   * Summary: 链上信息查询
   */
  async queryDataBytxhash(request: QueryDataBytxhashRequest): Promise<QueryDataBytxhashResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryDataBytxhashEx(request, headers, runtime);
  }

  /**
   * Description: 通过tx_hash查询上链信息
   * Summary: 链上信息查询
   */
  async queryDataBytxhashEx(request: QueryDataBytxhashRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryDataBytxhashResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDataBytxhashResponse>(await this.doRequest("1.0", "blockchain.bot.data.bytxhash.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryDataBytxhashResponse({}));
  }

  /**
   * Description: 根据taskId 执行未处理的任务
   * Summary: 执行未处理的任务
   */
  async execUnprocessedTask(request: ExecUnprocessedTaskRequest): Promise<ExecUnprocessedTaskResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.execUnprocessedTaskEx(request, headers, runtime);
  }

  /**
   * Description: 根据taskId 执行未处理的任务
   * Summary: 执行未处理的任务
   */
  async execUnprocessedTaskEx(request: ExecUnprocessedTaskRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExecUnprocessedTaskResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecUnprocessedTaskResponse>(await this.doRequest("1.0", "blockchain.bot.unprocessed.task.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExecUnprocessedTaskResponse({}));
  }

  /**
   * Description: 上传汇总数据
   * Summary: 上传汇总数据
   */
  async sendCollectorSummarydata(request: SendCollectorSummarydataRequest): Promise<SendCollectorSummarydataResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.sendCollectorSummarydataEx(request, headers, runtime);
  }

  /**
   * Description: 上传汇总数据
   * Summary: 上传汇总数据
   */
  async sendCollectorSummarydataEx(request: SendCollectorSummarydataRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SendCollectorSummarydataResponse> {
    Util.validateModel(request);
    return $tea.cast<SendCollectorSummarydataResponse>(await this.doRequest("1.0", "blockchain.bot.collector.summarydata.send", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SendCollectorSummarydataResponse({}));
  }

  /**
   * Description: 根据请求体内容保存密钥
   * Summary: 保存公钥
   */
  async addCertificate(request: AddCertificateRequest): Promise<AddCertificateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.addCertificateEx(request, headers, runtime);
  }

  /**
   * Description: 根据请求体内容保存密钥
   * Summary: 保存公钥
   */
  async addCertificateEx(request: AddCertificateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AddCertificateResponse> {
    Util.validateModel(request);
    return $tea.cast<AddCertificateResponse>(await this.doRequest("1.0", "blockchain.bot.certificate.add", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AddCertificateResponse({}));
  }

  /**
   * Description: 新增租户
   * Summary: 新增租户
   */
  async addTenant(request: AddTenantRequest): Promise<AddTenantResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.addTenantEx(request, headers, runtime);
  }

  /**
   * Description: 新增租户
   * Summary: 新增租户
   */
  async addTenantEx(request: AddTenantRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AddTenantResponse> {
    Util.validateModel(request);
    return $tea.cast<AddTenantResponse>(await this.doRequest("1.0", "blockchain.bot.tenant.add", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AddTenantResponse({}));
  }

  /**
   * Description: 新增场景码
   * Summary: 新增场景码
   */
  async addScene(request: AddSceneRequest): Promise<AddSceneResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.addSceneEx(request, headers, runtime);
  }

  /**
   * Description: 新增场景码
   * Summary: 新增场景码
   */
  async addSceneEx(request: AddSceneRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AddSceneResponse> {
    Util.validateModel(request);
    return $tea.cast<AddSceneResponse>(await this.doRequest("1.0", "blockchain.bot.scene.add", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AddSceneResponse({}));
  }

  /**
   * Description: 部署场景合同
   * Summary: 部署场景合同
   */
  async deployScene(request: DeploySceneRequest): Promise<DeploySceneResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deploySceneEx(request, headers, runtime);
  }

  /**
   * Description: 部署场景合同
   * Summary: 部署场景合同
   */
  async deploySceneEx(request: DeploySceneRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeploySceneResponse> {
    Util.validateModel(request);
    return $tea.cast<DeploySceneResponse>(await this.doRequest("1.0", "blockchain.bot.scene.deploy", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeploySceneResponse({}));
  }

  /**
   * Description: 新增sdk
   * Summary: 新增sdk
   */
  async addSdk(request: AddSdkRequest): Promise<AddSdkResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.addSdkEx(request, headers, runtime);
  }

  /**
   * Description: 新增sdk
   * Summary: 新增sdk
   */
  async addSdkEx(request: AddSdkRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AddSdkResponse> {
    Util.validateModel(request);
    return $tea.cast<AddSdkResponse>(await this.doRequest("1.0", "blockchain.bot.sdk.add", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AddSdkResponse({}));
  }

  /**
   * Description: 更新sdk
   * Summary: 更新sdk
   */
  async updateSdk(request: UpdateSdkRequest): Promise<UpdateSdkResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateSdkEx(request, headers, runtime);
  }

  /**
   * Description: 更新sdk
   * Summary: 更新sdk
   */
  async updateSdkEx(request: UpdateSdkRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateSdkResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateSdkResponse>(await this.doRequest("1.0", "blockchain.bot.sdk.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateSdkResponse({}));
  }

  /**
   * Description: 新增productKey
   * Summary: 新增productKey
   */
  async addProductkey(request: AddProductkeyRequest): Promise<AddProductkeyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.addProductkeyEx(request, headers, runtime);
  }

  /**
   * Description: 新增productKey
   * Summary: 新增productKey
   */
  async addProductkeyEx(request: AddProductkeyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AddProductkeyResponse> {
    Util.validateModel(request);
    return $tea.cast<AddProductkeyResponse>(await this.doRequest("1.0", "blockchain.bot.productkey.add", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AddProductkeyResponse({}));
  }

  /**
   * Description: 更新productKey
   * Summary: 更新productKey
   */
  async updateProductkey(request: UpdateProductkeyRequest): Promise<UpdateProductkeyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateProductkeyEx(request, headers, runtime);
  }

  /**
   * Description: 更新productKey
   * Summary: 更新productKey
   */
  async updateProductkeyEx(request: UpdateProductkeyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateProductkeyResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateProductkeyResponse>(await this.doRequest("1.0", "blockchain.bot.productkey.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateProductkeyResponse({}));
  }

  /**
   * Description: 更新租户
   * Summary: 更新租户
   */
  async updateTenant(request: UpdateTenantRequest): Promise<UpdateTenantResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateTenantEx(request, headers, runtime);
  }

  /**
   * Description: 更新租户
   * Summary: 更新租户
   */
  async updateTenantEx(request: UpdateTenantRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateTenantResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateTenantResponse>(await this.doRequest("1.0", "blockchain.bot.tenant.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateTenantResponse({}));
  }

  /**
   * Description: 更新场景码
   * Summary: 更新场景码
   */
  async updateScene(request: UpdateSceneRequest): Promise<UpdateSceneResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateSceneEx(request, headers, runtime);
  }

  /**
   * Description: 更新场景码
   * Summary: 更新场景码
   */
  async updateSceneEx(request: UpdateSceneRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateSceneResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateSceneResponse>(await this.doRequest("1.0", "blockchain.bot.scene.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateSceneResponse({}));
  }

  /**
   * Description: 上报标签流转的异步接口，是 blockchain.bot.label.transfer.sync的异步接口版本
   * Summary: 上报标签流转的异步接口
   */
  async sendLabelTransferonasync(request: SendLabelTransferonasyncRequest): Promise<SendLabelTransferonasyncResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.sendLabelTransferonasyncEx(request, headers, runtime);
  }

  /**
   * Description: 上报标签流转的异步接口，是 blockchain.bot.label.transfer.sync的异步接口版本
   * Summary: 上报标签流转的异步接口
   */
  async sendLabelTransferonasyncEx(request: SendLabelTransferonasyncRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SendLabelTransferonasyncResponse> {
    Util.validateModel(request);
    return $tea.cast<SendLabelTransferonasyncResponse>(await this.doRequest("1.0", "blockchain.bot.label.transferonasync.send", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SendLabelTransferonasyncResponse({}));
  }

  /**
   * Description: 调用异步接口后，在reponsePeriod 天内，可调用此接口查询异步接口的执行结果 
   * Summary: 异步接口结果查询
   */
  async queryAsyncRequest(request: QueryAsyncRequestRequest): Promise<QueryAsyncRequestResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAsyncRequestEx(request, headers, runtime);
  }

  /**
   * Description: 调用异步接口后，在reponsePeriod 天内，可调用此接口查询异步接口的执行结果 
   * Summary: 异步接口结果查询
   */
  async queryAsyncRequestEx(request: QueryAsyncRequestRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAsyncRequestResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAsyncRequestResponse>(await this.doRequest("1.0", "blockchain.bot.async.request.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAsyncRequestResponse({}));
  }

  /**
   * Description: 分页查询租户
   * Summary: 分页查询租户
   */
  async pagequeryTenant(request: PagequeryTenantRequest): Promise<PagequeryTenantResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pagequeryTenantEx(request, headers, runtime);
  }

  /**
   * Description: 分页查询租户
   * Summary: 分页查询租户
   */
  async pagequeryTenantEx(request: PagequeryTenantRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PagequeryTenantResponse> {
    Util.validateModel(request);
    return $tea.cast<PagequeryTenantResponse>(await this.doRequest("1.0", "blockchain.bot.tenant.pagequery", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PagequeryTenantResponse({}));
  }

  /**
   * Description: 分页查询场景码
   * Summary: 分页查询场景码
   */
  async pagequeryScene(request: PagequerySceneRequest): Promise<PagequerySceneResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pagequerySceneEx(request, headers, runtime);
  }

  /**
   * Description: 分页查询场景码
   * Summary: 分页查询场景码
   */
  async pagequerySceneEx(request: PagequerySceneRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PagequerySceneResponse> {
    Util.validateModel(request);
    return $tea.cast<PagequerySceneResponse>(await this.doRequest("1.0", "blockchain.bot.scene.pagequery", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PagequerySceneResponse({}));
  }

  /**
   * Description: 分页查询sdk
   * Summary: 分页查询sdk
   */
  async pagequerySdk(request: PagequerySdkRequest): Promise<PagequerySdkResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pagequerySdkEx(request, headers, runtime);
  }

  /**
   * Description: 分页查询sdk
   * Summary: 分页查询sdk
   */
  async pagequerySdkEx(request: PagequerySdkRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PagequerySdkResponse> {
    Util.validateModel(request);
    return $tea.cast<PagequerySdkResponse>(await this.doRequest("1.0", "blockchain.bot.sdk.pagequery", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PagequerySdkResponse({}));
  }

  /**
   * Description: 分页查询productKey
   * Summary: 分页查询productKey
   */
  async pagequeryProductkey(request: PagequeryProductkeyRequest): Promise<PagequeryProductkeyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pagequeryProductkeyEx(request, headers, runtime);
  }

  /**
   * Description: 分页查询productKey
   * Summary: 分页查询productKey
   */
  async pagequeryProductkeyEx(request: PagequeryProductkeyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PagequeryProductkeyResponse> {
    Util.validateModel(request);
    return $tea.cast<PagequeryProductkeyResponse>(await this.doRequest("1.0", "blockchain.bot.productkey.pagequery", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PagequeryProductkeyResponse({}));
  }

  /**
   * Description: 分页查询校验失败的数据
   * Summary: 分页查询校验失败的数据
   */
  async pagequeryDataverifyFailure(request: PagequeryDataverifyFailureRequest): Promise<PagequeryDataverifyFailureResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pagequeryDataverifyFailureEx(request, headers, runtime);
  }

  /**
   * Description: 分页查询校验失败的数据
   * Summary: 分页查询校验失败的数据
   */
  async pagequeryDataverifyFailureEx(request: PagequeryDataverifyFailureRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PagequeryDataverifyFailureResponse> {
    Util.validateModel(request);
    return $tea.cast<PagequeryDataverifyFailureResponse>(await this.doRequest("1.0", "blockchain.bot.dataverify.failure.pagequery", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PagequeryDataverifyFailureResponse({}));
  }

  /**
   * Description:  新增告警策略
   * Summary:  新增告警策略
   */
  async addAlertStrategy(request: AddAlertStrategyRequest): Promise<AddAlertStrategyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.addAlertStrategyEx(request, headers, runtime);
  }

  /**
   * Description:  新增告警策略
   * Summary:  新增告警策略
   */
  async addAlertStrategyEx(request: AddAlertStrategyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AddAlertStrategyResponse> {
    Util.validateModel(request);
    return $tea.cast<AddAlertStrategyResponse>(await this.doRequest("1.0", "blockchain.bot.alert.strategy.add", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AddAlertStrategyResponse({}));
  }

  /**
   * Description: 更新告警策略接口
   * Summary: 更新告警策略接口
   */
  async updateAlertStrategy(request: UpdateAlertStrategyRequest): Promise<UpdateAlertStrategyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateAlertStrategyEx(request, headers, runtime);
  }

  /**
   * Description: 更新告警策略接口
   * Summary: 更新告警策略接口
   */
  async updateAlertStrategyEx(request: UpdateAlertStrategyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateAlertStrategyResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateAlertStrategyResponse>(await this.doRequest("1.0", "blockchain.bot.alert.strategy.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateAlertStrategyResponse({}));
  }

  /**
   * Description: 分页查询告警策略接口
   * Summary: 分页查询告警策略接口
   */
  async pagequeryAlertStrategy(request: PagequeryAlertStrategyRequest): Promise<PagequeryAlertStrategyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pagequeryAlertStrategyEx(request, headers, runtime);
  }

  /**
   * Description: 分页查询告警策略接口
   * Summary: 分页查询告警策略接口
   */
  async pagequeryAlertStrategyEx(request: PagequeryAlertStrategyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PagequeryAlertStrategyResponse> {
    Util.validateModel(request);
    return $tea.cast<PagequeryAlertStrategyResponse>(await this.doRequest("1.0", "blockchain.bot.alert.strategy.pagequery", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PagequeryAlertStrategyResponse({}));
  }

  /**
   * Description: 标签流转状态同步（元数据，无签名）
   * Summary: 标签流转状态同步（元数据，无签名）
   */
  async syncLabelTransferraw(request: SyncLabelTransferrawRequest): Promise<SyncLabelTransferrawResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.syncLabelTransferrawEx(request, headers, runtime);
  }

  /**
   * Description: 标签流转状态同步（元数据，无签名）
   * Summary: 标签流转状态同步（元数据，无签名）
   */
  async syncLabelTransferrawEx(request: SyncLabelTransferrawRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SyncLabelTransferrawResponse> {
    Util.validateModel(request);
    return $tea.cast<SyncLabelTransferrawResponse>(await this.doRequest("1.0", "blockchain.bot.label.transferraw.sync", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SyncLabelTransferrawResponse({}));
  }

  /**
   * Description: 上报标签流转的异步接口（元数据，无签名），是 blockchain.bot.label.transferraw.sync的异步接口版本
   * Summary: 上报标签流转的异步接口（元数据，无签名）
   */
  async sendLabelTransferrawonasync(request: SendLabelTransferrawonasyncRequest): Promise<SendLabelTransferrawonasyncResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.sendLabelTransferrawonasyncEx(request, headers, runtime);
  }

  /**
   * Description: 上报标签流转的异步接口（元数据，无签名），是 blockchain.bot.label.transferraw.sync的异步接口版本
   * Summary: 上报标签流转的异步接口（元数据，无签名）
   */
  async sendLabelTransferrawonasyncEx(request: SendLabelTransferrawonasyncRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SendLabelTransferrawonasyncResponse> {
    Util.validateModel(request);
    return $tea.cast<SendLabelTransferrawonasyncResponse>(await this.doRequest("1.0", "blockchain.bot.label.transferrawonasync.send", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SendLabelTransferrawonasyncResponse({}));
  }

  /**
   * Description: 根据接口名和关键key（deviceId等）, 查询验收已对接的数据
   * Summary: 查询验收已对接的数据
   */
  async queryDockedData(request: QueryDockedDataRequest): Promise<QueryDockedDataResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryDockedDataEx(request, headers, runtime);
  }

  /**
   * Description: 根据接口名和关键key（deviceId等）, 查询验收已对接的数据
   * Summary: 查询验收已对接的数据
   */
  async queryDockedDataEx(request: QueryDockedDataRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryDockedDataResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDockedDataResponse>(await this.doRequest("1.0", "blockchain.bot.docked.data.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryDockedDataResponse({}));
  }

  /**
   * Description: 创建实体关联关系
   * Summary: 创建实体关联关系
   */
  async createDeviceRelation(request: CreateDeviceRelationRequest): Promise<CreateDeviceRelationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createDeviceRelationEx(request, headers, runtime);
  }

  /**
   * Description: 创建实体关联关系
   * Summary: 创建实体关联关系
   */
  async createDeviceRelationEx(request: CreateDeviceRelationRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateDeviceRelationResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateDeviceRelationResponse>(await this.doRequest("1.0", "blockchain.bot.device.relation.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateDeviceRelationResponse({}));
  }

  /**
   * Description: 删除实体关联关系
   * Summary: 删除实体关联关系
   */
  async deleteDeviceRelation(request: DeleteDeviceRelationRequest): Promise<DeleteDeviceRelationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteDeviceRelationEx(request, headers, runtime);
  }

  /**
   * Description: 删除实体关联关系
   * Summary: 删除实体关联关系
   */
  async deleteDeviceRelationEx(request: DeleteDeviceRelationRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteDeviceRelationResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteDeviceRelationResponse>(await this.doRequest("1.0", "blockchain.bot.device.relation.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteDeviceRelationResponse({}));
  }

  /**
   * Description: 推送单个设备所产生的设备数据
   * Summary: 推送设备数据
   */
  async pushCollectotBychainid(request: PushCollectotBychainidRequest): Promise<PushCollectotBychainidResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pushCollectotBychainidEx(request, headers, runtime);
  }

  /**
   * Description: 推送单个设备所产生的设备数据
   * Summary: 推送设备数据
   */
  async pushCollectotBychainidEx(request: PushCollectotBychainidRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PushCollectotBychainidResponse> {
    Util.validateModel(request);
    return $tea.cast<PushCollectotBychainidResponse>(await this.doRequest("1.0", "blockchain.bot.collectot.bychainid.push", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PushCollectotBychainidResponse({}));
  }

  /**
   * Description: 推送设备状态变更信息
   * Summary: 推送设备状态变更信息
   */
  async notifyPullstrategyChangestatus(request: NotifyPullstrategyChangestatusRequest): Promise<NotifyPullstrategyChangestatusResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.notifyPullstrategyChangestatusEx(request, headers, runtime);
  }

  /**
   * Description: 推送设备状态变更信息
   * Summary: 推送设备状态变更信息
   */
  async notifyPullstrategyChangestatusEx(request: NotifyPullstrategyChangestatusRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<NotifyPullstrategyChangestatusResponse> {
    Util.validateModel(request);
    return $tea.cast<NotifyPullstrategyChangestatusResponse>(await this.doRequest("1.0", "blockchain.bot.pullstrategy.changestatus.notify", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new NotifyPullstrategyChangestatusResponse({}));
  }

  /**
   * Description: 推送订单信息
   * Summary: 推送订单信息
   */
  async notifyPullstrategyChargeorderinfo(request: NotifyPullstrategyChargeorderinfoRequest): Promise<NotifyPullstrategyChargeorderinfoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.notifyPullstrategyChargeorderinfoEx(request, headers, runtime);
  }

  /**
   * Description: 推送订单信息
   * Summary: 推送订单信息
   */
  async notifyPullstrategyChargeorderinfoEx(request: NotifyPullstrategyChargeorderinfoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<NotifyPullstrategyChargeorderinfoResponse> {
    Util.validateModel(request);
    return $tea.cast<NotifyPullstrategyChargeorderinfoResponse>(await this.doRequest("1.0", "blockchain.bot.pullstrategy.chargeorderinfo.notify", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new NotifyPullstrategyChargeorderinfoResponse({}));
  }

  /**
   * Description: 菜鸟设备监控信息获取
   * Summary: 菜鸟设备监控信息获取
   */
  async queryScfleaseEqpinfo(request: QueryScfleaseEqpinfoRequest): Promise<QueryScfleaseEqpinfoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryScfleaseEqpinfoEx(request, headers, runtime);
  }

  /**
   * Description: 菜鸟设备监控信息获取
   * Summary: 菜鸟设备监控信息获取
   */
  async queryScfleaseEqpinfoEx(request: QueryScfleaseEqpinfoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryScfleaseEqpinfoResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryScfleaseEqpinfoResponse>(await this.doRequest("1.0", "blockchain.bot.scflease.eqpinfo.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryScfleaseEqpinfoResponse({}));
  }

  /**
   * Description: 创建自定义的实体数据
   * Summary: 创建自定义实体
   */
  async createCustomerEntity(request: CreateCustomerEntityRequest): Promise<CreateCustomerEntityResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createCustomerEntityEx(request, headers, runtime);
  }

  /**
   * Description: 创建自定义的实体数据
   * Summary: 创建自定义实体
   */
  async createCustomerEntityEx(request: CreateCustomerEntityRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateCustomerEntityResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateCustomerEntityResponse>(await this.doRequest("1.0", "blockchain.bot.customer.entity.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateCustomerEntityResponse({}));
  }

  /**
   * Description: 更新自定义实体，通过场景码+实体ID来更新 实体内容或实体名称
   * Summary: 更新自定义实体
   */
  async updateCustomerEntity(request: UpdateCustomerEntityRequest): Promise<UpdateCustomerEntityResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateCustomerEntityEx(request, headers, runtime);
  }

  /**
   * Description: 更新自定义实体，通过场景码+实体ID来更新 实体内容或实体名称
   * Summary: 更新自定义实体
   */
  async updateCustomerEntityEx(request: UpdateCustomerEntityRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateCustomerEntityResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateCustomerEntityResponse>(await this.doRequest("1.0", "blockchain.bot.customer.entity.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateCustomerEntityResponse({}));
  }

  /**
   * Description: 为租户创建物模型
   * Summary: 为租户创建物模型
   */
  async createThingmodel(request: CreateThingmodelRequest): Promise<CreateThingmodelResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createThingmodelEx(request, headers, runtime);
  }

  /**
   * Description: 为租户创建物模型
   * Summary: 为租户创建物模型
   */
  async createThingmodelEx(request: CreateThingmodelRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateThingmodelResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateThingmodelResponse>(await this.doRequest("1.0", "blockchain.bot.thingmodel.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateThingmodelResponse({}));
  }

  /**
   * Description: 查询租户的物模型
   * Summary: 查询租户的物模型
   */
  async queryThingmodel(request: QueryThingmodelRequest): Promise<QueryThingmodelResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryThingmodelEx(request, headers, runtime);
  }

  /**
   * Description: 查询租户的物模型
   * Summary: 查询租户的物模型
   */
  async queryThingmodelEx(request: QueryThingmodelRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryThingmodelResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryThingmodelResponse>(await this.doRequest("1.0", "blockchain.bot.thingmodel.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryThingmodelResponse({}));
  }

  /**
   * Description: 通过设备异步批量发行设备
   * Summary: 通过设备异步批量发行设备
   */
  async createDistributedeviceBydevicemul(request: CreateDistributedeviceBydevicemulRequest): Promise<CreateDistributedeviceBydevicemulResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createDistributedeviceBydevicemulEx(request, headers, runtime);
  }

  /**
   * Description: 通过设备异步批量发行设备
   * Summary: 通过设备异步批量发行设备
   */
  async createDistributedeviceBydevicemulEx(request: CreateDistributedeviceBydevicemulRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateDistributedeviceBydevicemulResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateDistributedeviceBydevicemulResponse>(await this.doRequest("1.0", "blockchain.bot.distributedevice.bydevicemul.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateDistributedeviceBydevicemulResponse({}));
  }

  /**
   * Description: 通过设备ID异步批量发行设备
   * Summary: 通过设备ID异步批量发行设备
   */
  async createDistributedeviceBydeviceidmul(request: CreateDistributedeviceBydeviceidmulRequest): Promise<CreateDistributedeviceBydeviceidmulResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createDistributedeviceBydeviceidmulEx(request, headers, runtime);
  }

  /**
   * Description: 通过设备ID异步批量发行设备
   * Summary: 通过设备ID异步批量发行设备
   */
  async createDistributedeviceBydeviceidmulEx(request: CreateDistributedeviceBydeviceidmulRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateDistributedeviceBydeviceidmulResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateDistributedeviceBydeviceidmulResponse>(await this.doRequest("1.0", "blockchain.bot.distributedevice.bydeviceidmul.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateDistributedeviceBydeviceidmulResponse({}));
  }

  /**
   * Description: 绑定实体关系
   * Summary: 绑定实体关系
   */
  async bindEntityrelation(request: BindEntityrelationRequest): Promise<BindEntityrelationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.bindEntityrelationEx(request, headers, runtime);
  }

  /**
   * Description: 绑定实体关系
   * Summary: 绑定实体关系
   */
  async bindEntityrelationEx(request: BindEntityrelationRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BindEntityrelationResponse> {
    Util.validateModel(request);
    return $tea.cast<BindEntityrelationResponse>(await this.doRequest("1.0", "blockchain.bot.entityrelation.bind", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BindEntityrelationResponse({}));
  }

  /**
   * Description: 批量解绑实体关系
   * Summary: 批量解绑实体关系
   */
  async unbindEntityrelation(request: UnbindEntityrelationRequest): Promise<UnbindEntityrelationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.unbindEntityrelationEx(request, headers, runtime);
  }

  /**
   * Description: 批量解绑实体关系
   * Summary: 批量解绑实体关系
   */
  async unbindEntityrelationEx(request: UnbindEntityrelationRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UnbindEntityrelationResponse> {
    Util.validateModel(request);
    return $tea.cast<UnbindEntityrelationResponse>(await this.doRequest("1.0", "blockchain.bot.entityrelation.unbind", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UnbindEntityrelationResponse({}));
  }

  /**
   * Description: 查询物模型设备详情
   * Summary: 查询物模型设备详情
   */
  async detailThingmodelDevice(request: DetailThingmodelDeviceRequest): Promise<DetailThingmodelDeviceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.detailThingmodelDeviceEx(request, headers, runtime);
  }

  /**
   * Description: 查询物模型设备详情
   * Summary: 查询物模型设备详情
   */
  async detailThingmodelDeviceEx(request: DetailThingmodelDeviceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DetailThingmodelDeviceResponse> {
    Util.validateModel(request);
    return $tea.cast<DetailThingmodelDeviceResponse>(await this.doRequest("1.0", "blockchain.bot.thingmodel.device.detail", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DetailThingmodelDeviceResponse({}));
  }

  /**
   * Description: 通过CSV文件上报数据时，需要先通过这个接口获取上报地址URL
   * Summary: 创建上传文件URL
   */
  async createCollectorUploadfileurl(request: CreateCollectorUploadfileurlRequest): Promise<CreateCollectorUploadfileurlResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createCollectorUploadfileurlEx(request, headers, runtime);
  }

  /**
   * Description: 通过CSV文件上报数据时，需要先通过这个接口获取上报地址URL
   * Summary: 创建上传文件URL
   */
  async createCollectorUploadfileurlEx(request: CreateCollectorUploadfileurlRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateCollectorUploadfileurlResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateCollectorUploadfileurlResponse>(await this.doRequest("1.0", "blockchain.bot.collector.uploadfileurl.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateCollectorUploadfileurlResponse({}));
  }

  /**
   * Description: 通过文件上报数据流程，先获取上报文件URL，然后向目标URL中上传文件，最后调用此接口进行确认
   * Summary: 通过文件上报数据，上传完毕后确认
   */
  async confirmCollectorUploadfile(request: ConfirmCollectorUploadfileRequest): Promise<ConfirmCollectorUploadfileResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.confirmCollectorUploadfileEx(request, headers, runtime);
  }

  /**
   * Description: 通过文件上报数据流程，先获取上报文件URL，然后向目标URL中上传文件，最后调用此接口进行确认
   * Summary: 通过文件上报数据，上传完毕后确认
   */
  async confirmCollectorUploadfileEx(request: ConfirmCollectorUploadfileRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ConfirmCollectorUploadfileResponse> {
    Util.validateModel(request);
    return $tea.cast<ConfirmCollectorUploadfileResponse>(await this.doRequest("1.0", "blockchain.bot.collector.uploadfile.confirm", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ConfirmCollectorUploadfileResponse({}));
  }

  /**
   * Description: 创建物模型事件
   * Summary: 创建物模型事件
   */
  async createThingmodelEvent(request: CreateThingmodelEventRequest): Promise<CreateThingmodelEventResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createThingmodelEventEx(request, headers, runtime);
  }

  /**
   * Description: 创建物模型事件
   * Summary: 创建物模型事件
   */
  async createThingmodelEventEx(request: CreateThingmodelEventRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateThingmodelEventResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateThingmodelEventResponse>(await this.doRequest("1.0", "blockchain.bot.thingmodel.event.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateThingmodelEventResponse({}));
  }

  /**
   * Description: 查询物模型事件
   * Summary: 查询物模型事件
   */
  async queryThingmodelEvent(request: QueryThingmodelEventRequest): Promise<QueryThingmodelEventResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryThingmodelEventEx(request, headers, runtime);
  }

  /**
   * Description: 查询物模型事件
   * Summary: 查询物模型事件
   */
  async queryThingmodelEventEx(request: QueryThingmodelEventRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryThingmodelEventResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryThingmodelEventResponse>(await this.doRequest("1.0", "blockchain.bot.thingmodel.event.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryThingmodelEventResponse({}));
  }

  /**
   * Description: 通过车辆车牌的颜色+号码+场景码，查询关联的部标设备对应的IoT可信平台唯一ID
   * Summary: 车辆关联的部标设备列表查询
   */
  async queryEntityrelationJtdevicebycar(request: QueryEntityrelationJtdevicebycarRequest): Promise<QueryEntityrelationJtdevicebycarResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryEntityrelationJtdevicebycarEx(request, headers, runtime);
  }

  /**
   * Description: 通过车辆车牌的颜色+号码+场景码，查询关联的部标设备对应的IoT可信平台唯一ID
   * Summary: 车辆关联的部标设备列表查询
   */
  async queryEntityrelationJtdevicebycarEx(request: QueryEntityrelationJtdevicebycarRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryEntityrelationJtdevicebycarResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryEntityrelationJtdevicebycarResponse>(await this.doRequest("1.0", "blockchain.bot.entityrelation.jtdevicebycar.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryEntityrelationJtdevicebycarResponse({}));
  }

  /**
   * Description: 部标设备位置/轨迹/异常数据查询
   * Summary: 部标设备位置/轨迹/异常数据查询
   */
  async queryCollectorJtflux(request: QueryCollectorJtfluxRequest): Promise<QueryCollectorJtfluxResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryCollectorJtfluxEx(request, headers, runtime);
  }

  /**
   * Description: 部标设备位置/轨迹/异常数据查询
   * Summary: 部标设备位置/轨迹/异常数据查询
   */
  async queryCollectorJtfluxEx(request: QueryCollectorJtfluxRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryCollectorJtfluxResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryCollectorJtfluxResponse>(await this.doRequest("1.0", "blockchain.bot.collector.jtflux.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryCollectorJtfluxResponse({}));
  }

  /**
   * Description: 通过异常事件ID查询部标多媒体文件地址
   * Summary: 通过异常事件ID查询部标多媒体文件地址
   */
  async queryCollectorJtmedia(request: QueryCollectorJtmediaRequest): Promise<QueryCollectorJtmediaResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryCollectorJtmediaEx(request, headers, runtime);
  }

  /**
   * Description: 通过异常事件ID查询部标多媒体文件地址
   * Summary: 通过异常事件ID查询部标多媒体文件地址
   */
  async queryCollectorJtmediaEx(request: QueryCollectorJtmediaRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryCollectorJtmediaResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryCollectorJtmediaResponse>(await this.doRequest("1.0", "blockchain.bot.collector.jtmedia.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryCollectorJtmediaResponse({}));
  }

  /**
   * Description: 查询产线压测任务
   * Summary: 查询项目关联的产线压测任务
   */
  async queryOnlinepressuretest(request: QueryOnlinepressuretestRequest): Promise<QueryOnlinepressuretestResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryOnlinepressuretestEx(request, headers, runtime);
  }

  /**
   * Description: 查询产线压测任务
   * Summary: 查询项目关联的产线压测任务
   */
  async queryOnlinepressuretestEx(request: QueryOnlinepressuretestRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryOnlinepressuretestResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryOnlinepressuretestResponse>(await this.doRequest("1.0", "blockchain.bot.onlinepressuretest.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryOnlinepressuretestResponse({}));
  }

  /**
   * Description:  【自主联调平台】创建产线压测任务
   * Summary:  【自主联调平台】创建产线压测任务
   */
  async createOnlinepressuretest(request: CreateOnlinepressuretestRequest): Promise<CreateOnlinepressuretestResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createOnlinepressuretestEx(request, headers, runtime);
  }

  /**
   * Description:  【自主联调平台】创建产线压测任务
   * Summary:  【自主联调平台】创建产线压测任务
   */
  async createOnlinepressuretestEx(request: CreateOnlinepressuretestRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateOnlinepressuretestResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateOnlinepressuretestResponse>(await this.doRequest("1.0", "blockchain.bot.onlinepressuretest.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateOnlinepressuretestResponse({}));
  }

  /**
   * Description: 更新客户侧的压测报告
   * Summary: 更新客户侧的压测报告
   */
  async updateOnlinepressuretestCustomerreport(request: UpdateOnlinepressuretestCustomerreportRequest): Promise<UpdateOnlinepressuretestCustomerreportResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateOnlinepressuretestCustomerreportEx(request, headers, runtime);
  }

  /**
   * Description: 更新客户侧的压测报告
   * Summary: 更新客户侧的压测报告
   */
  async updateOnlinepressuretestCustomerreportEx(request: UpdateOnlinepressuretestCustomerreportRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateOnlinepressuretestCustomerreportResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateOnlinepressuretestCustomerreportResponse>(await this.doRequest("1.0", "blockchain.bot.onlinepressuretest.customerreport.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateOnlinepressuretestCustomerreportResponse({}));
  }

  /**
   * Description: 查询客户的物模型事件
   * Summary: 查询客户的物模型事件列表
   */
  async queryThingmodeleventBycustomertenant(request: QueryThingmodeleventBycustomertenantRequest): Promise<QueryThingmodeleventBycustomertenantResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryThingmodeleventBycustomertenantEx(request, headers, runtime);
  }

  /**
   * Description: 查询客户的物模型事件
   * Summary: 查询客户的物模型事件列表
   */
  async queryThingmodeleventBycustomertenantEx(request: QueryThingmodeleventBycustomertenantRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryThingmodeleventBycustomertenantResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryThingmodeleventBycustomertenantResponse>(await this.doRequest("1.0", "blockchain.bot.thingmodelevent.bycustomertenant.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryThingmodeleventBycustomertenantResponse({}));
  }

  /**
   * Description: 从联调环境部署物模型UDF到生产环境
   * Summary: 从联调环境部署物模型UDF到生产环境
   */
  async deployThingudf(request: DeployThingudfRequest): Promise<DeployThingudfResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deployThingudfEx(request, headers, runtime);
  }

  /**
   * Description: 从联调环境部署物模型UDF到生产环境
   * Summary: 从联调环境部署物模型UDF到生产环境
   */
  async deployThingudfEx(request: DeployThingudfRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeployThingudfResponse> {
    Util.validateModel(request);
    return $tea.cast<DeployThingudfResponse>(await this.doRequest("1.0", "blockchain.bot.thingudf.deploy", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeployThingudfResponse({}));
  }

  /**
   * Description: 分页查询二轮车操作日志
   * Summary: 分页查询二轮车操作日志
   */
  async pagequeryEbikeOperationlog(request: PagequeryEbikeOperationlogRequest): Promise<PagequeryEbikeOperationlogResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pagequeryEbikeOperationlogEx(request, headers, runtime);
  }

  /**
   * Description: 分页查询二轮车操作日志
   * Summary: 分页查询二轮车操作日志
   */
  async pagequeryEbikeOperationlogEx(request: PagequeryEbikeOperationlogRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PagequeryEbikeOperationlogResponse> {
    Util.validateModel(request);
    return $tea.cast<PagequeryEbikeOperationlogResponse>(await this.doRequest("1.0", "blockchain.bot.ebike.operationlog.pagequery", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PagequeryEbikeOperationlogResponse({}));
  }

  /**
   * Description: 客户实体拓展功能查询
   * Summary: 客户实体拓展功能查询
   */
  async queryCustomerentityService(request: QueryCustomerentityServiceRequest): Promise<QueryCustomerentityServiceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryCustomerentityServiceEx(request, headers, runtime);
  }

  /**
   * Description: 客户实体拓展功能查询
   * Summary: 客户实体拓展功能查询
   */
  async queryCustomerentityServiceEx(request: QueryCustomerentityServiceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryCustomerentityServiceResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryCustomerentityServiceResponse>(await this.doRequest("1.0", "blockchain.bot.customerentity.service.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryCustomerentityServiceResponse({}));
  }

  /**
   * Description: 支付芯证书申请
   * Summary: 支付芯证书申请
   */
  async applyTechintegrationSkuship(request: ApplyTechintegrationSkushipRequest): Promise<ApplyTechintegrationSkushipResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.applyTechintegrationSkushipEx(request, headers, runtime);
  }

  /**
   * Description: 支付芯证书申请
   * Summary: 支付芯证书申请
   */
  async applyTechintegrationSkushipEx(request: ApplyTechintegrationSkushipRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ApplyTechintegrationSkushipResponse> {
    Util.validateModel(request);
    return $tea.cast<ApplyTechintegrationSkushipResponse>(await this.doRequest("1.0", "blockchain.bot.techintegration.skuship.apply", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ApplyTechintegrationSkushipResponse({}));
  }

  /**
   * Description: 支付芯证书申请接口，适用于唯一编码软件接入形式
   * Summary: 支付芯证书申请接口，唯一编码软件接入形式
   */
  async applyTechintegrationSkushipbyuid(request: ApplyTechintegrationSkushipbyuidRequest): Promise<ApplyTechintegrationSkushipbyuidResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.applyTechintegrationSkushipbyuidEx(request, headers, runtime);
  }

  /**
   * Description: 支付芯证书申请接口，适用于唯一编码软件接入形式
   * Summary: 支付芯证书申请接口，唯一编码软件接入形式
   */
  async applyTechintegrationSkushipbyuidEx(request: ApplyTechintegrationSkushipbyuidRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ApplyTechintegrationSkushipbyuidResponse> {
    Util.validateModel(request);
    return $tea.cast<ApplyTechintegrationSkushipbyuidResponse>(await this.doRequest("1.0", "blockchain.bot.techintegration.skushipbyuid.apply", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ApplyTechintegrationSkushipbyuidResponse({}));
  }

  /**
   * Description: 查询压测任务所关联的实体的最新上链数据列表
   * Summary: 查询压测任务的上链数据列表
   */
  async queryOnlinepressuretestData(request: QueryOnlinepressuretestDataRequest): Promise<QueryOnlinepressuretestDataResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryOnlinepressuretestDataEx(request, headers, runtime);
  }

  /**
   * Description: 查询压测任务所关联的实体的最新上链数据列表
   * Summary: 查询压测任务的上链数据列表
   */
  async queryOnlinepressuretestDataEx(request: QueryOnlinepressuretestDataRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryOnlinepressuretestDataResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryOnlinepressuretestDataResponse>(await this.doRequest("1.0", "blockchain.bot.onlinepressuretest.data.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryOnlinepressuretestDataResponse({}));
  }

  /**
   * Description: 物模型服务调用
   * Summary: 物模型服务调用
   */
  async execThingService(request: ExecThingServiceRequest): Promise<ExecThingServiceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.execThingServiceEx(request, headers, runtime);
  }

  /**
   * Description: 物模型服务调用
   * Summary: 物模型服务调用
   */
  async execThingServiceEx(request: ExecThingServiceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExecThingServiceResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecThingServiceResponse>(await this.doRequest("1.0", "blockchain.bot.thing.service.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExecThingServiceResponse({}));
  }

  /**
   * Description: 物模型服务回复接口，通过场景码、数据模型ID等作为回复标识
   * Summary: 物模型服务回复接口
   */
  async callbackThingServicebyevent(request: CallbackThingServicebyeventRequest): Promise<CallbackThingServicebyeventResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.callbackThingServicebyeventEx(request, headers, runtime);
  }

  /**
   * Description: 物模型服务回复接口，通过场景码、数据模型ID等作为回复标识
   * Summary: 物模型服务回复接口
   */
  async callbackThingServicebyeventEx(request: CallbackThingServicebyeventRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CallbackThingServicebyeventResponse> {
    Util.validateModel(request);
    return $tea.cast<CallbackThingServicebyeventResponse>(await this.doRequest("1.0", "blockchain.bot.thing.servicebyevent.callback", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CallbackThingServicebyeventResponse({}));
  }

  /**
   * Description: 添加SKU授权白名单
   * Summary: 添加SKU授权白名单
   */
  async importTechintegrationSkugrantwhitelist(request: ImportTechintegrationSkugrantwhitelistRequest): Promise<ImportTechintegrationSkugrantwhitelistResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.importTechintegrationSkugrantwhitelistEx(request, headers, runtime);
  }

  /**
   * Description: 添加SKU授权白名单
   * Summary: 添加SKU授权白名单
   */
  async importTechintegrationSkugrantwhitelistEx(request: ImportTechintegrationSkugrantwhitelistRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ImportTechintegrationSkugrantwhitelistResponse> {
    Util.validateModel(request);
    return $tea.cast<ImportTechintegrationSkugrantwhitelistResponse>(await this.doRequest("1.0", "blockchain.bot.techintegration.skugrantwhitelist.import", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ImportTechintegrationSkugrantwhitelistResponse({}));
  }

  /**
   * Description: 物模型数据上报
   * Summary: 物模型数据上报
   */
  async sendThingData(request: SendThingDataRequest): Promise<SendThingDataResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.sendThingDataEx(request, headers, runtime);
  }

  /**
   * Description: 物模型数据上报
   * Summary: 物模型数据上报
   */
  async sendThingDataEx(request: SendThingDataRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SendThingDataResponse> {
    Util.validateModel(request);
    return $tea.cast<SendThingDataResponse>(await this.doRequest("1.0", "blockchain.bot.thing.data.send", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SendThingDataResponse({}));
  }

  /**
   * Description: 支付芯证书授权信息查询
   * Summary: 支付芯证书授权信息查询
   */
  async queryTechintegrationSkugrantstockinfo(request: QueryTechintegrationSkugrantstockinfoRequest): Promise<QueryTechintegrationSkugrantstockinfoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryTechintegrationSkugrantstockinfoEx(request, headers, runtime);
  }

  /**
   * Description: 支付芯证书授权信息查询
   * Summary: 支付芯证书授权信息查询
   */
  async queryTechintegrationSkugrantstockinfoEx(request: QueryTechintegrationSkugrantstockinfoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryTechintegrationSkugrantstockinfoResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryTechintegrationSkugrantstockinfoResponse>(await this.doRequest("1.0", "blockchain.bot.techintegration.skugrantstockinfo.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryTechintegrationSkugrantstockinfoResponse({}));
  }

  /**
   * Description: 信物链oneapi
   * Summary: 信物链oneapi
   */
  async execThingsdidOneapi(request: ExecThingsdidOneapiRequest): Promise<ExecThingsdidOneapiResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.execThingsdidOneapiEx(request, headers, runtime);
  }

  /**
   * Description: 信物链oneapi
   * Summary: 信物链oneapi
   */
  async execThingsdidOneapiEx(request: ExecThingsdidOneapiRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExecThingsdidOneapiResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecThingsdidOneapiResponse>(await this.doRequest("1.0", "blockchain.bot.thingsdid.oneapi.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExecThingsdidOneapiResponse({}));
  }

  /**
   * Description: 信物链存证
   * Summary: 信物链存证
   */
  async startEvidenceStore(request: StartEvidenceStoreRequest): Promise<StartEvidenceStoreResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.startEvidenceStoreEx(request, headers, runtime);
  }

  /**
   * Description: 信物链存证
   * Summary: 信物链存证
   */
  async startEvidenceStoreEx(request: StartEvidenceStoreRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<StartEvidenceStoreResponse> {
    Util.validateModel(request);
    return $tea.cast<StartEvidenceStoreResponse>(await this.doRequest("1.0", "blockchain.bot.evidence.store.start", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new StartEvidenceStoreResponse({}));
  }

  /**
   * Description: 信物链存证查询
   * Summary: 信物链存证查询
   */
  async startEvidenceQuery(request: StartEvidenceQueryRequest): Promise<StartEvidenceQueryResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.startEvidenceQueryEx(request, headers, runtime);
  }

  /**
   * Description: 信物链存证查询
   * Summary: 信物链存证查询
   */
  async startEvidenceQueryEx(request: StartEvidenceQueryRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<StartEvidenceQueryResponse> {
    Util.validateModel(request);
    return $tea.cast<StartEvidenceQueryResponse>(await this.doRequest("1.0", "blockchain.bot.evidence.query.start", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new StartEvidenceQueryResponse({}));
  }

  /**
   * Description: 信物链实体身份注册
   * Summary: 信物链实体身份注册
   */
  async startThingsdidRegister(request: StartThingsdidRegisterRequest): Promise<StartThingsdidRegisterResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.startThingsdidRegisterEx(request, headers, runtime);
  }

  /**
   * Description: 信物链实体身份注册
   * Summary: 信物链实体身份注册
   */
  async startThingsdidRegisterEx(request: StartThingsdidRegisterRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<StartThingsdidRegisterResponse> {
    Util.validateModel(request);
    return $tea.cast<StartThingsdidRegisterResponse>(await this.doRequest("1.0", "blockchain.bot.thingsdid.register.start", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new StartThingsdidRegisterResponse({}));
  }

  /**
   * Description: 信物链异步操作查询
  智能合约操作由于比较耗时，因此内部实现通过异步实现，调用完exectuted返回是false的API后，需要调用此api来轮询原先操作是否完成。
   * Summary: 信物链异步操作查询
   */
  async queryThingsdidAsyncprocess(request: QueryThingsdidAsyncprocessRequest): Promise<QueryThingsdidAsyncprocessResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryThingsdidAsyncprocessEx(request, headers, runtime);
  }

  /**
   * Description: 信物链异步操作查询
  智能合约操作由于比较耗时，因此内部实现通过异步实现，调用完exectuted返回是false的API后，需要调用此api来轮询原先操作是否完成。
   * Summary: 信物链异步操作查询
   */
  async queryThingsdidAsyncprocessEx(request: QueryThingsdidAsyncprocessRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryThingsdidAsyncprocessResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryThingsdidAsyncprocessResponse>(await this.doRequest("1.0", "blockchain.bot.thingsdid.asyncprocess.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryThingsdidAsyncprocessResponse({}));
  }

  /**
   * Description: 信物链身份状态更新，此API目前仅支持设备状态更新
   * Summary: 信物链身份状态更新
   */
  async updateThingsdidStatus(request: UpdateThingsdidStatusRequest): Promise<UpdateThingsdidStatusResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateThingsdidStatusEx(request, headers, runtime);
  }

  /**
   * Description: 信物链身份状态更新，此API目前仅支持设备状态更新
   * Summary: 信物链身份状态更新
   */
  async updateThingsdidStatusEx(request: UpdateThingsdidStatusRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateThingsdidStatusResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateThingsdidStatusResponse>(await this.doRequest("1.0", "blockchain.bot.thingsdid.status.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateThingsdidStatusResponse({}));
  }

  /**
   * Description: 信物链设备空间关联更新，完成设备和空间关联绑定
   * Summary: 信物链设备空间关联更新
   */
  async updateThingsdidDevicespace(request: UpdateThingsdidDevicespaceRequest): Promise<UpdateThingsdidDevicespaceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateThingsdidDevicespaceEx(request, headers, runtime);
  }

  /**
   * Description: 信物链设备空间关联更新，完成设备和空间关联绑定
   * Summary: 信物链设备空间关联更新
   */
  async updateThingsdidDevicespaceEx(request: UpdateThingsdidDevicespaceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateThingsdidDevicespaceResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateThingsdidDevicespaceResponse>(await this.doRequest("1.0", "blockchain.bot.thingsdid.devicespace.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateThingsdidDevicespaceResponse({}));
  }

  /**
   * Description: 信物链实体did查询，根据dataFilter过滤输出
   * Summary: 信物链实体did查询
   */
  async queryThingsdidDid(request: QueryThingsdidDidRequest): Promise<QueryThingsdidDidResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryThingsdidDidEx(request, headers, runtime);
  }

  /**
   * Description: 信物链实体did查询，根据dataFilter过滤输出
   * Summary: 信物链实体did查询
   */
  async queryThingsdidDidEx(request: QueryThingsdidDidRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryThingsdidDidResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryThingsdidDidResponse>(await this.doRequest("1.0", "blockchain.bot.thingsdid.did.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryThingsdidDidResponse({}));
  }

  /**
   * Description: 信物链实体身份更新，字段空则不更新。
   * Summary: 信物链实体身份更新
   */
  async updateThingsdidDid(request: UpdateThingsdidDidRequest): Promise<UpdateThingsdidDidResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateThingsdidDidEx(request, headers, runtime);
  }

  /**
   * Description: 信物链实体身份更新，字段空则不更新。
   * Summary: 信物链实体身份更新
   */
  async updateThingsdidDidEx(request: UpdateThingsdidDidRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateThingsdidDidResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateThingsdidDidResponse>(await this.doRequest("1.0", "blockchain.bot.thingsdid.did.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateThingsdidDidResponse({}));
  }

  /**
   * Description: 信物链租户信息关联
   * Summary: 信物链租户信息关联
   */
  async startTenantBindinfo(request: StartTenantBindinfoRequest): Promise<StartTenantBindinfoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.startTenantBindinfoEx(request, headers, runtime);
  }

  /**
   * Description: 信物链租户信息关联
   * Summary: 信物链租户信息关联
   */
  async startTenantBindinfoEx(request: StartTenantBindinfoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<StartTenantBindinfoResponse> {
    Util.validateModel(request);
    return $tea.cast<StartTenantBindinfoResponse>(await this.doRequest("1.0", "blockchain.bot.tenant.bindinfo.start", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new StartTenantBindinfoResponse({}));
  }

  /**
   * Description: 信物链租户项目创建，项目可以用来管理同一租户不同业务的存证
   * Summary: 信物链租户项目创建
   */
  async createTenantProject(request: CreateTenantProjectRequest): Promise<CreateTenantProjectResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createTenantProjectEx(request, headers, runtime);
  }

  /**
   * Description: 信物链租户项目创建，项目可以用来管理同一租户不同业务的存证
   * Summary: 信物链租户项目创建
   */
  async createTenantProjectEx(request: CreateTenantProjectRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateTenantProjectResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateTenantProjectResponse>(await this.doRequest("1.0", "blockchain.bot.tenant.project.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateTenantProjectResponse({}));
  }

  /**
   * Description: 信物链实体访问权限更新
  所有者/使用者/观察者权限更新
   * Summary: 信物链实体访问权限更新
   */
  async updateThingsdidTenant(request: UpdateThingsdidTenantRequest): Promise<UpdateThingsdidTenantResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateThingsdidTenantEx(request, headers, runtime);
  }

  /**
   * Description: 信物链实体访问权限更新
  所有者/使用者/观察者权限更新
   * Summary: 信物链实体访问权限更新
   */
  async updateThingsdidTenantEx(request: UpdateThingsdidTenantRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateThingsdidTenantResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateThingsdidTenantResponse>(await this.doRequest("1.0", "blockchain.bot.thingsdid.tenant.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateThingsdidTenantResponse({}));
  }

  /**
   * Description: LoadCertificateTSMCmd，仅限内部使用api
   * Summary: TSM迁移内部使用 
   */
  async loadTsmCertificatetsm(request: LoadTsmCertificatetsmRequest): Promise<LoadTsmCertificatetsmResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.loadTsmCertificatetsmEx(request, headers, runtime);
  }

  /**
   * Description: LoadCertificateTSMCmd，仅限内部使用api
   * Summary: TSM迁移内部使用 
   */
  async loadTsmCertificatetsmEx(request: LoadTsmCertificatetsmRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<LoadTsmCertificatetsmResponse> {
    Util.validateModel(request);
    return $tea.cast<LoadTsmCertificatetsmResponse>(await this.doRequest("1.0", "blockchain.bot.tsm.certificatetsm.load", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new LoadTsmCertificatetsmResponse({}));
  }

  /**
   * Description: TSM迁移内部使用
   * Summary: loadResourceFile
   */
  async loadTsmResourcefile(request: LoadTsmResourcefileRequest): Promise<LoadTsmResourcefileResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.loadTsmResourcefileEx(request, headers, runtime);
  }

  /**
   * Description: TSM迁移内部使用
   * Summary: loadResourceFile
   */
  async loadTsmResourcefileEx(request: LoadTsmResourcefileRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<LoadTsmResourcefileResponse> {
    Util.validateModel(request);
    return $tea.cast<LoadTsmResourcefileResponse>(await this.doRequest("1.0", "blockchain.bot.tsm.resourcefile.load", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new LoadTsmResourcefileResponse({}));
  }

  /**
   * Description: 触发tlsnotary文件认证任务
   * Summary: 触发tlsnotary文件认证任务
   */
  async startTlsnotaryTask(request: StartTlsnotaryTaskRequest): Promise<StartTlsnotaryTaskResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.startTlsnotaryTaskEx(request, headers, runtime);
  }

  /**
   * Description: 触发tlsnotary文件认证任务
   * Summary: 触发tlsnotary文件认证任务
   */
  async startTlsnotaryTaskEx(request: StartTlsnotaryTaskRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<StartTlsnotaryTaskResponse> {
    Util.validateModel(request);
    return $tea.cast<StartTlsnotaryTaskResponse>(await this.doRequest("1.0", "blockchain.bot.tlsnotary.task.start", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new StartTlsnotaryTaskResponse({}));
  }

  /**
   * Description: 查询tlsnotary文件认证任务结果
   * Summary: 查询tlsnotary文件认证任务结果
   */
  async queryTlsnotaryTask(request: QueryTlsnotaryTaskRequest): Promise<QueryTlsnotaryTaskResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryTlsnotaryTaskEx(request, headers, runtime);
  }

  /**
   * Description: 查询tlsnotary文件认证任务结果
   * Summary: 查询tlsnotary文件认证任务结果
   */
  async queryTlsnotaryTaskEx(request: QueryTlsnotaryTaskRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryTlsnotaryTaskResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryTlsnotaryTaskResponse>(await this.doRequest("1.0", "blockchain.bot.tlsnotary.task.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryTlsnotaryTaskResponse({}));
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
