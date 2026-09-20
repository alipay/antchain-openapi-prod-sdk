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

// 本次搜索的上下文信息
export class SearchContext extends $tea.Model {
  // 原始搜索内容
  /**
   * @example
   * -
   */
  originQuery: string;
  // 实际执行的搜索类型，当前为 web
  /**
   * @example
   * web
   */
  searchType: string;
  // 实际执行的 AI 上下文档位；当前为 auto，后续可返回 fast 或 pro
  /**
   * @example
   * auto
   */
  mode: string;
  static names(): { [key: string]: string } {
    return {
      originQuery: 'origin_query',
      searchType: 'search_type',
      mode: 'mode',
    };
  }

  static types(): { [key: string]: any } {
    return {
      originQuery: 'string',
      searchType: 'string',
      mode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 网页搜索结果列表，对应请求中的 search_type=web
export class WebItem extends $tea.Model {
  // 搜索结果唯一标识
  /**
   * @example
   * -
   */
  id: string;
  // 内容唯一标识，用于内容去重与引用
  /**
   * @example
   * -
   */
  contentId: string;
  // 结果排序位置，从 1 开始
  /**
   * @example
   * 1
   */
  sortId: number;
  // 结果标题
  /**
   * @example
   * -
   */
  title: string;
  // 来源站点名称
  /**
   * @example
   * -
   */
  siteName?: string;
  // 网页原文链接；PDF 等无原文链接的结果可能不返回该字段。filter.need_url 为预留参数，当前不生效
  /**
   * @example
   * -
   */
  url?: string;
  // 与 Query 相关的网页摘要，适合模型上下文
  /**
   * @example
   * -
   */
  summary: string;
  // 清洗后的网页正文，按 mode 返回；auto 默认返回可用正文，fast 预设不返回，pro 预设按需返回
  /**
   * @example
   * -
   */
  content?: string;
  // 网页发布时间，ISO 8601 格式
  /**
   * @example
   * -
   */
  publishTime?: string;
  // 作者或发布机构
  /**
   * @example
   * -
   */
  author?: string;
  // 来源站点图标链接
  /**
   * @example
   * -
   */
  logoUrl?: string;
  // 随 Content 返回正文实际格式，当前为 text；未返回 Content 时省略
  /**
   * @example
   * -
   */
  contentFormats?: string;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      contentId: 'content_id',
      sortId: 'sort_id',
      title: 'title',
      siteName: 'site_name',
      url: 'url',
      summary: 'summary',
      content: 'content',
      publishTime: 'publish_time',
      author: 'author',
      logoUrl: 'logo_url',
      contentFormats: 'content_formats',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'string',
      contentId: 'string',
      sortId: 'number',
      title: 'string',
      siteName: 'string',
      url: 'string',
      summary: 'string',
      content: 'string',
      publishTime: 'string',
      author: 'string',
      logoUrl: 'string',
      contentFormats: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 请求成功时返回搜索结果
export class Result extends $tea.Model {
  // WebResults 实际返回的网页结果数量
  /**
   * @example
   * 10
   */
  resultCount: number;
  // 网页搜索结果列表，对应请求中的 search_type=web
  /**
   * @example
   * undefined
   */
  webResults: WebItem[];
  // 本次搜索的上下文信息
  /**
   * @example
   * undefined
   */
  searchContext: SearchContext;
  static names(): { [key: string]: string } {
    return {
      resultCount: 'result_count',
      webResults: 'web_results',
      searchContext: 'search_context',
    };
  }

  static types(): { [key: string]: any } {
    return {
      resultCount: 'number',
      webResults: { 'type': 'array', 'itemType': WebItem },
      searchContext: SearchContext,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 统一响应元信息
export class ResponseMetadata extends $tea.Model {
  // 请求关联标识；优先回显合法 X-Request-Id，缺失或非法时由服务端生成；不用于幂等或去重
  /**
   * @example
   * -
   */
  requestId: string;
  // 接口版本
  /**
   * @example
   * v1
   */
  version: string;
  // 服务区域
  /**
   * @example
   * cn-xx
   */
  region: string;
  // 请求处理耗时，单位为毫秒
  /**
   * @example
   * 1000
   */
  timeCost: number;
  static names(): { [key: string]: string } {
    return {
      requestId: 'request_id',
      version: 'version',
      region: 'region',
      timeCost: 'time_cost',
    };
  }

  static types(): { [key: string]: any } {
    return {
      requestId: 'string',
      version: 'string',
      region: 'string',
      timeCost: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 搜索结果过滤条件
export class FilterModel extends $tea.Model {
  // 仅搜索指定网站。例如 ["gov.cn"] 表示只返回该域名下的内容；填写域名，不包含协议和路径
  /**
   * @example
   * ["gov.cn"]
   */
  includeDomains?: string[];
  // 排除指定网站；填写域名，不包含协议和路径
  /**
   * @example
   * undefined
   */
  excludeDomains?: string[];
  // 预留。计划用于按发布时间筛选，当前不生效
  /**
   * @example
   * -
   */
  timeRange?: string;
  // 是否同时查询行业垂类数据接口；命中结果通过 Result.IndustryData 独立返回
  /**
   * @example
   * true
   */
  needUrl?: boolean;
  // 预留。计划支持 news 等网页搜索领域，当前不生效
  /**
   * @example
   * -
   */
  industry?: string;
  static names(): { [key: string]: string } {
    return {
      includeDomains: 'include_domains',
      excludeDomains: 'exclude_domains',
      timeRange: 'time_range',
      needUrl: 'need_url',
      industry: 'industry',
    };
  }

  static types(): { [key: string]: any } {
    return {
      includeDomains: { 'type': 'array', 'itemType': 'string' },
      excludeDomains: { 'type': 'array', 'itemType': 'string' },
      timeRange: 'string',
      needUrl: 'boolean',
      industry: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 网页读取与正文解析成功时返回
export class FetchResult extends $tea.Model {
  // 本次 Fetch 结果唯一标识
  /**
   * @example
   * fetch_req_b24edf30205c491b97ef1500a405b961
   */
  id: string;
  // 内容唯一标识，用于内容去重与引用
  /**
   * @example
   * compensatory_e81c1f5749545c5f7d247b3a100ffe62
   */
  contentId: string;
  // 原始网页链接
  /**
   * @example
   * -
   */
  url: string;
  // 网页标题
  /**
   * @example
   * -
   */
  title?: string;
  // 来源站点名称
  /**
   * @example
   * -
   */
  siteName?: string;
  // 网页声明的内容描述；来源于页面公开元信息，不是模型生成摘要
  /**
   * @example
   * -
   */
  description?: string;
  // 清洗后的网页主要正文
  /**
   * @example
   * -
   */
  content?: string;
  // 内容发布时间，ISO 8601 格式
  /**
   * @example
   * -
   */
  publishTime?: string;
  // 作者或发布机构
  /**
   * @example
   * -
   */
  author?: string;
  // 来源站点 Logo 链接
  /**
   * @example
   * -
   */
  logoUrl?: string;
  // 正文实际输出格式：text 或 markdown
  /**
   * @example
   * text
   */
  contentFormats?: string;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      contentId: 'content_id',
      url: 'url',
      title: 'title',
      siteName: 'site_name',
      description: 'description',
      content: 'content',
      publishTime: 'publish_time',
      author: 'author',
      logoUrl: 'logo_url',
      contentFormats: 'content_formats',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'string',
      contentId: 'string',
      url: 'string',
      title: 'string',
      siteName: 'string',
      description: 'string',
      content: 'string',
      publishTime: 'string',
      author: 'string',
      logoUrl: 'string',
      contentFormats: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 行业数据检索结果列表；命中时返回，支持多个结果，一般仅返回 1 个
export class IndustryDataItem extends $tea.Model {
  // 行业数据标题
  /**
   * @example
   * -
   */
  title: string;
  // 行业数据类型及结构标识，用于确定 CardData 的字段结构
  /**
   * @example
   * -
   */
  type: string;
  // 行业结构化数据，字段随 Type 定义
  /**
   * @example
   * -
   */
  result: string;
  static names(): { [key: string]: string } {
    return {
      title: 'title',
      type: 'type',
      result: 'result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      title: 'string',
      type: 'string',
      result: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryMcpGetcurtimeRequest extends $tea.Model {
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

export class QueryMcpGetcurtimeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 当前日期时间
  datetime?: string;
  // 周几
  weekDay?: string;
  // 是否交易日
  ifTradingDay?: string;
  // 是否周最后交易日
  ifWeekEnd?: string;
  // 是否月最后交易日
  ifMonthEnd?: string;
  // 是否季最后交易日
  ifQuarterEnd?: string;
  // 是否年最后交易日
  ifYearEnd?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      datetime: 'datetime',
      weekDay: 'week_day',
      ifTradingDay: 'if_trading_day',
      ifWeekEnd: 'if_week_end',
      ifMonthEnd: 'if_month_end',
      ifQuarterEnd: 'if_quarter_end',
      ifYearEnd: 'if_year_end',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      datetime: 'string',
      weekDay: 'string',
      ifTradingDay: 'string',
      ifWeekEnd: 'string',
      ifMonthEnd: 'string',
      ifQuarterEnd: 'string',
      ifYearEnd: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryMcpAssetRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 板块名称
  plateObject: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      plateObject: 'plate_object',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      plateObject: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryMcpAssetResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 资产类别
  assetType?: string;
  // 资产名称
  assetName?: string;
  // 跟踪指数代码
  trackIndexCode?: string;
  // 跟踪指数简称
  trackIndexAbbr?: string;
  // 排序
  sortOrder?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      assetType: 'asset_type',
      assetName: 'asset_name',
      trackIndexCode: 'track_index_code',
      trackIndexAbbr: 'track_index_abbr',
      sortOrder: 'sort_order',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      assetType: 'string',
      assetName: 'string',
      trackIndexCode: 'string',
      trackIndexAbbr: 'string',
      sortOrder: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAntsearchSearchRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 搜索内容，不能为空；建议不超过 200 个字符
  query: string;
  // AI 上下文档位，协议预设 fast、auto、pro，用于控制检索深度、内容密度和 Token 规模；当前仅支持 auto，传入其他值将返回参数错误
  mode?: string;
  // 搜索类型，当前仅支持 web；后续可扩展 image
  searchType?: string;
  // 网页结果最大返回数量，取值范围 1～30；不包含 IndustryData
  count?: number;
  // 正文格式。当前支持 text；markdown 为预留值，暂不支持
  contentFormat?: string;
  // 仅搜索指定网站。例如gov.cn表示只返回该域名下的内容；填写域名，不包含协议和路径,如果有多个，使用英文逗号(,)隔开
  filterIncludeDomains?: string;
  // 排除指定网站；填写域名，不包含协议和路径,如果有多个，使用英文逗号(,)隔开
  filterExcludeDomains?: string;
  // 预留。计划用于按发布时间筛选，当前不生效
  filterTimeRange?: string;
  // 是否同时查询行业垂类数据接口；命中结果通过 Result.IndustryData 独立返回
  filterNeedUrl?: boolean;
  // 预留。计划支持 news 等网页搜索领域，当前不生效
  filterIndustry?: string;
  // 是否返回 IndustryData
  filterEnableIndustryDataSearch?: boolean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      query: 'query',
      mode: 'mode',
      searchType: 'search_type',
      count: 'count',
      contentFormat: 'content_format',
      filterIncludeDomains: 'filter_include_domains',
      filterExcludeDomains: 'filter_exclude_domains',
      filterTimeRange: 'filter_time_range',
      filterNeedUrl: 'filter_need_url',
      filterIndustry: 'filter_industry',
      filterEnableIndustryDataSearch: 'filter_enable_industry_data_search',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      query: 'string',
      mode: 'string',
      searchType: 'string',
      count: 'number',
      contentFormat: 'string',
      filterIncludeDomains: 'string',
      filterExcludeDomains: 'string',
      filterTimeRange: 'string',
      filterNeedUrl: 'boolean',
      filterIndustry: 'string',
      filterEnableIndustryDataSearch: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAntsearchSearchResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 统一响应元信息
  responseMetadata?: ResponseMetadata;
  // 本次的搜索结果
  result?: Result;
  // 行业数据检索结果列表；命中时返回，支持多个结果，一般仅返回 1 个
  industryData?: IndustryDataItem[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      responseMetadata: 'response_metadata',
      result: 'result',
      industryData: 'industry_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      responseMetadata: ResponseMetadata,
      result: Result,
      industryData: { 'type': 'array', 'itemType': IndustryDataItem },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAntsearchFetchRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 需要读取的公开网页 URL。每次请求仅支持一个 URL，协议须为 http 或 https
  url: string;
  // 正文输出格式：text 或 markdown
  contentFormat?: string;
  // 网页读取最大等待时间，单位为秒，取值范围 1～60；超时后返回 IsSuccess=false 和 ErrorCode=FETCH_TIMEOUT
  timeout?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      url: 'url',
      contentFormat: 'content_format',
      timeout: 'timeout',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      url: 'string',
      contentFormat: 'string',
      timeout: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAntsearchFetchResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 网页读取和正文解析是否成功
  isSuccess?: boolean;
  // 失败原因标识，仅失败时返回
  errorCode?: string;
  // 可读的失败原因，仅失败时返回
  errorMessage?: string;
  // 请求元信息
  responseMetadata?: ResponseMetadata;
  // 网页读取与正文解析成功时返回
  result?: FetchResult;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      isSuccess: 'is_success',
      errorCode: 'error_code',
      errorMessage: 'error_message',
      responseMetadata: 'response_metadata',
      result: 'result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      isSuccess: 'boolean',
      errorCode: 'string',
      errorMessage: 'string',
      responseMetadata: ResponseMetadata,
      result: FetchResult,
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
          sdk_version: "1.0.8",
          _prod_code: "FINMATERIAL",
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
   * Description: 获取当前时间
   * Summary: 获取当前时间
   */
  async queryMcpGetcurtime(request: QueryMcpGetcurtimeRequest): Promise<QueryMcpGetcurtimeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryMcpGetcurtimeEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 获取当前时间
   * Summary: 获取当前时间
   */
  async queryMcpGetcurtimeEx(request: QueryMcpGetcurtimeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryMcpGetcurtimeResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryMcpGetcurtimeResponse>(await this.doRequest("1.0", "antdigital.finmaterial.mcp.getcurtime.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryMcpGetcurtimeResponse({}));
  }

  /**
   * @remarks
   * Description: 查询板块信息
   * Summary: 查询板块信息
   */
  async queryMcpAsset(request: QueryMcpAssetRequest): Promise<QueryMcpAssetResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryMcpAssetEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 查询板块信息
   * Summary: 查询板块信息
   */
  async queryMcpAssetEx(request: QueryMcpAssetRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryMcpAssetResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryMcpAssetResponse>(await this.doRequest("1.0", "antdigital.finmaterial.mcp.asset.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryMcpAssetResponse({}));
  }

  /**
   * @remarks
   * Description: 全网搜主搜接口
   * Summary: 全网搜主搜接口
   */
  async queryAntsearchSearch(request: QueryAntsearchSearchRequest): Promise<QueryAntsearchSearchResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAntsearchSearchEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 全网搜主搜接口
   * Summary: 全网搜主搜接口
   */
  async queryAntsearchSearchEx(request: QueryAntsearchSearchRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAntsearchSearchResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAntsearchSearchResponse>(await this.doRequest("1.0", "antdigital.finmaterial.antsearch.search.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAntsearchSearchResponse({}));
  }

  /**
   * @remarks
   * Description: Fetch API 适用于搜索结果补全、网页阅读、知识入库、引用核验和 Agent 工具调用。
   * Summary: Fetch API 适用于搜索结果补全、网页阅读、知识入库、引用核验和 Agent 工具调用。
   */
  async queryAntsearchFetch(request: QueryAntsearchFetchRequest): Promise<QueryAntsearchFetchResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAntsearchFetchEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: Fetch API 适用于搜索结果补全、网页阅读、知识入库、引用核验和 Agent 工具调用。
   * Summary: Fetch API 适用于搜索结果补全、网页阅读、知识入库、引用核验和 Agent 工具调用。
   */
  async queryAntsearchFetchEx(request: QueryAntsearchFetchRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAntsearchFetchResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAntsearchFetchResponse>(await this.doRequest("1.0", "antdigital.finmaterial.antsearch.fetch.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAntsearchFetchResponse({}));
  }

}
