// This file is auto-generated, don't edit it
import AntchainUtil from '@antchain/alipay-util';
import Util, * as $Util from '@alicloud/tea-util';
import RPCUtil from '@alicloud/rpc-util';
import { Readable } from 'stream';
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

// 高德潜客uv指数
export class GdCustomerUv extends $tea.Model {
  // uv指数数量
  /**
   * @example
   * 36
   */
  total: number;
  // uv指数数量
  /**
   * @example
   * 10
   */
  count: number;
  // uv指数排序
  // 
  /**
   * @example
   * 1
   */
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
  /**
   * @example
   * 36
   */
  total: number;
  // 重叠指数pv指数数量
  /**
   * @example
   * 10
   */
  count: number;
  // 重叠指数pv指数排序
  /**
   * @example
   * 1
   */
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
  /**
   * @example
   * 103
   */
  brandId: string;
  // 流出店铺id，数据类型为店铺时返回该属性与值
  /**
   * @example
   * 26nZz8dsa4
   */
  shopId?: string;
  // 城市编码，数据类型为店铺或者城市时返回该属性与值
  /**
   * @example
   * 021
   */
  citycode?: string;
  // 省份编码，数据类型为省份时返回该属性与值
  /**
   * @example
   * xxxx
   */
  pcode?: string;
  // 数据类型为全国时返回该属性与值
  /**
   * @example
   * xxxx
   */
  countrycode?: string;
  static names(): { [key: string]: string } {
    return {
      uv: 'uv',
      pv: 'pv',
      brandId: 'brand_id',
      shopId: 'shop_id',
      citycode: 'citycode',
      pcode: 'pcode',
      countrycode: 'countrycode',
    };
  }

