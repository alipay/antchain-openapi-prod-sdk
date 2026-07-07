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
  // 数据签名
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

// 事件数据领域参数
// 
export class EventSpecs extends $tea.Model {
  // 物模型事件ID
  /**
   * @example
   * 7084744398341955584
   */
  eventModelId: string;
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
  // 冗余字段，请忽略
  /**
   * @example
   * true, false
   */
  returnHash?: boolean;
  // 是否是补数据内容
  /**
   * @example
   * true, false
   */
  isRepaired?: boolean;
  static names(): { [key: string]: string } {
    return {
      eventModelId: 'event_model_id',
      bizType: 'biz_type',
      submitDate: 'submit_date',
      returnHash: 'return_hash',
      isRepaired: 'is_repaired',
    };
  }

  static types(): { [key: string]: any } {
    return {
      eventModelId: 'string',
      bizType: 'string',
      submitDate: 'string',
      returnHash: 'boolean',
      isRepaired: 'boolean',
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

// 通过设备ID注册发行时的设备参数
// 
export class RegByDeviceIdParm extends $tea.Model {
  // 一般是业务上唯一的设备ID/资产编码
  /**
   * @example
   * 1122
   */
  deviceId: string;
  // 物模型事件ID
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
  // true : 设备ID已存在时返回存在的设备关联字段; false : 设备ID已存在时直接抛出异常；
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

// 要素关系信息
// 
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
  // 
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
  // 
  /**
   * @example
   * 112233
   */
  projectId: string;
  // 来源要素名称
  // 
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

// 通过设备注册发行时的设备参数 （与RegByDeviceIdParam的区别在于设备端有无植入蚂蚁SDK或模组）
export class RegByDeviceParm extends $tea.Model {
  // 一般是业务上唯一的设备ID/资产编码
  /**
   * @example
   * 1122
   */
  deviceId: string;
  // 物模型事件ID
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
  /**
   * @example
   * 1001
   */
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
  // 	
  // 资产所有人名称
  /**
   * @example
   *  蚂蚁区块链科技（上海）有限公司
   */
  ownerName?: string;
  // 	
  // 设备名称/型号
  /**
   * @example
   *  64.0V30AH
   */
  deviceName?: string;
  // 	
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

// 设备信息
// 
export class Device extends $tea.Model {
  // 设备ID，一般是设备的出厂编码或业务上的资产ID
  /**
   * @example
   * 123ABC
   */
  deviceId: string;
  // 	
  // 物模型事件ID
  /**
   * @example
   * 112233
   */
  deviceDataModelId: string;
  // 场景码
  // 
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
  // 设备类型编码
  /**
   * @example
   * 5000
   */
  deviceTypeCode: string;
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
  // 设备链上Id
  // 
  /**
   * @example
   * 223344
   */
  chainDeviceId?: string;
  // 上链哈希
  // 
  /**
   * @example
   * 3344
   */
  txHash?: string;
  // 上链时间
  // 
  /**
   * @example
   * 224455
   */
  txTime?: number;
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
      deviceTypeCode: 'device_type_code',
      initialPrice: 'initial_price',
      releaseTime: 'release_time',
      factoryTime: 'factory_time',
      deviceStatus: 'device_status',
      trustiotDeviceId: 'trustiot_device_id',
      chainDeviceId: 'chain_device_id',
      txHash: 'tx_hash',
      txTime: 'tx_time',
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
      deviceTypeCode: 'string',
      initialPrice: 'number',
      releaseTime: 'string',
      factoryTime: 'string',
      deviceStatus: 'string',
      trustiotDeviceId: 'number',
      chainDeviceId: 'string',
      txHash: 'string',
      txTime: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 要素信息
// 
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
  // 	
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

// 收集数据返回的上链结果
export class SendCollectorResult extends $tea.Model {
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
  // 数据的链上哈希
  // 
  /**
   * @example
   * 2c952456827828cdedad06afccef75a9f2c2840cbb6b0b659f653da1e5916cb2
   */
  txHash?: string;
  static names(): { [key: string]: string } {
    return {
      originalIndex: 'original_index',
      errorCode: 'error_code',
      errorMsg: 'error_msg',
      extraInfo: 'extra_info',
      txHash: 'tx_hash',
    };
  }

  static types(): { [key: string]: any } {
    return {
      originalIndex: 'number',
      errorCode: 'string',
      errorMsg: 'string',
      extraInfo: 'string',
      txHash: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SyncAssetelementProjectRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 若要素项目已存在，是否进行全量覆盖
  coverExistProject: boolean;
  // 同步目标
  destination: string;
  // 项目ID
  projectId: string;
  // 项目名称
  // 
  projectName: string;
  // 根元素ID列表
  rootElements?: string;
  // 是否只读
  // 
  readOnly: boolean;
  // 备注
  remark?: string;
  // 附件列表
  attachmentList?: string;
  // 产品Owner
  pdOwner?: string;
  // 要素列表
  assetElementInfoList?: AssetElementInfo[];
  // 要素关系列表
  assetElementRelationInfoList?: AssetElementRelationInfo[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      coverExistProject: 'cover_exist_project',
      destination: 'destination',
      projectId: 'project_id',
      projectName: 'project_name',
      rootElements: 'root_elements',
      readOnly: 'read_only',
      remark: 'remark',
      attachmentList: 'attachment_list',
      pdOwner: 'pd_owner',
      assetElementInfoList: 'asset_element_info_list',
      assetElementRelationInfoList: 'asset_element_relation_info_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      coverExistProject: 'boolean',
      destination: 'string',
      projectId: 'string',
      projectName: 'string',
      rootElements: 'string',
      readOnly: 'boolean',
      remark: 'string',
      attachmentList: 'string',
      pdOwner: 'string',
      assetElementInfoList: { 'type': 'array', 'itemType': AssetElementInfo },
      assetElementRelationInfoList: { 'type': 'array', 'itemType': AssetElementRelationInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SyncAssetelementProjectResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 同步结果
  syncStatus?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      syncStatus: 'sync_status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      syncStatus: 'string',
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
  // 	
  // 设备详情
  deviceList?: Device[];
  // 设备信息不存在的deviceId集合
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

export class CreateDistributedeviceBydeviceidmulRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 	
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

export class SendEventDataRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 场景码
  scene: string;
  // 事件数据列表
  eventDataList: EventData[];
  // 事件数据领域参数
  // 
  eventSpecs: EventSpecs;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      scene: 'scene',
      eventDataList: 'event_data_list',
      eventSpecs: 'event_specs',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      scene: 'string',
      eventDataList: { 'type': 'array', 'itemType': EventData },
      eventSpecs: EventSpecs,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SendEventDataResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 上报数据返回的上链结果
  // 
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

export class ImportIotagentClientRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 设备标识列表
  uidList: string[];
  // 实例Id
  instanceId: string;
  // SKU名称
  skuName: string;
  // 模版智能体ID
  templateAgentId: string;
  // 智能体话题
  agentTopic: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      uidList: 'uid_list',
      instanceId: 'instance_id',
      skuName: 'sku_name',
      templateAgentId: 'template_agent_id',
      agentTopic: 'agent_topic',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      uidList: { 'type': 'array', 'itemType': 'string' },
      instanceId: 'string',
      skuName: 'string',
      templateAgentId: 'string',
      agentTopic: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ImportIotagentClientResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 成功加白的UID列表
  successUidList?: string[];
  // 已存在的UID列表
  existedUidList?: string[];
  // 无效的UID列表
  invalidUidList?: string[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      successUidList: 'success_uid_list',
      existedUidList: 'existed_uid_list',
      invalidUidList: 'invalid_uid_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      successUidList: { 'type': 'array', 'itemType': 'string' },
      existedUidList: { 'type': 'array', 'itemType': 'string' },
      invalidUidList: { 'type': 'array', 'itemType': 'string' },
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
          sdk_version: "1.0.2",
          _prod_code: "BOTSG",
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
   * Description: 要素项目同步
   * Summary: 要素项目同步
   */
  async syncAssetelementProject(request: SyncAssetelementProjectRequest): Promise<SyncAssetelementProjectResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.syncAssetelementProjectEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 要素项目同步
   * Summary: 要素项目同步
   */
  async syncAssetelementProjectEx(request: SyncAssetelementProjectRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SyncAssetelementProjectResponse> {
    Util.validateModel(request);
    return $tea.cast<SyncAssetelementProjectResponse>(await this.doRequest("1.0", "antdigital.botsg.assetelement.project.sync", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SyncAssetelementProjectResponse({}));
  }

  /**
   * @remarks
   * Description: 通过deviceId获取设备详情
   * Summary: 通过deviceId获取设备详情
   */
  async getDeviceBydeviceid(request: GetDeviceBydeviceidRequest): Promise<GetDeviceBydeviceidResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getDeviceBydeviceidEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 通过deviceId获取设备详情
   * Summary: 通过deviceId获取设备详情
   */
  async getDeviceBydeviceidEx(request: GetDeviceBydeviceidRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetDeviceBydeviceidResponse> {
    Util.validateModel(request);
    return $tea.cast<GetDeviceBydeviceidResponse>(await this.doRequest("1.0", "antdigital.botsg.device.bydeviceid.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetDeviceBydeviceidResponse({}));
  }

  /**
   * @remarks
   * Description: 通过设备ID异步批量发行设备
   * Summary: 通过设备ID异步批量发行设备
   */
  async createDistributedeviceBydeviceidmul(request: CreateDistributedeviceBydeviceidmulRequest): Promise<CreateDistributedeviceBydeviceidmulResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createDistributedeviceBydeviceidmulEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 通过设备ID异步批量发行设备
   * Summary: 通过设备ID异步批量发行设备
   */
  async createDistributedeviceBydeviceidmulEx(request: CreateDistributedeviceBydeviceidmulRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateDistributedeviceBydeviceidmulResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateDistributedeviceBydeviceidmulResponse>(await this.doRequest("1.0", "antdigital.botsg.distributedevice.bydeviceidmul.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateDistributedeviceBydeviceidmulResponse({}));
  }

  /**
   * @remarks
   * Description: 通过设备异步批量发行设备
   * Summary: 通过设备异步批量发行设备
   */
  async createDistributedeviceBydevicemul(request: CreateDistributedeviceBydevicemulRequest): Promise<CreateDistributedeviceBydevicemulResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createDistributedeviceBydevicemulEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 通过设备异步批量发行设备
   * Summary: 通过设备异步批量发行设备
   */
  async createDistributedeviceBydevicemulEx(request: CreateDistributedeviceBydevicemulRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateDistributedeviceBydevicemulResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateDistributedeviceBydevicemulResponse>(await this.doRequest("1.0", "antdigital.botsg.distributedevice.bydevicemul.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateDistributedeviceBydevicemulResponse({}));
  }

  /**
   * @remarks
   * Description: 事件数据上报整合接口
   * Summary: 事件数据上报整合接口
   */
  async sendEventData(request: SendEventDataRequest): Promise<SendEventDataResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.sendEventDataEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 事件数据上报整合接口
   * Summary: 事件数据上报整合接口
   */
  async sendEventDataEx(request: SendEventDataRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SendEventDataResponse> {
    Util.validateModel(request);
    return $tea.cast<SendEventDataResponse>(await this.doRequest("1.0", "antdigital.botsg.event.data.send", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SendEventDataResponse({}));
  }

  /**
   * @remarks
   * Description: 智能体设备标识导入接口
   * Summary: 智能体设备标识导入接口
   */
  async importIotagentClient(request: ImportIotagentClientRequest): Promise<ImportIotagentClientResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.importIotagentClientEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 智能体设备标识导入接口
   * Summary: 智能体设备标识导入接口
   */
  async importIotagentClientEx(request: ImportIotagentClientRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ImportIotagentClientResponse> {
    Util.validateModel(request);
    return $tea.cast<ImportIotagentClientResponse>(await this.doRequest("1.0", "antdigital.botsg.iotagent.client.import", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ImportIotagentClientResponse({}));
  }

}
