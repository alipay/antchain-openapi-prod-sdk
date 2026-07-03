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

// 资源定位信息
export class BaiResourceLocation extends $tea.Model {
  // 资源定位类型
  // HTTP_URL：资源url
  // STRING_BASE64：资源base64字符串（不带base64头部）
  /**
   * @example
   * HTTP_URL, STRING_BASE64
   */
  locationType: string;
  // 资源定位值
  /**
   * @example
   * abc
   */
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
  /**
   * @example
   * ADD_DEVICE
   */
  permissionCode: string;
  // 权限名称
  /**
   * @example
   * 注册设备
   */
  permissionName: string;
  // 权限内容
  /**
   * @example
   * 权限内容
   */
  permissionData: string;
  // 权限类型
  /**
   * @example
   * 权限类型
   */
  permissionType: string;
  // 权限模块
  /**
   * @example
   * 权限模块
   */
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
  /**
   * @example
   * 1
   */
  id: number;
  // 创建时间
  /**
   * @example
   * 2018-10-10T10:10:00Z
   */
  gmtCreate: string;
  // 修改时间
  /**
   * @example
   * 2018-10-10T10:10:00Z
   */
  gmtModified: string;
  // 设备SDK公钥
  /**
   * @example
   * MEUCIDxNwV7tXGlZ9VW19p...
   */
  verifyKey: string;
  // SDK版本号
  /**
   * @example
   * mqV1.0
   */
  sdkVersionStr?: string;
  // sdk模型
  /**
   * @example
   * {"version":"1.0.0"}
   */
  metaModel?: string;
  // 平台
  /**
   * @example
   * windows
   */
  platform?: string;
  // 公司名称
  /**
   * @example
   * alipay
   */
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
  /**
   * @example
   * 23123131
   */
  goodsSkuId: number;
  // 商品采购数量
  /**
   * @example
   * 100
   */
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
  /**
   * @example
   * 1
   */
  id: number;
  // 创建时间
  /**
   * @example
   * 2018-10-10T10:10:00Z
   */
  gmtCreate: string;
  // 更新时间
  /**
   * @example
   * 2018-10-10T10:10:00Z
   */
  gmtModified: string;
  // 设备端ProductKey
  /**
   * @example
   * DEV-0101
   */
  productKey: string;
  // 场景码
  /**
   * @example
   * testScene
   */
  scene: string;
  // 租户Id 
  /**
   * @example
   * testTenant
   */
  tenantName: string;
  // 数据模型id 
  /**
   * @example
   * model_001
   */
  dataModelId: string;
  // sdk前缀
  /**
   * @example
   * sdk_
   */
  sdkVersionPrefix: string;
  // 制造商
  /**
   * @example
   * alibaba
   */
  manufacturer?: string;
  // 顾客
  /**
   * @example
   * alipay
   */
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
  /**
   * @example
   * 1
   */
  id: number;
  // 创建时间
  /**
   * @example
   * 2018-10-10T10:10:00Z
   */
  gmtCreate: string;
  // 修改时间
  /**
   * @example
   * 2018-10-10T10:10:00Z
   */
  gmtModified: string;
  // 场景名
  /**
   * @example
   * testScene
   */
  sceneName: string;
  // 是否托管
  /**
   * @example
   * ESCROWED
   */
  escrowed?: string;
  // 私钥密码
  /**
   * @example
   * MEUCI..
   */
  privateKeyPassword?: string;
  // 租户
  /**
   * @example
   * testTenant
   */
  tenantName?: string;
  // 场景类型
  /**
   * @example
   * 共享单车
   */
  sceneType?: string;
  // 是否跳过中台数据校验处理
  /**
   * @example
   * true, false
   */
  skipPegasus?: boolean;
  // 定制数据处理类 , 使用用逗号分隔
  /**
   * @example
   * XXX_GPS_PROCESSOR
   */
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
  /**
   * @example
   * 1
   */
  id: number;
  // 创建时间
  /**
   * @example
   * 2018-10-10T10:10:00Z
   */
  gmtCreate: string;
  // Alipay-0101
  /**
   * @example
   * 场景码
   */
  scene: string;
  // 设备ID 
  /**
   * @example
   * device_id_001
   */
  deviceId?: string;
  // 发行设备ID 
  /**
   * @example
   * 00202009111700539276
   */
  disDeviceId?: string;
  // 类型：0:数据上报;1:数据完整性校验
  /**
   * @example
   * 0
   */
  type: number;
  // c89b65a2e3afd604977c0....
  /**
   * @example
   * 公钥
   */
  publicKey?: string;
  // 验签类型：0(RAW_DATA)；1(公钥格式为PEM)；2(公钥格式为DER)
  /**
   * @example
   * 0
   */
  formatType?: number;
  // 验证内容hash
  /**
   * @example
   * aa5304221185b370ea84d...
   */
  contentId?: string;
  // 验证内容
  /**
   * @example
   * {"content":"demo",...}
   */
  content?: string;
  // 签名
  /**
   * @example
   * 9b47e12b0ddb8df...
   */
  signature?: string;
  // 错误信息
  /**
   * @example
   * 数据验真失败
   */
  failMessage?: string;
  // 补充数据
  /**
   * @example
   * {“DEVICE-ID”:"DEMO-001"}
   */
  extraData?: string;
  // 数据来源：0(普通数据上报)；1(MAAS数据上报)；2(设备业务数据上报);3(标签流转)
  /**
   * @example
   * 0
   */
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

// iotx时间
export class TripDuration extends $tea.Model {
  // 时间
  /**
   * @example
   * "1.2"
   */
  value: string;
  // 时间单位
  /**
   * @example
   * "h"
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
      value: 'string',
      unit: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 字典对象
export class DictionaryInfoBO extends $tea.Model {
  // 字典key
  /**
   * @example
   * key1
   */
  label: string;
  // 字典value
  /**
   * @example
   * a
   */
  value: string;
  static names(): { [key: string]: string } {
    return {
      label: 'label',
      value: 'value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      label: 'string',
      value: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 租户信息
export class PermissionedTenantModel extends $tea.Model {
  // 主键Id
  /**
   * @example
   * 1
   */
  id: number;
  // 创建时间
  /**
   * @example
   * 2018-10-10 10:10:00
   */
  gmtCreate: string;
  // 修改时间
  /**
   * @example
   * 2018-10-10 10:10:00
   */
  gmtModified: string;
  // 租户名称
  /**
   * @example
   * testTenant
   */
  tenantName: string;
  // 公司名称
  /**
   * @example
   * alipay
   */
  orgName: string;
  // 租户所有人标识
  /**
   * @example
   * alipay
   */
  owner?: string;
  // 网关私钥
  /**
   * @example
   * MEUCIDxNw...
   */
  gatewayPrivateKey?: string;
  // 网关公钥
  /**
   * @example
   * MEUCID...
   */
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
  /**
   * @example
   * SMART_CAR_KEY
   */
  bizScene: string;
  // 数据资产类型
  /**
   * @example
   * 123
   */
  dataScene: string;
  // 资产ID
  /**
   * @example
   * 123
   */
  assetId: string;
  // 租户id
  /**
   * @example
   * ASDFGHJK
   */
  tenantId: string;
  // 业务数据hash
  /**
   * @example
   * 123
   */
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
  /**
   * @example
   * 内包装
   */
  pointName: string;
  // 鉴定点子项名称
  /**
   * @example
   * 顶部
   */
  subPointName: string;
  // 单点鉴定结果
  // REAL：鉴定为真
  // FAKE：鉴定为假
  // UNABLE_IDENTIFY：无法鉴定
  /**
   * @example
   * REAL
   */
  result: string;
  // 鉴定分数
  /**
   * @example
   * 0.92
   */
  grade?: string;
  // 用户侧的鉴定点point_id，直接将用户传入的user_point_id返回
  /**
   * @example
   * 100
   */
  userPointId?: string;
  // 鉴定评价
  /**
   * @example
   * 完全同一，趋于同一，不同一
   */
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
  /**
   * @example
   * 子鉴定项
   */
  subPointName: string;
  // 商品数字指纹鉴定子项鉴定结果
  /**
   * @example
   * REAL
   */
  result: string;
  // 鉴定子项鉴定得分
  /**
   * @example
   * 0.92
   */
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
  /**
   * @example
   * 2018-10-10 10:10
   */
  time: string;
  // 租户
  /**
   * @example
   * XXXXX
   */
  tenant: string;
  // 小程序应用Id
  /**
   * @example
   * 7006071575519
   */
  appId: string;
  // 用户id
  /**
   * @example
   * 700607
   */
  userId: string;
  // 设备id
  /**
   * @example
   * DEVICE700607157
   */
  deviceId?: string;
  // 操作时间
  /**
   * @example
   * 2018-10-10 10:10:00
   */
  operateTime: string;
  // 操作描述
  /**
   * @example
   * 开锁成功
   */
  operateDesc: string;
  // 操作是否成功
  /**
   * @example
   * true, false
   */
  success: boolean;
  // 日志等级(info、warn、error)
  /**
   * @example
   * info
   */
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
  /**
   * @example
   * 正面
   */
  subPointName: string;
  // 微观图片url
  /**
   * @example
   * http://1001
   */
  microImageUrl: string;
  // 宏观图片url
  /**
   * @example
   * http://xxxx1002
   */
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
  /**
   * @example
   * 1
   */
  id: number;
  // 创建时间
  /**
   * @example
   * 2018-10-10T10:10:00Z
   */
  gmtCreate: string;
  // 更新时间
  /**
   * @example
   * 2018-10-10T10:10:00Z
   */
  gmtModified: string;
  // 租户
  /**
   * @example
   * alipay
   */
  tenantName: string;
  // 场景码
  // 
  /**
   * @example
   * alipay-0101
   */
  scene?: string;
  // 策略类型：DEBUG（技术联调）；MONITOR（生产监控）
  /**
   * @example
   * MONITOR
   */
  strategyType: string;
  // 策略详情，json格式
  /**
   * @example
   * [{  "alert_method": "DING_TALK",   "addresses": "",  "alert_strategy": "",   "params": {     "fail_days" : 10   } }, {  "alert_method": "EMAIL",   "addresses": "",  "alert_strategy": "",  "params": {       } }]
   */
  strategyDetail: string;
  // 是否启用，默认false
  /**
   * @example
   * true, false
   */
  enabled: boolean;
  // 备注
  /**
   * @example
   * 这是一条测试数据
   */
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
  /**
   * @example
   * 内包装
   */
  pointName: string;
  // 鉴定点子项
  /**
   * @example
   * 正面
   */
  subPointName: string;
  // 鉴定点图片的url
  /**
   * @example
   * https://xxxxxx/a.png
   */
  imageUrl?: string;
  // 图片内容base64编码的字符串，该字段与image_url至少一个非空，同时传入以image_url为准
  /**
   * @example
   * /9j/4QyXRXhpZgAATU0AKgAAAAgABwESAAMAAAABAAEAAAEa......
   */
  imageBase64?: string;
  // 用户侧鉴定单关联id
  /**
   * @example
   * 100
   */
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
  /**
   * @example
   * 12321321
   */
  deviceDid: string;
  // 设备唯一编号
  /**
   * @example
   * 12321321
   */
  deviceSn: string;
  // 设备金额，精确到小数后两位
  /**
   * @example
   * 234.01
   */
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
  /**
   * @example
   * 1122
   */
  chainDeviceId?: string;
  // 数据内容
  /**
   * @example
   * {"a","11"}
   */
  content: string;
  // 设备id
  /**
   * @example
   * 433
   */
  deviceId?: string;
  // 上链哈希
  /**
   * @example
   * 5533
   */
  txHash: string;
  // 上链时间
  txTime: number;
  // 链上外围设备ID
  /**
   * @example
   * 123123
   */
  chainPeripheralId?: string;
  // 外围设备ID
  /**
   * @example
   * 123123
   */
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
  /**
   * @example
   * 角色编码
   */
  roleCode: string;
  // 角色名称
  /**
   * @example
   * 角色名称
   */
  roleName: string;
  // 权限列表
  /**
   * @example
   * 权限列表
   */
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
  /**
   * @example
   * REAL
   */
  identificationResult: string;
  // 鉴定结果描述
  /**
   * @example
   * 描述
   */
  description: string;
  // 商品数字指纹鉴定点鉴定结果列表
  /**
   * @example
   * {"sub_point_name":"正面","result":"REAL","grade":"0.92"}
   */
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
  /**
   * @example
   * 123
   */
  trustiotId: number;
  // IoT可信平台设备唯一ID
  /**
   * @example
   * 123
   */
  trustiotEntityId: number;
  // 上报原文解析处理之后的数据
  /**
   * @example
   * processed_content
   */
  processedContent: string;
  // 和上一次上报数据里程对比，新增的里程数
  /**
   * @example
   * 123
   */
  deltaMileage?: number;
  // 正常位置信息：LOCATION
  // 告警信息：ALARM_BASIC、 ALARM_ADAS、 ALARM_DSM、 ALARM_ACCELEROMETER
  /**
   * @example
   * 数据标识
   */
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
  /**
   * @example
   * 10001
   */
  alarmSubType?: number;
  // 关联设备唯一ID
  /**
   * @example
   * 123
   */
  relatedTrustEntityId?: string;
  // 日报日期
  /**
   * @example
   * 2023-12-01
   */
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
  /**
   * @example
   * 2c952456827828cdedad06afccef75a9f2c2840cbb6b0b659f653da1e5916cb2
   */
  contractId: string;
  // 租约时间 
  /**
   * @example
   * 6个月 或 1年
   */
  leaseTime: string;
  // 入住时间
  /**
   * @example
   * 2006-01-02 15:04:05
   */
  checkinDate: string;
  // 退租时间
  /**
   * @example
   * 2018-10-10T10:10:00Z
   */
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
  /**
   * @example
   * 1122
   */
  deviceId: string;
  // 数据模型ID
  /**
   * @example
   * 7033986596836630528
   */
  deviceDataModelId?: string;
  // 固定填写RAW_DATA
  /**
   * @example
   * RAW_DATA
   */
  deviceFeature?: string;
  // true : 设备ID已存在时返回存在的设备关联字段;
  // false : 设备ID已存在时直接抛出异常；
  /**
   * @example
   * true, false
   */
  withExistDeviceId?: boolean;
  // 设备类型编码，联系蚂蚁侧获取设备类型编码
  deviceTypeCode: number;
  // 设备单价 单位：分
  /**
   * @example
   * 1000
   */
  initialPrice?: number;
  // 出厂时间
  /**
   * @example
   * 2018-10-10T10:10:00Z
   */
  factoryTime?: string;
  // 投放时间
  /**
   * @example
   * 2018-10-10T10:10:00Z
   */
  releaseTime?: string;
  // 额外信息，联系蚂蚁侧获取参数格式
  /**
   * @example
   * {...}
   */
  extraInfo?: string;
  // 资产所有人标识（统一社会信用代码）
  /**
   * @example
   * 91310101MA1FPCXA3G
   */
  owner?: string;
  // 资产所有人名称
  /**
   * @example
   * 蚂蚁区块链科技（上海）有限公司
   */
  ownerName?: string;
  // 设备IMEI
  /**
   * @example
   * 861037055012207
   */
  deviceImei?: string;
  // 设备名称/设备型号
  /**
   * @example
   * 64.0V30AH
   */
  deviceName?: string;
  // 生产厂商名
  /**
   * @example
   * 浙江一厂
   */
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
  /**
   * @example
   * 1
   */
  pageIndex: number;
  // 页码
  // 
  /**
   * @example
   * 10
   */
  pageSize: number;
  // 总记录数
  // 
  /**
   * @example
   * 100
   */
  totalSize: number;
  // 总页数
  // 
  /**
   * @example
   * 10
   */
  totalPages: number;
  // 数据
  /**
   * @example
   * {...}
   */
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
  /**
   * @example
   * ahog
   */
  dataCode: string;
  // 数据名称
  /**
   * @example
   * name
   */
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

// 凭证申请接口返回参数
export class CarKeyInitData extends $tea.Model {
  // IIFFAA 根密钥
  /**
   * @example
   * fs
   */
  rootPubKey: string;
  // IIFAA 设备唯一ID
  /**
   * @example
   * e2eer
   */
  tuid: string;
  // 业务密钥
  /**
   * @example
   * erw
   */
  bizPrivKey: string;
  // 设备唯一密钥
  /**
   * @example
   * fdsw
   */
  devicePrivKey: string;
  // 无感空车凭证
  /**
   * @example
   * rew
   */
  keyLessAuthy: string;
  static names(): { [key: string]: string } {
    return {
      rootPubKey: 'root_pub_key',
      tuid: 'tuid',
      bizPrivKey: 'biz_priv_key',
      devicePrivKey: 'device_priv_key',
      keyLessAuthy: 'key_less_authy',
    };
  }

  static types(): { [key: string]: any } {
    return {
      rootPubKey: 'string',
      tuid: 'string',
      bizPrivKey: 'string',
      devicePrivKey: 'string',
      keyLessAuthy: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// iotbasic-应用列表信息
export class IotbasicAppManagerPageInfo extends $tea.Model {
  // 应用类型
  /**
   * @example
   * apk
   */
  fileFormat: string;
  // 应用大小
  fileSize: number;
  // 应用模块名称
  /**
   * @example
   * 温控设备客户端
   */
  moduleName: string;
  // 设备品类code
  /**
   * @example
   * code
   */
  deviceCategory: string;
  // 设备品类名称
  /**
   * @example
   * name
   */
  deviceCategoryName: string;
  // 应用模块包名
  /**
   * @example
   * packageName
   */
  packageName: string;
  // 应用描述
  /**
   * @example
   * desc
   */
  remark?: string;
  // 应用版本号
  /**
   * @example
   * 1.0
   */
  apkVersion: string;
  // 应用包类型（整包：0/差分：1）
  /**
   * @example
   * 0
   */
  apkType: number;
  // 应用名称
  /**
   * @example
   * apkName
   */
  apkName: string;
  // 应用包id
  /**
   * @example
   * apkId
   */
  apkId: string;
  // 下载次数
  /**
   * @example
   * 0
   */
  downloadCount: number;
  // 安装次数
  /**
   * @example
   * 0
   */
  installCount: number;
  // 设备型号
  /**
   * @example
   * model
   */
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

// 四轮车驾驶事件
export class FourWheelerCarEvent extends $tea.Model {
  // 驾驶事件的类型，如正常驾驶、碰撞、急转弯、启动熄火等。
  /**
   * @example
   * 1
   */
  eventType: string;
  // 驾驶事件的结束时间
  /**
   * @example
   * 1736152040551
   */
  endTime: number;
  // 驾驶事件发生地点的经度坐标
  /**
   * @example
   * 121.4737
   */
  lng: string;
  // 驾驶事件发生地点的纬度坐标
  /**
   * @example
   * 31.2304
   */
  lat: string;
  // 驾驶事件开始的速度
  /**
   * @example
   * 60
   */
  startSpeed?: string;
  // 驾驶事件结束时的速度
  /**
   * @example
   * 45
   */
  endSpeed?: string;
  // 驾驶过程中的平均速度
  /**
   * @example
   * 52.5
   */
  averageSpeed?: string;
  // 驾驶过程中车辆的转弯角度
  /**
   * @example
   * 90
   */
  turningAngle?: string;
  // 驾驶事件的持续时间（以秒为单位)
  /**
   * @example
   * 10
   */
  duration?: string;
  static names(): { [key: string]: string } {
    return {
      eventType: 'event_type',
      endTime: 'end_time',
      lng: 'lng',
      lat: 'lat',
      startSpeed: 'start_speed',
      endSpeed: 'end_speed',
      averageSpeed: 'average_speed',
      turningAngle: 'turning_angle',
      duration: 'duration',
    };
  }

  static types(): { [key: string]: any } {
    return {
      eventType: 'string',
      endTime: 'number',
      lng: 'string',
      lat: 'string',
      startSpeed: 'string',
      endSpeed: 'string',
      averageSpeed: 'string',
      turningAngle: 'string',
      duration: 'string',
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
  /**
   * @example
   * 智能防疫一体机
   */
  deviceName: string;
  // 设备序列号
  /**
   * @example
   * CN12300x
   */
  deviceSn: string;
  // 设备品类名称	
  /**
   * @example
   * 智能防疫机
   */
  deviceCategoryName: string;
  // 设备型号
  /**
   * @example
   * PL10
   */
  deviceModel: string;
  // 设备状态
  /**
   * @example
   * online
   */
  deviceStatus?: string;
  // 设备安装位置
  /**
   * @example
   * 浙江省杭州市西湖区 
   */
  location?: string;
  // 设备注册时间
  /**
   * @example
   * 2018-10-10T10:10:00Z
   */
  registerTime: string;
  // 设备厂商
  /**
   * @example
   * 蚂蚁数科
   */
  corpName: string;
  // 租户ID
  /**
   * @example
   * 2088xx
   */
  tenantId: string;
  // 客户名称
  /**
   * @example
   * 测试客户xx 
   */
  customerName: string;
  // 异常错误码
  /**
   * @example
   * SMILE_INIT_ERROR
   */
  abnormalCode?: string;
  // 设备唯一身份id
  /**
   * @example
   * did:private:12dsadadadf 
   */
  deviceDid?: string;
  // 账号ID
  /**
   * @example
   * 12321321
   */
  accountId: string;
  // 账户名称
  /**
   * @example
   * 张三
   */
  accountName: string;
  // 设备服务状态
  /**
   * @example
   * INIT
   */
  serviceStatus: string;
  // 应用版本号
  /**
   * @example
   * 1.1.13
   */
  appVersion: string;
  // 服务有效期
  /**
   * @example
   * 2024-4-01
   */
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
  /**
   * @example
   * "CN,北京"
   */
  extension?: string;
  // 业务类型，默认空
  /**
   * @example
   * null
   */
  bizType?: string;
  // 组织机构代码，可为中文
  /**
   * @example
   * "12345"
   */
  tenantUid: string;
  // 组织结构名称
  /**
   * @example
   * "xx公司xx部门"
   */
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

// provision数据
export class Data extends $tea.Model {
  // provision数据
  /**
   * @example
   * 123XXX
   */
  provisionData: string;
  // 余量
  /**
   * @example
   * 0
   */
  remaining?: number;
  static names(): { [key: string]: string } {
    return {
      provisionData: 'provision_data',
      remaining: 'remaining',
    };
  }

  static types(): { [key: string]: any } {
    return {
      provisionData: 'string',
      remaining: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// iotbasic设备模型固定属性失败内容
export class IotbasicDeviceModelFixedAttributeFailInfo extends $tea.Model {
  // 属性说明
  /**
   * @example
   * name
   */
  attributeName: string;
  // 属性名称
  /**
   * @example
   * value
   */
  attributeValue: string;
  // 数据值类型 字符串：string 数字：long
  /**
   * @example
   * string
   */
  dataType: string;
  // dataType为string时，表示数据长度最小值 dataType为long时，表示数据范围最小值
  dataRangeMin: number;
  // dataType为string时，表示数据长度最大值 dataType为long时，表示数据范围最大值
  dataRangeMax: number;
  // 失败code
  /**
   * @example
   * code
   */
  errorCode: string;
  // 失败消息
  /**
   * @example
   * message
   */
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
  /**
   * @example
   * COSTOMER_ENETITY
   */
  entityType: string;
  // 所关联实体的trustiot唯一ID
  /**
   * @example
   * 7006071575276187649
   */
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
  /**
   * @example
   * xxx
   */
  deviceSpecs: string;
  // 设备型号
  /**
   * @example
   * xxx
   */
  deviceModel: string;
  // 设备名称
  /**
   * @example
   * test
   */
  deviceName: string;
  // 设备sn
  /**
   * @example
   * xx
   */
  deviceSn: string;
  // 设备标签
  /**
   * @example
   * telpo
   */
  nickName?: string;
  // 安装位置
  /**
   * @example
   * 杭州市
   */
  location?: string;
  // 设备扩展信息
  /**
   * @example
   * [{ "txHash" : "2c952456827828cdedad06afccef75a9f2c2840cbb6b0b659f653da1e5916cb2" }]
   */
  deviceExt?: string;
  // 设备安全认证ID
  /**
   * @example
   * secid
   */
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
  /**
   * @example
   * JSSDK_ACCOUNT
   */
  customerEntityType: string;
  // 客户自定义实体内容
  /**
   * @example
   * {...}
   */
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
  /**
   * @example
   * trace_id_001
   */
  traceId: string;
  // query图片定位信息
  queryImageLocation: BaiResourceLocation;
  // gallery图片定位信息
  galleryImageLocation: BaiResourceLocation;
  // 是否允许降级
  /**
   * @example
   * true, false
   */
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
  /**
   * @example
   * 资源池001
   */
  xrTicketPoolName: string;
  // 购买数量，失败列表有值
  /**
   * @example
   * 10
   */
  count?: number;
  // 失败原因，失败列表有值
  /**
   * @example
   * 参数错误
   */
  errorMsg?: string;
  // 通行证编号，成功列表有值
  /**
   * @example
   * 123123
   */
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
  /**
   * @example
   * 北京海淀区
   */
  address?: string;
  // 面积 平方米单位*1e4
  /**
   * @example
   * 1000000
   */
  area?: number;
  // 海拔 米单位*1e2
  /**
   * @example
   * 0
   */
  elevation?: number;
  // 仓库高度 米单位*1e2
  /**
   * @example
   * 1000
   */
  height?: number;
  // 纬度 度数单位*1e9
  /**
   * @example
   * 0
   */
  latitude?: number;
  // 经度 度数单位*1e9
  /**
   * @example
   * 35000000000
   */
  longitude?: number;
  // 所在国家，中国
  /**
   * @example
   * 中国
   */
  nation?: string;
  // 其他信息
  /**
   * @example
   * "自定义"
   */
  otherInfo?: string;
  // 仓库状态, AVAILABLE, IN_USE, DELETED, 自定义
  /**
   * @example
   * "AVAILABLE"
   */
  status?: string;
  // 仓库类型
  /**
   * @example
   * "自定义"
   */
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
  /**
   * @example
   * dadadasda
   */
  orderNumber: string;
  // 收货人姓名
  // 
  /**
   * @example
   * 立敢
   */
  consigneeName: string;
  // 收货人身份证号
  /**
   * @example
   * 424234324324234
   */
  consigneeIdNumber: string;
  // 收货人手机号
  // 
  /**
   * @example
   * 13400113344
   */
  consigneePhone: string;
  // 收货人地址
  /**
   * @example
   * 北京市海淀区XXXXXXXX
   */
  consigneeAddress: string;
  // 供货商名称
  // 
  /**
   * @example
   * fsafsafaf
   */
  supplierName: string;
  // 供货商租户id
  // 
  /**
   * @example
   * fsffafaf
   */
  supplierId: string;
  // 采购商id
  // 
  /**
   * @example
   * fafsafaf
   */
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

// 授权返回实体
export class GrantDeviceInfo extends $tea.Model {
  // 授权ID
  /**
   * @example
   * 00000001
   */
  deviceId: string;
  // 授权ID
  /**
   * @example
   * m6XFxJeTpllXZQ3BEZCyhovWZjoiCqqW
   */
  authRecordId: string;
  static names(): { [key: string]: string } {
    return {
      deviceId: 'device_id',
      authRecordId: 'auth_record_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      deviceId: 'string',
      authRecordId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// iotbasic发布批次信息
export class IotbasicReleaseOrderInfo extends $tea.Model {
  // 应用名称
  /**
   * @example
   * 应用名称
   */
  apkName: string;
  // 应用版本号
  /**
   * @example
   * apkVersion
   */
  apkVersion: string;
  // 工单id
  /**
   * @example
   * orderId
   */
  orderId: string;
  // 工单名称
  /**
   * @example
   * orderName
   */
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
  /**
   * @example
   * IN_PROGRESS
   */
  status: string;
  // 发布时间
  /**
   * @example
   * 2024-06-06 11:11:11
   */
  releaseTime: string;
  // 设备升级总数
  releaseTotal: number;
  // 设备升级完成数
  releaseFinished: number;
  // 工单状态变更时间
  /**
   * @example
   * 2024-06-06 11:11:11
   */
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
  /**
   * @example
   * 温控节能
   */
  projectName: string;
  // 项目编码
  /**
   * @example
   * TEMP_CONTROL
   */
  projectCode: string;
  // 项目描述
  /**
   * @example
   * 这是描述
   */
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
  /**
   * @example
   * 设备001
   */
  instanceId: string;
  // 实例名称
  /**
   * @example
   * 12313
   */
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
  /**
   * @example
   * 123
   */
  blockHash?: string;
  // 父区块hash
  /**
   * @example
   * 123
   */
  parentBlockHash?: string;
  // 交易时间戳
  /**
   * @example
   * 123
   */
  timestamp?: string;
  // 该交易所能消耗的最大gas
  gas?: number;
  // 交易发起方账户
  /**
   * @example
   * 123
   */
  from?: string;
  // 交易接收方账户
  /**
   * @example
   * 123
   */
  to?: string;
  // 交易类型
  /**
   * @example
   * 123
   */
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
  /**
   * @example
   * sn123
   */
  deviceSn: string;
  // 厂商
  /**
   * @example
   * telpo
   */
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
  /**
   * @example
   * 1
   */
  id?: number;
  // 设备品类名称
  /**
   * @example
   * 智能防疫机一体机
   */
  deviceCategory: string;
  // 关系类型
  /**
   * @example
   * CORP
   */
  relationType: string;
  // 厂商名称
  /**
   * @example
   * 天波
   */
  corpName?: string;
  // 设备型号
  /**
   * @example
   * TPS980
   */
  deviceModel?: string;
  // 设备规格
  /**
   * @example
   * 安卓标准版
   */
  deviceSpecs?: string;
  // 硬件模块
  /**
   * @example
   * 测温头
   */
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
  /**
   * @example
   * safsafafafa
   */
  orderId: string;
  // 订单保存失败的原因
  /**
   * @example
   * fasfasfasfa
   */
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
  /**
   * @example
   * 分拣机
   */
  deviceType?: string;
  // 运营日期
  /**
   * @example
   * 20210720
   */
  operationDate?: string;
  // 修改时间
  /**
   * @example
   * 2021-07-20 14:08:17
   */
  gmtModified?: string;
  // 维修金比例
  /**
   * @example
   * 50
   */
  maintenanceMoney?: string;
  // 当日设备维修记录
  /**
   * @example
   * error
   */
  maintainRecord?: string;
  // 设备识别号
  /**
   * @example
   * 10010100101
   */
  deviceNo?: string;
  // 创建时间
  /**
   * @example
   * 2021-07-20 14:08:17
   */
  gmtCreate?: string;
  // 当日分拣单数
  /**
   * @example
   * 131222
   */
  sortingNum?: string;
  // 当日运营时长,单位分钟
  /**
   * @example
   * 1231321
   */
  operationMinute?: string;
  // 04:00-16:00分拣单数/（派件分拣单数）
  /**
   * @example
   * 130012
   */
  amNum?: string;
  // 16:00-04:00分拣单数/ （揽件分拣单数)
  /**
   * @example
   * 1210
   */
  pmNum?: string;
  // id
  /**
   * @example
   * 3
   */
  id?: string;
  // 设备验收日期
  /**
   * @example
   * 2021-07-20 11:33:59
   */
  deviceAcceptanceDate?: string;
  // 数据更新时间
  /**
   * @example
   * 2021-07-20 11:32:35
   */
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
  /**
   * @example
   * a87
   */
  houseId: string;
  // 租赁模式
  /**
   * @example
   * 合租
   */
  leaseMode?: string;
  // 面积平方
  /**
   * @example
   * 120㎡
   */
  acreage?: string;
  // 房源类型：0住宅、1别墅、
  // 2商铺、3写字楼
  /**
   * @example
   * 0
   */
  structure: number;
  // 房屋地址
  /**
   * @example
   * hz
   */
  addr?: string;
  // 门锁设备DID
  /**
   * @example
   * L91923
   */
  lockId?: string;
  // 电表设备DID
  /**
   * @example
   * A87345
   */
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
  /**
   * @example
   * [{"content":"{业务数据}","label":"CRYPTO","timestamp":0}]
   */
  bizData?: string;
  // 不同上链方式
  // 空/"": 默认
  // "TTTS": 溯源
  // "IOTPAY": 支付
  // "CZ": 存证
  // "RAW":文本
  /**
   * @example
   * "CZ"
   */
  category: string;
  // 上链实体id(设备/空间)
  // 不可和project_uid同时为空
  /**
   * @example
   * "did:iot:a9147bd2b83d4732b56dc06b346588f5619f80a2d4d2412fab535cbd37293a00"
   */
  iotDid?: string;
  // 需要上链的证据的哈希值
  /**
   * @example
   * "ace1213412313"
   */
  hash?: string;
  // 上链的附属信息
  /**
   * @example
   * "附属信息json"
   */
  metaJson?: string;
  // 上链的项目id,
  // 不可和iot_did同时为空
  /**
   * @example
   * "上链的项目id"
   */
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
  /**
   * @example
   * 电力仪表
   */
  categoryName: string;
  // 品类编码
  /**
   * @example
   * ant_power_meter
   */
  categoryCode: string;
  // 描述内容
  /**
   * @example
   * 这是描述
   */
  remark?: string;
  // 行业
  /**
   * @example
   * 工业
   */
  industry: string;
  // 场景
  /**
   * @example
   * 智能工业
   */
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
  /**
   * @example
   * 1122
   */
  chainDeviceId?: string;
  // 可信设备ID（与链上设备ID至少填一项）
  /**
   * @example
   * 7006071575519457281
   */
  trustiotDeviceId?: number;
  // 收集的内容
  /**
   * @example
   * {"name","1"}
   */
  content: string;
  // 对内容的签名
  /**
   * @example
   * wwexe02j
   */
  signature: string;
  // 服务端发送的扩展数据（非可信设备直接产生的数据）
  /**
   * @example
   * {"extraKey":"extraValue"}
   */
  extraData?: string;
  // 数据模型Id
  /**
   * @example
   * 00000001
   */
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
  /**
   * @example
   * 12321321
   */
  billItemId: string;
  // 租约分期名称
  /**
   * @example
   * 第几期
   */
  billItemName?: string;
  // 租期开始日期
  /**
   * @example
   * 2006-01-02 15:04:05
   */
  billItemBegin: string;
  // 租期结束日期 
  /**
   * @example
   * 2006-02-02 15:04:05
   */
  billItemEnd: string;
  // 租约金额
  /**
   * @example
   * 5000
   */
  billItemMoney: string;
  // 租约支付状态
  /**
   * @example
   * 待支付，已支付，支付失败
   */
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
  /**
   * @example
   * TEST1234567890
   */
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
  /**
   * @example
   * 123456
   */
  entityId: string;
  // 数据原文
  /**
   * @example
   * content
   */
  content: string;
  // 数据原文对应的签名
  /**
   * @example
   * 1ac3dfe2
   */
  sign: string;
  // 数据原文上链哈希
  /**
   * @example
   * 1f2a9ec2b
   */
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
  /**
   * @example
   * 112233
   */
  dataModelId: string;
  // 数据模型名称
  /**
   * @example
   * 检测设备模型
   */
  dataModelName?: string;
  // 数据模型
  /**
   * @example
   * {          "PIC-URL": {                 "type": "string",                 "require":false              } }
   */
  dataModel: string;
  // 数据模型类别
  /**
   * @example
   * ORDER
   */
  bizType?: string;
  // 用户自定义版本
  /**
   * @example
   * V1.0
   */
  customerVersion?: string;
  // 数据样例
  /**
   * @example
   * {"name":"zhangsan"}
   */
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
  /**
   * @example
   * /9j/4QyXRXhpZgAATU0AKgAAAAgABwESAAMAAAABAAEAAAEa......
   */
  generateResult: string;
  // 生成结果码
  /**
   * @example
   * 200
   */
  generateCode: string;
  // 用于异常场景下细化错误信息
  /**
   * @example
   * 码值不正确
   */
  generateMessage: string;
  // 生成失败时的解决方案，用于异常场景下细化错误信息
  /**
   * @example
   * 请调整码值重试
   */
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
  /**
   * @example
   * 2018-10-10 10:10:00
   */
  detailStartTime: string;
  // 结束时间
  /**
   * @example
   * 2018-10-10 10:10:00
   */
  detailEndTime: string;
  // 时段电价，小数点后4位
  /**
   * @example
   * 10.1010
   */
  elecPrice?: string;
  // 时段服务费价格，小数点后4位
  /**
   * @example
   * 12.6222
   */
  servicePrice?: string;
  // 时段充电量，单位：度，小数点后2位
  /**
   * @example
   * 12.12
   */
  detailPower: string;
  // 时段电费，小数点后2位
  /**
   * @example
   * 10.10
   */
  detailElecMoney?: string;
  // 时段服务费，小数点后2位
  /**
   * @example
   * 10.10
   */
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
  /**
   * @example
   * 租户id
   */
  tenantId: string;
  // 资源id
  /**
   * @example
   * 资源id
   */
  resourceId: string;
  // 有效期
  /**
   * @example
   * 2022-10-02
   */
  validTime: string;
  // 体验时长
  /**
   * @example
   * 60(单位分)
   */
  testTime: number;
  // vr设备集合
  /**
   * @example
   * json或数组
   */
  xrApps?: string;
  // 券池最大数
  /**
   * @example
   * 200
   */
  maxPoolCount: number;
  // 券池名称
  /**
   * @example
   * 券池名称
   */
  xrTicketPoolName: string;
  // 核销类型
  /**
   * @example
   * XR_DEVICE
   */
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

// 智能体信息视图对象
export class AgentInfoVO extends $tea.Model {
  // 智能体ID
  /**
   * @example
   * 7265889323732762624
   */
  agentId: string;
  // 智能体名称
  /**
   * @example
   * 小蚁
   */
  agentName: string;
  // 语言编码
  /**
   * @example
   * zh
   */
  langCode: string;
  // 音色ID
  /**
   * @example
   * longjing_v2
   */
  ttsVoiceId: string;
  // 系统提示词
  /**
   * @example
   * 你是一个某某智能体
   */
  systemPrompt: string;
  // 可选模型列表
  /**
   * @example
   * [{"label":"qwen-plus","value":"qwen-plus"},{"label":"glm4.7","value":"glm4.7"},{"label":"glm5","value":"glm5"}]
   */
  llmModelList?: DictionaryInfoBO[];
  // 可选音色列表
  /**
   * @example
   * [{"label":"甜甜（女声普通话）","value":"Tina"},{"label":"拉迪奥·戈尔（男声葡萄牙语）","value":"Radio Gol"}]
   */
  ttsVoiceList?: DictionaryInfoBO[];
  // 可选语言列表
  /**
   * @example
   * [{"label": "中文","value": "zh"},{"label": "英文","value": "en"}]
   */
  languageList?: DictionaryInfoBO[];
  // 父模板智能体名称
  /**
   * @example
   * 小蚁模板
   */
  parentTemplateAgentName?: string;
  static names(): { [key: string]: string } {
    return {
      agentId: 'agent_id',
      agentName: 'agent_name',
      langCode: 'lang_code',
      ttsVoiceId: 'tts_voice_id',
      systemPrompt: 'system_prompt',
      llmModelList: 'llm_model_list',
      ttsVoiceList: 'tts_voice_list',
      languageList: 'language_list',
      parentTemplateAgentName: 'parent_template_agent_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      agentId: 'string',
      agentName: 'string',
      langCode: 'string',
      ttsVoiceId: 'string',
      systemPrompt: 'string',
      llmModelList: { 'type': 'array', 'itemType': DictionaryInfoBO },
      ttsVoiceList: { 'type': 'array', 'itemType': DictionaryInfoBO },
      languageList: { 'type': 'array', 'itemType': DictionaryInfoBO },
      parentTemplateAgentName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 要素关系信息
export class AssetElementRelationInfo extends $tea.Model {
  // 来源要素ID
  /**
   * @example
   * 112233
   */
  sourceElementId: string;
  // 目标要素ID
  /**
   * @example
   * 112233
   */
  targetElementId: string;
  // 关联类型
  /**
   * @example
   * 1
   */
  relationType: number;
  // 关联依据类型
  /**
   * @example
   * NORMAL
   */
  relationDependencyType?: string;
  // 关联依据
  /**
   * @example
   * {...}
   */
  relationDependency?: string;
  // 项目ID
  /**
   * @example
   * 112233
   */
  projectId: string;
  // 来源要素名称
  /**
   * @example
   * 来源要素
   */
  sourceElementName: string;
  // 目标要素名称
  /**
   * @example
   * 目标要素
   */
  targetElementName: string;
  static names(): { [key: string]: string } {
    return {
      sourceElementId: 'source_element_id',
      targetElementId: 'target_element_id',
      relationType: 'relation_type',
      relationDependencyType: 'relation_dependency_type',
      relationDependency: 'relation_dependency',
      projectId: 'project_id',
      sourceElementName: 'source_element_name',
      targetElementName: 'target_element_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      sourceElementId: 'string',
      targetElementId: 'string',
      relationType: 'number',
      relationDependencyType: 'string',
      relationDependency: 'string',
      projectId: 'string',
      sourceElementName: 'string',
      targetElementName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 更新设备和空间关联请求结构体
export class UpdateDeviceSpaceReq extends $tea.Model {
  // API要更新的设备DID
  /**
   * @example
   * "did:iot:xxxxx"
   */
  deviceDid: string;
  // 0-全部更新 (暂不支持)
  // 1-添加  
  // 2-删除
  // 
  /**
   * @example
   * 1
   */
  updateMode: number;
  // API要更新的设备部署库位
  /**
   * @example
   * ["did:iot:xxxx","did:iot:xxxxx"]
   */
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
  /**
   * @example
   * 12321321
   */
  deviceName: string;
  // 设备sn
  /**
   * @example
   * 2088xx
   */
  deviceSn: string;
  // 错误编码
  /**
   * @example
   * code
   */
  code: string;
  // 错误描述
  /**
   * @example
   * message
   */
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
  /**
   * @example
   * 123ABC
   */
  deviceId: string;
  // 数据模型Id
  /**
   * @example
   * 112233
   */
  deviceDataModelId: string;
  // 场景码
  /**
   * @example
   * SCENE1
   */
  scene: string;
  // imei号
  /**
   * @example
   * 223344
   */
  deviceImei: string;
  // 设备名称
  /**
   * @example
   * 设备1号
   */
  deviceName?: string;
  // 设备厂商名称
  /**
   * @example
   * 浙江一厂
   */
  corpName?: string;
  // 设备ICCID
  // 
  // 
  /**
   * @example
   * a1234
   */
  deviceIccid?: string;
  // 设备扩展信息
  /**
   * @example
   * {“”:""}
   */
  extraInfo?: string;
  // 设备链上Id
  /**
   * @example
   * 223344
   */
  chainDeviceId: string;
  // 上链哈希
  /**
   * @example
   * 3344
   */
  txHash: string;
  // 上链时间
  /**
   * @example
   * 224455
   */
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
  /**
   * @example
   * 5000
   */
  deviceTypeCode: number;
  // 单价
  /**
   * @example
   * 1000
   */
  initialPrice: number;
  // 投放时间
  /**
   * @example
   * 2018-10-10T10:10:00Z
   */
  releaseTime: string;
  // 出厂时间
  /**
   * @example
   * 2018-10-10T10:10:00Z
   */
  factoryTime: string;
  // 设备状态，取值范围：NORMAL、OFFLINE、UNREGISTER
  /**
   * @example
   * NORMAL
   */
  deviceStatus?: string;
  // 可信设备ID
  /**
   * @example
   * 7006071575276187649
   */
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
  /**
   * @example
   * 防疫一体机
   */
  productName: string;
  // 产品code
  /**
   * @example
   * face_smart
   */
  productCode: string;
  // 产品描述
  /**
   * @example
   * 智能防疫机
   */
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
  /**
   * @example
   * 0
   */
  authLevel?: number;
  // 设备属性字符串，
  // 阿里云设备类型，填入三元组
  /**
   * @example
   * "设备属性"
   */
  deviceAttribute?: string;
  // 物模型ID，参考其他文档
  /**
   * @example
   * "模型ID"
   */
  deviceModelId?: string;
  // 可传入自定义信息
  /**
   * @example
   * "自定义字段"
   */
  otherInfo?: string;
  // 业务自定义，可以传入该实体的w3c服务节点
  /**
   * @example
   * "服务端点"
   */
  serviceEndpoint?: string;
  // 保留，默认
  //     STATUS_REGISTERED(3)
  /**
   * @example
   * null
   */
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
  /**
   * @example
   * 213
   */
  deviceDid: string;
  // 设备签名
  /**
   * @example
   * sua8e
   */
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
  /**
   * @example
   * 10010100101
   */
  deviceNo: string;
  // 运营日期
  /**
   * @example
   * 2021-07-20 11:34:00
   */
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
  /**
   * @example
   * XR_LEASE
   */
  bizScene: string;
  // 所属客户
  /**
   * @example
   * QWERTYUI
   */
  tenantId: string;
  // 用户通行证编码
  /**
   * @example
   * 8613356
   */
  xrTicketCode: string;
  // xr通行证资源池名称
  /**
   * @example
   * 资源池001
   */
  xrTicketPoolName: string;
  // 用户id
  /**
   * @example
   * 2088**
   */
  userId: string;
  // 资源id
  /**
   * @example
   * xsadds
   */
  resourceId: string;
  // 资源名称
  /**
   * @example
   * 资源001
   */
  resourceName: string;
  // 用户通行证状态
  /**
   * @example
   * 待核销
   */
  status: string;
  // 有效期
  /**
   * @example
   * 2023-03-28
   */
  validTime: string;
  // 实例id
  /**
   * @example
   * 86871
   */
  instanceId?: string;
  // 核销时间
  /**
   * @example
   * 2018-10-10 10:10:00
   */
  xrVerificationTime?: string;
  // 体验开始时间
  /**
   * @example
   * 2018-10-10 10:10:00
   */
  sampleStartTime?: string;
  // 体验结束时间
  /**
   * @example
   * 2018-10-10 10:10:00
   */
  sampleEndTime?: string;
  // 核销类型
  /**
   * @example
   * XR_DEVICE
   */
  xrVerificationType: string;
  // 实例名称
  /**
   * @example
   * 实例001
   */
  instanceName?: string;
  // 体验时长，分
  /**
   * @example
   * 60
   */
  testTime: number;
  // vr应用集合
  /**
   * @example
   * vr应用集合
   */
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
  /**
   * @example
   * ["如下1","如下2"]
   */
  dataFilter: string[];
  // 是否从链上查询，从链上查询将返回txHash值
  /**
   * @example
   * false
   */
  onChain: boolean;
  // 需要查询的实体Did列表，同一次查询的Did须为相同类型
  /**
   * @example
   * ["did:iot:xxxx","did:iot:yyyyy"]
   */
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

// 设备信息
export class DeviceInfos extends $tea.Model {
  // tuid
  /**
   * @example
   * ""
   */
  tuid?: string;
  // 设备状态
  /**
   * @example
   * online
   */
  deviceStatus?: string;
  // ota version
  /**
   * @example
   * ""
   */
  deviceOtaVersion?: string;
  static names(): { [key: string]: string } {
    return {
      tuid: 'tuid',
      deviceStatus: 'device_status',
      deviceOtaVersion: 'device_ota_version',
    };
  }

  static types(): { [key: string]: any } {
    return {
      tuid: 'string',
      deviceStatus: 'string',
      deviceOtaVersion: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 会话内容
export class AiAgentChatHistoryBO extends $tea.Model {
  // 客户端ID
  /**
   * @example
   * 00:ba:cc
   */
  clientId: string;
  // 客户端类型
  /**
   * @example
   * ESP32
   */
  clientType: string;
  // 对话内容
  /**
   * @example
   * ...对话内容
   */
  conversationContent: string;
  // 对话类型
  /**
   * @example
   * request
   */
  conversationType: string;
  // 会话ID
  /**
   * @example
   * 7468486322254688256
   */
  sessionId: string;
  // 对话时间（格式化后的时间）
  /**
   * @example
   * 2026-06-24 21:32:59
   */
  time: string;
  static names(): { [key: string]: string } {
    return {
      clientId: 'client_id',
      clientType: 'client_type',
      conversationContent: 'conversation_content',
      conversationType: 'conversation_type',
      sessionId: 'session_id',
      time: 'time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      clientId: 'string',
      clientType: 'string',
      conversationContent: 'string',
      conversationType: 'string',
      sessionId: 'string',
      time: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 商品鉴定返回结果
export class BaiGoodsComparisonResponse extends $tea.Model {
  // 鉴定结果（REAL：为真   FAKE：为假   UNABLE_IDENTIFY：无法鉴定）
  /**
   * @example
   * REAL
   */
  identificationResult: string;
  // 鉴定补充信息
  /**
   * @example
   * 鉴定成功
   */
  identificationMessage?: string;
  // 鉴定信息code
  /**
   * @example
   * 200
   */
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
  /**
   * @example
   * 1
   */
  pageIndex: number;
  // 页码
  /**
   * @example
   * 10
   */
  pageSize: number;
  // 总记录数
  /**
   * @example
   * 100
   */
  totalSize: number;
  // 总页数
  /**
   * @example
   * 10
   */
  totalPages: number;
  // 数据
  /**
   * @example
   * {...}
   */
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
  /**
   * @example
   * 234
   */
  planId?: number;
  // 刷库计划步骤id
  /**
   * @example
   * 234
   */
  planStepId?: number;
  // 任务id
  /**
   * @example
   * 234
   */
  taskId?: number;
  // action_id
  /**
   * @example
   * 234
   */
  actionId?: number;
  // 任务类型
  /**
   * @example
   * 升级，溯源
   */
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
  /**
   * @example
   * REAL
   */
  identificationResult: string;
  // 整体鉴定分数
  /**
   * @example
   * 0.99
   */
  grade: string;
  // 整体鉴定报告描述
  /**
   * @example
   * AI鉴定成功
   */
  description?: string;
  // 鉴定点鉴定结果列表
  pointIdentificationResults: BaiGoodsPointIdentificationResult[];
  // 鉴定评价
  /**
   * @example
   * 完全同一，趋于同一，和不同一
   */
  appraiseMessage?: string;
  // 用户自定义字符串，系统不做处理，会在响应体中带回
  /**
   * @example
   * state
   */
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
  /**
   * @example
   * DWWS2D
   */
  tenant: string;
  // 金融云用户Id
  // 
  /**
   * @example
   * 12321321
   */
  cloudUserId: string;
  // 金融云平台的登录名
  // 
  /**
   * @example
   * xxx@alitest.com
   */
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
  /**
   * @example
   * 244
   */
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

// 设备物模型行程统计信息
export class DeviceTripProperties extends $tea.Model {
  // 上报时间
  /**
   * @example
   * 1765794345159
   */
  reportTime: string;
  // 1
  /**
   * @example
   * 1
   */
  powerStatus: string;
  // 1
  /**
   * @example
   * 1
   */
  enduranceMileage: string;
  // 1
  /**
   * @example
   * 1
   */
  totalMileage: string;
  // 1
  /**
   * @example
   * 1
   */
  speed: string;
  // 1
  /**
   * @example
   * 1
   */
  coord: string;
  // 1
  /**
   * @example
   * 1
   */
  location: string;
  // 1
  /**
   * @example
   * 1
   */
  rein: string;
  // 1
  /**
   * @example
   * 1
   */
  spdBd: string;
  // 1
  /**
   * @example
   * 1
   */
  cs: string;
  // 1
  /**
   * @example
   * 1
   */
  eqst: string;
  static names(): { [key: string]: string } {
    return {
      reportTime: 'report_time',
      powerStatus: 'power_status',
      enduranceMileage: 'endurance_mileage',
      totalMileage: 'total_mileage',
      speed: 'speed',
      coord: 'coord',
      location: 'location',
      rein: 'rein',
      spdBd: 'spd_bd',
      cs: 'cs',
      eqst: 'eqst',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reportTime: 'string',
      powerStatus: 'string',
      enduranceMileage: 'string',
      totalMileage: 'string',
      speed: 'string',
      coord: 'string',
      location: 'string',
      rein: 'string',
      spdBd: 'string',
      cs: 'string',
      eqst: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// iotbasic项目品类行业场景内容
export class IotbasicCategoryIndustrySceneInfo extends $tea.Model {
  // 行业
  /**
   * @example
   * 工业
   */
  industry: string;
  // 场景
  /**
   * @example
   * 智能工业
   */
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
  /**
   * @example
   * name
   */
  attributeName: string;
  // 属性名称
  /**
   * @example
   * value
   */
  attributeValue: string;
  // 数据值类型
  // 字符串：string
  // 数字：long
  /**
   * @example
   * string
   */
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

// 批量定时控车 批次详情
export class BatchJobDetail extends $tea.Model {
  // 批次Id
  /**
   * @example
   * ""
   */
  batchId?: string;
  // 批次名称
  /**
   * @example
   * ""
   */
  batchName?: string;
  // 批次状态
  /**
   * @example
   * ""
   */
  status?: string;
  // 租户Id
  /**
   * @example
   * ""
   */
  tenantId?: number;
  // 触发模式
  /**
   * @example
   * ""
   */
  triggerMode?: string;
  // 定时执行时间戳
  /**
   * @example
   * 1765794345159
   */
  scheduledTime?: number;
  // 实际开始时间戳
  /**
   * @example
   * 1765794345159
   */
  actualStartTime?: number;
  // 实际结束时间戳
  /**
   * @example
   * 1765794345159
   */
  actualEndTime?: number;
  // 总设备数
  /**
   * @example
   * 1
   */
  totalCount?: number;
  // 成功数
  /**
   * @example
   * 1
   */
  successCount?: number;
  // 失败数
  /**
   * @example
   * 1
   */
  failedCount?: number;
  // 操作人
  /**
   * @example
   * ""
   */
  operator?: string;
  static names(): { [key: string]: string } {
    return {
      batchId: 'batch_id',
      batchName: 'batch_name',
      status: 'status',
      tenantId: 'tenant_id',
      triggerMode: 'trigger_mode',
      scheduledTime: 'scheduled_time',
      actualStartTime: 'actual_start_time',
      actualEndTime: 'actual_end_time',
      totalCount: 'total_count',
      successCount: 'success_count',
      failedCount: 'failed_count',
      operator: 'operator',
    };
  }

  static types(): { [key: string]: any } {
    return {
      batchId: 'string',
      batchName: 'string',
      status: 'string',
      tenantId: 'number',
      triggerMode: 'string',
      scheduledTime: 'number',
      actualStartTime: 'number',
      actualEndTime: 'number',
      totalCount: 'number',
      successCount: 'number',
      failedCount: 'number',
      operator: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 行程详情
export class TripDetail extends $tea.Model {
  // 行程id
  /**
   * @example
   * T20251210140000001
   */
  tripId: string;
  // 开始时间
  /**
   * @example
   * 1765794345159
   */
  startTime: number;
  // 结束时间
  /**
   * @example
   * 1765794345159
   */
  endTime: number;
  // 行驶里程
  /**
   * @example
   * 36.9
   */
  mileage: string;
  // 单次用时
  /**
   * @example
   * "duration":{ "value":"79", "unit":"h" },
   */
  duration: TripDuration;
  // 最高速度
  /**
   * @example
   * 86
   */
  maxSpeed: string;
  // 平均速度
  /**
   * @example
   * 32
   */
  avgSpeed: string;
  // 开始地址
  /**
   * @example
   * 上海市浦东新区张江高科技园区博云路
   */
  firstAddress: string;
  // 结束地址
  /**
   * @example
   * 上海市浦东新区张江高科技园区博云路
   */
  lastAddress: string;
  // 最开始定位时间
  /**
   * @example
   * 1733841605000
   */
  firstLocationTime: number;
  // 最后结束定位时间
  /**
   * @example
   * 1733845195000
   */
  lastLocationTime: number;
  static names(): { [key: string]: string } {
    return {
      tripId: 'trip_id',
      startTime: 'start_time',
      endTime: 'end_time',
      mileage: 'mileage',
      duration: 'duration',
      maxSpeed: 'max_speed',
      avgSpeed: 'avg_speed',
      firstAddress: 'first_address',
      lastAddress: 'last_address',
      firstLocationTime: 'first_location_time',
      lastLocationTime: 'last_location_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      tripId: 'string',
      startTime: 'number',
      endTime: 'number',
      mileage: 'string',
      duration: TripDuration,
      maxSpeed: 'string',
      avgSpeed: 'string',
      firstAddress: 'string',
      lastAddress: 'string',
      firstLocationTime: 'number',
      lastLocationTime: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 通行证批量创建失败列表
export class XrTicketPoolFailList extends $tea.Model {
  // 券名称
  /**
   * @example
   * 券名称
   */
  xrTicketPoolName: string;
  // 资源id
  /**
   * @example
   * 资源id
   */
  resourceId: string;
  // 错误码
  /**
   * @example
   * ok
   */
  errorCode: string;
  // 租户id
  /**
   * @example
   * 租户id
   */
  tenantId: string;
  // 错误信息
  /**
   * @example
   * 错误信息
   */
  errorMsg: string;
  // 核销类型
  /**
   * @example
   * XR_DEVICE
   */
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
  /**
   * @example
   * {"backResult":{"issue":"XXXX","endDate":"20231010","startDate":"20131010"}}
   */
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

// 获取设备授权返回信息
export class EmpowerDeviceInfo extends $tea.Model {
  // 设备ID
  /**
   * @example
   * 00000001
   */
  deviceId: string;
  // ACCEPTED(接受)/REVOKED(撤销)
  /**
   * @example
   * ACCEPTED
   */
  authStatus: string;
  // 移除授权时间，毫秒级时间戳
  /**
   * @example
   * 1781690409
   */
  removeTime?: number;
  static names(): { [key: string]: string } {
    return {
      deviceId: 'device_id',
      authStatus: 'auth_status',
      removeTime: 'remove_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      deviceId: 'string',
      authStatus: 'string',
      removeTime: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 溯源防伪码质检请求的请求数据
export class BaiQrcodeVerifyReqData extends $tea.Model {
  // 二维码图片url
  /**
   * @example
   * http://xxxxxx
   */
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
  /**
   * @example
   * qsdfskjes
   */
  instanceId: string;
  // 生成的实例名称，xr设备就的对应的具体设备sn
  /**
   * @example
   * 设备sn
   */
  instanceName: string;
  // 线下场有效期
  /**
   * @example
   * 2022-10-02 09:10:09
   */
  validTime: string;
  // 服务状态：INIT初始化、SERVICING服务中、PAUSED已暂停、EXPIRED停用
  /**
   * @example
   * INIT
   */
  seviceStatus: string;
  // 设备状态：INIT 初始化、ONLINE 在线、OFFLINE 离线、FAULT 故障、ACTIVATED 激活
  /**
   * @example
   * ONLINE
   */
  deviceStatus: string;
  // 唯一ID，对应线下场code
  /**
   * @example
   * 唯一ID，对应线下场code
   */
  resourceId: string;
  // 对应线下场名称
  /**
   * @example
   * 对应线下场名称
   */
  resourceName: string;
  // 核销类型
  /**
   * @example
   * XR_DEVICE
   */
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
  /**
   * @example
   * SMART_CAR_KEY
   */
  bizType: string;
  // 业务状态
  /**
   * @example
   * unbound
   */
  bizStatus: string;
  // 时间
  /**
   * @example
   * 2018-10-10 10:10:00
   */
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
  /**
   * @example
   * null
   */
  bizType?: string;
  // 信物链实体的所有者的分布式身份
  /**
   * @example
   * "did:mychain:xxxxx"
   */
  ownerTenantDid?: string;
  // 信物链实体附加信息 不同实体身份，有不同的json组织格式...
  // 参考
  // DeviceRegisterReqModel，
  // SpaceRegisterReqModel，
  // CorporateReqModel，
  // WarehouseReqModel，
  // 
  /**
   * @example
   * "附加信息"
   */
  thingExtraParams?: string;
  // 原始id，租户内同一类型实体唯一
  /**
   * @example
   * "租户下唯一ID"
   */
  thingOriginId: string;
  // 实体原始名称
  /**
   * @example
   * "摄像头a"
   */
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
  /**
   * @example
   * 0
   */
  thingType: number;
  // 实体版本
  /**
   * @example
   * "1.0.0"
   */
  thingVersion: string;
  // 信物链实体的使用方的分布式身份列表
  /**
   * @example
   * ["did:mychain:xxxx1","did:mychain:xxxx2"]
   */
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
  /**
   * @example
   * 81htq898
   */
  collectId: string;
  // 错误码
  /**
   * @example
   * bad_param
   */
  code: string;
  // 错误信息
  /**
   * @example
   * 参数错误
   */
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
  /**
   * @example
   * true
   */
  detection: boolean;
  // 鉴定结果
  // REAL：鉴定为真
  // FAKE：鉴定为假
  // UNABLE_IDENTIFY：无法鉴定
  /**
   * @example
   * REAL
   */
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
  /**
   * @example
   * REAL
   */
  identificationResult: string;
  // 辅助识别结果码
  /**
   * @example
   * 700
   */
  identificationCode: string;
  // 辅助识别信息
  /**
   * @example
   * 二维码不符合标准
   */
  identificationMessage: string;
  // 无法鉴定时的解决方案
  /**
   * @example
   * 请重新印刷
   */
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
  /**
   * @example
   * 123
   */
  mediaId: string;
  // 文件名称
  /**
   * @example
   * xxxx.jpg
   */
  name: string;
  // 可访问的url
  /**
   * @example
   * https://oss.com/53/85855.jpg?sign=xxx
   */
  url: string;
  // 上传时间
  /**
   * @example
   * 1687859592688
   */
  gmtCreate: number;
  // 多媒体类型枚举：IMAGE 图像；AUDIO 音频；VIDEO视频； UN_KNOW  未知；
  /**
   * @example
   * IMAGE
   */
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

// iotx行程统计
export class TripStatistics extends $tea.Model {
  // 总里程
  /**
   * @example
   * 23
   */
  totalMileage: string;
  // 时间体
  /**
   * @example
   * "totalDuration":{ "value":"79", "unit":"h" }
   */
  totalDuration: TripDuration;
  // 总次数
  /**
   * @example
   * 12
   */
  totalCount: number;
  // 时期码
  /**
   * @example
   * 2
   */
  periodCode: number;
  static names(): { [key: string]: string } {
    return {
      totalMileage: 'total_mileage',
      totalDuration: 'total_duration',
      totalCount: 'total_count',
      periodCode: 'period_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      totalMileage: 'string',
      totalDuration: TripDuration,
      totalCount: 'number',
      periodCode: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 商品鉴定点检测接口响应数据
export class BaiGoodsPointCheckRespData extends $tea.Model {
  // 图片是否有效，无效则需要提示重拍
  /**
   * @example
   * true, false
   */
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

// 批量定时任务详情
export class TaskDetail extends $tea.Model {
  // 批次id
  /**
   * @example
   * ""
   */
  batchId?: string;
  // tuid
  /**
   * @example
   * ""
   */
  tuid?: string;
  // device_name
  /**
   * @example
   * ""
   */
  deviceName?: string;
  // 状态
  /**
   * @example
   * ""
   */
  status?: string;
  // 调用时间
  /**
   * @example
   * 1765794345159
   */
  invokeTime?: number;
  // 错误信息
  /**
   * @example
   * ""
   */
  errorMsg?: string;
  // 重试次数
  /**
   * @example
   * 1
   */
  retryCount?: number;
  static names(): { [key: string]: string } {
    return {
      batchId: 'batch_id',
      tuid: 'tuid',
      deviceName: 'device_name',
      status: 'status',
      invokeTime: 'invoke_time',
      errorMsg: 'error_msg',
      retryCount: 'retry_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      batchId: 'string',
      tuid: 'string',
      deviceName: 'string',
      status: 'string',
      invokeTime: 'number',
      errorMsg: 'string',
      retryCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 事件数据领域参数 
export class EventSpecs extends $tea.Model {
  // 物模型事件ID
  /**
   * @example
   * 7084744398341955584
   */
  eventModelId: string;
  // 是否返回上链HASH，缺省值按false处理
  /**
   * @example
   * true, false
   */
  returnHash?: boolean;
  // 业务数据标识
  /**
   * @example
   * ORDER
   */
  bizType?: string;
  // 提交日期
  /**
   * @example
   * 2024-08-15
   */
  submitDate?: string;
  // 是否是补数据内容
  /**
   * @example
   * true, false
   */
  isRepaired?: boolean;
  static names(): { [key: string]: string } {
    return {
      eventModelId: 'event_model_id',
      returnHash: 'return_hash',
      bizType: 'biz_type',
      submitDate: 'submit_date',
      isRepaired: 'is_repaired',
    };
  }

  static types(): { [key: string]: any } {
    return {
      eventModelId: 'string',
      returnHash: 'boolean',
      bizType: 'string',
      submitDate: 'string',
      isRepaired: 'boolean',
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
  /**
   * @example
   * 1
   */
  pageIndex: number;
  // 页码
  // 
  /**
   * @example
   * 10
   */
  pageSize: number;
  // 总记录数
  // 
  /**
   * @example
   * 100
   */
  totalSize: number;
  // 总页数
  // 
  /**
   * @example
   * 10
   */
  totalPages: number;
  // 数据
  /**
   * @example
   * {...}
   */
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
  /**
   * @example
   * 00
   */
  cla: number;
  //  host challenge data.
  /**
   * @example
   * [0,0]
   */
  data: number[];
  // private byte ins;
  /**
   * @example
   * 00
   */
  ins: number;
  //  private byte lc;
  /**
   * @example
   * lc
   */
  lc: number;
  // private byte le = (byte) 0x00;
  /**
   * @example
   * 0
   */
  le?: number;
  // private Boolean needSecurityHandle = Boolean.TRUE;
  /**
   * @example
   * true, false
   */
  needSecurityHandle?: boolean;
  // private byte p1;
  /**
   * @example
   * 00
   */
  p1: number;
  // private byte p2 = (byte) 0x00;
  /**
   * @example
   * 00
   */
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
  /**
   * @example
   * 资源id
   */
  resourceId: string;
  // 通行证有效期
  /**
   * @example
   * 通行证有效期
   */
  validTime: string;
  // 体验时长
  /**
   * @example
   * 60(单位分)
   */
  testTime: number;
  // vr设备集合
  /**
   * @example
   * json或数组
   */
  xrApps?: string;
  // 券池最大出票数
  /**
   * @example
   * 100
   */
  maxPoolCount: number;
  // 通行证名称
  /**
   * @example
   * 通行证名称
   */
  xrTicketPoolName: string;
  // 核销类型
  /**
   * @example
   * XR_DEVICE
   */
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
  /**
   * @example
   * 123
   */
  deviceDid: string;
  // 操作失败code
  /**
   * @example
   * bad_param
   */
  code: string;
  // 操作失败信息
  /**
   * @example
   * 参数错误
   */
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
  /**
   * @example
   * 1122
   */
  deviceId: string;
  // 数据模型ID
  /**
   * @example
   * 7033986596836630528
   */
  deviceDataModelId?: string;
  // 设备端经过蚂蚁SDK或模组初始化得到的注册信息
  /**
   * @example
   * 73546f6b656e323031323131313332393235303230303033
   */
  deviceRegContent: string;
  // 蚂蚁侧SDK或模组对device_reg_content的签名
  /**
   * @example
   * a573546f6b656e323031323131313332393235303230303033
   */
  deviceRegSignature: string;
  // sdk版本号，由蚂蚁侧提供
  /**
   * @example
   * ma1-t1-0.1.1-00.04.54
   */
  sdkId: string;
  // 设备类型编码，联系蚂蚁侧获取设备类型编码
  // 
  /**
   * @example
   * 1001
   */
  deviceTypeCode: number;
  // 设备单价 单位：分
  // 
  /**
   * @example
   * 1000
   */
  initialPrice?: number;
  // 出厂时间
  // 
  /**
   * @example
   * 2018-10-10T10:10:00Z
   */
  factoryTime?: string;
  // 投放时间
  // 
  /**
   * @example
   * 2018-10-10T10:10:00Z
   */
  releaseTime?: string;
  // 额外信息，联系蚂蚁侧获取参数格式
  // 
  /**
   * @example
   * {...} 
   */
  extraInfo?: string;
  // 资产所有人标识（统一社会信用代码）
  // 
  /**
   * @example
   * 91310101MA1FPCXA3G
   */
  owner?: string;
  // 资产所有人名称
  /**
   * @example
   * 蚂蚁区块链科技（上海）有限公司 
   */
  ownerName?: string;
  // 设备名称/型号
  /**
   * @example
   * 64.0V30AH
   */
  deviceName?: string;
  // 设备IMEI
  /**
   * @example
   * 823456712312345
   */
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
  /**
   * @example
   * XR_LEASE
   */
  bizScene?: string;
  // 通行证名称
  /**
   * @example
   * 通行证名称
   */
  xrTicketPoolName?: string;
  // 资源id
  /**
   * @example
   * 1
   */
  resourceId?: string;
  // 有效期
  /**
   * @example
   * 2022-10-02
   */
  validTime?: string;
  // 体验时长
  /**
   * @example
   * 15(单位分钟)
   */
  testTime?: number;
  // 通行证状态：EXPIRED：已过期  VALID：有效  SALED：已出售
  /**
   * @example
   * 通行证状态
   */
  status?: string;
  // 判断已发放数量>0(USED：已使用)  判断已发放数量=0(NOT_USED：未使用)
  /**
   * @example
   * USED
   */
  useStatus?: string;
  // 资源名称
  /**
   * @example
   * 资源名称
   */
  resourceName?: string;
  // 设备集合
  /**
   * @example
   * json 或数组
   */
  xrApps?: string;
  // 券池最大票数
  /**
   * @example
   * 133
   */
  maxPoolCount?: number;
  // 租户id
  /**
   * @example
   * ADSAERDS
   */
  tenantId?: string;
  // 核销类型
  /**
   * @example
   * XR_DEVICE
   */
  xrVerificationType?: string;
  // 剩余可用券数量
  /**
   * @example
   * 100
   */
  surplusCount?: number;
  // 已发放数量 （总数-剩余数量）
  /**
   * @example
   * 12
   */
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

// kyt 凭证申请参数
export class KytApplyParams extends $tea.Model {
  // 设备类型
  /**
   * @example
   * tw_car
   */
  deviceType?: string;
  // 凭证类型
  /**
   * @example
   * mcu_dk_cred
   */
  credType?: string;
  // 品牌
  /**
   * @example
   * JL
   */
  brandId: string;
  // 凭证内容
  /**
   * @example
   * []
   */
  generateCode?: string;
  // 协议类型
  /**
   * @example
   * ble
   */
  protocolType: string;
  // 无感参数
  /**
   * @example
   * 1
   */
  keyLess: string;
  // mac
  /**
   * @example
   * F8:5F:56:F6:05:BC
   */
  mac: string;
  // ble_name
  /**
   * @example
   * ble_
   */
  bleName: string;
  // 通道
  /**
   * @example
   * DT
   */
  channel?: string;
  static names(): { [key: string]: string } {
    return {
      deviceType: 'device_type',
      credType: 'cred_type',
      brandId: 'brand_id',
      generateCode: 'generate_code',
      protocolType: 'protocol_type',
      keyLess: 'key_less',
      mac: 'mac',
      bleName: 'ble_name',
      channel: 'channel',
    };
  }

  static types(): { [key: string]: any } {
    return {
      deviceType: 'string',
      credType: 'string',
      brandId: 'string',
      generateCode: 'string',
      protocolType: 'string',
      keyLess: 'string',
      mac: 'string',
      bleName: 'string',
      channel: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 信物链证据基本组成结构体
export class EvidenceBaseModel extends $tea.Model {
  // 业务数据
  /**
   * @example
   * [{"content":"{业务数据}","label":"CRYPTO","timestamp":0}]
   */
  bizData?: string;
  // 证据哈希值
  /**
   * @example
   * "证据哈希值"
   */
  hash?: string;
  // 证据附属信息字段
  /**
   * @example
   * "证据附属信息"
   */
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

// 行程列表
export class TripView extends $tea.Model {
  // 开始时间
  /**
   * @example
   * 2018-10-10T10:10:00Z
   */
  tripBeginTime: string;
  // 结束时间
  /**
   * @example
   * 2018-10-10T10:10:00Z
   */
  tripEndTime: string;
  // 行驶公里数
  /**
   * @example
   * 22
   */
  tripTotalDistance: number;
  // 用时
  tripTime: number;
  static names(): { [key: string]: string } {
    return {
      tripBeginTime: 'trip_begin_time',
      tripEndTime: 'trip_end_time',
      tripTotalDistance: 'trip_total_distance',
      tripTime: 'trip_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      tripBeginTime: 'string',
      tripEndTime: 'string',
      tripTotalDistance: 'number',
      tripTime: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 行程统计详情
export class TripTraceView extends $tea.Model {
  // 开始时间
  /**
   * @example
   * 2018-10-10T10:10:00Z
   */
  beginTime: string;
  // 结束时间
  /**
   * @example
   * 2018-10-10T10:10:00Z
   */
  endTime: string;
  // 平均速度
  avgSpeed: number;
  // 最大速度
  maxSpeed: number;
  // 最后定位时间
  /**
   * @example
   * 2018-10-10T10:10:00Z
   */
  lastLocationTime: string;
  // 最后定位地址
  /**
   * @example
   * 河南省郑州市
   */
  lastLocation: string;
  static names(): { [key: string]: string } {
    return {
      beginTime: 'begin_time',
      endTime: 'end_time',
      avgSpeed: 'avg_speed',
      maxSpeed: 'max_speed',
      lastLocationTime: 'last_location_time',
      lastLocation: 'last_location',
    };
  }

  static types(): { [key: string]: any } {
    return {
      beginTime: 'string',
      endTime: 'string',
      avgSpeed: 'number',
      maxSpeed: 'number',
      lastLocationTime: 'string',
      lastLocation: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// tlsnotary文件认证成功后上传到oss的文件链接列表
export class TlsnotaryUploadOssLinks extends $tea.Model {
  // 证书链摘要文件的oss链接
  /**
   * @example
   * tlsnotary/{taskId}.json
   */
  certChainDigestLink: string;
  // 邮件eml文件的oss链接
  /**
   * @example
   * tlsnotary/{taskId}.eml
   */
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
  /**
   * @example
   * 1234567890
   */
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
  /**
   * @example
   * null
   */
  bizType?: string;
  // 待更新的实体did
  /**
   * @example
   * "did:iot:xxxxx"
   */
  thingDid: string;
  // 更新内容，参考更新请求不同实体类型结构体，对应不同实体类型不一样
  // 信物链实体附加信息 不同实体身份，有不同的json组织格式，
  // 参考 DeviceRegisterReqModel， SpaceRegisterReqModel， CorporateReqModel， WarehouseReqModel，
  /**
   * @example
   * 参考结构体
   */
  thingExtraParams?: string;
  // 更新后的实体版本
  /**
   * @example
   * "1.0.1"
   */
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
  /**
   * @example
   * 86F000001A51C02000000010
   */
  labelId: string;
  // 业务资产ID，接入方自行定义
  /**
   * @example
   * XXX
   */
  assetId?: string;
  // 标签最近一次上链的txHash
  /**
   * @example
   * 855e7ba37a0f227e384691e250f90bb2240adf11839016cf08506c9aa5c11cef
   */
  txHash: string;
  // 错误码
  /**
   * @example
   * XXXX
   */
  errorCode?: string;
  // 错误信息
  /**
   * @example
   * xxxxx
   */
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
  /**
   * @example
   * 125839
   */
  devid: string;
  // 设备名称
  /**
   * @example
   * 867186033894659
   */
  devName: string;
  // 设备sn
  /**
   * @example
   * 9726001010008SC30N96
   */
  sn: string;
  // Ccid
  /**
   * @example
   * 898602B1191870002179
   */
  ccid: string;
  // Msisdn
  /**
   * @example
   * 1064818313682
   */
  msisdn: string;
  // tbox固件版本号(16进制)
  /**
   * @example
   * 80000109
   */
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
  /**
   * @example
   * http://testImage.com/xxxxx
   */
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
  /**
   * @example
   * STRING 123ABC
   */
  deviceId: string;
  // 场景码
  /**
   * @example
   * 123ABC
   */
  scene: string;
  // 可信设备ID
  /**
   * @example
   * 7006071575276187649
   */
  trustiotDeviceId: number;
  // 设备注册时间
  /**
   * @example
   * 1686497064968
   */
  gmtCreate: number;
  // 设备是否在线
  /**
   * @example
   * true, false
   */
  online: boolean;
  // 设备型号
  /**
   * @example
   * 丰图T8
   */
  deviceModel?: string;
  // 终端型号
  /**
   * @example
   * 型号A
   */
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
  /**
   * @example
   * barcodeScanner
   */
  moduleName: string;
  // 最新版本号
  /**
   * @example
   * 1.1.1
   */
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
  /**
   * @example
   * 红色
   */
  colour?: string;
  // 色值
  /**
   * @example
   * #BA0F2F
   */
  colourNumber?: string;
  // 电脑型号
  /**
   * @example
   * X100
   */
  computerModel?: string;
  // 配置参数
  /**
   * @example
   * {""}
   */
  configParam?: string;
  // 显卡
  /**
   * @example
   * GTX3080
   */
  videoCard?: string;
  // 屏幕
  /**
   * @example
   * 27
   */
  screenSize?: string;
  // 电脑CPU
  /**
   * @example
   * i9
   */
  cpu: string;
  // 电脑内存
  /**
   * @example
   * 16GB
   */
  memory: string;
  // 电脑硬盘
  /**
   * @example
   * 500GB
   */
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
  /**
   * @example
   * null
   */
  deviceSignature?: string;
  // 暂时保留
  /**
   * @example
   * null
   */
  deviceUid?: string;
  // 不同上链方式
  // "CZ": 普通存证
  // "IOTPAY": 支付存证
  // "RAW": 文本上链
  // "TTTS": 溯源存证
  /**
   * @example
   * "CZ"
   */
  queryType: string;
  // 查询的链上交易txHash
  /**
   * @example
   * "516e981c8b62c6ef08dc99b5f5165ab2a8592b5a116298788f95bbd45d0cc499"
   */
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
  /**
   * @example
   * 奢侈品
   */
  category: string;
  // 品牌
  /**
   * @example
   * GUCCI
   */
  brand: string;
  // 款式
  /**
   * @example
   * Gucci Diana
   */
  style: string;
  // 商品鉴定点列表
  goodsPoints: BaiGoodsPoint[];
  // 用户自定义字符串，系统不做处理，会在响应体中带回
  /**
   * @example
   * state
   */
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
  /**
   * @example
   * A2
   */
  modelValue: string;
  // 规格列表 为空表示使用标准规格
  specsList?: string[];
  // 失败code
  /**
   * @example
   * code
   */
  errorCode: string;
  // 失败消息
  /**
   * @example
   * message
   */
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
  // 数据的链上哈希
  /**
   * @example
   * 2c952456827828cdedad06afccef75a9f2c2840cbb6b0b659f653da1e5916cb2
   */
  txHash: string;
  // 原入参的数组索引
  /**
   * @example
   * 0
   */
  originalIndex: number;
  // 失败数据对应的异常码，成功时该字段为空
  /**
   * @example
   * params.invalid
   */
  errorCode?: string;
  // 异常信息
  /**
   * @example
   * 可信设备与DEVICE-ID不匹配
   */
  errorMsg?: string;
  // 返回的扩展信息
  /**
   * @example
   * {"assetId":"Q02GYQGAY5","labelId":"86F000001A51A01000003836"}
   */
  extraInfo?: string;
  static names(): { [key: string]: string } {
    return {
      txHash: 'tx_hash',
      originalIndex: 'original_index',
      errorCode: 'error_code',
      errorMsg: 'error_msg',
      extraInfo: 'extra_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      txHash: 'string',
      originalIndex: 'number',
      errorCode: 'string',
      errorMsg: 'string',
      extraInfo: 'string',
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
  /**
   * @example
   * 1
   */
  pageIndex: number;
  // 页码
  /**
   * @example
   * 10
   */
  pageSize: number;
  // 总记录数
  // 
  /**
   * @example
   * 100
   */
  totalSize: number;
  // 总页数
  // 
  /**
   * @example
   * 10
   */
  totalPages: number;
  // 数据
  /**
   * @example
   * {...}
   */
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
  /**
   * @example
   * true
   */
  success: boolean;
  // 失败原因
  /**
   * @example
   * describe
   */
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
  /**
   * @example
   * 应用名称
   */
  apkName: string;
  // 应用版本号
  /**
   * @example
   * apkVersion
   */
  apkVersion: string;
  // 工单id
  /**
   * @example
   * orderId
   */
  orderId: string;
  // 工单名称
  /**
   * @example
   * orderName
   */
  orderName: string;
  // 任务id
  /**
   * @example
   * taskId
   */
  taskId: string;
  // 设备升级任务唯一id
  /**
   * @example
   * orderDetailId
   */
  orderDetailId: string;
  // 设备sn
  /**
   * @example
   * deviceSn
   */
  deviceSn: string;
  // 设备id
  /**
   * @example
   * deviceId
   */
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
  /**
   * @example
   * QUEUED
   */
  status: string;
  // 发布时间
  /**
   * @example
   * 2024-06-06 11:11:11
   */
  releaseTime?: string;
  // 升级完成时间
  /**
   * @example
   * 2024-06-06 11:11:11
   */
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
  /**
   * @example
   * null
   */
  bizType?: string;
  // 可选的，项目关联的区块链类型，1/2/3代表存证/合约等类型
  /**
   * @example
   * 1
   */
  blockchainType?: number;
  // 可选的，项目关联的区块链uid
  /**
   * @example
   * 1111111
   */
  blockchainUid?: string;
  // 租户下唯一项目名称，用以标识项目聚合的存证等信息
  /**
   * @example
   * "唯一项目名称"
   */
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
  /**
   * @example
   * 12321321
   */
  specsId: number;
  // 硬件模块ID
  /**
   * @example
   * 12321321
   */
  hardwareModuleId: number;
  // 模块名称
  /**
   * @example
   * 反扫头
   */
  hardwareModuleName: string;
  // 模块编码
  /**
   * @example
   * REVERSE_SCANNING_HEAD
   */
  hardwareModuleValue: string;
  // 模块参数
  /**
   * @example
   * {"size":102}
   */
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

// 行程统计概览
export class TripStatisticsView extends $tea.Model {
  // 过去七天内所有行驶记录的总里程	，单位km
  /**
   * @example
   * 20km
   */
  totalDistance: string;
  // 行驶总用时
  /**
   * @example
   * 3
   */
  totalDuration: string;
  // 骑行次数
  /**
   * @example
   * 2
   */
  tripCount: string;
  // 最近一次行驶的里程
  /**
   * @example
   * 2
   */
  lastTripDistance: string;
  // 最近一次行驶的平均速度	，单位  km/h
  /**
   * @example
   * 45
   */
  lastTripAvgSpeed: string;
  // 最近一次行驶的最大速度	
  /**
   * @example
   * 50
   */
  lastTripMaxSpeed: string;
  // 最后一次行驶用时
  /**
   * @example
   * 8
   */
  lastTripSpendTime: string;
  static names(): { [key: string]: string } {
    return {
      totalDistance: 'total_distance',
      totalDuration: 'total_duration',
      tripCount: 'trip_count',
      lastTripDistance: 'last_trip_distance',
      lastTripAvgSpeed: 'last_trip_avg_speed',
      lastTripMaxSpeed: 'last_trip_max_speed',
      lastTripSpendTime: 'last_trip_spend_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      totalDistance: 'string',
      totalDuration: 'string',
      tripCount: 'string',
      lastTripDistance: 'string',
      lastTripAvgSpeed: 'string',
      lastTripMaxSpeed: 'string',
      lastTripSpendTime: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 订单同步失败结果
export class DeviceOrderFail extends $tea.Model {
  // 订单id
  /**
   * @example
   * 90
   */
  orderId: string;
  // 设备did
  /**
   * @example
   * asdfg
   */
  deviceDid: string;
  // 返回code
  /**
   * @example
   * Fail
   */
  code: string;
  // 失败
  /**
   * @example
   * 返回信息
   */
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
  /**
   * @example
   * REAL
   */
  identificationResult: string;
  // 辅助识别结果码
  /**
   * @example
   * 200
   */
  identificationCode?: string;
  // 辅助识别信息
  /**
   * @example
   * 识别成功
   */
  identificationMessage?: string;
  // 无法识别时提示的解决方案
  /**
   * @example
   * 调整焦距
   */
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
  /**
   * @example
   * XXXXX
   */
  chainDeviceId: string;
  // 1.设备端上报数据内容  
  // 2.与设备上报的数据一致，服务端不可修改
  // 3.解析后需与DataModel匹配 
  // 4.映射 Label 对象结构化存储
  // 5.转为JSON后如果是JSONObject 映射单个 Label
  // 6.转为JSON后如果是JSONArray 映射多个 Label
  /**
   * @example
   * XXXXX
   */
  content: string;
  // content的签名
  // 与设备上报的签名保持一致，服务端不可修改
  /**
   * @example
   * XXXXX
   */
  signature: string;
  // 未经设备签名的附加数据JSON String
  // 注意：如果 content 批量解析 ，extraData也会批量复制融入解析后的content
  /**
   * @example
   * XXXXX
   */
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

//  Session 视图对象
export class AgentSessionVO extends $tea.Model {
  // 会话ID
  /**
   * @example
   * 7468486322254688256
   */
  sessionId: string;
  // 用户ID
  /**
   * @example
   * 7468486322254688256
   */
  userId: string;
  // 会话创建时间
  /**
   * @example
   * 2026-06-24 21:32:59
   */
  gmtCreate: string;
  // 会话修改时间
  /**
   * @example
   * 2026-06-24 21:32:59
   */
  gmtModified: string;
  static names(): { [key: string]: string } {
    return {
      sessionId: 'session_id',
      userId: 'user_id',
      gmtCreate: 'gmt_create',
      gmtModified: 'gmt_modified',
    };
  }

  static types(): { [key: string]: any } {
    return {
      sessionId: 'string',
      userId: 'string',
      gmtCreate: 'string',
      gmtModified: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 数据上链成功结果数据
export class DeviceCollectResult extends $tea.Model {
  // 上链数据采集ID
  /**
   * @example
   * j8o12u38
   */
  collectId: string;
  // 上链id
  /**
   * @example
   * auit98
   */
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
  /**
   * @example
   * 7006413673662394390
   */
  trustiotDeviceId: number;
  // 设备ID	
  /**
   * @example
   * 1122
   */
  deviceId: string;
  // 设备注册的上链哈希
  /**
   * @example
   * ba9de337190b017ea6255bffa226ea5ed91cbb03babb42e5a35d652ca30cdce1
   */
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
  /**
   * @example
   * 1
   */
  pageIndex: number;
  // 页码
  // 
  /**
   * @example
   * 10
   */
  pageSize: number;
  // 总记录数
  // 
  /**
   * @example
   * 100
   */
  totalSize: number;
  // 总页数
  // 
  /**
   * @example
   * 10
   */
  totalPages: number;
  // 数据
  /**
   * @example
   * {...}
   */
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
  /**
   * @example
   * 10000
   */
  code: string;
  // 网关返回码描述
  /**
   * @example
   * Business Failed
   */
  msg: string;
  // 务返回码
  /**
   * @example
   * ACQ.TRADE_HAS_SUCCESS
   */
  subCode: string;
  // 业务返回码描述
  /**
   * @example
   * 交易已被支付
   */
  subMsg: string;
  // 结果返回内容
  /**
   * @example
   * {__}
   */
  data?: string;
  // 响应签名
  /**
   * @example
   * DZXh8eeTuAHoYE3w1J+POiPhfDxOYBfUNn1lkeT/V7P4zJdyojWEa6IZs6Hz0yDW5Cp/viufUb5I0/V5WENS3OYR8zRedqo6D+fUTdLHdc+EFyCkiQhBxIzgngPdPdfp1PIS7BdhhzrsZHbRqb7o4k3Dxc+AAnFauu4V6Zdwczo=
   */
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
  /**
   * @example
   * 2088123412341234
   */
  subMerchantId: string;
  // 子商户的商户名称
  /**
   * @example
   * 滴滴出行
   */
  subMerchantName: string;
  // 子商户的服务名称
  /**
   * @example
   * 滴滴出行免密支付
   */
  subMerchantServiceName: string;
  // 子商户的服务描述
  /**
   * @example
   * 免密付车费，单次最高500
   */
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
  /**
   * @example
   * XR_LEASE
   */
  bizScene: string;
  // 资产类型
  /**
   * @example
   * LOCK_RECORD
   */
  dataScene: string;
  // 资产id
  /**
   * @example
   * 资产id
   */
  assetId: string;
  // 资产数据内容json
  /**
   * @example
   * {}
   */
  assetData: string;
  // 租户id
  /**
   * @example
   * SDFJAG
   */
  tenantId: string;
  // 上链时间
  /**
   * @example
   * 2022-10-02 09:10:09
   */
  txTime: string;
  // 业务ID
  /**
   * @example
   * 业务ID
   */
  businessId: string;
  // 上链id
  /**
   * @example
   * 123
   */
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
  /**
   * @example
   * 10000
   */
  area?: number;
  // 自定义业务类型，例如选择：危险品/非危险品/食品
  /**
   * @example
   * "biz_type"
   */
  bizType?: string;
  // 海拔 米单位*1e2
  /**
   * @example
   * 0
   */
  elevation?: number;
  // 高度 米单位*1e2	
  /**
   * @example
   * 123
   */
  height?: number;
  // 纬度 度数单位*1e9	
  /**
   * @example
   * 0
   */
  latitude?: number;
  // 经度 度数单位*1e9	
  /**
   * @example
   * 35000000000
   */
  longitude?: number;
  // 自定义其他字段
  /**
   * @example
   * "自定义"
   */
  otherInfo?: string;
  // 父类型，在业务中自定义关联，例如仓位的父节点是仓库
  /**
   * @example
   * “did:iot:xxxx”
   */
  parentDid?: string;
  // 可填入符合w3c did定义的服务节点
  /**
   * @example
   * "xxxx"
   */
  serviceEndpoint?: string;
  // 空间状态，自定义	
  /**
   * @example
   * "IN_USE"
   */
  status?: string;
  // 空间类型，例如冷藏/冷冻/通道/平面/立体	
  /**
   * @example
   * “平面“
   */
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
  /**
   * @example
   * 2088**
   */
  userId: string;
  // 用户通行证编码
  /**
   * @example
   * 2739875205
   */
  xrTicketCode: string;
  // xr通行证资源池名称
  /**
   * @example
   * 资源池001
   */
  xrTicketPoolName: string;
  // 资源名称
  /**
   * @example
   * 资源001
   */
  resourceName: string;
  // 用户通行证状态
  /**
   * @example
   * VALID
   */
  status: string;
  // 有效期
  /**
   * @example
   * 2023-04-06
   */
  validTime: string;
  // 所属业务
  /**
   * @example
   * XR_LEASE
   */
  bizScene: string;
  // 租户id
  /**
   * @example
   * QWERTYUI
   */
  tenantId: string;
  // 核销类型
  /**
   * @example
   * XR_DEVICE
   */
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
  /**
   * @example
   * XXXXX
   */
  content?: string;
  // 链上哈希
  /**
   * @example
   * XXXXX
   */
  txHash: string;
  // 上链时间
  /**
   * @example
   * XXXXX
   */
  txTime?: string;
  // 上链失败的错误码
  /**
   * @example
   * XXXXX
   */
  errorCode?: string;
  // 上链失败的错误信息
  /**
   * @example
   * XXXXX
   */
  errorMsg?: string;
  // 是否上链成功
  /**
   * @example
   * true, false
   */
  isSuccess?: boolean;
  // 标签对应资产版本号
  /**
   * @example
   * 1
   */
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
  /**
   * @example
   * 123
   */
  peripheralId: string;
  // 数据模型id
  // 
  /**
   * @example
   * 123456
   */
  peripheralDataModelId: string;
  // 场景码
  // 
  /**
   * @example
   * scene1
   */
  scene: string;
  // 外围设备名称
  // 
  /**
   * @example
   * 锂电池1 
   */
  peripheralName?: string;
  // 厂商名称
  // 
  /**
   * @example
   * 宁德时代1
   */
  corpName?: string;
  // 链上外围设备Id
  // 
  /**
   * @example
   * 123123
   */
  chainPeripheralId: string;
  // 链上哈希
  /**
   * @example
   * txhash123
   */
  txHash: string;
  // 上链时间
  /**
   * @example
   * 1605076751000
   */
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
  /**
   * @example
   * 3000
   */
  deviceTypeCode: number;
  // 单价，单位分
  /**
   * @example
   * 1000
   */
  initialPrice: number;
  // 出厂时间
  /**
   * @example
   * 2018-10-10T10:10:00Z
   */
  factoryTime: string;
  // 投放时间
  /**
   * @example
   * 2018-10-10T10:10:00Z
   */
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
  /**
   * @example
   * 208395
   */
  orderId: string;
  // 时间戳，取订单上链timestamp字段
  /**
   * @example
   * 1665490037182
   */
  orderCollectTime: string;
  // 订单总金额
  /**
   * @example
   * 12000.37
   */
  totalAmount: string;
  // 租户id
  /**
   * @example
   * 1
   */
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
  /**
   * @example
   * TEST-MODEL-0001
   */
  productModel?: string;
  // 产品形式，取值范围： SOFTWARE_HARDWARE：软硬一体（SE方案）, SOFTWARE：纯软（非SE方案）
  /**
   * @example
   * SOFTWARE_HARDWARE
   */
  productForm?: string;
  // 凭证种类列表，取值范围： ["PAYMENT"]：支付码， ["PAYMENT","TRANSIT"]：支付码+乘车码
  /**
   * @example
   * ["PAYMENT"]
   */
  features?: string[];
  // 授权数量(指当前证书凭证种类下未消耗的证书数量)
  /**
   * @example
   * 10
   */
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
  /**
   * @example
   * amdfgs
   */
  antchainId: string;
  // 订单id
  /**
   * @example
   * 34
   */
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
  /**
   * @example
   * 设备状态数据
   */
  name: string;
  // 物模型功能Id
  /**
   * @example
   * 7067312861108285440
   */
  featureId: string;
  // 业务标识
  /**
   * @example
   * LOCATION
   */
  bizType: string;
  // 事件属性列表
  /**
   * @example
   * [...]
   */
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
  /**
   * @example
   * did:private:12dsadadadf
   */
  deviceDid: string;
  // 设备密钥
  /**
   * @example
   * 12321321
   */
  privateKey: string;
  // 设备名称
  /**
   * @example
   * test
   */
  deviceName: string;
  // 设备sn
  /**
   * @example
   * 12321321
   */
  deviceSn: string;
  // 设备认证密钥密文，需要下发安全认证SDK完成设备激活
  /**
   * @example
   * 123
   */
  secKey?: string;
  // 设备认证密钥状态
  /**
   * @example
   * servicing
   */
  serviceStatus?: string;
  static names(): { [key: string]: string } {
    return {
      deviceDid: 'device_did',
      privateKey: 'private_key',
      deviceName: 'device_name',
      deviceSn: 'device_sn',
      secKey: 'sec_key',
      serviceStatus: 'service_status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      deviceDid: 'string',
      privateKey: 'string',
      deviceName: 'string',
      deviceSn: 'string',
      secKey: 'string',
      serviceStatus: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// iotbasic设备模型属性
export class IotbasicDeviceModelAttributeInfo extends $tea.Model {
  // 型号
  /**
   * @example
   * A2
   */
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
  /**
   * @example
   * "did:mychain:6c9f6cde4f63103d25ab1d9893242547a8518d8f51bff1a9da44e4f8537a9816"
   */
  ownerTenantDid?: string;
  // 信物链实体的使用方的分布式身份列表
  /**
   * @example
   * ["did:mychain:xxxx1","did:mychain:xxxx2"]
   */
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
  /**
   * @example
   * "DID_TYPE_DEVICE_ALIYUN"
   */
  thingType: string;
  // 原始id，租户内同一类型实体唯一
  /**
   * @example
   * "aaaa123"
   */
  thingOriginId: string;
  // 实体原始名称
  /**
   * @example
   * "摄像头a11"
   */
  thingOriginName: string;
  // 实体版本
  /**
   * @example
   * "1.0.0"
   */
  thingVersion: string;
  // 业务编码
  /**
   * @example
   * null
   */
  bizType?: string;
  // 信物链实体附加信息
  // 不同实体身份，有不同的json组织格式，参考另外技术文档
  /**
   * @example
   * "附加信息"
   */
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
  /**
   * @example
   * 1
   */
  pageIndex: number;
  // 页码
  // 
  /**
   * @example
   * 10
   */
  pageSize: number;
  // 总记录数
  // 
  /**
   * @example
   * 100
   */
  totalSize: number;
  // 总页数
  // 
  /**
   * @example
   * 10
   */
  totalPages: number;
  // 数据
  /**
   * @example
   * {...}
   */
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
  /**
   * @example
   * 1
   */
  pageIndex: number;
  // 页码
  // 
  /**
   * @example
   * 10
   */
  pageSize: number;
  // 总记录数
  // 
  /**
   * @example
   * 100
   */
  totalSize: number;
  // 总页数
  // 
  /**
   * @example
   * 10
   */
  totalPages: number;
  // 数据
  /**
   * @example
   * {...}
   */
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
  /**
   * @example
   * 2018-10-10T10:10:00Z
   */
  gmtModified?: string;
  // 产线场景码	
  // 
  /**
   * @example
   * MAYI-0001 
   */
  scene: string;
  // 压测的目标设备可信信根设备的唯一标识，JSONArray字符串	
  // 
  /**
   * @example
   * [ {"componentId": "864964060327592"} {"componentId": "864964060327592"} ]
   */
  componentIdList: string;
  // 客户侧的压测报告	
  // 
  /**
   * @example
   * [ { "name":"流量消耗", "consumption":"100KB", "asExpected":true }, { "name":"功耗", "consumption":"25mA", "asExpected":true }, { "name":"OTA升级" "asExpected":true } ] } 
   */
  customerPtReport?: string;
  // 压测开始时间	
  // 
  /**
   * @example
   * 2018-10-10T10:10:00Z
   */
  ptStartTime: string;
  // 压测结束时间	
  // 
  /**
   * @example
   * 2018-10-10T10:10:00Z
   */
  ptEndTime: string;
  // RUNNING: 正在执行 SUCCESS : 测试通过 FAILED : 测试不通过	
  // 
  /**
   * @example
   * RUNNING
   */
  ptStatus: string;
  // 关联SIT环境的工单ID	
  // 
  /**
   * @example
   * 1122
   */
  workOrderId?: string;
  // 关联SIT环境的项目ID	
  // 
  /**
   * @example
   * 11223344
   */
  projectId: string;
  // 产线压测任务ID
  /**
   * @example
   * 11223344566
   */
  ptTaskId: string;
  // 压测不通过的原因
  /**
   * @example
   * 数据验签失败
   */
  failureReason: string;
  // 拓展信息
  /**
   * @example
   * {...}
   */
  extraInfo?: string;
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
      extraInfo: 'extra_info',
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
      extraInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 客户对应设备
export class CustomerDeviceItem extends $tea.Model {
  // id
  /**
   * @example
   * 1
   */
  id: number;
  // 租户id
  /**
   * @example
   * tenant_id
   */
  tenantId: string;
  // 账号id
  /**
   * @example
   * 账号id
   */
  accountId: string;
  //  设备品类-型号-规格  
  /**
   * @example
   *  设备品类-型号-规格  
   */
  deviceType: string;
  // 设备sn
  /**
   * @example
   * SN
   */
  deviceSn: string;
  // 设备did
  /**
   * @example
   * dasdf
   */
  deviceDid: string;
  // 服务有效期
  /**
   * @example
   * 服务有效期
   */
  valideTime: string;
  // 设备状态
  /**
   * @example
   * INIT
   */
  deviceStatus: string;
  // 服务状态
  /**
   * @example
   * INIT
   */
  serviceStatus: string;
  // 屏幕状态 开屏、锁屏
  /**
   * @example
   * 屏幕状态
   */
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
  /**
   * @example
   * 312
   */
  deltaMileage: number;
  // 最大车速
  /**
   * @example
   * 60
   */
  maxSpeed: number;
  // 平均车速
  /**
   * @example
   * 60
   */
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
  /**
   * @example
   * 0
   */
  authLevel?: number;
  // 证书公钥，特定实体可查询
  /**
   * @example
   * ""
   */
  certPublicKey?: string;
  // 证书文本，特定实体可以查询
  /**
   * @example
   * “”
   */
  certText?: string;
  // DID扩展，设备/企业组织/仓库/空间的解析同ThingExtraParams
  /**
   * @example
   * ""
   */
  didExtension?: string;
  // did公钥，特定w3c did实体可查询
  /**
   * @example
   * ""
   */
  didPublicKey?: string;
  // DID用户名，w3c did实体可查询
  /**
   * @example
   * ""
   */
  didUsername?: string;
  // 所有者DID
  /**
   * @example
   * "did:iot:xxxxx"
   */
  ownerDid?: string;
  // 实体附属空间列表，例如仓库下属库位，设备关联库位等
  /**
   * @example
   * ["",""]
   */
  spacesAttached?: string[];
  // 实体附属实体列表，例如空间关联设备列表
  /**
   * @example
   * ["",""]
   */
  thingsAttached?: string[];
  // 实体属性，在阿里云iot设备，对应三元组
  /**
   * @example
   * ",,"
   */
  thingAttribute?: string;
  // 原始ID
  /**
   * @example
   * "原始ID"
   */
  thingId?: string;
  // 实体物模型id
  /**
   * @example
   * ""
   */
  thingModelId?: string;
  // 服务端点，可实现w3c service endpoint
  /**
   * @example
   * ""
   */
  thingServiceEndpoint?: string;
  // 设备状态需要是通过 updateStatus api更新，
  // 其他状态通过updateThingsDid api更新
  /**
   * @example
   * 实体状态
   */
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
  /**
   * @example
   * 0
   */
  thingType?: number;
  // 实体版本
  /**
   * @example
   * "1.0.0"
   */
  thingVersion?: string;
  // 使用者DID列表
  /**
   * @example
   * ["did:iot:xxxxx","did:iot:yyyyy"]
   */
  userDidList?: string[];
  // 查询的did
  /**
   * @example
   * "did:iot:xxxx"
   */
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

// 要素信息
export class AssetElementInfo extends $tea.Model {
  // 项目ID
  /**
   * @example
   * 112233
   */
  projectId: string;
  // 要素ID
  /**
   * @example
   * 112233
   */
  elementId: string;
  // 要素名称
  /**
   * @example
   * 注册要素
   */
  elementName?: string;
  // 要素类型
  /**
   * @example
   * 资产要素
   */
  elementType: string;
  // 数据来源渠道， 物理要素非必填；数据要素必填；
  /**
   * @example
   * MAAS
   */
  fromType?: string;
  // 平台领域类型， 物理要素非必填；数据要素必填；
  /**
   * @example
   * COLLECT_BIZ_DATA
   */
  dataElementType?: string;
  // 属性列表， 物理要素非必填；数据要素必填；
  /**
   * @example
   * [{...},{...}]
   */
  propertyList?: string;
  // 数据上报频率
  /**
   * @example
   * {...}
   */
  frequency?: string;
  // 物理要素类型码，包含iot和资管的
  /**
   * @example
   * {"iot":[23001], "tap":[1201]}
   */
  physicsElementTypeCode: string;
  // 业务类型
  /**
   * @example
   * ORDER
   */
  bizType?: string;
  // 该要素的存储位置， index代表数据流转顺序，location为库表/logstore名称，remark备注
  /**
   * @example
   * {...}
   */
  persistentLocation?: string;
  // 要素实例信息，用于捞取最小闭环数据
  /**
   * @example
   * {"scene": "XXX", "entityId": ["XXX"], "featureId": "XXX", "startTime": "XXX", "endTime": "XXX"}
   */
  elementInstanceConfig?: string;
  // 要素实例
  /**
   * @example
   * {...}
   */
  elementInstanceInfo?: string;
  // 属性列表来源平台 1.IOT 2.DM
  /**
   * @example
   * 1
   */
  propertySourceType?: number;
  // 拉取数据字段code请求值
  /**
   * @example
   * xxx
   */
  propertySourceId?: string;
  // 要素主键字段信息
  /**
   * @example
   * identifier
   */
  primaryKeyInfo?: string;
  // 备注
  /**
   * @example
   * xxx
   */
  remark?: string;
  static names(): { [key: string]: string } {
    return {
      projectId: 'project_id',
      elementId: 'element_id',
      elementName: 'element_name',
      elementType: 'element_type',
      fromType: 'from_type',
      dataElementType: 'data_element_type',
      propertyList: 'property_list',
      frequency: 'frequency',
      physicsElementTypeCode: 'physics_element_type_code',
      bizType: 'biz_type',
      persistentLocation: 'persistent_location',
      elementInstanceConfig: 'element_instance_config',
      elementInstanceInfo: 'element_instance_info',
      propertySourceType: 'property_source_type',
      propertySourceId: 'property_source_id',
      primaryKeyInfo: 'primary_key_info',
      remark: 'remark',
    };
  }

  static types(): { [key: string]: any } {
    return {
      projectId: 'string',
      elementId: 'string',
      elementName: 'string',
      elementType: 'string',
      fromType: 'string',
      dataElementType: 'string',
      propertyList: 'string',
      frequency: 'string',
      physicsElementTypeCode: 'string',
      bizType: 'string',
      persistentLocation: 'string',
      elementInstanceConfig: 'string',
      elementInstanceInfo: 'string',
      propertySourceType: 'number',
      propertySourceId: 'string',
      primaryKeyInfo: 'string',
      remark: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 用户通行证创建详情
export class XrUserTicketInfo extends $tea.Model {
  // xr通行证资源池名称
  /**
   * @example
   * 资源池001
   */
  xrTicketPoolName: string;
  // 购买数量
  /**
   * @example
   * 10
   */
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
  /**
   * @example
   * XRE2DAS
   */
  tenantId: string;
  // 金融云用户id
  /**
   * @example
   * 12321321
   */
  cloudUserId?: string;
  // 登录名
  /**
   * @example
   * test@alibaba-inc.com
   */
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
  /**
   * @example
   * txhash123
   */
  chainDeviceId?: string;
  // 可信设备ID（与scene参数、设备链上ID至少有一个参数不为空）
  /**
   * @example
   * 7006071575519457281
   */
  trustiotDeviceId?: number;
  // 业务Id
  // 
  // 
  /**
   * @example
   * 123123
   */
  bizId: string;
  // 业务类型
  // 
  // 
  /**
   * @example
   * 123123
   */
  bizType: string;
  // 数据内容 JSON字符串
  // 
  // 
  /**
   * @example
   * {"":"",""}
   */
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

// 行程详情
export class TripTrace extends $tea.Model {
  // 定位数据
  /**
   * @example
   * 113.784416,22.747500
   */
  deviceLocation: string;
  static names(): { [key: string]: string } {
    return {
      deviceLocation: 'device_location',
    };
  }

  static types(): { [key: string]: any } {
    return {
      deviceLocation: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 查询设备交易结果对象数据
export class QueryDeviceTransactionResultData extends $tea.Model {
  // 设备所属厂商
  /**
   * @example
   * corp
   */
  corpName: string;
  // 场景码,所属项目
  /**
   * @example
   * SMART_CAR_KEY
   */
  scene: string;
  // IMEI
  /**
   * @example
   * IMEI
   */
  deviceImei?: string;
  // 设备sn
  /**
   * @example
   * 设备sn123
   */
  deviceSn: string;
  // 设备金额
  /**
   * @example
   * 1.05
   */
  price?: string;
  // 设备分布式身份did
  /**
   * @example
   * did1223
   */
  deviceDid: string;
  // 设备终端唯一ID
  /**
   * @example
   * tuid123
   */
  deviceTuid?: string;
  // 设备参数:品类+型号+规格
  /**
   * @example
   * 123
   */
  deviceSpecs: string;
  // 所属租户
  /**
   * @example
   * QWERTYUU
   */
  tenantId: string;
  // 所属账号
  /**
   * @example
   * 123
   */
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
  /**
   * @example
   * xxxxx
   */
  address?: string;
  // 运营地址
  /**
   * @example
   * ""
   */
  businessAddress?: string;
  // 经营类目
  /**
   * @example
   * ""
   */
  businessScope?: string;
  // 注册时间，字符串类型
  /**
   * @example
   * "注册时间"
   */
  certifyDate?: string;
  // 营业执照有效期，字符串
  /**
   * @example
   * ""
   */
  licenceExpireDate?: string;
  // 国家
  /**
   * @example
   * CN
   */
  nation?: string;
  // 组织类型
  /**
   * @example
   * LimitedCompany
   */
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
  /**
   * @example
   * 12207
   */
  userId: string;
  // 用户角色
  /**
   * @example
   * 渠道商/平台
   */
  userRole: string;
  // 用户登录id来源
  /**
   * @example
   * 用户登录id来源
   */
  channel: string;
  // 作为平台使用方，提供对应的渠道用户id列表
  /**
   * @example
   * ["1001","1002"]
   */
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
  /**
   * @example
   * XXXXX
   */
  content: string;
  // 数据模型ID 
  /**
   * @example
   * 001202103171566166669
   */
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
  /**
   * @example
   * 125839
   */
  devid: string;
  // 设备sn
  /**
   * @example
   * 9726001010008SC30N96
   */
  sn: string;
  // ccid
  /**
   * @example
   * 898602B1191870002179
   */
  ccid: string;
  // imei
  /**
   * @example
   * 866311069827503
   */
  imei: string;
  // tbox固件版本号(16进制)
  /**
   * @example
   * 80000109
   */
  ver: string;
  // PEPS系统固件版本号(16进制)
  /**
   * @example
   * 81070205
   */
  pepsVer: string;
  // 蓝牙固件版本号(16进制)
  /**
   * @example
   * 80090204
   */
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
  /**
   * @example
   * 4533
   */
  chainDeviceId?: string;
  // 设备id
  /**
   * @example
   * 1122
   */
  deviceId: string;
  // 发行设备Id
  /**
   * @example
   * 4455
   */
  distributeDeviceId: string;
  // 场景码
  /**
   * @example
   * SCENE
   */
  scene: string;
  // 设备类型 DEVICE : 设备 、PERIPHERAL : 外围设备
  /**
   * @example
   * PERIPHERAL
   */
  deviceType: string;
  // 链上外围设备Id（deviceType=PERIPHERAL 时有值)
  /**
   * @example
   * 123123
   */
  chainPeripheralId?: string;
  // 设备状态，取值范围：NORMAL、OFFLINE、UNREGISTER
  /**
   * @example
   * NORMAL
   */
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

// 事件数据
export class EventData extends $tea.Model {
  // 数据内容
  /**
   * @example
   * { "DEVICE-ID": "ABC123", "IMEI": "868331011992179", "HEART-BEAT-TIME": 1699053387008 }
   */
  content: string;
  // 可信设备ID
  /**
   * @example
   * 7213004826408435712
   */
  trustIotDeviceId?: number;
  // 业务ID
  /**
   * @example
   * 20240815
   */
  bizId?: string;
  // 设备数据签名
  /**
   * @example
   * 8e084d95c5ac9198b01b9f6b8040b2daa35a3e2706a472295f52ec0966119383d7654eb2c1f67eb563194ab9d2197fcd8fcb5232308927e708257ebea8ce1cda
   */
  signature?: string;
  // 设备数据间接上报时，服务端补充数据
  /**
   * @example
   * {"PRICE":2.2,"NUMBER":3}
   */
  extraData?: string;
  static names(): { [key: string]: string } {
    return {
      content: 'content',
      trustIotDeviceId: 'trust_iot_device_id',
      bizId: 'biz_id',
      signature: 'signature',
      extraData: 'extra_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      content: 'string',
      trustIotDeviceId: 'number',
      bizId: 'string',
      signature: 'string',
      extraData: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 设备概览统计信息
export class DeviceOverViewResponse extends $tea.Model {
  // 设备品类名称
  /**
   * @example
   * test_category
   */
  deviceCategoryName: string;
  // 设备总数
  /**
   * @example
   * 2000
   */
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
  /**
   * @example
   * 红色
   */
  colour: string;
  // 色值
  /**
   * @example
   * #BA0F2F
   */
  colourNumber: string;
  // 内存大小
  /**
   * @example
   * 128GB
   */
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
  /**
   * @example
   * telpo
   */
  corpValue: string;
  // 厂商名称
  /**
   * @example
   * 天波
   */
  corpName: string;
  // 型号名称
  /**
   * @example
   * TPS1231
   */
  modelName: string;
  // 型号编码
  /**
   * @example
   * TPS123
   */
  modelValue: string;
  // 防疫机
  /**
   * @example
   * 设备品类名称
   */
  categoryName: string;
  // 设备品类编码
  /**
   * @example
   * antmic
   */
  categoryCode: string;
  // 规格ID
  /**
   * @example
   * 12321321
   */
  specsId: number;
  // 规格名称
  /**
   * @example
   * 规格名称
   */
  specsName: string;
  // 规格编码
  /**
   * @example
   * 规格编码
   */
  specsValue: string;
  // 规格参数
  /**
   * @example
   * 规格参数
   */
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
  /**
   * @example
   * 奢侈品
   */
  category: string;
  // 品牌
  /**
   * @example
   * GUCCI
   */
  brand: string;
  // 款式
  /**
   * @example
   * Gucci Diana
   */
  style: string;
  // 商品数字指纹鉴定点列表
  /**
   * @example
   * [{"sub_point_name":"正面","image_url":"http://xxxx1001"},{"sub_point_name":"背面","image_url":"http://xxxx1002"}]
   */
  goodsPoints: GoodsDigitalFingerprintPoint[];
  // 商品id
  /**
   * @example
   * goodsId
   */
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
  /**
   * @example
   * "did:iot_xxxxx"
   */
  thingDid: string;
  // 待更新访问者列表
  /**
   * @example
   * ["",""]
   */
  tenantList: string[];
  // 权限角色
  // TENANT_ROLE_OWNER
  // TENANT_ROLE_USER
  // TENANT_ROLE_OBSERVER
  /**
   * @example
   * TENANT_ROLE_OWNER
   */
  tenantRole: string;
  // 增加权限：THINGS_OP_MODE_ADD
  // 删除权限：THINGS_OP_MODE_REMOVE
  /**
   * @example
   * THINGS_OP_MODE_ADD
   */
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
  /**
   * @example
   * 20034932
   */
  orderId: string;
  // 支付状态
  /**
   * @example
   * PAID,UNPAID,PAYMENT_FAILED
   */
  orderStatus: string;
  // 商家唯一id
  /**
   * @example
   * 30099234
   */
  merchantId: string;
  // 设备订单元素集合
  orderDeviceList: IotBasicDeviceOrderItem[];
  // 订单总金额，精确到小数点后两位
  /**
   * @example
   * 22220.98
   */
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
  /**
   * @example
   * 56165431
   */
  assetId: string;
  // 数据资产类型
  /**
   * @example
   * LOCK
   */
  dataScene: string;
  // 资产数据内容，业务要上链的数据JSON格式
  /**
   * @example
   * {"a":xx,"b":xx}
   */
  assetData: string;
  // 上链数据采集id
  /**
   * @example
   * 289hj98u
   */
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
  /**
   * @example
   * 10
   */
  dataId: number;
  // 数据名称
  /**
   * @example
   * name
   */
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

export class QueryBlockchainBotIoaAgentRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 智能体ID
  agentId?: string;
  // 客户端ID，一般是设备MAC地址，若没有agentId时可传入client_id查询对应的agent_id
  clientId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      agentId: 'agent_id',
      clientId: 'client_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      agentId: 'string',
      clientId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBlockchainBotIoaAgentResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 智能体信息视图对象
  agentInfo?: AgentInfoVO;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      agentInfo: 'agent_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      agentInfo: AgentInfoVO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SaveBlockchainBotIoaAgentRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 智能体ID
  agentId: string;
  // 智能体名称
  agentName?: string;
  // 语言Code
  langCode?: string;
  // 音色ID
  ttsVoiceId?: string;
  // 系统提示词
  systemPrompt?: string;
  // 父模板智能体ID
  parentTemplateAgentId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      agentId: 'agent_id',
      agentName: 'agent_name',
      langCode: 'lang_code',
      ttsVoiceId: 'tts_voice_id',
      systemPrompt: 'system_prompt',
      parentTemplateAgentId: 'parent_template_agent_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      agentId: 'string',
      agentName: 'string',
      langCode: 'string',
      ttsVoiceId: 'string',
      systemPrompt: 'string',
      parentTemplateAgentId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SaveBlockchainBotIoaAgentResponse extends $tea.Model {
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

export class QueryBlockchainBotIoaTemplatesRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 智能体ID
  agentId: string;
  // 客户端ID（如MAC地址）
  clientId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      agentId: 'agent_id',
      clientId: 'client_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      agentId: 'string',
      clientId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBlockchainBotIoaTemplatesResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 智能体模板 VO集合
  templateAgentList?: AgentInfoVO[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      templateAgentList: 'template_agent_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      templateAgentList: { 'type': 'array', 'itemType': AgentInfoVO },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBlockchainBotAgentchatHistoryRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 会话ID
  sessionId: string;
  // 页码
  pageIndex: number;
  // 分页大小
  pageSize: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      sessionId: 'session_id',
      pageIndex: 'page_index',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      sessionId: 'string',
      pageIndex: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBlockchainBotAgentchatHistoryResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 分页结果总数
  total?: number;
  // 当前页码 （从第一页开始）
  pageNum?: number;
  // 每页大小
  pageSize?: number;
  // 总页数
  pages?: number;
  // 对话内容集合
  list?: AiAgentChatHistoryBO[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      total: 'total',
      pageNum: 'page_num',
      pageSize: 'page_size',
      pages: 'pages',
      list: 'list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      total: 'number',
      pageNum: 'number',
      pageSize: 'number',
      pages: 'number',
      list: { 'type': 'array', 'itemType': AiAgentChatHistoryBO },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBlockchainBotAgentSessionsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 客户端ID
  clientId: string;
  // 用户ID
  userId?: string;
  // 页码
  pageIndex: number;
  // 分页大小
  pageSize: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      clientId: 'client_id',
      userId: 'user_id',
      pageIndex: 'page_index',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      clientId: 'string',
      userId: 'string',
      pageIndex: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBlockchainBotAgentSessionsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 分页结果总数
  total?: number;
  // 当前页码 （从第一页开始）
  pageNum?: number;
  // 每页大小
  pageSize?: number;
  // 总页数
  pages?: number;
  // 会话集合
  list?: AgentSessionVO[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      total: 'total',
      pageNum: 'page_num',
      pageSize: 'page_size',
      pages: 'pages',
      list: 'list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      total: 'number',
      pageNum: 'number',
      pageSize: 'number',
      pages: 'number',
      list: { 'type': 'array', 'itemType': AgentSessionVO },
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
          sdk_version: "1.1.5",
          _prod_code: "IOTAGENT",
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
   * @remarks
   * Description: 获取智能体信息
   * Summary: 获取智能体信息
   */
  async queryBlockchainBotIoaAgent(request: QueryBlockchainBotIoaAgentRequest): Promise<QueryBlockchainBotIoaAgentResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryBlockchainBotIoaAgentEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 获取智能体信息
   * Summary: 获取智能体信息
   */
  async queryBlockchainBotIoaAgentEx(request: QueryBlockchainBotIoaAgentRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryBlockchainBotIoaAgentResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryBlockchainBotIoaAgentResponse>(await this.doRequest("1.0", "blockchain.bot.ioa.agent.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryBlockchainBotIoaAgentResponse({}));
  }

  /**
   * @remarks
   * Description: 更新智能体信息
   * Summary: 更新智能体信息
   */
  async saveBlockchainBotIoaAgent(request: SaveBlockchainBotIoaAgentRequest): Promise<SaveBlockchainBotIoaAgentResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.saveBlockchainBotIoaAgentEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 更新智能体信息
   * Summary: 更新智能体信息
   */
  async saveBlockchainBotIoaAgentEx(request: SaveBlockchainBotIoaAgentRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SaveBlockchainBotIoaAgentResponse> {
    Util.validateModel(request);
    return $tea.cast<SaveBlockchainBotIoaAgentResponse>(await this.doRequest("1.0", "blockchain.bot.ioa.agent.save", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SaveBlockchainBotIoaAgentResponse({}));
  }

  /**
   * @remarks
   * Description: 查询用户可选的模板列表详情
   * Summary: 查询用户可选的模板列表详情
   */
  async queryBlockchainBotIoaTemplates(request: QueryBlockchainBotIoaTemplatesRequest): Promise<QueryBlockchainBotIoaTemplatesResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryBlockchainBotIoaTemplatesEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 查询用户可选的模板列表详情
   * Summary: 查询用户可选的模板列表详情
   */
  async queryBlockchainBotIoaTemplatesEx(request: QueryBlockchainBotIoaTemplatesRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryBlockchainBotIoaTemplatesResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryBlockchainBotIoaTemplatesResponse>(await this.doRequest("1.0", "blockchain.bot.ioa.templates.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryBlockchainBotIoaTemplatesResponse({}));
  }

  /**
   * @remarks
   * Description: 查询聊天记录
   * Summary: 查询聊天记录
   */
  async queryBlockchainBotAgentchatHistory(request: QueryBlockchainBotAgentchatHistoryRequest): Promise<QueryBlockchainBotAgentchatHistoryResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryBlockchainBotAgentchatHistoryEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 查询聊天记录
   * Summary: 查询聊天记录
   */
  async queryBlockchainBotAgentchatHistoryEx(request: QueryBlockchainBotAgentchatHistoryRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryBlockchainBotAgentchatHistoryResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryBlockchainBotAgentchatHistoryResponse>(await this.doRequest("1.0", "blockchain.bot.agentchat.history.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryBlockchainBotAgentchatHistoryResponse({}));
  }

  /**
   * @remarks
   * Description: 查询 Session 列表
   * Summary: 查询 Session 列表
   */
  async queryBlockchainBotAgentSessions(request: QueryBlockchainBotAgentSessionsRequest): Promise<QueryBlockchainBotAgentSessionsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryBlockchainBotAgentSessionsEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 查询 Session 列表
   * Summary: 查询 Session 列表
   */
  async queryBlockchainBotAgentSessionsEx(request: QueryBlockchainBotAgentSessionsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryBlockchainBotAgentSessionsResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryBlockchainBotAgentSessionsResponse>(await this.doRequest("1.0", "blockchain.bot.agent.sessions.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryBlockchainBotAgentSessionsResponse({}));
  }

}
