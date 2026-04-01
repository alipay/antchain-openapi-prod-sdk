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
  shopId?: string;
  // 城市编码，数据类型为店铺或者城市时返回该属性与值
  citycode?: string;
  // 省份编码，数据类型为省份时返回该属性与值
  pcode?: string;
  // 数据类型为全国时返回该属性与值
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
  brandId: string;
  // 流入店铺id，数据类型为店铺时返回该属性与值
  shopId?: string;
  // 流入城市编码，数据类型为店铺或者城市时返回该属性与值
  citycode?: string;
  // 省份编码，数据类型为省份时返回该属性与值
  pcode?: string;
  // 数据类型为全国时返回该属性与值
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
  brandId: string;
  // 重叠店铺id，数据类型为店铺时返回该属性与值
  shopId?: string;
  // 重叠城市编码，数据类型为城市时返回该属性与值
  citycode?: string;
  // 重叠省份编码，数据类型为省份时返回该属性与值
  pcode?: string;
  // 数据类型为全国时返回该属性与值
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

// 高德店铺基本系返回record
export class GdStoreRecord extends $tea.Model {
  // 店铺ID
  shopId: string;
  // 店铺名称
  name: string;
  // 店铺地址
  address: string;
  // 店铺所在省份
  pname: string;
  // 店铺所在城市
  cityname: string;
  // 品牌id
  brandId: string;
  // 品牌名称
  brandName: string;
  // 经销商代码
  officeCode: string;
  // 经度
  lon: string;
  // 纬度
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
  citycode?: string;
  // pv指数
  pv: GdCustomerPv;
  // 店铺id，数据类型为店铺时返回该属性与值
  shopId?: string;
  // 品牌id
  brandId: string;
  // 店铺数量（dataType!=SHOP时返回该字段）
  shopNum?: number;
  // 时间（时间类型为天时：yyyyMMdd；时间类型为周时：yyyyWW；时间类型为月时：yyyyMM）
  time: string;
  // 省份编码，数据类型为省份时返回该属性与值
  pcode?: string;
  // 数据类型为全国时返回该属性与值
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
  destList: GdDest[];
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
      destList: { 'type': 'array', 'itemType': GdDest },
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

// 高德潜客请求req
export class GdCustomerFlow extends $tea.Model {
  // 当前页面
  current: number;
  // 数据类型（SHOP：店铺；CITY：城市；PROVINCE：省份；COUNTRY：全国；SHOP_BRAND：店铺品牌(仅限竞品)）
  dataType?: string;
  // 时间类型（DAY：天；WEEK：周；MONTH：月；仅针对城市和店铺品牌的竞品数据支持的时间类型为，季度：QUARTER；半年：HALF；年：YEAR）
  timeType?: string;
  // 主品牌id
  mainBrand?: string;
  // 时间（时间类型为天时：yyyyMMdd；时间类型为周时：yyyyWW；时间类型为月时：yyyyMM；时间类型为季度时：yyyyQQ；时间类型为半年时：yyyyBB；时间类型为年时：yyyy；）
  time?: string;
  // 品牌id，以”,”分隔
  brandLimit?: string;
  // 数据指数类型（pv、uv中选择，多个以”,”分隔）
  dataLimit?: string;
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

// 高德潜客指数返回数据对象
export class GdPotentialCustomerInfo extends $tea.Model {
  // 时间范围（查询月度或年度数据时，返回该字段）
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
          sdk_version: "1.0.24",
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
   * Description: 【高德】查询店铺基本信息
   * Summary: 【高德】查询店铺基本信息
   */
  async queryGdStore(request: QueryGdStoreRequest): Promise<QueryGdStoreResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryGdStoreEx(request, headers, runtime);
  }

  /**
   * Description: 【高德】查询店铺基本信息
   * Summary: 【高德】查询店铺基本信息
   */
  async queryGdStoreEx(request: QueryGdStoreRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryGdStoreResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryGdStoreResponse>(await this.doRequest("1.0", "antdigital.intellicar.gd.store.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryGdStoreResponse({}));
  }

  /**
   * Description: 【高德】潜客指数数据
   * Summary: 【高德】潜客指数数据
   */
  async queryGdPoential(request: QueryGdPoentialRequest): Promise<QueryGdPoentialResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryGdPoentialEx(request, headers, runtime);
  }

  /**
   * Description: 【高德】潜客指数数据
   * Summary: 【高德】潜客指数数据
   */
  async queryGdPoentialEx(request: QueryGdPoentialRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryGdPoentialResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryGdPoentialResponse>(await this.doRequest("1.0", "antdigital.intellicar.gd.poential.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryGdPoentialResponse({}));
  }

}
