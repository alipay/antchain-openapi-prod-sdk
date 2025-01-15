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

// 目录对象
export class CategoryVO extends $tea.Model {
  // 内部id
  id?: number;
  // 内容库id
  siteId?: number;
  // 站点
  site?: string;
  // language
  language?: string;
  // title
  title?: string;
  // 类型
  type?: number;
  // 展示类型 1为左侧展示2为列表展示
  showType?: number;
  // 排序
  sort?: number;
  // 目录层级
  level?: number;
  // 外标id
  extId?: string;
  // 父id
  parentId?: string;
  // 来源类型
  sourceType?: number;
  // 版本
  version?: string;
  // 语雀目录有无数据判定
  catalogueType?: number;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      siteId: 'site_id',
      site: 'site',
      language: 'language',
      title: 'title',
      type: 'type',
      showType: 'show_type',
      sort: 'sort',
      level: 'level',
      extId: 'ext_id',
      parentId: 'parent_id',
      sourceType: 'source_type',
      version: 'version',
      catalogueType: 'catalogue_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'number',
      siteId: 'number',
      site: 'string',
      language: 'string',
      title: 'string',
      type: 'number',
      showType: 'number',
      sort: 'number',
      level: 'number',
      extId: 'string',
      parentId: 'string',
      sourceType: 'number',
      version: 'string',
      catalogueType: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// NoviceMustSee
export class NoviceMustSee extends $tea.Model {
  // novice_must_see_explain
  noviceMustSeeExplain?: string;
  // novice_must_see_title1
  noviceMustSeeTitle1?: string;
  // novice_must_see_address1
  noviceMustSeeAddress1?: string;
  // novice_must_see_title2
  noviceMustSeeTitle2?: string;
  // novice_must_see_address2
  noviceMustSeeAddress2?: string;
  // novice_must_see_title3
  noviceMustSeeTitle3?: string;
  // novice_must_see_address3
  noviceMustSeeAddress3?: string;
  static names(): { [key: string]: string } {
    return {
      noviceMustSeeExplain: 'novice_must_see_explain',
      noviceMustSeeTitle1: 'novice_must_see_title1',
      noviceMustSeeAddress1: 'novice_must_see_address1',
      noviceMustSeeTitle2: 'novice_must_see_title2',
      noviceMustSeeAddress2: 'novice_must_see_address2',
      noviceMustSeeTitle3: 'novice_must_see_title3',
      noviceMustSeeAddress3: 'novice_must_see_address3',
    };
  }

