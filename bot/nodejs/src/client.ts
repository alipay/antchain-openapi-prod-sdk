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

// 收集信息
export class CollectContent extends $tea.Model {
  // 链上设备Id
  chainDeviceId: string;
  // 收集的内容
  content: string;
  // 对内容的签名
  signature: string;
  // 服务端发送的扩展数据（非可信设备直接产生的数据）
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
  static names(): { [key: string]: string } {
    return {
      chainDeviceId: 'chain_device_id',
      deviceId: 'device_id',
      distributeDeviceId: 'distribute_device_id',
      scene: 'scene',
      deviceType: 'device_type',
      chainPeripheralId: 'chain_peripheral_id',
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

// 设备业务数据
export class BizContentGroup extends $tea.Model {
  // 设备链上Id
  // 
  // 
  chainDeviceId: string;
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
      bizId: 'biz_id',
      bizType: 'biz_type',
      content: 'content',
    };
  }

  static types(): { [key: string]: any } {
    return {
      chainDeviceId: 'string',
      bizId: 'string',
      bizType: 'string',
      content: 'string',
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

// 数据模型
export class DataModel extends $tea.Model {
  //  数据模型Id
  dataModelId: string;
  // 数据模型名称
  dataModelName?: string;
  // 数据模型
  dataModel: string;
  static names(): { [key: string]: string } {
    return {
      dataModelId: 'data_model_id',
      dataModelName: 'data_model_name',
      dataModel: 'data_model',
    };
  }

  static types(): { [key: string]: any } {
    return {
      dataModelId: 'string',
      dataModelName: 'string',
      dataModel: 'string',
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

// 设备类型
export class Device extends $tea.Model {
  // 设备实体唯一Id
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

export class CreateDeviceDatamodelRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 数据模型
  dataModel: string;
  // 数据模型名称
  dataModelName?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      dataModel: 'data_model',
      dataModelName: 'data_model_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      dataModel: 'string',
      dataModelName: 'string',
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
  deviceDataModelId: string;
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
  deviceTypeCode: number;
  // 设备单价 单位：分
  initialPrice: number;
  // 出厂时间
  factoryTime: string;
  // 投放时间
  releaseTime: string;
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
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      chainDeviceId: 'chain_device_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      chainDeviceId: 'string',
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
  deviceTypeCode?: number;
  // 设备单价 单位：分
  initialPrice?: number;
  // 出厂时间
  factoryTime?: string;
  // 投放时间
  releaseTime?: string;
  // 设备型号
  deviceName?: string;
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
  deviceDataModelId: string;
  // 设备Id
  deviceId: string;
  // 设备imei号
  deviceImei: string;
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
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      chainDeviceId: 'chain_device_id',
      distributeDeviceId: 'distribute_device_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      chainDeviceId: 'string',
      distributeDeviceId: 'string',
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
      nonce: 'string',
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
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      distributeDeviceId: 'distribute_device_id',
      chainPeripheralId: 'chain_peripheral_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      distributeDeviceId: 'string',
      chainPeripheralId: 'string',
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
  dataModelId: string;
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
  deviceTypeCode?: number;
  // 设备单价 单位：分
  initialPrice?: number;
  // 出厂时间
  factoryTime?: string;
  // 投放时间
  releaseTime?: string;
  // 设备型号
  deviceName: string;
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
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      chainDeviceid: 'chain_deviceid',
      distributeDeviceId: 'distribute_device_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      chainDeviceid: 'string',
      distributeDeviceId: 'string',
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
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      content: 'content',
      nonce: 'nonce',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      content: { 'type': 'array', 'itemType': CollectContent },
      nonce: 'string',
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
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      dataModelId: 'data_model_id',
      nonce: 'nonce',
      content: 'content',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      dataModelId: 'string',
      nonce: 'string',
      content: { 'type': 'array', 'itemType': BizContentGroup },
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
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      chainDeviceId: 'chain_device_id',
      distributeDeviceId: 'distribute_device_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      chainDeviceId: 'string',
      distributeDeviceId: 'string',
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
          sdk_version: "1.3.16",
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

}
