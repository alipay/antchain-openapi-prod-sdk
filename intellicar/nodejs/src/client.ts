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

// 高德潜客uv指数
export class GdCustomerUv extends $tea.Model {
  // uv指数数量
  total: number;
  // uv指数数量
  count: number;
  // uv指数排序
  // 
  sort: number;
  static names(): { [key: string]: string } {
    return {
      total: 'total',
      count: 'count',
      sort: 'sort',
    };
  }

  static types(): { [key: string]: any } {
    return {
      total: 'number',
      count: 'number',
      sort: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 高德潜客record重叠指数pv指数
export class GdCustomerPv extends $tea.Model {
  // 重叠指数pv历史指数数量（时间类型为季度、半年、年时，不展示）
  total: number;
  // 重叠指数pv指数数量
  count: number;
  // 重叠指数pv指数排序
  sort: number;
  static names(): { [key: string]: string } {
    return {
      total: 'total',
      count: 'count',
      sort: 'sort',
    };
  }

  static types(): { [key: string]: any } {
    return {
      total: 'number',
      count: 'number',
      sort: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 高德流出指数
export class GdDest extends $tea.Model {
  // 流出指数uv指数
  uv: GdCustomerUv;
  // 流出指数pv指数
  pv: GdCustomerPv;
  // 流出品牌id
  brandId: string;
  // 流出店铺id，数据类型为店铺时返回该属性与值
  shopId: string;
  // 城市编码，数据类型为店铺或者城市时返回该属性与值
  citycode: string;
  static names(): { [key: string]: string } {
    return {
      uv: 'uv',
      pv: 'pv',
      brandId: 'brand_id',
      shopId: 'shop_id',
      citycode: 'citycode',
    };
  }

  static types(): { [key: string]: any } {
    return {
      uv: GdCustomerUv,
      pv: GdCustomerPv,
      brandId: 'string',
      shopId: 'string',
      citycode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 高德潜客record流入指数
export class GdSrc extends $tea.Model {
  // 流入指数uv指数
  uv: GdCustomerUv;
  // 流入指数pv指数
  pv: GdCustomerPv;
  // 流入品牌id
  brandId: string;
  // 流入店铺id，数据类型为店铺时返回该属性与值
  shopId: string;
  // 流入城市编码，数据类型为店铺或者城市时返回该属性与值
  citycode: string;
  static names(): { [key: string]: string } {
    return {
      uv: 'uv',
      pv: 'pv',
      brandId: 'brand_id',
      shopId: 'shop_id',
      citycode: 'citycode',
    };
  }

  static types(): { [key: string]: any } {
    return {
      uv: GdCustomerUv,
      pv: GdCustomerPv,
      brandId: 'string',
      shopId: 'string',
      citycode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 高德潜客record重叠指数
export class Overlap extends $tea.Model {
  // 重叠指数uv指数
  uv: GdCustomerUv;
  // 重叠指数pv指数
  pv: GdCustomerPv;
  // 重叠品牌id
  brandId: string;
  // 重叠店铺id，数据类型为店铺时返回该属性与值
  shopId: string;
  // 重叠城市编码，数据类型为城市时返回该属性与值
  citycode: string;
  static names(): { [key: string]: string } {
    return {
      uv: 'uv',
      pv: 'pv',
      brandId: 'brand_id',
      shopId: 'shop_id',
      citycode: 'citycode',
    };
  }

  static types(): { [key: string]: any } {
    return {
      uv: GdCustomerUv,
      pv: GdCustomerPv,
      brandId: 'string',
      shopId: 'string',
      citycode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 用户信息
export class CarUserInfo extends $tea.Model {
  // 唯一标识用户的id
  userId: string;
  // 手机号
  phoneNum: string;
  // 城市编码
  cityCode: string;
  // 姓名
  userCertName?: string;
  // 证件号码
  userCertNo?: string;
  // 性别
  userGender?: string;
  // 昵称
  nick?: string;
  static names(): { [key: string]: string } {
    return {
      userId: 'user_id',
      phoneNum: 'phone_num',
      cityCode: 'city_code',
      userCertName: 'user_cert_name',
      userCertNo: 'user_cert_no',
      userGender: 'user_gender',
      nick: 'nick',
    };
  }

  static types(): { [key: string]: any } {
    return {
      userId: 'string',
      phoneNum: 'string',
      cityCode: 'string',
      userCertName: 'string',
      userCertNo: 'string',
      userGender: 'string',
      nick: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 城市列表
export class SpecList extends $tea.Model {
  // 品牌Id
  brandId: string;
  // 品牌名称
  brandName: string;
  // 厂商id
  factoryId: string;
  // 厂商名称
  factoryName: string;
  // 车系id
  seriesId: string;
  // 车系名称
  seriesName: string;
  // 车型Id
  specId: string;
  // 车型名称
  specName: string;
  static names(): { [key: string]: string } {
    return {
      brandId: 'brand_id',
      brandName: 'brand_name',
      factoryId: 'factory_id',
      factoryName: 'factory_name',
      seriesId: 'series_id',
      seriesName: 'series_name',
      specId: 'spec_id',
      specName: 'spec_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      brandId: 'string',
      brandName: 'string',
      factoryId: 'string',
      factoryName: 'string',
      seriesId: 'string',
      seriesName: 'string',
      specId: 'string',
      specName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 电池报告返回数据详情
export class BatteryReportData extends $tea.Model {
  // VIN码
  vinCode: string;
  // 评估时间，报告生成时间 yyyy-MM-dd HH:mm:ss
  evaluateTime: string;
  // 当前 SOH（%），数值 0-100
  currentSoh: string;
  // SOH 评级：优秀 100-95 良好 95-90 中等 90-85 较差 85-80 差 80 以下
  sohLvStr: string;
  // 电池衰退水平值
  volumeScoreRecession: string;
  // 安全风险水平：低 较低 较高 高
  volumeScoreRecessionLvStr: string;
  // 安全风险水平解读文案
  volumeScoreRecessionNarrate: string;
  // 保障状态 0：未保障 1：保障中 2：保障结束
  safeguardStatus: number;
  // 保障截止期 yyyy-MM-dd HH:mm:ss
  safeguardEndTime: string;
  // 本轮首检 SOH（%）数值 0-100
  initialSoh: string;
  // 本轮首检 评估时间 yyyy-MM-dd HH:mm:ss
  initialSohEvaluateTime: string;
  // 本轮首检 充电单号
  initialChargeSeq: string;
  // 触发赔付 SOH（%），数值 0-100
  sageguardMaxSubSoh: string;
  // 是否触发赔付，当前 SOH≤触发赔付 SOH 时为 true
  compensationTriggered: boolean;
  // SOH 衰退预测-X 轴标题（年）
  yearSohTitle: string[];
  // 本车电池衰退预测，逐年 SOH（%）
  curEstimateYearSoh: string[];
  // 同类型车电池衰退预测，逐年 SOH（%）
  peerEstimateYearSoh: string[];
  // 电池厂商
  batteryManufacturer: string;
  // 标称能量，单位 kWh
  nominalEnergy: string;
  // 标称容量，单位 Ah
  rateCapacity: string;
  // 电池类型
  batteryType: string;
  // 车辆生产年份
  manufacturerDate: string;
  // 权益说明文案
  rightsDesc: string;
  static names(): { [key: string]: string } {
    return {
      vinCode: 'vin_code',
      evaluateTime: 'evaluate_time',
      currentSoh: 'current_soh',
      sohLvStr: 'soh_lv_str',
      volumeScoreRecession: 'volume_score_recession',
      volumeScoreRecessionLvStr: 'volume_score_recession_lv_str',
      volumeScoreRecessionNarrate: 'volume_score_recession_narrate',
      safeguardStatus: 'safeguard_status',
      safeguardEndTime: 'safeguard_end_time',
      initialSoh: 'initial_soh',
      initialSohEvaluateTime: 'initial_soh_evaluate_time',
      initialChargeSeq: 'initial_charge_seq',
      sageguardMaxSubSoh: 'sageguard_max_sub_soh',
      compensationTriggered: 'compensation_triggered',
      yearSohTitle: 'year_soh_title',
      curEstimateYearSoh: 'cur_estimate_year_soh',
      peerEstimateYearSoh: 'peer_estimate_year_soh',
      batteryManufacturer: 'battery_manufacturer',
      nominalEnergy: 'nominal_energy',
      rateCapacity: 'rate_capacity',
      batteryType: 'battery_type',
      manufacturerDate: 'manufacturer_date',
      rightsDesc: 'rights_desc',
    };
  }

  static types(): { [key: string]: any } {
    return {
      vinCode: 'string',
      evaluateTime: 'string',
      currentSoh: 'string',
      sohLvStr: 'string',
      volumeScoreRecession: 'string',
      volumeScoreRecessionLvStr: 'string',
      volumeScoreRecessionNarrate: 'string',
      safeguardStatus: 'number',
      safeguardEndTime: 'string',
      initialSoh: 'string',
      initialSohEvaluateTime: 'string',
      initialChargeSeq: 'string',
      sageguardMaxSubSoh: 'string',
      compensationTriggered: 'boolean',
      yearSohTitle: { 'type': 'array', 'itemType': 'string' },
      curEstimateYearSoh: { 'type': 'array', 'itemType': 'string' },
      peerEstimateYearSoh: { 'type': 'array', 'itemType': 'string' },
      batteryManufacturer: 'string',
      nominalEnergy: 'string',
      rateCapacity: 'string',
      batteryType: 'string',
      manufacturerDate: 'string',
      rightsDesc: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 高德数据集合内record
export class GdCustomersRecord extends $tea.Model {
  // 城市编码，数据类型为店铺或者城市时返回该属性与值
  citycode: string;
  // 品牌id
  brandId: string;
  // 店铺id，数据类型为店铺或者店铺品牌时返回该属性与值
  shopId: string;
  // 时间（时间类型为天时：yyyyMMdd；时间类型为周时：yyyyWW；时间类型为月时：yyyyMM）
  time: string;
  // 重叠指数集合
  overlapList: Overlap[];
  // 重叠指数集合条数
  overlapListNum: string;
  // 流入指数集合
  srcList: GdSrc[];
  // 流入指数条数
  srcListNum: string;
  // 流出指数集合
  destList: GdDest;
  // 流出指数条数
  destListNum: string;
  static names(): { [key: string]: string } {
    return {
      citycode: 'citycode',
      brandId: 'brand_id',
      shopId: 'shop_id',
      time: 'time',
      overlapList: 'overlap_list',
      overlapListNum: 'overlap_list_num',
      srcList: 'src_list',
      srcListNum: 'src_list_num',
      destList: 'dest_list',
      destListNum: 'dest_list_num',
    };
  }

  static types(): { [key: string]: any } {
    return {
      citycode: 'string',
      brandId: 'string',
      shopId: 'string',
      time: 'string',
      overlapList: { 'type': 'array', 'itemType': Overlap },
      overlapListNum: 'string',
      srcList: { 'type': 'array', 'itemType': GdSrc },
      srcListNum: 'string',
      destList: GdDest,
      destListNum: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 汽车之家城市信息
export class CityResult extends $tea.Model {
  // 城市Id
  cityId: string;
  // 城市名称
  cityName: string;
  static names(): { [key: string]: string } {
    return {
      cityId: 'city_id',
      cityName: 'city_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      cityId: 'string',
      cityName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 新车线索集合
export class NewCarInfo extends $tea.Model {
  // 车系
  carSeries: string;
  // 金融方案
  finaicalPlan?: string;
  // 车系id
  carSeriesId?: string;
  // 请求提交唯一id
  submitId?: string;
  // 预计购买时间
  purcharseTime?: string;
  // 用户信息
  userInfo: CarUserInfo;
  // 懂车帝或者汽车之家
  matchSource?: string;
  // 汽车之家车型id
  qcCarSeriesId?: string;
  static names(): { [key: string]: string } {
    return {
      carSeries: 'car_series',
      finaicalPlan: 'finaical_plan',
      carSeriesId: 'car_series_id',
      submitId: 'submit_id',
      purcharseTime: 'purcharse_time',
      userInfo: 'user_info',
      matchSource: 'match_source',
      qcCarSeriesId: 'qc_car_series_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      carSeries: 'string',
      finaicalPlan: 'string',
      carSeriesId: 'string',
      submitId: 'string',
      purcharseTime: 'string',
      userInfo: CarUserInfo,
      matchSource: 'string',
      qcCarSeriesId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 电池衰退报告结果
export class BatteryReportResult extends $tea.Model {
  // 订单号 (可使用该 ID 将报告转图片)
  orderId: string;
  // 保障码，VIN 在 7 天内首次检测时生成，每轮保障采用同一保障码
  guaranteeCode: string;
  // 当前充电单号
  currentStartChargeSeq: string;
  // 是否计费
  charge: boolean;
  // 检测类型 6601：首检 6602：复核
  checkType: number;
  // 报告数据
  data: BatteryReportData;
  static names(): { [key: string]: string } {
    return {
      orderId: 'order_id',
      guaranteeCode: 'guarantee_code',
      currentStartChargeSeq: 'current_start_charge_seq',
      charge: 'charge',
      checkType: 'check_type',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      orderId: 'string',
      guaranteeCode: 'string',
      currentStartChargeSeq: 'string',
      charge: 'boolean',
      checkType: 'number',
      data: BatteryReportData,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 车信息
export class BasicCarInfo extends $tea.Model {
  // 车牌号
  licenseNo: string;
  // 车架号
  vin: string;
  // 发动机号
  engineNo: string;
  // 初登日期
  registerDate: string;
  // 车辆型号
  modelCode: string;
  // 营运性质
  useNatureCode: string;
  // 是否抵押
  mortgage?: boolean;
  static names(): { [key: string]: string } {
    return {
      licenseNo: 'license_no',
      vin: 'vin',
      engineNo: 'engine_no',
      registerDate: 'register_date',
      modelCode: 'model_code',
      useNatureCode: 'use_nature_code',
      mortgage: 'mortgage',
    };
  }

  static types(): { [key: string]: any } {
    return {
      licenseNo: 'string',
      vin: 'string',
      engineNo: 'string',
      registerDate: 'string',
      modelCode: 'string',
      useNatureCode: 'string',
      mortgage: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 用户基本信息
export class CarOwnerUserInfo extends $tea.Model {
  // 用户id
  userId: string;
  // 手机号
  phoneNum: string;
  static names(): { [key: string]: string } {
    return {
      userId: 'user_id',
      phoneNum: 'phone_num',
    };
  }

  static types(): { [key: string]: any } {
    return {
      userId: 'string',
      phoneNum: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 车辆业务价格
export class CarBusinessPrice extends $tea.Model {
  // 品牌id
  brandId?: string;
  // 品牌名称
  brandName?: string;
  // 车系id
  carSeriesId?: string;
  // 车系名称
  carSeries?: string;
  // 车型id
  carId?: string;
  // 车型名称
  carName?: string;
  // 年款
  carYear?: string;
  // 城市code
  cityCode?: string;
  // 城市名称
  cityName?: string;
  // 车系指导价（范围值） 单位到分
  seriesGuidePrice?: string;
  // 车型指导价（具体值）单位到分
  officialPrice?: number;
  // 车主成交价（具体值）单位到分
  fullPrice?: number;
  // 车主裸车价（具体值）单位到分
  nakedPrice?: number;
  // 购置税（具体值）单位到分
  purchaseTax?: number;
  // 车船税（具体值）单位到分
  vehicleVesselTax?: number;
  // 商业险（具体值）单位到分
  businessInsurance?: number;
  // json 扩展字段
  extraContent?: string;
  static names(): { [key: string]: string } {
    return {
      brandId: 'brand_id',
      brandName: 'brand_name',
      carSeriesId: 'car_series_id',
      carSeries: 'car_series',
      carId: 'car_id',
      carName: 'car_name',
      carYear: 'car_year',
      cityCode: 'city_code',
      cityName: 'city_name',
      seriesGuidePrice: 'series_guide_price',
      officialPrice: 'official_price',
      fullPrice: 'full_price',
      nakedPrice: 'naked_price',
      purchaseTax: 'purchase_tax',
      vehicleVesselTax: 'vehicle_vessel_tax',
      businessInsurance: 'business_insurance',
      extraContent: 'extra_content',
    };
  }

  static types(): { [key: string]: any } {
    return {
      brandId: 'string',
      brandName: 'string',
      carSeriesId: 'string',
      carSeries: 'string',
      carId: 'string',
      carName: 'string',
      carYear: 'string',
      cityCode: 'string',
      cityName: 'string',
      seriesGuidePrice: 'string',
      officialPrice: 'number',
      fullPrice: 'number',
      nakedPrice: 'number',
      purchaseTax: 'number',
      vehicleVesselTax: 'number',
      businessInsurance: 'number',
      extraContent: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 二手车
export class UsedCarInfo extends $tea.Model {
  // 渠道方线索业务id
  leadId: string;
  // 城市名称
  cityName: string;
  // 省份id
  pid: string;
  // 城市id
  cid: string;
  // 品牌名称
  brandName?: string;
  // 车系名称
  seriesName?: string;
  // 汽车之家车型id
  specId: string;
  // 车型名称
  specName?: string;
  // 首次上牌时间格式 yyyy/MM/dd
  firstRegTime: string;
  // 行驶公里数(km)
  mileage: string;
  static names(): { [key: string]: string } {
    return {
      leadId: 'lead_id',
      cityName: 'city_name',
      pid: 'pid',
      cid: 'cid',
      brandName: 'brand_name',
      seriesName: 'series_name',
      specId: 'spec_id',
      specName: 'spec_name',
      firstRegTime: 'first_reg_time',
      mileage: 'mileage',
    };
  }

  static types(): { [key: string]: any } {
    return {
      leadId: 'string',
      cityName: 'string',
      pid: 'string',
      cid: 'string',
      brandName: 'string',
      seriesName: 'string',
      specId: 'string',
      specName: 'string',
      firstRegTime: 'string',
      mileage: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 批量提交结果
export class BatchSubmitCarResult extends $tea.Model {
  // 提交线索唯一请求id
  submitId: string;
  // 是否成功
  isSuccess: boolean;
  // OK NO_DEMAND 无线索需求，需要重试 INVALID 无效，不要重试
  pushResultCode: string;
  static names(): { [key: string]: string } {
    return {
      submitId: 'submit_id',
      isSuccess: 'is_success',
      pushResultCode: 'push_result_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      submitId: 'string',
      isSuccess: 'boolean',
      pushResultCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 车辆信息
export class CarInfo extends $tea.Model {
  // 车牌号
  licenseNo: string;
  // 车架号
  vin: string;
  // 发动机号
  engineNo: string;
  // 注册日期
  registerDate: string;
  // 车型
  modelCode: string;
  static names(): { [key: string]: string } {
    return {
      licenseNo: 'license_no',
      vin: 'vin',
      engineNo: 'engine_no',
      registerDate: 'register_date',
      modelCode: 'model_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      licenseNo: 'string',
      vin: 'string',
      engineNo: 'string',
      registerDate: 'string',
      modelCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 高德潜客流向数据返回数据对象
export class GdCustomerInfo extends $tea.Model {
  // 时间范围（查询年度数据时，返回该字段）
  timeRange?: string;
  // 数据总数
  total: number;
  // 当前展示页
  current: number;
  // 数据总页数
  pages: number;
  // 每页显示数据条数
  size: number;
  // 数据集合
  records: GdCustomersRecord[];
  static names(): { [key: string]: string } {
    return {
      timeRange: 'time_range',
      total: 'total',
      current: 'current',
      pages: 'pages',
      size: 'size',
      records: 'records',
    };
  }

  static types(): { [key: string]: any } {
    return {
      timeRange: 'string',
      total: 'number',
      current: 'number',
      pages: 'number',
      size: 'number',
      records: { 'type': 'array', 'itemType': GdCustomersRecord },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 常岳用户结构体
export class CyUserInfo extends $tea.Model {
  // 用户id
  userId: string;
  // 用户名
  userName?: string;
  // 证件号
  idCard?: string;
  // 手机号
  phoneNum: string;
  static names(): { [key: string]: string } {
    return {
      userId: 'user_id',
      userName: 'user_name',
      idCard: 'id_card',
      phoneNum: 'phone_num',
    };
  }

  static types(): { [key: string]: any } {
    return {
      userId: 'string',
      userName: 'string',
      idCard: 'string',
      phoneNum: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 1
export class SpecResult extends $tea.Model {
  // 下一页数据拉取传递的值
  afterSpecId: string;
  // 车型Id列表
  specList: SpecList;
  static names(): { [key: string]: string } {
    return {
      afterSpecId: 'after_spec_id',
      specList: 'spec_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      afterSpecId: 'string',
      specList: SpecList,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 充电报告查询
export class BatteryReport extends $tea.Model {
  // 充电单号，最大长度/规则：32
  startChargeSeq: string;
  // VIN，最大长度/规则：17位
  vinCode: string;
  // 公告号，最大长度/规则36
  publicationNo?: string;
  // 本次累积充电量，单位kWh；最大长度/规则：整数位<=10,小数位<=2
  totalPower?: string;
  // 本次累积充入SOC（%）；最大长度/规则：0-100,小数位<=2
  totalChargeSoc?: string;
  // 本次充电开始SOC(%)；最大长度/规则：0-100,小数位<=2
  startSoc?: string;
  // 本次充电截止SOC(%)；最大长度/规则：0-100,小数位<=2
  endSoc?: string;
  // 标称能量，单位kWh；最大长度/规则：0-1000,小数位<=2
  nominalEnergy?: string;
  // 充电城市ID；最大长度/规则：30
  cityId?: string;
  // 注册日期；最大长度/规则：yyyy-MM-dd
  registerDate?: string;
  static names(): { [key: string]: string } {
    return {
      startChargeSeq: 'start_charge_seq',
      vinCode: 'vin_code',
      publicationNo: 'publication_no',
      totalPower: 'total_power',
      totalChargeSoc: 'total_charge_soc',
      startSoc: 'start_soc',
      endSoc: 'end_soc',
      nominalEnergy: 'nominal_energy',
      cityId: 'city_id',
      registerDate: 'register_date',
    };
  }

  static types(): { [key: string]: any } {
    return {
      startChargeSeq: 'string',
      vinCode: 'string',
      publicationNo: 'string',
      totalPower: 'string',
      totalChargeSoc: 'string',
      startSoc: 'string',
      endSoc: 'string',
      nominalEnergy: 'string',
      cityId: 'string',
      registerDate: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 高德潜客请求req
export class GdCustomerFlow extends $tea.Model {
  // 当前页面
  current: number;
  // 数据类型（SHOP：店铺；CITY：城市；PROVINCE：省份；COUNTRY：全国；SHOP_BRAND：店铺品牌(仅限竞品)）
  dataType: string;
  // 时间类型（DAY：天；WEEK：周；MONTH：月；仅针对城市和店铺品牌的竞品数据支持的时间类型为，季度：QUARTER；半年：HALF；年：YEAR）
  timeType: string;
  // 主品牌id
  mainBrand: string;
  // 时间（时间类型为天时：yyyyMMdd；时间类型为周时：yyyyWW；时间类型为月时：yyyyMM；时间类型为季度时：yyyyQQ；时间类型为半年时：yyyyBB；时间类型为年时：yyyy；）
  time: string;
  // 品牌id，以”,”分隔
  brandLimit: string;
  // 数据指数类型（pv、uv中选择，多个以”,”分隔）
  dataLimit: string;
  // 数据统计逻辑（0：默认值，基于本品或竞品获取；1：基于本品获取）
  baseSelf?: number;
  static names(): { [key: string]: string } {
    return {
      current: 'current',
      dataType: 'data_type',
      timeType: 'time_type',
      mainBrand: 'main_brand',
      time: 'time',
      brandLimit: 'brand_limit',
      dataLimit: 'data_limit',
      baseSelf: 'base_self',
    };
  }

  static types(): { [key: string]: any } {
    return {
      current: 'number',
      dataType: 'string',
      timeType: 'string',
      mainBrand: 'string',
      time: 'string',
      brandLimit: 'string',
      dataLimit: 'string',
      baseSelf: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 二手车估价信息
export class UsedCarValuation extends $tea.Model {
  // 评估金额(万)
  referenceprice: string;
  // 官方报价(参考)(万)
  newcarprice: string;
  // 车型图片(参考)
  url: string;
  // 车况好(万)(三个价格用"-"分隔,第一个是较小值第二个是...
  conditiona: string;
  // 车况正常(万)
  conditionb: string;
  // 车况差(万)
  conditionc: string;
  static names(): { [key: string]: string } {
    return {
      referenceprice: 'referenceprice',
      newcarprice: 'newcarprice',
      url: 'url',
      conditiona: 'conditiona',
      conditionb: 'conditionb',
      conditionc: 'conditionc',
    };
  }

  static types(): { [key: string]: any } {
    return {
      referenceprice: 'string',
      newcarprice: 'string',
      url: 'string',
      conditiona: 'string',
      conditionb: 'string',
      conditionc: 'string',
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

export class PushCarloanRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 车信息
  basicCarInfo: BasicCarInfo;
  // 用户信息
  userInfo: CarUserInfo;
  // 场景码
  sceneCode: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      basicCarInfo: 'basic_car_info',
      userInfo: 'user_info',
      sceneCode: 'scene_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      basicCarInfo: BasicCarInfo,
      userInfo: CarUserInfo,
      sceneCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PushCarloanResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 是否推送成功
  pushSuccess?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      pushSuccess: 'push_success',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      pushSuccess: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RegisterCarownerRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 唯一场景码
  sceneCode: string;
  // 用户基本信息
  userInfo: CarOwnerUserInfo;
  // 车辆信息
  carInfo: CarInfo;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      sceneCode: 'scene_code',
      userInfo: 'user_info',
      carInfo: 'car_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      sceneCode: 'string',
      userInfo: CarOwnerUserInfo,
      carInfo: CarInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RegisterCarownerResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 是否成功
  pushSuccess?: boolean;
  // token
  token?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      pushSuccess: 'push_success',
      token: 'token',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      pushSuccess: 'boolean',
      token: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchcreateNewcarRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // testchannleCode
  sceneCode: string;
  // 新车线索集合
  newCarInfo: NewCarInfo[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      sceneCode: 'scene_code',
      newCarInfo: 'new_car_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      sceneCode: 'string',
      newCarInfo: { 'type': 'array', 'itemType': NewCarInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchcreateNewcarResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 批量提交结果
  batchSubmitCarResult?: BatchSubmitCarResult[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      batchSubmitCarResult: 'batch_submit_car_result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      batchSubmitCarResult: { 'type': 'array', 'itemType': BatchSubmitCarResult },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SubmitNewcarRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 场景码
  sceneCode: string;
  // 用户信息
  userInfo: CarUserInfo;
  // 车系
  carSeries: string;
  // 金融方案
  finaicalPlan?: string;
  // 	
  // 预计购买时间
  purcharseTime?: string;
  // xxxx
  carSeriesId?: string;
  // 提交线索的唯一id
  submitId?: string;
  // 汽车之家车系id
  qcCarSeriesId?: string;
  // 匹配源
  matchSource?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      sceneCode: 'scene_code',
      userInfo: 'user_info',
      carSeries: 'car_series',
      finaicalPlan: 'finaical_plan',
      purcharseTime: 'purcharse_time',
      carSeriesId: 'car_series_id',
      submitId: 'submit_id',
      qcCarSeriesId: 'qc_car_series_id',
      matchSource: 'match_source',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      sceneCode: 'string',
      userInfo: CarUserInfo,
      carSeries: 'string',
      finaicalPlan: 'string',
      purcharseTime: 'string',
      carSeriesId: 'string',
      submitId: 'string',
      qcCarSeriesId: 'string',
      matchSource: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SubmitNewcarResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // OK NO_DEMAND 无线索需求，需要重试 INVALID 无效，不要重试
  pushResultCode?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      pushResultCode: 'push_result_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      pushResultCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RegisterCarownerCyRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 唯一场景码
  sceneCode: string;
  // 用户基本信息
  userInfo: CyUserInfo;
  // 车辆信息
  carInfo: CarInfo;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      sceneCode: 'scene_code',
      userInfo: 'user_info',
      carInfo: 'car_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      sceneCode: 'string',
      userInfo: CyUserInfo,
      carInfo: CarInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RegisterCarownerCyResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 是否成功
  pushSuccess?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      pushSuccess: 'push_success',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      pushSuccess: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCarPriceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 车型id
  carId?: string;
  // 车系id
  seriesId?: string;
  // 城市code
  cityCode?: string;
  // 页码
  pageNum: number;
  // 每页大小
  pageSize: number;
  // QC或者DCD的id查询价格
  idType?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      carId: 'car_id',
      seriesId: 'series_id',
      cityCode: 'city_code',
      pageNum: 'page_num',
      pageSize: 'page_size',
      idType: 'id_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      carId: 'string',
      seriesId: 'string',
      cityCode: 'string',
      pageNum: 'number',
      pageSize: 'number',
      idType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCarPriceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 总页数
  totalPages?: number;
  // 当前页码
  pageNum?: number;
  // 	
  // 车辆业务价格
  data?: CarBusinessPrice[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      totalPages: 'total_pages',
      pageNum: 'page_num',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      totalPages: 'number',
      pageNum: 'number',
      data: { 'type': 'array', 'itemType': CarBusinessPrice },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ImportCarFileRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // xx
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

export class ImportCarFileResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // xx
  code?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryUsedcarRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 场景码
  sceneCode: string;
  // 二手车信息
  usedCarInfo: UsedCarInfo;
  // 用户基本信息
  userInfo: CarOwnerUserInfo;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      sceneCode: 'scene_code',
      usedCarInfo: 'used_car_info',
      userInfo: 'user_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      sceneCode: 'string',
      usedCarInfo: UsedCarInfo,
      userInfo: CarOwnerUserInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryUsedcarResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 二手车估值信息
  usedCarValuation?: UsedCarValuation;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      usedCarValuation: 'used_car_valuation',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      usedCarValuation: UsedCarValuation,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SubmitIonchiRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 线索唯一标识
  submitId: string;
  // 手机号md5
  mobileMd5: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      submitId: 'submit_id',
      mobileMd5: 'mobile_md5',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      submitId: 'string',
      mobileMd5: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SubmitIonchiResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 推送数科客户成功
  pushSuccess?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      pushSuccess: 'push_success',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      pushSuccess: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryGdFlowRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户ID
  sceneCode: string;
  // 实际请求体
  gdCustomerFlow: GdCustomerFlow;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      sceneCode: 'scene_code',
      gdCustomerFlow: 'gd_customer_flow',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      sceneCode: 'string',
      gdCustomerFlow: GdCustomerFlow,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryGdFlowResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回消息
  msg?: string;
  // 返回编码，值为10000表示成功，其余值表示失败
  code?: number;
  // 随机返回id
  requestLinkId?: string;
  // 返回数据
  data?: GdCustomerInfo;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      msg: 'msg',
      code: 'code',
      requestLinkId: 'request_link_id',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      msg: 'string',
      code: 'number',
      requestLinkId: 'string',
      data: GdCustomerInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBatteryReportRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 充电报告
  batteryReport: BatteryReport;
  // 桩所属运营平台
  operatorPlatform: string;
  // 场站名称
  stationName: string;
  // 场站ID
  stationId: string;
  // 桩ID
  pileId: string;
  // 枪序号（充电端口号）
  gunNo: number;
  // 充电订单号
  chargeOrderNo: string;
  // 充电量，单位kWh
  chargePower: string;
  // 服务费，单位元
  serviceFee: string;
  // 电费，单位元
  electricityFee: string;
  // 充电开始时间
  chargeStartTime: string;
  // 充电结束时间
  chargeEndTime: string;
  // 租户场景码
  sceneCode: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      batteryReport: 'battery_report',
      operatorPlatform: 'operator_platform',
      stationName: 'station_name',
      stationId: 'station_id',
      pileId: 'pile_id',
      gunNo: 'gun_no',
      chargeOrderNo: 'charge_order_no',
      chargePower: 'charge_power',
      serviceFee: 'service_fee',
      electricityFee: 'electricity_fee',
      chargeStartTime: 'charge_start_time',
      chargeEndTime: 'charge_end_time',
      sceneCode: 'scene_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      batteryReport: BatteryReport,
      operatorPlatform: 'string',
      stationName: 'string',
      stationId: 'string',
      pileId: 'string',
      gunNo: 'number',
      chargeOrderNo: 'string',
      chargePower: 'string',
      serviceFee: 'string',
      electricityFee: 'string',
      chargeStartTime: 'string',
      chargeEndTime: 'string',
      sceneCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBatteryReportResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 成功或失败的编码
  code?: string;
  // 成功或失败的提示语
  msg?: string;
  // 返回数据（code=100时返回）
  result?: BatteryReportResult;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      msg: 'msg',
      result: 'result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'string',
      msg: 'string',
      result: BatteryReportResult,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryNewcarQczjRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 查询类型
  queryType: string;
  // 批量拉取数据时，上一次返回的afterSpecId
  afterSpecId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      queryType: 'query_type',
      afterSpecId: 'after_spec_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      queryType: 'string',
      afterSpecId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryNewcarQczjResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 0代表成功，其余代表失败
  returncode?: string;
  // 失败时错误消息
  message?: string;
  // 城市结果结构体
  cityResult?: CityResult[];
  // 车型结果结构体
  specResult?: SpecList[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      returncode: 'returncode',
      message: 'message',
      cityResult: 'city_result',
      specResult: 'spec_result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      returncode: 'string',
      message: 'string',
      cityResult: { 'type': 'array', 'itemType': CityResult },
      specResult: { 'type': 'array', 'itemType': SpecList },
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
          sdk_version: "1.0.19",
          _prod_code: "INTELLICAR",
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
   * Description: 推送星贷车信息
   * Summary: 推送星贷车信息
   */
  async pushCarloan(request: PushCarloanRequest): Promise<PushCarloanResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pushCarloanEx(request, headers, runtime);
  }

  /**
   * Description: 推送星贷车信息
   * Summary: 推送星贷车信息
   */
  async pushCarloanEx(request: PushCarloanRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PushCarloanResponse> {
    Util.validateModel(request);
    return $tea.cast<PushCarloanResponse>(await this.doRequest("1.0", "antdigital.intellicar.carloan.push", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PushCarloanResponse({}));
  }

  /**
   * Description: 车主信息提交
   * Summary:  车主信息提交
   */
  async registerCarowner(request: RegisterCarownerRequest): Promise<RegisterCarownerResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.registerCarownerEx(request, headers, runtime);
  }

  /**
   * Description: 车主信息提交
   * Summary:  车主信息提交
   */
  async registerCarownerEx(request: RegisterCarownerRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<RegisterCarownerResponse> {
    Util.validateModel(request);
    return $tea.cast<RegisterCarownerResponse>(await this.doRequest("1.0", "antdigital.intellicar.carowner.register", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new RegisterCarownerResponse({}));
  }

  /**
   * Description: 新车线索批量提交
   * Summary: 新车线索批量提交
   */
  async batchcreateNewcar(request: BatchcreateNewcarRequest): Promise<BatchcreateNewcarResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.batchcreateNewcarEx(request, headers, runtime);
  }

  /**
   * Description: 新车线索批量提交
   * Summary: 新车线索批量提交
   */
  async batchcreateNewcarEx(request: BatchcreateNewcarRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BatchcreateNewcarResponse> {
    Util.validateModel(request);
    return $tea.cast<BatchcreateNewcarResponse>(await this.doRequest("1.0", "antdigital.intellicar.newcar.batchcreate", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BatchcreateNewcarResponse({}));
  }

  /**
   * Description: 提交新车线索
   * Summary:  提交新车线索
   */
  async submitNewcar(request: SubmitNewcarRequest): Promise<SubmitNewcarResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.submitNewcarEx(request, headers, runtime);
  }

  /**
   * Description: 提交新车线索
   * Summary:  提交新车线索
   */
  async submitNewcarEx(request: SubmitNewcarRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SubmitNewcarResponse> {
    Util.validateModel(request);
    return $tea.cast<SubmitNewcarResponse>(await this.doRequest("1.0", "antdigital.intellicar.newcar.submit", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SubmitNewcarResponse({}));
  }

  /**
   * Description: 常岳线索推送接口
   * Summary: 常岳线索推送
   */
  async registerCarownerCy(request: RegisterCarownerCyRequest): Promise<RegisterCarownerCyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.registerCarownerCyEx(request, headers, runtime);
  }

  /**
   * Description: 常岳线索推送接口
   * Summary: 常岳线索推送
   */
  async registerCarownerCyEx(request: RegisterCarownerCyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<RegisterCarownerCyResponse> {
    Util.validateModel(request);
    return $tea.cast<RegisterCarownerCyResponse>(await this.doRequest("1.0", "antdigital.intellicar.carowner.cy.register", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new RegisterCarownerCyResponse({}));
  }

  /**
   * Description: 车辆价格查询
   * Summary: 车辆价格查询
   */
  async queryCarPrice(request: QueryCarPriceRequest): Promise<QueryCarPriceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryCarPriceEx(request, headers, runtime);
  }

  /**
   * Description: 车辆价格查询
   * Summary: 车辆价格查询
   */
  async queryCarPriceEx(request: QueryCarPriceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryCarPriceResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryCarPriceResponse>(await this.doRequest("1.0", "antdigital.intellicar.car.price.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryCarPriceResponse({}));
  }

  /**
   * Description: 文件引入
   * Summary: 文件引入
   */
  async importCarFile(request: ImportCarFileRequest): Promise<ImportCarFileResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.importCarFileEx(request, headers, runtime);
  }

  /**
   * Description: 文件引入
   * Summary: 文件引入
   */
  async importCarFileEx(request: ImportCarFileRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ImportCarFileResponse> {
    if (!Util.isUnset(request.fileObject)) {
      let uploadReq = new CreateAntcloudGatewayxFileUploadRequest({
        authToken: request.authToken,
        apiCode: "antdigital.intellicar.car.file.import",
        fileName: request.fileObjectName,
      });
      let uploadResp = await this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
      if (!AntchainUtil.isSuccess(uploadResp.resultCode, "ok")) {
        let importCarFileResponse = new ImportCarFileResponse({
          reqMsgId: uploadResp.reqMsgId,
          resultCode: uploadResp.resultCode,
          resultMsg: uploadResp.resultMsg,
        });
        return importCarFileResponse;
      }

      let uploadHeaders = AntchainUtil.parseUploadHeaders(uploadResp.uploadHeaders);
      await AntchainUtil.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
      request.fileId = uploadResp.fileId;
      request.fileObject = null;
    }

    Util.validateModel(request);
    return $tea.cast<ImportCarFileResponse>(await this.doRequest("1.0", "antdigital.intellicar.car.file.import", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ImportCarFileResponse({}));
  }

  /**
   * Description: 二手车估值接口
   * Summary: 二手车估值接口
   */
  async queryUsedcar(request: QueryUsedcarRequest): Promise<QueryUsedcarResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryUsedcarEx(request, headers, runtime);
  }

  /**
   * Description: 二手车估值接口
   * Summary: 二手车估值接口
   */
  async queryUsedcarEx(request: QueryUsedcarRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryUsedcarResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryUsedcarResponse>(await this.doRequest("1.0", "antdigital.intellicar.usedcar.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryUsedcarResponse({}));
  }

  /**
   * Description: 逸安启回调接口
   * Summary: 逸安启回调接口
   */
  async submitIonchi(request: SubmitIonchiRequest): Promise<SubmitIonchiResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.submitIonchiEx(request, headers, runtime);
  }

  /**
   * Description: 逸安启回调接口
   * Summary: 逸安启回调接口
   */
  async submitIonchiEx(request: SubmitIonchiRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SubmitIonchiResponse> {
    Util.validateModel(request);
    return $tea.cast<SubmitIonchiResponse>(await this.doRequest("1.0", "antdigital.intellicar.ionchi.submit", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SubmitIonchiResponse({}));
  }

  /**
   * Description: 对接高德，查询潜客流向以及重叠的数据
   * Summary: 【高德】流向与重叠数据
   */
  async queryGdFlow(request: QueryGdFlowRequest): Promise<QueryGdFlowResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryGdFlowEx(request, headers, runtime);
  }

  /**
   * Description: 对接高德，查询潜客流向以及重叠的数据
   * Summary: 【高德】流向与重叠数据
   */
  async queryGdFlowEx(request: QueryGdFlowRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryGdFlowResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryGdFlowResponse>(await this.doRequest("1.0", "antdigital.intellicar.gd.flow.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryGdFlowResponse({}));
  }

  /**
   * Description: 电池衰退权益报告查询接口
   * Summary: 电池衰退
   */
  async queryBatteryReport(request: QueryBatteryReportRequest): Promise<QueryBatteryReportResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryBatteryReportEx(request, headers, runtime);
  }

  /**
   * Description: 电池衰退权益报告查询接口
   * Summary: 电池衰退
   */
  async queryBatteryReportEx(request: QueryBatteryReportRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryBatteryReportResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryBatteryReportResponse>(await this.doRequest("1.0", "antdigital.intellicar.battery.report.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryBatteryReportResponse({}));
  }

  /**
   * Description: 用来查询汽车之家车型和城市列表
   * Summary: 用来查询汽车之家车型和城市列表
   */
  async queryNewcarQczj(request: QueryNewcarQczjRequest): Promise<QueryNewcarQczjResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryNewcarQczjEx(request, headers, runtime);
  }

  /**
   * Description: 用来查询汽车之家车型和城市列表
   * Summary: 用来查询汽车之家车型和城市列表
   */
  async queryNewcarQczjEx(request: QueryNewcarQczjRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryNewcarQczjResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryNewcarQczjResponse>(await this.doRequest("1.0", "antdigital.intellicar.newcar.qczj.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryNewcarQczjResponse({}));
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