  static types(): { [key: string]: any } {
    return {
      uv: GdCustomerUv,
      pv: GdCustomerPv,
      brandId: 'string',
      shopId: 'string',
      citycode: 'string',
      pcode: 'string',
      countrycode: 'string',
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
  /**
   * @example
   * 106
   */
  brandId: string;
  // 流入店铺id，数据类型为店铺时返回该属性与值
  /**
   * @example
   * 26mMw8duxn
   */
  shopId?: string;
  // 流入城市编码，数据类型为店铺或者城市时返回该属性与值
  /**
   * @example
   * 021
   */
  citycode?: string;
  // 省份编码，数据类型为省份时返回该属性与值
  /**
   * @example
   * xxxx
   */
  pcode?: string;
  // 数据类型为全国时返回该属性与值
  /**
   * @example
   * xxxx
   */
  countrycode?: string;
  static names(): { [key: string]: string } {
    return {
      uv: 'uv',
      pv: 'pv',
      brandId: 'brand_id',
      shopId: 'shop_id',
      citycode: 'citycode',
      pcode: 'pcode',
      countrycode: 'countrycode',
    };
  }

  static types(): { [key: string]: any } {
    return {
      uv: GdCustomerUv,
      pv: GdCustomerPv,
      brandId: 'string',
      shopId: 'string',
      citycode: 'string',
      pcode: 'string',
      countrycode: 'string',
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
  /**
   * @example
   * 104
   */
  brandId: string;
  // 重叠店铺id，数据类型为店铺时返回该属性与值
  /**
   * @example
   * 26nhJ8duzh
   */
  shopId?: string;
  // 重叠城市编码，数据类型为城市时返回该属性与值
  /**
   * @example
   * 021
   */
  citycode?: string;
  // 重叠省份编码，数据类型为省份时返回该属性与值
  /**
   * @example
   * xxxx
   */
  pcode?: string;
  // 数据类型为全国时返回该属性与值
  /**
   * @example
   * xxxx
   */
  countrycode?: string;
  static names(): { [key: string]: string } {
    return {
      uv: 'uv',
      pv: 'pv',
      brandId: 'brand_id',
      shopId: 'shop_id',
      citycode: 'citycode',
      pcode: 'pcode',
      countrycode: 'countrycode',
    };
  }

  static types(): { [key: string]: any } {
    return {
      uv: GdCustomerUv,
      pv: GdCustomerPv,
      brandId: 'string',
      shopId: 'string',
      citycode: 'string',
      pcode: 'string',
      countrycode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 品牌信息
export class LetterInfo extends $tea.Model {
  // name
  /**
   * @example
   * xxxx
   */
  name: string;
  // id
  /**
   * @example
   * xxxx
   */
  id: string;
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

// 用户信息
export class CarUserInfo extends $tea.Model {
  // 唯一标识用户的id
  /**
   * @example
   * xxxxx
   */
  userId: string;
  // 手机号
  /**
   * @example
   * 138xxxxxxx
   */
  phoneNum: string;
  // 城市编码
  /**
   * @example
   * 110000
   */
  cityCode: string;
  // 姓名
  /**
   * @example
   * 张三
   */
  userCertName?: string;
  // 证件号码
  /**
   * @example
   * xxxxx
   */
  userCertNo?: string;
  // 性别
  /**
   * @example
   * girl
   */
  userGender?: string;
  // 昵称
  /**
   * @example
   * xxxxx
   */
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
  /**
   * @example
   * 1
   */
  brandId: string;
  // 品牌名称
  /**
   * @example
   * 宝马
   */
  brandName: string;
  // 厂商id
  /**
   * @example
   * 1
   */
  factoryId: string;
  // 厂商名称
  /**
   * @example
   * 华晨宝马
   */
  factoryName: string;
  // 车系id
  /**
   * @example
   * 100
   */
  seriesId: string;
  // 车系名称
  /**
   * @example
   * 宝马X5
   */
  seriesName: string;
  // 车型Id
  /**
   * @example
   * 1001
   */
  specId: string;
  // 车型名称
  /**
   * @example
   * 2026款 改款 xDrive 40Li M运动曜夜套装
   */
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

// 高德店铺基本系返回record
export class GdStoreRecord extends $tea.Model {
  // 店铺ID
  /**
   * @example
   * 01cc5d1cc0
   */
  shopId: string;
  // 店铺名称
  /**
   * @example
   * xxxx
   */
  name: string;
  // 店铺地址
  /**
   * @example
   * xxxx
   */
  address: string;
  // 店铺所在省份
  /**
   * @example
   * xxxx
   */
  pname: string;
  // 店铺所在城市
  /**
   * @example
   * xxxx
   */
  cityname: string;
  // 品牌id
  /**
   * @example
   * xxxx
   */
  brandId: string;
  // 品牌名称
  /**
   * @example
   * xxxx
   */
  brandName: string;
  // 经销商代码
  /**
   * @example
   * xxxx
   */
  officeCode: string;
  // 经度
  /**
   * @example
   * xxxx
   */
  lon: string;
  // 纬度
  /**
   * @example
   * xxxx
   */
  lat: string;
  // 店铺数据版本集合
  versionList: string[];
  static names(): { [key: string]: string } {
    return {
      shopId: 'shop_id',
      name: 'name',
      address: 'address',
      pname: 'pname',
      cityname: 'cityname',
      brandId: 'brand_id',
      brandName: 'brand_name',
      officeCode: 'office_code',
      lon: 'lon',
      lat: 'lat',
      versionList: 'version_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      shopId: 'string',
      name: 'string',
      address: 'string',
      pname: 'string',
      cityname: 'string',
      brandId: 'string',
      brandName: 'string',
      officeCode: 'string',
      lon: 'string',
      lat: 'string',
      versionList: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 高德潜客指数record
export class GdPotentialCustomerRecord extends $tea.Model {
  // uv指数
  uv: GdCustomerUv;
  // 城市编码，数据类型为店铺或者城市时返回该属性与值
  /**
   * @example
   * xxxx
   */
  citycode?: string;
  // pv指数
  pv: GdCustomerPv;
  // 店铺id，数据类型为店铺时返回该属性与值
  /**
   * @example
   * xxxx
   */
  shopId?: string;
  // 品牌id
  /**
   * @example
   * xxxx
   */
  brandId: string;
  // 店铺数量（dataType!=SHOP时返回该字段）
  shopNum?: number;
  // 时间（时间类型为天时：yyyyMMdd；时间类型为周时：yyyyWW；时间类型为月时：yyyyMM）
  /**
   * @example
   * xxxx
   */
  time: string;
  // 省份编码，数据类型为省份时返回该属性与值
  /**
   * @example
   * xxxx
   */
  pcode?: string;
  // 数据类型为全国时返回该属性与值
  /**
   * @example
   * xxxx
   */
  countrycode?: string;
  static names(): { [key: string]: string } {
    return {
      uv: 'uv',
      citycode: 'citycode',
      pv: 'pv',
      shopId: 'shop_id',
      brandId: 'brand_id',
      shopNum: 'shop_num',
      time: 'time',
      pcode: 'pcode',
      countrycode: 'countrycode',
    };
  }

  static types(): { [key: string]: any } {
    return {
      uv: GdCustomerUv,
      citycode: 'string',
      pv: GdCustomerPv,
      shopId: 'string',
      brandId: 'string',
      shopNum: 'number',
      time: 'string',
      pcode: 'string',
      countrycode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 电池报告返回数据详情
export class BatteryReportData extends $tea.Model {
  // VIN码
  /**
   * @example
   * -
   */
  vinCode: string;
  // 评估时间，报告生成时间 yyyy-MM-dd HH:mm:ss
  /**
   * @example
   * -
   */
  evaluateTime: string;
  // 当前 SOH（%），数值 0-100
  /**
   * @example
   * 12
   */
  currentSoh: string;
  // SOH 评级：优秀 100-95 良好 95-90 中等 90-85 较差 85-80 差 80 以下
  /**
   * @example
   * -
   */
  sohLvStr: string;
  // 电池衰退水平值
  /**
   * @example
   * 1
   */
  volumeScoreRecession: string;
  // 安全风险水平：低 较低 较高 高
  /**
   * @example
   * -
   */
  volumeScoreRecessionLvStr: string;
  // 安全风险水平解读文案
  /**
   * @example
   * -
   */
  volumeScoreRecessionNarrate: string;
  // 保障状态 0：未保障 1：保障中 2：保障结束
  safeguardStatus: number;
  // 保障截止期 yyyy-MM-dd HH:mm:ss
  /**
   * @example
   * -
   */
  safeguardEndTime: string;
  // 本轮首检 SOH（%）数值 0-100
  /**
   * @example
   * 1
   */
  initialSoh: string;
  // 本轮首检 评估时间 yyyy-MM-dd HH:mm:ss
  /**
   * @example
   * -
   */
  initialSohEvaluateTime: string;
  // 本轮首检 充电单号
  /**
   * @example
   * -
   */
  initialChargeSeq: string;
  // 触发赔付 SOH（%），数值 0-100
  /**
   * @example
   * 1
   */
  safeguardMaxSubSoh: string;
  // 是否触发赔付，当前 SOH≤触发赔付 SOH 时为 true
  /**
   * @example
   * true, false
   */
  compensationTriggered: boolean;
  // SOH 衰退预测-X 轴标题（年）
  yearSohTitle: string[];
  // 本车电池衰退预测，逐年 SOH（%）
  curEstimateYearSoh: string[];
  // 同类型车电池衰退预测，逐年 SOH（%）
  peerEstimateYearSoh: string[];
  // 电池厂商
  /**
   * @example
   * -
   */
  batteryManufacturer: string;
  // 标称能量，单位 kWh
  /**
   * @example
   * 1
   */
  nominalEnergy: string;
  // 标称容量，单位 Ah
  /**
   * @example
   * 1
   */
  rateCapacity: string;
  // 电池类型
  /**
   * @example
   * -
   */
  batteryType: string;
  // 车辆生产年份
  /**
   * @example
   * -
   */
  manufacturerDate: string;
  // 权益说明文案
  /**
   * @example
   * -
   */
  rightsDesc: string;
  // 权益说明-状态
  /**
   * @example
   * -
   */
  rightStatus: string;
  // 电池健康度-建议
  sohSuggest: string[];
  // 保障金额
  /**
   * @example
   * -
   */
  safeguardAmount?: string;
  // 保障天数
  /**
   * @example
   * -
   */
  safeguardDays?: number;
  // SOH允许衰退阈值
  /**
   * @example
   * -
   */
  allowMaxSohDiff?: string;
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
      safeguardMaxSubSoh: 'safeguard_max_sub_soh',
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
      rightStatus: 'right_status',
      sohSuggest: 'soh_suggest',
      safeguardAmount: 'safeguard_amount',
      safeguardDays: 'safeguard_days',
      allowMaxSohDiff: 'allow_max_soh_diff',
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
      safeguardMaxSubSoh: 'string',
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
      rightStatus: 'string',
      sohSuggest: { 'type': 'array', 'itemType': 'string' },
      safeguardAmount: 'string',
      safeguardDays: 'number',
      allowMaxSohDiff: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 高德数据集合内record
export class GdCustomersRecord extends $tea.Model {
  // 城市编码，数据类型为店铺或者城市时返回该属性与值
  /**
   * @example
   * 021
   */
  citycode: string;
  // 品牌id
  /**
   * @example
   * 104
   */
  brandId: string;
  // 店铺id，数据类型为店铺或者店铺品牌时返回该属性与值
  /**
   * @example
   * 26nhJ8duzh
   */
  shopId: string;
  // 时间（时间类型为天时：yyyyMMdd；时间类型为周时：yyyyWW；时间类型为月时：yyyyMM）
  /**
   * @example
   * 20230102
   */
  time: string;
  // 重叠指数集合
  overlapList: Overlap[];
  // 重叠指数集合条数
  /**
   * @example
   * 2
   */
  overlapListNum: string;
  // 流入指数集合
  srcList: GdSrc[];
  // 流入指数条数
  /**
   * @example
   * 2
   */
  srcListNum: string;
  // 流出指数集合
  destList: GdDest[];
  // 流出指数条数
  /**
   * @example
   * 2
   */
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
      destList: { 'type': 'array', 'itemType': GdDest },
      destListNum: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 新车线索集合
export class NewCarInfo extends $tea.Model {
  // 车系
  /**
   * @example
   * xxx
   */
  carSeries: string;
  // 金融方案
  /**
   * @example
   * xxx
   */
  finaicalPlan?: string;
  // 车系id
  /**
   * @example
   * xxx
   */
  carSeriesId?: string;
  // 请求提交唯一id
  /**
   * @example
   * xxxxx
   */
  submitId?: string;
  // 预计购买时间
  /**
   * @example
   * 1
   */
  purcharseTime?: string;
  // 用户信息
  userInfo: CarUserInfo;
  // 懂车帝或者汽车之家
  /**
   * @example
   * DCD/QC
   */
  matchSource?: string;
  // 汽车之家车型id
  /**
   * @example
   * 123
   */
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
  /**
   * @example
   * -
   */
  orderId: string;
  // 保障码，VIN 在 7 天内首次检测时生成，每轮保障采用同一保障码
  /**
   * @example
   * -
   */
  guaranteeCode: string;
  // 当前充电单号
  /**
   * @example
   * -
   */
  currentStartChargeSeq: string;
  // 是否计费
  /**
   * @example
   * true, false
   */
  charge: boolean;
  // 检测类型 6601：首检 6602：复核
  /**
   * @example
   * 6601
   */
  checkType: number;
  // 报告数据
  reportData: BatteryReportData;
  // 是否为保障类订单
  /**
   * @example
   * true
   */
  safeguardEnabled: boolean;
  static names(): { [key: string]: string } {
    return {
      orderId: 'order_id',
      guaranteeCode: 'guarantee_code',
      currentStartChargeSeq: 'current_start_charge_seq',
      charge: 'charge',
      checkType: 'check_type',
      reportData: 'report_data',
      safeguardEnabled: 'safeguard_enabled',
    };
  }

  static types(): { [key: string]: any } {
    return {
      orderId: 'string',
      guaranteeCode: 'string',
      currentStartChargeSeq: 'string',
      charge: 'boolean',
      checkType: 'number',
      reportData: BatteryReportData,
      safeguardEnabled: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 车信息
export class BasicCarInfo extends $tea.Model {
  // 车牌号
  /**
   * @example
   * xxxx
   */
  licenseNo: string;
  // 车架号
  /**
   * @example
   * xxxxx
   */
  vin: string;
  // 发动机号
  /**
   * @example
   * xxxxx
   */
  engineNo: string;
  // 初登日期
  /**
   * @example
   * 2021-12-21
   */
  registerDate: string;
  // 车辆型号
  /**
   * @example
   * xxxxx
   */
  modelCode: string;
  // 营运性质
  /**
   * @example
   * xxxxx
   */
  useNatureCode: string;
  // 是否抵押
  /**
   * @example
   * true, false
   */
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

// 车辆业务价格
export class CarBusinessPrice extends $tea.Model {
  // 品牌id
  /**
   * @example
   * xx
   */
  brandId?: string;
  // 品牌名称
  /**
   * @example
   * xxx
   */
  brandName?: string;
  // 车系id
  /**
   * @example
   * xxx
   */
  carSeriesId?: string;
  // 车系名称
  /**
   * @example
   * xxx
   */
  carSeries?: string;
  // 车型id
  /**
   * @example
   * xxx
   */
  carId?: string;
  // 车型名称
  /**
   * @example
   * xxx
   */
  carName?: string;
  // 年款
  /**
   * @example
   * xxx
   */
  carYear?: string;
  // 城市code
  /**
   * @example
   * xxx
   */
  cityCode?: string;
  // 城市名称
  /**
   * @example
   * xxx
   */
  cityName?: string;
  // 车系指导价（范围值） 单位到分
  /**
   * @example
   * {"min":1234,"max":5678}
   */
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
  /**
   * @example
   * {"xx":""}
   */
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

// 批量提交结果
export class BatchSubmitCarResult extends $tea.Model {
  // 提交线索唯一请求id
  /**
   * @example
   * xxx
   */
  submitId: string;
  // 是否成功
  /**
   * @example
   * true, false
   */
  isSuccess: boolean;
  // OK NO_DEMAND 无线索需求，需要重试 INVALID 无效，不要重试，PENDING 未知，需要重试
  /**
   * @example
   * OK/INVALID/NO_DEMAND/PENDING
   */
  pushResultCode: string;
  // 失败原因
  /**
   * @example
   * 失败原因
   */
  invalidReason?: string;
  static names(): { [key: string]: string } {
    return {
      submitId: 'submit_id',
      isSuccess: 'is_success',
      pushResultCode: 'push_result_code',
      invalidReason: 'invalid_reason',
    };
  }

  static types(): { [key: string]: any } {
    return {
      submitId: 'string',
      isSuccess: 'boolean',
      pushResultCode: 'string',
      invalidReason: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 车辆信息
export class CarInfo extends $tea.Model {
  // 车牌号
  /**
   * @example
   * xxx
   */
  licenseNo: string;
  // 车架号
  /**
   * @example
   * xxx
   */
  vin: string;
  // 发动机号
  /**
   * @example
   * xxx
   */
  engineNo: string;
  // 注册日期
  /**
   * @example
   * xxx
   */
  registerDate: string;
  // 车型
  /**
   * @example
   * xxx
   */
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

// 省份集合
export class Province extends $tea.Model {
  // 省份id
  /**
   * @example
   * xxxx
   */
  pid: string;
  // 省份名
  /**
   * @example
   * 1
   */
  pname: string;
  static names(): { [key: string]: string } {
    return {
      pid: 'pid',
      pname: 'pname',
    };
  }

  static types(): { [key: string]: any } {
    return {
      pid: 'string',
      pname: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 城市集合
export class City extends $tea.Model {
  // 省份id
  /**
   * @example
   * 省份id
   */
  pid: string;
  // 城市id
  /**
   * @example
   * 城市id
   */
  cid: string;
  // 城市名
  /**
   * @example
   * xxxx
   */
  cname: string;
  static names(): { [key: string]: string } {
    return {
      pid: 'pid',
      cid: 'cid',
      cname: 'cname',
    };
  }

  static types(): { [key: string]: any } {
    return {
      pid: 'string',
      cid: 'string',
      cname: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 高德潜客流向数据返回数据对象
export class GdCustomerInfo extends $tea.Model {
  // 时间范围（查询年度数据时，返回该字段）
  /**
   * @example
   * xxxx
   */
  timeRange?: string;
  // 数据总数
  /**
   * @example
   * 638
   */
  total: number;
  // 当前展示页
  /**
   * @example
   * 1
   */
  current: number;
  // 数据总页数
  /**
   * @example
   * 638
   */
  pages: number;
  // 每页显示数据条数
  /**
   * @example
   * 1
   */
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

// 高德潜客请求req
export class GdCustomerFlow extends $tea.Model {
  // 当前页面
  /**
   * @example
   * 1
   */
  current: number;
  // 数据类型（SHOP：店铺；CITY：城市；PROVINCE：省份；COUNTRY：全国；SHOP_BRAND：店铺品牌(仅限竞品)）
  /**
   * @example
   * SHOP
   */
  dataType?: string;
  // 时间类型（DAY：天；WEEK：周；MONTH：月；仅针对城市和店铺品牌的竞品数据支持的时间类型为，季度：QUARTER；半年：HALF；年：YEAR）
  /**
   * @example
   * DAY
   */
  timeType?: string;
  // 主品牌id
  /**
   * @example
   * 102
   */
  mainBrand?: string;
  // 时间（时间类型为天时：yyyyMMdd；时间类型为周时：yyyyWW；时间类型为月时：yyyyMM；时间类型为季度时：yyyyQQ；时间类型为半年时：yyyyBB；时间类型为年时：yyyy；）
  /**
   * @example
   * 20230103
   */
  time?: string;
  // 品牌id，以”,”分隔
  /**
   * @example
   * 102
   */
  brandLimit?: string;
  // 数据指数类型（pv、uv中选择，多个以”,”分隔）
  /**
   * @example
   * pv,uv
   */
  dataLimit?: string;
  // 数据统计逻辑（0：默认值，基于本品或竞品获取；1：基于本品获取）
  /**
   * @example
   * 1
   */
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
  /**
   * @example
   * 1.15-1.43
   */
  referenceprice: string;
  // 官方报价(参考)(万)
  /**
   * @example
   * 54.5
   */
  newcarprice: string;
  // 车型图片(参考)
  /**
   * @example
   * "http://car0.autoimg.cn/cardfs/product/g32/M08/A5/55/t_autohomecar__ChxkPmZijMqAMuHJAALTBQ2Tti4239.jpg"
   */
  url: string;
  // 车况好(万)(三个价格用"-"分隔,第一个是较小值第二个是...
  /**
   * @example
   * 1.30-1.38-1.45
   */
  conditiona: string;
  // 车况正常(万)
  /**
   * @example
   * 1.18-1.29-1.41
   */
  conditionb: string;
  // 车况差(万)
  /**
   * @example
   * 1.04-1.16-1.28
   */
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

// 高德潜客指数返回数据对象
export class GdPotentialCustomerInfo extends $tea.Model {
  // 时间范围（查询月度或年度数据时，返回该字段）
  /**
   * @example
   * xxxx
   */
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
  records: GdPotentialCustomerRecord[];
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
      records: { 'type': 'array', 'itemType': GdPotentialCustomerRecord },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 车型信息
export class ProductInfo extends $tea.Model {
  // 能源类型
  /**
   * @example
   * xxxx
   */
  fueltype: string;
  // 车型名称
  /**
   * @example
   * xxxx
   */
  name: string;
  // 车型id
  /**
   * @example
   * xxxx
   */
  id: string;
  static names(): { [key: string]: string } {
    return {
      fueltype: 'fueltype',
      name: 'name',
      id: 'id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      fueltype: 'string',
      name: 'string',
      id: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 设备信息
export class DeviceBean extends $tea.Model {
  // 选填其中一个：imeiMd5、macMd5、adid、adidMd5、did、idfa、idfaMd5、caid、caidMd5、oaid、oaidMd5、aaid、aaidMd5、gtcid、mb、pnSha256、cid、gid
  /**
   * @example
   * -
   */
  deviceIdType: string;
  // 设备ID列表（最多200个，不要重复）
  /**
   * @example
   * undefined
   */
  deviceIdList: string[];
  static names(): { [key: string]: string } {
    return {
      deviceIdType: 'device_id_type',
      deviceIdList: 'device_id_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      deviceIdType: 'string',
      deviceIdList: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 汽车之家城市信息
export class CityResult extends $tea.Model {
  // 城市Id
  /**
   * @example
   * 110000
   */
  cityId: string;
  // 城市名称
  /**
   * @example
   * 北京
   */
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

// 标签配置信息返回结果
export class TagBeanRecords extends $tea.Model {
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

// 用户基本信息
export class CarOwnerUserInfo extends $tea.Model {
  // 用户id
  /**
   * @example
   * XX
   */
  userId: string;
  // 手机号
  /**
   * @example
   * xxx
   */
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

// 长安画像标签
export class TagBean extends $tea.Model {
  // 标签编码
  /**
   * @example
   * 01qe000
   */
  tid?: string;
  // 标签类目
  /**
   * @example
   * xxxx
   */
  category?: string;
  // 标签名称
  /**
   * @example
   * xxxx
   */
  tname?: string;
  // 标签值名称
  /**
   * @example
   * xxxx
   */
  tvname?: string;
  static names(): { [key: string]: string } {
    return {
      tid: 'tid',
      category: 'category',
      tname: 'tname',
      tvname: 'tvname',
    };
  }

  static types(): { [key: string]: any } {
    return {
      tid: 'string',
      category: 'string',
      tname: 'string',
      tvname: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 高德店铺基本信息
export class GdStoreInfo extends $tea.Model {
  // 数据总数
  total: number;
  // 当前展示页
  current: number;
  // 数据总页数
  pages: number;
  // 每页显示数据条数
  size: number;
  // 数据集合
  records: GdStoreRecord[];
  static names(): { [key: string]: string } {
    return {
      total: 'total',
      current: 'current',
      pages: 'pages',
      size: 'size',
      records: 'records',
    };
  }

  static types(): { [key: string]: any } {
    return {
      total: 'number',
      current: 'number',
      pages: 'number',
      size: 'number',
      records: { 'type': 'array', 'itemType': GdStoreRecord },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 二手车
export class UsedCarInfo extends $tea.Model {
  // 渠道方线索业务id
  /**
   * @example
   * xxxx
   */
  leadId: string;
  // 城市名称
  /**
   * @example
   * xxx
   */
  cityName: string;
  // 城市id
  /**
   * @example
   * xxxx
   */
  cid: string;
  // 品牌名称
  /**
   * @example
   * xxxx
   */
  brandName?: string;
  // 车系名称
  /**
   * @example
   * xxx
   */
  seriesName?: string;
  // 车型名称
  /**
   * @example
   * xxxx
   */
  specName?: string;
  // 首次上牌时间格式 yyyy/MM/dd
  /**
   * @example
   * 2020/01/01
   */
  firstRegTime: string;
  // 行驶公里数(km)
  /**
   * @example
   * 12345.67
   */
  mileage: string;
  // 省份id
  /**
   * @example
   * xxxx
   */
  pid: string;
  // 汽车之家车型id
  /**
   * @example
   * xxxx
   */
  specid: string;
  static names(): { [key: string]: string } {
    return {
      leadId: 'lead_id',
      cityName: 'city_name',
      cid: 'cid',
      brandName: 'brand_name',
      seriesName: 'series_name',
      specName: 'spec_name',
      firstRegTime: 'first_reg_time',
      mileage: 'mileage',
      pid: 'pid',
      specid: 'specid',
    };
  }

  static types(): { [key: string]: any } {
    return {
      leadId: 'string',
      cityName: 'string',
      cid: 'string',
      brandName: 'string',
      seriesName: 'string',
      specName: 'string',
      firstRegTime: 'string',
      mileage: 'string',
      pid: 'string',
      specid: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 品牌列表
export class Brandlist extends $tea.Model {
  // 首字母
  /**
   * @example
   * xxxx
   */
  letter: string;
  // 品牌信息列表
  /**
   * @example
   * 123
   */
  list: LetterInfo[];
  static names(): { [key: string]: string } {
    return {
      letter: 'letter',
      list: 'list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      letter: 'string',
      list: { 'type': 'array', 'itemType': LetterInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 线索状态信息
export class LeadInfo extends $tea.Model {
  // 线索信息
  /**
   * @example
   * xxxx
   */
  leadId: string;
  // 状态值
  /**
   * @example
   * xxxx
   */
  status: string;
  static names(): { [key: string]: string } {
    return {
      leadId: 'lead_id',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      leadId: 'string',
      status: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 区县集合
export class County extends $tea.Model {
  // 城市id
  /**
   * @example
   * xxxx
   */
  cid: string;
  // 区县id
  /**
   * @example
   * xxxx
   */
  countyid: string;
  // 区县名
  /**
   * @example
   * xxxx
   */
  countyname: string;
  static names(): { [key: string]: string } {
    return {
      cid: 'cid',
      countyid: 'countyid',
      countyname: 'countyname',
    };
  }

  static types(): { [key: string]: any } {
    return {
      cid: 'string',
      countyid: 'string',
      countyname: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 常岳用户结构体
export class CyUserInfo extends $tea.Model {
  // 用户id
  /**
   * @example
   * xxx
   */
  userId: string;
  // 用户名
  /**
   * @example
   * xxxx
   */
  userName?: string;
  // 证件号
  /**
   * @example
   * xxx
   */
  idCard?: string;
  // 手机号
  /**
   * @example
   * xxx
   */
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
  /**
   * @example
   * 10001
   */
  afterSpecId: string;
  // 车型Id列表
  specList: SpecList[];
  static names(): { [key: string]: string } {
    return {
      afterSpecId: 'after_spec_id',
      specList: 'spec_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      afterSpecId: 'string',
      specList: { 'type': 'array', 'itemType': SpecList },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 充电报告查询
export class BatteryReport extends $tea.Model {
  // 充电单号，最大长度/规则：32
  /**
   * @example
   * 202603031234567890
   */
  startChargeSeq: string;
  // VIN，最大长度/规则：17位
  /**
   * @example
   * LFV3A2***3123456
   */
  vinCode: string;
  // 公告号，最大长度/规则36
  /**
   * @example
   * BJ7000USD3-BEV
   */
  publicationNo?: string;
  // 本次累积充电量，单位kWh；最大长度/规则：整数位<=10,小数位<=2
  /**
   * @example
   * 25.30
   */
  totalPower?: string;
  // 本次累积充入SOC（%）；最大长度/规则：0-100,小数位<=2
  /**
   * @example
   * 50.00
   */
  totalChargeSoc?: string;
  // 本次充电开始SOC(%)；最大长度/规则：0-100,小数位<=2
  /**
   * @example
   * 25.00
   */
  startSoc?: string;
  // 本次充电截止SOC(%)；最大长度/规则：0-100,小数位<=2
  /**
   * @example
   * 75.00
   */
  endSoc?: string;
  // 标称能量，单位kWh；最大长度/规则：0-1000,小数位<=2
  /**
   * @example
   * 60.00
   */
  nominalEnergy?: string;
  // 充电城市ID；最大长度/规则：30
  /**
   * @example
   * -
   */
  cityId?: string;
  // 注册日期；最大长度/规则：yyyy-MM-dd
  /**
   * @example
   * 2018-10-10
   */
  registerDate?: string;
  // 保障服务标识
  // NONE：无保障
  // SEVEN_DAYS：7天保障
  // THIRTY_DAYS：30天保障
  /**
   * @example
   * NONE
   */
  serviceSafeguardType?: string;
  // 保障码
  // 首次查询后接口返回，后续查询过程中，若该参数不为空且有效则生成复检报告；若不传保障码，则当做首检
  /**
   * @example
   * -
   */
  guaranteeCode?: string;
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
      serviceSafeguardType: 'service_safeguard_type',
      guaranteeCode: 'guarantee_code',
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
      serviceSafeguardType: 'string',
      guaranteeCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 键值对
export class XNameValuePair extends $tea.Model {
  // 键名
  /**
   * @example
   * key
   */
  name: string;
  // 键值
  /**
   * @example
   * value
   */
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
  /**
   * @remarks
   * 待上传文件
   */
  fileObject?: Readable;
  /**
   * @remarks
   * 待上传文件名
   */
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
  // 响应结果
  status?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      usedCarValuation: 'used_car_valuation',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      usedCarValuation: UsedCarValuation,
      status: 'string',
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
  operatorPlatform?: string;
  // 场站名称
  stationName?: string;
  // 场站ID
  stationId?: string;
  // 桩ID
  pileId?: string;
  // 枪序号（充电端口号）
  gunNo?: number;
  // 充电订单号
  chargeOrderNo?: string;
  // 充电量，单位kWh
  chargePower?: string;
  // 服务费，单位元
  serviceFee?: string;
  // 电费，单位元
  electricityFee?: string;
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
  specResult?: SpecResult;
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
      specResult: SpecResult,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryGdStoreRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 场景码
  sceneCode: string;
  // 查询店铺基本信息请求体
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

export class QueryGdStoreResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回消息
  msg?: string;
  // 返回编码，值为10000表示成功，其余值表示失败
  code?: string;
  // 随即返回ID
  requestLinkId?: string;
  // 返回数据
  data?: GdStoreInfo;
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
      code: 'string',
      requestLinkId: 'string',
      data: GdStoreInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryGdPoentialRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 场景码
  sceneCode: string;
  // 潜客指数接口请求体
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

export class QueryGdPoentialResponse extends $tea.Model {
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
  data?: GdPotentialCustomerInfo;
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
      data: GdPotentialCustomerInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RegisterCdsqScratchesRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 平台名称
  partnerCode: string;
  // 交易流水号
  transactionNo: string;
  // 用户ID
  userid?: string;
  // 购买时间
  buytime?: string;
  // 车牌号
  carNo: string;
  // 停车地址
  address: string;
  // 场景码
  sceneCode: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      partnerCode: 'partner_code',
      transactionNo: 'transaction_no',
      userid: 'userid',
      buytime: 'buytime',
      carNo: 'car_no',
      address: 'address',
      sceneCode: 'scene_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      partnerCode: 'string',
      transactionNo: 'string',
      userid: 'string',
      buytime: 'string',
      carNo: 'string',
      address: 'string',
      sceneCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RegisterCdsqScratchesResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 结果码，999999 表示成功
  responseCode?: string;
  // 错误信息，成功时为空
  responseMsg?: string;
  // 保单服务号
  policyNo?: string;
  // 保险起期，格式：yyyy-MM-dd HH:mm:ss
  policyStart?: string;
  // 保险止期，格式：yyyy-MM-dd HH:mm:ss
  policyEnd?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      responseCode: 'response_code',
      responseMsg: 'response_msg',
      policyNo: 'policy_no',
      policyStart: 'policy_start',
      policyEnd: 'policy_end',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      responseCode: 'string',
      responseMsg: 'string',
      policyNo: 'string',
      policyStart: 'string',
      policyEnd: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCdsqScratchesRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 平台名称
  partnerCode: string;
  // 交易流水号
  transactionNo: string;
  // 场景码
  sceneCode: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      partnerCode: 'partner_code',
      transactionNo: 'transaction_no',
      sceneCode: 'scene_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      partnerCode: 'string',
      transactionNo: 'string',
      sceneCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCdsqScratchesResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 结果码，999999 表示成功
  responseCode?: string;
  // 错误信息，成功时为空
  responseMsg?: string;
  // 电子保单 url 地址
  returnPdfValue?: string;
  // 保单服务号
  policyNo?: string;
  // 保单生效时间，格式：yyyy-MM-dd HH:mm:ss
  beginTime?: string;
  // 保单失效时间，格式：yyyy-MM-dd HH:mm:ss
  endTime?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      responseCode: 'response_code',
      responseMsg: 'response_msg',
      returnPdfValue: 'return_pdf_value',
      policyNo: 'policy_no',
      beginTime: 'begin_time',
      endTime: 'end_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      responseCode: 'string',
      responseMsg: 'string',
      returnPdfValue: 'string',
      policyNo: 'string',
      beginTime: 'string',
      endTime: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteCdsqScratchesRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 平台名称
  partnerCode: string;
  // 交易流水号
  transactionNo: string;
  // 场景码
  sceneCode: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      partnerCode: 'partner_code',
      transactionNo: 'transaction_no',
      sceneCode: 'scene_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      partnerCode: 'string',
      transactionNo: 'string',
      sceneCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteCdsqScratchesResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 结果码，999999 表示成功
  responseCode?: string;
  // 错误信息，成功时为空
  responseMsg?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      responseCode: 'response_code',
      responseMsg: 'response_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      responseCode: 'string',
      responseMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CallbackCdsqScratchesRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 交易流水号
  transactionNo: string;
  // 场景码
  sceneCode: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      transactionNo: 'transaction_no',
      sceneCode: 'scene_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      transactionNo: 'string',
      sceneCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CallbackCdsqScratchesResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 结果码，999999 表示成功
  responseCode?: string;
  // 错误信息，成功时为空
  responseMsg?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      responseCode: 'response_code',
      responseMsg: 'response_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      responseCode: 'string',
      responseMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SaveCdsqScratchesRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 平台名称
  partnerCode: string;
  // 交易流水号
  transactionNo: string;
  // 场景码
  sceneCode: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      partnerCode: 'partner_code',
      transactionNo: 'transaction_no',
      sceneCode: 'scene_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      partnerCode: 'string',
      transactionNo: 'string',
      sceneCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SaveCdsqScratchesResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 结果码，999999 表示成功
  responseCode?: string;
  // 错误信息，成功时为空
  responseMsg?: string;
  // 保单状态：1-投保，2-退保
  status?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      responseCode: 'response_code',
      responseMsg: 'response_msg',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      responseCode: 'string',
      responseMsg: 'string',
      status: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCarVinRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 场景码
  sceneCode: string;
  // 车架号
  vinCode: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      sceneCode: 'scene_code',
      vinCode: 'vin_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      sceneCode: 'string',
      vinCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCarVinResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 响应码
  code?: number;
  // 响应消息
  msg?: string;
  // 0:同意，1:拒绝，-1:校验失败
  data?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      msg: 'msg',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'number',
      msg: 'string',
      data: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RegisterTagChanganRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 授权码
  sceneCode: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      sceneCode: 'scene_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      sceneCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RegisterTagChanganResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 授权码
  accessToken?: string;
  // 授权码过期时间，单位s，默认2小时（7200s）
  expiresIn?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      accessToken: 'access_token',
      expiresIn: 'expires_in',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      accessToken: 'string',
      expiresIn: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTagChanganRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 场景码
  sceneCode: string;
  // 请求唯一ID（UUID生成即可）
  requestId: string;
  // 系统
  os?: string;
  // 1表示定制标签查询
  // 2表示标准标签查询
  // 3表示全量标签查询
  type: number;
  // 设备信息
  deviceInfoList: DeviceBean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      sceneCode: 'scene_code',
      requestId: 'request_id',
      os: 'os',
      type: 'type',
      deviceInfoList: 'device_info_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      sceneCode: 'string',
      requestId: 'string',
      os: 'string',
      type: 'number',
      deviceInfoList: DeviceBean,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTagChanganResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回数据，JSON格式字符串
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

export class QueryUsedcarAreaRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 场景码
  sceneCode: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      sceneCode: 'scene_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      sceneCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryUsedcarAreaResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 响应码
  code?: string;
  // 响应信息
  msg?: string;
  // 省份集合
  province?: Province[];
  // 城市集合
  city?: City[];
  // 区县集合
  county?: County[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      msg: 'msg',
      province: 'province',
      city: 'city',
      county: 'county',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'string',
      msg: 'string',
      province: { 'type': 'array', 'itemType': Province },
      city: { 'type': 'array', 'itemType': City },
      county: { 'type': 'array', 'itemType': County },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryUsedcarBrandsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 场景码
  sceneCode: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      sceneCode: 'scene_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      sceneCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryUsedcarBrandsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // xxx
  code?: string;
  // xxx
  msg?: string;
  // 123
  brandlist?: Brandlist[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      msg: 'msg',
      brandlist: 'brandlist',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'string',
      msg: 'string',
      brandlist: { 'type': 'array', 'itemType': Brandlist },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryUsedcarSeriesRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 品牌id
  brandId: string;
  // 场景码
  sceneCode: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      brandId: 'brand_id',
      sceneCode: 'scene_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      brandId: 'string',
      sceneCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryUsedcarSeriesResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 品牌id
  brandid?: string;
  // 车系信息
  serieslist?: LetterInfo[];
  // 品牌名称
  brandname?: string;
  // 状态码
  code?: string;
  // 响应结果
  msg?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      brandid: 'brandid',
      serieslist: 'serieslist',
      brandname: 'brandname',
      code: 'code',
      msg: 'msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      brandid: 'string',
      serieslist: { 'type': 'array', 'itemType': LetterInfo },
      brandname: 'string',
      code: 'string',
      msg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryUsedcarProductsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 车系id
  seriesId: string;
  // 场景码
  sceneCode: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      seriesId: 'series_id',
      sceneCode: 'scene_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      seriesId: 'string',
      sceneCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryUsedcarProductsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 状态码
  code?: string;
  // 状态信息
  msg?: string;
  // 车系名
  seriesname?: string;
  // 车系id
  seriesid?: string;
  // 车型信息
  productlist?: ProductInfo[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      msg: 'msg',
      seriesname: 'seriesname',
      seriesid: 'seriesid',
      productlist: 'productlist',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'string',
      msg: 'string',
      seriesname: 'string',
      seriesid: 'string',
      productlist: { 'type': 'array', 'itemType': ProductInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SyncUsedcarRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 线索状态列表
  leadIdList: string[];
  // 场景码
  sceneCode: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      leadIdList: 'lead_id_list',
      sceneCode: 'scene_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      leadIdList: { 'type': 'array', 'itemType': 'string' },
      sceneCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SyncUsedcarResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 响应值
  code?: string;
  // 响应信息
  msg?: string;
  // 线索状态信息列表
  data?: LeadInfo[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      msg: 'msg',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'string',
      msg: 'string',
      data: { 'type': 'array', 'itemType': LeadInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RegisterCdsqTireinsuranceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 平台名称
  partnerCode: string;
  // 交易流水号
  transactionNo: string;
  // 用户ID
  userid?: string;
  // 方案名称
  // 代步车+置换、轮
  // 胎险+置换、代步
  // 车、四轮轮胎险、
  // 置换、二轮轮胎险
  schemeName: string;
  // 购买时间
  buytime?: string;
  // 场景码
  sceneCode: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      partnerCode: 'partner_code',
      transactionNo: 'transaction_no',
      userid: 'userid',
      schemeName: 'scheme_name',
      buytime: 'buytime',
      sceneCode: 'scene_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      partnerCode: 'string',
      transactionNo: 'string',
      userid: 'string',
      schemeName: 'string',
      buytime: 'string',
      sceneCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RegisterCdsqTireinsuranceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 结果码
  responseCode?: string;
  // 错误信息
  responseMsg?: string;
  // 保单服务号
  policyNo?: string;
  // 保险起期，格式：yyyy-MM-dd HH:mm:ss
  policyStart?: string;
  // 保险止期，格式：yyyy-MM-dd HH:mm:ss
  policyEnd?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      responseCode: 'response_code',
      responseMsg: 'response_msg',
      policyNo: 'policy_no',
      policyStart: 'policy_start',
      policyEnd: 'policy_end',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      responseCode: 'string',
      responseMsg: 'string',
      policyNo: 'string',
      policyStart: 'string',
      policyEnd: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CallbackCdsqTireinsuranceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 交易流水号
  transactionNo: string;
  // 场景码
  sceneCode: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      transactionNo: 'transaction_no',
      sceneCode: 'scene_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      transactionNo: 'string',
      sceneCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CallbackCdsqTireinsuranceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 结果码
  responseCode?: string;
  // 错误信息
  responseMsg?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      responseCode: 'response_code',
      responseMsg: 'response_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      responseCode: 'string',
      responseMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCdsqTireinsuranceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 平台名称
  partnerCode: string;
  // 交易流水号
  transactionNo: string;
  // 场景码
  sceneCode: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      partnerCode: 'partner_code',
      transactionNo: 'transaction_no',
      sceneCode: 'scene_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      partnerCode: 'string',
      transactionNo: 'string',
      sceneCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCdsqTireinsuranceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 结果码
  responseCode?: string;
  // 错误信息
  responseMsg?: string;
  // 保单状态
  // 1：投保
  // 2：退保
  status?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      responseCode: 'response_code',
      responseMsg: 'response_msg',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      responseCode: 'string',
      responseMsg: 'string',
      status: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecUnifiedentranceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 请求参数的json字符串
  params: string;
  // 业务场景码
  sceneCode: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      params: 'params',
      sceneCode: 'scene_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      params: 'string',
      sceneCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecUnifiedentranceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 响应业务数据
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

export class QueryLogsNewRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 场景码
  sceneCode: string;
  // 调用接口类型
  type: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      sceneCode: 'scene_code',
      type: 'type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      sceneCode: 'string',
      type: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryLogsNewResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 出参数据
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

export class ExecLogsNewRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 场景码
  sceneCode: string;
  // 类型
  type: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      sceneCode: 'scene_code',
      type: 'type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      sceneCode: 'string',
      type: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecLogsNewResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 出参
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
          sdk_version: "1.2.5",
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
   * @remarks
   * Description: 推送星贷车信息
   * Summary: 推送星贷车信息
   */
  async pushCarloan(request: PushCarloanRequest): Promise<PushCarloanResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pushCarloanEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 推送星贷车信息
   * Summary: 推送星贷车信息
   */
  async pushCarloanEx(request: PushCarloanRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PushCarloanResponse> {
    Util.validateModel(request);
    return $tea.cast<PushCarloanResponse>(await this.doRequest("1.0", "antdigital.intellicar.carloan.push", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PushCarloanResponse({}));
  }

  /**
   * @remarks
   * Description: 车主信息提交
   * Summary:  车主信息提交
   */
  async registerCarowner(request: RegisterCarownerRequest): Promise<RegisterCarownerResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.registerCarownerEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 车主信息提交
   * Summary:  车主信息提交
   */
  async registerCarownerEx(request: RegisterCarownerRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<RegisterCarownerResponse> {
    Util.validateModel(request);
    return $tea.cast<RegisterCarownerResponse>(await this.doRequest("1.0", "antdigital.intellicar.carowner.register", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new RegisterCarownerResponse({}));
  }

  /**
   * @remarks
   * Description: 新车线索批量提交
   * Summary: 新车线索批量提交
   */
  async batchcreateNewcar(request: BatchcreateNewcarRequest): Promise<BatchcreateNewcarResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.batchcreateNewcarEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 新车线索批量提交
   * Summary: 新车线索批量提交
   */
  async batchcreateNewcarEx(request: BatchcreateNewcarRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BatchcreateNewcarResponse> {
    Util.validateModel(request);
    return $tea.cast<BatchcreateNewcarResponse>(await this.doRequest("1.0", "antdigital.intellicar.newcar.batchcreate", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BatchcreateNewcarResponse({}));
  }

  /**
   * @remarks
   * Description: 提交新车线索
   * Summary:  提交新车线索
   */
  async submitNewcar(request: SubmitNewcarRequest): Promise<SubmitNewcarResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.submitNewcarEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 提交新车线索
   * Summary:  提交新车线索
   */
  async submitNewcarEx(request: SubmitNewcarRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SubmitNewcarResponse> {
    Util.validateModel(request);
    return $tea.cast<SubmitNewcarResponse>(await this.doRequest("1.0", "antdigital.intellicar.newcar.submit", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SubmitNewcarResponse({}));
  }

  /**
   * @remarks
   * Description: 常岳线索推送接口
   * Summary: 常岳线索推送
   */
  async registerCarownerCy(request: RegisterCarownerCyRequest): Promise<RegisterCarownerCyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.registerCarownerCyEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 常岳线索推送接口
   * Summary: 常岳线索推送
   */
  async registerCarownerCyEx(request: RegisterCarownerCyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<RegisterCarownerCyResponse> {
    Util.validateModel(request);
    return $tea.cast<RegisterCarownerCyResponse>(await this.doRequest("1.0", "antdigital.intellicar.carowner.cy.register", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new RegisterCarownerCyResponse({}));
  }

  /**
   * @remarks
   * Description: 车辆价格查询
   * Summary: 车辆价格查询
   */
  async queryCarPrice(request: QueryCarPriceRequest): Promise<QueryCarPriceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryCarPriceEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 车辆价格查询
   * Summary: 车辆价格查询
   */
  async queryCarPriceEx(request: QueryCarPriceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryCarPriceResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryCarPriceResponse>(await this.doRequest("1.0", "antdigital.intellicar.car.price.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryCarPriceResponse({}));
  }

  /**
   * @remarks
   * Description: 文件引入
   * Summary: 文件引入
   */
  async importCarFile(request: ImportCarFileRequest): Promise<ImportCarFileResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.importCarFileEx(request, headers, runtime);
  }

  /**
   * @remarks
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
   * @remarks
   * Description: 汽车之家区域接口
   * Summary: 汽车之家区域接口
   */
  async queryUsedcar(request: QueryUsedcarRequest): Promise<QueryUsedcarResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryUsedcarEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 汽车之家区域接口
   * Summary: 汽车之家区域接口
   */
  async queryUsedcarEx(request: QueryUsedcarRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryUsedcarResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryUsedcarResponse>(await this.doRequest("1.0", "antdigital.intellicar.usedcar.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryUsedcarResponse({}));
  }

  /**
   * @remarks
   * Description: 逸安启回调接口
   * Summary: 逸安启回调接口
   */
  async submitIonchi(request: SubmitIonchiRequest): Promise<SubmitIonchiResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.submitIonchiEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 逸安启回调接口
   * Summary: 逸安启回调接口
   */
  async submitIonchiEx(request: SubmitIonchiRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SubmitIonchiResponse> {
    Util.validateModel(request);
    return $tea.cast<SubmitIonchiResponse>(await this.doRequest("1.0", "antdigital.intellicar.ionchi.submit", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SubmitIonchiResponse({}));
  }

  /**
   * @remarks
   * Description: 对接高德，查询潜客流向以及重叠的数据
   * Summary: 【高德】流向与重叠数据
   */
  async queryGdFlow(request: QueryGdFlowRequest): Promise<QueryGdFlowResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryGdFlowEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 对接高德，查询潜客流向以及重叠的数据
   * Summary: 【高德】流向与重叠数据
   */
  async queryGdFlowEx(request: QueryGdFlowRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryGdFlowResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryGdFlowResponse>(await this.doRequest("1.0", "antdigital.intellicar.gd.flow.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryGdFlowResponse({}));
  }

  /**
   * @remarks
   * Description: 电池衰退权益报告查询接口
   * Summary: 电池衰退权益报告查询接口
   */
  async queryBatteryReport(request: QueryBatteryReportRequest): Promise<QueryBatteryReportResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryBatteryReportEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 电池衰退权益报告查询接口
   * Summary: 电池衰退权益报告查询接口
   */
  async queryBatteryReportEx(request: QueryBatteryReportRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryBatteryReportResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryBatteryReportResponse>(await this.doRequest("1.0", "antdigital.intellicar.battery.report.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryBatteryReportResponse({}));
  }

  /**
   * @remarks
   * Description: 用来查询汽车之家车型和城市列表
   * Summary: 用来查询汽车之家车型和城市列表
   */
  async queryNewcarQczj(request: QueryNewcarQczjRequest): Promise<QueryNewcarQczjResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryNewcarQczjEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 用来查询汽车之家车型和城市列表
   * Summary: 用来查询汽车之家车型和城市列表
   */
  async queryNewcarQczjEx(request: QueryNewcarQczjRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryNewcarQczjResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryNewcarQczjResponse>(await this.doRequest("1.0", "antdigital.intellicar.newcar.qczj.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryNewcarQczjResponse({}));
  }

  /**
   * @remarks
   * Description: 【高德】查询店铺基本信息
   * Summary: 【高德】查询店铺基本信息
   */
  async queryGdStore(request: QueryGdStoreRequest): Promise<QueryGdStoreResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryGdStoreEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 【高德】查询店铺基本信息
   * Summary: 【高德】查询店铺基本信息
   */
  async queryGdStoreEx(request: QueryGdStoreRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryGdStoreResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryGdStoreResponse>(await this.doRequest("1.0", "antdigital.intellicar.gd.store.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryGdStoreResponse({}));
  }

  /**
   * @remarks
   * Description: 【高德】潜客指数数据
   * Summary: 【高德】潜客指数数据
   */
  async queryGdPoential(request: QueryGdPoentialRequest): Promise<QueryGdPoentialResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryGdPoentialEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 【高德】潜客指数数据
   * Summary: 【高德】潜客指数数据
   */
  async queryGdPoentialEx(request: QueryGdPoentialRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryGdPoentialResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryGdPoentialResponse>(await this.doRequest("1.0", "antdigital.intellicar.gd.poential.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryGdPoentialResponse({}));
  }

  /**
   * @remarks
   * Description: 对接车道山前擦碰无忧接口
   * Summary: 对接车道山前擦碰无忧接口
   */
  async registerCdsqScratches(request: RegisterCdsqScratchesRequest): Promise<RegisterCdsqScratchesResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.registerCdsqScratchesEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 对接车道山前擦碰无忧接口
   * Summary: 对接车道山前擦碰无忧接口
   */
  async registerCdsqScratchesEx(request: RegisterCdsqScratchesRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<RegisterCdsqScratchesResponse> {
    Util.validateModel(request);
    return $tea.cast<RegisterCdsqScratchesResponse>(await this.doRequest("1.0", "antdigital.intellicar.cdsq.scratches.register", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new RegisterCdsqScratchesResponse({}));
  }

  /**
   * @remarks
   * Description: 车到山前查询权益接口
   * Summary: 车到山前查询权益接口
   */
  async queryCdsqScratches(request: QueryCdsqScratchesRequest): Promise<QueryCdsqScratchesResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryCdsqScratchesEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 车到山前查询权益接口
   * Summary: 车到山前查询权益接口
   */
  async queryCdsqScratchesEx(request: QueryCdsqScratchesRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryCdsqScratchesResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryCdsqScratchesResponse>(await this.doRequest("1.0", "antdigital.intellicar.cdsq.scratches.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryCdsqScratchesResponse({}));
  }

  /**
   * @remarks
   * Description: 车到山前权益退保接口
   * Summary: 车到山前权益退保接口
   */
  async deleteCdsqScratches(request: DeleteCdsqScratchesRequest): Promise<DeleteCdsqScratchesResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteCdsqScratchesEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 车到山前权益退保接口
   * Summary: 车到山前权益退保接口
   */
  async deleteCdsqScratchesEx(request: DeleteCdsqScratchesRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteCdsqScratchesResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteCdsqScratchesResponse>(await this.doRequest("1.0", "antdigital.intellicar.cdsq.scratches.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteCdsqScratchesResponse({}));
  }

  /**
   * @remarks
   * Description: 车到山前权益退保回调接口
   * Summary: 车到山前权益退保回调接口
   */
  async callbackCdsqScratches(request: CallbackCdsqScratchesRequest): Promise<CallbackCdsqScratchesResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.callbackCdsqScratchesEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 车到山前权益退保回调接口
   * Summary: 车到山前权益退保回调接口
   */
  async callbackCdsqScratchesEx(request: CallbackCdsqScratchesRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CallbackCdsqScratchesResponse> {
    Util.validateModel(request);
    return $tea.cast<CallbackCdsqScratchesResponse>(await this.doRequest("1.0", "antdigital.intellicar.cdsq.scratches.callback", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CallbackCdsqScratchesResponse({}));
  }

  /**
   * @remarks
   * Description: 车到山前权益状态查询
   * Summary: 车到山前权益状态查询
   */
  async saveCdsqScratches(request: SaveCdsqScratchesRequest): Promise<SaveCdsqScratchesResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.saveCdsqScratchesEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 车到山前权益状态查询
   * Summary: 车到山前权益状态查询
   */
  async saveCdsqScratchesEx(request: SaveCdsqScratchesRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SaveCdsqScratchesResponse> {
    Util.validateModel(request);
    return $tea.cast<SaveCdsqScratchesResponse>(await this.doRequest("1.0", "antdigital.intellicar.cdsq.scratches.save", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SaveCdsqScratchesResponse({}));
  }

  /**
   * @remarks
   * Description: 常岳车贷线索预判接口
   * Summary: 常岳车贷线索预判接口
   */
  async queryCarVin(request: QueryCarVinRequest): Promise<QueryCarVinResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryCarVinEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 常岳车贷线索预判接口
   * Summary: 常岳车贷线索预判接口
   */
  async queryCarVinEx(request: QueryCarVinRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryCarVinResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryCarVinResponse>(await this.doRequest("1.0", "antdigital.intellicar.car.vin.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryCarVinResponse({}));
  }

  /**
   * @remarks
   * Description: 长安画像标签授权接口
   * Summary: 长安画像标签授权接口
   */
  async registerTagChangan(request: RegisterTagChanganRequest): Promise<RegisterTagChanganResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.registerTagChanganEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 长安画像标签授权接口
   * Summary: 长安画像标签授权接口
   */
  async registerTagChanganEx(request: RegisterTagChanganRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<RegisterTagChanganResponse> {
    Util.validateModel(request);
    return $tea.cast<RegisterTagChanganResponse>(await this.doRequest("1.0", "antdigital.intellicar.tag.changan.register", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new RegisterTagChanganResponse({}));
  }

  /**
   * @remarks
   * Description: 长安画像标签用户id标签查询1
   * Summary: 长安画像标签用户id标签查询1
   */
  async queryTagChangan(request: QueryTagChanganRequest): Promise<QueryTagChanganResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryTagChanganEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 长安画像标签用户id标签查询1
   * Summary: 长安画像标签用户id标签查询1
   */
  async queryTagChanganEx(request: QueryTagChanganRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryTagChanganResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryTagChanganResponse>(await this.doRequest("1.0", "antdigital.intellicar.tag.changan.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryTagChanganResponse({}));
  }

  /**
   * @remarks
   * Description: 汽车之家区域接口
   * Summary: 汽车之家区域接口
   */
  async queryUsedcarArea(request: QueryUsedcarAreaRequest): Promise<QueryUsedcarAreaResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryUsedcarAreaEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 汽车之家区域接口
   * Summary: 汽车之家区域接口
   */
  async queryUsedcarAreaEx(request: QueryUsedcarAreaRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryUsedcarAreaResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryUsedcarAreaResponse>(await this.doRequest("1.0", "antdigital.intellicar.usedcar.area.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryUsedcarAreaResponse({}));
  }

  /**
   * @remarks
   * Description: 获取汽车之家品牌信息
   * Summary: 获取汽车之家品牌信息
   */
  async queryUsedcarBrands(request: QueryUsedcarBrandsRequest): Promise<QueryUsedcarBrandsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryUsedcarBrandsEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 获取汽车之家品牌信息
   * Summary: 获取汽车之家品牌信息
   */
  async queryUsedcarBrandsEx(request: QueryUsedcarBrandsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryUsedcarBrandsResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryUsedcarBrandsResponse>(await this.doRequest("1.0", "antdigital.intellicar.usedcar.brands.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryUsedcarBrandsResponse({}));
  }

  /**
   * @remarks
   * Description: 汽车之家车系接口
   * Summary: 汽车之家车系接口
   */
  async queryUsedcarSeries(request: QueryUsedcarSeriesRequest): Promise<QueryUsedcarSeriesResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryUsedcarSeriesEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 汽车之家车系接口
   * Summary: 汽车之家车系接口
   */
  async queryUsedcarSeriesEx(request: QueryUsedcarSeriesRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryUsedcarSeriesResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryUsedcarSeriesResponse>(await this.doRequest("1.0", "antdigital.intellicar.usedcar.series.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryUsedcarSeriesResponse({}));
  }

  /**
   * @remarks
   * Description: 汽车之家车型接口
   * Summary: 汽车之家车型接口
   */
  async queryUsedcarProducts(request: QueryUsedcarProductsRequest): Promise<QueryUsedcarProductsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryUsedcarProductsEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 汽车之家车型接口
   * Summary: 汽车之家车型接口
   */
  async queryUsedcarProductsEx(request: QueryUsedcarProductsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryUsedcarProductsResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryUsedcarProductsResponse>(await this.doRequest("1.0", "antdigital.intellicar.usedcar.products.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryUsedcarProductsResponse({}));
  }

  /**
   * @remarks
   * Description: 获取二手车线索状态
   * Summary: 获取二手车线索状态
   */
  async syncUsedcar(request: SyncUsedcarRequest): Promise<SyncUsedcarResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.syncUsedcarEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 获取二手车线索状态
   * Summary: 获取二手车线索状态
   */
  async syncUsedcarEx(request: SyncUsedcarRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SyncUsedcarResponse> {
    Util.validateModel(request);
    return $tea.cast<SyncUsedcarResponse>(await this.doRequest("1.0", "antdigital.intellicar.usedcar.sync", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SyncUsedcarResponse({}));
  }

  /**
   * @remarks
   * Description: 轮胎投保接口
   * Summary: 轮胎投保接口
   */
  async registerCdsqTireinsurance(request: RegisterCdsqTireinsuranceRequest): Promise<RegisterCdsqTireinsuranceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.registerCdsqTireinsuranceEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 轮胎投保接口
   * Summary: 轮胎投保接口
   */
  async registerCdsqTireinsuranceEx(request: RegisterCdsqTireinsuranceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<RegisterCdsqTireinsuranceResponse> {
    Util.validateModel(request);
    return $tea.cast<RegisterCdsqTireinsuranceResponse>(await this.doRequest("1.0", "antdigital.intellicar.cdsq.tireinsurance.register", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new RegisterCdsqTireinsuranceResponse({}));
  }

  /**
   * @remarks
   * Description: 轮胎回调接口
   * Summary: 轮胎回调接口
   */
  async callbackCdsqTireinsurance(request: CallbackCdsqTireinsuranceRequest): Promise<CallbackCdsqTireinsuranceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.callbackCdsqTireinsuranceEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 轮胎回调接口
   * Summary: 轮胎回调接口
   */
  async callbackCdsqTireinsuranceEx(request: CallbackCdsqTireinsuranceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CallbackCdsqTireinsuranceResponse> {
    Util.validateModel(request);
    return $tea.cast<CallbackCdsqTireinsuranceResponse>(await this.doRequest("1.0", "antdigital.intellicar.cdsq.tireinsurance.callback", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CallbackCdsqTireinsuranceResponse({}));
  }

  /**
   * @remarks
   * Description: 轮胎权益接口查询状态
   * Summary: 轮胎权益接口查询状态
   */
  async queryCdsqTireinsurance(request: QueryCdsqTireinsuranceRequest): Promise<QueryCdsqTireinsuranceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryCdsqTireinsuranceEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 轮胎权益接口查询状态
   * Summary: 轮胎权益接口查询状态
   */
  async queryCdsqTireinsuranceEx(request: QueryCdsqTireinsuranceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryCdsqTireinsuranceResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryCdsqTireinsuranceResponse>(await this.doRequest("1.0", "antdigital.intellicar.cdsq.tireinsurance.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryCdsqTireinsuranceResponse({}));
  }

  /**
   * @remarks
   * Description: 增加统一调用泛化接口
   * Summary: 增加统一调用泛化接口
   */
  async execUnifiedentrance(request: ExecUnifiedentranceRequest): Promise<ExecUnifiedentranceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.execUnifiedentranceEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 增加统一调用泛化接口
   * Summary: 增加统一调用泛化接口
   */
  async execUnifiedentranceEx(request: ExecUnifiedentranceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExecUnifiedentranceResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecUnifiedentranceResponse>(await this.doRequest("1.0", "antdigital.intellicar.unifiedentrance.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExecUnifiedentranceResponse({}));
  }

  /**
   * @remarks
   * Description: 测试日志改造成果
   * Summary: 测试日志改造成果
   */
  async queryLogsNew(request: QueryLogsNewRequest): Promise<QueryLogsNewResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryLogsNewEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 测试日志改造成果
   * Summary: 测试日志改造成果
   */
  async queryLogsNewEx(request: QueryLogsNewRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryLogsNewResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryLogsNewResponse>(await this.doRequest("1.0", "antdigital.intellicar.logs.new.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryLogsNewResponse({}));
  }

  /**
   * @remarks
   * Description: 日志改造测试
   * Summary: 日志改造测试
   */
  async execLogsNew(request: ExecLogsNewRequest): Promise<ExecLogsNewResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.execLogsNewEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 日志改造测试
   * Summary: 日志改造测试
   */
  async execLogsNewEx(request: ExecLogsNewRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExecLogsNewResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecLogsNewResponse>(await this.doRequest("1.0", "antdigital.intellicar.logs.new.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExecLogsNewResponse({}));
  }

  /**
   * @remarks
   * Description: 创建HTTP PUT提交的文件上传
   * Summary: 文件上传创建
   */
  async createAntcloudGatewayxFileUpload(request: CreateAntcloudGatewayxFileUploadRequest): Promise<CreateAntcloudGatewayxFileUploadResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createAntcloudGatewayxFileUploadEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 创建HTTP PUT提交的文件上传
   * Summary: 文件上传创建
   */
  async createAntcloudGatewayxFileUploadEx(request: CreateAntcloudGatewayxFileUploadRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateAntcloudGatewayxFileUploadResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateAntcloudGatewayxFileUploadResponse>(await this.doRequest("1.0", "antcloud.gatewayx.file.upload.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateAntcloudGatewayxFileUploadResponse({}));
  }

}
