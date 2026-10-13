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

// 文档切片信息
export class DocumentChunkDTO extends $tea.Model {
  // 切片内容
  /**
   * @example
   * content
   */
  content: string;
  static names(): { [key: string]: string } {
    return {
      content: 'content',
    };
  }

  static types(): { [key: string]: any } {
    return {
      content: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 文档段落信息
export class DocumentParagraphDTO extends $tea.Model {
  // 段落标题
  /**
   * @example
   * title
   */
  title: string;
  // 段落内容
  /**
   * @example
   * content
   */
  content: string;
  // 切片列表
  /**
   * @example
   * undefined
   */
  chunks: DocumentChunkDTO[];
  static names(): { [key: string]: string } {
    return {
      title: 'title',
      content: 'content',
      chunks: 'chunks',
    };
  }

  static types(): { [key: string]: any } {
    return {
      title: 'string',
      content: 'string',
      chunks: { 'type': 'array', 'itemType': DocumentChunkDTO },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 相似特征数据
export class SimilarFeatureData extends $tea.Model {
  // 时间点位
  /**
   * @example
   * 时间点位
   */
  period: string;
  // 运行日日前电价
  /**
   * @example
   * 10.0
   */
  runDayAheadPrice?: string;
  // 相似日日前电价
  /**
   * @example
   * 10.0
   */
  similarDayAheadPrice?: string;
  // 相似日实际电价
  /**
   * @example
   * 10.0
   */
  similarRealtimePrice?: string;
  // 运行日预出清数据值
  /**
   * @example
   * 10.0
   */
  runPreclearingData?: string;
  // 相似日预出清数据值
  /**
   * @example
   * 10.0
   */
  similarPreclearingData?: string;
  // 相似日实际数据值
  /**
   * @example
   * 10.0
   */
  similarRealtimeData?: string;
  // 预出清数据偏差值, =运行日预出清数据值-相似日预出清数据值
  /**
   * @example
   * 0.0
   */
  deviationData?: string;
  static names(): { [key: string]: string } {
    return {
      period: 'period',
      runDayAheadPrice: 'run_day_ahead_price',
      similarDayAheadPrice: 'similar_day_ahead_price',
      similarRealtimePrice: 'similar_realtime_price',
      runPreclearingData: 'run_preclearing_data',
      similarPreclearingData: 'similar_preclearing_data',
      similarRealtimeData: 'similar_realtime_data',
      deviationData: 'deviation_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      period: 'string',
      runDayAheadPrice: 'string',
      similarDayAheadPrice: 'string',
      similarRealtimePrice: 'string',
      runPreclearingData: 'string',
      similarPreclearingData: 'string',
      similarRealtimeData: 'string',
      deviationData: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 现货电价预测
export class PricePredictionItem extends $tea.Model {
  // 时间点位
  /**
   * @example
   * 01:00
   */
  period: string;
  // 预测电价，单位：元/mwh
  /**
   * @example
   * 0.7
   */
  predictedPrice: string;
  // 实际电价，单位：元/mwh
  /**
   * @example
   * 10.0
   */
  actualPrice?: string;
  static names(): { [key: string]: string } {
    return {
      period: 'period',
      predictedPrice: 'predicted_price',
      actualPrice: 'actual_price',
    };
  }

  static types(): { [key: string]: any } {
    return {
      period: 'string',
      predictedPrice: 'string',
      actualPrice: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 相似日分析结果
export class SimilarDayAnalysisData extends $tea.Model {
  // 综合相似度，单位%
  /**
   * @example
   * 10.0
   */
  comSimilarValue: string;
  // 特征相似度，单位%
  /**
   * @example
   * 10.0
   */
  featureSimilarValue: string;
  // 特征数据列表
  similarFeatureData: SimilarFeatureData[];
  static names(): { [key: string]: string } {
    return {
      comSimilarValue: 'com_similar_value',
      featureSimilarValue: 'feature_similar_value',
      similarFeatureData: 'similar_feature_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      comSimilarValue: 'string',
      featureSimilarValue: 'string',
      similarFeatureData: { 'type': 'array', 'itemType': SimilarFeatureData },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 天气预警信息数据
export class WeatherWarningData extends $tea.Model {
  // 区县名
  /**
   * @example
   * 宜兴市
   */
  district: string;
  // 预警级别
  /**
   * @example
   * 2
   */
  level?: string;
  // 预警等级
  /**
   * @example
   * Yellow
   */
  severityColor?: string;
  // 预警类型
  /**
   * @example
   * other
   */
  type?: string;
  // 发布时间
  /**
   * @example
   * 2026-01-01T01:54:00.000+00:00
   */
  pubTime: string;
  // 预警开始时间
  /**
   * @example
   * 2026-01-01T01:54:00.000+00:00
   */
  warningStartTime?: string;
  // 预警结束时间
  /**
   * @example
   * 2026-01-01T01:54:00.000+00:00
   */
  warningEndTime?: string;
  // 标题
  /**
   * @example
   * 如东县气象台发布海区大风黄色预警
   */
  title: string;
  // 预警内容
  /**
   * @example
   * 受较强冷空气影响，预计1日夜里到2日白天我县海区将出现9级左右的偏北大风
   */
  content?: string;
  static names(): { [key: string]: string } {
    return {
      district: 'district',
      level: 'level',
      severityColor: 'severity_color',
      type: 'type',
      pubTime: 'pub_time',
      warningStartTime: 'warning_start_time',
      warningEndTime: 'warning_end_time',
      title: 'title',
      content: 'content',
    };
  }

  static types(): { [key: string]: any } {
    return {
      district: 'string',
      level: 'string',
      severityColor: 'string',
      type: 'string',
      pubTime: 'string',
      warningStartTime: 'string',
      warningEndTime: 'string',
      title: 'string',
      content: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 市场价格
export class MarketPrice extends $tea.Model {
  // 市场码
  /**
   * @example
   * JS
   */
  marketCode: string;
  // 目标日期,格式 yyyy-MM-dd
  /**
   * @example
   * 2026-07-12
   */
  targetDate: string;
  // 查询类型:DAY_AHEAD/REALTIME
  /**
   * @example
   * DAY_AHEAD
   */
  queryType: string;
  // 价格类型
  /**
   * @example
   * CLEARING
   */
  priceType: string;
  // 时点编号,1~96 整数
  /**
   * @example
   * 1
   */
  period: string;
  // 价格值,单位 元/MWh
  /**
   * @example
   * 100.50
   */
  priceValue: string;
  // 数据源更新时间,ISO8601 格式
  /**
   * @example
   * 2026-07-12T08:00:00Z
   */
  sourceUpdatedAt: string;
  static names(): { [key: string]: string } {
    return {
      marketCode: 'market_code',
      targetDate: 'target_date',
      queryType: 'query_type',
      priceType: 'price_type',
      period: 'period',
      priceValue: 'price_value',
      sourceUpdatedAt: 'source_updated_at',
    };
  }

  static types(): { [key: string]: any } {
    return {
      marketCode: 'string',
      targetDate: 'string',
      queryType: 'string',
      priceType: 'string',
      period: 'string',
      priceValue: 'string',
      sourceUpdatedAt: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 文档基础信息
export class DocumentInfoDTO extends $tea.Model {
  // 文档id
  /**
   * @example
   * id
   */
  id: string;
  // 文档名称
  /**
   * @example
   * name
   */
  name: string;
  // 文件大小
  /**
   * @example
   * file_size
   */
  fileSize: number;
  // 文件类型
  /**
   * @example
   * file_type
   */
  fileType: string;
  // oss下载地址
  /**
   * @example
   * oss_url
   */
  ossUrl: string;
  // 文件md5
  /**
   * @example
   * md5
   */
  md5: string;
  // 文档来源
  /**
   * @example
   * source
   */
  source: string;
  // 文档提供方的附加信息
  /**
   * @example
   * source_ext
   */
  sourceExt: string;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      name: 'name',
      fileSize: 'file_size',
      fileType: 'file_type',
      ossUrl: 'oss_url',
      md5: 'md5',
      source: 'source',
      sourceExt: 'source_ext',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'string',
      name: 'string',
      fileSize: 'number',
      fileType: 'string',
      ossUrl: 'string',
      md5: 'string',
      source: 'string',
      sourceExt: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 日前与实时价差预测数据
export class AheadRealtimePriceDiffPredictionData extends $tea.Model {
  // 时间点位
  /**
   * @example
   * 01:00
   */
  period: string;
  // 实际价差方向
  /**
   * @example
   * 10.0
   */
  realDirection?: string;
  // 预测价差方向
  /**
   * @example
   * 10.0
   */
  preDirection?: string;
  // 实际日前实时价差
  /**
   * @example
   * 10.0
   */
  realDayAheadDiff?: string;
  // 预测日前实时价差
  /**
   * @example
   * 10.0
   */
  preDayAheadDiff?: string;
  static names(): { [key: string]: string } {
    return {
      period: 'period',
      realDirection: 'real_direction',
      preDirection: 'pre_direction',
      realDayAheadDiff: 'real_day_ahead_diff',
      preDayAheadDiff: 'pre_day_ahead_diff',
    };
  }

  static types(): { [key: string]: any } {
    return {
      period: 'string',
      realDirection: 'string',
      preDirection: 'string',
      realDayAheadDiff: 'string',
      preDayAheadDiff: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 附件详情
export class EpiAdmEnergyPolicyAttachment extends $tea.Model {
  // 文件名称
  /**
   * @example
   * 文件名称.pdf
   */
  filename?: string;
  // 文件下载地址
  /**
   * @example
   * https://www.oss.com/download
   */
  fileurl?: string;
  static names(): { [key: string]: string } {
    return {
      filename: 'filename',
      fileurl: 'fileurl',
    };
  }

  static types(): { [key: string]: any } {
    return {
      filename: 'string',
      fileurl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 竞价空间分析数据
export class BiddingAnalysisData extends $tea.Model {
  // 时间点位
  /**
   * @example
   * 01:00
   */
  period: string;
  // 实时数据
  /**
   * @example
   * 10.0
   */
  realtimeData?: string;
  // 日前数据
  /**
   * @example
   * 10.0
   */
  dayAheadData?: string;
  // 预出清数据
  /**
   * @example
   * 10.0
   */
  preclearingData?: string;
  // 实际数据
  /**
   * @example
   * 10.0
   */
  actualData?: string;
  // 实时预测数据
  /**
   * @example
   * 10.0
   */
  realtimePredictionData?: string;
  // 日前预测数据
  /**
   * @example
   * 10.0
   */
  dayAheadPredictionData?: string;
  // 偏差值
  /**
   * @example
   * 10.0
   */
  deviationData?: string;
  static names(): { [key: string]: string } {
    return {
      period: 'period',
      realtimeData: 'realtime_data',
      dayAheadData: 'day_ahead_data',
      preclearingData: 'preclearing_data',
      actualData: 'actual_data',
      realtimePredictionData: 'realtime_prediction_data',
      dayAheadPredictionData: 'day_ahead_prediction_data',
      deviationData: 'deviation_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      period: 'string',
      realtimeData: 'string',
      dayAheadData: 'string',
      preclearingData: 'string',
      actualData: 'string',
      realtimePredictionData: 'string',
      dayAheadPredictionData: 'string',
      deviationData: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 文档加工数据
export class DocumentProcessingDataDTO extends $tea.Model {
  // 段落列表
  /**
   * @example
   * undefined
   */
  paragraphs: DocumentParagraphDTO[];
  // 文档标题
  /**
   * @example
   * title
   */
  title: string;
  // 原文内容
  /**
   * @example
   * content
   */
  content: string;
  static names(): { [key: string]: string } {
    return {
      paragraphs: 'paragraphs',
      title: 'title',
      content: 'content',
    };
  }

  static types(): { [key: string]: any } {
    return {
      paragraphs: { 'type': 'array', 'itemType': DocumentParagraphDTO },
      title: 'string',
      content: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 日前实时电价对比信息
export class AheadRealtimePriceCompareData extends $tea.Model {
  // 时间点位
  /**
   * @example
   * 01:00
   */
  period: string;
  // 日前大于实时占比
  /**
   * @example
   * 10.0
   */
  realtimeRate?: string;
  // 日前等于实时占比
  /**
   * @example
   * 10.0
   */
  dayaheadRate?: string;
  // 日前小于实时占比
  /**
   * @example
   * 10.0
   */
  equalRate?: string;
  // 偏差值
  /**
   * @example
   * 10.0
   */
  deviationData?: string;
  // 实时电价均值
  /**
   * @example
   * 10.0
   */
  realtimeAvg?: string;
  // 日前电价均值
  /**
   * @example
   * 10.0
   */
  dayAheadAvg?: string;
  // 偏差均值
  /**
   * @example
   * 10.0
   */
  deviationAvg?: string;
  // 差价数值
  /**
   * @example
   * 10.0
   */
  priceDiff?: string;
  // 价差均值
  /**
   * @example
   * 10.0
   */
  priceDiffAvg?: string;
  static names(): { [key: string]: string } {
    return {
      period: 'period',
      realtimeRate: 'realtime_rate',
      dayaheadRate: 'dayahead_rate',
      equalRate: 'equal_rate',
      deviationData: 'deviation_data',
      realtimeAvg: 'realtime_avg',
      dayAheadAvg: 'day_ahead_avg',
      deviationAvg: 'deviation_avg',
      priceDiff: 'price_diff',
      priceDiffAvg: 'price_diff_avg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      period: 'string',
      realtimeRate: 'string',
      dayaheadRate: 'string',
      equalRate: 'string',
      deviationData: 'string',
      realtimeAvg: 'string',
      dayAheadAvg: 'string',
      deviationAvg: 'string',
      priceDiff: 'string',
      priceDiffAvg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 中长期预测单时刻数据，6 小时间隔。字段按网关要求使用下划线命名，描述注明对应 WeatherLongRangeVariableDTO 属性；未请求或缺失的要素可为空。
export class WeatherLongRangeVariable extends $tea.Model {
  // 预测数据时刻，格式 yyyy-MM-dd HH:mm:ss，对应 variableDate。
  /**
   * @example
   * 2026-10-07 00:00:00
   */
  variableDate?: string;
  // 预测数据批次时间，格式 yyyy-MM-dd HH:mm:ss，对应 forecastBatchTime。
  /**
   * @example
   * 2026-09-21 08:00:00
   */
  forecastBatchTime?: string;
  // 2 米气温，单位 ℃；对应 temperature2m。
  /**
   * @example
   * 25.3
   */
  temperature2m?: string;
  // 2 米露点温度，单位 ℃；对应 dewPoint2m。
  /**
   * @example
   * 18.2
   */
  dewPoint2m?: string;
  // 体感温度，单位 ℃；对应 apparentTemperature。
  /**
   * @example
   * 27.1
   */
  apparentTemperature?: string;
  // 2 米相对湿度，单位 %；对应 relativeHumidity2m。
  /**
   * @example
   * 65
   */
  relativeHumidity2m?: string;
  // 海平面气压，单位 hPa；对应 pressureMsl。
  /**
   * @example
   * 1013.2
   */
  pressureMsl?: string;
  // 地表气压，单位 hPa；对应 surfacePressure。
  /**
   * @example
   * 1008.6
   */
  surfacePressure?: string;
  // 平台天气编码，由源天气编码转换；对应 weatherCode。
  /**
   * @example
   * 3
   */
  weatherCode?: string;
  // 降水量，单位 mm；对应 precipitation。
  /**
   * @example
   * 0.3
   */
  precipitation?: string;
  // 云量，单位 %；对应 cloudCover。
  /**
   * @example
   * 60
   */
  cloudCover?: string;
  // 10 米风速，单位 m/s；对应 windSpeed10m。
  /**
   * @example
   * 3.2
   */
  windSpeed10m?: string;
  // 100 米风速，单位 m/s；对应 windSpeed100m。
  /**
   * @example
   * 5.6
   */
  windSpeed100m?: string;
  // 200 米风速，单位 m/s；对应 windSpeed200m。
  /**
   * @example
   * 7.0
   */
  windSpeed200m?: string;
  // 10 米风向，单位 °；对应 windDirection10m。
  /**
   * @example
   * 180
   */
  windDirection10m?: string;
  // 100 米风向，单位 °；对应 windDirection100m。
  /**
   * @example
   * 185
   */
  windDirection100m?: string;
  // 200 米风向，单位 °；对应 windDirection200m。
  /**
   * @example
   * 190
   */
  windDirection200m?: string;
  // 瞬时短波辐射，单位 W/m²；对应 shortwaveRadiationInstant。
  /**
   * @example
   * 600
   */
  shortwaveRadiationInstant?: string;
  // 瞬时直接辐射，单位 W/m²；对应 directRadiationInstant。
  /**
   * @example
   * 450
   */
  directRadiationInstant?: string;
  // 瞬时散射辐射，单位 W/m²；对应 diffuseRadiationInstant。
  /**
   * @example
   * 150
   */
  diffuseRadiationInstant?: string;
  // 短波辐射，单位 W/m²；对应 shortwaveRadiation。
  /**
   * @example
   * 550
   */
  shortwaveRadiation?: string;
  // 直接辐射，单位 W/m²；对应 directRadiation。
  /**
   * @example
   * 400
   */
  directRadiation?: string;
  // 散射辐射，单位 W/m²；对应 diffuseRadiation。
  /**
   * @example
   * 150
   */
  diffuseRadiation?: string;
  // 10 米阵风风速，单位 m/s；对应 windGusts10m。
  /**
   * @example
   * 6.2
   */
  windGusts10m?: string;
  // 2 米最高气温，单位 ℃；对应 temperatureMax2m。
  /**
   * @example
   * 30.2
   */
  temperature2mMax?: string;
  // 2 米最低气温，单位 ℃；对应 temperatureMin2m。
  /**
   * @example
   * 19.1
   */
  temperature2mMin?: string;
  static names(): { [key: string]: string } {
    return {
      variableDate: 'variable_date',
      forecastBatchTime: 'forecast_batch_time',
      temperature2m: 'temperature_2m',
      dewPoint2m: 'dew_point_2m',
      apparentTemperature: 'apparent_temperature',
      relativeHumidity2m: 'relative_humidity_2m',
      pressureMsl: 'pressure_msl',
      surfacePressure: 'surface_pressure',
      weatherCode: 'weather_code',
      precipitation: 'precipitation',
      cloudCover: 'cloud_cover',
      windSpeed10m: 'wind_speed_10m',
      windSpeed100m: 'wind_speed_100m',
      windSpeed200m: 'wind_speed_200m',
      windDirection10m: 'wind_direction_10m',
      windDirection100m: 'wind_direction_100m',
      windDirection200m: 'wind_direction_200m',
      shortwaveRadiationInstant: 'shortwave_radiation_instant',
      directRadiationInstant: 'direct_radiation_instant',
      diffuseRadiationInstant: 'diffuse_radiation_instant',
      shortwaveRadiation: 'shortwave_radiation',
      directRadiation: 'direct_radiation',
      diffuseRadiation: 'diffuse_radiation',
      windGusts10m: 'wind_gusts_10m',
      temperature2mMax: 'temperature_2m_max',
      temperature2mMin: 'temperature_2m_min',
    };
  }

  static types(): { [key: string]: any } {
    return {
      variableDate: 'string',
      forecastBatchTime: 'string',
      temperature2m: 'string',
      dewPoint2m: 'string',
      apparentTemperature: 'string',
      relativeHumidity2m: 'string',
      pressureMsl: 'string',
      surfacePressure: 'string',
      weatherCode: 'string',
      precipitation: 'string',
      cloudCover: 'string',
      windSpeed10m: 'string',
      windSpeed100m: 'string',
      windSpeed200m: 'string',
      windDirection10m: 'string',
      windDirection100m: 'string',
      windDirection200m: 'string',
      shortwaveRadiationInstant: 'string',
      directRadiationInstant: 'string',
      diffuseRadiationInstant: 'string',
      shortwaveRadiation: 'string',
      directRadiation: 'string',
      diffuseRadiation: 'string',
      windGusts10m: 'string',
      temperature2mMax: 'string',
      temperature2mMin: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 快照文档详情
export class SnapshotDocumentItem extends $tea.Model {
  // 节点ID
  /**
   * @example
   * node_id
   */
  nodeId: string;
  // 文档ID
  /**
   * @example
   * document_id
   */
  documentId: string;
  // 文档名称
  /**
   * @example
   * document_name
   */
  documentName: string;
  // 文件类型
  /**
   * @example
   * file_type
   */
  fileType: string;
  // 下载原文的链接
  /**
   * @example
   * oss_url
   */
  ossUrl: string;
  // 原文的md5
  /**
   * @example
   * md5
   */
  md5?: string;
  // 向量文档ID
  /**
   * @example
   * vector_store_map_id
   */
  vectorStoreMapId: string;
  // 文档来源
  /**
   * @example
   * source
   */
  source: string;
  // 文档来源附带的额外信息
  /**
   * @example
   * source_ext
   */
  sourceExt: string;
  // 标签
  /**
   * @example
   * tags
   */
  tags: string[];
  static names(): { [key: string]: string } {
    return {
      nodeId: 'node_id',
      documentId: 'document_id',
      documentName: 'document_name',
      fileType: 'file_type',
      ossUrl: 'oss_url',
      md5: 'md5',
      vectorStoreMapId: 'vector_store_map_id',
      source: 'source',
      sourceExt: 'source_ext',
      tags: 'tags',
    };
  }

  static types(): { [key: string]: any } {
    return {
      nodeId: 'string',
      documentId: 'string',
      documentName: 'string',
      fileType: 'string',
      ossUrl: 'string',
      md5: 'string',
      vectorStoreMapId: 'string',
      source: 'string',
      sourceExt: 'string',
      tags: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 单个时间点的天气数据，对应 WeatherVariableDTO；气象要素值为字符串，按请求要素及数据可用性返回。
export class WeatherVariable extends $tea.Model {
  // 气象数据对应的时间点，Java 类型 Date。
  /**
   * @example
   * 2026-09-20 09:00:00
   */
  variableDate?: string;
  // 该条气象数据的预测批次时间，Java 类型 Date，可能为空。
  /**
   * @example
   * 2026-09-20 08:00:00
   */
  forecastBatchTime?: string;
  // 地面 2 米处空气温度，单位 °C。
  /**
   * @example
   * 25.3
   */
  temperature2m?: string;
  // 地面 2 米处相对空气湿度，单位 %。
  /**
   * @example
   * 65
   */
  relativeHumidity2m?: string;
  // 地面 2 米处露点温度，单位 °C。
  /**
   * @example
   * 18.2
   */
  dewPoint2m?: string;
  // 海平面大气压，单位 hPa。
  /**
   * @example
   * 1013.2
   */
  pressureMsl?: string;
  // 地表大气压，单位 hPa。
  /**
   * @example
   * 1008.6
   */
  surfacePressure?: string;
  // 未来一小时降水量大于 0.1mm 的概率，单位 %。
  /**
   * @example
   * 40
   */
  precipitationProbability?: string;
  // 总云量，单位 %。
  /**
   * @example
   * 60
   */
  cloudCover?: string;
  // 低云量，单位 %。
  /**
   * @example
   * 20
   */
  cloudCoverLow?: string;
  // 中云量，单位 %。
  /**
   * @example
   * 30
   */
  cloudCoverMid?: string;
  // 高云量，单位 %。
  /**
   * @example
   * 10
   */
  cloudCoverHigh?: string;
  // 短波辐照，未来一小时平均，单位 W/m²。
  /**
   * @example
   * 500
   */
  shortwaveRadiation?: string;
  // 直接辐照，代码注释定义为未来一小时累计，单位 W/m²。
  /**
   * @example
   * 350
   */
  directRadiation?: string;
  // 直接法向辐照，未来一小时平均，单位 W/m²。
  /**
   * @example
   * 420
   */
  directNormalIrradiance?: string;
  // 散射辐照，未来一小时平均，单位 W/m²。
  /**
   * @example
   * 150
   */
  diffuseRadiation?: string;
  // 地面 10 米处风速，单位 m/s。
  /**
   * @example
   * 3.2
   */
  windSpeed10m?: string;
  // 地面 80 米处风速，单位 m/s。
  /**
   * @example
   * 5.6
   */
  windSpeed80m?: string;
  // 地面 120 米处风速，单位 m/s。
  /**
   * @example
   * 6.1
   */
  windSpeed120m?: string;
  // 地面 10 米处风向，单位 °。
  /**
   * @example
   * 180
   */
  windDirection10m?: string;
  // 地面 80 米处风向，单位 °。
  /**
   * @example
   * 185
   */
  windDirection80m?: string;
  // 地面 120 米处风向，单位 °。
  /**
   * @example
   * 190
   */
  windDirection120m?: string;
  // 天气代码，采用 WMO 天气编码。
  /**
   * @example
   * 3
   */
  weatherCode?: string;
  // 体感温度，单位 °C。
  /**
   * @example
   * 27.1
   */
  apparentTemperature?: string;
  // 降雨量，单位 mm。
  /**
   * @example
   * 0.2
   */
  rain?: string;
  // 降水量，包含所有降水形式，单位 mm。
  /**
   * @example
   * 0.3
   */
  precipitation?: string;
  // 降雪量，单位 cm。
  /**
   * @example
   * 0
   */
  snowfall?: string;
  // 短波辐照瞬时值，单位 W/m²。
  /**
   * @example
   * 510
   */
  shortwaveRadiationInstant?: string;
  // 直接辐照瞬时值，单位 W/m²。
  /**
   * @example
   * 360
   */
  directRadiationInstant?: string;
  // 散射辐照瞬时值，单位 W/m²。
  /**
   * @example
   * 150
   */
  diffuseRadiationInstant?: string;
  // 直接法向辐照瞬时值，单位 W/m²。
  /**
   * @example
   * 430
   */
  directNormalIrradianceInstant?: string;
  // 地面 180 米处风速，单位 m/s。
  /**
   * @example
   * 7.0
   */
  windSpeed180m?: string;
  // 地面 180 米处风向，单位 °。
  /**
   * @example
   * 195
   */
  windDirection180m?: string;
  // DTO 保留的短时降雨量字段，单位 mm。本 queryWeather 接口拒绝查询 short_term_rain，须调用独立 queryShortTermRain 接口。
  /**
   * @example
   * 0
   */
  shortTermRain?: string;
  static names(): { [key: string]: string } {
    return {
      variableDate: 'variable_date',
      forecastBatchTime: 'forecast_batch_time',
      temperature2m: 'temperature_2m',
      relativeHumidity2m: 'relative_humidity_2m',
      dewPoint2m: 'dew_point_2m',
      pressureMsl: 'pressure_msl',
      surfacePressure: 'surface_pressure',
      precipitationProbability: 'precipitation_probability',
      cloudCover: 'cloud_cover',
      cloudCoverLow: 'cloud_cover_low',
      cloudCoverMid: 'cloud_cover_mid',
      cloudCoverHigh: 'cloud_cover_high',
      shortwaveRadiation: 'shortwave_radiation',
      directRadiation: 'direct_radiation',
      directNormalIrradiance: 'direct_normal_irradiance',
      diffuseRadiation: 'diffuse_radiation',
      windSpeed10m: 'wind_speed_10m',
      windSpeed80m: 'wind_speed_80m',
      windSpeed120m: 'wind_speed_120m',
      windDirection10m: 'wind_direction_10m',
      windDirection80m: 'wind_direction_80m',
      windDirection120m: 'wind_direction_120m',
      weatherCode: 'weather_code',
      apparentTemperature: 'apparent_temperature',
      rain: 'rain',
      precipitation: 'precipitation',
      snowfall: 'snowfall',
      shortwaveRadiationInstant: 'shortwave_radiation_instant',
      directRadiationInstant: 'direct_radiation_instant',
      diffuseRadiationInstant: 'diffuse_radiation_instant',
      directNormalIrradianceInstant: 'direct_normal_irradiance_instant',
      windSpeed180m: 'wind_speed_180m',
      windDirection180m: 'wind_direction_180m',
      shortTermRain: 'short_term_rain',
    };
  }

  static types(): { [key: string]: any } {
    return {
      variableDate: 'string',
      forecastBatchTime: 'string',
      temperature2m: 'string',
      relativeHumidity2m: 'string',
      dewPoint2m: 'string',
      pressureMsl: 'string',
      surfacePressure: 'string',
      precipitationProbability: 'string',
      cloudCover: 'string',
      cloudCoverLow: 'string',
      cloudCoverMid: 'string',
      cloudCoverHigh: 'string',
      shortwaveRadiation: 'string',
      directRadiation: 'string',
      directNormalIrradiance: 'string',
      diffuseRadiation: 'string',
      windSpeed10m: 'string',
      windSpeed80m: 'string',
      windSpeed120m: 'string',
      windDirection10m: 'string',
      windDirection80m: 'string',
      windDirection120m: 'string',
      weatherCode: 'string',
      apparentTemperature: 'string',
      rain: 'string',
      precipitation: 'string',
      snowfall: 'string',
      shortwaveRadiationInstant: 'string',
      directRadiationInstant: 'string',
      diffuseRadiationInstant: 'string',
      directNormalIrradianceInstant: 'string',
      windSpeed180m: 'string',
      windDirection180m: 'string',
      shortTermRain: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRealtimePriceforecastRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 运行日期，yyyy-mm-dd
  runDate: string;
  // 业务类型 枚举： REAL_TIME - 实时 DAY_AHEAD - 日前	
  // 
  busiType: string;
  // 省地区编码，目前仅支持江苏省	
  // 
  province: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      runDate: 'run_date',
      busiType: 'busi_type',
      province: 'province',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      runDate: 'string',
      busiType: 'string',
      province: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRealtimePriceforecastResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 电价预测结果	
  // 
  result?: PricePredictionItem[];
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
      result: { 'type': 'array', 'itemType': PricePredictionItem },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBiddingspaceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 运行日期，yyyy-mm-dd
  queryDate: string;
  // 业务类型枚举，枚举范围如下
  // BIDDING_SPACE: 竞价空间
  // 
  busiType: string;
  // 业务偏差类型枚举，枚举范围：
  // DAY_AHEAD_ACTUAL: 日前-实际
  // DAY_AHEAD_FORECAST: 日前-预测
  // PRE_CLEARING_ACTUAL: 预出清-实际
  // PRE_CLEARING_FORECAST: 预出清-预测
  // ACTUAL_FORECAST: 实际-预测
  // PRE_CLEARING: 预出清
  // DAY_AHEAD: 日前
  // REAL_TIME: 实时
  // ACTUAL: 实际
  deviationType: string;
  // 省地区编码，目前仅支持江苏省
  province: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      queryDate: 'query_date',
      busiType: 'busi_type',
      deviationType: 'deviation_type',
      province: 'province',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      queryDate: 'string',
      busiType: 'string',
      deviationType: 'string',
      province: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBiddingspaceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 竞价空间分析
  biddingAnalysis?: BiddingAnalysisData[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      biddingAnalysis: 'bidding_analysis',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      biddingAnalysis: { 'type': 'array', 'itemType': BiddingAnalysisData },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySimilardayRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 运行日，格式：yyyy-mm-dd
  runDate: string;
  // 相似日范围开始日，格式：yyyy-mm-dd
  similarStartDate: string;
  // 相似日范围结束日，yyyy-MM-dd
  similarEndDate: string;
  // 相似特征类型枚举，枚举范围
  // BIDDING_SPACE: 竞价空间
  // PROVINCIAL_DISPATCH_LOAD: 省调负荷
  // NEW_ENERGY_OUTPUT: 新能源出力
  // INTERCONNECTION_PLAN: 联络线计划
  similarFeatureType: string;
  // 省地区编码，目前仅支持江苏省
  province: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      runDate: 'run_date',
      similarStartDate: 'similar_start_date',
      similarEndDate: 'similar_end_date',
      similarFeatureType: 'similar_feature_type',
      province: 'province',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      runDate: 'string',
      similarStartDate: 'string',
      similarEndDate: 'string',
      similarFeatureType: 'string',
      province: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySimilardayResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 查询范围内容的最接近相似日，格式：yyyy-MM-dd
  similarDay?: string;
  // 相似日分析结果
  analysisResult?: SimilarDayAnalysisData[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      similarDay: 'similar_day',
      analysisResult: 'analysis_result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      similarDay: 'string',
      analysisResult: { 'type': 'array', 'itemType': SimilarDayAnalysisData },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAheadrealtimePricecompareRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 运行日，格式：yyyy-mm-dd
  runDate: string;
  // 省地区编码，目前仅支持江苏省
  province: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      runDate: 'run_date',
      province: 'province',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      runDate: 'string',
      province: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAheadrealtimePricecompareResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 电价对比点位
  priceCompare?: AheadRealtimePriceCompareData[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      priceCompare: 'price_compare',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      priceCompare: { 'type': 'array', 'itemType': AheadRealtimePriceCompareData },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAheadrealtimePricediffpredictionRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 运行日，格式：yyyy-mm-dd
  runDate: string;
  // 省份行政编码，目前仅支持江苏省
  province: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      runDate: 'run_date',
      province: 'province',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      runDate: 'string',
      province: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAheadrealtimePricediffpredictionResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 全天价差方向预测准确率
  preAccuracy?: string;
  // 光伏价差方向预测准确率
  pvPreAccuracy?: string;
  // 价差预测列表
  priceDiffPredictionList?: AheadRealtimePriceDiffPredictionData[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      preAccuracy: 'pre_accuracy',
      pvPreAccuracy: 'pv_pre_accuracy',
      priceDiffPredictionList: 'price_diff_prediction_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      preAccuracy: 'string',
      pvPreAccuracy: 'string',
      priceDiffPredictionList: { 'type': 'array', 'itemType': AheadRealtimePriceDiffPredictionData },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryWeatherWarningRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 省份行政编码
  province: string;
  // 查询日期，格式：yyyy-MM-dd
  queryDate?: string;
  // 城市行政编码
  city: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      province: 'province',
      queryDate: 'query_date',
      city: 'city',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      province: 'string',
      queryDate: 'string',
      city: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryWeatherWarningResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 气象预警信息
  warningInfo?: WeatherWarningData[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      warningInfo: 'warning_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      warningInfo: { 'type': 'array', 'itemType': WeatherWarningData },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryKmVersionRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 树ID
  treeId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      treeId: 'tree_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      treeId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryKmVersionResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 树ID
  treeId?: string;
  // 版本
  version?: string;
  // 描述
  description?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      treeId: 'tree_id',
      version: 'version',
      description: 'description',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      treeId: 'string',
      version: 'string',
      description: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SyncKmVersionRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 树ID
  treeId: string;
  // 版本号
  treeVersion: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      treeId: 'tree_id',
      treeVersion: 'tree_version',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      treeId: 'string',
      treeVersion: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SyncKmVersionResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 树ID
  treeId?: string;
  // 版本
  version?: string;
  // 快照原文
  snapshot?: string;
  // 版本关联的文档详情列表
  documents?: SnapshotDocumentItem[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      treeId: 'tree_id',
      version: 'version',
      snapshot: 'snapshot',
      documents: 'documents',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      treeId: 'string',
      version: 'string',
      snapshot: 'string',
      documents: { 'type': 'array', 'itemType': SnapshotDocumentItem },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SyncKmDocumentRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 树ID
  treeId: string;
  // 节点ID
  nodeId: string;
  // 向量文档ID
  docMapId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      treeId: 'tree_id',
      nodeId: 'node_id',
      docMapId: 'doc_map_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      treeId: 'string',
      nodeId: 'string',
      docMapId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SyncKmDocumentResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 文档基础信息
  documentInfo?: DocumentInfoDTO;
  // 向量文档id
  docMapId?: string;
  // 加工后的文档数据
  processedData?: DocumentProcessingDataDTO;
  // oss预览地址
  ossPreviewUrl?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      documentInfo: 'document_info',
      docMapId: 'doc_map_id',
      processedData: 'processed_data',
      ossPreviewUrl: 'oss_preview_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      documentInfo: DocumentInfoDTO,
      docMapId: 'string',
      processedData: DocumentProcessingDataDTO,
      ossPreviewUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryKmRagRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 用户问题
  query: string;
  // 子范围标识（目录树），用于缩小召回范围；不传则不限范围
  knowledgeBaseIds?: string[];
  // 召回条数
  topk?: number;
  // 是否包含引用来源
  includeReferences?: boolean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      query: 'query',
      knowledgeBaseIds: 'knowledge_base_ids',
      topk: 'topk',
      includeReferences: 'include_references',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      query: 'string',
      knowledgeBaseIds: { 'type': 'array', 'itemType': 'string' },
      topk: 'number',
      includeReferences: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryKmRagResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 答案
  answer?: string;
  // 置信度
  confidence?: number;
  // 引用来源
  references?: string[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      answer: 'answer',
      confidence: 'confidence',
      references: 'references',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      answer: 'string',
      confidence: 'number',
      references: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryWeatherForecastRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 请求 ID，由调用方生成，用于请求追踪，不可为空。
  requestId: string;
  // 纬度，十进制度数；Java 类型 BigDecimal。查询位置须符合产品合约的站点授权范围。
  latitude: string;
  // 经度，十进制度数；Java 类型 BigDecimal。查询位置须符合产品合约的站点授权范围。
  longitude: string;
  // 需要预测的天数；未传 past_days 时必须大于等于 1；当前产品面向 15 天以内预测。注意：当输入为1时表示预测今天的数据，输入2时表示预测明天数据，以此推类。
  forecastDays: number;
  // 此前预测的天数，可选且不能为负数。内部数据查询未传时按 0 处理，查询起点为当天减去 past_days。
  pastDays?: number;
  // 气象要素编码列表，不可为空，数量不得超过合约许可。示例包含温度、湿度、天气代码、10米风速、降水量和总云量；short_term_rain 须使用独立短临降水接口。
  weatherVariables: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      requestId: 'request_id',
      latitude: 'latitude',
      longitude: 'longitude',
      forecastDays: 'forecast_days',
      pastDays: 'past_days',
      weatherVariables: 'weather_variables',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      requestId: 'string',
      latitude: 'string',
      longitude: 'string',
      forecastDays: 'number',
      pastDays: 'number',
      weatherVariables: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryWeatherForecastResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 本次查询消耗的额度，Java 类型 BigDecimal；内部数据链路成功查询固定消耗 1，MAYA 链路取下游返回值，可能为空。
  quotaCost?: string;
  // 实际返回的气象预测数据批次时间，Java 类型 Date；数据链路未提供批次时可能为空。
  forecastBatchTime?: string;
  // 气象数据列表，每个元素为 WeatherVariableDTO，包含时间、预测批次及各气象要素。要素值在 Java DTO 中为 String，未返回或缺测时可能为空。
  weatherVariablesList?: WeatherVariable[];
  // 本次请求 ID
  requestId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      quotaCost: 'quota_cost',
      forecastBatchTime: 'forecast_batch_time',
      weatherVariablesList: 'weather_variables_list',
      requestId: 'request_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      quotaCost: 'string',
      forecastBatchTime: 'string',
      weatherVariablesList: { 'type': 'array', 'itemType': WeatherVariable },
      requestId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryWeatherLongrangeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 请求唯一标识，用于请求追踪和问题定位。
  requestId: string;
  // 查询地点纬度，取值范围 -90～90。
  latitude: string;
  // 查询地点经度，取值范围 -180～180。
  longitude: string;
  // 预测截止天数，整数 16～45。返回未来第 16 天至第 forecast_days 天（含）的预测数据，每 6 小时一个数据点；
  forecastDays: number;
  // 气象要素编码列表，至少一项，使用代码定义的驼峰编码，如 temperature2m、windSpeed10m；仅返回指定要素。
  weatherVariables: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      requestId: 'request_id',
      latitude: 'latitude',
      longitude: 'longitude',
      forecastDays: 'forecast_days',
      weatherVariables: 'weather_variables',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      requestId: 'string',
      latitude: 'string',
      longitude: 'string',
      forecastDays: 'number',
      weatherVariables: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryWeatherLongrangeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 请求唯一标识，与入参一致；对应 Java requestId。
  requestId?: string;
  // 本次查询配额消耗，对应 quotaCost，成功查询固定为 1。
  quotaCost?: string;
  // 预测数据批次时间，格式 yyyy-MM-dd HH:mm:ss。
  forecastBatchTime?: string;
  // 中长期气象预测数据列表，未来第 16 天至指定截止天，每 6 小时一个数据点。仅返回请求指定的气象要素；网关字段需映射至 WeatherLongRangeVariableDTO 对应 Java 属性。
  weatherVariablesList?: WeatherLongRangeVariable[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      requestId: 'request_id',
      quotaCost: 'quota_cost',
      forecastBatchTime: 'forecast_batch_time',
      weatherVariablesList: 'weather_variables_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      requestId: 'string',
      quotaCost: 'string',
      forecastBatchTime: 'string',
      weatherVariablesList: { 'type': 'array', 'itemType': WeatherLongRangeVariable },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryPanoraindexPolicyRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 根据标题模糊搜搜
  title?: string;
  // 根据标题或地区模糊搜索
  titleorregionlike?: string;
  // 一页数据量，最大100
  pagesize?: number;
  // 排序字段
  orderby?: string;
  // 排序方向（ASC/DESC，默认为DESC）
  orderdirection?: string;
  // 最小id，用于游标翻页
  minid?: number;
  // 页号
  pagenum?: number;
  // 来源网站code码，可批量查询最多填15个
  websitecode?: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      title: 'title',
      titleorregionlike: 'titleorregionlike',
      pagesize: 'pagesize',
      orderby: 'orderby',
      orderdirection: 'orderdirection',
      minid: 'minid',
      pagenum: 'pagenum',
      websitecode: 'websitecode',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      title: 'string',
      titleorregionlike: 'string',
      pagesize: 'number',
      orderby: 'string',
      orderdirection: 'string',
      minid: 'number',
      pagenum: 'number',
      websitecode: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryPanoraindexPolicyResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 唯一主键
  id?: number;
  // 标题
  title?: string;
  // 政策正文内容
  content?: string;
  // 附件list详情
  attachmentdatalist?: EpiAdmEnergyPolicyAttachment[];
  // 原文链接
  sourceurl?: string;
  // 政策发布日期
  releasedate?: string;
  // 披露主体
  issuingbody?: string;
  // 政策对应的区域
  region?: string;
  // 政策分类
  category?: string;
  // 政策文号
  policynumber?: string;
  // 来源网站Code码
  websitecode?: string;
  // 来源网站名称
  websitename?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      id: 'id',
      title: 'title',
      content: 'content',
      attachmentdatalist: 'attachmentdatalist',
      sourceurl: 'sourceurl',
      releasedate: 'releasedate',
      issuingbody: 'issuingbody',
      region: 'region',
      category: 'category',
      policynumber: 'policynumber',
      websitecode: 'websitecode',
      websitename: 'websitename',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      id: 'number',
      title: 'string',
      content: 'string',
      attachmentdatalist: { 'type': 'array', 'itemType': EpiAdmEnergyPolicyAttachment },
      sourceurl: 'string',
      releasedate: 'string',
      issuingbody: 'string',
      region: 'string',
      category: 'string',
      policynumber: 'string',
      websitecode: 'string',
      websitename: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTraderesultRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTraderesultResponse extends $tea.Model {
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

export class QueryElectricMarketpriceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 市场码
  marketCode: string;
  // 查询类型:DAY_AHEAD 日前预测 / REALTIME 实时,可单传或都传
  queryTypeList: string[];
  // 查询日期起始,格式 yyyy-MM-dd,与 query_date_end 配套闭区间,最多7天,与 query_date_list 二选一
  queryDateStart?: string;
  // 查询日期结束,格式 yyyy-MM-dd,与 query_date_start 配套闭区间,最多7天,与 query_date_list 二选一
  queryDateEnd?: string;
  // 查询日期列表,格式 yyyy-MM-dd,与 start/end 二选一,最多7个
  queryDateList?: string[];
  // 时点起始,1~96 整数,不传默认1
  periodStart?: number;
  // 时点结束,1~96 整数,不传默认96
  periodEnd?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      marketCode: 'market_code',
      queryTypeList: 'query_type_list',
      queryDateStart: 'query_date_start',
      queryDateEnd: 'query_date_end',
      queryDateList: 'query_date_list',
      periodStart: 'period_start',
      periodEnd: 'period_end',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      marketCode: 'string',
      queryTypeList: { 'type': 'array', 'itemType': 'string' },
      queryDateStart: 'string',
      queryDateEnd: 'string',
      queryDateList: { 'type': 'array', 'itemType': 'string' },
      periodStart: 'number',
      periodEnd: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryElectricMarketpriceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回记录总数
  totalCount?: number;
  // 市场价格列表
  data?: MarketPrice[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      totalCount: 'total_count',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      totalCount: 'number',
      data: { 'type': 'array', 'itemType': MarketPrice },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryElectricCommondataRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 主数据实体稳定编码
  entityCode: string;
  // 实体结构版本
  schemaVersion: string;
  // JSON 查询条件；无条件时传 {}
  queryJson: string;
  // 页码，默认1，最小1
  pageNo?: number;
  // 每页数量，默认200，最大1000
  pageSize?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      entityCode: 'entity_code',
      schemaVersion: 'schema_version',
      queryJson: 'query_json',
      pageNo: 'page_no',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      entityCode: 'string',
      schemaVersion: 'string',
      queryJson: 'string',
      pageNo: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryElectricCommondataResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 实际返回的实体编码
  entityCode?: string;
  // 实际返回的实体结构版本
  schemaVersion?: string;
  // JSON数组字符串；成功但无数据时为 []
  dataJson?: string;
  // 完整性、覆盖范围和来源等元数据
  metaJson?: string;
  // 符合条件的总记录数
  totalCount?: number;
  // 当前页码
  pageNo?: number;
  // 当前分页大小
  pageSize?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      entityCode: 'entity_code',
      schemaVersion: 'schema_version',
      dataJson: 'data_json',
      metaJson: 'meta_json',
      totalCount: 'total_count',
      pageNo: 'page_no',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      entityCode: 'string',
      schemaVersion: 'string',
      dataJson: 'string',
      metaJson: 'string',
      totalCount: 'number',
      pageNo: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAppmarketCommondataRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 实体编码：WeatherData、WeatherWarning、BiddingSpace
  entityCode: string;
  // 实体数据结构版本
  schemaVersion: string;
  // JSON 对象字符串，放实体自身的查询条件
  queryJson: string;
  // 页码，默认 1
  pageNo?: number;
  // 每页条数，默认 200，最大建议 1000
  pageSize?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      entityCode: 'entity_code',
      schemaVersion: 'schema_version',
      queryJson: 'query_json',
      pageNo: 'page_no',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      entityCode: 'string',
      schemaVersion: 'string',
      queryJson: 'string',
      pageNo: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAppmarketCommondataResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 实际返回的实体编码
  entityCode?: string;
  // 实际返回的结构版本
  schemaVersion?: string;
  // JSON 数组字符串；即使无数据也返回 []，不要配置成 ARRAY / OBJECT
  dataJson?: string;
  // JSON 对象字符串，放数据范围、口径、溯源等元信息
  metaJson?: string;
  // 满足条件的总记录数
  totalCount?: number;
  // 实际页码
  pageNo?: number;
  // 实际每页条数
  pageSize?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      entityCode: 'entity_code',
      schemaVersion: 'schema_version',
      dataJson: 'data_json',
      metaJson: 'meta_json',
      totalCount: 'total_count',
      pageNo: 'page_no',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      entityCode: 'string',
      schemaVersion: 'string',
      dataJson: 'string',
      metaJson: 'string',
      totalCount: 'number',
      pageNo: 'number',
      pageSize: 'number',
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
          sdk_version: "1.2.0",
          _prod_code: "ENERGYTOOL",
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
   * Description: 电力交易实时电价预测服务
   * Summary: 电力交易实时电价预测服务
   */
  async queryRealtimePriceforecast(request: QueryRealtimePriceforecastRequest): Promise<QueryRealtimePriceforecastResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryRealtimePriceforecastEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 电力交易实时电价预测服务
   * Summary: 电力交易实时电价预测服务
   */
  async queryRealtimePriceforecastEx(request: QueryRealtimePriceforecastRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryRealtimePriceforecastResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryRealtimePriceforecastResponse>(await this.doRequest("1.0", "antcloud.energytool.realtime.priceforecast.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryRealtimePriceforecastResponse({}));
  }

  /**
   * @remarks
   * Description: 电力交易竞价空间分析
   * Summary: 电力交易竞价空间分析
   */
  async queryBiddingspace(request: QueryBiddingspaceRequest): Promise<QueryBiddingspaceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryBiddingspaceEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 电力交易竞价空间分析
   * Summary: 电力交易竞价空间分析
   */
  async queryBiddingspaceEx(request: QueryBiddingspaceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryBiddingspaceResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryBiddingspaceResponse>(await this.doRequest("1.0", "antcloud.energytool.biddingspace.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryBiddingspaceResponse({}));
  }

  /**
   * @remarks
   * Description: 电力交易相似日竞价空间分析
   * Summary: 电力交易相似日竞价空间分析
   */
  async querySimilarday(request: QuerySimilardayRequest): Promise<QuerySimilardayResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.querySimilardayEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 电力交易相似日竞价空间分析
   * Summary: 电力交易相似日竞价空间分析
   */
  async querySimilardayEx(request: QuerySimilardayRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QuerySimilardayResponse> {
    Util.validateModel(request);
    return $tea.cast<QuerySimilardayResponse>(await this.doRequest("1.0", "antcloud.energytool.similarday.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QuerySimilardayResponse({}));
  }

  /**
   * @remarks
   * Description: 电力交易日前实时电价对比分析
   * Summary: 电力交易日前实时电价对比分析
   */
  async queryAheadrealtimePricecompare(request: QueryAheadrealtimePricecompareRequest): Promise<QueryAheadrealtimePricecompareResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAheadrealtimePricecompareEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 电力交易日前实时电价对比分析
   * Summary: 电力交易日前实时电价对比分析
   */
  async queryAheadrealtimePricecompareEx(request: QueryAheadrealtimePricecompareRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAheadrealtimePricecompareResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAheadrealtimePricecompareResponse>(await this.doRequest("1.0", "antcloud.energytool.aheadrealtime.pricecompare.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAheadrealtimePricecompareResponse({}));
  }

  /**
   * @remarks
   * Description: 电力交易日前与实时价差预测
   * Summary: 电力交易日前与实时价差预测
   */
  async queryAheadrealtimePricediffprediction(request: QueryAheadrealtimePricediffpredictionRequest): Promise<QueryAheadrealtimePricediffpredictionResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAheadrealtimePricediffpredictionEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 电力交易日前与实时价差预测
   * Summary: 电力交易日前与实时价差预测
   */
  async queryAheadrealtimePricediffpredictionEx(request: QueryAheadrealtimePricediffpredictionRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAheadrealtimePricediffpredictionResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAheadrealtimePricediffpredictionResponse>(await this.doRequest("1.0", "antcloud.energytool.aheadrealtime.pricediffprediction.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAheadrealtimePricediffpredictionResponse({}));
  }

  /**
   * @remarks
   * Description: 气象预警信息查询
   * Summary: 气象预警信息查询
   */
  async queryWeatherWarning(request: QueryWeatherWarningRequest): Promise<QueryWeatherWarningResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryWeatherWarningEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 气象预警信息查询
   * Summary: 气象预警信息查询
   */
  async queryWeatherWarningEx(request: QueryWeatherWarningRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryWeatherWarningResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryWeatherWarningResponse>(await this.doRequest("1.0", "antcloud.energytool.weather.warning.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryWeatherWarningResponse({}));
  }

  /**
   * @remarks
   * Description: 知识版本查询
   * Summary: 知识版本查询
   */
  async queryKmVersion(request: QueryKmVersionRequest): Promise<QueryKmVersionResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryKmVersionEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 知识版本查询
   * Summary: 知识版本查询
   */
  async queryKmVersionEx(request: QueryKmVersionRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryKmVersionResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryKmVersionResponse>(await this.doRequest("1.0", "antcloud.energytool.km.version.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryKmVersionResponse({}));
  }

  /**
   * @remarks
   * Description: 同步版本内容详情
   * Summary: 同步版本内容详情
   */
  async syncKmVersion(request: SyncKmVersionRequest): Promise<SyncKmVersionResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.syncKmVersionEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 同步版本内容详情
   * Summary: 同步版本内容详情
   */
  async syncKmVersionEx(request: SyncKmVersionRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SyncKmVersionResponse> {
    Util.validateModel(request);
    return $tea.cast<SyncKmVersionResponse>(await this.doRequest("1.0", "antcloud.energytool.km.version.sync", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SyncKmVersionResponse({}));
  }

  /**
   * @remarks
   * Description: 获取文档详情
   * Summary: 获取文档详情
   */
  async syncKmDocument(request: SyncKmDocumentRequest): Promise<SyncKmDocumentResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.syncKmDocumentEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 获取文档详情
   * Summary: 获取文档详情
   */
  async syncKmDocumentEx(request: SyncKmDocumentRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SyncKmDocumentResponse> {
    Util.validateModel(request);
    return $tea.cast<SyncKmDocumentResponse>(await this.doRequest("1.0", "antcloud.energytool.km.document.sync", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SyncKmDocumentResponse({}));
  }

  /**
   * @remarks
   * Description: 知识图谱对外开放rag检索
   * Summary: 知识图谱对外开放rag检索
   */
  async queryKmRag(request: QueryKmRagRequest): Promise<QueryKmRagResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryKmRagEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 知识图谱对外开放rag检索
   * Summary: 知识图谱对外开放rag检索
   */
  async queryKmRagEx(request: QueryKmRagRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryKmRagResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryKmRagResponse>(await this.doRequest("1.0", "antcloud.energytool.km.rag.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryKmRagResponse({}));
  }

  /**
   * @remarks
   * Description: 天气中短期预测服务，支持15天以内的天气数据查询
   * Summary: 天气中短期预测服务，支持15天以内的天气数据查询
   */
  async queryWeatherForecast(request: QueryWeatherForecastRequest): Promise<QueryWeatherForecastResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryWeatherForecastEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 天气中短期预测服务，支持15天以内的天气数据查询
   * Summary: 天气中短期预测服务，支持15天以内的天气数据查询
   */
  async queryWeatherForecastEx(request: QueryWeatherForecastRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryWeatherForecastResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryWeatherForecastResponse>(await this.doRequest("1.0", "antcloud.energytool.weather.forecast.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryWeatherForecastResponse({}));
  }

  /**
   * @remarks
   * Description: 天气中长期预测服务，支持未来第 16～45 天的天气数据查询
   * Summary: 天气中长期预测服务，支持未来第 16～45 天的天气数据查询
   */
  async queryWeatherLongrange(request: QueryWeatherLongrangeRequest): Promise<QueryWeatherLongrangeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryWeatherLongrangeEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 天气中长期预测服务，支持未来第 16～45 天的天气数据查询
   * Summary: 天气中长期预测服务，支持未来第 16～45 天的天气数据查询
   */
  async queryWeatherLongrangeEx(request: QueryWeatherLongrangeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryWeatherLongrangeResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryWeatherLongrangeResponse>(await this.doRequest("1.0", "antcloud.energytool.weather.longrange.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryWeatherLongrangeResponse({}));
  }

  /**
   * @remarks
   * Description: 能源数采对外开放api
   * Summary: 能源数采对外开放api
   */
  async queryPanoraindexPolicy(request: QueryPanoraindexPolicyRequest): Promise<QueryPanoraindexPolicyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPanoraindexPolicyEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 能源数采对外开放api
   * Summary: 能源数采对外开放api
   */
  async queryPanoraindexPolicyEx(request: QueryPanoraindexPolicyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPanoraindexPolicyResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPanoraindexPolicyResponse>(await this.doRequest("1.0", "antcloud.energytool.panoraindex.policy.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPanoraindexPolicyResponse({}));
  }

  /**
   * @remarks
   * Description: 虚拟交易团队接入appaccesscenter
   * Summary: 虚拟交易团队接入appaccesscenter
   */
  async queryTraderesult(request: QueryTraderesultRequest): Promise<QueryTraderesultResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryTraderesultEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 虚拟交易团队接入appaccesscenter
   * Summary: 虚拟交易团队接入appaccesscenter
   */
  async queryTraderesultEx(request: QueryTraderesultRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryTraderesultResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryTraderesultResponse>(await this.doRequest("1.0", "antcloud.energytool.traderesult.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryTraderesultResponse({}));
  }

  /**
   * @remarks
   * Description: 电力行情主数据接口
   * Summary: 电力行情主数据接口
   */
  async queryElectricMarketprice(request: QueryElectricMarketpriceRequest): Promise<QueryElectricMarketpriceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryElectricMarketpriceEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 电力行情主数据接口
   * Summary: 电力行情主数据接口
   */
  async queryElectricMarketpriceEx(request: QueryElectricMarketpriceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryElectricMarketpriceResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryElectricMarketpriceResponse>(await this.doRequest("1.0", "antcloud.energytool.electric.marketprice.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryElectricMarketpriceResponse({}));
  }

  /**
   * @remarks
   * Description: 电力行情主数据查询接口
   * Summary: 电力行情主数据查询接口
   */
  async queryElectricCommondata(request: QueryElectricCommondataRequest): Promise<QueryElectricCommondataResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryElectricCommondataEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 电力行情主数据查询接口
   * Summary: 电力行情主数据查询接口
   */
  async queryElectricCommondataEx(request: QueryElectricCommondataRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryElectricCommondataResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryElectricCommondataResponse>(await this.doRequest("1.0", "antcloud.energytool.electric.commondata.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryElectricCommondataResponse({}));
  }

  /**
   * @remarks
   * Description: 电力行情主数据通用开放接口
   * Summary: 电力行情主数据通用开放接口
   */
  async queryAppmarketCommondata(request: QueryAppmarketCommondataRequest): Promise<QueryAppmarketCommondataResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAppmarketCommondataEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 电力行情主数据通用开放接口
   * Summary: 电力行情主数据通用开放接口
   */
  async queryAppmarketCommondataEx(request: QueryAppmarketCommondataRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAppmarketCommondataResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAppmarketCommondataResponse>(await this.doRequest("1.0", "antcloud.energytool.appmarket.commondata.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAppmarketCommondataResponse({}));
  }

}
