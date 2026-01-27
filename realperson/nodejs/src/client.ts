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

// 卡证OCR图片坐标
export class OcrLocation extends $tea.Model {
  // 表示定位位置的长方形左上顶点的垂直坐标
  top?: string;
  // 表示定位位置的长方形左上顶点的水平坐标
  left?: string;
  // 表示定位位置的长方形的宽度
  width?: string;
  // 表示定位位置的长方形的高度
  height?: string;
  static names(): { [key: string]: string } {
    return {
      top: 'top',
      left: 'left',
      width: 'width',
      height: 'height',
    };
  }

  static types(): { [key: string]: any } {
    return {
      top: 'string',
      left: 'string',
      width: 'string',
      height: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 卡证OCR图片质量
export class CardQuality extends $tea.Model {
  // 1-清晰
  // 0-不清晰
  // 
  isClear?: string;
  // 清晰度取值0-1，值越大表示图像质量越好，默认阈值0.5
  isClearPropobility?: string;
  // 1-边框/四角完整
  // 0-边框/四角不完整
  isComplete?: string;
  // 取值0-1，值越大表示图像质量越好，默认阈值0.5
  isCompletePropobility?: string;
  // 1-头像、关键字段无遮挡/马赛克
  // 0-头像、关键字段有遮挡/马赛克
  isNoCover?: string;
  // 有无遮挡propobility-取值0-1，值越大表示图像质量越好，默认阈值0.3
  isNoCoverPropobility?: string;
  static names(): { [key: string]: string } {
    return {
      isClear: 'is_clear',
      isClearPropobility: 'is_clear_propobility',
      isComplete: 'is_complete',
      isCompletePropobility: 'is_complete_propobility',
      isNoCover: 'is_no_cover',
      isNoCoverPropobility: 'is_no_cover_propobility',
    };
  }

  static types(): { [key: string]: any } {
    return {
      isClear: 'string',
      isClearPropobility: 'string',
      isComplete: 'string',
      isCompletePropobility: 'string',
      isNoCover: 'string',
      isNoCoverPropobility: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 音频元数据
export class AudioMeta extends $tea.Model {
  // 采样率
  sampleFreq?: number;
  // 音频道数
  channelsNum?: number;
  // 音频数据采样点所占位数
  bits?: number;
  // 语音信道分离标识
  channel?: number;
  static names(): { [key: string]: string } {
    return {
      sampleFreq: 'sample_freq',
      channelsNum: 'channels_num',
      bits: 'bits',
      channel: 'channel',
    };
  }

  static types(): { [key: string]: any } {
    return {
      sampleFreq: 'number',
      channelsNum: 'number',
      bits: 'number',
      channel: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 音频文件
export class Audio extends $tea.Model {
  // 音频文件名称（单次请求保持唯一）
  token?: string;
  // 待认证的音频文件，base64编码格式
  rawData?: string;
  // 音频文件OSS地址
  audioUrl?: string;
  static names(): { [key: string]: string } {
    return {
      token: 'token',
      rawData: 'raw_data',
      audioUrl: 'audio_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      token: 'string',
      rawData: 'string',
      audioUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 银行卡代扣二级租户收支明细
export class TransactionDetail extends $tea.Model {
  // 交易类型：RECHARGE 入金，TRANSFER 划拨 ，WITHDRAW 出金
  transType?: string;
  // 余额方向：CR-贷款（收入）/ DR-借款（支出）
  direction?: string;
  // 币种 CNY人民币
  ccy?: string;
  // 交易金额，单位：元，整数部分最长10位数，保留两位小数
  amount?: string;
  // 交易后余额，单位：元，整数部分最长10位数，保留两位小数
  afterAmount?: string;
  // 创建时间，格式为：yyyy-MM-dd HH:mm:ss
  creatTime?: string;
  // SHARE-分账
  // OFFSET_SHARE-差额分账
  // REFUND-退款
  // TRANSFER-转账
  // WITHDRAW-提现
  // CLEAR-资金清算
  // OTHER-其他
  // WITHDRAW_CANCEL-提现退回
  businessType?: string;
  static names(): { [key: string]: string } {
    return {
      transType: 'trans_type',
      direction: 'direction',
      ccy: 'ccy',
      amount: 'amount',
      afterAmount: 'after_amount',
      creatTime: 'creat_time',
      businessType: 'business_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      transType: 'string',
      direction: 'string',
      ccy: 'string',
      amount: 'string',
      afterAmount: 'string',
      creatTime: 'string',
      businessType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 风险咨询设备信息
export class DeviceInfo extends $tea.Model {
  // 设备指纹
  deviceFingerprint?: string;
  // 设备制造商
  deviceBrand?: string;
  // 设备具体型号
  deviceModel?: string;
  // 操作系统类型
  os?: string;
  // 操作系统版本
  osVersion?: string;
  // 设备rom版本
  romModel?: string;
  // 设备硬盘信息
  hardDisk?: string;
  // 内存容量
  memory?: string;
  // 设备网络ip
  cameraInfo?: string;
  // 网关入口ip
  gatewayIp?: string;
  static names(): { [key: string]: string } {
    return {
      deviceFingerprint: 'device_fingerprint',
      deviceBrand: 'device_brand',
      deviceModel: 'device_model',
      os: 'os',
      osVersion: 'os_version',
      romModel: 'rom_model',
      hardDisk: 'hard_disk',
      memory: 'memory',
      cameraInfo: 'camera_info',
      gatewayIp: 'gateway_ip',
    };
  }

  static types(): { [key: string]: any } {
    return {
      deviceFingerprint: 'string',
      deviceBrand: 'string',
      deviceModel: 'string',
      os: 'string',
      osVersion: 'string',
      romModel: 'string',
      hardDisk: 'string',
      memory: 'string',
      cameraInfo: 'string',
      gatewayIp: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 车辆资产验证详版车辆信息
export class CarInfoDetail extends $tea.Model {
  // 车辆型号
  clxh?: string;
  // 发动机号
  engineCode?: string;
  // 发动机型号
  engineModel?: string;
  // 生产时间
  productionTime?: string;
  // 品牌名称
  brandName?: string;
  // 高尔夫(第七代,2014-)
  seriesName?: string;
  // 年款
  modelYear?: string;
  // 款型名称
  vehicleName?: string;
  // 指导价
  guidePrice?: string;
  // 车身颜色
  color?: string;
  // 车型级别
  vehicleLevel?: string;
  // 车型种类
  vehicleType?: string;
  // 车身结构
  bodyStruct?: string;
  //  燃料种类
  fuelType?: string;
  // 驱动方式
  driveWay?: string;
  // 底盘型号-商用车用
  chassisModel?: string;
  // 排放标准
  emissionStandard?: string;
  // 排量
  displacement?: string;
  // 长
  length?: string;
  // 宽
  width?: string;
  // 高
  height?: string;
  // 总质量
  totalMass?: string;
  // 整备质量
  curbWeight?: string;
  // 前轮距
  tireDistanceBefore?: string;
  // 后轮距
  tireDistanceAfter?: string;
  // 轴数
  axesNumber?: string;
  // 轴距 
  wheelBase?: string;
  // 座位数
  seatingCapacity?: string;
  // 核定载质量
  approvedLoad?: string;
  // 准牵引总质量 
  quasiTraction?: string;
  // 轮胎规格
  tireSize?: string;
  // 轮胎数
  tireNumber?: string;
  //  变速箱
  transmission?: string;
  //  功率
  power?: string;
  // 油耗
  fuelConsumption?: string;
  // 环保标准
  environmentalStandards?: string;
  static names(): { [key: string]: string } {
    return {
      clxh: 'clxh',
      engineCode: 'engine_code',
      engineModel: 'engine_model',
      productionTime: 'production_time',
      brandName: 'brand_name',
      seriesName: 'series_name',
      modelYear: 'model_year',
      vehicleName: 'vehicle_name',
      guidePrice: 'guide_price',
      color: 'color',
      vehicleLevel: 'vehicle_level',
      vehicleType: 'vehicle_type',
      bodyStruct: 'body_struct',
      fuelType: 'fuel_type',
      driveWay: 'drive_way',
      chassisModel: 'chassis_model',
      emissionStandard: 'emission_standard',
      displacement: 'displacement',
      length: 'length',
      width: 'width',
      height: 'height',
      totalMass: 'total_mass',
      curbWeight: 'curb_weight',
      tireDistanceBefore: 'tire_distance_before',
      tireDistanceAfter: 'tire_distance_after',
      axesNumber: 'axes_number',
      wheelBase: 'wheel_base',
      seatingCapacity: 'seating_capacity',
      approvedLoad: 'approved_load',
      quasiTraction: 'quasi_traction',
      tireSize: 'tire_size',
      tireNumber: 'tire_number',
      transmission: 'transmission',
      power: 'power',
      fuelConsumption: 'fuel_consumption',
      environmentalStandards: 'environmental_standards',
    };
  }

  static types(): { [key: string]: any } {
    return {
      clxh: 'string',
      engineCode: 'string',
      engineModel: 'string',
      productionTime: 'string',
      brandName: 'string',
      seriesName: 'string',
      modelYear: 'string',
      vehicleName: 'string',
      guidePrice: 'string',
      color: 'string',
      vehicleLevel: 'string',
      vehicleType: 'string',
      bodyStruct: 'string',
      fuelType: 'string',
      driveWay: 'string',
      chassisModel: 'string',
      emissionStandard: 'string',
      displacement: 'string',
      length: 'string',
      width: 'string',
      height: 'string',
      totalMass: 'string',
      curbWeight: 'string',
      tireDistanceBefore: 'string',
      tireDistanceAfter: 'string',
      axesNumber: 'string',
      wheelBase: 'string',
      seatingCapacity: 'string',
      approvedLoad: 'string',
      quasiTraction: 'string',
      tireSize: 'string',
      tireNumber: 'string',
      transmission: 'string',
      power: 'string',
      fuelConsumption: 'string',
      environmentalStandards: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// AIGC风险专项检测
export class AigcRiskResult extends $tea.Model {
  // AIGC风险检测评分
  aigcRiskLevel?: string;
  // 图像伪造分数
  deepfakeScore?: string;
  // 图像伪造结论
  deepfakeResult?: string;
  // 视频伪造分数
  videoForgeryScore?: string;
  // 视频伪造结论
  videoFogeryResult?: string;
  static names(): { [key: string]: string } {
    return {
      aigcRiskLevel: 'aigc_risk_level',
      deepfakeScore: 'deepfake_score',
      deepfakeResult: 'deepfake_result',
      videoForgeryScore: 'video_forgery_score',
      videoFogeryResult: 'video_fogery_result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      aigcRiskLevel: 'string',
      deepfakeScore: 'string',
      deepfakeResult: 'string',
      videoForgeryScore: 'string',
      videoFogeryResult: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 车辆资产验证旗舰版车辆信息
export class CarInfo extends $tea.Model {
  // 是否高频使用，格式：YES/NO
  highFrequency?: string;
  // 车辆价值区间，格式：1，2，3...
  value?: string;
  // 车辆类型，格式：1，2，3
  type?: string;
  static names(): { [key: string]: string } {
    return {
      highFrequency: 'high_frequency',
      value: 'value',
      type: 'type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      highFrequency: 'string',
      value: 'string',
      type: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 设备风险信息
export class DeviceRiskInfo extends $tea.Model {
  // 端安全产品名
  securityProductName: string;
  // 调用蚂蚁终端安全或人脸保镖的token
  token?: string;
  // 端安全SDK版本
  securityVersion?: string;
  // 设备是否root
  isDeviceRooted?: boolean;
  // 设备是否hook
  isDeviceHooked?: boolean;
  // 设备是否使用定制rom
  isCustomRom?: boolean;
  // 设备是否是云手机
  isCloudPhone?: boolean;
  // 是否为模拟器
  isEmulator?: boolean;
  // 设备是否支持虚拟摄像头
  hasVirtualCamera?: boolean;
  // 设备是否使用虚拟摄像头
  isUsingVirtualCamera?: boolean;
  // 设备是否有重打包风险
  hasRepackRisk?: boolean;
  // 设备是否多开
  isMultiInstance?: boolean;
  // 设备是否开启虚拟定位
  isFakeLocation?: boolean;
  // 有其他注入行为
  hasOtherInjection?: boolean;
  // 设备是否有其他自动化工具
  hasAtuomationTools?: boolean;
  // 风险sdk的JSON格式数据
  riskSdkJson?: string;
  static names(): { [key: string]: string } {
    return {
      securityProductName: 'security_product_name',
      token: 'token',
      securityVersion: 'security_version',
      isDeviceRooted: 'is_device_rooted',
      isDeviceHooked: 'is_device_hooked',
      isCustomRom: 'is_custom_rom',
      isCloudPhone: 'is_cloud_phone',
      isEmulator: 'is_emulator',
      hasVirtualCamera: 'has_virtual_camera',
      isUsingVirtualCamera: 'is_using_virtual_camera',
      hasRepackRisk: 'has_repack_risk',
      isMultiInstance: 'is_multi_instance',
      isFakeLocation: 'is_fake_location',
      hasOtherInjection: 'has_other_injection',
      hasAtuomationTools: 'has_atuomation_tools',
      riskSdkJson: 'risk_sdk_json',
    };
  }

  static types(): { [key: string]: any } {
    return {
      securityProductName: 'string',
      token: 'string',
      securityVersion: 'string',
      isDeviceRooted: 'boolean',
      isDeviceHooked: 'boolean',
      isCustomRom: 'boolean',
      isCloudPhone: 'boolean',
      isEmulator: 'boolean',
      hasVirtualCamera: 'boolean',
      isUsingVirtualCamera: 'boolean',
      hasRepackRisk: 'boolean',
      isMultiInstance: 'boolean',
      isFakeLocation: 'boolean',
      hasOtherInjection: 'boolean',
      hasAtuomationTools: 'boolean',
      riskSdkJson: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 卡证OCR风险结果
export class RiskInfo extends $tea.Model {
  // 是否为复印件（仅身份证、银行卡含该字段）。0：否，1：是
  copy?: string;
  // 是否翻拍（仅身份证含该字段）。0：否，1：是
  reshoot?: string;
  // normal-识别正常
  // non_idcard-上传的图片中不包含身份证
  // blurred-身份证模糊
  // other_type_card-其他类型证照
  // over_exposure-身份证关键字段反光或过曝
  // over_dark-身份证欠曝（亮度过低）
  // unknown-未知状态
  imageStatus?: string[];
  // 输入参数 risk_info_type=true 时，则返回该字段，判断身份证是否存在风险，返回值：
  // normal-正常身份证；
  // copy-复印件；
  // temporary-临时身份证；
  // screen-翻拍；
  // PS-被PS修改；
  // unknown-其他未知情况
  riskType?: string[];
  // 图片质量
  cardQuality?: CardQuality;
  // 证件一致性
  idcardNumberType?: string;
  static names(): { [key: string]: string } {
    return {
      copy: 'copy',
      reshoot: 'reshoot',
      imageStatus: 'image_status',
      riskType: 'risk_type',
      cardQuality: 'card_quality',
      idcardNumberType: 'idcard_number_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      copy: 'string',
      reshoot: 'string',
      imageStatus: { 'type': 'array', 'itemType': 'string' },
      riskType: { 'type': 'array', 'itemType': 'string' },
      cardQuality: CardQuality,
      idcardNumberType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 分账退款信息
export class ShareRefundInfo extends $tea.Model {
  // 商户id
  merchantId?: string;
  // 分账金额,整数、单位为分
  amount?: string;
  static names(): { [key: string]: string } {
    return {
      merchantId: 'merchant_id',
      amount: 'amount',
    };
  }

  static types(): { [key: string]: any } {
    return {
      merchantId: 'string',
      amount: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 分账信息
export class ShareInfo extends $tea.Model {
  // 商户id
  merchantId?: string;
  // 分账金额,整数、单位为分
  amount?: string;
  static names(): { [key: string]: string } {
    return {
      merchantId: 'merchant_id',
      amount: 'amount',
    };
  }

  static types(): { [key: string]: any } {
    return {
      merchantId: 'string',
      amount: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 卡证OCR识别结果
export class OcrInfo extends $tea.Model {
  // 当识别到身份证是人像面时返回FACE，国徽面时返回BACK
  side?: string;
  // 当请求参数 return_photo = true时返回，头像切图的 base64 编码（无编码头，需自行处理）
  // *当服务降级时，返回null
  photo?: string;
  // {}	当请求参数 return_photo = true时返回，头像的位置信息（坐标0点为左上角）
  // *当服务降级时，返回null
  photoLocation?: OcrLocation;
  // 当请求参数 return_card = true时返回，身份证裁剪切图的 base64 编码（无编码头，需自行处理）
  // *当服务降级时，返回null
  cardImage?: string;
  // 当请求参数 return_card = true时返回，身份证裁剪切图的位置信息（坐标0点为左上角）
  // *当服务降级时，返回null
  cardLocation?: OcrLocation;
  // 姓名
  name?: string;
  // 性别
  sex?: string;
  // 民族
  nationality?: string;
  // 出生日期（yyyyMMdd格式）
  birth?: string;
  // 住址
  address?: string;
  // 身份证号
  num?: string;
  // 发证日期（yyyyMMdd格式）
  startDate?: string;
  // 到期日（yyyyMMdd格式）。
  // 如果是长期身份证，该字段内容为“长期”（不含引号）。
  endDate?: string;
  // 签发机关
  issue?: string;
  // 银行卡类型（CC（贷记卡），SCC（准贷记卡），DCC（存贷合一卡），DC（储蓄卡），PC（预付卡））
  bankCardType?: string;
  // 银行名，不能识别时为空
  bankName?: string;
  // 银行卡号
  cardNumber?: string;
  // 有效期至
  validToDate?: string;
  // 证件类别
  title?: string;
  // 有效期限(yyyy.MM.dd-yyyy.MM.dd格式)
  dateOfExpiry?: string;
  // 换证次数
  changeNum?: string;
  // 初次领证日期
  firstIssue?: string;
  // 准驾车型
  driverClass?: string;
  // 档案编号
  docNum?: string;
  // 电子驾驶证生成时间
  issueTime?: string;
  // 当前时间
  currentTime?: string;
  // 条形码编号
  barCode?: string;
  // 累计记分
  points?: string;
  // 记录
  remark?: string;
  // 状态
  status?: string;
  // 车辆识别代号
  vehicle?: string;
  // 品牌型号
  model?: string;
  // 车辆类型
  type?: string;
  // 使用性质
  useage?: string;
  // 发动机号码
  engNum?: string;
  // 车牌号码
  plate?: string;
  // 检验记录
  inspecRecord?: string;
  // 核定载质量
  load?: string;
  // 整备质量
  curbMass?: string;
  // 外廓尺寸
  overallDimension?: string;
  // 核定载人数
  seating?: string;
  // 总质量
  grossMass?: string;
  // 燃油类型
  fuel?: string;
  // 准牵引总质量
  tractionMass?: string;
  // 证芯编号
  chipNum?: string;
  static names(): { [key: string]: string } {
    return {
      side: 'side',
      photo: 'photo',
      photoLocation: 'photo_location',
      cardImage: 'card_image',
      cardLocation: 'card_location',
      name: 'name',
      sex: 'sex',
      nationality: 'nationality',
      birth: 'birth',
      address: 'address',
      num: 'num',
      startDate: 'start_date',
      endDate: 'end_date',
      issue: 'issue',
      bankCardType: 'bank_card_type',
      bankName: 'bank_name',
      cardNumber: 'card_number',
      validToDate: 'valid_to_date',
      title: 'title',
      dateOfExpiry: 'date_of_expiry',
      changeNum: 'change_num',
      firstIssue: 'first_issue',
      driverClass: 'driver_class',
      docNum: 'doc_num',
      issueTime: 'issue_time',
      currentTime: 'current_time',
      barCode: 'bar_code',
      points: 'points',
      remark: 'remark',
      status: 'status',
      vehicle: 'vehicle',
      model: 'model',
      type: 'type',
      useage: 'useage',
      engNum: 'eng_num',
      plate: 'plate',
      inspecRecord: 'inspec_record',
      load: 'load',
      curbMass: 'curb_mass',
      overallDimension: 'overall_dimension',
      seating: 'seating',
      grossMass: 'gross_mass',
      fuel: 'fuel',
      tractionMass: 'traction_mass',
      chipNum: 'chip_num',
    };
  }

  static types(): { [key: string]: any } {
    return {
      side: 'string',
      photo: 'string',
      photoLocation: OcrLocation,
      cardImage: 'string',
      cardLocation: OcrLocation,
      name: 'string',
      sex: 'string',
      nationality: 'string',
      birth: 'string',
      address: 'string',
      num: 'string',
      startDate: 'string',
      endDate: 'string',
      issue: 'string',
      bankCardType: 'string',
      bankName: 'string',
      cardNumber: 'string',
      validToDate: 'string',
      title: 'string',
      dateOfExpiry: 'string',
      changeNum: 'string',
      firstIssue: 'string',
      driverClass: 'string',
      docNum: 'string',
      issueTime: 'string',
      currentTime: 'string',
      barCode: 'string',
      points: 'string',
      remark: 'string',
      status: 'string',
      vehicle: 'string',
      model: 'string',
      type: 'string',
      useage: 'string',
      engNum: 'string',
      plate: 'string',
      inspecRecord: 'string',
      load: 'string',
      curbMass: 'string',
      overallDimension: 'string',
      seating: 'string',
      grossMass: 'string',
      fuel: 'string',
      tractionMass: 'string',
      chipNum: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 车辆资产验证增强版车辆信息
export class CarInfoPlus extends $tea.Model {
  // 车牌号
  plateNo?: string;
  // 车辆型号，格式：1，2，3...
  model?: string;
  // 车辆颜色，格式：1，2，3
  color?: string;
  static names(): { [key: string]: string } {
    return {
      plateNo: 'plate_no',
      model: 'model',
      color: 'color',
    };
  }

  static types(): { [key: string]: any } {
    return {
      plateNo: 'string',
      model: 'string',
      color: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 车辆资产验证简版车辆信息
export class CarInfoBrief extends $tea.Model {
  // 生产时间
  productionTime?: string;
  // 品牌名称
  brandName?: string;
  // 车系名称
  seriesName?: string;
  // 燃料种类
  fuelType?: string;
  // 轴数
  axesNumber?: string;
  // 轴距
  wheelBase?: string;
  // 排量描述
  engineDescribe?: string;
  // 车身颜色
  color?: string;
  // 年款
  yearPattern?: string;
  // 生产厂商
  manufacturerName?: string;
  // 发布年月
  publishDate?: string;
  // 款型
  saleCode?: string;
  // 驱动形式
  driveForm?: string;
  // 国产/进口/合资
  importFlag?: string;
  // 后轮距
  tireDistanceAfter?: string;
  // 排量
  displacement?: string;
  // 排放标准
  emissionStandard?: string;
  // 功率
  power?: string;
  // 变速箱类型
  gearbox?: string;
  // 车辆类型
  vehicleType?: string;
  // 发动机型号
  engineModel?: string;
  // 轮胎数
  tireCount?: string;
  // 座位数
  ratedPassengers?: string;
  // 指导价
  guidedPrice?: string;
  // 车长
  length?: string;
  // 车宽
  width?: string;
  // 车高
  height?: string;
  // 整备质量
  curbWeight?: string;
  // 总质量
  totalWeight?: string;
  // 前轮距
  tireDistanceBefore?: string;
  // 额定载重量
  ratedPlyload?: string;
  // 牵引总质量
  trailerWeight?: string;
  static names(): { [key: string]: string } {
    return {
      productionTime: 'production_time',
      brandName: 'brand_name',
      seriesName: 'series_name',
      fuelType: 'fuel_type',
      axesNumber: 'axes_number',
      wheelBase: 'wheel_base',
      engineDescribe: 'engine_describe',
      color: 'color',
      yearPattern: 'year_pattern',
      manufacturerName: 'manufacturer_name',
      publishDate: 'publish_date',
      saleCode: 'sale_code',
      driveForm: 'drive_form',
      importFlag: 'import_flag',
      tireDistanceAfter: 'tire_distance_after',
      displacement: 'displacement',
      emissionStandard: 'emission_standard',
      power: 'power',
      gearbox: 'gearbox',
      vehicleType: 'vehicle_type',
      engineModel: 'engine_model',
      tireCount: 'tire_count',
      ratedPassengers: 'rated_passengers',
      guidedPrice: 'guided_price',
      length: 'length',
      width: 'width',
      height: 'height',
      curbWeight: 'curb_weight',
      totalWeight: 'total_weight',
      tireDistanceBefore: 'tire_distance_before',
      ratedPlyload: 'rated_plyload',
      trailerWeight: 'trailer_weight',
    };
  }

  static types(): { [key: string]: any } {
    return {
      productionTime: 'string',
      brandName: 'string',
      seriesName: 'string',
      fuelType: 'string',
      axesNumber: 'string',
      wheelBase: 'string',
      engineDescribe: 'string',
      color: 'string',
      yearPattern: 'string',
      manufacturerName: 'string',
      publishDate: 'string',
      saleCode: 'string',
      driveForm: 'string',
      importFlag: 'string',
      tireDistanceAfter: 'string',
      displacement: 'string',
      emissionStandard: 'string',
      power: 'string',
      gearbox: 'string',
      vehicleType: 'string',
      engineModel: 'string',
      tireCount: 'string',
      ratedPassengers: 'string',
      guidedPrice: 'string',
      length: 'string',
      width: 'string',
      height: 'string',
      curbWeight: 'string',
      totalWeight: 'string',
      tireDistanceBefore: 'string',
      ratedPlyload: 'string',
      trailerWeight: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 综合风险
export class RiskResult extends $tea.Model {
  // 活体检测标签
  imageLabels?: string;
  // 设备风险等级
  deviceRiskLevel?: string;
  // 设备风险标签
  deviceRiskLabels?: string;
  // 行为风险等级
  behaviorRiskLevel?: string;
  // 行为风险标签
  behaviorRiskLabels?: string;
  // 是否关联攻击
  isCorrelate?: boolean;
  static names(): { [key: string]: string } {
    return {
      imageLabels: 'image_labels',
      deviceRiskLevel: 'device_risk_level',
      deviceRiskLabels: 'device_risk_labels',
      behaviorRiskLevel: 'behavior_risk_level',
      behaviorRiskLabels: 'behavior_risk_labels',
      isCorrelate: 'is_correlate',
    };
  }

  static types(): { [key: string]: any } {
    return {
      imageLabels: 'string',
      deviceRiskLevel: 'string',
      deviceRiskLabels: 'string',
      behaviorRiskLevel: 'string',
      behaviorRiskLabels: 'string',
      isCorrelate: 'boolean',
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

export class QueryFacevrfServerRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 实人认证唯一标识
  certifyId: string;
  // 预留扩展业务参数
  externParam?: string;
  // 认证材料（如人脸图像）的哈希
  materialHash?: string;
  // 外部唯一标识。用于定位。
  // 值为32位长度的字母数字组合前面几位字符是商户自定义的简称，中间可以使用一段时间，后段可以使用一个随机或递增序列
  outerOrderNo: string;
  // 场景ID
  sceneId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      certifyId: 'certify_id',
      externParam: 'extern_param',
      materialHash: 'material_hash',
      outerOrderNo: 'outer_order_no',
      sceneId: 'scene_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      certifyId: 'string',
      externParam: 'string',
      materialHash: 'string',
      outerOrderNo: 'string',
      sceneId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryFacevrfServerResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 认证的主体信息，一般的认证场景返回为空
  identityInfo?: string;
  // 认证主体附件信息，一般的认证场景都是返回空
  materialInfo?: string;
  // 认证材料哈希是否匹配
  materialMatched?: string;
  // 是否通过，通过为T，不通过为F
  passed?: string;
  // 业务失败原因
  reason?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      identityInfo: 'identity_info',
      materialInfo: 'material_info',
      materialMatched: 'material_matched',
      passed: 'passed',
      reason: 'reason',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      identityInfo: 'string',
      materialInfo: 'string',
      materialMatched: 'string',
      passed: 'string',
      reason: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateFacevrfServerRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 认证模式码
  bizCode: string;
  // h5认证完成后，服务端回调此地址通知商户认证结果
  callbackUrl?: string;
  // 真实姓名
  certName?: string;
  // 证件号码
  certNo?: string;
  // cert_name、cert_no两个字段的传入模式。0：明文1：密文
  encType?: string;
  // 证件类型，如身份证
  certType?: string;
  // 预留扩展参数
  externParam?: string;
  // 自定义比对源人脸图像，base64编码格式
  facialPictureRef?: string;
  // 身份信息来源类型，如证件
  identityType: string;
  // metainfo 环境参数，需要通过客户端 SDK 获取
  metaInfo?: string;
  // 外部唯一标识。用于定位。
  // 值为32位长度的字母数字组合前面几位字符是商户自定义的简称，中间可以使用一段时间，后段可以使用一个随机或递增序列
  outerOrderNo: string;
  // 回跳地址
  returnUrl?: string;
  // 场景ID
  sceneId: string;
  // 商户自定义的用户ID
  userId?: string;
  // 用户的IP
  userIp?: string;
  // 用户的手机号
  userMobile?: string;
  // callbackUrl回调时是否需要重试，默认false(不需要重试)
  callbackNeedRetry?: boolean;
  // 活体检测的类型
  model?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizCode: 'biz_code',
      callbackUrl: 'callback_url',
      certName: 'cert_name',
      certNo: 'cert_no',
      encType: 'enc_type',
      certType: 'cert_type',
      externParam: 'extern_param',
      facialPictureRef: 'facial_picture_ref',
      identityType: 'identity_type',
      metaInfo: 'meta_info',
      outerOrderNo: 'outer_order_no',
      returnUrl: 'return_url',
      sceneId: 'scene_id',
      userId: 'user_id',
      userIp: 'user_ip',
      userMobile: 'user_mobile',
      callbackNeedRetry: 'callback_need_retry',
      model: 'model',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizCode: 'string',
      callbackUrl: 'string',
      certName: 'string',
      certNo: 'string',
      encType: 'string',
      certType: 'string',
      externParam: 'string',
      facialPictureRef: 'string',
      identityType: 'string',
      metaInfo: 'string',
      outerOrderNo: 'string',
      returnUrl: 'string',
      sceneId: 'string',
      userId: 'string',
      userIp: 'string',
      userMobile: 'string',
      callbackNeedRetry: 'boolean',
      model: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateFacevrfServerResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 实人认证唯一标识
  certifyId?: string;
  // 认证地址。只在特定场景返回。
  certifyUrl?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      certifyId: 'certify_id',
      certifyUrl: 'certify_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      certifyId: 'string',
      certifyUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecFacevrfServerRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 真实姓名
  certName: string;
  // 证件号码
  certNo: string;
  // cert_name、cert_no两个字段的传入模式0：明文1：密文
  encType?: string;
  // 证件类型，如身份证
  certType: string;
  // 预留扩展参数
  externParam?: string;
  // 自定义比对源人脸图像，base64编码格式
  facialPictureRef?: string;
  // 身份信息来源类型，如证件
  identityType: string;
  // 外部唯一标识。用于定位。 值为32位长度的字母数字组合前面几位字符是商户自定义的简称，中间可以使用一段时间，后段可以使用一个随机或递增序列
  outerOrderNo: string;
  // 场景ID
  sceneId: string;
  // 商户自定义的用户ID
  userId?: string;
  // 用户的IP
  userIp?: string;
  // 用户的手机号（或其哈希值）
  userMobile?: string;
  // 待认证的人脸图像，base64编码格式
  facialPictureAuth: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      certName: 'cert_name',
      certNo: 'cert_no',
      encType: 'enc_type',
      certType: 'cert_type',
      externParam: 'extern_param',
      facialPictureRef: 'facial_picture_ref',
      identityType: 'identity_type',
      outerOrderNo: 'outer_order_no',
      sceneId: 'scene_id',
      userId: 'user_id',
      userIp: 'user_ip',
      userMobile: 'user_mobile',
      facialPictureAuth: 'facial_picture_auth',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      certName: 'string',
      certNo: 'string',
      encType: 'string',
      certType: 'string',
      externParam: 'string',
      facialPictureRef: 'string',
      identityType: 'string',
      outerOrderNo: 'string',
      sceneId: 'string',
      userId: 'string',
      userIp: 'string',
      userMobile: 'string',
      facialPictureAuth: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecFacevrfServerResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 认证ID
  certifyId?: string;
  // 是否通过，通过为T，不通过为F
  passed?: string;
  // 业务失败原因
  reason?: string;
  // 认证主体附件信息，包含共计类型等
  materialInfo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      certifyId: 'certify_id',
      passed: 'passed',
      reason: 'reason',
      materialInfo: 'material_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      certifyId: 'string',
      passed: 'string',
      reason: 'string',
      materialInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetFacevrfEvidenceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 某次刷脸的certifyId
  certifyId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      certifyId: 'certify_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      certifyId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetFacevrfEvidenceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 刷脸的certifyId，原样返回
  certifyId?: string;
  // 统一证据ID，非SUCCESS状态为null，可在控制台中持统一证据ID验证pdf文件的正确性，法院方也可用此统一证据ID在司法链控制台进行核验pdf文件的正确性。
  onchainId?: string;
  // 上链状态，`SUCCESS`表示成功、`INIT`表示正在上链
  onchainStatus?: string;
  // pdf存证是否已经过期，不支持超过6个月的存证获取
  pdfExpired?: boolean;
  // 存证pdf文件内容的base64
  pdfContent?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      certifyId: 'certify_id',
      onchainId: 'onchain_id',
      onchainStatus: 'onchain_status',
      pdfExpired: 'pdf_expired',
      pdfContent: 'pdf_content',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      certifyId: 'string',
      onchainId: 'string',
      onchainStatus: 'string',
      pdfExpired: 'boolean',
      pdfContent: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckIndividualidTwometaRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 外部唯一标识。用于定位。 值为32位长度的字母数字组合前面几位字符是商户自定义的简称，中间可以使用一段时间，后段可以使用一个随机或递增序列
  outerOrderNo: string;
  // 姓名
  certName: string;
  // 身份证号码
  certNo: string;
  // map结果的json数据格式，预留字段
  externParam?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      outerOrderNo: 'outer_order_no',
      certName: 'cert_name',
      certNo: 'cert_no',
      externParam: 'extern_param',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      outerOrderNo: 'string',
      certName: 'string',
      certNo: 'string',
      externParam: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckIndividualidTwometaResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // true:匹配成功  false：匹配失败
  match?: string;
  // 扩展信息，预留字段
  externInfo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      match: 'match',
      externInfo: 'extern_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      match: 'string',
      externInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckIndividualidThreemetaRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 外部唯一标识。用于定位。 值为32位长度的字母数字组合前面几位字符是商户自定义的简称，中间可以使用一段时间，后段可以使用一个随机或递增序列
  outerOrderNo: string;
  // 姓名
  certName: string;
  // 身份证号码
  certNo: string;
  // 手机号码
  mobile: string;
  // map结果的json数据格式，预留字段
  // 
  externParam?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      outerOrderNo: 'outer_order_no',
      certName: 'cert_name',
      certNo: 'cert_no',
      mobile: 'mobile',
      externParam: 'extern_param',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      outerOrderNo: 'string',
      certName: 'string',
      certNo: 'string',
      mobile: 'string',
      externParam: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckIndividualidThreemetaResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // true:匹配成功 false：匹配失败
  match?: string;
  // 扩展信息，预留字段
  // 
  externInfo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      match: 'match',
      externInfo: 'extern_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      match: 'string',
      externInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckIndividualidFourmetaRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 外部唯一标识。用于定位。 值为32位长度的字母数字组合前面几位字符是商户自定义的简称，中间可以使用一段时间，后段可以使用一个随机或递增序列
  outerOrderNo: string;
  // 姓名
  // 
  certName: string;
  // 身份证号码
  certNo: string;
  // 手机号码
  mobile: string;
  // 银行卡号
  bankCard: string;
  // map结果的json数据格式，预留字段
  // 
  externParam?: string;
  // 证件类型： 1：居民身份证（默认值） 2：军官证 3：护照 4：回乡证 5：台胞证 6：警官证 7：士兵证 99：其他
  certType?: string;
  // 入参加密模式：NONE：不加密；AES：姓名、身份证号、手机号码字段都是AES加密后的字符串。非必填，不填时默认明文
  reqEncType?: string;
  // 用于入参加密的AES密钥
  encToken?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      outerOrderNo: 'outer_order_no',
      certName: 'cert_name',
      certNo: 'cert_no',
      mobile: 'mobile',
      bankCard: 'bank_card',
      externParam: 'extern_param',
      certType: 'cert_type',
      reqEncType: 'req_enc_type',
      encToken: 'enc_token',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      outerOrderNo: 'string',
      certName: 'string',
      certNo: 'string',
      mobile: 'string',
      bankCard: 'string',
      externParam: 'string',
      certType: 'string',
      reqEncType: 'string',
      encToken: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckIndividualidFourmetaResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // true:匹配成功 false：匹配失败
  // 
  match?: string;
  // 扩展信息，预留字段
  // 
  externInfo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      match: 'match',
      externInfo: 'extern_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      match: 'string',
      externInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckRouteThreemetaRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 外部唯一标识。用于定位。 值为32位长度的字母数字组合前面几位字符是商户自定义的简称，中间可以使用一段时间，后段可以使用一个随机或递增序列
  outerOrderNo: string;
  // 姓名
  certName: string;
  // 身份证号
  certNo: string;
  // 手机号
  mobile: string;
  // 使用场景
  scene: string;
  // 三要素的加密方式，NONE/MD5/SHA256
  reqEncType?: string;
  // map结果的json数据格式，预留字段
  externParam?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      outerOrderNo: 'outer_order_no',
      certName: 'cert_name',
      certNo: 'cert_no',
      mobile: 'mobile',
      scene: 'scene',
      reqEncType: 'req_enc_type',
      externParam: 'extern_param',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      outerOrderNo: 'string',
      certName: 'string',
      certNo: 'string',
      mobile: 'string',
      scene: 'string',
      reqEncType: 'string',
      externParam: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckRouteThreemetaResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // true:匹配成功 false：匹配失败
  match?: string;
  // CHINA_TELECOM：中国电信
  // CHINA_MOBILE：中国移动
  // CHINA_UNICOM：中国联通
  carrier?: string;
  // 扩展信息，预留字段
  externInfo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      match: 'match',
      carrier: 'carrier',
      externInfo: 'extern_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      match: 'string',
      carrier: 'string',
      externInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateVoiceprintServermodeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 外部唯一标识。用于定位。 值为32位长度的字母数字组合前面几位字符是商户自定义的简称，中间可以使用一段时间，后段可以使用一个随机或递增序列
  outerOrderNo: string;
  // 商户自定义的用户ID
  userId: string;
  // 音频文件流
  fileObject?: Readable;
  fileObjectName?: string;
  fileId?: string;
  // 音频元数据
  audioMeta: AudioMeta;
  // 音频文件集合
  audios: Audio[];
  // 预留扩展参数
  externParam?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      outerOrderNo: 'outer_order_no',
      userId: 'user_id',
      fileObject: 'fileObject',
      fileObjectName: 'fileObjectName',
      fileId: 'file_id',
      audioMeta: 'audio_meta',
      audios: 'audios',
      externParam: 'extern_param',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      outerOrderNo: 'string',
      userId: 'string',
      fileObject: 'Readable',
      fileObjectName: 'string',
      fileId: 'string',
      audioMeta: AudioMeta,
      audios: { 'type': 'array', 'itemType': Audio },
      externParam: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateVoiceprintServermodeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 扩展信息，预留字段
  externInfo?: string;
  // 产品结果明细，不影响决策
  resultCodeSub?: string;
  // result_code_sub对应的文案
  resultMsgSub?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      externInfo: 'extern_info',
      resultCodeSub: 'result_code_sub',
      resultMsgSub: 'result_msg_sub',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      externInfo: 'string',
      resultCodeSub: 'string',
      resultMsgSub: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class VerifyVoiceprintServermodeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 外部唯一标识。用于定位。 值为32位长度的字母数字组合前面几位字符是商户自定义的简称，中间可以使用一段时间，后段可以使用一个随机或递增序列
  outerOrderNo: string;
  // 商户自定义的用户ID
  userId: string;
  // 音频文件，base64编码格式
  // 
  audioAuth?: string;
  // 音频文件OSS地址
  audioUrl?: string;
  // 音频元数据
  audioMeta: AudioMeta;
  // 预留扩展参数
  externParam?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      outerOrderNo: 'outer_order_no',
      userId: 'user_id',
      audioAuth: 'audio_auth',
      audioUrl: 'audio_url',
      audioMeta: 'audio_meta',
      externParam: 'extern_param',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      outerOrderNo: 'string',
      userId: 'string',
      audioAuth: 'string',
      audioUrl: 'string',
      audioMeta: AudioMeta,
      externParam: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class VerifyVoiceprintServermodeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 声纹认证唯一ID
  certifyId?: string;
  // 扩展信息，预留字段
  externInfo?: string;
  // 产品结果明细，不影响决策
  resultCodeSub?: string;
  // result_code_sub对应的文案
  resultMsgSub?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      certifyId: 'certify_id',
      externInfo: 'extern_info',
      resultCodeSub: 'result_code_sub',
      resultMsgSub: 'result_msg_sub',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      certifyId: 'string',
      externInfo: 'string',
      resultCodeSub: 'string',
      resultMsgSub: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckRouteTwometaRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 外部唯一标识。用于定位。 值为32位长度的字母数字组合前面几位字符是商户自定义的简称，中间可以使用一段时间，后段可以使用一个随机或递增序列
  outerOrderNo: string;
  // 姓名
  certName: string;
  // 身份证号
  certNo: string;
  // 使用场景（不再使用）
  scene?: string;
  // map结果的json数据格式，预留字段
  // 
  externParam?: string;
  // 入参加密模式：NONE：不加密；AES：姓名、身份证号、手机号码字段都是AES加密后的字符串。非必填，不填时默认明文
  reqEncType?: string;
  // 用于入参加密的AES密钥
  encToken?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      outerOrderNo: 'outer_order_no',
      certName: 'cert_name',
      certNo: 'cert_no',
      scene: 'scene',
      externParam: 'extern_param',
      reqEncType: 'req_enc_type',
      encToken: 'enc_token',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      outerOrderNo: 'string',
      certName: 'string',
      certNo: 'string',
      scene: 'string',
      externParam: 'string',
      reqEncType: 'string',
      encToken: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckRouteTwometaResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // true:匹配成功 false：匹配失败
  // 
  match?: string;
  // 扩展信息，预留字段
  // 
  externInfo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      match: 'match',
      externInfo: 'extern_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      match: 'string',
      externInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryMobileRiskRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 外部唯一标识。用于定位。 值为32位长度的字母数字组合前面几位字符是商户自定义的简称，中间可以使用一段时间，后段可以使用一个随机或递增序列
  outerOrderNo: string;
  // 设备身份临时标识
  apdidToken: string;
  // 接口使用场景，不同场景下接口返回字段集合会有差异，可缺省
  scene?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      outerOrderNo: 'outer_order_no',
      apdidToken: 'apdid_token',
      scene: 'scene',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      outerOrderNo: 'string',
      apdidToken: 'string',
      scene: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryMobileRiskResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 设备相关数据，默认只返回apdid，由Map<String,String>序列化
  deviceInfo?: string;
  // 设备风险标签，由Map<String,String>序列化
  riskInfo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      deviceInfo: 'device_info',
      riskInfo: 'risk_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      deviceInfo: 'string',
      riskInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DetailFacevrfServerRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 实人认证唯一标识
  certifyId: string;
  // 预留扩展业务参数
  externParam?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      certifyId: 'certify_id',
      externParam: 'extern_param',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      certifyId: 'string',
      externParam: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DetailFacevrfServerResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // PASS：认证通过
  // FAIL：认证不通过
  // NO_RECODE：无认证记录
  // PROCESSING：认证中
  state?: string;
  // 认证人信息，包括姓名和身份证号，不加密
  // state为PASS/FAIL/PROCESSING时为JSON字符串，为NO_RECORD时为空
  identityInfo?: string;
  // 预留扩展结果
  externInfo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      state: 'state',
      identityInfo: 'identity_info',
      externInfo: 'extern_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      state: 'string',
      identityInfo: 'string',
      externInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckAnticheatPersonalRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 外部请求id
  outerOrderNo: string;
  // 主体姓名
  certName?: string;
  // 主体身份证号
  certNo: string;
  // 受雇企业
  companyName: string;
  // 组织机构代码
  companyNo?: string;
  // 扩展字段，json格式
  externParam?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      outerOrderNo: 'outer_order_no',
      certName: 'cert_name',
      certNo: 'cert_no',
      companyName: 'company_name',
      companyNo: 'company_no',
      externParam: 'extern_param',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      outerOrderNo: 'string',
      certName: 'string',
      certNo: 'string',
      companyName: 'string',
      companyNo: 'string',
      externParam: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckAnticheatPersonalResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 风险等级
  riskLevel?: string;
  // 风险等级文字描述
  riskLevelDesc?: string;
  // 扩展信息
  externInfo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      riskLevel: 'risk_level',
      riskLevelDesc: 'risk_level_desc',
      externInfo: 'extern_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      riskLevel: 'string',
      riskLevelDesc: 'string',
      externInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckTwometaHashRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // hash后的身份证号，不区分大小写，使用的hash算法参考hash_type字段
  certNoHash: string;
  // hash后的姓名，不区分大小写，使用的hash类型参考hash_type
  certNameHash: string;
  // 本次核验id
  outerOrderId: string;
  // 支持的hash类型
  hashType: string;
  // json格式的扩展字段
  externInfo?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      certNoHash: 'cert_no_hash',
      certNameHash: 'cert_name_hash',
      outerOrderId: 'outer_order_id',
      hashType: 'hash_type',
      externInfo: 'extern_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      certNoHash: 'string',
      certNameHash: 'string',
      outerOrderId: 'string',
      hashType: 'string',
      externInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckTwometaHashResponse extends $tea.Model {
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

export class QueryThreemetaOnlinetimeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 外部请求id
  outerOrderNo: string;
  // 姓名
  certName?: string;
  // 身份证号
  certNo?: string;
  // 手机号码
  phoneNo: string;
  // 是否区分运营商
  divCarrier?: boolean;
  // 运营商类型
  carrier?: string;
  // 加密类型，填写时「支持加密」字段需要对应加密后赋值。默认使用明文模式
  // 0：明文
  // 1：MD5
  encryptType?: string;
  // 扩展参数
  externParam?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      outerOrderNo: 'outer_order_no',
      certName: 'cert_name',
      certNo: 'cert_no',
      phoneNo: 'phone_no',
      divCarrier: 'div_carrier',
      carrier: 'carrier',
      encryptType: 'encrypt_type',
      externParam: 'extern_param',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      outerOrderNo: 'string',
      certName: 'string',
      certNo: 'string',
      phoneNo: 'string',
      divCarrier: 'boolean',
      carrier: 'string',
      encryptType: 'string',
      externParam: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryThreemetaOnlinetimeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 在网时长标准码，规则：
  // 1: [0,3)表示在⽹时⻓是 0~3 个⽉
  // 2: [3,6)表示在⽹时⻓是 3~6 个⽉
  // 3: [6,12)表示在⽹时⻓是 6~12 个⽉
  // 4: [12,24)表示在⽹时⻓是 12~24 ⽉
  // 5: [24,+)表示在⽹时⻓是 24个⽉及以上
  lengthCode?: string;
  // CHINA_TELECOM：中国电信
  // CHINA_MOBILE：中国移动
  // CHINA_UNICOM：中国联通
  carrier?: string;
  // 扩展信息，json格式
  externInfo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      lengthCode: 'length_code',
      carrier: 'carrier',
      externInfo: 'extern_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      lengthCode: 'string',
      carrier: 'string',
      externInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class InitFacevrfZimRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 业务参数
  bizData?: string;
  // 渠道
  channel?: string;
  // 商户
  merchant?: string;
  // 环境参数
  metaInfo: string;
  // 产品节点
  produceNode?: string;
  // 产品名称
  productName?: string;
  // 实人认证id
  // 
  zimId: string;
  // 身份信息参数
  // 
  zimPrincipal?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizData: 'biz_data',
      channel: 'channel',
      merchant: 'merchant',
      metaInfo: 'meta_info',
      produceNode: 'produce_node',
      productName: 'product_name',
      zimId: 'zim_id',
      zimPrincipal: 'zim_principal',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizData: 'string',
      channel: 'string',
      merchant: 'string',
      metaInfo: 'string',
      produceNode: 'string',
      productName: 'string',
      zimId: 'string',
      zimPrincipal: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class InitFacevrfZimResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 预留扩展结果
  // 
  extParams?: string;
  // 描述
  message?: string;
  // 协议
  protocol?: string;
  // 返回码
  retCode?: string;
  // 明细返回码
  retCodeSub?: string;
  // 明细返回码对应的文案
  retMessageSub?: string;
  // 实人认证id
  zimId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      extParams: 'ext_params',
      message: 'message',
      protocol: 'protocol',
      retCode: 'ret_code',
      retCodeSub: 'ret_code_sub',
      retMessageSub: 'ret_message_sub',
      zimId: 'zim_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      extParams: 'string',
      message: 'string',
      protocol: 'string',
      retCode: 'string',
      retCodeSub: 'string',
      retMessageSub: 'string',
      zimId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class VerifyFacevrfZimRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 扩展信息,Map的json格式
  externParam?: string;
  // 人脸业务参数
  zimData: string;
  // 7501f6c2dd57e06fe0d4202d3aaab58e
  zimId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      externParam: 'extern_param',
      zimData: 'zim_data',
      zimId: 'zim_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      externParam: 'string',
      zimData: 'string',
      zimId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class VerifyFacevrfZimResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 预留扩展结果
  extParams?: string;
  // ""
  hasNext?: string;
  // ""
  nextProtocol?: string;
  // 产品返回明细码
  productRetCode?: string;
  // 明细返回码
  retCodeSub?: string;
  // 明细返回码对应的文案
  retMessageSub?: string;
  // 验证返回明细码
  validationRetCode?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      extParams: 'ext_params',
      hasNext: 'has_next',
      nextProtocol: 'next_protocol',
      productRetCode: 'product_ret_code',
      retCodeSub: 'ret_code_sub',
      retMessageSub: 'ret_message_sub',
      validationRetCode: 'validation_ret_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      extParams: 'string',
      hasNext: 'string',
      nextProtocol: 'string',
      productRetCode: 'string',
      retCodeSub: 'string',
      retMessageSub: 'string',
      validationRetCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RecognizeDocIndividualcardRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 长度不超过32位的0-9A-Za-z字符串。
  // 外部请求ID，由调用方自行生成并自行保证唯一，以便问题定位。
  outOrderNo: string;
  // 待识别的卡类型。取值约束：ID_CARD（身份证）;EEP_TO_ML_CARD（港澳来往大陆通行证）;BANK_CARD（银行卡）
  ocrType: string;
  // 传入的图片是base64编码的图片还是图片的URL。取值约束：BASE64（类型为base64）；FILE(文件)、URL（暂不支持）
  dataType: string;
  // 传入的图片的具体内容，需要与data_type的选择保持一致。
  dataContent?: string;
  // 证件图片
  fileObject?: Readable;
  fileObjectName?: string;
  fileId?: string;
  // 入参data_content是否经AES加密。不填默认不加密。取值约束：0（不加密）；1（加密）
  reqEncType?: string;
  // 出参ocr_info是否经AES加密。不填默认不加密。取值约束：0（不加密）；1（加密）
  respEncType?: string;
  // 经过公钥RSA加密的AES密钥，用于对出参ocr_info加密。当req_enc_type = 1或resp_enc_type = 1时必填。
  encToken?: string;
  // 是否启用防伪检测，如果启用，出参会输出riskInfo字段。不填默认不启用防伪。取值约束：0（不启用）；1（启用）
  riskInfoType?: string;
  // 是否返回身份证头像照片
  // 0：否
  // 1：是
  // 不填默认不返回。
  returnPhoto?: string;
  // 是否返回身份证图片
  // 0：否
  // 1：是
  // 不填默认不返回。
  returnImage?: string;
  // 扩展信息JSON串。
  externParam?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      outOrderNo: 'out_order_no',
      ocrType: 'ocr_type',
      dataType: 'data_type',
      dataContent: 'data_content',
      fileObject: 'fileObject',
      fileObjectName: 'fileObjectName',
      fileId: 'file_id',
      reqEncType: 'req_enc_type',
      respEncType: 'resp_enc_type',
      encToken: 'enc_token',
      riskInfoType: 'risk_info_type',
      returnPhoto: 'return_photo',
      returnImage: 'return_image',
      externParam: 'extern_param',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      outOrderNo: 'string',
      ocrType: 'string',
      dataType: 'string',
      dataContent: 'string',
      fileObject: 'Readable',
      fileObjectName: 'string',
      fileId: 'string',
      reqEncType: 'string',
      respEncType: 'string',
      encToken: 'string',
      riskInfoType: 'string',
      returnPhoto: 'string',
      returnImage: 'string',
      externParam: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RecognizeDocIndividualcardResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回结果码
  retCode?: string;
  // 错误码
  retCodeSub?: string;
  // 错误信息
  retMessageSub?: string;
  // 识别结果，为JSON串。如果入参resp_enc_type=1则是经过AES加密后的JSON串。
  ocrInfo?: string;
  // 防伪结果，为JSON串。如果入参resp_enc_type=1则是经过AES加密后的JSON串。
  // 如果不启用防伪，则不返回该字段。
  riskInfo?: string;
  // 扩展信息JSON串。
  extInfo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      retCode: 'ret_code',
      retCodeSub: 'ret_code_sub',
      retMessageSub: 'ret_message_sub',
      ocrInfo: 'ocr_info',
      riskInfo: 'risk_info',
      extInfo: 'ext_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      retCode: 'string',
      retCodeSub: 'string',
      retMessageSub: 'string',
      ocrInfo: 'string',
      riskInfo: 'string',
      extInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckThreemetaBankcardRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 外部请求ID，由调用方自行生成并自行保证唯一，以便问题定位。
  outerOrderNo: string;
  // 要素入参模式： 1：银行卡号+姓名+证件号 2：银行卡号+姓名+手机号 3：银行卡号+证件号+手机号，默认为1
  metaMode?: string;
  // 银行卡号
  bankCard: string;
  // 姓名
  certName?: string;
  // 身份证号
  certNo?: string;
  // 证件类型： 1：居民身份证（默认值） 2：军官证 3：护照 4：回乡证 5：台胞证 6：警官证 7：士兵证 99：其他
  certType?: string;
  // 手机号码
  mobile?: string;
  // 扩展信息，Map的json格式
  externParam?: string;
  // 入参加密模式：NONE：不加密；AES：姓名、身份证号、手机号码字段都是AES加密后的字符串。非必填，不填时默认明文
  reqEncType?: string;
  // 用于入参加密的AES密钥
  encToken?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      outerOrderNo: 'outer_order_no',
      metaMode: 'meta_mode',
      bankCard: 'bank_card',
      certName: 'cert_name',
      certNo: 'cert_no',
      certType: 'cert_type',
      mobile: 'mobile',
      externParam: 'extern_param',
      reqEncType: 'req_enc_type',
      encToken: 'enc_token',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      outerOrderNo: 'string',
      metaMode: 'string',
      bankCard: 'string',
      certName: 'string',
      certNo: 'string',
      certType: 'string',
      mobile: 'string',
      externParam: 'string',
      reqEncType: 'string',
      encToken: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckThreemetaBankcardResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // true:匹配成功 false：匹配失败
  match?: string;
  // 扩展信息，Map的json格式。
  externInfo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      match: 'match',
      externInfo: 'extern_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      match: 'string',
      externInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDeepsecRiskRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 区分不同应用
  appName: string;
  // app_key
  appKey?: string;
  // 业务数据集合，包括业务数据如zimId，Map<String,String>
  bizData: string;
  // 风险数据集合，包括加密的R风险数据、设备染色数据，Map<String, String>
  riskData: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      appName: 'app_name',
      appKey: 'app_key',
      bizData: 'biz_data',
      riskData: 'risk_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      appName: 'string',
      appKey: 'string',
      bizData: 'string',
      riskData: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDeepsecRiskResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 是否调用成功
  success?: boolean;
  // 业务返回码
  code?: string;
  // message	返回信息
  message?: string;
  // 设备风险标签
  riskInfo?: string;
  // 设备染色风险标签
  dcRisk?: string;
  // 业务风险标签
  bizRisk?: string;
  // 设备元数据
  deviceInfo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      success: 'success',
      code: 'code',
      message: 'message',
      riskInfo: 'risk_info',
      dcRisk: 'dc_risk',
      bizRisk: 'biz_risk',
      deviceInfo: 'device_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      success: 'boolean',
      code: 'string',
      message: 'string',
      riskInfo: 'string',
      dcRisk: 'string',
      bizRisk: 'string',
      deviceInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDeepsecTsbmrqRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 应用来源
  appId?: string;
  // 环境id
  envId?: string;
  // request id
  requestId?: string;
  // 租户
  tenantId: string;
  // 商户id
  merchantId: string;
  // 应用来源名称, 也被用作渠道名称
  appName?: string;
  // 是否测试流量, 测试流量会在处理过程中有特殊处理
  testFlow?: boolean;
  // apdidToken
  apdidToken: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      appId: 'app_id',
      envId: 'env_id',
      requestId: 'request_id',
      tenantId: 'tenant_id',
      merchantId: 'merchant_id',
      appName: 'app_name',
      testFlow: 'test_flow',
      apdidToken: 'apdid_token',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      appId: 'string',
      envId: 'string',
      requestId: 'string',
      tenantId: 'string',
      merchantId: 'string',
      appName: 'string',
      testFlow: 'boolean',
      apdidToken: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDeepsecTsbmrqResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 设备信息
  deviceInfo?: string;
  // 风险信息标签
  riskInfo?: string;
  // 业务message
  message?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      deviceInfo: 'device_info',
      riskInfo: 'risk_info',
      message: 'message',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      deviceInfo: 'string',
      riskInfo: 'string',
      message: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryThreemetaPhonereuseRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 外部请求ID，由调用方自行生成并自行保证唯一，以便问题定位。
  outerOrderNo: string;
  // 手机号「支持加密」
  mobile: string;
  // 日期
  date: string;
  // 运营商类型
  carrier?: string;
  // 加密类型，填写时「支持加密」字段需要对应加密后赋值。默认使用明文模式 0：明文 1：MD5
  encryptType?: string;
  // 扩展参数
  externParam?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      outerOrderNo: 'outer_order_no',
      mobile: 'mobile',
      date: 'date',
      carrier: 'carrier',
      encryptType: 'encrypt_type',
      externParam: 'extern_param',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      outerOrderNo: 'string',
      mobile: 'string',
      date: 'string',
      carrier: 'string',
      encryptType: 'string',
      externParam: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryThreemetaPhonereuseResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 是否二次放号
  phoneReuse?: string;
  // CHINA_TELECOM：中国电信
  // CHINA_MOBILE：中国移动
  // CHINA_UNICOM：中国联通
  carrier?: string;
  // 扩展参数
  externInfo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      phoneReuse: 'phone_reuse',
      carrier: 'carrier',
      externInfo: 'extern_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      phoneReuse: 'string',
      carrier: 'string',
      externInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTscenterDeviceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 设备token
  apdidToken?: string;
  // appname
  appName?: string;
  // app key client
  appKeyClient?: string;
  // app key server
  appKeyServer?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      apdidToken: 'apdid_token',
      appName: 'app_name',
      appKeyClient: 'app_key_client',
      appKeyServer: 'app_key_server',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      apdidToken: 'string',
      appName: 'string',
      appKeyClient: 'string',
      appKeyServer: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTscenterDeviceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 设备信息字符串
  deviceInfo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      deviceInfo: 'device_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      deviceInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryEducationInfoRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 外部请求ID，为32位以内的字母数字组合，由调用方自行生成、保证唯一并留存，以便问题定位。
  outerOrderNo: string;
  // 身份证号
  certNo: string;
  // 姓名
  certName: string;
  // 用户是否授权
  authorized: boolean;
  // 扩展信息，预留字段
  externParam?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      outerOrderNo: 'outer_order_no',
      certNo: 'cert_no',
      certName: 'cert_name',
      authorized: 'authorized',
      externParam: 'extern_param',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      outerOrderNo: 'string',
      certNo: 'string',
      certName: 'string',
      authorized: 'boolean',
      externParam: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryEducationInfoResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 学历信息
  educationInfo?: string;
  // 扩展信息，预留字段
  externInfo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      educationInfo: 'education_info',
      externInfo: 'extern_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      educationInfo: 'string',
      externInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDemoInfoRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // token
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

export class QueryDemoInfoResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // record json
  record?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      record: 'record',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      record: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckBankcardTwometaRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 	外部请求ID，为32位以内的字母数字组合，由调用方自行生成、保证唯一并留存，以便问题定位。
  outerOrderNo: string;
  // 要素入参模式： 1：银行卡号+姓名 2：银行卡号+证件号 3：银行卡号+手机号
  metaMode: string;
  // 证件类型： 1：居民身份证（默认值） 2：军官证 3：护照 4：回乡证 5：台胞证 6：警官证 7：士兵证 99：其他
  certType?: string;
  // 银行卡号
  bankCard: string;
  // 手机号码
  mobile?: string;
  // 姓名
  certName?: string;
  // 证件号
  certNo?: string;
  // 扩展信息，预留字段
  externParam?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      outerOrderNo: 'outer_order_no',
      metaMode: 'meta_mode',
      certType: 'cert_type',
      bankCard: 'bank_card',
      mobile: 'mobile',
      certName: 'cert_name',
      certNo: 'cert_no',
      externParam: 'extern_param',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      outerOrderNo: 'string',
      metaMode: 'string',
      certType: 'string',
      bankCard: 'string',
      mobile: 'string',
      certName: 'string',
      certNo: 'string',
      externParam: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckBankcardTwometaResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 扩展信息，为JSONObject。
  externInfo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      externInfo: 'extern_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      externInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckCarrierTwometaRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 外部请求ID，为32位以内的字母数字组合，由调用方自行生成、保证唯一并留存，以便问题定位。
  outerOrderNo: string;
  // 加密类型，填写时「支持加密」字段需要对应加密后赋值。默认使用明文模式
  // 0：明文
  // 1：MD5
  encryptType?: string;
  // 要素入参模式：
  // 1：手机号+姓名
  // 2：手机号+身份证号
  metaMode: string;
  // 手机号码「支持加密」
  mobile: string;
  // 姓名「支持加密」
  certName?: string;
  // 身份证号「支持加密」
  certNo?: string;
  // 运营商类型：
  // CHINA_TELECOM；
  // CHINA_MOBILE；
  // CHINA_UNICOM
  carrier?: string;
  // 扩展信息，预留字段
  externParam?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      outerOrderNo: 'outer_order_no',
      encryptType: 'encrypt_type',
      metaMode: 'meta_mode',
      mobile: 'mobile',
      certName: 'cert_name',
      certNo: 'cert_no',
      carrier: 'carrier',
      externParam: 'extern_param',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      outerOrderNo: 'string',
      encryptType: 'string',
      metaMode: 'string',
      mobile: 'string',
      certName: 'string',
      certNo: 'string',
      carrier: 'string',
      externParam: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckCarrierTwometaResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 扩展信息，为JSONObject。
  externInfo?: string;
  // 运营商类型： CHINA_TELECOM； CHINA_MOBILE； CHINA_UNICOM
  carrier?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      externInfo: 'extern_info',
      carrier: 'carrier',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      externInfo: 'string',
      carrier: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateNfcServerRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 证件类型，ID_CARD，PASSPORT
  certType: string;
  // 证件号码
  certNo?: string;
  // 证件姓名
  certName?: string;
  // 出生日期
  birthday?: string;
  // 证件有效期
  validateDate?: string;
  // 护照要素录入模式 NONE MANUAL TRANS
  mode?: string;
  // 扩展参数
  // {"syntheticEdoc":"Y"     是否合成证件图"}
  // {"obtainDocPhoto":"Y"    是否获取高清人像"}
  externParam?: string;
  // metainfo 环境参数，需要通过客户端 SDK 获取
  metaInfo: string;
  // 外部唯一标识。用于定位。 值为32位长度的字母数字组合前面...
  outerOrderNo: string;
  // 场景ID
  sceneId: string;
  // 商户自定义的用户ID
  userId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      certType: 'cert_type',
      certNo: 'cert_no',
      certName: 'cert_name',
      birthday: 'birthday',
      validateDate: 'validate_date',
      mode: 'mode',
      externParam: 'extern_param',
      metaInfo: 'meta_info',
      outerOrderNo: 'outer_order_no',
      sceneId: 'scene_id',
      userId: 'user_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      certType: 'string',
      certNo: 'string',
      certName: 'string',
      birthday: 'string',
      validateDate: 'string',
      mode: 'string',
      externParam: 'string',
      metaInfo: 'string',
      outerOrderNo: 'string',
      sceneId: 'string',
      userId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateNfcServerResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 实人认证唯一标识
  certifyId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      certifyId: 'certify_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      certifyId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryNfcServerRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 实人认证唯一标识
  certifyId: string;
  // 预留扩展业务参数
  externParam?: string;
  // 外部唯一标识。用于定位。 值为32位长度的字母数字组合前面...
  outerOrderNo: string;
  // 场景ID
  sceneId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      certifyId: 'certify_id',
      externParam: 'extern_param',
      outerOrderNo: 'outer_order_no',
      sceneId: 'scene_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      certifyId: 'string',
      externParam: 'string',
      outerOrderNo: 'string',
      sceneId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryNfcServerResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 是否通过，通过为T，不通过为F
  passed?: string;
  // 业务失败原因
  reason?: string;
  // 认证主体附件信息，一般的认证场景都是返回空
  materialInfo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      passed: 'passed',
      reason: 'reason',
      materialInfo: 'material_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      passed: 'string',
      reason: 'string',
      materialInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySocialriskDetailRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 请求ID，为32位以内的字母数字组合，由调用方自行生成、保证唯一并留存，以便问题定位和授权抽查。
  outerOrderNo: string;
  // 入参加密模式：
  // NONE：不加密；
  // RSA：RSA加密；
  // SM2：SM2加密。
  encType: string;
  // 姓名（根据enc_type决定加密方式）
  certName: string;
  // 身份证号（根据enc_type决定加密方式）
  certNo: string;
  // 扩展信息，预留字段
  externParam?: string;
  // 	
  // 场景编号
  scene?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      outerOrderNo: 'outer_order_no',
      encType: 'enc_type',
      certName: 'cert_name',
      certNo: 'cert_no',
      externParam: 'extern_param',
      scene: 'scene',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      outerOrderNo: 'string',
      encType: 'string',
      certName: 'string',
      certNo: 'string',
      externParam: 'string',
      scene: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySocialriskDetailResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 风险信息，为JSONObject.
  riskInfo?: string;
  // 扩展信息，预留字段。
  externInfo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      riskInfo: 'risk_info',
      externInfo: 'extern_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      riskInfo: 'string',
      externInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCarrierNetstatusRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 外部请求ID，为32位以内的字母数字组合，由调用方自行生成、保证唯一并留存，以便问题定位。
  outerOrderNo: string;
  // 手机号码「支持加密」
  mobile: string;
  // 运营商类型： CHINA_TELECOM； CHINA_MOBILE； CHINA_UNICOM
  carrier?: string;
  // 加密类型，填写时「支持加密」字段需要对应加密后赋值。默认使用明文模式
  // 0：明文
  // 1：MD5
  encryptType?: string;
  // 扩展信息，预留字段
  externParam?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      outerOrderNo: 'outer_order_no',
      mobile: 'mobile',
      carrier: 'carrier',
      encryptType: 'encrypt_type',
      externParam: 'extern_param',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      outerOrderNo: 'string',
      mobile: 'string',
      carrier: 'string',
      encryptType: 'string',
      externParam: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCarrierNetstatusResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 在网状态结果值
  telNetworkStatus?: string;
  // 运营商类型： CHINA_TELECOM； CHINA_MOBILE； CHINA_UNICOM
  carrier?: string;
  // 扩展信息，为JSONObject。
  // 包含携号转网状态，字段名telNumberTransStatus，字段类型为字符串，字段值示例"1"，描述：1-携号转网 0-未携号转网 2-未知
  externInfo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      telNetworkStatus: 'tel_network_status',
      carrier: 'carrier',
      externInfo: 'extern_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      telNetworkStatus: 'string',
      carrier: 'string',
      externInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySocialriskBriefRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 请求ID，为32位以内的字母数字组合，由调用方自行生成、保证唯一并留存，以便问题定位和授权抽查。
  outerOrderNo: string;
  // 场景编号
  scene?: string;
  // 入参加密模式： NONE：不加密； RSA：RSA加密； SM2：SM2加密。
  encType: string;
  // 	
  // 姓名（根据enc_type决定加密方式）
  certName?: string;
  // 身份证号（根据enc_type决定加密方式）
  certNo: string;
  // 扩展信息，预留字段
  externParam?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      outerOrderNo: 'outer_order_no',
      scene: 'scene',
      encType: 'enc_type',
      certName: 'cert_name',
      certNo: 'cert_no',
      externParam: 'extern_param',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      outerOrderNo: 'string',
      scene: 'string',
      encType: 'string',
      certName: 'string',
      certNo: 'string',
      externParam: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySocialriskBriefResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 风险信息
  riskInfo?: string;
  // 扩展信息，预留字段。
  externInfo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      riskInfo: 'risk_info',
      externInfo: 'extern_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      riskInfo: 'string',
      externInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySocialriskTobriskRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 请求ID，为32位以内的字母数字组合，由调用方自行生成、保证唯一并留存，以便问题定位和授权抽查。
  outerOrderNo: string;
  // 入参加密模式：
  // NONE：不加密；
  // RSA：RSA加密，请使用在示例代码中提供的公钥；
  // SM2：SM2加密，请使用在示例代码中提供的公钥。
  encType: string;
  // 身份证号（根据enc_type决定加密方式）
  certNo: string;
  // 扩展信息，预留字段
  externParam?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      outerOrderNo: 'outer_order_no',
      encType: 'enc_type',
      certNo: 'cert_no',
      externParam: 'extern_param',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      outerOrderNo: 'string',
      encType: 'string',
      certNo: 'string',
      externParam: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySocialriskTobriskResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 风险信息，为JSONObject
  riskInfo?: string;
  // STRING	扩展信息，预留字段。
  externInfo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      riskInfo: 'risk_info',
      externInfo: 'extern_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      riskInfo: 'string',
      externInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecFacevrfServermodeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 真实姓名
  certName?: string;
  // 证件号码
  certNo?: string;
  // cert_name、cert_no两个字段的传入模式0：明文1：密文
  encType?: string;
  // 证件类型，如身份证
  certType?: string;
  // 预留扩展参数
  externParam?: string;
  // 自定义比对源人脸图像，base64编码格式
  facialPictureRef?: string;
  // 身份信息来源类型，如证件
  identityType: string;
  // 外部唯一标识。用于定位。 值为32位长度的字母数字组合前面几位字符是商户自定义的简称，中间可以使用一段时间，后段可以使用一个随机或递增序列
  outerOrderNo: string;
  // 场景ID
  sceneId: string;
  // 商户自定义的用户ID
  userId?: string;
  // 用户的IP
  userIp?: string;
  // 用户的手机号（或其哈希值）
  userMobile?: string;
  // 待认证的人脸图像，base64编码格式
  facialPictureAuth?: string;
  // 视频文件
  fileObject?: Readable;
  fileObjectName?: string;
  fileId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      certName: 'cert_name',
      certNo: 'cert_no',
      encType: 'enc_type',
      certType: 'cert_type',
      externParam: 'extern_param',
      facialPictureRef: 'facial_picture_ref',
      identityType: 'identity_type',
      outerOrderNo: 'outer_order_no',
      sceneId: 'scene_id',
      userId: 'user_id',
      userIp: 'user_ip',
      userMobile: 'user_mobile',
      facialPictureAuth: 'facial_picture_auth',
      fileObject: 'fileObject',
      fileObjectName: 'fileObjectName',
      fileId: 'file_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      certName: 'string',
      certNo: 'string',
      encType: 'string',
      certType: 'string',
      externParam: 'string',
      facialPictureRef: 'string',
      identityType: 'string',
      outerOrderNo: 'string',
      sceneId: 'string',
      userId: 'string',
      userIp: 'string',
      userMobile: 'string',
      facialPictureAuth: 'string',
      fileObject: 'Readable',
      fileObjectName: 'string',
      fileId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecFacevrfServermodeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 认证ID
  certifyId?: string;
  // 是否通过，通过为T，不通过为F
  passed?: string;
  // 业务失败原因
  reason?: string;
  // 认证主体附件信息，包含共计类型等
  materialInfo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      certifyId: 'certify_id',
      passed: 'passed',
      reason: 'reason',
      materialInfo: 'material_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      certifyId: 'string',
      passed: 'string',
      reason: 'string',
      materialInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBankLivenessRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 请求ID
  outerOrderNo: string;
  // 加密方式
  encryptType: string;
  // 身份证号
  certNo: string;
  // 银行编码
  bankCode: string;
  // 1=借记卡+贷记卡（默认）；2=借记卡
  bankCardType?: string;
  // 姓名
  certName?: string;
  // 手机号码	
  mobile?: string;
  // 扩展信息，预留字段
  externParam?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      outerOrderNo: 'outer_order_no',
      encryptType: 'encrypt_type',
      certNo: 'cert_no',
      bankCode: 'bank_code',
      bankCardType: 'bank_card_type',
      certName: 'cert_name',
      mobile: 'mobile',
      externParam: 'extern_param',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      outerOrderNo: 'string',
      encryptType: 'string',
      certNo: 'string',
      bankCode: 'string',
      bankCardType: 'string',
      certName: 'string',
      mobile: 'string',
      externParam: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBankLivenessResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 银行活跃度详情，可解析为JSONArray。
  livenessInfo?: string;
  // 扩展信息，预留字段
  externInfo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      livenessInfo: 'liveness_info',
      externInfo: 'extern_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      livenessInfo: 'string',
      externInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateConsoleDomainRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 场景id
  sceneId: string;
  // 用于排查问题
  bizId: string;
  // 客户填自己需要绑定的小程序名称
  miniProgramName: string;
  // 所属平台，微信、支付宝
  platform: string;
  // 校验文件的名称
  checkFileName: string;
  // 填校验文件里面的内容
  checkFileBody: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      sceneId: 'scene_id',
      bizId: 'biz_id',
      miniProgramName: 'mini_program_name',
      platform: 'platform',
      checkFileName: 'check_file_name',
      checkFileBody: 'check_file_body',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      sceneId: 'string',
      bizId: 'string',
      miniProgramName: 'string',
      platform: 'string',
      checkFileName: 'string',
      checkFileBody: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateConsoleDomainResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回绑定的域名
  domain?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      domain: 'domain',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      domain: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteConsoleDomainRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 控制台场景id
  sceneId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      sceneId: 'scene_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      sceneId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteConsoleDomainResponse extends $tea.Model {
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

export class InitCarrierRepairmobileRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 请求ID，为32位以内的字母数字组合，由调用方自行生成、保证唯一并留存，以便问题定位和授权核查。
  outerOrderNo: string;
  // 流程ID，为32位以内的字母数字组合，由调用方自行生成、保证唯一并留存，用于流程串联。
  processId: string;
  // 运营商类型，取值如下：
  // CHINA_TELECOM：中国电信
  // CHINA_MOBILE：中国移动
  // CHINA_UNICOM：中国联通
  carrier: string;
  // 入参加密模式：
  // "0"（默认值）：不加密；
  // "2"：身份证号、曾用手机号字段都需填写SHA256加密后的字符串。
  // 默认未"0"
  encryptType?: string;
  // 失联修复身份证号，使用入参加密模式加密
  certNo: string;
  // 用户姓名，明文
  name: string;
  // 曾用手机号码，使用入参加密模式加密
  mobile?: string;
  // 场景值
  scene?: string;
  // 扩展信息，预留字段
  externParam?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      outerOrderNo: 'outer_order_no',
      processId: 'process_id',
      carrier: 'carrier',
      encryptType: 'encrypt_type',
      certNo: 'cert_no',
      name: 'name',
      mobile: 'mobile',
      scene: 'scene',
      externParam: 'extern_param',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      outerOrderNo: 'string',
      processId: 'string',
      carrier: 'string',
      encryptType: 'string',
      certNo: 'string',
      name: 'string',
      mobile: 'string',
      scene: 'string',
      externParam: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class InitCarrierRepairmobileResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 流程ID，和客户入参的process_id一致
  processId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      processId: 'process_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      processId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCarrierRepairmobileRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 请求ID，为32位以内的字母数字组合，由调用方自行生成、保证唯一并留存，以便问题定位和授权核查。
  outerOrderNo: string;
  // 失联修复初始化的流程ID
  processId: string;
  // 场景值
  scene?: string;
  // 扩展信息，预留字段
  externParam?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      outerOrderNo: 'outer_order_no',
      processId: 'process_id',
      scene: 'scene',
      externParam: 'extern_param',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      outerOrderNo: 'string',
      processId: 'string',
      scene: 'string',
      externParam: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCarrierRepairmobileResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 失联人手机号修复数量
  count?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      count: 'count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      count: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BindCarrierRepairmobileRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 请求ID，为32位以内的字母数字组合，由调用方自行生成、保证唯一并留存，以便问题定位和授权核查。
  outerOrderNo: string;
  // 失联修复初始化的流程ID
  processId: string;
  // 身份证号，和失联修复初始化接口身份证号加密方式保持一致
  certNo: string;
  // 修复的手机号排序，例如绑定第一个修复手机号填入1
  mobileNum: string;
  // 主叫号码
  mobileA: string;
  // 主叫类型1-手机号码 2-固话
  // 默认为1
  mobileType?: string;
  // 场景值
  scene?: string;
  // 扩展信息，预留字段
  externParam?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      outerOrderNo: 'outer_order_no',
      processId: 'process_id',
      certNo: 'cert_no',
      mobileNum: 'mobile_num',
      mobileA: 'mobile_a',
      mobileType: 'mobile_type',
      scene: 'scene',
      externParam: 'extern_param',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      outerOrderNo: 'string',
      processId: 'string',
      certNo: 'string',
      mobileNum: 'string',
      mobileA: 'string',
      mobileType: 'string',
      scene: 'string',
      externParam: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BindCarrierRepairmobileResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 小号（实际拨打返回的虚拟小号）
  mobileX?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      mobileX: 'mobile_x',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      mobileX: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyExtOrgdataRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 请求ID，为32位以内的字母数字组合，由调用方自行生成、保证唯一并留存，以便问题定位和授权核查。
  outerOrderNo: string;
  // 是	入参加密模式：
  // "0"（默认值）：不加密；
  // "4"：RSA加密
  encryptType: string;
  // 星火保
  orgName: string;
  // 外部机构数据类型，取值如下： AXINSUR_BANK_LIVENESS：星火保蚂蚁推荐卡
  dataType: string;
  // 机构上报数据，json数组
  dataContent: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      outerOrderNo: 'outer_order_no',
      encryptType: 'encrypt_type',
      orgName: 'org_name',
      dataType: 'data_type',
      dataContent: 'data_content',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      outerOrderNo: 'string',
      encryptType: 'string',
      orgName: 'string',
      dataType: 'string',
      dataContent: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyExtOrgdataResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 上报结果
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

export class CreateFaceverifyServerRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 外部唯一标识。用于定位。 值为32位长度的字母数字组合前面几位字符是商户自定义的简称，中间可以使用一段时间，后段可以使用一个随机或递增序列
  outerOrderNo: string;
  // 认证模式码
  bizCode: string;
  // 场景ID
  sceneId: string;
  // 身份信息来源类型，如证件
  identityType: string;
  // 证件类型，如身份证
  certType?: string;
  // 真实姓名
  certName?: string;
  // 证件号码
  certNo?: string;
  // h5认证完成后，服务端回调此地址通知商户认证结果
  callbackUrl?: string;
  // cert_name、cert_no两个字段的传入模式。0：明文1：密文
  encType?: string;
  // 预留扩展参数
  externParam?: string;
  // 自定义比对源人脸图像，base64编码格式
  facialPictureRef?: string;
  // metainfo 环境参数，需要通过客户端 SDK 获取
  metaInfo?: string;
  // 回跳地址
  returnUrl?: string;
  // 商户自定义的用户ID
  userId?: string;
  // 用户的IP
  userIp?: string;
  // 用户的手机号
  userMobile?: string;
  // callbackUrl回调时是否需要重试，默认false(不需要重试)
  callbackNeedRetry?: string;
  // 活体检测的类型
  model?: string;
  // 图片文件
  fileObject?: Readable;
  fileObjectName?: string;
  fileId?: string;
  // 图片的传入加密模式
  // 0：明文
  // 1：AES加密
  materialEncType?: string;
  // 公钥加密后的密钥，用于传入的加密图片/视频
  materialEncToken?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      outerOrderNo: 'outer_order_no',
      bizCode: 'biz_code',
      sceneId: 'scene_id',
      identityType: 'identity_type',
      certType: 'cert_type',
      certName: 'cert_name',
      certNo: 'cert_no',
      callbackUrl: 'callback_url',
      encType: 'enc_type',
      externParam: 'extern_param',
      facialPictureRef: 'facial_picture_ref',
      metaInfo: 'meta_info',
      returnUrl: 'return_url',
      userId: 'user_id',
      userIp: 'user_ip',
      userMobile: 'user_mobile',
      callbackNeedRetry: 'callback_need_retry',
      model: 'model',
      fileObject: 'fileObject',
      fileObjectName: 'fileObjectName',
      fileId: 'file_id',
      materialEncType: 'material_enc_type',
      materialEncToken: 'material_enc_token',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      outerOrderNo: 'string',
      bizCode: 'string',
      sceneId: 'string',
      identityType: 'string',
      certType: 'string',
      certName: 'string',
      certNo: 'string',
      callbackUrl: 'string',
      encType: 'string',
      externParam: 'string',
      facialPictureRef: 'string',
      metaInfo: 'string',
      returnUrl: 'string',
      userId: 'string',
      userIp: 'string',
      userMobile: 'string',
      callbackNeedRetry: 'string',
      model: 'string',
      fileObject: 'Readable',
      fileObjectName: 'string',
      fileId: 'string',
      materialEncType: 'string',
      materialEncToken: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateFaceverifyServerResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 实人认证唯一标识
  certifyId?: string;
  // 认证地址。只在特定场景返回。
  certifyUrl?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      certifyId: 'certify_id',
      certifyUrl: 'certify_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      certifyId: 'string',
      certifyUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryFaceverifyServerRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 实人认证唯一标识
  certifyId: string;
  // 外部唯一标识。用于定位。 值为32位长度的字母数字组合前面几位字符是商户自定义的简称，中间可以使用一段时间，后段可以使用一个随机或递增序列
  outerOrderNo: string;
  // 场景ID
  sceneId: string;
  // 预留扩展业务参数
  externParam?: string;
  // 认证材料（如人脸图像）的哈希
  materialHash?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      certifyId: 'certify_id',
      outerOrderNo: 'outer_order_no',
      sceneId: 'scene_id',
      externParam: 'extern_param',
      materialHash: 'material_hash',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      certifyId: 'string',
      outerOrderNo: 'string',
      sceneId: 'string',
      externParam: 'string',
      materialHash: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryFaceverifyServerResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 认证的主体信息，一般的认证场景返回为空
  identityInfo?: string;
  // 认证主体附件信息，一般的认证场景都是返回空
  materialInfo?: string;
  // 认证材料哈希是否匹配
  materialMatched?: string;
  // 是否通过，通过为T，不通过为F
  passed?: string;
  // 业务失败原因
  reason?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      identityInfo: 'identity_info',
      materialInfo: 'material_info',
      materialMatched: 'material_matched',
      passed: 'passed',
      reason: 'reason',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      identityInfo: 'string',
      materialInfo: 'string',
      materialMatched: 'string',
      passed: 'string',
      reason: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBankLivenessplusRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 请求ID
  outerOrderNo: string;
  // 加密方式
  encryptType: string;
  // 身份证号
  certNo: string;
  // 银行编码
  bankCode: string;
  // 1=借记卡+贷记卡（默认）；2=借记卡
  bankCardType?: string;
  // 姓名
  certName?: string;
  // 手机号码
  mobile?: string;
  // 扩展信息，预留字段
  externParam?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      outerOrderNo: 'outer_order_no',
      encryptType: 'encrypt_type',
      certNo: 'cert_no',
      bankCode: 'bank_code',
      bankCardType: 'bank_card_type',
      certName: 'cert_name',
      mobile: 'mobile',
      externParam: 'extern_param',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      outerOrderNo: 'string',
      encryptType: 'string',
      certNo: 'string',
      bankCode: 'string',
      bankCardType: 'string',
      certName: 'string',
      mobile: 'string',
      externParam: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBankLivenessplusResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 银行活跃度详情，可解析为JSONArray。
  livenessInfo?: string;
  // 扩展信息，预留字段
  externInfo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      livenessInfo: 'liveness_info',
      externInfo: 'extern_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      livenessInfo: 'string',
      externInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecFaceverifyServermodeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 真实姓名
  certName?: string;
  // 证件号码
  certNo?: string;
  // cert_name、cert_no两个字段的传入模式0：明文 1：密文
  encType?: string;
  // 证件类型，如身份证
  certType?: string;
  // 预留扩展参数
  externParam?: string;
  // 自定义比对源人脸图像，base64编码格式
  facialPictureRef?: string;
  // 身份信息来源类型，如证件
  identityType: string;
  // 外部唯一标识。用于定位。 值为32位长度的字母数字组合前面几位字符是商户自定义的简称，中间可以使用一段时间，后段可以使用一个随机或递增序列
  outerOrderNo: string;
  // 场景ID
  sceneId: string;
  // 商户自定义的用户ID
  userId?: string;
  // 用户的IP
  userIp?: string;
  // 用户的手机号（或其哈希值）
  userMobile?: string;
  // 待认证的人脸图像，base64编码格式
  facialPictureAuth?: string;
  // 视频文件
  fileObject?: Readable;
  fileObjectName?: string;
  fileId?: string;
  // 图片的传入加密模式 0：明文 1：AES加密
  materialEncType?: string;
  // 公钥加密后的密钥，用于传入的加密图片/视频
  materialEncToken?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      certName: 'cert_name',
      certNo: 'cert_no',
      encType: 'enc_type',
      certType: 'cert_type',
      externParam: 'extern_param',
      facialPictureRef: 'facial_picture_ref',
      identityType: 'identity_type',
      outerOrderNo: 'outer_order_no',
      sceneId: 'scene_id',
      userId: 'user_id',
      userIp: 'user_ip',
      userMobile: 'user_mobile',
      facialPictureAuth: 'facial_picture_auth',
      fileObject: 'fileObject',
      fileObjectName: 'fileObjectName',
      fileId: 'file_id',
      materialEncType: 'material_enc_type',
      materialEncToken: 'material_enc_token',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      certName: 'string',
      certNo: 'string',
      encType: 'string',
      certType: 'string',
      externParam: 'string',
      facialPictureRef: 'string',
      identityType: 'string',
      outerOrderNo: 'string',
      sceneId: 'string',
      userId: 'string',
      userIp: 'string',
      userMobile: 'string',
      facialPictureAuth: 'string',
      fileObject: 'Readable',
      fileObjectName: 'string',
      fileId: 'string',
      materialEncType: 'string',
      materialEncToken: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecFaceverifyServermodeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 认证ID
  certifyId?: string;
  // 是否通过，通过为T，不通过为F
  passed?: string;
  // 业务失败原因
  reason?: string;
  // 认证主体附件信息，包含共计类型等
  materialInfo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      certifyId: 'certify_id',
      passed: 'passed',
      reason: 'reason',
      materialInfo: 'material_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      certifyId: 'string',
      passed: 'string',
      reason: 'string',
      materialInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateAlipayverifyServerRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 外部唯一标识。用于定位。 值为32位长度的字母数字组合前面几位字符是商户自定义的简称，中间可以使用一段时间，后段可以使用一个随机或递增序列
  outerOrderNo: string;
  // 认证模式码
  bizCode: string;
  // 场景ID
  sceneId: string;
  // 身份信息来源类型，如证件
  identityType: string;
  // 证件类型，如身份证
  certType: string;
  // 真实姓名
  certName: string;
  // 证件号码
  certNo: string;
  // h5认证完成后，服务端回调此地址通知商户认证结果
  callbackUrl?: string;
  // cert_name、cert_no两个字段的传入模式。0：明文1：密文
  encType?: string;
  // 预留扩展参数
  externParam?: string;
  // 自定义比对源人脸图像，base64编码格式
  facialPictureRef?: string;
  // metainfo 环境参数，需要通过客户端 SDK 获取
  metaInfo?: string;
  // 回跳地址
  returnUrl?: string;
  // 商户自定义的用户ID
  userId?: string;
  // 用户的IP
  userIp?: string;
  // 用户的手机号
  userMobile?: string;
  // callbackUrl回调时是否需要重试，默认false(不需要重试)
  callbackNeedRetry?: string;
  // 活体检测的类型
  model?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      outerOrderNo: 'outer_order_no',
      bizCode: 'biz_code',
      sceneId: 'scene_id',
      identityType: 'identity_type',
      certType: 'cert_type',
      certName: 'cert_name',
      certNo: 'cert_no',
      callbackUrl: 'callback_url',
      encType: 'enc_type',
      externParam: 'extern_param',
      facialPictureRef: 'facial_picture_ref',
      metaInfo: 'meta_info',
      returnUrl: 'return_url',
      userId: 'user_id',
      userIp: 'user_ip',
      userMobile: 'user_mobile',
      callbackNeedRetry: 'callback_need_retry',
      model: 'model',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      outerOrderNo: 'string',
      bizCode: 'string',
      sceneId: 'string',
      identityType: 'string',
      certType: 'string',
      certName: 'string',
      certNo: 'string',
      callbackUrl: 'string',
      encType: 'string',
      externParam: 'string',
      facialPictureRef: 'string',
      metaInfo: 'string',
      returnUrl: 'string',
      userId: 'string',
      userIp: 'string',
      userMobile: 'string',
      callbackNeedRetry: 'string',
      model: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateAlipayverifyServerResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 实人认证唯一标识
  certifyId?: string;
  // 认证地址。只在特定场景返回。
  certifyUrl?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      certifyId: 'certify_id',
      certifyUrl: 'certify_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      certifyId: 'string',
      certifyUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAlipayverifyServerRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 实人认证唯一标识
  certifyId: string;
  // 外部唯一标识。用于定位。 值为32位长度的字母数字组合前面几位字符是商户自定义的简称，中间可以使用一段时间，后段可以使用一个随机或递增序列
  outerOrderNo: string;
  // 场景ID
  sceneId: string;
  // 预留扩展业务参数
  externParam?: string;
  // 认证材料（如人脸图像）的哈希
  materialHash?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      certifyId: 'certify_id',
      outerOrderNo: 'outer_order_no',
      sceneId: 'scene_id',
      externParam: 'extern_param',
      materialHash: 'material_hash',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      certifyId: 'string',
      outerOrderNo: 'string',
      sceneId: 'string',
      externParam: 'string',
      materialHash: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAlipayverifyServerResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 认证的主体信息，一般的认证场景返回为空
  identityInfo?: string;
  // 认证主体附件信息，一般的认证场景都是返回空
  materialInfo?: string;
  // 是否通过，通过为T，不通过为F
  materialMatched?: string;
  // 是否通过，通过为T，不通过为F
  passed?: string;
  // 业务失败原因
  reason?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      identityInfo: 'identity_info',
      materialInfo: 'material_info',
      materialMatched: 'material_matched',
      passed: 'passed',
      reason: 'reason',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      identityInfo: 'string',
      materialInfo: 'string',
      materialMatched: 'string',
      passed: 'string',
      reason: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckCarTwometaRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 请求ID，为32位以内的字母数字组合，由调用方自行生成、保证唯一并留存，以便问题定位和授权核查。
  outerOrderNo: string;
  // 入参加密模式：
  // "0"：不加密；
  encryptType: string;
  // 车牌号
  licensePlate: string;
  // 姓名
  certName: string;
  // 扩展信息，预留字段
  externParam?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      outerOrderNo: 'outer_order_no',
      encryptType: 'encrypt_type',
      licensePlate: 'license_plate',
      certName: 'cert_name',
      externParam: 'extern_param',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      outerOrderNo: 'string',
      encryptType: 'string',
      licensePlate: 'string',
      certName: 'string',
      externParam: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckCarTwometaResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 扩展信息，为JSONObject。
  externInfo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      externInfo: 'extern_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      externInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryEducationBackgroundRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 请求ID，为32位以内的字母数字组合，由调用方自行生成、保证唯一并留存，以便问题定位和授权核查。
  outerOrderNo: string;
  // 入参加密模式：
  // "0"：不加密；
  encryptType: string;
  // 身份证号
  certNo: string;
  // 手机号码
  mobile?: string;
  // 姓名
  certName: string;
  // 扩展信息，预留字段
  externParam?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      outerOrderNo: 'outer_order_no',
      encryptType: 'encrypt_type',
      certNo: 'cert_no',
      mobile: 'mobile',
      certName: 'cert_name',
      externParam: 'extern_param',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      outerOrderNo: 'string',
      encryptType: 'string',
      certNo: 'string',
      mobile: 'string',
      certName: 'string',
      externParam: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryEducationBackgroundResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 学历信息，仅当结果码为OK时返回。学历信息字段为一JSONArray。
  educationInfo?: string;
  // 扩展信息，预留字段。
  externInfo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      educationInfo: 'education_info',
      externInfo: 'extern_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      educationInfo: 'string',
      externInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBankLivenessfourRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 请求ID
  outerOrderNo: string;
  // 加密方式
  encryptType: string;
  // 身份证号
  certNo: string;
  // 银行编码
  bankCode: string;
  // bank_card_type
  // 1：借记卡+贷记卡（默认）；
  // 2：借记卡
  // 3：贷记卡
  bankCardType?: string;
  // 姓名
  certName?: string;
  // 手机号码
  mobile?: string;
  // 扩展信息，预留字段
  externParam?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      outerOrderNo: 'outer_order_no',
      encryptType: 'encrypt_type',
      certNo: 'cert_no',
      bankCode: 'bank_code',
      bankCardType: 'bank_card_type',
      certName: 'cert_name',
      mobile: 'mobile',
      externParam: 'extern_param',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      outerOrderNo: 'string',
      encryptType: 'string',
      certNo: 'string',
      bankCode: 'string',
      bankCardType: 'string',
      certName: 'string',
      mobile: 'string',
      externParam: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBankLivenessfourResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 银行活跃度详情，可解析为JSONArray。
  livenessInfo?: string;
  // 扩展信息，预留字段
  externInfo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      livenessInfo: 'liveness_info',
      externInfo: 'extern_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      livenessInfo: 'string',
      externInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryFaceverifyServermaterialRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 实人认证唯一标识
  certifyId: string;
  // 外部唯一标识。用于定位。 值为32位长度的字母数字组合前面几位字符是商户自定义的简称，中间可以使用一段时间，后段可以使用一个随机或递增序列
  outerOrderNo: string;
  // 场景ID
  sceneId: string;
  // 预留扩展业务参数
  externParam?: string;
  // 图片的传入加密模式 0：明文 1：AES加密
  materialEncType?: string;
  // 公钥加密后的密钥，用于传入的加密图片/视频
  materialEncToken?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      certifyId: 'certify_id',
      outerOrderNo: 'outer_order_no',
      sceneId: 'scene_id',
      externParam: 'extern_param',
      materialEncType: 'material_enc_type',
      materialEncToken: 'material_enc_token',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      certifyId: 'string',
      outerOrderNo: 'string',
      sceneId: 'string',
      externParam: 'string',
      materialEncType: 'string',
      materialEncToken: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryFaceverifyServermaterialResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 认证主体附件信息
  materialInfo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      materialInfo: 'material_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      materialInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ScaleinImageRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 图片
  fileObject?: Readable;
  fileObjectName?: string;
  fileId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      fileObject: 'fileObject',
      fileObjectName: 'fileObjectName',
      fileId: 'file_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      fileObject: 'Readable',
      fileObjectName: 'string',
      fileId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ScaleinImageResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 压缩后的图片base64
  base64?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      base64: 'base64',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      base64: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RecognizeOcrIndividualcardRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 长度不超过32位的0-9A-Za-z字符串。 外部请求ID，由调用方自行生成并自行保证唯一，以便问题定位。
  outerOrderNo: string;
  // 待识别的卡类型。取值约束：ID_CARD（身份证）;EEP_TO_ML_CARD（港澳来往大陆通行证）;BANK_CARD（银行卡）
  ocrType: string;
  // 传入的图片是base64编码的图片还是图片的URL。取值约束：BASE64（类型为base64）；FILE(文件)、URL（暂不支持）
  dataType: string;
  // 传入的图片的具体内容，需要与data_type的选择保持一致。
  // 
  dataContent?: string;
  // 证件图片
  fileObject?: Readable;
  fileObjectName?: string;
  fileId?: string;
  // 入参data_content是否经AES加密。不填默认不加密。取值约束：0（不加密）；1（加密）
  reqEncType?: string;
  // 出参ocr_info是否经AES加密。不填默认不加密。取值约束：0（不加密）；1（加密）
  respEncType?: string;
  // 经过公钥RSA加密的AES密钥，用于对出参ocr_info加密。当req_enc_type = 1或resp_enc_type = 1时必填。
  encToken?: string;
  // 是否启用防伪检测，如果启用，出参会输出riskInfo字段。不填默认不启用防伪。取值约束：0（不启用）；1（启用）
  riskInfoType?: string;
  // 是否返回身份证头像照片 0：否 1：是 不填默认不返回。
  returnPhoto?: string;
  // 是否返回身份证图片 0：否 1：是 不填默认不返回。
  returnImage?: string;
  // 扩展信息JSON串。
  externParam?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      outerOrderNo: 'outer_order_no',
      ocrType: 'ocr_type',
      dataType: 'data_type',
      dataContent: 'data_content',
      fileObject: 'fileObject',
      fileObjectName: 'fileObjectName',
      fileId: 'file_id',
      reqEncType: 'req_enc_type',
      respEncType: 'resp_enc_type',
      encToken: 'enc_token',
      riskInfoType: 'risk_info_type',
      returnPhoto: 'return_photo',
      returnImage: 'return_image',
      externParam: 'extern_param',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      outerOrderNo: 'string',
      ocrType: 'string',
      dataType: 'string',
      dataContent: 'string',
      fileObject: 'Readable',
      fileObjectName: 'string',
      fileId: 'string',
      reqEncType: 'string',
      respEncType: 'string',
      encToken: 'string',
      riskInfoType: 'string',
      returnPhoto: 'string',
      returnImage: 'string',
      externParam: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RecognizeOcrIndividualcardResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 识别结果，为JSON串。如果入参resp_enc_type=1则是经过AES加密后的JSON串。
  ocrInfo?: OcrInfo;
  // 防伪结果，为JSON串。如果入参resp_enc_type=1则是经过AES加密后的JSON串。 如果不启用防伪，则不返回该字段。
  riskInfo?: RiskInfo;
  // 扩展信息JSON串。
  extInfo?: string;
  // 加密后的识别结果
  ocrInfoEncrypt?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      ocrInfo: 'ocr_info',
      riskInfo: 'risk_info',
      extInfo: 'ext_info',
      ocrInfoEncrypt: 'ocr_info_encrypt',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      ocrInfo: OcrInfo,
      riskInfo: RiskInfo,
      extInfo: 'string',
      ocrInfoEncrypt: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckIdcardFourmetaRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 外部唯一标识。用于定位。 值为32位长度的字母数字组合前面几位字符是商户自定义的简称，中间可以使用一段时间，后段可以使用一个随机或递增序列
  outerOrderNo: string;
  // 姓名
  certName: string;
  // 身份证号码
  certNo: string;
  // 开始时间，yyyyMMdd格式的注册日期。
  beginDate: string;
  // 失效时间，yyyyMMdd格式的注册日期。(长期有效
  // 身份证填 8 个 0))
  expiryDate: string;
  // map结果的json数据格式，预留字段
  externParam?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      outerOrderNo: 'outer_order_no',
      certName: 'cert_name',
      certNo: 'cert_no',
      beginDate: 'begin_date',
      expiryDate: 'expiry_date',
      externParam: 'extern_param',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      outerOrderNo: 'string',
      certName: 'string',
      certNo: 'string',
      beginDate: 'string',
      expiryDate: 'string',
      externParam: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckIdcardFourmetaResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // true:匹配成功 false：匹配失败
  match?: string;
  // 扩展信息，预留字段
  externInfo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      match: 'match',
      externInfo: 'extern_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      match: 'string',
      externInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCarinfoDetailRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // vin码
  vin: string;
  // 扩展信息，预留字段
  externParam?: string;
  // 请求ID，为32位以内的字母数字组合，由调用方自行生成、保证唯一并留存，以便问题定位和授权核查。	
  outerOrderNo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      vin: 'vin',
      externParam: 'extern_param',
      outerOrderNo: 'outer_order_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      vin: 'string',
      externParam: 'string',
      outerOrderNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCarinfoDetailResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 扩展信息，为JSONObject。
  externInfo?: string;
  // 车辆信息
  carInfo?: CarInfoDetail;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      externInfo: 'extern_info',
      carInfo: 'car_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      externInfo: 'string',
      carInfo: CarInfoDetail,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCarinfoBriefRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // extern_param
  vin: string;
  // 请求ID，为32位以内的字母数字组合，由调用方自行生成、保证唯一并留存，以便问题定位和授权核查。
  outerOrderNo: string;
  // 扩展信息，预留字段
  externParam?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      vin: 'vin',
      outerOrderNo: 'outer_order_no',
      externParam: 'extern_param',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      vin: 'string',
      outerOrderNo: 'string',
      externParam: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCarinfoBriefResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 扩展信息，为JSONObject。
  externInfo?: string;
  // 车辆信息
  carInfo?: CarInfoBrief;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      externInfo: 'extern_info',
      carInfo: 'car_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      externInfo: 'string',
      carInfo: CarInfoBrief,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BindCutpaymentPreRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 请求ID，为32位以内的字母数字组合，由调用方自行生成、保证唯一并留存，以便问题定位和授权核查。
  outerOrderNo: string;
  // 入参加密模式：
  // "0"（默认值）：不加密；
  // "6"：AES加密
  // 默认为"0"
  encryptType?: string;
  // 加密密钥
  encryptToken?: string;
  // 用户id
  userId: string;
  // 银行卡类型
  // 0：借记卡
  // 1：信用卡
  cardType: string;
  // 银行卡属性
  // 0私人，1公司。不填时，默认为私人0
  cardPro?: string;
  // 银行卡卡号
  cardNo: string;
  // 证件类型
  // 0：身份证
  // 1：港澳居民居住证
  // 2：台湾居民居住证
  // 3：外国人永久居住证
  idCardType: string;
  // 持卡人姓名
  certName: string;
  // 证件号
  certNo: string;
  // 手机号
  mobile: string;
  // 银行卡安全码
  securityCode?: string;
  // 银行卡有期（格式为：YYMM）
  validDate?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      outerOrderNo: 'outer_order_no',
      encryptType: 'encrypt_type',
      encryptToken: 'encrypt_token',
      userId: 'user_id',
      cardType: 'card_type',
      cardPro: 'card_pro',
      cardNo: 'card_no',
      idCardType: 'id_card_type',
      certName: 'cert_name',
      certNo: 'cert_no',
      mobile: 'mobile',
      securityCode: 'security_code',
      validDate: 'valid_date',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      outerOrderNo: 'string',
      encryptType: 'string',
      encryptToken: 'string',
      userId: 'string',
      cardType: 'string',
      cardPro: 'string',
      cardNo: 'string',
      idCardType: 'string',
      certName: 'string',
      certNo: 'string',
      mobile: 'string',
      securityCode: 'string',
      validDate: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BindCutpaymentPreResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 预签约唯一码
  preBindSn?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      preBindSn: 'pre_bind_sn',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      preBindSn: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BindCutpaymentSignRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 请求ID，为32位以内的字母数字组合，由调用方自行生成、保证唯一并留存，以便问题定位和授权核查。
  outerOrderNo: string;
  // 入参加密模式：
  // "0"（默认值）：不加密；
  // "6"：AES加密
  // 默认为"0"
  encryptType?: string;
  // 加密密钥
  encryptToken?: string;
  // 用户id
  userId: string;
  // 预签约返回的预签约唯一码
  preBindSn: string;
  // 签约短信验证码
  smsCode: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      outerOrderNo: 'outer_order_no',
      encryptType: 'encrypt_type',
      encryptToken: 'encrypt_token',
      userId: 'user_id',
      preBindSn: 'pre_bind_sn',
      smsCode: 'sms_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      outerOrderNo: 'string',
      encryptType: 'string',
      encryptToken: 'string',
      userId: 'string',
      preBindSn: 'string',
      smsCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BindCutpaymentSignResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 签约协议号
  protocolNo?: string;
  // 签约流水号
  signBindSn?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      protocolNo: 'protocol_no',
      signBindSn: 'sign_bind_sn',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      protocolNo: 'string',
      signBindSn: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UnbindCutpaymentSignRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 请求ID，为32位以内的字母数字组合，由调用方自行生成、保证唯一并留存，以便问题定位和授权核查。
  outerOrderNo: string;
  // 入参加密模式：
  // "0"（默认值）：不加密；
  // "6"：AES加密
  // 默认为"0"
  encryptType?: string;
  // 加密密钥
  encryptToken?: string;
  // 用户在商户平台唯一ID
  userId: string;
  // 签约协议号
  protocolNo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      outerOrderNo: 'outer_order_no',
      encryptType: 'encrypt_type',
      encryptToken: 'encrypt_token',
      userId: 'user_id',
      protocolNo: 'protocol_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      outerOrderNo: 'string',
      encryptType: 'string',
      encryptToken: 'string',
      userId: 'string',
      protocolNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UnbindCutpaymentSignResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 解绑流水号
  unbindSn?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      unbindSn: 'unbind_sn',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      unbindSn: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCutpaymentBindRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 请求ID，为32位以内的字母数字组合，由调用方自行生成、保证唯一并留存，以便问题定位和授权核查。
  outerOrderNo: string;
  // 入参加密模式：
  // "0"（默认值）：不加密；
  // "6"：AES加密
  // 默认为"0"
  encryptType?: string;
  // 加密密钥
  encryptToken?: string;
  // 用户id
  userId: string;
  // 银行卡卡号
  cardNo: string;
  // 签约流水号
  signBindSn: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      outerOrderNo: 'outer_order_no',
      encryptType: 'encrypt_type',
      encryptToken: 'encrypt_token',
      userId: 'user_id',
      cardNo: 'card_no',
      signBindSn: 'sign_bind_sn',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      outerOrderNo: 'string',
      encryptType: 'string',
      encryptToken: 'string',
      userId: 'string',
      cardNo: 'string',
      signBindSn: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCutpaymentBindResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 签约协议号
  protocolNo?: string;
  // 银行编码
  bankCode?: string;
  // 银行卡号
  bankCard?: string;
  // 用户id
  userId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      protocolNo: 'protocol_no',
      bankCode: 'bank_code',
      bankCard: 'bank_card',
      userId: 'user_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      protocolNo: 'string',
      bankCode: 'string',
      bankCard: 'string',
      userId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyCutpaymentPaymentRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 请求ID，为32位以内的字母数字组合，由调用方自行生成、保证唯一并留存，以便问题定位和授权核查。
  outerOrderNo: string;
  // 入参加密模式：
  // "0"（默认值）：不加密；
  // "6"：AES加密
  // 默认为"0"
  encryptType?: string;
  // 加密密钥
  encryptToken?: string;
  // 支付订单id
  transId: string;
  // 签约协议号
  protocolNo: string;
  // 银行卡卡号
  cardNo: string;
  // 用户姓名
  certName: string;
  // 交易金额，整数，单位:分
  txnAmt: string;
  // 用户id
  userId: string;
  // 安全码
  securityCode?: string;
  // 有效期
  validDate?: string;
  // 分账信息
  shareInfo?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      outerOrderNo: 'outer_order_no',
      encryptType: 'encrypt_type',
      encryptToken: 'encrypt_token',
      transId: 'trans_id',
      protocolNo: 'protocol_no',
      cardNo: 'card_no',
      certName: 'cert_name',
      txnAmt: 'txn_amt',
      userId: 'user_id',
      securityCode: 'security_code',
      validDate: 'valid_date',
      shareInfo: 'share_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      outerOrderNo: 'string',
      encryptType: 'string',
      encryptToken: 'string',
      transId: 'string',
      protocolNo: 'string',
      cardNo: 'string',
      certName: 'string',
      txnAmt: 'string',
      userId: 'string',
      securityCode: 'string',
      validDate: 'string',
      shareInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyCutpaymentPaymentResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 成功金额,整数，单位:分
  succAmt?: string;
  // 支付成功时间，yyyy-MM-dd HH:mm:ss
  succTime?: string;
  // 平台订单号
  orderId?: string;
  // 商户订单号
  transId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      succAmt: 'succ_amt',
      succTime: 'succ_time',
      orderId: 'order_id',
      transId: 'trans_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      succAmt: 'string',
      succTime: 'string',
      orderId: 'string',
      transId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCutpaymentPaymentRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 请求ID，为32位以内的字母数字组合，由调用方自行生成、保证唯一并留存，以便问题定位和授权核查。
  outerOrderNo: string;
  // 入参加密模式：
  // "0"（默认值）：不加密；
  // "6"：AES加密
  // 默认为"0"
  encryptType?: string;
  // 加密密钥
  encryptToken?: string;
  // 签约协议号
  protocolNo: string;
  // 支付交易商户订单号
  transId: string;
  // 交易日期yyyy-MM-dd HH:mm:ss
  origTradeDate: string;
  // 用户id
  userId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      outerOrderNo: 'outer_order_no',
      encryptType: 'encrypt_type',
      encryptToken: 'encrypt_token',
      protocolNo: 'protocol_no',
      transId: 'trans_id',
      origTradeDate: 'orig_trade_date',
      userId: 'user_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      outerOrderNo: 'string',
      encryptType: 'string',
      encryptToken: 'string',
      protocolNo: 'string',
      transId: 'string',
      origTradeDate: 'string',
      userId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCutpaymentPaymentResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 成功金额，整数，单位:分
  succAmt?: string;
  // 支付成功时间，yyyy-MM-dd HH:mm:ss
  succTime?: string;
  // 平台订单号
  orderId?: string;
  // 商户订单号
  transId?: string;
  // 订单状态
  orderState?: string;
  // 分账状态
  shareState?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      succAmt: 'succ_amt',
      succTime: 'succ_time',
      orderId: 'order_id',
      transId: 'trans_id',
      orderState: 'order_state',
      shareState: 'share_state',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      succAmt: 'string',
      succTime: 'string',
      orderId: 'string',
      transId: 'string',
      orderState: 'string',
      shareState: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyCutpaymentRefundRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 请求ID，为32位以内的字母数字组合，由调用方自行生成、保证唯一并留存，以便问题定位和授权核查。
  outerOrderNo: string;
  // 入参加密模式：
  // "0"（默认值）：不加密；
  // "6"：AES加密
  // 默认为"0"
  encryptType?: string;
  // 加密密钥
  encryptToken?: string;
  // 原支付商户订单号
  paymentTransId: string;
  // 签约协议号
  protocolNo: string;
  // 退款商户订单号
  refundTransId: string;
  // 用户id
  userId: string;
  // 退款商户流水号
  refundSerialNo: string;
  // 退款原因
  refundReason: string;
  // 退款金额，整数，单位:分
  refundAmt: string;
  // 分账退款信息
  shareRefundInfo?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      outerOrderNo: 'outer_order_no',
      encryptType: 'encrypt_type',
      encryptToken: 'encrypt_token',
      paymentTransId: 'payment_trans_id',
      protocolNo: 'protocol_no',
      refundTransId: 'refund_trans_id',
      userId: 'user_id',
      refundSerialNo: 'refund_serial_no',
      refundReason: 'refund_reason',
      refundAmt: 'refund_amt',
      shareRefundInfo: 'share_refund_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      outerOrderNo: 'string',
      encryptType: 'string',
      encryptToken: 'string',
      paymentTransId: 'string',
      protocolNo: 'string',
      refundTransId: 'string',
      userId: 'string',
      refundSerialNo: 'string',
      refundReason: 'string',
      refundAmt: 'string',
      shareRefundInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyCutpaymentRefundResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 退款商户订单号
  refundTransId?: string;
  // 退款商户流水号
  refundSerialNo?: string;
  // 退款金额，单位：分 整数
  refundAmt?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      refundTransId: 'refund_trans_id',
      refundSerialNo: 'refund_serial_no',
      refundAmt: 'refund_amt',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      refundTransId: 'string',
      refundSerialNo: 'string',
      refundAmt: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCutpaymentRefundRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 请求ID，为32位以内的字母数字组合，由调用方自行生成、保证唯一并留存，以便问题定位和授权核查。
  outerOrderNo: string;
  // 入参加密模式：
  // "0"（默认值）：不加密；
  // "6"：AES加密
  // 默认为"0"
  encryptType?: string;
  // 加密密钥
  encryptToken?: string;
  // 用户id
  userId: string;
  // 签约协议号
  protocolNo: string;
  // 退款商户订单号
  refundTransId: string;
  // 退款商户流水号
  refundSerialNo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      outerOrderNo: 'outer_order_no',
      encryptType: 'encrypt_type',
      encryptToken: 'encrypt_token',
      userId: 'user_id',
      protocolNo: 'protocol_no',
      refundTransId: 'refund_trans_id',
      refundSerialNo: 'refund_serial_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      outerOrderNo: 'string',
      encryptType: 'string',
      encryptToken: 'string',
      userId: 'string',
      protocolNo: 'string',
      refundTransId: 'string',
      refundSerialNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCutpaymentRefundResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 成功退款金额,整数，单位:分
  refundAmt?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      refundAmt: 'refund_amt',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      refundAmt: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCutpaymentStatementRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 请求ID，为32位以内的字母数字组合，由调用方自行生成、保证唯一并留存，以便问题定位和授权核查。
  outerOrderNo: string;
  // 对账单日期,格式：yyyy-mm-dd
  // 使用入参加密模式加密
  settleDate: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      outerOrderNo: 'outer_order_no',
      settleDate: 'settle_date',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      outerOrderNo: 'string',
      settleDate: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCutpaymentStatementResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 对账单临时下载，转成txt输出格式，1个小时有效期
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

export class ExecFaceThreemetaRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 真实姓名
  certName: string;
  // 证件号码
  certNo: string;
  // 商户请求的唯一标识。 
  // 值为 32 位长度的字母数字组合。其中，前面几位字符是商户自定义的简称，中间几位可以使用一段时间，后段可以使用一个随机或递增序列。该值也可以使用 UUID。
  outerOrderNo: string;
  // 固定值,BASE64
  fileType: string;
  // 待比对的图像，BASE64 格式
  facialPictureAuth: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      certName: 'cert_name',
      certNo: 'cert_no',
      outerOrderNo: 'outer_order_no',
      fileType: 'file_type',
      facialPictureAuth: 'facial_picture_auth',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      certName: 'string',
      certNo: 'string',
      outerOrderNo: 'string',
      fileType: 'string',
      facialPictureAuth: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecFaceThreemetaResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 比对分
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

export class QueryCarinfoUltimateRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 请求ID，为32位以内的字母数字组合，由调用方自行生成、保证唯一并留存，以便问题定位和授权核查。
  outerOrderNo: string;
  // 入参加密模式：
  // NONE：不加密；
  // MD5：手机号码字段以MD5加密后的字符串传输
  reqEncType?: string;
  // 手机号支持明文和 MD5
  mobile: string;
  // 扩展信息，预留字段
  // 
  externInfo?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      outerOrderNo: 'outer_order_no',
      reqEncType: 'req_enc_type',
      mobile: 'mobile',
      externInfo: 'extern_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      outerOrderNo: 'string',
      reqEncType: 'string',
      mobile: 'string',
      externInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCarinfoUltimateResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 扩展信息，为JSONObject。
  // 
  externInfo?: string;
  //  用户名下车辆数量，格式：1，2，3...
  amont?: string;
  // 车辆信息
  carInfos?: CarInfo[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      externInfo: 'extern_info',
      amont: 'amont',
      carInfos: 'car_infos',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      externInfo: 'string',
      amont: 'string',
      carInfos: { 'type': 'array', 'itemType': CarInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCarinfoPlusRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 请求ID，为32位以内的字母数字组合，由调用方自行生成、保证唯一并留存，以便问题定位和授权核查。
  outerOrderNo: string;
  // 入参加密模式：
  // NONE：不加密；
  // MD5：手机号码字段以MD5加密后的字符串传输
  reqEncType?: string;
  // 身份证号
  certNo: string;
  // 扩展信息，预留字段
  // 
  externInfo?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      outerOrderNo: 'outer_order_no',
      reqEncType: 'req_enc_type',
      certNo: 'cert_no',
      externInfo: 'extern_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      outerOrderNo: 'string',
      reqEncType: 'string',
      certNo: 'string',
      externInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCarinfoPlusResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 扩展信息，为JSONObject。
  // 
  externInfo?: string;
  // 用户名下车辆数量，格式：1，2，3...
  amont?: string;
  // 车辆信息
  carInfos?: CarInfoPlus[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      externInfo: 'extern_info',
      amont: 'amont',
      carInfos: 'car_infos',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      externInfo: 'string',
      amont: 'string',
      carInfos: { 'type': 'array', 'itemType': CarInfoPlus },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class OpenCutpaymentsubAccountRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 请求ID，为32位以内的字母数字组合，由调用方自行生成、保证唯一并留存，以便问题定位和授权核查。
  outerOrderNo: string;
  // 登录号，商户自定义，要求全局唯一，长度11位以上
  loginNo: string;
  // 邮箱
  email: string;
  // 是否个体户企业为 false个体户为 true
  selfEmployed: boolean;
  // 商户名称（营业执照上的名称）
  licenseName: string;
  // 营业执照号
  licenseNo: string;
  // 法人姓名
  certName: string;
  // 法人身份证号
  certNo: string;
  // 法人手机号
  mobile: string;
  // 公司所属行业
  industryId: string;
  // 银行卡号
  bankCard: string;
  // 银行名称
  bankName: string;
  // 开户行省份
  bankProvince: string;
  // 开户行城市
  bankCity: string;
  // 开户支行名称
  bankBranchName: string;
  // 持卡人姓名
  // 当开个体户且绑定对私卡时需传此字段,否则默认绑定对公卡
  cardUserName?: string;
  // 一级商户商户号
  firstLevelMemberid: string;
  // 一级商户终端号
  firstLevelTerminalid: string;
  // 扩展信息，预留字段
  externParam?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      outerOrderNo: 'outer_order_no',
      loginNo: 'login_no',
      email: 'email',
      selfEmployed: 'self_employed',
      licenseName: 'license_name',
      licenseNo: 'license_no',
      certName: 'cert_name',
      certNo: 'cert_no',
      mobile: 'mobile',
      industryId: 'industry_id',
      bankCard: 'bank_card',
      bankName: 'bank_name',
      bankProvince: 'bank_province',
      bankCity: 'bank_city',
      bankBranchName: 'bank_branch_name',
      cardUserName: 'card_user_name',
      firstLevelMemberid: 'first_level_memberid',
      firstLevelTerminalid: 'first_level_terminalid',
      externParam: 'extern_param',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      outerOrderNo: 'string',
      loginNo: 'string',
      email: 'string',
      selfEmployed: 'boolean',
      licenseName: 'string',
      licenseNo: 'string',
      certName: 'string',
      certNo: 'string',
      mobile: 'string',
      industryId: 'string',
      bankCard: 'string',
      bankName: 'string',
      bankProvince: 'string',
      bankCity: 'string',
      bankBranchName: 'string',
      cardUserName: 'string',
      firstLevelMemberid: 'string',
      firstLevelTerminalid: 'string',
      externParam: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class OpenCutpaymentsubAccountResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 扩展信息，预留字段
  externInfo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      externInfo: 'extern_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      externInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCutpaymentsubAccountRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 请求ID，为32位以内的字母数字组合，由调用方自行生成、保证唯一并留存，以便问题定位和授权核查。
  outerOrderNo: string;
  // 登录号
  loginNo: string;
  // 一级商户商户号
  firstLevelMemberid: string;
  // 一级商户终端号
  firstLevelTerminalid: string;
  // 扩展信息，预留字段
  externParam?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      outerOrderNo: 'outer_order_no',
      loginNo: 'login_no',
      firstLevelMemberid: 'first_level_memberid',
      firstLevelTerminalid: 'first_level_terminalid',
      externParam: 'extern_param',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      outerOrderNo: 'string',
      loginNo: 'string',
      firstLevelMemberid: 'string',
      firstLevelTerminalid: 'string',
      externParam: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCutpaymentsubAccountResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 二级商户号
  contractNo?: string;
  // 二级商户客户账户名
  contractName?: string;
  // 二级商户客户名
  customerName?: string;
  // 扩展信息，预留字段
  externInfo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      contractNo: 'contract_no',
      contractName: 'contract_name',
      customerName: 'customer_name',
      externInfo: 'extern_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      contractNo: 'string',
      contractName: 'string',
      customerName: 'string',
      externInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class TransferCutpaymentsubRevenueRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 请求ID，为32位以内的字母数字组合，由调用方自行生成、保证唯一并留存，以便问题定位和授权核查。
  outerOrderNo: string;
  // 商户订单号需要唯一，方便定位到每一笔订单
  orderNo: string;
  // 01:加值；02:减值；
  orderType: string;
  // 分账总金额，单位：元，整数部分最长10位数，保留两位小数
  dealAmount: string;
  // 二级商户账户号
  contractNo: string;
  // 金额，单位：元，整数部分最长10位数，保留两位小数
  transAmount: string;
  // 一级商户商户号
  firstLevelMemberid: string;
  // 一级商户终端号
  firstLevelTerminalid: string;
  // 扩展信息，预留字段
  externParam?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      outerOrderNo: 'outer_order_no',
      orderNo: 'order_no',
      orderType: 'order_type',
      dealAmount: 'deal_amount',
      contractNo: 'contract_no',
      transAmount: 'trans_amount',
      firstLevelMemberid: 'first_level_memberid',
      firstLevelTerminalid: 'first_level_terminalid',
      externParam: 'extern_param',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      outerOrderNo: 'string',
      orderNo: 'string',
      orderType: 'string',
      dealAmount: 'string',
      contractNo: 'string',
      transAmount: 'string',
      firstLevelMemberid: 'string',
      firstLevelTerminalid: 'string',
      externParam: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class TransferCutpaymentsubRevenueResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 扩展信息，预留字段
  externInfo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      externInfo: 'extern_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      externInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCutpaymentsubRevenueRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 请求ID，为32位以内的字母数字组合，由调用方自行生成、保证唯一并留存，以便问题定位和授权核查。
  outerOrderNo: string;
  // 商户订单号需要唯一，方便定位到每一笔订单
  orderNo: string;
  // 01:加值；02:减值
  orderType: string;
  // 一级商户商户号
  firstLevelMemberid: string;
  // 一级商户终端号
  firstLevelTerminalid: string;
  // 扩展信息，预留字段
  externParam?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      outerOrderNo: 'outer_order_no',
      orderNo: 'order_no',
      orderType: 'order_type',
      firstLevelMemberid: 'first_level_memberid',
      firstLevelTerminalid: 'first_level_terminalid',
      externParam: 'extern_param',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      outerOrderNo: 'string',
      orderNo: 'string',
      orderType: 'string',
      firstLevelMemberid: 'string',
      firstLevelTerminalid: 'string',
      externParam: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCutpaymentsubRevenueResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 扩展信息，预留字段
  externInfo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      externInfo: 'extern_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      externInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CaptureCutpaymentsubWithdrawalRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 请求ID，为32位以内的字母数字组合，由调用方自行生成、保证唯一并留存，以便问题定位和授权核查。
  outerOrderNo: string;
  // 提现的订单号，商户订单号需要唯一，方便定位到每一笔订单
  withdrawOrderId: string;
  // 二级商户账户号
  contractNo: string;
  // 提现金额，单位：元，整数部分最长10位数，保留两位小数
  dealAmount: string;
  // 一级商户商户号
  firstLevelMemberid: string;
  // 一级商户终端号
  firstLevelTerminalid: string;
  // 扩展信息，预留字段
  externParam?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      outerOrderNo: 'outer_order_no',
      withdrawOrderId: 'withdraw_order_id',
      contractNo: 'contract_no',
      dealAmount: 'deal_amount',
      firstLevelMemberid: 'first_level_memberid',
      firstLevelTerminalid: 'first_level_terminalid',
      externParam: 'extern_param',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      outerOrderNo: 'string',
      withdrawOrderId: 'string',
      contractNo: 'string',
      dealAmount: 'string',
      firstLevelMemberid: 'string',
      firstLevelTerminalid: 'string',
      externParam: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CaptureCutpaymentsubWithdrawalResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 扩展信息，预留字段
  externInfo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      externInfo: 'extern_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      externInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCutpaymentsubWithdrawalRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 请求ID，为32位以内的字母数字组合，由调用方自行生成、保证唯一并留存，以便问题定位和授权核查。
  outerOrderNo: string;
  // 原商户流水号
  withdrawOrderId: string;
  // 交易时间 yyyy-MM-dd，原交易日期
  time: string;
  // 一级商户商户号
  firstLevelMemberid: string;
  // 一级商户终端号
  firstLevelTerminalid: string;
  // 扩展信息，预留字段
  externParam?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      outerOrderNo: 'outer_order_no',
      withdrawOrderId: 'withdraw_order_id',
      time: 'time',
      firstLevelMemberid: 'first_level_memberid',
      firstLevelTerminalid: 'first_level_terminalid',
      externParam: 'extern_param',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      outerOrderNo: 'string',
      withdrawOrderId: 'string',
      time: 'string',
      firstLevelMemberid: 'string',
      firstLevelTerminalid: 'string',
      externParam: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCutpaymentsubWithdrawalResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 扩展信息，预留字段
  externInfo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      externInfo: 'extern_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      externInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCutpaymentsubBalanceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 请求ID，为32位以内的字母数字组合，由调用方自行生成、保证唯一并留存，以便问题定位和授权核查。
  outerOrderNo: string;
  // 二级商户账户号
  contractNo: string;
  // 一级商户商户号
  firstLevelMemberid: string;
  // 一级商户终端号
  firstLevelTerminalid: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      outerOrderNo: 'outer_order_no',
      contractNo: 'contract_no',
      firstLevelMemberid: 'first_level_memberid',
      firstLevelTerminalid: 'first_level_terminalid',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      outerOrderNo: 'string',
      contractNo: 'string',
      firstLevelMemberid: 'string',
      firstLevelTerminalid: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCutpaymentsubBalanceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 账簿可用余额，单位：元；可用于提现，整数部分最长10位数，保留两位小数
  availableAmount?: string;
  // 账簿余额，单位：元；整数部分最长10位数，保留两位小数
  currAmount?: string;
  // 扩展信息，预留字段
  externInfo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      availableAmount: 'available_amount',
      currAmount: 'curr_amount',
      externInfo: 'extern_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      availableAmount: 'string',
      currAmount: 'string',
      externInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCutpaymentsubTransactionRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 请求ID，为32位以内的字母数字组合，由调用方自行生成、保证唯一并留存，以便问题定位和授权核查。
  outerOrderNo: string;
  // 二级商户账户号
  contractNo: string;
  // 明细开始时间，格式为：yyyy-MM-dd HH:mm:ss
  startTime?: string;
  // 明细结束时间，格式为：yyyy-MM-dd HH:mm:ss，查询间隔最大支持一个月
  endTime?: string;
  // 当前页
  pageNum: string;
  // 每页数量，每页最多100条数据
  pageSize: string;
  // 一级商户商户号
  firstLevelMemberid: string;
  // 一级商户终端号
  firstLevelTerminalid: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      outerOrderNo: 'outer_order_no',
      contractNo: 'contract_no',
      startTime: 'start_time',
      endTime: 'end_time',
      pageNum: 'page_num',
      pageSize: 'page_size',
      firstLevelMemberid: 'first_level_memberid',
      firstLevelTerminalid: 'first_level_terminalid',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      outerOrderNo: 'string',
      contractNo: 'string',
      startTime: 'string',
      endTime: 'string',
      pageNum: 'string',
      pageSize: 'string',
      firstLevelMemberid: 'string',
      firstLevelTerminalid: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCutpaymentsubTransactionResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 当前页
  pageNum?: string;
  // 每页数量
  pageSize?: string;
  // 总页数
  pageCount?: string;
  // 银行卡代扣二级租户收支明细
  transactionDetailList?: TransactionDetail[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      pageNum: 'page_num',
      pageSize: 'page_size',
      pageCount: 'page_count',
      transactionDetailList: 'transaction_detail_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      pageNum: 'string',
      pageSize: 'string',
      pageCount: 'string',
      transactionDetailList: { 'type': 'array', 'itemType': TransactionDetail },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRiskServerRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 设备信息
  deviceInfo: DeviceInfo;
  // 设备风险信息
  deviceRiskInfo: DeviceRiskInfo;
  // 视频文件
  fileObject?: Readable;
  fileObjectName?: string;
  fileId?: string;
  // base64编码最佳人脸图，可加密
  faceImage: string;
  // 唯一标识业务请求
  uniqueId: string;
  // 标识应用程序名称
  appName?: string;
  // 标识应用程序版本
  appVersion?: string;
  // 标识业务场景
  sceneId?: string;
  // 姓名，可加密
  certName?: string;
  // 身份证号，可加密
  certNo?: string;
  // 表示用户唯一id
  uid?: string;
  // cert_name、cert_no两个字段的传入模式0：明文 1：密文
  encType?: string;
  // 图片的传入加密模式 0：明文 1：AES加密
  materialEncType?: string;
  // 公钥加密后的密钥，用于传入的加密图片/视频
  materialEncToken?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      deviceInfo: 'device_info',
      deviceRiskInfo: 'device_risk_info',
      fileObject: 'fileObject',
      fileObjectName: 'fileObjectName',
      fileId: 'file_id',
      faceImage: 'face_image',
      uniqueId: 'unique_id',
      appName: 'app_name',
      appVersion: 'app_version',
      sceneId: 'scene_id',
      certName: 'cert_name',
      certNo: 'cert_no',
      uid: 'uid',
      encType: 'enc_type',
      materialEncType: 'material_enc_type',
      materialEncToken: 'material_enc_token',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      deviceInfo: DeviceInfo,
      deviceRiskInfo: DeviceRiskInfo,
      fileObject: 'Readable',
      fileObjectName: 'string',
      fileId: 'string',
      faceImage: 'string',
      uniqueId: 'string',
      appName: 'string',
      appVersion: 'string',
      sceneId: 'string',
      certName: 'string',
      certNo: 'string',
      uid: 'string',
      encType: 'string',
      materialEncType: 'string',
      materialEncToken: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRiskServerResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 攻击结论
  faceAttack?: string;
  // 综合风险检测结果
  riskResult?: RiskResult;
  // Aigc风险检测结论
  aigcRiskResult?: AigcRiskResult;
  // 是否面部遮挡
  faceOcclusion?: boolean;
  // 人脸性别年龄预估
  attributes?: string;
  // 人脸质量分和小分
  qualityResult?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      faceAttack: 'face_attack',
      riskResult: 'risk_result',
      aigcRiskResult: 'aigc_risk_result',
      faceOcclusion: 'face_occlusion',
      attributes: 'attributes',
      qualityResult: 'quality_result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      faceAttack: 'string',
      riskResult: RiskResult,
      aigcRiskResult: AigcRiskResult,
      faceOcclusion: 'boolean',
      attributes: 'string',
      qualityResult: 'string',
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
          sdk_version: "1.22.18",
          _prod_code: "REALPERSON",
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
   * Description: 查询认证的结果和相关信息
   * Summary: 认证查询
   */
  async queryFacevrfServer(request: QueryFacevrfServerRequest): Promise<QueryFacevrfServerResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryFacevrfServerEx(request, headers, runtime);
  }

  /**
   * Description: 查询认证的结果和相关信息
   * Summary: 认证查询
   */
  async queryFacevrfServerEx(request: QueryFacevrfServerRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryFacevrfServerResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryFacevrfServerResponse>(await this.doRequest("1.0", "di.realperson.facevrf.server.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryFacevrfServerResponse({}));
  }

  /**
   * Description: 服务端认证创建，传入认证信息，获取认证ID（和url）
   * Summary: 认证创建
   */
  async createFacevrfServer(request: CreateFacevrfServerRequest): Promise<CreateFacevrfServerResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createFacevrfServerEx(request, headers, runtime);
  }

  /**
   * Description: 服务端认证创建，传入认证信息，获取认证ID（和url）
   * Summary: 认证创建
   */
  async createFacevrfServerEx(request: CreateFacevrfServerRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateFacevrfServerResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateFacevrfServerResponse>(await this.doRequest("1.0", "di.realperson.facevrf.server.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateFacevrfServerResponse({}));
  }

  /**
   * Description: 纯服务端比对，直接输入待比对的图片，返回比对结果
   * Summary: 纯服务端比对
   */
  async execFacevrfServer(request: ExecFacevrfServerRequest): Promise<ExecFacevrfServerResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.execFacevrfServerEx(request, headers, runtime);
  }

  /**
   * Description: 纯服务端比对，直接输入待比对的图片，返回比对结果
   * Summary: 纯服务端比对
   */
  async execFacevrfServerEx(request: ExecFacevrfServerRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExecFacevrfServerResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecFacevrfServerResponse>(await this.doRequest("1.0", "di.realperson.facevrf.server.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExecFacevrfServerResponse({}));
  }

  /**
   * Description: 传入某次刷脸的certifyID，获得刷脸存证的pdf文件和司法脸统一证据ID，这两份数据可以在司法链的控制台中进行核验存证是否被记录在区块链上从而证实其真实可信。
   * Summary: 商户获取司法链上刷脸存证和统一证据ID
   */
  async getFacevrfEvidence(request: GetFacevrfEvidenceRequest): Promise<GetFacevrfEvidenceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getFacevrfEvidenceEx(request, headers, runtime);
  }

  /**
   * Description: 传入某次刷脸的certifyID，获得刷脸存证的pdf文件和司法脸统一证据ID，这两份数据可以在司法链的控制台中进行核验存证是否被记录在区块链上从而证实其真实可信。
   * Summary: 商户获取司法链上刷脸存证和统一证据ID
   */
  async getFacevrfEvidenceEx(request: GetFacevrfEvidenceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetFacevrfEvidenceResponse> {
    Util.validateModel(request);
    return $tea.cast<GetFacevrfEvidenceResponse>(await this.doRequest("1.0", "di.realperson.facevrf.evidence.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetFacevrfEvidenceResponse({}));
  }

  /**
   * Description: 个人二要素认证
   * Summary: 个人二要素认证
   */
  async checkIndividualidTwometa(request: CheckIndividualidTwometaRequest): Promise<CheckIndividualidTwometaResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.checkIndividualidTwometaEx(request, headers, runtime);
  }

  /**
   * Description: 个人二要素认证
   * Summary: 个人二要素认证
   */
  async checkIndividualidTwometaEx(request: CheckIndividualidTwometaRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CheckIndividualidTwometaResponse> {
    Util.validateModel(request);
    return $tea.cast<CheckIndividualidTwometaResponse>(await this.doRequest("1.0", "di.realperson.individualid.twometa.check", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CheckIndividualidTwometaResponse({}));
  }

  /**
   * Description: 个人三要素认证
   * Summary: 个人三要素认证
   */
  async checkIndividualidThreemeta(request: CheckIndividualidThreemetaRequest): Promise<CheckIndividualidThreemetaResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.checkIndividualidThreemetaEx(request, headers, runtime);
  }

  /**
   * Description: 个人三要素认证
   * Summary: 个人三要素认证
   */
  async checkIndividualidThreemetaEx(request: CheckIndividualidThreemetaRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CheckIndividualidThreemetaResponse> {
    Util.validateModel(request);
    return $tea.cast<CheckIndividualidThreemetaResponse>(await this.doRequest("1.0", "di.realperson.individualid.threemeta.check", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CheckIndividualidThreemetaResponse({}));
  }

  /**
   * Description: 个人四要素认证
   * Summary: 个人四要素认证
   */
  async checkIndividualidFourmeta(request: CheckIndividualidFourmetaRequest): Promise<CheckIndividualidFourmetaResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.checkIndividualidFourmetaEx(request, headers, runtime);
  }

  /**
   * Description: 个人四要素认证
   * Summary: 个人四要素认证
   */
  async checkIndividualidFourmetaEx(request: CheckIndividualidFourmetaRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CheckIndividualidFourmetaResponse> {
    Util.validateModel(request);
    return $tea.cast<CheckIndividualidFourmetaResponse>(await this.doRequest("1.0", "di.realperson.individualid.fourmeta.check", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CheckIndividualidFourmetaResponse({}));
  }

  /**
   * Description: 个人三要素认证（场景路由）
   * Summary: 个人三要素认证（场景路由）
   */
  async checkRouteThreemeta(request: CheckRouteThreemetaRequest): Promise<CheckRouteThreemetaResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.checkRouteThreemetaEx(request, headers, runtime);
  }

  /**
   * Description: 个人三要素认证（场景路由）
   * Summary: 个人三要素认证（场景路由）
   */
  async checkRouteThreemetaEx(request: CheckRouteThreemetaRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CheckRouteThreemetaResponse> {
    Util.validateModel(request);
    return $tea.cast<CheckRouteThreemetaResponse>(await this.doRequest("1.0", "di.realperson.route.threemeta.check", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CheckRouteThreemetaResponse({}));
  }

  /**
   * Description: 纯服务端声纹注册
   * Summary: 纯服务端声纹注册
   */
  async createVoiceprintServermode(request: CreateVoiceprintServermodeRequest): Promise<CreateVoiceprintServermodeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createVoiceprintServermodeEx(request, headers, runtime);
  }

  /**
   * Description: 纯服务端声纹注册
   * Summary: 纯服务端声纹注册
   */
  async createVoiceprintServermodeEx(request: CreateVoiceprintServermodeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateVoiceprintServermodeResponse> {
    if (!Util.isUnset(request.fileObject)) {
      let uploadReq = new CreateAntcloudGatewayxFileUploadRequest({
        authToken: request.authToken,
        apiCode: "di.realperson.voiceprint.servermode.create",
        fileName: request.fileObjectName,
      });
      let uploadResp = await this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
      if (!AntchainUtil.isSuccess(uploadResp.resultCode, "ok")) {
        let createVoiceprintServermodeResponse = new CreateVoiceprintServermodeResponse({
          reqMsgId: uploadResp.reqMsgId,
          resultCode: uploadResp.resultCode,
          resultMsg: uploadResp.resultMsg,
        });
        return createVoiceprintServermodeResponse;
      }

      let uploadHeaders = AntchainUtil.parseUploadHeaders(uploadResp.uploadHeaders);
      await AntchainUtil.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
      request.fileId = uploadResp.fileId;
      request.fileObject = null;
    }

    Util.validateModel(request);
    return $tea.cast<CreateVoiceprintServermodeResponse>(await this.doRequest("1.0", "di.realperson.voiceprint.servermode.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateVoiceprintServermodeResponse({}));
  }

  /**
   * Description: 纯服务端声纹比对
   * Summary: 纯服务端声纹比对
   */
  async verifyVoiceprintServermode(request: VerifyVoiceprintServermodeRequest): Promise<VerifyVoiceprintServermodeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.verifyVoiceprintServermodeEx(request, headers, runtime);
  }

  /**
   * Description: 纯服务端声纹比对
   * Summary: 纯服务端声纹比对
   */
  async verifyVoiceprintServermodeEx(request: VerifyVoiceprintServermodeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<VerifyVoiceprintServermodeResponse> {
    Util.validateModel(request);
    return $tea.cast<VerifyVoiceprintServermodeResponse>(await this.doRequest("1.0", "di.realperson.voiceprint.servermode.verify", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new VerifyVoiceprintServermodeResponse({}));
  }

  /**
   * Description: 个人二要素认证（场景路由）
   * Summary: 个人二要素认证（场景路由）
   */
  async checkRouteTwometa(request: CheckRouteTwometaRequest): Promise<CheckRouteTwometaResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.checkRouteTwometaEx(request, headers, runtime);
  }

  /**
   * Description: 个人二要素认证（场景路由）
   * Summary: 个人二要素认证（场景路由）
   */
  async checkRouteTwometaEx(request: CheckRouteTwometaRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CheckRouteTwometaResponse> {
    Util.validateModel(request);
    return $tea.cast<CheckRouteTwometaResponse>(await this.doRequest("1.0", "di.realperson.route.twometa.check", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CheckRouteTwometaResponse({}));
  }

  /**
   * Description: 通过移动设备身份临时标识查询该设备相关的设备风险信息的服务
   * Summary: 移动风险设备查询
   */
  async queryMobileRisk(request: QueryMobileRiskRequest): Promise<QueryMobileRiskResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryMobileRiskEx(request, headers, runtime);
  }

  /**
   * Description: 通过移动设备身份临时标识查询该设备相关的设备风险信息的服务
   * Summary: 移动风险设备查询
   */
  async queryMobileRiskEx(request: QueryMobileRiskRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryMobileRiskResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryMobileRiskResponse>(await this.doRequest("1.0", "di.realperson.mobile.risk.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryMobileRiskResponse({}));
  }

  /**
   * Description: 通过认证ID查询认证人、认证时间等相关信息，供智科内部使用
   * Summary: 查询认证人、认证时间等相关信息
   */
  async detailFacevrfServer(request: DetailFacevrfServerRequest): Promise<DetailFacevrfServerResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.detailFacevrfServerEx(request, headers, runtime);
  }

  /**
   * Description: 通过认证ID查询认证人、认证时间等相关信息，供智科内部使用
   * Summary: 查询认证人、认证时间等相关信息
   */
  async detailFacevrfServerEx(request: DetailFacevrfServerRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DetailFacevrfServerResponse> {
    Util.validateModel(request);
    return $tea.cast<DetailFacevrfServerResponse>(await this.doRequest("1.0", "di.realperson.facevrf.server.detail", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DetailFacevrfServerResponse({}));
  }

  /**
   * Description: 临工场景等场景下，通过主体的社保缴纳情况进行的反欺诈校验
   * Summary: 个人反欺诈风险校验
   */
  async checkAnticheatPersonal(request: CheckAnticheatPersonalRequest): Promise<CheckAnticheatPersonalResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.checkAnticheatPersonalEx(request, headers, runtime);
  }

  /**
   * Description: 临工场景等场景下，通过主体的社保缴纳情况进行的反欺诈校验
   * Summary: 个人反欺诈风险校验
   */
  async checkAnticheatPersonalEx(request: CheckAnticheatPersonalRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CheckAnticheatPersonalResponse> {
    Util.validateModel(request);
    return $tea.cast<CheckAnticheatPersonalResponse>(await this.doRequest("1.0", "di.realperson.anticheat.personal.check", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CheckAnticheatPersonalResponse({}));
  }

  /**
   * Description: 二要素支持hash主体信息
   * Summary: 个人二要素核验支持hash的主体信息
   */
  async checkTwometaHash(request: CheckTwometaHashRequest): Promise<CheckTwometaHashResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.checkTwometaHashEx(request, headers, runtime);
  }

  /**
   * Description: 二要素支持hash主体信息
   * Summary: 个人二要素核验支持hash的主体信息
   */
  async checkTwometaHashEx(request: CheckTwometaHashRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CheckTwometaHashResponse> {
    Util.validateModel(request);
    return $tea.cast<CheckTwometaHashResponse>(await this.doRequest("1.0", "di.realperson.twometa.hash.check", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CheckTwometaHashResponse({}));
  }

  /**
   * Description: 对接运营商等数据源查询手机号码的在网时长
   * Summary: 三要素在网时长查询接口
   */
  async queryThreemetaOnlinetime(request: QueryThreemetaOnlinetimeRequest): Promise<QueryThreemetaOnlinetimeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryThreemetaOnlinetimeEx(request, headers, runtime);
  }

  /**
   * Description: 对接运营商等数据源查询手机号码的在网时长
   * Summary: 三要素在网时长查询接口
   */
  async queryThreemetaOnlinetimeEx(request: QueryThreemetaOnlinetimeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryThreemetaOnlinetimeResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryThreemetaOnlinetimeResponse>(await this.doRequest("1.0", "di.realperson.threemeta.onlinetime.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryThreemetaOnlinetimeResponse({}));
  }

  /**
   * Description: 客户端初始化认证(OEM专用)
   * Summary: 客户端初始化认证(OEM专用)
   */
  async initFacevrfZim(request: InitFacevrfZimRequest): Promise<InitFacevrfZimResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.initFacevrfZimEx(request, headers, runtime);
  }

  /**
   * Description: 客户端初始化认证(OEM专用)
   * Summary: 客户端初始化认证(OEM专用)
   */
  async initFacevrfZimEx(request: InitFacevrfZimRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<InitFacevrfZimResponse> {
    Util.validateModel(request);
    return $tea.cast<InitFacevrfZimResponse>(await this.doRequest("1.0", "di.realperson.facevrf.zim.init", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new InitFacevrfZimResponse({}));
  }

  /**
   * Description: 客户端人脸验证(OEM专用)
   * Summary: 客户端人脸验证(OEM专用)
   */
  async verifyFacevrfZim(request: VerifyFacevrfZimRequest): Promise<VerifyFacevrfZimResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.verifyFacevrfZimEx(request, headers, runtime);
  }

  /**
   * Description: 客户端人脸验证(OEM专用)
   * Summary: 客户端人脸验证(OEM专用)
   */
  async verifyFacevrfZimEx(request: VerifyFacevrfZimRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<VerifyFacevrfZimResponse> {
    Util.validateModel(request);
    return $tea.cast<VerifyFacevrfZimResponse>(await this.doRequest("1.0", "di.realperson.facevrf.zim.verify", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new VerifyFacevrfZimResponse({}));
  }

  /**
   * Description: 卡证OCR
   * Summary: 卡证OCR
   */
  async recognizeDocIndividualcard(request: RecognizeDocIndividualcardRequest): Promise<RecognizeDocIndividualcardResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.recognizeDocIndividualcardEx(request, headers, runtime);
  }

  /**
   * Description: 卡证OCR
   * Summary: 卡证OCR
   */
  async recognizeDocIndividualcardEx(request: RecognizeDocIndividualcardRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<RecognizeDocIndividualcardResponse> {
    if (!Util.isUnset(request.fileObject)) {
      let uploadReq = new CreateAntcloudGatewayxFileUploadRequest({
        authToken: request.authToken,
        apiCode: "di.realperson.doc.individualcard.recognize",
        fileName: request.fileObjectName,
      });
      let uploadResp = await this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
      if (!AntchainUtil.isSuccess(uploadResp.resultCode, "ok")) {
        let recognizeDocIndividualcardResponse = new RecognizeDocIndividualcardResponse({
          reqMsgId: uploadResp.reqMsgId,
          resultCode: uploadResp.resultCode,
          resultMsg: uploadResp.resultMsg,
        });
        return recognizeDocIndividualcardResponse;
      }

      let uploadHeaders = AntchainUtil.parseUploadHeaders(uploadResp.uploadHeaders);
      await AntchainUtil.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
      request.fileId = uploadResp.fileId;
      request.fileObject = null;
    }

    Util.validateModel(request);
    return $tea.cast<RecognizeDocIndividualcardResponse>(await this.doRequest("1.0", "di.realperson.doc.individualcard.recognize", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new RecognizeDocIndividualcardResponse({}));
  }

  /**
   * Description: 个人银行卡三要素
   * Summary: 个人银行卡三要素
   */
  async checkThreemetaBankcard(request: CheckThreemetaBankcardRequest): Promise<CheckThreemetaBankcardResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.checkThreemetaBankcardEx(request, headers, runtime);
  }

  /**
   * Description: 个人银行卡三要素
   * Summary: 个人银行卡三要素
   */
  async checkThreemetaBankcardEx(request: CheckThreemetaBankcardRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CheckThreemetaBankcardResponse> {
    Util.validateModel(request);
    return $tea.cast<CheckThreemetaBankcardResponse>(await this.doRequest("1.0", "di.realperson.threemeta.bankcard.check", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CheckThreemetaBankcardResponse({}));
  }

  /**
   * Description: deepsec终端安全风险标签查询
   * Summary: deepsec终端安全风险标签查询
   */
  async queryDeepsecRisk(request: QueryDeepsecRiskRequest): Promise<QueryDeepsecRiskResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryDeepsecRiskEx(request, headers, runtime);
  }

  /**
   * Description: deepsec终端安全风险标签查询
   * Summary: deepsec终端安全风险标签查询
   */
  async queryDeepsecRiskEx(request: QueryDeepsecRiskRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryDeepsecRiskResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDeepsecRiskResponse>(await this.doRequest("1.0", "di.realperson.deepsec.risk.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryDeepsecRiskResponse({}));
  }

  /**
   * Description: deepsec终端安全api，用于apdid查询
   * Summary: tsbmrq设备id查询入口
   */
  async queryDeepsecTsbmrq(request: QueryDeepsecTsbmrqRequest): Promise<QueryDeepsecTsbmrqResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryDeepsecTsbmrqEx(request, headers, runtime);
  }

  /**
   * Description: deepsec终端安全api，用于apdid查询
   * Summary: tsbmrq设备id查询入口
   */
  async queryDeepsecTsbmrqEx(request: QueryDeepsecTsbmrqRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryDeepsecTsbmrqResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDeepsecTsbmrqResponse>(await this.doRequest("1.0", "di.realperson.deepsec.tsbmrq.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryDeepsecTsbmrqResponse({}));
  }

  /**
   * Description: 个人运营商二次放号
   * Summary: 个人运营商二次放号
   */
  async queryThreemetaPhonereuse(request: QueryThreemetaPhonereuseRequest): Promise<QueryThreemetaPhonereuseResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryThreemetaPhonereuseEx(request, headers, runtime);
  }

  /**
   * Description: 个人运营商二次放号
   * Summary: 个人运营商二次放号
   */
  async queryThreemetaPhonereuseEx(request: QueryThreemetaPhonereuseRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryThreemetaPhonereuseResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryThreemetaPhonereuseResponse>(await this.doRequest("1.0", "di.realperson.threemeta.phonereuse.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryThreemetaPhonereuseResponse({}));
  }

  /**
   * Description: 查询设备信息
   * Summary: 设备信息查询for蚁盾
   */
  async queryTscenterDevice(request: QueryTscenterDeviceRequest): Promise<QueryTscenterDeviceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryTscenterDeviceEx(request, headers, runtime);
  }

  /**
   * Description: 查询设备信息
   * Summary: 设备信息查询for蚁盾
   */
  async queryTscenterDeviceEx(request: QueryTscenterDeviceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryTscenterDeviceResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryTscenterDeviceResponse>(await this.doRequest("1.0", "di.realperson.tscenter.device.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryTscenterDeviceResponse({}));
  }

  /**
   * Description: 学历验证
   * Summary: 学历验证
   */
  async queryEducationInfo(request: QueryEducationInfoRequest): Promise<QueryEducationInfoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryEducationInfoEx(request, headers, runtime);
  }

  /**
   * Description: 学历验证
   * Summary: 学历验证
   */
  async queryEducationInfoEx(request: QueryEducationInfoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryEducationInfoResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryEducationInfoResponse>(await this.doRequest("1.0", "di.realperson.education.info.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryEducationInfoResponse({}));
  }

  /**
   * Description: demo用记录查询
   * Summary: demo用记录查询
   */
  async queryDemoInfo(request: QueryDemoInfoRequest): Promise<QueryDemoInfoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryDemoInfoEx(request, headers, runtime);
  }

  /**
   * Description: demo用记录查询
   * Summary: demo用记录查询
   */
  async queryDemoInfoEx(request: QueryDemoInfoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryDemoInfoResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDemoInfoResponse>(await this.doRequest("1.0", "di.realperson.demo.info.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryDemoInfoResponse({}));
  }

  /**
   * Description: 个人银行卡二要素
   * Summary: 个人银行卡二要素
   */
  async checkBankcardTwometa(request: CheckBankcardTwometaRequest): Promise<CheckBankcardTwometaResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.checkBankcardTwometaEx(request, headers, runtime);
  }

  /**
   * Description: 个人银行卡二要素
   * Summary: 个人银行卡二要素
   */
  async checkBankcardTwometaEx(request: CheckBankcardTwometaRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CheckBankcardTwometaResponse> {
    Util.validateModel(request);
    return $tea.cast<CheckBankcardTwometaResponse>(await this.doRequest("1.0", "di.realperson.bankcard.twometa.check", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CheckBankcardTwometaResponse({}));
  }

  /**
   * Description: 个人运营商二要素
   * Summary: 个人运营商二要素
   */
  async checkCarrierTwometa(request: CheckCarrierTwometaRequest): Promise<CheckCarrierTwometaResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.checkCarrierTwometaEx(request, headers, runtime);
  }

  /**
   * Description: 个人运营商二要素
   * Summary: 个人运营商二要素
   */
  async checkCarrierTwometaEx(request: CheckCarrierTwometaRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CheckCarrierTwometaResponse> {
    Util.validateModel(request);
    return $tea.cast<CheckCarrierTwometaResponse>(await this.doRequest("1.0", "di.realperson.carrier.twometa.check", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CheckCarrierTwometaResponse({}));
  }

  /**
   * Description: NFC实证
   * Summary: NFC实证
   */
  async createNfcServer(request: CreateNfcServerRequest): Promise<CreateNfcServerResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createNfcServerEx(request, headers, runtime);
  }

  /**
   * Description: NFC实证
   * Summary: NFC实证
   */
  async createNfcServerEx(request: CreateNfcServerRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateNfcServerResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateNfcServerResponse>(await this.doRequest("1.0", "di.realperson.nfc.server.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateNfcServerResponse({}));
  }

  /**
   * Description: NFC实证
   * Summary: NFC实证
   */
  async queryNfcServer(request: QueryNfcServerRequest): Promise<QueryNfcServerResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryNfcServerEx(request, headers, runtime);
  }

  /**
   * Description: NFC实证
   * Summary: NFC实证
   */
  async queryNfcServerEx(request: QueryNfcServerRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryNfcServerResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryNfcServerResponse>(await this.doRequest("1.0", "di.realperson.nfc.server.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryNfcServerResponse({}));
  }

  /**
   * Description: 社会安全风险
   * Summary: 社会安全风险
   */
  async querySocialriskDetail(request: QuerySocialriskDetailRequest): Promise<QuerySocialriskDetailResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.querySocialriskDetailEx(request, headers, runtime);
  }

  /**
   * Description: 社会安全风险
   * Summary: 社会安全风险
   */
  async querySocialriskDetailEx(request: QuerySocialriskDetailRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QuerySocialriskDetailResponse> {
    Util.validateModel(request);
    return $tea.cast<QuerySocialriskDetailResponse>(await this.doRequest("1.0", "di.realperson.socialrisk.detail.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QuerySocialriskDetailResponse({}));
  }

  /**
   * Description: 运营商在网状态查询
   * Summary: 运营商在网状态查询
   */
  async queryCarrierNetstatus(request: QueryCarrierNetstatusRequest): Promise<QueryCarrierNetstatusResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryCarrierNetstatusEx(request, headers, runtime);
  }

  /**
   * Description: 运营商在网状态查询
   * Summary: 运营商在网状态查询
   */
  async queryCarrierNetstatusEx(request: QueryCarrierNetstatusRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryCarrierNetstatusResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryCarrierNetstatusResponse>(await this.doRequest("1.0", "di.realperson.carrier.netstatus.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryCarrierNetstatusResponse({}));
  }

  /**
   * Description: 社会安全风险（简版）
   * Summary: 社会安全风险（简版）
   */
  async querySocialriskBrief(request: QuerySocialriskBriefRequest): Promise<QuerySocialriskBriefResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.querySocialriskBriefEx(request, headers, runtime);
  }

  /**
   * Description: 社会安全风险（简版）
   * Summary: 社会安全风险（简版）
   */
  async querySocialriskBriefEx(request: QuerySocialriskBriefRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QuerySocialriskBriefResponse> {
    Util.validateModel(request);
    return $tea.cast<QuerySocialriskBriefResponse>(await this.doRequest("1.0", "di.realperson.socialrisk.brief.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QuerySocialriskBriefResponse({}));
  }

  /**
   * Description: 社会安全风险（tob风控版）
   * Summary: 社会安全风险（tob风控版）
   */
  async querySocialriskTobrisk(request: QuerySocialriskTobriskRequest): Promise<QuerySocialriskTobriskResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.querySocialriskTobriskEx(request, headers, runtime);
  }

  /**
   * Description: 社会安全风险（tob风控版）
   * Summary: 社会安全风险（tob风控版）
   */
  async querySocialriskTobriskEx(request: QuerySocialriskTobriskRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QuerySocialriskTobriskResponse> {
    Util.validateModel(request);
    return $tea.cast<QuerySocialriskTobriskResponse>(await this.doRequest("1.0", "di.realperson.socialrisk.tobrisk.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QuerySocialriskTobriskResponse({}));
  }

  /**
   * Description: 纯服务端比对，直接输入待比对的图片，返回比对结果
   * Summary: 纯服务端比对V2版本
   */
  async execFacevrfServermode(request: ExecFacevrfServermodeRequest): Promise<ExecFacevrfServermodeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.execFacevrfServermodeEx(request, headers, runtime);
  }

  /**
   * Description: 纯服务端比对，直接输入待比对的图片，返回比对结果
   * Summary: 纯服务端比对V2版本
   */
  async execFacevrfServermodeEx(request: ExecFacevrfServermodeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExecFacevrfServermodeResponse> {
    if (!Util.isUnset(request.fileObject)) {
      let uploadReq = new CreateAntcloudGatewayxFileUploadRequest({
        authToken: request.authToken,
        apiCode: "di.realperson.facevrf.servermode.exec",
        fileName: request.fileObjectName,
      });
      let uploadResp = await this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
      if (!AntchainUtil.isSuccess(uploadResp.resultCode, "ok")) {
        let execFacevrfServermodeResponse = new ExecFacevrfServermodeResponse({
          reqMsgId: uploadResp.reqMsgId,
          resultCode: uploadResp.resultCode,
          resultMsg: uploadResp.resultMsg,
        });
        return execFacevrfServermodeResponse;
      }

      let uploadHeaders = AntchainUtil.parseUploadHeaders(uploadResp.uploadHeaders);
      await AntchainUtil.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
      request.fileId = uploadResp.fileId;
      request.fileObject = null;
    }

    Util.validateModel(request);
    return $tea.cast<ExecFacevrfServermodeResponse>(await this.doRequest("1.0", "di.realperson.facevrf.servermode.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExecFacevrfServermodeResponse({}));
  }

  /**
   * Description: 银行活跃度
   * Summary: 银行活跃度
   */
  async queryBankLiveness(request: QueryBankLivenessRequest): Promise<QueryBankLivenessResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryBankLivenessEx(request, headers, runtime);
  }

  /**
   * Description: 银行活跃度
   * Summary: 银行活跃度
   */
  async queryBankLivenessEx(request: QueryBankLivenessRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryBankLivenessResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryBankLivenessResponse>(await this.doRequest("1.0", "di.realperson.bank.liveness.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryBankLivenessResponse({}));
  }

  /**
   * Description: 用于阿里云渠道小程序域名的绑定
   * Summary: 新增场景与域名映射
   */
  async createConsoleDomain(request: CreateConsoleDomainRequest): Promise<CreateConsoleDomainResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createConsoleDomainEx(request, headers, runtime);
  }

  /**
   * Description: 用于阿里云渠道小程序域名的绑定
   * Summary: 新增场景与域名映射
   */
  async createConsoleDomainEx(request: CreateConsoleDomainRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateConsoleDomainResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateConsoleDomainResponse>(await this.doRequest("1.0", "di.realperson.console.domain.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateConsoleDomainResponse({}));
  }

  /**
   * Description: 阿里云控制台删除场景与域名映射
   * Summary: 删除场景与域名映射
   */
  async deleteConsoleDomain(request: DeleteConsoleDomainRequest): Promise<DeleteConsoleDomainResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteConsoleDomainEx(request, headers, runtime);
  }

  /**
   * Description: 阿里云控制台删除场景与域名映射
   * Summary: 删除场景与域名映射
   */
  async deleteConsoleDomainEx(request: DeleteConsoleDomainRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteConsoleDomainResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteConsoleDomainResponse>(await this.doRequest("1.0", "di.realperson.console.domain.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteConsoleDomainResponse({}));
  }

  /**
   * Description: 失联修复初始化
   * Summary: 失联修复初始化
   */
  async initCarrierRepairmobile(request: InitCarrierRepairmobileRequest): Promise<InitCarrierRepairmobileResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.initCarrierRepairmobileEx(request, headers, runtime);
  }

  /**
   * Description: 失联修复初始化
   * Summary: 失联修复初始化
   */
  async initCarrierRepairmobileEx(request: InitCarrierRepairmobileRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<InitCarrierRepairmobileResponse> {
    Util.validateModel(request);
    return $tea.cast<InitCarrierRepairmobileResponse>(await this.doRequest("1.0", "di.realperson.carrier.repairmobile.init", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new InitCarrierRepairmobileResponse({}));
  }

  /**
   * Description: 失联修复查询修复结果
   * Summary: 失联修复查询修复结果
   */
  async queryCarrierRepairmobile(request: QueryCarrierRepairmobileRequest): Promise<QueryCarrierRepairmobileResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryCarrierRepairmobileEx(request, headers, runtime);
  }

  /**
   * Description: 失联修复查询修复结果
   * Summary: 失联修复查询修复结果
   */
  async queryCarrierRepairmobileEx(request: QueryCarrierRepairmobileRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryCarrierRepairmobileResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryCarrierRepairmobileResponse>(await this.doRequest("1.0", "di.realperson.carrier.repairmobile.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryCarrierRepairmobileResponse({}));
  }

  /**
   * Description: 失联修复小号绑定
   * Summary: 失联修复小号绑定
   */
  async bindCarrierRepairmobile(request: BindCarrierRepairmobileRequest): Promise<BindCarrierRepairmobileResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.bindCarrierRepairmobileEx(request, headers, runtime);
  }

  /**
   * Description: 失联修复小号绑定
   * Summary: 失联修复小号绑定
   */
  async bindCarrierRepairmobileEx(request: BindCarrierRepairmobileRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BindCarrierRepairmobileResponse> {
    Util.validateModel(request);
    return $tea.cast<BindCarrierRepairmobileResponse>(await this.doRequest("1.0", "di.realperson.carrier.repairmobile.bind", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BindCarrierRepairmobileResponse({}));
  }

  /**
   * Description: 外部机构数据上报
   * Summary: 外部机构数据上报
   */
  async applyExtOrgdata(request: ApplyExtOrgdataRequest): Promise<ApplyExtOrgdataResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.applyExtOrgdataEx(request, headers, runtime);
  }

  /**
   * Description: 外部机构数据上报
   * Summary: 外部机构数据上报
   */
  async applyExtOrgdataEx(request: ApplyExtOrgdataRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ApplyExtOrgdataResponse> {
    Util.validateModel(request);
    return $tea.cast<ApplyExtOrgdataResponse>(await this.doRequest("1.0", "di.realperson.ext.orgdata.apply", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ApplyExtOrgdataResponse({}));
  }

  /**
   * Description: 数科刷脸服务端初始化接口
   * Summary: 数科刷脸服务端初始化接口
   */
  async createFaceverifyServer(request: CreateFaceverifyServerRequest): Promise<CreateFaceverifyServerResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createFaceverifyServerEx(request, headers, runtime);
  }

  /**
   * Description: 数科刷脸服务端初始化接口
   * Summary: 数科刷脸服务端初始化接口
   */
  async createFaceverifyServerEx(request: CreateFaceverifyServerRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateFaceverifyServerResponse> {
    if (!Util.isUnset(request.fileObject)) {
      let uploadReq = new CreateAntcloudGatewayxFileUploadRequest({
        authToken: request.authToken,
        apiCode: "di.realperson.faceverify.server.create",
        fileName: request.fileObjectName,
      });
      let uploadResp = await this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
      if (!AntchainUtil.isSuccess(uploadResp.resultCode, "ok")) {
        let createFaceverifyServerResponse = new CreateFaceverifyServerResponse({
          reqMsgId: uploadResp.reqMsgId,
          resultCode: uploadResp.resultCode,
          resultMsg: uploadResp.resultMsg,
        });
        return createFaceverifyServerResponse;
      }

      let uploadHeaders = AntchainUtil.parseUploadHeaders(uploadResp.uploadHeaders);
      await AntchainUtil.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
      request.fileId = uploadResp.fileId;
      request.fileObject = null;
    }

    Util.validateModel(request);
    return $tea.cast<CreateFaceverifyServerResponse>(await this.doRequest("1.0", "di.realperson.faceverify.server.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateFaceverifyServerResponse({}));
  }

  /**
   * Description: 查询认证的结果和相关信息
   * Summary: 认证查询
   */
  async queryFaceverifyServer(request: QueryFaceverifyServerRequest): Promise<QueryFaceverifyServerResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryFaceverifyServerEx(request, headers, runtime);
  }

  /**
   * Description: 查询认证的结果和相关信息
   * Summary: 认证查询
   */
  async queryFaceverifyServerEx(request: QueryFaceverifyServerRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryFaceverifyServerResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryFaceverifyServerResponse>(await this.doRequest("1.0", "di.realperson.faceverify.server.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryFaceverifyServerResponse({}));
  }

  /**
   * Description: 个人银行卡状态增强版
   * Summary: 个人银行卡状态增强版
   */
  async queryBankLivenessplus(request: QueryBankLivenessplusRequest): Promise<QueryBankLivenessplusResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryBankLivenessplusEx(request, headers, runtime);
  }

  /**
   * Description: 个人银行卡状态增强版
   * Summary: 个人银行卡状态增强版
   */
  async queryBankLivenessplusEx(request: QueryBankLivenessplusRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryBankLivenessplusResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryBankLivenessplusResponse>(await this.doRequest("1.0", "di.realperson.bank.livenessplus.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryBankLivenessplusResponse({}));
  }

  /**
   * Description: 纯服务端比对基础版本，直接输入待比对的图片，返回比对结果
   * Summary: 纯服务端比对基础版
   */
  async execFaceverifyServermode(request: ExecFaceverifyServermodeRequest): Promise<ExecFaceverifyServermodeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.execFaceverifyServermodeEx(request, headers, runtime);
  }

  /**
   * Description: 纯服务端比对基础版本，直接输入待比对的图片，返回比对结果
   * Summary: 纯服务端比对基础版
   */
  async execFaceverifyServermodeEx(request: ExecFaceverifyServermodeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExecFaceverifyServermodeResponse> {
    if (!Util.isUnset(request.fileObject)) {
      let uploadReq = new CreateAntcloudGatewayxFileUploadRequest({
        authToken: request.authToken,
        apiCode: "di.realperson.faceverify.servermode.exec",
        fileName: request.fileObjectName,
      });
      let uploadResp = await this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
      if (!AntchainUtil.isSuccess(uploadResp.resultCode, "ok")) {
        let execFaceverifyServermodeResponse = new ExecFaceverifyServermodeResponse({
          reqMsgId: uploadResp.reqMsgId,
          resultCode: uploadResp.resultCode,
          resultMsg: uploadResp.resultMsg,
        });
        return execFaceverifyServermodeResponse;
      }

      let uploadHeaders = AntchainUtil.parseUploadHeaders(uploadResp.uploadHeaders);
      await AntchainUtil.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
      request.fileId = uploadResp.fileId;
      request.fileObject = null;
    }

    Util.validateModel(request);
    return $tea.cast<ExecFaceverifyServermodeResponse>(await this.doRequest("1.0", "di.realperson.faceverify.servermode.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExecFaceverifyServermodeResponse({}));
  }

  /**
   * Description: 支付宝实人认证初始化接口
   * Summary: 支付宝实人认证初始化接口
   */
  async createAlipayverifyServer(request: CreateAlipayverifyServerRequest): Promise<CreateAlipayverifyServerResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createAlipayverifyServerEx(request, headers, runtime);
  }

  /**
   * Description: 支付宝实人认证初始化接口
   * Summary: 支付宝实人认证初始化接口
   */
  async createAlipayverifyServerEx(request: CreateAlipayverifyServerRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateAlipayverifyServerResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateAlipayverifyServerResponse>(await this.doRequest("1.0", "di.realperson.alipayverify.server.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateAlipayverifyServerResponse({}));
  }

  /**
   * Description: 支付宝实人认证查询接口
   * Summary: 支付宝实人认证查询接口
   */
  async queryAlipayverifyServer(request: QueryAlipayverifyServerRequest): Promise<QueryAlipayverifyServerResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAlipayverifyServerEx(request, headers, runtime);
  }

  /**
   * Description: 支付宝实人认证查询接口
   * Summary: 支付宝实人认证查询接口
   */
  async queryAlipayverifyServerEx(request: QueryAlipayverifyServerRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAlipayverifyServerResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAlipayverifyServerResponse>(await this.doRequest("1.0", "di.realperson.alipayverify.server.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAlipayverifyServerResponse({}));
  }

  /**
   * Description: 车辆资产验证
   * Summary: 车辆资产验证
   */
  async checkCarTwometa(request: CheckCarTwometaRequest): Promise<CheckCarTwometaResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.checkCarTwometaEx(request, headers, runtime);
  }

  /**
   * Description: 车辆资产验证
   * Summary: 车辆资产验证
   */
  async checkCarTwometaEx(request: CheckCarTwometaRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CheckCarTwometaResponse> {
    Util.validateModel(request);
    return $tea.cast<CheckCarTwometaResponse>(await this.doRequest("1.0", "di.realperson.car.twometa.check", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CheckCarTwometaResponse({}));
  }

  /**
   * Description: 学历验证
   * Summary: 学历验证
   */
  async queryEducationBackground(request: QueryEducationBackgroundRequest): Promise<QueryEducationBackgroundResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryEducationBackgroundEx(request, headers, runtime);
  }

  /**
   * Description: 学历验证
   * Summary: 学历验证
   */
  async queryEducationBackgroundEx(request: QueryEducationBackgroundRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryEducationBackgroundResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryEducationBackgroundResponse>(await this.doRequest("1.0", "di.realperson.education.background.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryEducationBackgroundResponse({}));
  }

  /**
   * Description: 个人银行卡状态验证 V4.0
   * Summary: 个人银行卡状态验证 V4.0
   */
  async queryBankLivenessfour(request: QueryBankLivenessfourRequest): Promise<QueryBankLivenessfourResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryBankLivenessfourEx(request, headers, runtime);
  }

  /**
   * Description: 个人银行卡状态验证 V4.0
   * Summary: 个人银行卡状态验证 V4.0
   */
  async queryBankLivenessfourEx(request: QueryBankLivenessfourRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryBankLivenessfourResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryBankLivenessfourResponse>(await this.doRequest("1.0", "di.realperson.bank.livenessfour.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryBankLivenessfourResponse({}));
  }

  /**
   * Description: 查询认证的材料信息
   * Summary: 认证材料查询
   */
  async queryFaceverifyServermaterial(request: QueryFaceverifyServermaterialRequest): Promise<QueryFaceverifyServermaterialResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryFaceverifyServermaterialEx(request, headers, runtime);
  }

  /**
   * Description: 查询认证的材料信息
   * Summary: 认证材料查询
   */
  async queryFaceverifyServermaterialEx(request: QueryFaceverifyServermaterialRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryFaceverifyServermaterialResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryFaceverifyServermaterialResponse>(await this.doRequest("1.0", "di.realperson.faceverify.servermaterial.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryFaceverifyServermaterialResponse({}));
  }

  /**
   * Description: 图片压缩接口
   * Summary: 图片压缩接口
   */
  async scaleinImage(request: ScaleinImageRequest): Promise<ScaleinImageResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.scaleinImageEx(request, headers, runtime);
  }

  /**
   * Description: 图片压缩接口
   * Summary: 图片压缩接口
   */
  async scaleinImageEx(request: ScaleinImageRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ScaleinImageResponse> {
    if (!Util.isUnset(request.fileObject)) {
      let uploadReq = new CreateAntcloudGatewayxFileUploadRequest({
        authToken: request.authToken,
        apiCode: "di.realperson.image.scalein",
        fileName: request.fileObjectName,
      });
      let uploadResp = await this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
      if (!AntchainUtil.isSuccess(uploadResp.resultCode, "ok")) {
        let scaleinImageResponse = new ScaleinImageResponse({
          reqMsgId: uploadResp.reqMsgId,
          resultCode: uploadResp.resultCode,
          resultMsg: uploadResp.resultMsg,
        });
        return scaleinImageResponse;
      }

      let uploadHeaders = AntchainUtil.parseUploadHeaders(uploadResp.uploadHeaders);
      await AntchainUtil.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
      request.fileId = uploadResp.fileId;
      request.fileObject = null;
    }

    Util.validateModel(request);
    return $tea.cast<ScaleinImageResponse>(await this.doRequest("1.0", "di.realperson.image.scalein", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ScaleinImageResponse({}));
  }

  /**
   * Description: 要素卡证OCR
   * Summary: 要素卡证OCR
   */
  async recognizeOcrIndividualcard(request: RecognizeOcrIndividualcardRequest): Promise<RecognizeOcrIndividualcardResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.recognizeOcrIndividualcardEx(request, headers, runtime);
  }

  /**
   * Description: 要素卡证OCR
   * Summary: 要素卡证OCR
   */
  async recognizeOcrIndividualcardEx(request: RecognizeOcrIndividualcardRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<RecognizeOcrIndividualcardResponse> {
    if (!Util.isUnset(request.fileObject)) {
      let uploadReq = new CreateAntcloudGatewayxFileUploadRequest({
        authToken: request.authToken,
        apiCode: "di.realperson.ocr.individualcard.recognize",
        fileName: request.fileObjectName,
      });
      let uploadResp = await this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
      if (!AntchainUtil.isSuccess(uploadResp.resultCode, "ok")) {
        let recognizeOcrIndividualcardResponse = new RecognizeOcrIndividualcardResponse({
          reqMsgId: uploadResp.reqMsgId,
          resultCode: uploadResp.resultCode,
          resultMsg: uploadResp.resultMsg,
        });
        return recognizeOcrIndividualcardResponse;
      }

      let uploadHeaders = AntchainUtil.parseUploadHeaders(uploadResp.uploadHeaders);
      await AntchainUtil.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
      request.fileId = uploadResp.fileId;
      request.fileObject = null;
    }

    Util.validateModel(request);
    return $tea.cast<RecognizeOcrIndividualcardResponse>(await this.doRequest("1.0", "di.realperson.ocr.individualcard.recognize", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new RecognizeOcrIndividualcardResponse({}));
  }

  /**
   * Description: 个人四要素认证
   * Summary: 个人四要素认证
   */
  async checkIdcardFourmeta(request: CheckIdcardFourmetaRequest): Promise<CheckIdcardFourmetaResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.checkIdcardFourmetaEx(request, headers, runtime);
  }

  /**
   * Description: 个人四要素认证
   * Summary: 个人四要素认证
   */
  async checkIdcardFourmetaEx(request: CheckIdcardFourmetaRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CheckIdcardFourmetaResponse> {
    Util.validateModel(request);
    return $tea.cast<CheckIdcardFourmetaResponse>(await this.doRequest("1.0", "di.realperson.idcard.fourmeta.check", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CheckIdcardFourmetaResponse({}));
  }

  /**
   * Description: 车辆资产验证详版
   * Summary: 车辆资产验证详版
   */
  async queryCarinfoDetail(request: QueryCarinfoDetailRequest): Promise<QueryCarinfoDetailResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryCarinfoDetailEx(request, headers, runtime);
  }

  /**
   * Description: 车辆资产验证详版
   * Summary: 车辆资产验证详版
   */
  async queryCarinfoDetailEx(request: QueryCarinfoDetailRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryCarinfoDetailResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryCarinfoDetailResponse>(await this.doRequest("1.0", "di.realperson.carinfo.detail.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryCarinfoDetailResponse({}));
  }

  /**
   * Description: 车辆资产验证简版
   * Summary: 车辆资产验证简版
   */
  async queryCarinfoBrief(request: QueryCarinfoBriefRequest): Promise<QueryCarinfoBriefResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryCarinfoBriefEx(request, headers, runtime);
  }

  /**
   * Description: 车辆资产验证简版
   * Summary: 车辆资产验证简版
   */
  async queryCarinfoBriefEx(request: QueryCarinfoBriefRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryCarinfoBriefResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryCarinfoBriefResponse>(await this.doRequest("1.0", "di.realperson.carinfo.brief.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryCarinfoBriefResponse({}));
  }

  /**
   * Description: 银行卡代扣预绑定
   * Summary: 银行卡代扣预绑定
   */
  async bindCutpaymentPre(request: BindCutpaymentPreRequest): Promise<BindCutpaymentPreResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.bindCutpaymentPreEx(request, headers, runtime);
  }

  /**
   * Description: 银行卡代扣预绑定
   * Summary: 银行卡代扣预绑定
   */
  async bindCutpaymentPreEx(request: BindCutpaymentPreRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BindCutpaymentPreResponse> {
    Util.validateModel(request);
    return $tea.cast<BindCutpaymentPreResponse>(await this.doRequest("1.0", "di.realperson.cutpayment.pre.bind", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BindCutpaymentPreResponse({}));
  }

  /**
   * Description: 银行卡代扣绑卡签约
   * Summary: 银行卡代扣绑卡签约
   */
  async bindCutpaymentSign(request: BindCutpaymentSignRequest): Promise<BindCutpaymentSignResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.bindCutpaymentSignEx(request, headers, runtime);
  }

  /**
   * Description: 银行卡代扣绑卡签约
   * Summary: 银行卡代扣绑卡签约
   */
  async bindCutpaymentSignEx(request: BindCutpaymentSignRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BindCutpaymentSignResponse> {
    Util.validateModel(request);
    return $tea.cast<BindCutpaymentSignResponse>(await this.doRequest("1.0", "di.realperson.cutpayment.sign.bind", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BindCutpaymentSignResponse({}));
  }

  /**
   * Description: 银行卡代扣解绑
   * Summary: 银行卡代扣解绑
   */
  async unbindCutpaymentSign(request: UnbindCutpaymentSignRequest): Promise<UnbindCutpaymentSignResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.unbindCutpaymentSignEx(request, headers, runtime);
  }

  /**
   * Description: 银行卡代扣解绑
   * Summary: 银行卡代扣解绑
   */
  async unbindCutpaymentSignEx(request: UnbindCutpaymentSignRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UnbindCutpaymentSignResponse> {
    Util.validateModel(request);
    return $tea.cast<UnbindCutpaymentSignResponse>(await this.doRequest("1.0", "di.realperson.cutpayment.sign.unbind", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UnbindCutpaymentSignResponse({}));
  }

  /**
   * Description: 银行卡代扣绑定结果查询
   * Summary: 银行卡代扣绑定结果查询
   */
  async queryCutpaymentBind(request: QueryCutpaymentBindRequest): Promise<QueryCutpaymentBindResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryCutpaymentBindEx(request, headers, runtime);
  }

  /**
   * Description: 银行卡代扣绑定结果查询
   * Summary: 银行卡代扣绑定结果查询
   */
  async queryCutpaymentBindEx(request: QueryCutpaymentBindRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryCutpaymentBindResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryCutpaymentBindResponse>(await this.doRequest("1.0", "di.realperson.cutpayment.bind.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryCutpaymentBindResponse({}));
  }

  /**
   * Description: 银行卡代扣支付分账扣款
   * Summary: 银行卡代扣支付分账扣款
   */
  async applyCutpaymentPayment(request: ApplyCutpaymentPaymentRequest): Promise<ApplyCutpaymentPaymentResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.applyCutpaymentPaymentEx(request, headers, runtime);
  }

  /**
   * Description: 银行卡代扣支付分账扣款
   * Summary: 银行卡代扣支付分账扣款
   */
  async applyCutpaymentPaymentEx(request: ApplyCutpaymentPaymentRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ApplyCutpaymentPaymentResponse> {
    Util.validateModel(request);
    return $tea.cast<ApplyCutpaymentPaymentResponse>(await this.doRequest("1.0", "di.realperson.cutpayment.payment.apply", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ApplyCutpaymentPaymentResponse({}));
  }

  /**
   * Description: 银行卡代扣支付分账查询
   * Summary: 银行卡代扣支付分账查询
   */
  async queryCutpaymentPayment(request: QueryCutpaymentPaymentRequest): Promise<QueryCutpaymentPaymentResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryCutpaymentPaymentEx(request, headers, runtime);
  }

  /**
   * Description: 银行卡代扣支付分账查询
   * Summary: 银行卡代扣支付分账查询
   */
  async queryCutpaymentPaymentEx(request: QueryCutpaymentPaymentRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryCutpaymentPaymentResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryCutpaymentPaymentResponse>(await this.doRequest("1.0", "di.realperson.cutpayment.payment.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryCutpaymentPaymentResponse({}));
  }

  /**
   * Description: 银行卡代扣退款申请
   * Summary: 银行卡代扣退款申请
   */
  async applyCutpaymentRefund(request: ApplyCutpaymentRefundRequest): Promise<ApplyCutpaymentRefundResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.applyCutpaymentRefundEx(request, headers, runtime);
  }

  /**
   * Description: 银行卡代扣退款申请
   * Summary: 银行卡代扣退款申请
   */
  async applyCutpaymentRefundEx(request: ApplyCutpaymentRefundRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ApplyCutpaymentRefundResponse> {
    Util.validateModel(request);
    return $tea.cast<ApplyCutpaymentRefundResponse>(await this.doRequest("1.0", "di.realperson.cutpayment.refund.apply", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ApplyCutpaymentRefundResponse({}));
  }

  /**
   * Description: 银行卡代扣退款查询
   * Summary: 银行卡代扣退款查询
   */
  async queryCutpaymentRefund(request: QueryCutpaymentRefundRequest): Promise<QueryCutpaymentRefundResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryCutpaymentRefundEx(request, headers, runtime);
  }

  /**
   * Description: 银行卡代扣退款查询
   * Summary: 银行卡代扣退款查询
   */
  async queryCutpaymentRefundEx(request: QueryCutpaymentRefundRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryCutpaymentRefundResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryCutpaymentRefundResponse>(await this.doRequest("1.0", "di.realperson.cutpayment.refund.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryCutpaymentRefundResponse({}));
  }

  /**
   * Description: 银行卡代扣对账
   * Summary: 银行卡代扣对账
   */
  async queryCutpaymentStatement(request: QueryCutpaymentStatementRequest): Promise<QueryCutpaymentStatementResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryCutpaymentStatementEx(request, headers, runtime);
  }

  /**
   * Description: 银行卡代扣对账
   * Summary: 银行卡代扣对账
   */
  async queryCutpaymentStatementEx(request: QueryCutpaymentStatementRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryCutpaymentStatementResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryCutpaymentStatementResponse>(await this.doRequest("1.0", "di.realperson.cutpayment.statement.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryCutpaymentStatementResponse({}));
  }

  /**
   * Description: 人像、证件号、姓名比对接口
   * Summary: 人像、证件号、姓名比对
   */
  async execFaceThreemeta(request: ExecFaceThreemetaRequest): Promise<ExecFaceThreemetaResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.execFaceThreemetaEx(request, headers, runtime);
  }

  /**
   * Description: 人像、证件号、姓名比对接口
   * Summary: 人像、证件号、姓名比对
   */
  async execFaceThreemetaEx(request: ExecFaceThreemetaRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExecFaceThreemetaResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecFaceThreemetaResponse>(await this.doRequest("1.0", "di.realperson.face.threemeta.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExecFaceThreemetaResponse({}));
  }

  /**
   * Description: 用户资产验证-车辆资产验证旗舰版
   * Summary: 用户资产验证-车辆资产验证旗舰版
   */
  async queryCarinfoUltimate(request: QueryCarinfoUltimateRequest): Promise<QueryCarinfoUltimateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryCarinfoUltimateEx(request, headers, runtime);
  }

  /**
   * Description: 用户资产验证-车辆资产验证旗舰版
   * Summary: 用户资产验证-车辆资产验证旗舰版
   */
  async queryCarinfoUltimateEx(request: QueryCarinfoUltimateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryCarinfoUltimateResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryCarinfoUltimateResponse>(await this.doRequest("1.0", "di.realperson.carinfo.ultimate.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryCarinfoUltimateResponse({}));
  }

  /**
   * Description: 用户资产验证-车辆资产验证增强版
   * Summary: 用户资产验证-车辆资产验证增强版
   */
  async queryCarinfoPlus(request: QueryCarinfoPlusRequest): Promise<QueryCarinfoPlusResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryCarinfoPlusEx(request, headers, runtime);
  }

  /**
   * Description: 用户资产验证-车辆资产验证增强版
   * Summary: 用户资产验证-车辆资产验证增强版
   */
  async queryCarinfoPlusEx(request: QueryCarinfoPlusRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryCarinfoPlusResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryCarinfoPlusResponse>(await this.doRequest("1.0", "di.realperson.carinfo.plus.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryCarinfoPlusResponse({}));
  }

  /**
   * Description: 银行卡代扣二级租户开户
   * Summary: 银行卡代扣二级租户开户
   */
  async openCutpaymentsubAccount(request: OpenCutpaymentsubAccountRequest): Promise<OpenCutpaymentsubAccountResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.openCutpaymentsubAccountEx(request, headers, runtime);
  }

  /**
   * Description: 银行卡代扣二级租户开户
   * Summary: 银行卡代扣二级租户开户
   */
  async openCutpaymentsubAccountEx(request: OpenCutpaymentsubAccountRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<OpenCutpaymentsubAccountResponse> {
    Util.validateModel(request);
    return $tea.cast<OpenCutpaymentsubAccountResponse>(await this.doRequest("1.0", "di.realperson.cutpaymentsub.account.open", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new OpenCutpaymentsubAccountResponse({}));
  }

  /**
   * Description: 银行卡代扣二级租户查询开户状态
   * Summary: 银行卡代扣二级租户查询开户状态
   */
  async queryCutpaymentsubAccount(request: QueryCutpaymentsubAccountRequest): Promise<QueryCutpaymentsubAccountResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryCutpaymentsubAccountEx(request, headers, runtime);
  }

  /**
   * Description: 银行卡代扣二级租户查询开户状态
   * Summary: 银行卡代扣二级租户查询开户状态
   */
  async queryCutpaymentsubAccountEx(request: QueryCutpaymentsubAccountRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryCutpaymentsubAccountResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryCutpaymentsubAccountResponse>(await this.doRequest("1.0", "di.realperson.cutpaymentsub.account.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryCutpaymentsubAccountResponse({}));
  }

  /**
   * Description: 银行卡代扣二级租户分账
   * Summary: 银行卡代扣二级租户分账
   */
  async transferCutpaymentsubRevenue(request: TransferCutpaymentsubRevenueRequest): Promise<TransferCutpaymentsubRevenueResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.transferCutpaymentsubRevenueEx(request, headers, runtime);
  }

  /**
   * Description: 银行卡代扣二级租户分账
   * Summary: 银行卡代扣二级租户分账
   */
  async transferCutpaymentsubRevenueEx(request: TransferCutpaymentsubRevenueRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<TransferCutpaymentsubRevenueResponse> {
    Util.validateModel(request);
    return $tea.cast<TransferCutpaymentsubRevenueResponse>(await this.doRequest("1.0", "di.realperson.cutpaymentsub.revenue.transfer", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new TransferCutpaymentsubRevenueResponse({}));
  }

  /**
   * Description: 银行卡代扣二级租户查询分账
   * Summary: 银行卡代扣二级租户查询分账
   */
  async queryCutpaymentsubRevenue(request: QueryCutpaymentsubRevenueRequest): Promise<QueryCutpaymentsubRevenueResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryCutpaymentsubRevenueEx(request, headers, runtime);
  }

  /**
   * Description: 银行卡代扣二级租户查询分账
   * Summary: 银行卡代扣二级租户查询分账
   */
  async queryCutpaymentsubRevenueEx(request: QueryCutpaymentsubRevenueRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryCutpaymentsubRevenueResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryCutpaymentsubRevenueResponse>(await this.doRequest("1.0", "di.realperson.cutpaymentsub.revenue.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryCutpaymentsubRevenueResponse({}));
  }

  /**
   * Description: 银行卡代扣二级租户提现
   * Summary: 银行卡代扣二级租户提现
   */
  async captureCutpaymentsubWithdrawal(request: CaptureCutpaymentsubWithdrawalRequest): Promise<CaptureCutpaymentsubWithdrawalResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.captureCutpaymentsubWithdrawalEx(request, headers, runtime);
  }

  /**
   * Description: 银行卡代扣二级租户提现
   * Summary: 银行卡代扣二级租户提现
   */
  async captureCutpaymentsubWithdrawalEx(request: CaptureCutpaymentsubWithdrawalRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CaptureCutpaymentsubWithdrawalResponse> {
    Util.validateModel(request);
    return $tea.cast<CaptureCutpaymentsubWithdrawalResponse>(await this.doRequest("1.0", "di.realperson.cutpaymentsub.withdrawal.capture", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CaptureCutpaymentsubWithdrawalResponse({}));
  }

  /**
   * Description: 银行卡代扣二级租户提现查询
   * Summary: 银行卡代扣二级租户提现查询
   */
  async queryCutpaymentsubWithdrawal(request: QueryCutpaymentsubWithdrawalRequest): Promise<QueryCutpaymentsubWithdrawalResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryCutpaymentsubWithdrawalEx(request, headers, runtime);
  }

  /**
   * Description: 银行卡代扣二级租户提现查询
   * Summary: 银行卡代扣二级租户提现查询
   */
  async queryCutpaymentsubWithdrawalEx(request: QueryCutpaymentsubWithdrawalRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryCutpaymentsubWithdrawalResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryCutpaymentsubWithdrawalResponse>(await this.doRequest("1.0", "di.realperson.cutpaymentsub.withdrawal.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryCutpaymentsubWithdrawalResponse({}));
  }

  /**
   * Description: 银行卡代扣二级租户查询余额
   * Summary: 银行卡代扣二级租户查询余额
   */
  async queryCutpaymentsubBalance(request: QueryCutpaymentsubBalanceRequest): Promise<QueryCutpaymentsubBalanceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryCutpaymentsubBalanceEx(request, headers, runtime);
  }

  /**
   * Description: 银行卡代扣二级租户查询余额
   * Summary: 银行卡代扣二级租户查询余额
   */
  async queryCutpaymentsubBalanceEx(request: QueryCutpaymentsubBalanceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryCutpaymentsubBalanceResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryCutpaymentsubBalanceResponse>(await this.doRequest("1.0", "di.realperson.cutpaymentsub.balance.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryCutpaymentsubBalanceResponse({}));
  }

  /**
   * Description: 银行卡代扣二级租户查询收支明细
   * Summary: 银行卡代扣二级租户查询收支明细
   */
  async queryCutpaymentsubTransaction(request: QueryCutpaymentsubTransactionRequest): Promise<QueryCutpaymentsubTransactionResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryCutpaymentsubTransactionEx(request, headers, runtime);
  }

  /**
   * Description: 银行卡代扣二级租户查询收支明细
   * Summary: 银行卡代扣二级租户查询收支明细
   */
  async queryCutpaymentsubTransactionEx(request: QueryCutpaymentsubTransactionRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryCutpaymentsubTransactionResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryCutpaymentsubTransactionResponse>(await this.doRequest("1.0", "di.realperson.cutpaymentsub.transaction.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryCutpaymentsubTransactionResponse({}));
  }

  /**
   * Description: 提供私有化刷脸的风险咨询
   * Summary: 人脸风险咨询服务
   */
  async queryRiskServer(request: QueryRiskServerRequest): Promise<QueryRiskServerResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryRiskServerEx(request, headers, runtime);
  }

  /**
   * Description: 提供私有化刷脸的风险咨询
   * Summary: 人脸风险咨询服务
   */
  async queryRiskServerEx(request: QueryRiskServerRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryRiskServerResponse> {
    if (!Util.isUnset(request.fileObject)) {
      let uploadReq = new CreateAntcloudGatewayxFileUploadRequest({
        authToken: request.authToken,
        apiCode: "di.realperson.risk.server.query",
        fileName: request.fileObjectName,
      });
      let uploadResp = await this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
      if (!AntchainUtil.isSuccess(uploadResp.resultCode, "ok")) {
        let queryRiskServerResponse = new QueryRiskServerResponse({
          reqMsgId: uploadResp.reqMsgId,
          resultCode: uploadResp.resultCode,
          resultMsg: uploadResp.resultMsg,
        });
        return queryRiskServerResponse;
      }

      let uploadHeaders = AntchainUtil.parseUploadHeaders(uploadResp.uploadHeaders);
      await AntchainUtil.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
      request.fileId = uploadResp.fileId;
      request.fileObject = null;
    }

    Util.validateModel(request);
    return $tea.cast<QueryRiskServerResponse>(await this.doRequest("1.0", "di.realperson.risk.server.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryRiskServerResponse({}));
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