  static types(): { [key: string]: any } {
    return {
      noviceMustSeeExplain: 'string',
      noviceMustSeeTitle1: 'string',
      noviceMustSeeAddress1: 'string',
      noviceMustSeeTitle2: 'string',
      noviceMustSeeAddress2: 'string',
      noviceMustSeeTitle3: 'string',
      noviceMustSeeAddress3: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 公司联系人
export class CorporateContacts extends $tea.Model {
  // 职务
  jobTitle?: string;
  // 姓名
  realName: string;
  // 电话
  mobilePhone?: string;
  // 邮箱
  email?: string;
  static names(): { [key: string]: string } {
    return {
      jobTitle: 'job_title',
      realName: 'real_name',
      mobilePhone: 'mobile_phone',
      email: 'email',
    };
  }

  static types(): { [key: string]: any } {
    return {
      jobTitle: 'string',
      realName: 'string',
      mobilePhone: 'string',
      email: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// PopularDocument
export class PopularDocument extends $tea.Model {
  // popular_document_title
  popularDocumentTitle?: string;
  // popular_document_id
  popularDocumentId?: string;
  // popular_document_info
  popularDocumentInfo?: string;
  // children
  children: CategoryVO[];
  static names(): { [key: string]: string } {
    return {
      popularDocumentTitle: 'popular_document_title',
      popularDocumentId: 'popular_document_id',
      popularDocumentInfo: 'popular_document_info',
      children: 'children',
    };
  }

  static types(): { [key: string]: any } {
    return {
      popularDocumentTitle: 'string',
      popularDocumentId: 'string',
      popularDocumentInfo: 'string',
      children: { 'type': 'array', 'itemType': CategoryVO },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 商机信息
export class BusinessRequest extends $tea.Model {
  // 客户名称
  customerName: string;
  // 客户id
  customerId: string;
  // 商机名称
  businessName: string;
  // 商机ID
  businessId: string;
  // 未开通(INIT)/开通中(OPENING/已开通(OPEN)/使用中(USING)/闲置中(IDLE)/已关闭(CLOSE)
  businessStatus: string;
  // 商机说明
  businessExplain?: string;
  // 线索来源
  source: string;
  // 商机时间
  businessDate: string;
  // 租户
  tenant: string;
  // 创建人工号
  creator: string;
  // 创建人花名
  creatorNick: string;
  static names(): { [key: string]: string } {
    return {
      customerName: 'customer_name',
      customerId: 'customer_id',
      businessName: 'business_name',
      businessId: 'business_id',
      businessStatus: 'business_status',
      businessExplain: 'business_explain',
      source: 'source',
      businessDate: 'business_date',
      tenant: 'tenant',
      creator: 'creator',
      creatorNick: 'creator_nick',
    };
  }

  static types(): { [key: string]: any } {
    return {
      customerName: 'string',
      customerId: 'string',
      businessName: 'string',
      businessId: 'string',
      businessStatus: 'string',
      businessExplain: 'string',
      source: 'string',
      businessDate: 'string',
      tenant: 'string',
      creator: 'string',
      creatorNick: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 用于传输附件链接
export class Attachment extends $tea.Model {
  // 文件唯一标识，作为幂等字段
  fileId: string;
  // 文件名称，用作展示
  filename?: string;
  // 访问地址
  url: string;
  static names(): { [key: string]: string } {
    return {
      fileId: 'file_id',
      filename: 'filename',
      url: 'url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      fileId: 'string',
      filename: 'string',
      url: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 页面上下文
export class PageContext extends $tea.Model {
  // 页面di
  pageId?: string;
  // 页面标题
  pageTitle?: string;
  static names(): { [key: string]: string } {
    return {
      pageId: 'page_id',
      pageTitle: 'page_title',
    };
  }

  static types(): { [key: string]: any } {
    return {
      pageId: 'string',
      pageTitle: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 情报资产详情
export class Asset extends $tea.Model {
  // 资产标识，作为幂等单号
  assetId: string;
  // VALID - 生效；INVALID - 作废
  status: string;
  // 资产详情，自定义展示
  assetInfo: string;
  static names(): { [key: string]: string } {
    return {
      assetId: 'asset_id',
      status: 'status',
      assetInfo: 'asset_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      assetId: 'string',
      status: 'string',
      assetInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// CategoryLocalVO
export class CategoryLocalVO extends $tea.Model {
  // id
  id?: number;
  // siteId
  siteId?: number;
  // title
  title?: string;
  // type
  type?: number;
  // sort
  sort?: number;
  // level
  level?: number;
  // parent_id
  parentId?: string;
  // sourceType
  sourceType?: number;
  // show_type
  showType?: number;
  // ext_id
  extId?: string;
  // shield
  shieId?: number;
  // status
  status?: number;
  // deleted
  deleted?: number;
  // tree
  tree?: string;
  // green
  green?: number;
  // site_code
  siteCode?: string;
  // created_time
  createdTime?: string;
  // modified_time
  modifiedTime?: string;
  // isCatalogue
  isCatalogue?: boolean;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      siteId: 'site_id',
      title: 'title',
      type: 'type',
      sort: 'sort',
      level: 'level',
      parentId: 'parent_id',
      sourceType: 'source_type',
      showType: 'show_type',
      extId: 'ext_id',
      shieId: 'shie_id',
      status: 'status',
      deleted: 'deleted',
      tree: 'tree',
      green: 'green',
      siteCode: 'site_code',
      createdTime: 'created_time',
      modifiedTime: 'modified_time',
      isCatalogue: 'is_catalogue',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'number',
      siteId: 'number',
      title: 'string',
      type: 'number',
      sort: 'number',
      level: 'number',
      parentId: 'string',
      sourceType: 'number',
      showType: 'number',
      extId: 'string',
      shieId: 'number',
      status: 'number',
      deleted: 'number',
      tree: 'string',
      green: 'number',
      siteCode: 'string',
      createdTime: 'string',
      modifiedTime: 'string',
      isCatalogue: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 线索信息请求
export class ClueInformationReq extends $tea.Model {
  // 线索标题
  title: string;
  // 线索跟进状态   INIT:待确认 CONTACTED:跟进中 CLOSED:线索终止 TRANSFER:已转交 BUSINESS:转商机
  status: string;
  // 线索跟进人  工号
  createdUserNick: string;
  // 线索描述
  description: string;
  // 客户名称
  customerName: string;
  // 业务线
  bizLine: string;
  // 客户地址
  customerLocation: string;
  // 公司联系人
  corporateContacts?: CorporateContacts[];
  // 客户所在行业
  customerIndustry: string;
  // 客户营收规模
  revenueScale?: string;
  // 社会信用代码
  socialCreditCode?: string;
  // 线索来源
  source: string;
  // 客户ID
  customerId?: string;
  // 多租户模型。线索服务化的租户模型。请联系线索服务管理员提供。固定值。
  tenant: string;
  static names(): { [key: string]: string } {
    return {
      title: 'title',
      status: 'status',
      createdUserNick: 'created_user_nick',
      description: 'description',
      customerName: 'customer_name',
      bizLine: 'biz_line',
      customerLocation: 'customer_location',
      corporateContacts: 'corporate_contacts',
      customerIndustry: 'customer_industry',
      revenueScale: 'revenue_scale',
      socialCreditCode: 'social_credit_code',
      source: 'source',
      customerId: 'customer_id',
      tenant: 'tenant',
    };
  }

  static types(): { [key: string]: any } {
    return {
      title: 'string',
      status: 'string',
      createdUserNick: 'string',
      description: 'string',
      customerName: 'string',
      bizLine: 'string',
      customerLocation: 'string',
      corporateContacts: { 'type': 'array', 'itemType': CorporateContacts },
      customerIndustry: 'string',
      revenueScale: 'string',
      socialCreditCode: 'string',
      source: 'string',
      customerId: 'string',
      tenant: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 内容对象
export class ContentObjVO extends $tea.Model {
  // novice_must_sees
  noviceMustSees?: NoviceMustSee[];
  // popular_document
  popularDocument?: PopularDocument[];
  // product_presentation
  productPresentation?: string;
  static names(): { [key: string]: string } {
    return {
      noviceMustSees: 'novice_must_sees',
      popularDocument: 'popular_document',
      productPresentation: 'product_presentation',
    };
  }

  static types(): { [key: string]: any } {
    return {
      noviceMustSees: { 'type': 'array', 'itemType': NoviceMustSee },
      popularDocument: { 'type': 'array', 'itemType': PopularDocument },
      productPresentation: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 优惠券模型
export class Coupon extends $tea.Model {
  // 优惠券ID
  id: number;
  // 优惠券名称,前端展示
  displayName: string;
  // 优惠券模板名称
  name: string;
  // 优惠券类型，VOUCHER：抵用券;CERTAIN：满减券；DISCOUNT：折扣券
  type: string;
  // 优惠券总金额，单位（分）。可使用优惠金额为amount-used_amount
  amount?: string;
  // 已使用金额，单位（分）。
  usedAmount?: string;
  // 状态，AVAILABLE-有效/EXPIRED-已过期/EXHAUSTED-已用完/ABANDONED-已作废
  status: string;
  // 有效期开始时间
  startTime: string;
  // 有效期结束时间
  endTime: string;
  // 模板id
  youhuiTemplateId: number;
  // 优惠券=折扣券时使用，如0.75
  discountRate?: string;
  // 优惠券类型=满减券时使用，如满2000元
  fullAmount?: string;
  // 可以使用的总次数
  usageCount: number;
  // 已使用次数（冻结次数）
  usedCount: number;
  // 适用产品：通用/ECS/RDS
  productList: string;
  // 适用订单类型
  orderTypeList: string;
  //  币种CurrencyCode CNY 代表人民币 USD代表美元
  currency: string;
  // 高精度总金额，单位元。可用金额 high_precision_available_amount = 总金额 high_precision_amount - 已使用金额 high_precision_used_amount
  highPrecisionAmount: string;
  // 单位元
  highPrecisionUsedAmount: string;
  // 单位元
  highPrecisionAvailableAmount: string;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      displayName: 'display_name',
      name: 'name',
      type: 'type',
      amount: 'amount',
      usedAmount: 'used_amount',
      status: 'status',
      startTime: 'start_time',
      endTime: 'end_time',
      youhuiTemplateId: 'youhui_template_id',
      discountRate: 'discount_rate',
      fullAmount: 'full_amount',
      usageCount: 'usage_count',
      usedCount: 'used_count',
      productList: 'product_list',
      orderTypeList: 'order_type_list',
      currency: 'currency',
      highPrecisionAmount: 'high_precision_amount',
      highPrecisionUsedAmount: 'high_precision_used_amount',
      highPrecisionAvailableAmount: 'high_precision_available_amount',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'number',
      displayName: 'string',
      name: 'string',
      type: 'string',
      amount: 'string',
      usedAmount: 'string',
      status: 'string',
      startTime: 'string',
      endTime: 'string',
      youhuiTemplateId: 'number',
      discountRate: 'string',
      fullAmount: 'string',
      usageCount: 'number',
      usedCount: 'number',
      productList: 'string',
      orderTypeList: 'string',
      currency: 'string',
      highPrecisionAmount: 'string',
      highPrecisionUsedAmount: 'string',
      highPrecisionAvailableAmount: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCouponRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 租户ID
  tenantId: string;
  // 优惠券模板ID
  templateId: string;
  // 查询范围，有效：AVAILABLE / 全部: ALL；不传默认查询有效
  scope?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      tenantId: 'tenant_id',
      templateId: 'template_id',
      scope: 'scope',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      tenantId: 'string',
      templateId: 'string',
      scope: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCouponResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 优惠券列表
  couponList?: Coupon[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      couponList: 'coupon_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      couponList: { 'type': 'array', 'itemType': Coupon },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SendCouponRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 外部业务流水号，用于幂等判断
  bizNo: string;
  // 租户ID
  tenantId: string;
  // 优惠券模板ID，营销后台申请获取
  templateId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      bizNo: 'biz_no',
      tenantId: 'tenant_id',
      templateId: 'template_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      bizNo: 'string',
      tenantId: 'string',
      templateId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SendCouponResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 优惠券id
  couponId?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      couponId: 'coupon_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      couponId: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateLeadClueRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 补登线索,客户信息
  request: ClueInformationReq;
  // 线索来源
  source: string;
  // 企业名称
  customerName: string;
  // 多租户模型。线索服务化的租户模型。请联系线索服务管理员提供。固定值。
  // tenant+source+customerName唯一确定一条线索。
  tenantName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      request: 'request',
      source: 'source',
      customerName: 'customer_name',
      tenantName: 'tenant_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      request: ClueInformationReq,
      source: 'string',
      customerName: 'string',
      tenantName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateLeadClueResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 成功与否
  result?: boolean;
  // 客户id，行业线自己的会员id
  customerId?: string;
  // 线索id，中台侧线索唯一号
  leadId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      result: 'result',
      customerId: 'customer_id',
      leadId: 'lead_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      result: 'boolean',
      customerId: 'string',
      leadId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddLeadBusinessRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 商机信息
  request: BusinessRequest[];
  // 线索服务化，多租户模型
  tenantName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      request: 'request',
      tenantName: 'tenant_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      request: { 'type': 'array', 'itemType': BusinessRequest },
      tenantName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddLeadBusinessResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  //  
  result?: boolean;
  // 新增的商机列表。正常情况下会返回新增的商机列表
  businessIds?: string[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      result: 'result',
      businessIds: 'business_ids',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      result: 'boolean',
      businessIds: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCouponPageRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 租户ID	
  tenantId: string;
  // 商品code	
  productCodes: string;
  // 优惠券类型:VOUCHER 抵用券, CERTAIN 满减券,DISCOUNT 折扣券	
  // 
  couponType?: string;
  // 当前页，默认第一页
  pageNo?: number;
  // 每页显示数量，默认10条
  pageSize?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      tenantId: 'tenant_id',
      productCodes: 'product_codes',
      couponType: 'coupon_type',
      pageNo: 'page_no',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      tenantId: 'string',
      productCodes: 'string',
      couponType: 'string',
      pageNo: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCouponPageResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 优惠券列表
  couponList?: Coupon[];
  // 当前页
  currentPage?: number;
  // 每页显示行数
  pageSize?: number;
  // 总数量
  totalCount?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      couponList: 'coupon_list',
      currentPage: 'current_page',
      pageSize: 'page_size',
      totalCount: 'total_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      couponList: { 'type': 'array', 'itemType': Coupon },
      currentPage: 'number',
      pageSize: 'number',
      totalCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCouponPagelistRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 租户ID	
  tenantId: string;
  // 商品code	
  // 可多选 多个产品间用 , 分隔  如
  // ABC,DEF,GHI
  productCodes: string;
  // 优惠券类型:VOUCHER 抵用券, CERTAIN 满减券,DISCOUNT 折扣券	
  // 
  couponType?: string;
  // 当前页，默认第一页
  pageNo?: number;
  // 每页显示数量，默认10条	
  // 
  pageSize?: number;
  // 币种，不传默认CNY人民币。
  currency?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      tenantId: 'tenant_id',
      productCodes: 'product_codes',
      couponType: 'coupon_type',
      pageNo: 'page_no',
      pageSize: 'page_size',
      currency: 'currency',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      tenantId: 'string',
      productCodes: 'string',
      couponType: 'string',
      pageNo: 'number',
      pageSize: 'number',
      currency: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCouponPagelistResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 优惠券列表
  couponList?: Coupon[];
  // 当前页	
  // 
  currentPage?: number;
  // 每页显示行数	
  // 
  pageSize?: number;
  // 总数量	
  // 
  totalCount?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      couponList: 'coupon_list',
      currentPage: 'current_page',
      pageSize: 'page_size',
      totalCount: 'total_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      couponList: { 'type': 'array', 'itemType': Coupon },
      currentPage: 'number',
      pageSize: 'number',
      totalCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryYouhuiTemplateRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 优惠券模板ID
  youhuiTemplateId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      youhuiTemplateId: 'youhui_template_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      youhuiTemplateId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryYouhuiTemplateResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 模板类型:APPLY, NORMAL
  tType?: string;
  // 币种
  currency?: string;
  // 模板ID
  id?: number;
  // 模板名称
  tName?: string;
  // 使用场景
  tUseScene?: string;
  // 模板开始时间
  tStartTime?: string;
  // 模板有效结束时间
  tEndTime?: string;
  // 优惠券允许发放的总数量
  yhMaxRelease?: string;
  // 券类型
  yhType?: string;
  // 满减条件金额(单位:元)， 如满200
  yhCertainMoney?: string;
  // 生成券的面额(单位:元)
  yhAmount?: string;
  // 折扣， 如: 0.75 取值范围(0, 1)
  yhDiscountRate?: string;
  // 优惠券使用次数 , 0表示无限制
  yhUsageCount?: string;
  // 相对时间，绝对时间ABSOLUTE/RELATIVE
  yhValidityType?: string;
  // 优惠券开始时间 yhValidityType=ABSOLUTE 不能为空, 精确到秒
  yhStartTime?: string;
  // 有效期结束时间， yhValidityType=ABSOLUTE 不能为空, 精确到秒
  yhEndTime?: string;
  // 有效时间——相对（单位秒），如果start_time为空，优惠券的有效期从生成的当天开始计算， 如果start_time不为空，优惠关的有效期从start_time开始算
  yhRelativeSecond?: number;
  // 每人限领数量
  yhPerLimitNum?: number;
  // 优惠券通用类型，UNIVERSAL通用券；NONUNIVERSAL非通用券
  yhUniversalType?: string;
  // 模板状态 APPROVED审批通过，生效中
  tStatus?: string;
  // 优惠券发券总额、总数量控制
  yhControlType?: string;
  // 申请原因
  tReason?: string;
  // 优惠条件备注，显示用
  yhDescription?: string;
  // 创建人, 系统操作为 应用名, 员工操作设置为工号
  tCreator?: string;
  // 最后修改人, 系统操作为 应用名, 员工操作设置为工号
  tModifier?: string;
  // 创建时间
  tGmtCreate?: string;
  // 最后修改时间
  tGmtModified?: string;
  // 商品规格CODE。 限定商品类型时， 适用的商品集合， 通用券( yhUniversalType=NONUNIVERSAL)不能为空
  itemCodeSet?: string[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      tType: 't_type',
      currency: 'currency',
      id: 'id',
      tName: 't_name',
      tUseScene: 't_use_scene',
      tStartTime: 't_start_time',
      tEndTime: 't_end_time',
      yhMaxRelease: 'yh_max_release',
      yhType: 'yh_type',
      yhCertainMoney: 'yh_certain_money',
      yhAmount: 'yh_amount',
      yhDiscountRate: 'yh_discount_rate',
      yhUsageCount: 'yh_usage_count',
      yhValidityType: 'yh_validity_type',
      yhStartTime: 'yh_start_time',
      yhEndTime: 'yh_end_time',
      yhRelativeSecond: 'yh_relative_second',
      yhPerLimitNum: 'yh_per_limit_num',
      yhUniversalType: 'yh_universal_type',
      tStatus: 't_status',
      yhControlType: 'yh_control_type',
      tReason: 't_reason',
      yhDescription: 'yh_description',
      tCreator: 't_creator',
      tModifier: 't_modifier',
      tGmtCreate: 't_gmt_create',
      tGmtModified: 't_gmt_modified',
      itemCodeSet: 'item_code_set',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      tType: 'string',
      currency: 'string',
      id: 'number',
      tName: 'string',
      tUseScene: 'string',
      tStartTime: 'string',
      tEndTime: 'string',
      yhMaxRelease: 'string',
      yhType: 'string',
      yhCertainMoney: 'string',
      yhAmount: 'string',
      yhDiscountRate: 'string',
      yhUsageCount: 'string',
      yhValidityType: 'string',
      yhStartTime: 'string',
      yhEndTime: 'string',
      yhRelativeSecond: 'number',
      yhPerLimitNum: 'number',
      yhUniversalType: 'string',
      tStatus: 'string',
      yhControlType: 'string',
      tReason: 'string',
      yhDescription: 'string',
      tCreator: 'string',
      tModifier: 'string',
      tGmtCreate: 'string',
      tGmtModified: 'string',
      itemCodeSet: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SendCouponAnnotatedRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 租户ID
  tenantId: string;
  // 优惠券模板ID
  templateId: string;
  // 幂等号
  bizNo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      tenantId: 'tenant_id',
      templateId: 'template_id',
      bizNo: 'biz_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      tenantId: 'string',
      templateId: 'string',
      bizNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SendCouponAnnotatedResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 优惠券id
  couponId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      couponId: 'coupon_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      couponId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDocRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 文档id
  id: string;
  // 内容id
  siteId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      id: 'id',
      siteId: 'site_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      id: 'string',
      siteId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDocResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 内部id
  id?: number;
  // 文档id
  docId?: string;
  // 文档标题
  title?: string;
  // 站点
  site?: string;
  // 语言code
  language?: string;
  // 内容
  content?: string;
  // 类型
  sourceType?: number;
  // 最后修改时间
  extModifiedTime?: number;
  // 关键字
  keyWords?: string;
  // 显示类型
  showType?: number;
  // 页面上下文
  pageContext?: PageContext[];
  // 内容对象
  // 
  // 
  contentObj?: ContentObjVO[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      id: 'id',
      docId: 'doc_id',
      title: 'title',
      site: 'site',
      language: 'language',
      content: 'content',
      sourceType: 'source_type',
      extModifiedTime: 'ext_modified_time',
      keyWords: 'key_words',
      showType: 'show_type',
      pageContext: 'page_context',
      contentObj: 'content_obj',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      id: 'number',
      docId: 'string',
      title: 'string',
      site: 'string',
      language: 'string',
      content: 'string',
      sourceType: 'number',
      extModifiedTime: 'number',
      keyWords: 'string',
      showType: 'number',
      pageContext: { 'type': 'array', 'itemType': PageContext },
      contentObj: { 'type': 'array', 'itemType': ContentObjVO },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDocChildRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 文档id
  id: string;
  // 目录id
  siteId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      id: 'id',
      siteId: 'site_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      id: 'string',
      siteId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDocChildResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 内部id
  id?: number;
  // 内容库id
  siteId?: number;
  // 站点
  site?: string;
  // 语言code
  language?: string;
  // 名称
  title?: string;
  // 类型
  type?: number;
  // 展示类型 1为左侧展示2为列表展示
  showType?: number;
  // 排序
  sort?: number;
  // 目录层级
  level?: number;
  // 外标id
  extId?: string;
  // 父id
  parentId?: string;
  // 来源类型
  sourceType?: number;
  // 版本
  version?: string;
  // 语雀目录有无数据判定
  catalogueType?: number;
  // children
  children?: CategoryVO[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      id: 'id',
      siteId: 'site_id',
      site: 'site',
      language: 'language',
      title: 'title',
      type: 'type',
      showType: 'show_type',
      sort: 'sort',
      level: 'level',
      extId: 'ext_id',
      parentId: 'parent_id',
      sourceType: 'source_type',
      version: 'version',
      catalogueType: 'catalogue_type',
      children: 'children',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      id: 'number',
      siteId: 'number',
      site: 'string',
      language: 'string',
      title: 'string',
      type: 'number',
      showType: 'number',
      sort: 'number',
      level: 'number',
      extId: 'string',
      parentId: 'string',
      sourceType: 'number',
      version: 'string',
      catalogueType: 'number',
      children: { 'type': 'array', 'itemType': CategoryVO },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCouponAvaliableRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 租户ID
  tenantId: string;
  // 商品code
  productCodes: string[];
  // 优惠券类型:VOUCHER 抵用券, CERTAIN 满减券,DISCOUNT 折扣券
  couponType?: string;
  // 业务发生时间
  bizTime: string;
  // 交易币种 CNY 人民币 USD美元
  currency: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      tenantId: 'tenant_id',
      productCodes: 'product_codes',
      couponType: 'coupon_type',
      bizTime: 'biz_time',
      currency: 'currency',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      tenantId: 'string',
      productCodes: { 'type': 'array', 'itemType': 'string' },
      couponType: 'string',
      bizTime: 'string',
      currency: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCouponAvaliableResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 优惠券列表
  couponList?: Coupon[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      couponList: 'coupon_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      couponList: { 'type': 'array', 'itemType': Coupon },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SubmitActivityInformationRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 活动标识
  activityId: string;
  // 渠道编码
  activityChannel: string;
  // 活动表单
  activityFormData: string;
  // 提交时间，ISO_DATE_TIME 时间格式
  submitDate?: string;
  // 情报标识，存在则更新
  informationId?: string;
  // 可选附件
  attachments?: Attachment[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      activityId: 'activity_id',
      activityChannel: 'activity_channel',
      activityFormData: 'activity_form_data',
      submitDate: 'submit_date',
      informationId: 'information_id',
      attachments: 'attachments',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      activityId: 'string',
      activityChannel: 'string',
      activityFormData: 'string',
      submitDate: 'string',
      informationId: 'string',
      attachments: { 'type': 'array', 'itemType': Attachment },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SubmitActivityInformationResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 情报标识
  informationId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      informationId: 'information_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      informationId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SyncActivityAssetsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 情报标识
  informationId: string;
  // 附件信息
  attachments: Attachment[];
  // 资产详情列表
  assets: Asset[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      informationId: 'information_id',
      attachments: 'attachments',
      assets: 'assets',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      informationId: 'string',
      attachments: { 'type': 'array', 'itemType': Attachment },
      assets: { 'type': 'array', 'itemType': Asset },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SyncActivityAssetsResponse extends $tea.Model {
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
          sdk_version: "1.2.0",
          _prod_code: "MARKETING",
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
   * Description: 优惠券列表查询接口
   * Summary: 优惠券列表查询接口
   */
  async queryCoupon(request: QueryCouponRequest): Promise<QueryCouponResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryCouponEx(request, headers, runtime);
  }

  /**
   * Description: 优惠券列表查询接口
   * Summary: 优惠券列表查询接口
   */
  async queryCouponEx(request: QueryCouponRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryCouponResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryCouponResponse>(await this.doRequest("1.0", "antcloud.marketing.coupon.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryCouponResponse({}));
  }

  /**
   * Description: 优惠券发放接口，基于模板ID发送优惠券
   * Summary: 优惠券发放接口
   */
  async sendCoupon(request: SendCouponRequest): Promise<SendCouponResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.sendCouponEx(request, headers, runtime);
  }

  /**
   * Description: 优惠券发放接口，基于模板ID发送优惠券
   * Summary: 优惠券发放接口
   */
  async sendCouponEx(request: SendCouponRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SendCouponResponse> {
    Util.validateModel(request);
    return $tea.cast<SendCouponResponse>(await this.doRequest("1.0", "antcloud.marketing.coupon.send", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SendCouponResponse({}));
  }

  /**
   * Description: 会员信息首次创建
   * Summary: 线索数据同步
   */
  async createLeadClue(request: CreateLeadClueRequest): Promise<CreateLeadClueResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createLeadClueEx(request, headers, runtime);
  }

  /**
   * Description: 会员信息首次创建
   * Summary: 线索数据同步
   */
  async createLeadClueEx(request: CreateLeadClueRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateLeadClueResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateLeadClueResponse>(await this.doRequest("1.0", "antcloud.marketing.lead.clue.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateLeadClueResponse({}));
  }

  /**
   * Description: 更新/添加商机
   * Summary: 添加商机
   */
  async addLeadBusiness(request: AddLeadBusinessRequest): Promise<AddLeadBusinessResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.addLeadBusinessEx(request, headers, runtime);
  }

  /**
   * Description: 更新/添加商机
   * Summary: 添加商机
   */
  async addLeadBusinessEx(request: AddLeadBusinessRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AddLeadBusinessResponse> {
    Util.validateModel(request);
    return $tea.cast<AddLeadBusinessResponse>(await this.doRequest("1.0", "antcloud.marketing.lead.business.add", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AddLeadBusinessResponse({}));
  }

  /**
   * Description: 优惠券查询(不区分可用与不可用)
  先查询客户的优惠券列表，然后再内存中过滤商品，会导致每页数量不同
   * Summary: 分页查询优惠券列表
   */
  async queryCouponPage(request: QueryCouponPageRequest): Promise<QueryCouponPageResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryCouponPageEx(request, headers, runtime);
  }

  /**
   * Description: 优惠券查询(不区分可用与不可用)
  先查询客户的优惠券列表，然后再内存中过滤商品，会导致每页数量不同
   * Summary: 分页查询优惠券列表
   */
  async queryCouponPageEx(request: QueryCouponPageRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryCouponPageResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryCouponPageResponse>(await this.doRequest("1.0", "antcloud.marketing.coupon.page.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryCouponPageResponse({}));
  }

  /**
   * Description: 优惠券查询(不区分可用与不可用)
  商品过滤放在SQL里面，从而每页数量一样
   * Summary: 分页查询优惠券列表V2
   */
  async queryCouponPagelist(request: QueryCouponPagelistRequest): Promise<QueryCouponPagelistResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryCouponPagelistEx(request, headers, runtime);
  }

  /**
   * Description: 优惠券查询(不区分可用与不可用)
  商品过滤放在SQL里面，从而每页数量一样
   * Summary: 分页查询优惠券列表V2
   */
  async queryCouponPagelistEx(request: QueryCouponPagelistRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryCouponPagelistResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryCouponPagelistResponse>(await this.doRequest("1.0", "antcloud.marketing.coupon.pagelist.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryCouponPagelistResponse({}));
  }

  /**
   * Description: 优惠模板详情
   * Summary: 优惠模板详情
   */
  async queryYouhuiTemplate(request: QueryYouhuiTemplateRequest): Promise<QueryYouhuiTemplateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryYouhuiTemplateEx(request, headers, runtime);
  }

  /**
   * Description: 优惠模板详情
   * Summary: 优惠模板详情
   */
  async queryYouhuiTemplateEx(request: QueryYouhuiTemplateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryYouhuiTemplateResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryYouhuiTemplateResponse>(await this.doRequest("1.0", "antcloud.marketing.youhui.template.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryYouhuiTemplateResponse({}));
  }

  /**
   * Description: 优惠券发放接口，基于模板ID发送优惠券
   * Summary: 优惠券发放接口,含错误返回
   */
  async sendCouponAnnotated(request: SendCouponAnnotatedRequest): Promise<SendCouponAnnotatedResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.sendCouponAnnotatedEx(request, headers, runtime);
  }

  /**
   * Description: 优惠券发放接口，基于模板ID发送优惠券
   * Summary: 优惠券发放接口,含错误返回
   */
  async sendCouponAnnotatedEx(request: SendCouponAnnotatedRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SendCouponAnnotatedResponse> {
    Util.validateModel(request);
    return $tea.cast<SendCouponAnnotatedResponse>(await this.doRequest("1.0", "antcloud.marketing.coupon.annotated.send", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SendCouponAnnotatedResponse({}));
  }

  /**
   * Description: 获取文档内容
   * Summary: 获取文档内容
   */
  async queryDoc(request: QueryDocRequest): Promise<QueryDocResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryDocEx(request, headers, runtime);
  }

  /**
   * Description: 获取文档内容
   * Summary: 获取文档内容
   */
  async queryDocEx(request: QueryDocRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryDocResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDocResponse>(await this.doRequest("1.0", "antcloud.marketing.doc.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryDocResponse({}));
  }

  /**
   * Description: 根据内容库id和目录id查询子目录
   * Summary: 根据内容库id和目录id查询子目录
   */
  async queryDocChild(request: QueryDocChildRequest): Promise<QueryDocChildResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryDocChildEx(request, headers, runtime);
  }

  /**
   * Description: 根据内容库id和目录id查询子目录
   * Summary: 根据内容库id和目录id查询子目录
   */
  async queryDocChildEx(request: QueryDocChildRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryDocChildResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDocChildResponse>(await this.doRequest("1.0", "antcloud.marketing.doc.child.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryDocChildResponse({}));
  }

  /**
   * Description: 优惠券查询(只查询可用优惠券，提供给收银台使用)
   * Summary: 查询所有可用优惠券列表
   */
  async queryCouponAvaliable(request: QueryCouponAvaliableRequest): Promise<QueryCouponAvaliableResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryCouponAvaliableEx(request, headers, runtime);
  }

  /**
   * Description: 优惠券查询(只查询可用优惠券，提供给收银台使用)
   * Summary: 查询所有可用优惠券列表
   */
  async queryCouponAvaliableEx(request: QueryCouponAvaliableRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryCouponAvaliableResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryCouponAvaliableResponse>(await this.doRequest("1.0", "antcloud.marketing.coupon.avaliable.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryCouponAvaliableResponse({}));
  }

  /**
   * Description: 提交活动情报数据
   * Summary: 提交活动情报数据
   */
  async submitActivityInformation(request: SubmitActivityInformationRequest): Promise<SubmitActivityInformationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.submitActivityInformationEx(request, headers, runtime);
  }

  /**
   * Description: 提交活动情报数据
   * Summary: 提交活动情报数据
   */
  async submitActivityInformationEx(request: SubmitActivityInformationRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SubmitActivityInformationResponse> {
    Util.validateModel(request);
    return $tea.cast<SubmitActivityInformationResponse>(await this.doRequest("1.0", "antcloud.marketing.activity.information.submit", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SubmitActivityInformationResponse({}));
  }

  /**
   * Description: 同步活动资产信息
   * Summary: 同步活动资产信息
   */
  async syncActivityAssets(request: SyncActivityAssetsRequest): Promise<SyncActivityAssetsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.syncActivityAssetsEx(request, headers, runtime);
  }

  /**
   * Description: 同步活动资产信息
   * Summary: 同步活动资产信息
   */
  async syncActivityAssetsEx(request: SyncActivityAssetsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SyncActivityAssetsResponse> {
    Util.validateModel(request);
    return $tea.cast<SyncActivityAssetsResponse>(await this.doRequest("1.0", "antcloud.marketing.activity.assets.sync", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SyncActivityAssetsResponse({}));
  }

}
