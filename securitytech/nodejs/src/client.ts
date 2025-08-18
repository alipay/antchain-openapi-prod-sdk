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

// 风险数据
export class RiskData extends $tea.Model {
  // 模型/标签编号
  resultKey: string;
  // 模型分/标签值
  resultValue: string;
  static names(): { [key: string]: string } {
    return {
      resultKey: 'result_key',
      resultValue: 'result_value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      resultKey: 'string',
      resultValue: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// ekyt响应头
export class ResponseHead extends $tea.Model {
  // 请求唯一标识
  requestId: string;
  static names(): { [key: string]: string } {
    return {
      requestId: 'request_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      requestId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// spu图片信息
export class SpuPictureInfo extends $tea.Model {
  // spu主图url
  mainPic: string;
  // spu详情图片url
  detailPic?: string[];
  static names(): { [key: string]: string } {
    return {
      mainPic: 'main_pic',
      detailPic: 'detail_pic',
    };
  }

  static types(): { [key: string]: any } {
    return {
      mainPic: 'string',
      detailPic: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 业务参数
export class BizParam extends $tea.Model {
  // 参数类型枚举，mobile、cert、biz_license
  paramKey: string;
  // 值，如加密后的手机号
  paramValue: string;
  static names(): { [key: string]: string } {
    return {
      paramKey: 'param_key',
      paramValue: 'param_value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      paramKey: 'string',
      paramValue: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// CctSubCheckLabel
export class CctSubCheckLabel extends $tea.Model {
  // sub_label
  subLabel: string;
  // rate
  rate: number;
  static names(): { [key: string]: string } {
    return {
      subLabel: 'sub_label',
      rate: 'rate',
    };
  }

  static types(): { [key: string]: any } {
    return {
      subLabel: 'string',
      rate: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// eKYT风险标签
export class RiskModel extends $tea.Model {
  // 标签名称
  modelName: string;
  // 风险值
  modelValue: string;
  // 风险标签描述
  modelComment: string;
  static names(): { [key: string]: string } {
    return {
      modelName: 'model_name',
      modelValue: 'model_value',
      modelComment: 'model_comment',
    };
  }

  static types(): { [key: string]: any } {
    return {
      modelName: 'string',
      modelValue: 'string',
      modelComment: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 风险结果
export class RiskResult extends $tea.Model {
  // 数据列表
  riskData: RiskData[];
  // 解决方案编码
  solutionCode: string;
  static names(): { [key: string]: string } {
    return {
      riskData: 'risk_data',
      solutionCode: 'solution_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      riskData: { 'type': 'array', 'itemType': RiskData },
      solutionCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 终端安全-Android应用加固-RuntimeProtectConfig
export class RuntimeProtectConfig extends $tea.Model {
  // 重打包,签名校验,AndroidManifest防篡改,签名文件保护,0为检测到风险退出,1不处理
  antiSignature: number;
  // 防调试,0为检测到风险退出,1不处理
  antiDebug: number;
  // 防hook,0为检测到风险退出,1不处理
  antiHook: number;
  // 防注入,防内存dump,防内存数据修改,读取,0为检测到风险退出,1不处理
  antiInject: number;
  // 模拟器检查,0为检测到风险退出,1不处理
  antiEmulator: number;
  // 防root,0为检测到风险退出,1不处理
  antiRoot: number;
  // 防多开软件运行,0为检测到风险退出,1不处理
  antiMultiApp: number;
  static names(): { [key: string]: string } {
    return {
      antiSignature: 'anti_signature',
      antiDebug: 'anti_debug',
      antiHook: 'anti_hook',
      antiInject: 'anti_inject',
      antiEmulator: 'anti_emulator',
      antiRoot: 'anti_root',
      antiMultiApp: 'anti_multi_app',
    };
  }

  static types(): { [key: string]: any } {
    return {
      antiSignature: 'number',
      antiDebug: 'number',
      antiHook: 'number',
      antiInject: 'number',
      antiEmulator: 'number',
      antiRoot: 'number',
      antiMultiApp: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 人脸盾结果
export class FaceShieldResult extends $tea.Model {
  // 设备token
  apdidToken: string;
  // 风险等级，-1参数异常，0无风险，1-3表示低、中、高
  riskLevel: number;
  // 风险描述，对风险等级的补充
  riskDesc: string;
  // 处理的建议，如PAAS
  sugAction: string;
  static names(): { [key: string]: string } {
    return {
      apdidToken: 'apdid_token',
      riskLevel: 'risk_level',
      riskDesc: 'risk_desc',
      sugAction: 'sug_action',
    };
  }

  static types(): { [key: string]: any } {
    return {
      apdidToken: 'string',
      riskLevel: 'number',
      riskDesc: 'string',
      sugAction: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 两轮车一体机销售信息
export class SimSalesInfo extends $tea.Model {
  // 销售对外业务id
  salesId: string;
  static names(): { [key: string]: string } {
    return {
      salesId: 'sales_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      salesId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 终端安全-Android加固-Response
export class FileTokenForUpload extends $tea.Model {
  // .
  accessId: string;
  // dir
  dir: string;
  // expire
  expire: string;
  // host
  host: string;
  // policy
  policy: string;
  // signature
  signature: string;
  static names(): { [key: string]: string } {
    return {
      accessId: 'access_id',
      dir: 'dir',
      expire: 'expire',
      host: 'host',
      policy: 'policy',
      signature: 'signature',
    };
  }

  static types(): { [key: string]: any } {
    return {
      accessId: 'string',
      dir: 'string',
      expire: 'string',
      host: 'string',
      policy: 'string',
      signature: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// result.resultData
export class DeviceRiskReportResultData extends $tea.Model {
  // webrtc_url
  webrtcUrl: string;
  // a_dynamic_swi
  aDynamicSwi: string;
  // dynamic_interval
  dynamicInterval: string;
  // color
  color: string;
  // os
  os: string;
  // dynamic_cmd
  dynamicCmd: string;
  // time_interval
  timeInterval: string;
  // dynamic_trace
  dynamicTrace: string;
  // dynamic_num
  dynamicNum: string;
  // result_type
  resultType: string;
  static names(): { [key: string]: string } {
    return {
      webrtcUrl: 'webrtc_url',
      aDynamicSwi: 'a_dynamic_swi',
      dynamicInterval: 'dynamic_interval',
      color: 'color',
      os: 'os',
      dynamicCmd: 'dynamic_cmd',
      timeInterval: 'time_interval',
      dynamicTrace: 'dynamic_trace',
      dynamicNum: 'dynamic_num',
      resultType: 'result_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      webrtcUrl: 'string',
      aDynamicSwi: 'string',
      dynamicInterval: 'string',
      color: 'string',
      os: 'string',
      dynamicCmd: 'string',
      timeInterval: 'string',
      dynamicTrace: 'string',
      dynamicNum: 'string',
      resultType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// eKYT人脸核身结果数据
export class FaceVerifyResultData extends $tea.Model {
  // 请求唯一标识Id
  requestId: string;
  // 认证是否通过
  passed: string;
  // faceOcclusion:面部遮挡信息；true为有面部遮挡，false为无面部遮挡
  materialInfo: string;
  static names(): { [key: string]: string } {
    return {
      requestId: 'request_id',
      passed: 'passed',
      materialInfo: 'material_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      requestId: 'string',
      passed: 'string',
      materialInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 光鉴智能凭证结构体
export class IdentityData extends $tea.Model {
  // 风险等级，枚举值： 0：低风险（打扰率＞10%） 1：中风险（5%＜打扰率≤10%） 2：高风险（打扰率≤5%）
  isRisk: string;
  // 风险类型，枚举值及对应含义： ● PS：图片被PS篡改 ● SCREEN_PHOTO：屏幕翻拍 ● SCREENSHOT：截屏图片 ● COLOR_PRINT：彩打复印 ● WATERMARK：水印 ● FACE_SIMILAR：人脸相似 ● BACKGROUND_SIMILAR：背景相似 ● SIGNATURE_SIMILAR：证件手写签名相似 格式：以英文逗号分隔，如样例
  riskType: string;
  // 附加字段,json格式字符串
  extInfo: string;
  static names(): { [key: string]: string } {
    return {
      isRisk: 'is_risk',
      riskType: 'risk_type',
      extInfo: 'ext_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      isRisk: 'string',
      riskType: 'string',
      extInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 安卓加固HardeningTaskResponse
export class HardeningTaskResponse extends $tea.Model {
  // 加固任务的 ID，后续用来轮询调用
  taskId: string;
  // 加固任务的状态
  status: number;
  // 加固后 APK/ABB 的 MD5
  afterMdFive: string;
  // 加固后 APK/ABB 的大小
  afterSize: number;
  static names(): { [key: string]: string } {
    return {
      taskId: 'task_id',
      status: 'status',
      afterMdFive: 'after_md_five',
      afterSize: 'after_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      taskId: 'string',
      status: 'number',
      afterMdFive: 'string',
      afterSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// ETC车辆信息
export class EtcVehicleInfo extends $tea.Model {
  // 车辆id
  vehicleId: string;
  // etc申请单号
  orderId: string;
  // etc平台扣款协议号
  bizAgreementNo: string;
  // etc申请单状态
  // ORDER_CREATE:订单创建;ORDER_SYNCED:订单已同步;SUCCESS_ACTIVATE:订单已激活;UNMOUNTING:注销中;UNMOUNTED:已注销;
  orderStatus: string;
  // 用户ETC设备OBU号，当order_status为SUCCESS_ACTIVATE及以后状态时，必选
  deviceNo?: string;
  // 代扣签约状态，当传入waybill_no且匹配到对应运单时，deduct_sign_status必选
  // 待签约: WAIT_SIGN
  // 已签约: SIGNED
  // 已解约: UNSIGN
  deductSignStatus?: string;
  // 设备首次激活时间
  firstActivedTime?: string;
  // 合约到期时间
  serviceExp?: string;
  // etc设备状态，USABLE-设备激活可用（可上高速正常使用）PENDING-设备激活挂起（限制消费） UNUSABLE-设备异常不可用
  deviceStatus?: string;
  // 设备状态明细，能清楚说明etc设备此时状态（/卡签注销/卡签挂失/已过户/维修中/黑名单/卡过期/欠费/标签脱落/设备报警/正常/ETC停用等）
  deviceStatusDetail?: string;
  // 设备状态触发的具体时间
  deviceBizTime?: string;
  static names(): { [key: string]: string } {
    return {
      vehicleId: 'vehicle_id',
      orderId: 'order_id',
      bizAgreementNo: 'biz_agreement_no',
      orderStatus: 'order_status',
      deviceNo: 'device_no',
      deductSignStatus: 'deduct_sign_status',
      firstActivedTime: 'first_actived_time',
      serviceExp: 'service_exp',
      deviceStatus: 'device_status',
      deviceStatusDetail: 'device_status_detail',
      deviceBizTime: 'device_biz_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      vehicleId: 'string',
      orderId: 'string',
      bizAgreementNo: 'string',
      orderStatus: 'string',
      deviceNo: 'string',
      deductSignStatus: 'string',
      firstActivedTime: 'string',
      serviceExp: 'string',
      deviceStatus: 'string',
      deviceStatusDetail: 'string',
      deviceBizTime: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// eKYT业务响应结果
export class IifaaEkytResponse extends $tea.Model {
  // 响应头
  head: ResponseHead;
  // 业务响应结果
  bizRes: string;
  static names(): { [key: string]: string } {
    return {
      head: 'head',
      bizRes: 'biz_res',
    };
  }

  static types(): { [key: string]: any } {
    return {
      head: ResponseHead,
      bizRes: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 业务请求入参，兼容批量调用
export class BizQueryParam extends $tea.Model {
  // 参数列表，数组
  bizParams: BizParam[];
  static names(): { [key: string]: string } {
    return {
      bizParams: 'biz_params',
    };
  }

  static types(): { [key: string]: any } {
    return {
      bizParams: { 'type': 'array', 'itemType': BizParam },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// eKYT可信签约录入准备数据
export class TrustSignInitData extends $tea.Model {
  // 请求唯一标识Id
  requestId: string;
  // 签约秘钥
  signUniqueId: string;
  static names(): { [key: string]: string } {
    return {
      requestId: 'request_id',
      signUniqueId: 'sign_unique_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      requestId: 'string',
      signUniqueId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 终端安全-Android应用加固-ClassMethodConfig
export class ClassMethodConfig extends $tea.Model {
  // 加固类名
  className: string;
  // 方法集合，使用英文逗号分隔
  methods: string;
  static names(): { [key: string]: string } {
    return {
      className: 'class_name',
      methods: 'methods',
    };
  }

  static types(): { [key: string]: any } {
    return {
      className: 'string',
      methods: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 两轮车一体机订单信息
export class SimOrderInfo extends $tea.Model {
  // 订单ID
  orderId: string;
  // 必填	销售id
  salesId: string;
  // 车辆SN号
  sn?: string;
  // 用户手机号
  mobileNo?: string;
  // 订单时间，格式yyyy-MM-dd HH:mm:ss
  orderTime: string;
  // 支付类型，枚举值FULL（全额付款）, INSTALLMENT（分期付款）
  paymentType?: string;
  // 支付时间，格式yyyy-MM-dd HH:mm:ss
  paymentTime?: string;
  // 总金额，单位元
  totalAmount?: string;
  // 订单状态，枚举值
  // UNPAID（未支付），
  // PAID（已支付），
  // CANCEL（订单取消），
  // PENDING（支付中），
  // FAILED（支付失败）
  status: string;
  // 车辆SKU名字
  skuName?: string;
  // 车型
  vehicleModel?: string;
  // 颜色
  color?: string;
  // 配件信息，逗号分隔
  accessories?: string;
  // 图片json
  images?: string;
  // 拓展字段，json格式
  extraInfo?: string;
  static names(): { [key: string]: string } {
    return {
      orderId: 'order_id',
      salesId: 'sales_id',
      sn: 'sn',
      mobileNo: 'mobile_no',
      orderTime: 'order_time',
      paymentType: 'payment_type',
      paymentTime: 'payment_time',
      totalAmount: 'total_amount',
      status: 'status',
      skuName: 'sku_name',
      vehicleModel: 'vehicle_model',
      color: 'color',
      accessories: 'accessories',
      images: 'images',
      extraInfo: 'extra_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      orderId: 'string',
      salesId: 'string',
      sn: 'string',
      mobileNo: 'string',
      orderTime: 'string',
      paymentType: 'string',
      paymentTime: 'string',
      totalAmount: 'string',
      status: 'string',
      skuName: 'string',
      vehicleModel: 'string',
      color: 'string',
      accessories: 'string',
      images: 'string',
      extraInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 二轮车一体机车辆SKU
export class SimSkuInfo extends $tea.Model {
  // sku对外id
  skuId: string;
  // sku名称
  skuName: string;
  // sku官方指导价：单位为元
  price: string;
  // sku门店优惠价：单位为元
  storePrice: string;
  // 车型
  vehicleModel: string;
  // 续航里程
  rangeKm: string;
  // 关键词，逗号分隔
  keywords: string;
  // 颜色，逗号分隔
  colors: string;
  // 配件信息，逗号分隔
  accessories: string;
  // 图片url json
  images: string;
  // 门店id
  storeId: string;
  // 车型描述
  skuDescription?: string;
  static names(): { [key: string]: string } {
    return {
      skuId: 'sku_id',
      skuName: 'sku_name',
      price: 'price',
      storePrice: 'store_price',
      vehicleModel: 'vehicle_model',
      rangeKm: 'range_km',
      keywords: 'keywords',
      colors: 'colors',
      accessories: 'accessories',
      images: 'images',
      storeId: 'store_id',
      skuDescription: 'sku_description',
    };
  }

  static types(): { [key: string]: any } {
    return {
      skuId: 'string',
      skuName: 'string',
      price: 'string',
      storePrice: 'string',
      vehicleModel: 'string',
      rangeKm: 'string',
      keywords: 'string',
      colors: 'string',
      accessories: 'string',
      images: 'string',
      storeId: 'string',
      skuDescription: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// eKYT可信签约查询数据
export class TrustSignQueryData extends $tea.Model {
  // 请求唯一标识Id
  requestId: string;
  // 订单状态
  orderStatus: string;
  // 签约方案码
  solutionCode: string;
  // 创建时间
  gmtCreate: string;
  // 修改时间
  gmtModified: string;
  // 签约文件列表
  fileList: string[];
  static names(): { [key: string]: string } {
    return {
      requestId: 'request_id',
      orderStatus: 'order_status',
      solutionCode: 'solution_code',
      gmtCreate: 'gmt_create',
      gmtModified: 'gmt_modified',
      fileList: 'file_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      requestId: 'string',
      orderStatus: 'string',
      solutionCode: 'string',
      gmtCreate: 'string',
      gmtModified: 'string',
      fileList: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// eKYT请求头
export class RequestHead extends $tea.Model {
  // 请求唯一标识
  requestId: string;
  // 客户身份标识ID
  secretId: string;
  // 客户签约产品code
  productCode: string;
  // response输出类型，默认json
  formatType?: string;
  // false
  onlineFlag?: boolean;
  static names(): { [key: string]: string } {
    return {
      requestId: 'request_id',
      secretId: 'secret_id',
      productCode: 'product_code',
      formatType: 'format_type',
      onlineFlag: 'online_flag',
    };
  }

  static types(): { [key: string]: any } {
    return {
      requestId: 'string',
      secretId: 'string',
      productCode: 'string',
      formatType: 'string',
      onlineFlag: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 车队信息结构体
export class DcpInfo extends $tea.Model {
  // 企业入驻租户ID
  dcpTenantId: string;
  // 企业名称
  dcpName: string;
  static names(): { [key: string]: string } {
    return {
      dcpTenantId: 'dcp_tenant_id',
      dcpName: 'dcp_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      dcpTenantId: 'string',
      dcpName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 保单信息
export class InsureInfo extends $tea.Model {
  // 保单时间
  modifyTime: string;
  // 蚂蚁L5产品code
  productCode: string;
  // 保险产品code
  insureProduct: string;
  // 保险产品价格
  insurePrice: string;
  // 保险品种
  insureType: string;
  // 付款方式
  payType: string;
  // 保险期数
  insurePeriod: string;
  // 保单状态
  policyStatus: string;
  // 操作类型
  operateType: string;
  // 保司信用代码
  insureCompCreditNo: string;
  static names(): { [key: string]: string } {
    return {
      modifyTime: 'modify_time',
      productCode: 'product_code',
      insureProduct: 'insure_product',
      insurePrice: 'insure_price',
      insureType: 'insure_type',
      payType: 'pay_type',
      insurePeriod: 'insure_period',
      policyStatus: 'policy_status',
      operateType: 'operate_type',
      insureCompCreditNo: 'insure_comp_credit_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      modifyTime: 'string',
      productCode: 'string',
      insureProduct: 'string',
      insurePrice: 'string',
      insureType: 'string',
      payType: 'string',
      insurePeriod: 'string',
      policyStatus: 'string',
      operateType: 'string',
      insureCompCreditNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 设备风险咨询结果
export class RiskQueryData extends $tea.Model {
  // 风险评分
  riskScore: string;
  // 风险标签
  riskLabels: string[];
  static names(): { [key: string]: string } {
    return {
      riskScore: 'risk_score',
      riskLabels: 'risk_labels',
    };
  }

  static types(): { [key: string]: any } {
    return {
      riskScore: 'string',
      riskLabels: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 两轮车一体机车辆SPU
export class SimSpuInfo extends $tea.Model {
  // SPU ID
  spuId: string;
  // spu名称
  spuName: string;
  // spu图片信息
  spuPictureInfo: SpuPictureInfo;
  static names(): { [key: string]: string } {
    return {
      spuId: 'spu_id',
      spuName: 'spu_name',
      spuPictureInfo: 'spu_picture_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      spuId: 'string',
      spuName: 'string',
      spuPictureInfo: SpuPictureInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// KeyValue对属性
export class KeyValueMap extends $tea.Model {
  // key-value中的key
  key?: string;
  // key-value中的value
  value?: string;
  static names(): { [key: string]: string } {
    return {
      key: 'key',
      value: 'value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      key: 'string',
      value: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// eKYT人脸核身初始化数据
export class FaceVerifyInitData extends $tea.Model {
  // 请求唯一标识Id
  requestId: string;
  // 可信实人认证的唯一标识
  certifyId: string;
  // 认证流程入口 URL
  certifyUrl: string;
  static names(): { [key: string]: string } {
    return {
      requestId: 'request_id',
      certifyId: 'certify_id',
      certifyUrl: 'certify_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      requestId: 'string',
      certifyId: 'string',
      certifyUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 设备风险查询data
export class DeviceRiskResp extends $tea.Model {
  // apdid
  apdid: string;
  // apdid_token
  apdidToken: string;
  // risk_level
  riskLevel: number;
  // risk_desc
  riskDesc: string;
  // sug_action
  sugAction: string;
  // risk_labels
  riskLabels: string[];
  static names(): { [key: string]: string } {
    return {
      apdid: 'apdid',
      apdidToken: 'apdid_token',
      riskLevel: 'risk_level',
      riskDesc: 'risk_desc',
      sugAction: 'sug_action',
      riskLabels: 'risk_labels',
    };
  }

  static types(): { [key: string]: any } {
    return {
      apdid: 'string',
      apdidToken: 'string',
      riskLevel: 'number',
      riskDesc: 'string',
      sugAction: 'string',
      riskLabels: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 分页器
export class Paginator extends $tea.Model {
  // 当前页
  page: number;
  // 单页项数
  itemsPerPage: number;
  // 总项数
  items: number;
  static names(): { [key: string]: string } {
    return {
      page: 'page',
      itemsPerPage: 'items_per_page',
      items: 'items',
    };
  }

  static types(): { [key: string]: any } {
    return {
      page: 'number',
      itemsPerPage: 'number',
      items: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 内容安全请求体datamap
export class CctDataMap extends $tea.Model {
  // text
  text?: string[];
  // PICTURE
  picture?: string[];
  static names(): { [key: string]: string } {
    return {
      text: 'text',
      picture: 'picture',
    };
  }

  static types(): { [key: string]: any } {
    return {
      text: { 'type': 'array', 'itemType': 'string' },
      picture: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 两轮车一体机门店信息
export class SimStoreInfo extends $tea.Model {
  // 门店对外业务id
  storeId: string;
  // 门店名称
  storeName: string;
  // 是否签约 true已签约/false未签约
  isSign: boolean;
  // 支付宝H5签约链接 未签约时非空
  signUrl?: string;
  static names(): { [key: string]: string } {
    return {
      storeId: 'store_id',
      storeName: 'store_name',
      isSign: 'is_sign',
      signUrl: 'sign_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      storeId: 'string',
      storeName: 'string',
      isSign: 'boolean',
      signUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 司机签约信息列表
export class SignInfo extends $tea.Model {
  // 司机证件号
  employeeCertNo: string;
  // 灵工卡号
  employeeCardNo: string;
  // 借贷专户ID，用于后续资金相关操作
  accountBookId: string;
  // 签约状态，枚举值
  // ● SIGNED：已签约【灵工卡状态正常，可入金出金】
  // ● TERMINATED：已解约【不可入金出金】
  status: string;
  // 签约时间 "yyyy-MM-dd HH:mm:ss"
  signTime?: string;
  // 解约时间 "yyyy-MM-dd HH:mm:ss"
  terminateTime?: string;
  // 签约协议生效时间
  effectTime: string;
  // 签约协议解约时间
  expireTime: string;
  // 月租金额：单位为元
  paymentAmount: string;
  static names(): { [key: string]: string } {
    return {
      employeeCertNo: 'employee_cert_no',
      employeeCardNo: 'employee_card_no',
      accountBookId: 'account_book_id',
      status: 'status',
      signTime: 'sign_time',
      terminateTime: 'terminate_time',
      effectTime: 'effect_time',
      expireTime: 'expire_time',
      paymentAmount: 'payment_amount',
    };
  }

  static types(): { [key: string]: any } {
    return {
      employeeCertNo: 'string',
      employeeCardNo: 'string',
      accountBookId: 'string',
      status: 'string',
      signTime: 'string',
      terminateTime: 'string',
      effectTime: 'string',
      expireTime: 'string',
      paymentAmount: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 风险评估结果
export class RiskAssessResult extends $tea.Model {
  // 风险评估结果
  riskValue: string;
  // 风险评估分数
  riskScore: string;
  // 风险评估标签
  modelInfos: RiskModel;
  static names(): { [key: string]: string } {
    return {
      riskValue: 'risk_value',
      riskScore: 'risk_score',
      modelInfos: 'model_infos',
    };
  }

  static types(): { [key: string]: any } {
    return {
      riskValue: 'string',
      riskScore: 'string',
      modelInfos: RiskModel,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 内容安全response
export class CctDetectCheckLabel extends $tea.Model {
  // label
  label: string;
  // rate
  rate: number;
  // subLabels
  subLabels: CctSubCheckLabel[];
  // details
  details: string;
  static names(): { [key: string]: string } {
    return {
      label: 'label',
      rate: 'rate',
      subLabels: 'sub_labels',
      details: 'details',
    };
  }

  static types(): { [key: string]: any } {
    return {
      label: 'string',
      rate: 'number',
      subLabels: { 'type': 'array', 'itemType': CctSubCheckLabel },
      details: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 风险评估响应结果
export class RiskAssessData extends $tea.Model {
  // 响应头
  head: ResponseHead;
  // 风险评估结果
  riskResult: string;
  static names(): { [key: string]: string } {
    return {
      head: 'head',
      riskResult: 'risk_result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      head: ResponseHead,
      riskResult: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 风险咨询结果
export class ResultList extends $tea.Model {
  // 结果列表
  riskResults: RiskResult[];
  // 入参列表，数组
  bizParams: BizParam[];
  static names(): { [key: string]: string } {
    return {
      riskResults: 'risk_results',
      bizParams: 'biz_params',
    };
  }

  static types(): { [key: string]: any } {
    return {
      riskResults: { 'type': 'array', 'itemType': RiskResult },
      bizParams: { 'type': 'array', 'itemType': BizParam },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// ETC行程信息
export class EtcTripInfo extends $tea.Model {
  // 发行方扣款订单号
  outOrderId?: string;
  // 行程开始时间
  tripStartTime?: string;
  // 行程结束时间
  tripEndTime?: string;
  // 1、收费站入口名称 2、格式为省份+收费站名，比如“黑龙江瓦盆窑西站”
  startStationName?: string;
  // 1、收费站出口名称 2、格式为省份+收费站名，比如“黑龙江瓦盆窑西站”
  endStationName?: string;
  // HIGHWAY_TYPE：高速交易场景类型，对应具体交易场景[ETC_HIGHWAY,ETC_HIGHWAY_OPEN] EXPAND_TYPE：拓展消费交易类型，对应具体交易场景 [ETC_PARKING,ETC_GAS,ETC_SERVICE_AREA,ETC_MUNICIPAL_SERVICE]
  subType?: string;
  // ETC_HIGHWAY：ETC封闭式高速公路； ETC_HIGHWAY_OPEN：ETC开放式高速公路； ETC_PARKING：ETC停车场； ETC_GAS：ETC加油站； ETC_SERVICE_AREA：ETC服务区； ETC_MUNICIPAL_SERVICE：ETC市政服务
  subScene?: string;
  // 商户扣费的总金额：单位为元，精确到小数点后两位
  totalAmount?: string;
  // 行程id
  tripId?: string;
  // 交易单号
  tradeNo?: string;
  static names(): { [key: string]: string } {
    return {
      outOrderId: 'out_order_id',
      tripStartTime: 'trip_start_time',
      tripEndTime: 'trip_end_time',
      startStationName: 'start_station_name',
      endStationName: 'end_station_name',
      subType: 'sub_type',
      subScene: 'sub_scene',
      totalAmount: 'total_amount',
      tripId: 'trip_id',
      tradeNo: 'trade_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      outOrderId: 'string',
      tripStartTime: 'string',
      tripEndTime: 'string',
      startStationName: 'string',
      endStationName: 'string',
      subType: 'string',
      subScene: 'string',
      totalAmount: 'string',
      tripId: 'string',
      tradeNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 两轮车一体机营销活动信息
export class SimCampaignInfo extends $tea.Model {
  // 营销活动id
  campaignId: string;
  // 营销活动名
  campaignName: string;
  // 营销图片
  imageUrl: string;
  // 营销活动内容
  content: string;
  static names(): { [key: string]: string } {
    return {
      campaignId: 'campaign_id',
      campaignName: 'campaign_name',
      imageUrl: 'image_url',
      content: 'content',
    };
  }

  static types(): { [key: string]: any } {
    return {
      campaignId: 'string',
      campaignName: 'string',
      imageUrl: 'string',
      content: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RunGeneralRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 业务请求数据，json格式
  request: string;
  // 要调用的具体的服务名称
  serviceName: string;
  // 扩展信息
  extInfo?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      request: 'request',
      serviceName: 'service_name',
      extInfo: 'ext_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      request: 'string',
      serviceName: 'string',
      extInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RunGeneralResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 业务响应数据，json格式
  response?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      response: 'response',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      response: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecEkytInsureRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 保险信息list的jsonStr
  insureInfoListStr: string;
  // 对insure_info_list_str的签名
  signature: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      insureInfoListStr: 'insure_info_list_str',
      signature: 'signature',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      insureInfoListStr: 'string',
      signature: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecEkytInsureResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 是否成功
  success?: boolean;
  // 投保结果list的jsonStr
  data?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      success: 'success',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      success: 'boolean',
      data: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListDcpRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 请求ID，为32位以内的字母数字组合，由调用方自行生成、保证唯一并留存，以便问题定位。
  outerOrderNo: string;
  // 扩展信息，预留字段
  externParam?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      outerOrderNo: 'outer_order_no',
      externParam: 'extern_param',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      outerOrderNo: 'string',
      externParam: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListDcpResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 请求方租户所关联的所有入驻的车队企业信息列表
  dcpInfoList?: DcpInfo[];
  // json格式字符串扩展信息，预留字段。
  externInfo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      dcpInfoList: 'dcp_info_list',
      externInfo: 'extern_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      dcpInfoList: { 'type': 'array', 'itemType': DcpInfo },
      externInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListDcpAccountbookRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 请求ID，为32位以内的字母数字组合，由调用方自行生成、保证唯一并留存，以便问题定位。
  outerOrderNo: string;
  // 企业入驻租户ID
  dcpTenantId: string;
  // 扩展信息，预留字段
  externParam?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      outerOrderNo: 'outer_order_no',
      dcpTenantId: 'dcp_tenant_id',
      externParam: 'extern_param',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      outerOrderNo: 'string',
      dcpTenantId: 'string',
      externParam: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListDcpAccountbookResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 请求车队企业关联的所有司机签约信息列表
  signInfoList?: SignInfo[];
  // json格式字符串扩展信息，预留字段。
  externInfo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      signInfoList: 'sign_info_list',
      externInfo: 'extern_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      signInfoList: { 'type': 'array', 'itemType': SignInfo },
      externInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryEtcVehicleRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 请求ID，为32位以内的字母数字组合，由调用方自行生成、保证唯一并留存，以便问题定位。
  outerOrderNo: string;
  // 企业侧车辆编号
  corpVehicleId: string;
  // 车牌号码
  plateNo: string;
  // 车牌颜色，枚举值
  // 蓝: BLUE
  // 黄: YELLOW
  // 黑: BLACK
  // 白: WHITE
  // 绿: GREEN
  plateColor: string;
  // 企业运单号，唯一值
  waybillNo?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      outerOrderNo: 'outer_order_no',
      corpVehicleId: 'corp_vehicle_id',
      plateNo: 'plate_no',
      plateColor: 'plate_color',
      waybillNo: 'waybill_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      outerOrderNo: 'string',
      corpVehicleId: 'string',
      plateNo: 'string',
      plateColor: 'string',
      waybillNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryEtcVehicleResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 请求方租户所关联的车辆入驻信息
  etcVehicle?: EtcVehicleInfo;
  // json格式字符串扩展信息，预留字段。
  externInfo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      etcVehicle: 'etc_vehicle',
      externInfo: 'extern_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      etcVehicle: EtcVehicleInfo,
      externInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UploadEtcWaybillRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 请求ID，为32位以内的字母数字组合，由调用方自行生成、保证唯一并留存，以便问题定位。
  outerOrderNo: string;
  // 企业侧车辆编号
  corpVehicleId: string;
  // 车牌号码
  plateNo: string;
  // 车牌颜色，枚举值
  // 蓝: BLUE
  // 黄: YELLOW
  // 黑: BLACK
  // 白: WHITE
  // 绿: GREEN
  plateColor: string;
  // 企业运单号，唯一值
  waybillNo: string;
  // 企业运单状态，枚举值
  // 进行中: IN_PROGRESS
  // 已完成: COMPLETED
  // 已取消: CANCELED
  waybillStatus: string;
  // 运单开始时间
  // 【必选条件】当传入waybill_status，且waybill_status= IN_PROGRESS时必选
  waybillStartTime?: string;
  // 企业运单结束时间
  // 【必选条件】当传入waybill_status，且waybill_status=COMPLETED时必选
  waybillEndTime?: string;
  // 运单开始地址
  // 【必选条件】当传入waybill_status，且waybill_status= IN_PROGRESS时必选
  waybillStartAddress?: string;
  // 运单结束地址，运单目的地
  // 【必选条件】当传入waybill_status，且waybill_status=COMPLETED时必选
  waybillEndAddress?: string;
  // 运单总费用，单位元，精确到两位小数
  // 【必选条件】当传入waybill_status，且waybill_status=COMPLETED时必选
  waybillFee?: string;
  // 高速通行费用，单位元，精确到两位小数
  highwayFee?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      outerOrderNo: 'outer_order_no',
      corpVehicleId: 'corp_vehicle_id',
      plateNo: 'plate_no',
      plateColor: 'plate_color',
      waybillNo: 'waybill_no',
      waybillStatus: 'waybill_status',
      waybillStartTime: 'waybill_start_time',
      waybillEndTime: 'waybill_end_time',
      waybillStartAddress: 'waybill_start_address',
      waybillEndAddress: 'waybill_end_address',
      waybillFee: 'waybill_fee',
      highwayFee: 'highway_fee',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      outerOrderNo: 'string',
      corpVehicleId: 'string',
      plateNo: 'string',
      plateColor: 'string',
      waybillNo: 'string',
      waybillStatus: 'string',
      waybillStartTime: 'string',
      waybillEndTime: 'string',
      waybillStartAddress: 'string',
      waybillEndAddress: 'string',
      waybillFee: 'string',
      highwayFee: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UploadEtcWaybillResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 运单记录号
  bizId?: string;
  // json格式字符串扩展信息，预留字段。
  externInfo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      bizId: 'biz_id',
      externInfo: 'extern_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      bizId: 'string',
      externInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryEtcTripRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 请求ID，为32位以内的字母数字组合，由调用方自行生成、保证唯一并留存，以便问题定位。
  outerOrderNo: string;
  // 企业侧车辆编号
  corpVehicleId: string;
  // 车牌号码
  plateNo: string;
  // 车牌颜色，蓝: BLUE 黄: YELLOW 黑: BLACK 白: WHITE 绿: GREEN
  plateColor: string;
  // 企业运单号，唯一值
  waybillNo: string;
  // 当前页码
  // 【必选条件】当需要进行按时间段（跨度不超过2天）筛选时需要传入，不传入时默认至多返回最新20条数据
  pageNum?: number;
  // 每页数据条数
  // 【必选条件】当需要进行按时间段（跨度不超过2天）筛选时需要传入，不传入时默认至多返回最新20条数据
  pageSize?: number;
  // 行程查询开始时间
  // 【必选条件】当需要进行按时间段（跨度不超过2天）筛选时需要传入，不传入时默认至多返回最新20条数据
  startTime?: string;
  // 行程查询结束时间
  // 【必选条件】当需要进行按时间段（跨度不超过2天）筛选时需要传入，不传入时默认至多返回最新20条数据
  // 
  endTime?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      outerOrderNo: 'outer_order_no',
      corpVehicleId: 'corp_vehicle_id',
      plateNo: 'plate_no',
      plateColor: 'plate_color',
      waybillNo: 'waybill_no',
      pageNum: 'page_num',
      pageSize: 'page_size',
      startTime: 'start_time',
      endTime: 'end_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      outerOrderNo: 'string',
      corpVehicleId: 'string',
      plateNo: 'string',
      plateColor: 'string',
      waybillNo: 'string',
      pageNum: 'number',
      pageSize: 'number',
      startTime: 'string',
      endTime: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryEtcTripResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 总页数
  totalPage?: number;
  // 总记录数
  totalSize?: number;
  // 当前页码
  // 
  pageNum?: number;
  // 每页条数
  pageSize?: number;
  // 是否还有下一页
  hasNext?: boolean;
  // 请求方租户所关联的行程单据列表
  tripList?: EtcTripInfo[];
  // json格式字符串扩展信息，预留字段。
  externInfo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      totalPage: 'total_page',
      totalSize: 'total_size',
      pageNum: 'page_num',
      pageSize: 'page_size',
      hasNext: 'has_next',
      tripList: 'trip_list',
      externInfo: 'extern_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      totalPage: 'number',
      totalSize: 'number',
      pageNum: 'number',
      pageSize: 'number',
      hasNext: 'boolean',
      tripList: { 'type': 'array', 'itemType': EtcTripInfo },
      externInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class InitSimLoginRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 设备编号
  deviceId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      deviceId: 'device_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      deviceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class InitSimLoginResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 支付宝登录url
  url?: string;
  // 登录token
  token?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      url: 'url',
      token: 'token',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      url: 'string',
      token: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySimLoginRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 设备编号
  deviceId: string;
  // 登录态token
  token?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      deviceId: 'device_id',
      token: 'token',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      deviceId: 'string',
      token: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySimLoginResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 登录结果
  // NO_RESULT：暂无登录结果
  // EXPIRED：token过期
  // ACTIVATE_OK：激活成功，店长首次登录成功
  // LOGIN_OK：登录成功
  // USER_NOT_EXIST：用户不存在
  // STORE_NOT_ACTIVATED：门店未激活
  loginResult?: string;
  // 登录结果中文信息
  loginMsg?: string;
  // 是否已经激活
  activated?: boolean;
  // 激活时间，格式yyyy-MM-dd HH:mm:ss
  activateTime?: string;
  // 登录/激活时间，格式yyyy-MM-dd HH:mm:ss
  loginTime?: string;
  // 当前登录的门店信息
  storeInfo?: SimStoreInfo;
  // 当前登录的销售信息
  salesInfo?: SimSalesInfo;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      loginResult: 'login_result',
      loginMsg: 'login_msg',
      activated: 'activated',
      activateTime: 'activate_time',
      loginTime: 'login_time',
      storeInfo: 'store_info',
      salesInfo: 'sales_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      loginResult: 'string',
      loginMsg: 'string',
      activated: 'boolean',
      activateTime: 'string',
      loginTime: 'string',
      storeInfo: SimStoreInfo,
      salesInfo: SimSalesInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListSimCampaignRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 设备编号
  deviceId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      deviceId: 'device_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      deviceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListSimCampaignResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 营销活动列表
  campaignList?: SimCampaignInfo[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      campaignList: 'campaign_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      campaignList: { 'type': 'array', 'itemType': SimCampaignInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySimSkuRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 设备编号
  deviceId: string;
  // 车辆SN，与skuId二选一
  sn?: string;
  // sku对外id列表，与sn二选一
  skuIdList?: string[];
  // 登录态token
  token: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      deviceId: 'device_id',
      sn: 'sn',
      skuIdList: 'sku_id_list',
      token: 'token',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      deviceId: 'string',
      sn: 'string',
      skuIdList: { 'type': 'array', 'itemType': 'string' },
      token: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySimSkuResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 车辆SKU，如果查无返回空列表
  skuInfoList?: SimSkuInfo[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      skuInfoList: 'sku_info_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      skuInfoList: { 'type': 'array', 'itemType': SimSkuInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListSimSkuRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 设备编号
  deviceId: string;
  // SPU ID
  spuId?: string;
  // 请求的页数
  pageNo: number;
  // 单页项数
  pageSize: number;
  // 登录态token
  token: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      deviceId: 'device_id',
      spuId: 'spu_id',
      pageNo: 'page_no',
      pageSize: 'page_size',
      token: 'token',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      deviceId: 'string',
      spuId: 'string',
      pageNo: 'number',
      pageSize: 'number',
      token: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListSimSkuResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 分页器
  paginator?: Paginator;
  // 车辆SKU列表
  skuInfoList?: SimSkuInfo[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      paginator: 'paginator',
      skuInfoList: 'sku_info_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      paginator: Paginator,
      skuInfoList: { 'type': 'array', 'itemType': SimSkuInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateSimOrderRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 设备编号
  deviceId: string;
  // sku id
  skuId: string;
  // 车辆sn号
  sn?: string;
  // 颜色
  color: string;
  // 登录态token
  token: string;
  // 扩展信息
  extraInfo?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      deviceId: 'device_id',
      skuId: 'sku_id',
      sn: 'sn',
      color: 'color',
      token: 'token',
      extraInfo: 'extra_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      deviceId: 'string',
      skuId: 'string',
      sn: 'string',
      color: 'string',
      token: 'string',
      extraInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateSimOrderResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 订单号
  orderId?: string;
  // 支付宝小程序链接
  miniappLink?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      orderId: 'order_id',
      miniappLink: 'miniapp_link',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      orderId: 'string',
      miniappLink: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySimOrderRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 设备编号
  deviceId: string;
  // 订单号
  orderId: string;
  // 登录态token
  token: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      deviceId: 'device_id',
      orderId: 'order_id',
      token: 'token',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      deviceId: 'string',
      orderId: 'string',
      token: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySimOrderResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 订单信息，如果查无返回空对象
  orderInfo?: SimOrderInfo;
  // 小程序链接
  miniappLink?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      orderInfo: 'order_info',
      miniappLink: 'miniapp_link',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      orderInfo: SimOrderInfo,
      miniappLink: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListSimOrderRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 设备编号
  deviceId: string;
  // 请求的页数
  pageNo: number;
  // 单页项数
  pageSize: number;
  // 登录态token
  token: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      deviceId: 'device_id',
      pageNo: 'page_no',
      pageSize: 'page_size',
      token: 'token',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      deviceId: 'string',
      pageNo: 'number',
      pageSize: 'number',
      token: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListSimOrderResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 分页器
  paginator?: Paginator;
  // 订单信息列表
  orderInfoList?: SimOrderInfo[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      paginator: 'paginator',
      orderInfoList: 'order_info_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      paginator: Paginator,
      orderInfoList: { 'type': 'array', 'itemType': SimOrderInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CancelSimOrderRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 设备编号
  deviceId: string;
  // 订单号
  orderId: string;
  // 登录态token
  token: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      deviceId: 'device_id',
      orderId: 'order_id',
      token: 'token',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      deviceId: 'string',
      orderId: 'string',
      token: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CancelSimOrderResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 是否取消成功
  success?: boolean;
  // 更新后订单信息，如果查无返回空对象
  orderInfo?: SimOrderInfo;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      success: 'success',
      orderInfo: 'order_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      success: 'boolean',
      orderInfo: SimOrderInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PullSimSkuRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 请求的页数
  pageNo: number;
  // 单页项数
  pageSize: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      pageNo: 'page_no',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      pageNo: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PullSimSkuResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 分页器
  paginator?: Paginator;
  // 车辆SKU列表
  skuInfoList?: SimSkuInfo[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      paginator: 'paginator',
      skuInfoList: 'sku_info_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      paginator: Paginator,
      skuInfoList: { 'type': 'array', 'itemType': SimSkuInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ConfirmSimOrderRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 设备id
  deviceId: string;
  // 订单号
  orderId: string;
  // 登录态token
  token: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      deviceId: 'device_id',
      orderId: 'order_id',
      token: 'token',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      deviceId: 'string',
      orderId: 'string',
      token: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ConfirmSimOrderResponse extends $tea.Model {
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

export class UploadSimQrcodeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 设备号
  deviceId: string;
  // 登录态token
  token: string;
  // 车型
  vehicleModel: string;
  // 解析类型
  parseType: string;
  // base64后的图象数据
  base64Data: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      deviceId: 'device_id',
      token: 'token',
      vehicleModel: 'vehicle_model',
      parseType: 'parse_type',
      base64Data: 'base64_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      deviceId: 'string',
      token: 'string',
      vehicleModel: 'string',
      parseType: 'string',
      base64Data: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UploadSimQrcodeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 解析后结果
  parsedContent?: string;
  // 非必填	json字符串，扩展预留
  extraInfo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      parsedContent: 'parsed_content',
      extraInfo: 'extra_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      parsedContent: 'string',
      extraInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySpuListRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 设备编号
  deviceId: string;
  // 请求的页数
  pageNo: number;
  // 单页项数
  pageSize: number;
  // 登录态token
  token: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      deviceId: 'device_id',
      pageNo: 'page_no',
      pageSize: 'page_size',
      token: 'token',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      deviceId: 'string',
      pageNo: 'number',
      pageSize: 'number',
      token: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySpuListResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // SPU信息
  spuInfoList?: SimSpuInfo[];
  // 分页参数
  paginator?: Paginator;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      spuInfoList: 'spu_info_list',
      paginator: 'paginator',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      spuInfoList: { 'type': 'array', 'itemType': SimSpuInfo },
      paginator: Paginator,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryLoginSignRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 设备编号
  deviceId: string;
  // 登录态token
  token: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      deviceId: 'device_id',
      token: 'token',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      deviceId: 'string',
      token: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryLoginSignResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 门店签约信息
  storeInfo?: SimStoreInfo;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      storeInfo: 'store_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      storeInfo: SimStoreInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ResetOrderLinkRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 设备编号
  deviceId: string;
  // 订单号
  orderId: string;
  // 登录态token
  token: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      deviceId: 'device_id',
      orderId: 'order_id',
      token: 'token',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      deviceId: 'string',
      orderId: 'string',
      token: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ResetOrderLinkResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 小程序地址
  miniappLink?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      miniappLink: 'miniapp_link',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      miniappLink: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UploadSimRiskdataRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 设备ID
  deviceId: string;
  // 登录态token
  token: string;
  // 上报类型
  uploadType: string;
  // 智能中控id
  tuid?: string;
  // 中控照片，base64后的图象数据
  tuidPhoto?: string;
  // 车架号
  frameNo?: string;
  // 车架号照片，base64后的图象数据
  frameNoPhoto?: string;
  // 人车合影（销售+用户），base64后的图象数据
  groupPhoto?: string;
  // 单据照片（发票/收据），base64后的图象数据
  billPhoto?: string;
  // 上牌照片，base64后的图象数据
  licensePlatePhoto?: string;
  // 订单ID
  orderId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      deviceId: 'device_id',
      token: 'token',
      uploadType: 'upload_type',
      tuid: 'tuid',
      tuidPhoto: 'tuid_photo',
      frameNo: 'frame_no',
      frameNoPhoto: 'frame_no_photo',
      groupPhoto: 'group_photo',
      billPhoto: 'bill_photo',
      licensePlatePhoto: 'license_plate_photo',
      orderId: 'order_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      deviceId: 'string',
      token: 'string',
      uploadType: 'string',
      tuid: 'string',
      tuidPhoto: 'string',
      frameNo: 'string',
      frameNoPhoto: 'string',
      groupPhoto: 'string',
      billPhoto: 'string',
      licensePlatePhoto: 'string',
      orderId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UploadSimRiskdataResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // json字符串，扩展预留
  extraInfo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      extraInfo: 'extra_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      extraInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDigitalkeyUserinfoRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 联合登录token
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

export class QueryDigitalkeyUserinfoResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 用户ID
  uid?: string;
  // 个人简介
  introduction?: string;
  // 用户昵称
  nickName?: string;
  // 用户头像地址
  avatarUrl?: string;
  // 品牌ID
  brandId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      uid: 'uid',
      introduction: 'introduction',
      nickName: 'nick_name',
      avatarUrl: 'avatar_url',
      brandId: 'brand_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      uid: 'string',
      introduction: 'string',
      nickName: 'string',
      avatarUrl: 'string',
      brandId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateBssecpicRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 应用名
  appName?: string;
  // 客户名
  clientName: string;
  // 操作系统
  osType: string;
  // 包名
  packageName: string;
  // 签名信息
  certSign?: string;
  // 签名秘钥内容
  appKeyData?: string;
  // 加密秘钥内容
  securityData?: string;
  // 自定义秘钥内容
  extraData?: string;
  // 白盒秘钥内容
  whiteBoxData?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      appName: 'app_name',
      clientName: 'client_name',
      osType: 'os_type',
      packageName: 'package_name',
      certSign: 'cert_sign',
      appKeyData: 'app_key_data',
      securityData: 'security_data',
      extraData: 'extra_data',
      whiteBoxData: 'white_box_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      appName: 'string',
      clientName: 'string',
      osType: 'string',
      packageName: 'string',
      certSign: 'string',
      appKeyData: 'string',
      securityData: 'string',
      extraData: 'string',
      whiteBoxData: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateBssecpicResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 是否成功
  success?: boolean;
  // 返回文件名
  fileName?: string;
  // 返回文件的内容base64
  bodyBase64?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      success: 'success',
      fileName: 'file_name',
      bodyBase64: 'body_base64',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      success: 'boolean',
      fileName: 'string',
      bodyBase64: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateBlueshieldSecuritypictureRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 应用名
  appName?: string;
  // 客户名
  clientName: string;
  // 操作系统
  osType: string;
  // 包名
  packageName: string;
  // 签名信息
  certSign?: string;
  // 签名秘钥内容
  appKeyData?: string;
  // 加密秘钥内容
  securityData?: string;
  // 自定义秘钥内容
  extraData?: string;
  // 白盒秘钥内容
  whiteBoxData?: string;
  // raas产品码列表
  raasProducts: string;
  // 直接透传的二级租户，可选
  raasSecondTenant?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      appName: 'app_name',
      clientName: 'client_name',
      osType: 'os_type',
      packageName: 'package_name',
      certSign: 'cert_sign',
      appKeyData: 'app_key_data',
      securityData: 'security_data',
      extraData: 'extra_data',
      whiteBoxData: 'white_box_data',
      raasProducts: 'raas_products',
      raasSecondTenant: 'raas_second_tenant',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      appName: 'string',
      clientName: 'string',
      osType: 'string',
      packageName: 'string',
      certSign: 'string',
      appKeyData: 'string',
      securityData: 'string',
      extraData: 'string',
      whiteBoxData: 'string',
      raasProducts: 'string',
      raasSecondTenant: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateBlueshieldSecuritypictureResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 执行是否成功
  success?: boolean;
  // 生成的图片文件名
  fileName?: string;
  // body base 64
  bodyBase64?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      success: 'success',
      fileName: 'file_name',
      bodyBase64: 'body_base64',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      success: 'boolean',
      fileName: 'string',
      bodyBase64: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryFaceshieldNativeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 客户id，标识客户来源
  clientId: string;
  // 设备token
  apdidToken?: string;
  // 切面数据（JSON，详见下方）
  // {
  // 	"sessionId": "zimId"	//人脸的bizID
  //   "rId": "rId"	//在获取活体方法人脸下发的bisToken
  //   "keyInfoHash": "keyInfoHash"	//关键信息hash
  //   "pictureHash": "人脸图片的hash"	//解密出来的人脸图片做hash
  //   "rData": "xxx"	//客户端在zimInit和zimValidate带上去的业务风险数据
  // }
  aopData?: string;
  // 否（和切面二选一即可）
  signature?: string;
  // 签名因子（和切面二选一即可）
  signFactor?: string;
  // RaaS租户
  raasProducts: string;
  // raas二级租户
  raasSecondTenant?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      clientId: 'client_id',
      apdidToken: 'apdid_token',
      aopData: 'aop_data',
      signature: 'signature',
      signFactor: 'sign_factor',
      raasProducts: 'raas_products',
      raasSecondTenant: 'raas_second_tenant',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      clientId: 'string',
      apdidToken: 'string',
      aopData: 'string',
      signature: 'string',
      signFactor: 'string',
      raasProducts: 'string',
      raasSecondTenant: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryFaceshieldNativeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // true成功，false失败
  success?: boolean;
  // 请求码，200成功，其他失败，具体见错误码
  code?: number;
  // 错误时的返回信息
  message?: string;
  // 请求时传入的，若没有传，则系统自动生成
  requestId?: string;
  // apdidToken	String	设备token
  // riskLevel	String	风险等级，-1参数异常，0无风险，1-3表示低、中、高
  // riskDesc	String	风险描述，对风险等级的补充
  // sugAction	String	处理的建议，如PAAS
  data?: FaceShieldResult;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      success: 'success',
      code: 'code',
      message: 'message',
      requestId: 'request_id',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      success: 'boolean',
      code: 'number',
      message: 'string',
      requestId: 'string',
      data: FaceShieldResult,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryFaceshieldWebRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 客户id，标识客户来源
  clientId: string;
  // 设备token
  apdidToken?: string;
  // 切面数据（JSON，详见下方）
  aopData?: string;
  // RaaS租户
  // 
  raasProducts: string;
  // raas二级租户
  // 
  raasSecondTenant?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      clientId: 'client_id',
      apdidToken: 'apdid_token',
      aopData: 'aop_data',
      raasProducts: 'raas_products',
      raasSecondTenant: 'raas_second_tenant',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      clientId: 'string',
      apdidToken: 'string',
      aopData: 'string',
      raasProducts: 'string',
      raasSecondTenant: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryFaceshieldWebResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // true成功，false失败	
  // 
  success?: boolean;
  // 请求码，200成功，其他失败，具体见错误码
  // 
  code?: number;
  // 错误时的返回信息
  // 
  message?: string;
  // 请求时传入的，若没有传，则系统自动生成
  // 
  requestId?: string;
  // apdidToken String 设备token riskLevel String 风险等级，-1参数异常，0无风险，1-3表示低、中、高 riskDesc String 风险描述，对风险等级的补充 sugAction String 处理的建议，如PAAS
  data?: FaceShieldResult;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      success: 'success',
      code: 'code',
      message: 'message',
      requestId: 'request_id',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      success: 'boolean',
      code: 'number',
      message: 'string',
      requestId: 'string',
      data: FaceShieldResult,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class InitIifaaDeviceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 产商code
  corpCode: string;
  // 设备类型
  deviceType: string;
  // 设备信息
  deviceInfo: string;
  // 产品code
  productCode: string;
  // 用于加密回传数据的公钥
  pubKey?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      corpCode: 'corp_code',
      deviceType: 'device_type',
      deviceInfo: 'device_info',
      productCode: 'product_code',
      pubKey: 'pub_key',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      corpCode: 'string',
      deviceType: 'string',
      deviceInfo: 'string',
      productCode: 'string',
      pubKey: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class InitIifaaDeviceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回数据
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

export class RecognizeIifaaDeviceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 设备唯一ID
  tuid: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tuid: 'tuid',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tuid: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RecognizeIifaaDeviceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回数据内容
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

export class VerifyIifaaDeviceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 待验证的数据
  cipherText: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      cipherText: 'cipher_text',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      cipherText: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class VerifyIifaaDeviceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 验证结果
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

export class RegisterIifaaCorpRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 产商code
  corpCode: string;
  // 产商名称
  corpName: string;
  // 产商签约code
  productCode: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      corpCode: 'corp_code',
      corpName: 'corp_name',
      productCode: 'product_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      corpCode: 'string',
      corpName: 'string',
      productCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RegisterIifaaCorpResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 产商注册结果
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

export class DeprecateIifaaDeviceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 设备唯一ID
  tuid: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tuid: 'tuid',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tuid: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeprecateIifaaDeviceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 设备擦除结果
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

export class RunXhunterSpiRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // json
  request: string;
  // XHUNTER_ISV_STANDARD
  serviceName: string;
  // json
  extInfo?: string;
  // raas_products
  raasProducts: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      request: 'request',
      serviceName: 'service_name',
      extInfo: 'ext_info',
      raasProducts: 'raas_products',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      request: 'string',
      serviceName: 'string',
      extInfo: 'string',
      raasProducts: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RunXhunterSpiResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // response
  response?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      response: 'response',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      response: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecIifaaInsureRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 保险信息list的jsonStr
  insureInfoListStr: string;
  // 对insure_info_list_str的签名，使用十六进制字符串编码
  signature: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      insureInfoListStr: 'insure_info_list_str',
      signature: 'signature',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      insureInfoListStr: 'string',
      signature: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecIifaaInsureResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 投保结果list的jsonStr
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

export class QueryCctPictureRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // InfoSecAnalyzeSyncContent json
  request: string;
  // RaaS产品码
  raasProducts: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      request: 'request',
      raasProducts: 'raas_products',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      request: 'string',
      raasProducts: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCctPictureResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // InfoSecAnalyzeSyncContent json
  response?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      response: 'response',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      response: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RecognizeCctAnalyzeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // channel
  channel: string;
  // content_type
  contentType: string;
  // user_id
  userId: string;
  // request_id
  requestId: string;
  // data_map
  dataMap: CctDataMap;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      channel: 'channel',
      contentType: 'content_type',
      userId: 'user_id',
      requestId: 'request_id',
      dataMap: 'data_map',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      channel: 'string',
      contentType: 'string',
      userId: 'string',
      requestId: 'string',
      dataMap: CctDataMap,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RecognizeCctAnalyzeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // biz_request_id
  bizRequestId?: string;
  // suggestion
  suggestion?: string;
  // detect_labels
  detectLabels?: CctDetectCheckLabel[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      bizRequestId: 'biz_request_id',
      suggestion: 'suggestion',
      detectLabels: 'detect_labels',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      bizRequestId: 'string',
      suggestion: 'string',
      detectLabels: { 'type': 'array', 'itemType': CctDetectCheckLabel },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRiskGeneralRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // x
  dataCode: string;
  // AES加密使用的随机数，对该随机数使用RaaS数据服务的公钥进行加密，随后传入；
  encryptedNonce: string;
  // ISV的终端客户编码、征信机构的终端客户编码、公司内部部门ID，可以定制数据输出。
  customerId?: string;
  // 业务请求入参，兼容批量调用
  bizQueryParams: BizQueryParam[];
  // 拓展输入字段,
  extData?: string;
  // 用于标记是否获得用户授权。
  // 1:获得授权（默认）
  // 0:未获得授权
  userAuthorization: string;
  // 默认AES128，后续可选SM2等国密
  encryptMethod?: string;
  // 整个包体加密，二选一
  encryptedBody?: string;
  // hash_type
  hashType?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      dataCode: 'data_code',
      encryptedNonce: 'encrypted_nonce',
      customerId: 'customer_id',
      bizQueryParams: 'biz_query_params',
      extData: 'ext_data',
      userAuthorization: 'user_authorization',
      encryptMethod: 'encrypt_method',
      encryptedBody: 'encrypted_body',
      hashType: 'hash_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      dataCode: 'string',
      encryptedNonce: 'string',
      customerId: 'string',
      bizQueryParams: { 'type': 'array', 'itemType': BizQueryParam },
      extData: 'string',
      userAuthorization: 'string',
      encryptMethod: 'string',
      encryptedBody: 'string',
      hashType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRiskGeneralResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 是否计费
  meter?: boolean;
  // 批量调用情况下的计费数量
  meterCount?: number;
  // 风险咨询结果的批量查询结果
  resultList?: ResultList[];
  // 拓展输出字段
  extData?: string;
  // 是否查得
  found?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      meter: 'meter',
      meterCount: 'meter_count',
      resultList: 'result_list',
      extData: 'ext_data',
      found: 'found',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      meter: 'boolean',
      meterCount: 'number',
      resultList: { 'type': 'array', 'itemType': ResultList },
      extData: 'string',
      found: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDeviceriskFingerRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // apdid_token
  apdidToken: string;
  // client_id
  clientId?: string;
  // terminal_type
  terminalType?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      apdidToken: 'apdid_token',
      clientId: 'client_id',
      terminalType: 'terminal_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      apdidToken: 'string',
      clientId: 'string',
      terminalType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDeviceriskFingerResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // code
  code?: number;
  // message
  message?: string;
  // request_id
  requestId?: string;
  // success
  success?: boolean;
  // data
  data?: DeviceRiskResp;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      message: 'message',
      requestId: 'request_id',
      success: 'success',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'number',
      message: 'string',
      requestId: 'string',
      success: 'boolean',
      data: DeviceRiskResp,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDeviceriskRisklabelRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // apdid_token
  apdidToken: string;
  // client_id	
  clientId?: string;
  // terminal_type
  terminalType?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      apdidToken: 'apdid_token',
      clientId: 'client_id',
      terminalType: 'terminal_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      apdidToken: 'string',
      clientId: 'string',
      terminalType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDeviceriskRisklabelResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // code
  code?: number;
  // message
  message?: string;
  // request_id
  requestId?: string;
  // success
  success?: boolean;
  // data
  data?: DeviceRiskResp;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      message: 'message',
      requestId: 'request_id',
      success: 'success',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'number',
      message: 'string',
      requestId: 'string',
      success: 'boolean',
      data: DeviceRiskResp,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDeviceriskDeviceriskRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // apdid_token
  apdidToken: string;
  // client_id
  clientId?: string;
  // app_id
  appId?: string;
  // env_id
  envId?: string;
  // tenant_id
  tenantId?: string;
  // merchant_id
  merchantId?: string;
  // app_name
  appName?: string;
  // terminal_type
  terminalType?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      apdidToken: 'apdid_token',
      clientId: 'client_id',
      appId: 'app_id',
      envId: 'env_id',
      tenantId: 'tenant_id',
      merchantId: 'merchant_id',
      appName: 'app_name',
      terminalType: 'terminal_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      apdidToken: 'string',
      clientId: 'string',
      appId: 'string',
      envId: 'string',
      tenantId: 'string',
      merchantId: 'string',
      appName: 'string',
      terminalType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDeviceriskDeviceriskResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // code
  code?: number;
  // message
  message?: string;
  // request_id
  requestId?: string;
  // success
  success?: boolean;
  // data
  data?: DeviceRiskResp;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      message: 'message',
      requestId: 'request_id',
      success: 'success',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'number',
      message: 'string',
      requestId: 'string',
      success: 'boolean',
      data: DeviceRiskResp,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SubmitDeviceriskReportRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // request_data
  requestData: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      requestData: 'request_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      requestData: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SubmitDeviceriskReportResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // success
  success?: boolean;
  // apdid
  apdid?: string;
  // token
  token?: string;
  // current_time
  currentTime?: string;
  // version
  version?: string;
  // vkey_switch
  vkeySwitch?: string;
  // bug_track_switch
  bugTrackSwitch?: string;
  // app_list_ver
  appListVer?: string;
  // dynamic_key
  dynamicKey?: string;
  // result_data
  resultData?: DeviceRiskReportResultData;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      success: 'success',
      apdid: 'apdid',
      token: 'token',
      currentTime: 'current_time',
      version: 'version',
      vkeySwitch: 'vkey_switch',
      bugTrackSwitch: 'bug_track_switch',
      appListVer: 'app_list_ver',
      dynamicKey: 'dynamic_key',
      resultData: 'result_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      success: 'boolean',
      apdid: 'string',
      token: 'string',
      currentTime: 'string',
      version: 'string',
      vkeySwitch: 'string',
      bugTrackSwitch: 'string',
      appListVer: 'string',
      dynamicKey: 'string',
      resultData: DeviceRiskReportResultData,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryEkytDriverRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 接口请求head
  head: RequestHead;
  // 请求业务参数，加密之后的密文信息
  request: string;
  // 请求数据签名值
  signature: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      head: 'head',
      request: 'request',
      signature: 'signature',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      head: RequestHead,
      request: 'string',
      signature: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryEkytDriverResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 接口响应结果
  success?: boolean;
  // 接口响应描述
  message?: string;
  // 接口响应数据
  data?: IifaaEkytResponse;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      success: 'success',
      message: 'message',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      success: 'boolean',
      message: 'string',
      data: IifaaEkytResponse,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyIifaaDevicekeyRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 请求头
  head: RequestHead;
  // 业务参数
  request: string;
  // 签名
  signature: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      head: 'head',
      request: 'request',
      signature: 'signature',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      head: RequestHead,
      request: 'string',
      signature: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyIifaaDevicekeyResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 响应结果
  success?: boolean;
  // 结果描述
  message?: string;
  // 业务响应结果
  data?: IifaaEkytResponse;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      success: 'success',
      message: 'message',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      success: 'boolean',
      message: 'string',
      data: IifaaEkytResponse,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDeviceplusRiskqueryRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 客户id
  clientId: string;
  // 场景码
  sceneCode: string;
  // 加密电话号码
  phoneNumber: string;
  // 电话号码加密类型, 明文: 0; MD5加密: 1; SHA256: 2
  phoneNumberType: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      clientId: 'client_id',
      sceneCode: 'scene_code',
      phoneNumber: 'phone_number',
      phoneNumberType: 'phone_number_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      clientId: 'string',
      sceneCode: 'string',
      phoneNumber: 'string',
      phoneNumberType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDeviceplusRiskqueryResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 是否成功
  success?: boolean;
  // 返回码
  code?: number;
  // 返回信息
  message?: string;
  // 供nearx排查的链路业务请求id
  requestId?: string;
  // 风险咨询信息
  data?: RiskQueryData;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      success: 'success',
      code: 'code',
      message: 'message',
      requestId: 'request_id',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      success: 'boolean',
      code: 'number',
      message: 'string',
      requestId: 'string',
      data: RiskQueryData,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDeviceplusMpaasRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 评分模型id
  modelId: string;
  // mpaas环境id
  workspaceId: string;
  // mpaas应用id
  appId: string;
  // 场景码
  sceneCode: string;
  // 加密电话号码
  phoneNumber: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      modelId: 'model_id',
      workspaceId: 'workspace_id',
      appId: 'app_id',
      sceneCode: 'scene_code',
      phoneNumber: 'phone_number',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      modelId: 'string',
      workspaceId: 'string',
      appId: 'string',
      sceneCode: 'string',
      phoneNumber: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDeviceplusMpaasResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 是否成功
  success?: boolean;
  // 返回码
  code?: number;
  // 返回信息
  message?: string;
  // 供nearx排查的链路业务请求id
  requestId?: string;
  // 风险咨询信息
  data?: RiskQueryData;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      success: 'success',
      code: 'code',
      message: 'message',
      requestId: 'request_id',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      success: 'boolean',
      code: 'number',
      message: 'string',
      requestId: 'string',
      data: RiskQueryData,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SubmitAshieldPeriodhardeningtaskRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // APK,ABB 上传后的地址
  fileUrl: string;
  // 开启so加固
  soProtect?: string;
  // 开启so加固后,设置的so加固配置文件,默认对apk中libs目录下所有so进行加固,以逗号分隔
  soProtectConfig?: string;
  // 开启对assets下的资源文件进行加固
  assetsProtect?: string;
  // 开启assets加固后,指定要对apk中assets目录下的哪些文件做加固,默认对assets下所有的文件进行保护,以逗号分隔
  assetsProtectConfing?: string;
  // 开启运行时保护,需要填写的参数,具体参数见下方,json格式
  runtimeProtectConfig?: RuntimeProtectConfig;
  // 对生命周期函数进行java2jni保护
  enableLifeFunc?: string;
  // java2jni配置文件
  javatocJniConfig?: ClassMethodConfig[];
  // 扩展信息,json字符串,暂不使用
  extInfo?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      fileUrl: 'file_url',
      soProtect: 'so_protect',
      soProtectConfig: 'so_protect_config',
      assetsProtect: 'assets_protect',
      assetsProtectConfing: 'assets_protect_confing',
      runtimeProtectConfig: 'runtime_protect_config',
      enableLifeFunc: 'enable_life_func',
      javatocJniConfig: 'javatoc_jni_config',
      extInfo: 'ext_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      fileUrl: 'string',
      soProtect: 'string',
      soProtectConfig: 'string',
      assetsProtect: 'string',
      assetsProtectConfing: 'string',
      runtimeProtectConfig: RuntimeProtectConfig,
      enableLifeFunc: 'string',
      javatocJniConfig: { 'type': 'array', 'itemType': ClassMethodConfig },
      extInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SubmitAshieldPeriodhardeningtaskResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 请求id
  requestId?: string;
  // 查询是否成功
  resSuccess?: boolean;
  // SUCCESS为成功,其他为失败
  resCode?: string;
  // 返回信息描述
  resMessage?: string;
  // 返回的具体对象
  resData?: HardeningTaskResponse;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      requestId: 'request_id',
      resSuccess: 'res_success',
      resCode: 'res_code',
      resMessage: 'res_message',
      resData: 'res_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      requestId: 'string',
      resSuccess: 'boolean',
      resCode: 'string',
      resMessage: 'string',
      resData: HardeningTaskResponse,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetAshieldFiletokenRequest extends $tea.Model {
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

export class GetAshieldFiletokenResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // .
  requestId?: string;
  // res_success
  resSuccess?: boolean;
  // res_code
  resCode?: string;
  // res_message
  resMessage?: string;
  // .
  resData?: FileTokenForUpload;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      requestId: 'request_id',
      resSuccess: 'res_success',
      resCode: 'res_code',
      resMessage: 'res_message',
      resData: 'res_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      requestId: 'string',
      resSuccess: 'boolean',
      resCode: 'string',
      resMessage: 'string',
      resData: FileTokenForUpload,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SubmitAshieldHardeningtaskRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // APK,ABB 上传后的地址
  fileUrl: string;
  // 开启so加固
  soProtect?: string;
  // 开启so加固后,设置的so加固配置文件,默认对apk中libs目录下所有so进行加固,以逗号分隔
  soProtectConfig?: string;
  // 开启对assets下的资源文件进行加固
  assetsProtect?: string;
  // 开启assets加固后,指定要对apk中assets目录下的哪些文件做加固,默认对assets下所有的文件进行保护,以逗号分隔
  assetsProtectConfing?: string;
  // 开启运行时保护,需要填写的参数,具体参数见下方,json格式
  runtimeProtectConfig?: RuntimeProtectConfig;
  // 对生命周期函数进行java2jni保护
  enableLifeFunc?: string;
  // java2jni配置文件
  javatocJniConfig?: ClassMethodConfig[];
  // 扩展信息,json字符串,暂不使用
  extInfo?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      fileUrl: 'file_url',
      soProtect: 'so_protect',
      soProtectConfig: 'so_protect_config',
      assetsProtect: 'assets_protect',
      assetsProtectConfing: 'assets_protect_confing',
      runtimeProtectConfig: 'runtime_protect_config',
      enableLifeFunc: 'enable_life_func',
      javatocJniConfig: 'javatoc_jni_config',
      extInfo: 'ext_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      fileUrl: 'string',
      soProtect: 'string',
      soProtectConfig: 'string',
      assetsProtect: 'string',
      assetsProtectConfing: 'string',
      runtimeProtectConfig: RuntimeProtectConfig,
      enableLifeFunc: 'string',
      javatocJniConfig: { 'type': 'array', 'itemType': ClassMethodConfig },
      extInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SubmitAshieldHardeningtaskResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 请求id
  requestId?: string;
  // 查询是否成功
  resSuccess?: boolean;
  // SUCCESS为成功,其他为失败
  resCode?: string;
  // 返回信息描述
  resMessage?: string;
  // 返回的具体对象
  resData?: HardeningTaskResponse;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      requestId: 'request_id',
      resSuccess: 'res_success',
      resCode: 'res_code',
      resMessage: 'res_message',
      resData: 'res_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      requestId: 'string',
      resSuccess: 'boolean',
      resCode: 'string',
      resMessage: 'string',
      resData: HardeningTaskResponse,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetAshieldHardeningtaskprocessRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 加固任务 ID
  taskId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      taskId: 'task_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      taskId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetAshieldHardeningtaskprocessResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 请求id
  requestId?: string;
  // 查询是否成功
  resSuccess?: boolean;
  // SUCCESS为成功，其他为失败
  resCode?: string;
  // 返回信息描述
  resMessage?: string;
  // 返回的具体对象
  resData?: HardeningTaskResponse;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      requestId: 'request_id',
      resSuccess: 'res_success',
      resCode: 'res_code',
      resMessage: 'res_message',
      resData: 'res_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      requestId: 'string',
      resSuccess: 'boolean',
      resCode: 'string',
      resMessage: 'string',
      resData: HardeningTaskResponse,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetAshieldHardeningresultRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 加固任务 ID
  taskId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      taskId: 'task_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      taskId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetAshieldHardeningresultResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 请求id
  requestId?: string;
  // 查询是否成功
  resSuccess?: boolean;
  // SUCCESS为成功，其他为失败
  resCode?: string;
  // 返回信息描述
  resMessage?: string;
  // 返回的下载链接
  resData?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      requestId: 'request_id',
      resSuccess: 'res_success',
      resCode: 'res_code',
      resMessage: 'res_message',
      resData: 'res_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      requestId: 'string',
      resSuccess: 'boolean',
      resCode: 'string',
      resMessage: 'string',
      resData: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetAshieldHardeninglogRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 加固任务 ID
  taskId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      taskId: 'task_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      taskId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetAshieldHardeninglogResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 请求id
  requestId?: string;
  // 查询是否成功
  resSuccess?: boolean;
  // SUCCESS为成功，其他为失败
  resCode?: string;
  // 返回信息描述
  resMessage?: string;
  // 返回的下载链接
  resData?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      requestId: 'request_id',
      resSuccess: 'res_success',
      resCode: 'res_code',
      resMessage: 'res_message',
      resData: 'res_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      requestId: 'string',
      resSuccess: 'boolean',
      resCode: 'string',
      resMessage: 'string',
      resData: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class InitEkytTrustsignRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 请求头
  head: RequestHead;
  // 签约用户信息
  signUser: string;
  // 控件key-value
  rectId?: string;
  // 签约方案码
  solutionCode: string;
  // 发起签约的外部流水号
  outOrderNo: string;
  // 小程序appId
  appId: string;
  // 用户授权标识
  userAuthorization: string;
  // 扩展信息
  extInfo?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      head: 'head',
      signUser: 'sign_user',
      rectId: 'rect_id',
      solutionCode: 'solution_code',
      outOrderNo: 'out_order_no',
      appId: 'app_id',
      userAuthorization: 'user_authorization',
      extInfo: 'ext_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      head: RequestHead,
      signUser: 'string',
      rectId: 'string',
      solutionCode: 'string',
      outOrderNo: 'string',
      appId: 'string',
      userAuthorization: 'string',
      extInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class InitEkytTrustsignResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 响应结果
  success?: boolean;
  // 结果描述
  message?: string;
  // 可信签约初始化数据
  data?: TrustSignInitData;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      success: 'success',
      message: 'message',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      success: 'boolean',
      message: 'string',
      data: TrustSignInitData,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryEkytTrustsignRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 请求头
  head: RequestHead;
  // 小程序appId
  appId: string;
  // 发起签约的外部流水号
  outOrderNo: string;
  // 签约方案码
  solutionCode: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      head: 'head',
      appId: 'app_id',
      outOrderNo: 'out_order_no',
      solutionCode: 'solution_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      head: RequestHead,
      appId: 'string',
      outOrderNo: 'string',
      solutionCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryEkytTrustsignResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 响应结果
  success?: boolean;
  // 结果描述
  message?: string;
  // 可信签约签约单数据
  data?: TrustSignQueryData;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      success: 'success',
      message: 'message',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      success: 'boolean',
      message: 'string',
      data: TrustSignQueryData,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class InitEkytFaceverifyRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 请求头
  head: RequestHead;
  // 姓名
  certName: string;
  // 身份证号
  certNo: string;
  // 加密方式；0：明文；1：RSA；2：SM2
  encType?: string;
  // 商户请求的唯一标识
  outerOrderNo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      head: 'head',
      certName: 'cert_name',
      certNo: 'cert_no',
      encType: 'enc_type',
      outerOrderNo: 'outer_order_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      head: RequestHead,
      certName: 'string',
      certNo: 'string',
      encType: 'string',
      outerOrderNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class InitEkytFaceverifyResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 响应结果
  success?: boolean;
  // 结果描述
  message?: string;
  // 人脸核身初始化数据
  data?: FaceVerifyInitData;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      success: 'success',
      message: 'message',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      success: 'boolean',
      message: 'string',
      data: FaceVerifyInitData,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryEkytFaceverifyRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 请求头
  head: RequestHead;
  // 可信实人认证的唯一标识
  certifyId: string;
  // 商户请求的唯一标识
  outerOrderNo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      head: 'head',
      certifyId: 'certify_id',
      outerOrderNo: 'outer_order_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      head: RequestHead,
      certifyId: 'string',
      outerOrderNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryEkytFaceverifyResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 响应结果
  success?: boolean;
  // 结果描述
  message?: string;
  // 人脸核身结果数据
  data?: FaceVerifyResultData;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      success: 'success',
      message: 'message',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      success: 'boolean',
      message: 'string',
      data: FaceVerifyResultData,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ImportYhllRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // shopUuid
  shopUuid: string;
  // 名称
  name: string;
  // 描述
  description: string;
  // 任务类型
  goodType: string;
  // 模板名
  templateName: string;
  // 行业
  industry: string;
  // 地址
  address: string;
  // 城市代码
  cityCode: string;
  // 经度
  longitude?: string;
  // 纬度
  latitude?: string;
  // 坐标范围
  coordinateRange?: string;
  // 总量
  total: number;
  // 模板替换符
  placeHolder?: string;
  // 补充信息
  extInfo?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      shopUuid: 'shop_uuid',
      name: 'name',
      description: 'description',
      goodType: 'good_type',
      templateName: 'template_name',
      industry: 'industry',
      address: 'address',
      cityCode: 'city_code',
      longitude: 'longitude',
      latitude: 'latitude',
      coordinateRange: 'coordinate_range',
      total: 'total',
      placeHolder: 'place_holder',
      extInfo: 'ext_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      shopUuid: 'string',
      name: 'string',
      description: 'string',
      goodType: 'string',
      templateName: 'string',
      industry: 'string',
      address: 'string',
      cityCode: 'string',
      longitude: 'string',
      latitude: 'string',
      coordinateRange: 'string',
      total: 'number',
      placeHolder: 'string',
      extInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ImportYhllResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // uuid
  uuid?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      uuid: 'uuid',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      uuid: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryYhllRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 城市编码
  cityCode: string;
  // uuid
  uuid: string;
  // page size
  pageSize?: number;
  // page number
  pageNum?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      cityCode: 'city_code',
      uuid: 'uuid',
      pageSize: 'page_size',
      pageNum: 'page_num',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      cityCode: 'string',
      uuid: 'string',
      pageSize: 'number',
      pageNum: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryYhllResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // total
  total?: number;
  // open_task_result_list
  openTaskResultList?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      total: 'total',
      openTaskResultList: 'open_task_result_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      total: 'number',
      openTaskResultList: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryGuardAskRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 会话ID，用于匹配多轮对话上下文
  sessionId: string;
  // 数据唯一标识，能够根据该值定位到该条数据
  requestId: string;
  // serviceCode
  serviceCode: string;
  // 当前提问内容，最大长度10000个字符。
  question: string;
  // 提问内容类型，纯文本: PLAINTEXT，图片url: PICTURE_URL
  questionFormat?: string;
  // scene_code
  sceneCode?: string;
  // app_code
  appCode?: string;
  // raas_products
  raasProducts?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      sessionId: 'session_id',
      requestId: 'request_id',
      serviceCode: 'service_code',
      question: 'question',
      questionFormat: 'question_format',
      sceneCode: 'scene_code',
      appCode: 'app_code',
      raasProducts: 'raas_products',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      sessionId: 'string',
      requestId: 'string',
      serviceCode: 'string',
      question: 'string',
      questionFormat: 'string',
      sceneCode: 'string',
      appCode: 'string',
      raasProducts: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryGuardAskResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 检测数据ID
  requestId?: string;
  // 是否安全无风险，true: 安全无风险，false: 有风险
  safe?: boolean;
  // 安全动作，拦截: BLOCK，安全代答: SECURITY_ANSWER，红色GPT安全代答: REDGPT_ANSWER，安全提示增强: SECURITY_PROMPT
  actionCode?: string;
  // 安全动作相关文案
  actionMsg?: string;
  // 会话动作，终止会话: END_SESSION，撤回提问: RECALL_QUERY
  sessionAction?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      requestId: 'request_id',
      safe: 'safe',
      actionCode: 'action_code',
      actionMsg: 'action_msg',
      sessionAction: 'session_action',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      requestId: 'string',
      safe: 'boolean',
      actionCode: 'string',
      actionMsg: 'string',
      sessionAction: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryGuardAnswerRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 会话ID，用于匹配多轮对话上下文
  sessionId: string;
  // 数据唯一标识，能够根据该值定位到该条数据
  requestId: string;
  // service_code
  serviceCode: string;
  // 作为一个人工智能语言模型，我还没有学习到相关信息，不过我觉得梦里啥都有，建议您保持充分的睡眠。
  answer: string;
  // 作为一个解梦者，你的任务是解释以下梦境:[上证30000点，没错，是三万不是三千]。根据梦中出现的符号和主题，请提供一份客观且基于事实的解释。
  question?: string;
  // 纯文本: PLAINTEXT，图片url: PICTURE_URL
  questionFormat?: string;
  // 纯文本: PLAINTEXT
  // 图片url: PICTURE_URL
  answerFormat?: string;
  // scene_code
  sceneCode?: string;
  // app_code
  appCode?: string;
  // raas_products
  raasProducts?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      sessionId: 'session_id',
      requestId: 'request_id',
      serviceCode: 'service_code',
      answer: 'answer',
      question: 'question',
      questionFormat: 'question_format',
      answerFormat: 'answer_format',
      sceneCode: 'scene_code',
      appCode: 'app_code',
      raasProducts: 'raas_products',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      sessionId: 'string',
      requestId: 'string',
      serviceCode: 'string',
      answer: 'string',
      question: 'string',
      questionFormat: 'string',
      answerFormat: 'string',
      sceneCode: 'string',
      appCode: 'string',
      raasProducts: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryGuardAnswerResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 检测数据ID
  requestId?: string;
  // 是否安全无风险
  safe?: boolean;
  // 拦截: BLOCK
  // 安全代答: SECURITY_ANSWER
  // 红色GPT安全代答: REDGPT_ANSWER
  // 回答里补充安全提示: SECURITY_TIP
  actionCode?: string;
  // 安全提示增强的文案、安全代答的回答、回答里补充的安全提示
  actionMsg?: string;
  // 终止会话: END_SESSION
  // 撤回提问: RECALL_QUERY
  sessionAction?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      requestId: 'request_id',
      safe: 'safe',
      actionCode: 'action_code',
      actionMsg: 'action_msg',
      sessionAction: 'session_action',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      requestId: 'string',
      safe: 'boolean',
      actionCode: 'string',
      actionMsg: 'string',
      sessionAction: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteIifaaDigitalkeyRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 请求头
  head: RequestHead;
  // 业务参数
  request: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      head: 'head',
      request: 'request',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      head: RequestHead,
      request: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteIifaaDigitalkeyResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回值
  data?: boolean;
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
      data: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckOpticalIdentifyRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // json数据，包含tenantId,sceneId,outBizId,fakeType,certType
  reservedData: string;
  // 图片链接,image_url和image_content 2选1优先选择image_content
  imageUrl?: string;
  // base64编码的图片,image_url和image_content 2选1，优先选择image_content
  imageContent?: string;
  // raas产品码
  raasProducts: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      reservedData: 'reserved_data',
      imageUrl: 'image_url',
      imageContent: 'image_content',
      raasProducts: 'raas_products',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      reservedData: 'string',
      imageUrl: 'string',
      imageContent: 'string',
      raasProducts: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckOpticalIdentifyResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 光鉴智能凭证响应结果
  data?: IdentityData;
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
      data: IdentityData,
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
          sdk_version: "1.4.19",
          _prod_code: "SECURITYTECH",
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
   * Description: 安全科技网关通用运行接口
   * Summary: 安全科技网关通用运行接口
   */
  async runGeneral(request: RunGeneralRequest): Promise<RunGeneralResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.runGeneralEx(request, headers, runtime);
  }

  /**
   * Description: 安全科技网关通用运行接口
   * Summary: 安全科技网关通用运行接口
   */
  async runGeneralEx(request: RunGeneralRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<RunGeneralResponse> {
    Util.validateModel(request);
    return $tea.cast<RunGeneralResponse>(await this.doRequest("1.0", "antsecuritytech.gateway.general.run", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new RunGeneralResponse({}));
  }

  /**
   * Description: 租赁住房保险产品，开放接口
  调用方：上海远点网络科技有限公司
   * Summary: 租赁住房保险产品，接口开放给租房平台
   */
  async execEkytInsure(request: ExecEkytInsureRequest): Promise<ExecEkytInsureResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.execEkytInsureEx(request, headers, runtime);
  }

  /**
   * Description: 租赁住房保险产品，开放接口
  调用方：上海远点网络科技有限公司
   * Summary: 租赁住房保险产品，接口开放给租房平台
   */
  async execEkytInsureEx(request: ExecEkytInsureRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExecEkytInsureResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecEkytInsureResponse>(await this.doRequest("1.0", "antsecuritytech.gateway.ekyt.insure.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExecEkytInsureResponse({}));
  }

  /**
   * Description: 获取EKYT平台入驻的车队信息列表
   * Summary: 获取EKYT平台入驻的车队信息列表
   */
  async listDcp(request: ListDcpRequest): Promise<ListDcpResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listDcpEx(request, headers, runtime);
  }

  /**
   * Description: 获取EKYT平台入驻的车队信息列表
   * Summary: 获取EKYT平台入驻的车队信息列表
   */
  async listDcpEx(request: ListDcpRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListDcpResponse> {
    Util.validateModel(request);
    return $tea.cast<ListDcpResponse>(await this.doRequest("1.0", "antsecuritytech.gateway.dcp.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListDcpResponse({}));
  }

  /**
   * Description: 获取EKYT平台入驻的司机灵工卡信息列表
   * Summary: 获取EKYT平台入驻的司机灵工卡信息列表
   */
  async listDcpAccountbook(request: ListDcpAccountbookRequest): Promise<ListDcpAccountbookResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listDcpAccountbookEx(request, headers, runtime);
  }

  /**
   * Description: 获取EKYT平台入驻的司机灵工卡信息列表
   * Summary: 获取EKYT平台入驻的司机灵工卡信息列表
   */
  async listDcpAccountbookEx(request: ListDcpAccountbookRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListDcpAccountbookResponse> {
    Util.validateModel(request);
    return $tea.cast<ListDcpAccountbookResponse>(await this.doRequest("1.0", "antsecuritytech.gateway.dcp.accountbook.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListDcpAccountbookResponse({}));
  }

  /**
   * Description: 企业ETC入驻车辆查询
   * Summary: 企业ETC入驻车辆查询
   */
  async queryEtcVehicle(request: QueryEtcVehicleRequest): Promise<QueryEtcVehicleResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryEtcVehicleEx(request, headers, runtime);
  }

  /**
   * Description: 企业ETC入驻车辆查询
   * Summary: 企业ETC入驻车辆查询
   */
  async queryEtcVehicleEx(request: QueryEtcVehicleRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryEtcVehicleResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryEtcVehicleResponse>(await this.doRequest("1.0", "antsecuritytech.gateway.etc.vehicle.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryEtcVehicleResponse({}));
  }

  /**
   * Description: 企业ETC运单上传
   * Summary: 企业ETC运单上传
   */
  async uploadEtcWaybill(request: UploadEtcWaybillRequest): Promise<UploadEtcWaybillResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.uploadEtcWaybillEx(request, headers, runtime);
  }

  /**
   * Description: 企业ETC运单上传
   * Summary: 企业ETC运单上传
   */
  async uploadEtcWaybillEx(request: UploadEtcWaybillRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UploadEtcWaybillResponse> {
    Util.validateModel(request);
    return $tea.cast<UploadEtcWaybillResponse>(await this.doRequest("1.0", "antsecuritytech.gateway.etc.waybill.upload", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UploadEtcWaybillResponse({}));
  }

  /**
   * Description: 企业ETC车辆行程查询
   * Summary: 企业ETC车辆行程查询
   */
  async queryEtcTrip(request: QueryEtcTripRequest): Promise<QueryEtcTripResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryEtcTripEx(request, headers, runtime);
  }

  /**
   * Description: 企业ETC车辆行程查询
   * Summary: 企业ETC车辆行程查询
   */
  async queryEtcTripEx(request: QueryEtcTripRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryEtcTripResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryEtcTripResponse>(await this.doRequest("1.0", "antsecuritytech.gateway.etc.trip.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryEtcTripResponse({}));
  }

  /**
   * Description: 两轮车一体机获取授权登录地址
   * Summary: 两轮车一体机获取授权登录地址
   */
  async initSimLogin(request: InitSimLoginRequest): Promise<InitSimLoginResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.initSimLoginEx(request, headers, runtime);
  }

  /**
   * Description: 两轮车一体机获取授权登录地址
   * Summary: 两轮车一体机获取授权登录地址
   */
  async initSimLoginEx(request: InitSimLoginRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<InitSimLoginResponse> {
    Util.validateModel(request);
    return $tea.cast<InitSimLoginResponse>(await this.doRequest("1.0", "antsecuritytech.gateway.sim.login.init", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new InitSimLoginResponse({}));
  }

  /**
   * Description: 两轮车一体机查询登录结果
   * Summary: 两轮车一体机查询登录结果
   */
  async querySimLogin(request: QuerySimLoginRequest): Promise<QuerySimLoginResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.querySimLoginEx(request, headers, runtime);
  }

  /**
   * Description: 两轮车一体机查询登录结果
   * Summary: 两轮车一体机查询登录结果
   */
  async querySimLoginEx(request: QuerySimLoginRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QuerySimLoginResponse> {
    Util.validateModel(request);
    return $tea.cast<QuerySimLoginResponse>(await this.doRequest("1.0", "antsecuritytech.gateway.sim.login.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QuerySimLoginResponse({}));
  }

  /**
   * Description: 两轮车一体机获取营销活动
   * Summary: 两轮车一体机获取营销活动
   */
  async listSimCampaign(request: ListSimCampaignRequest): Promise<ListSimCampaignResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listSimCampaignEx(request, headers, runtime);
  }

  /**
   * Description: 两轮车一体机获取营销活动
   * Summary: 两轮车一体机获取营销活动
   */
  async listSimCampaignEx(request: ListSimCampaignRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListSimCampaignResponse> {
    Util.validateModel(request);
    return $tea.cast<ListSimCampaignResponse>(await this.doRequest("1.0", "antsecuritytech.gateway.sim.campaign.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListSimCampaignResponse({}));
  }

  /**
   * Description: 两轮车一体机查询车辆SKU
   * Summary: 两轮车一体机查询车辆SKU
   */
  async querySimSku(request: QuerySimSkuRequest): Promise<QuerySimSkuResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.querySimSkuEx(request, headers, runtime);
  }

  /**
   * Description: 两轮车一体机查询车辆SKU
   * Summary: 两轮车一体机查询车辆SKU
   */
  async querySimSkuEx(request: QuerySimSkuRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QuerySimSkuResponse> {
    Util.validateModel(request);
    return $tea.cast<QuerySimSkuResponse>(await this.doRequest("1.0", "antsecuritytech.gateway.sim.sku.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QuerySimSkuResponse({}));
  }

  /**
   * Description: 两轮车一体机列举车辆SKU
   * Summary: 两轮车一体机列举车辆SKU
   */
  async listSimSku(request: ListSimSkuRequest): Promise<ListSimSkuResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listSimSkuEx(request, headers, runtime);
  }

  /**
   * Description: 两轮车一体机列举车辆SKU
   * Summary: 两轮车一体机列举车辆SKU
   */
  async listSimSkuEx(request: ListSimSkuRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListSimSkuResponse> {
    Util.validateModel(request);
    return $tea.cast<ListSimSkuResponse>(await this.doRequest("1.0", "antsecuritytech.gateway.sim.sku.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListSimSkuResponse({}));
  }

  /**
   * Description: 两轮车一体机创建订单信息
   * Summary: 两轮车一体机创建订单信息
   */
  async createSimOrder(request: CreateSimOrderRequest): Promise<CreateSimOrderResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createSimOrderEx(request, headers, runtime);
  }

  /**
   * Description: 两轮车一体机创建订单信息
   * Summary: 两轮车一体机创建订单信息
   */
  async createSimOrderEx(request: CreateSimOrderRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateSimOrderResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateSimOrderResponse>(await this.doRequest("1.0", "antsecuritytech.gateway.sim.order.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateSimOrderResponse({}));
  }

  /**
   * Description: 两轮车一体机查询订单信息
   * Summary: 两轮车一体机查询订单信息
   */
  async querySimOrder(request: QuerySimOrderRequest): Promise<QuerySimOrderResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.querySimOrderEx(request, headers, runtime);
  }

  /**
   * Description: 两轮车一体机查询订单信息
   * Summary: 两轮车一体机查询订单信息
   */
  async querySimOrderEx(request: QuerySimOrderRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QuerySimOrderResponse> {
    Util.validateModel(request);
    return $tea.cast<QuerySimOrderResponse>(await this.doRequest("1.0", "antsecuritytech.gateway.sim.order.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QuerySimOrderResponse({}));
  }

  /**
   * Description: 两轮车一体机列举订单信息
   * Summary: 两轮车一体机列举订单信息
   */
  async listSimOrder(request: ListSimOrderRequest): Promise<ListSimOrderResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listSimOrderEx(request, headers, runtime);
  }

  /**
   * Description: 两轮车一体机列举订单信息
   * Summary: 两轮车一体机列举订单信息
   */
  async listSimOrderEx(request: ListSimOrderRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListSimOrderResponse> {
    Util.validateModel(request);
    return $tea.cast<ListSimOrderResponse>(await this.doRequest("1.0", "antsecuritytech.gateway.sim.order.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListSimOrderResponse({}));
  }

  /**
   * Description: 两轮车一体机取消订单信息
   * Summary: 两轮车一体机取消订单信息
   */
  async cancelSimOrder(request: CancelSimOrderRequest): Promise<CancelSimOrderResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.cancelSimOrderEx(request, headers, runtime);
  }

  /**
   * Description: 两轮车一体机取消订单信息
   * Summary: 两轮车一体机取消订单信息
   */
  async cancelSimOrderEx(request: CancelSimOrderRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CancelSimOrderResponse> {
    Util.validateModel(request);
    return $tea.cast<CancelSimOrderResponse>(await this.doRequest("1.0", "antsecuritytech.gateway.sim.order.cancel", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CancelSimOrderResponse({}));
  }

  /**
   * Description: 两轮车一体机拉取车辆SKU
   * Summary: 两轮车一体机拉取车辆SKU
   */
  async pullSimSku(request: PullSimSkuRequest): Promise<PullSimSkuResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pullSimSkuEx(request, headers, runtime);
  }

  /**
   * Description: 两轮车一体机拉取车辆SKU
   * Summary: 两轮车一体机拉取车辆SKU
   */
  async pullSimSkuEx(request: PullSimSkuRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PullSimSkuResponse> {
    Util.validateModel(request);
    return $tea.cast<PullSimSkuResponse>(await this.doRequest("1.0", "antsecuritytech.gateway.sim.sku.pull", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PullSimSkuResponse({}));
  }

  /**
   * Description: 一体机购车订单支付确认请求
   * Summary: 一体机购车订单支付确认请求
   */
  async confirmSimOrder(request: ConfirmSimOrderRequest): Promise<ConfirmSimOrderResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.confirmSimOrderEx(request, headers, runtime);
  }

  /**
   * Description: 一体机购车订单支付确认请求
   * Summary: 一体机购车订单支付确认请求
   */
  async confirmSimOrderEx(request: ConfirmSimOrderRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ConfirmSimOrderResponse> {
    Util.validateModel(request);
    return $tea.cast<ConfirmSimOrderResponse>(await this.doRequest("1.0", "antsecuritytech.gateway.sim.order.confirm", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ConfirmSimOrderResponse({}));
  }

  /**
   * Description: 门店一体机车辆码上传解析接口
   * Summary: 门店一体机车辆码上传解析接口
   */
  async uploadSimQrcode(request: UploadSimQrcodeRequest): Promise<UploadSimQrcodeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.uploadSimQrcodeEx(request, headers, runtime);
  }

  /**
   * Description: 门店一体机车辆码上传解析接口
   * Summary: 门店一体机车辆码上传解析接口
   */
  async uploadSimQrcodeEx(request: UploadSimQrcodeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UploadSimQrcodeResponse> {
    Util.validateModel(request);
    return $tea.cast<UploadSimQrcodeResponse>(await this.doRequest("1.0", "antsecuritytech.gateway.sim.qrcode.upload", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UploadSimQrcodeResponse({}));
  }

  /**
   * Description: 查询spu列表
   * Summary: 两轮车一体机列举车辆SPU
   */
  async querySpuList(request: QuerySpuListRequest): Promise<QuerySpuListResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.querySpuListEx(request, headers, runtime);
  }

  /**
   * Description: 查询spu列表
   * Summary: 两轮车一体机列举车辆SPU
   */
  async querySpuListEx(request: QuerySpuListRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QuerySpuListResponse> {
    Util.validateModel(request);
    return $tea.cast<QuerySpuListResponse>(await this.doRequest("1.0", "antsecuritytech.gateway.spu.list.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QuerySpuListResponse({}));
  }

  /**
   * Description: 两轮车一体机轮询门店签约结果
   * Summary: 两轮车一体机轮询门店签约结果
   */
  async queryLoginSign(request: QueryLoginSignRequest): Promise<QueryLoginSignResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryLoginSignEx(request, headers, runtime);
  }

  /**
   * Description: 两轮车一体机轮询门店签约结果
   * Summary: 两轮车一体机轮询门店签约结果
   */
  async queryLoginSignEx(request: QueryLoginSignRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryLoginSignResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryLoginSignResponse>(await this.doRequest("1.0", "antsecuritytech.gateway.login.sign.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryLoginSignResponse({}));
  }

  /**
   * Description: 刷新订单链接
   * Summary: 刷新订单链接
   */
  async resetOrderLink(request: ResetOrderLinkRequest): Promise<ResetOrderLinkResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.resetOrderLinkEx(request, headers, runtime);
  }

  /**
   * Description: 刷新订单链接
   * Summary: 刷新订单链接
   */
  async resetOrderLinkEx(request: ResetOrderLinkRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ResetOrderLinkResponse> {
    Util.validateModel(request);
    return $tea.cast<ResetOrderLinkResponse>(await this.doRequest("1.0", "antsecuritytech.gateway.order.link.reset", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ResetOrderLinkResponse({}));
  }

  /**
   * Description: 一体机风控信息上传接口
   * Summary: 一体机风控信息上传接口
   */
  async uploadSimRiskdata(request: UploadSimRiskdataRequest): Promise<UploadSimRiskdataResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.uploadSimRiskdataEx(request, headers, runtime);
  }

  /**
   * Description: 一体机风控信息上传接口
   * Summary: 一体机风控信息上传接口
   */
  async uploadSimRiskdataEx(request: UploadSimRiskdataRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UploadSimRiskdataResponse> {
    Util.validateModel(request);
    return $tea.cast<UploadSimRiskdataResponse>(await this.doRequest("1.0", "antsecuritytech.gateway.sim.riskdata.upload", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UploadSimRiskdataResponse({}));
  }

  /**
   * Description: 数字钥匙通过联登TOKEN获取用户信息
   * Summary: 数字钥匙通过联登TOKEN获取用户信息
   */
  async queryDigitalkeyUserinfo(request: QueryDigitalkeyUserinfoRequest): Promise<QueryDigitalkeyUserinfoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryDigitalkeyUserinfoEx(request, headers, runtime);
  }

  /**
   * Description: 数字钥匙通过联登TOKEN获取用户信息
   * Summary: 数字钥匙通过联登TOKEN获取用户信息
   */
  async queryDigitalkeyUserinfoEx(request: QueryDigitalkeyUserinfoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryDigitalkeyUserinfoResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDigitalkeyUserinfoResponse>(await this.doRequest("1.0", "antsecuritytech.gateway.digitalkey.userinfo.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryDigitalkeyUserinfoResponse({}));
  }

  /**
   * Description: 蓝盾安全图片生成
   * Summary: 蓝盾安全图片生成
   */
  async createBssecpic(request: CreateBssecpicRequest): Promise<CreateBssecpicResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createBssecpicEx(request, headers, runtime);
  }

  /**
   * Description: 蓝盾安全图片生成
   * Summary: 蓝盾安全图片生成
   */
  async createBssecpicEx(request: CreateBssecpicRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateBssecpicResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateBssecpicResponse>(await this.doRequest("1.0", "antsecuritytech.gateway.bssecpic.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateBssecpicResponse({}));
  }

  /**
   * Description: 蓝盾安全图片生成
   * Summary: 蓝盾安全图片生成
   */
  async createBlueshieldSecuritypicture(request: CreateBlueshieldSecuritypictureRequest): Promise<CreateBlueshieldSecuritypictureResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createBlueshieldSecuritypictureEx(request, headers, runtime);
  }

  /**
   * Description: 蓝盾安全图片生成
   * Summary: 蓝盾安全图片生成
   */
  async createBlueshieldSecuritypictureEx(request: CreateBlueshieldSecuritypictureRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateBlueshieldSecuritypictureResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateBlueshieldSecuritypictureResponse>(await this.doRequest("1.0", "antsecuritytech.gateway.blueshield.securitypicture.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateBlueshieldSecuritypictureResponse({}));
  }

  /**
   * Description: 终端安全人脸盾Native查询
   * Summary: 人脸盾Native查询
   */
  async queryFaceshieldNative(request: QueryFaceshieldNativeRequest): Promise<QueryFaceshieldNativeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryFaceshieldNativeEx(request, headers, runtime);
  }

  /**
   * Description: 终端安全人脸盾Native查询
   * Summary: 人脸盾Native查询
   */
  async queryFaceshieldNativeEx(request: QueryFaceshieldNativeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryFaceshieldNativeResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryFaceshieldNativeResponse>(await this.doRequest("1.0", "antsecuritytech.gateway.faceshield.native.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryFaceshieldNativeResponse({}));
  }

  /**
   * Description: 终端安全人脸盾Web查询
   * Summary: 人脸盾Web查询
   */
  async queryFaceshieldWeb(request: QueryFaceshieldWebRequest): Promise<QueryFaceshieldWebResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryFaceshieldWebEx(request, headers, runtime);
  }

  /**
   * Description: 终端安全人脸盾Web查询
   * Summary: 人脸盾Web查询
   */
  async queryFaceshieldWebEx(request: QueryFaceshieldWebRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryFaceshieldWebResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryFaceshieldWebResponse>(await this.doRequest("1.0", "antsecuritytech.gateway.faceshield.web.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryFaceshieldWebResponse({}));
  }

  /**
   * Description: 设备激活
   * Summary: 可信设备认证设备初始化，设备激活
   */
  async initIifaaDevice(request: InitIifaaDeviceRequest): Promise<InitIifaaDeviceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.initIifaaDeviceEx(request, headers, runtime);
  }

  /**
   * Description: 设备激活
   * Summary: 可信设备认证设备初始化，设备激活
   */
  async initIifaaDeviceEx(request: InitIifaaDeviceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<InitIifaaDeviceResponse> {
    Util.validateModel(request);
    return $tea.cast<InitIifaaDeviceResponse>(await this.doRequest("1.0", "antsecuritytech.gateway.iifaa.device.init", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new InitIifaaDeviceResponse({}));
  }

  /**
   * Description: 可信设备认证风险咨询，获取预认证数据
   * Summary: 可信设备认证风险咨询，获取预认证数据
   */
  async recognizeIifaaDevice(request: RecognizeIifaaDeviceRequest): Promise<RecognizeIifaaDeviceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.recognizeIifaaDeviceEx(request, headers, runtime);
  }

  /**
   * Description: 可信设备认证风险咨询，获取预认证数据
   * Summary: 可信设备认证风险咨询，获取预认证数据
   */
  async recognizeIifaaDeviceEx(request: RecognizeIifaaDeviceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<RecognizeIifaaDeviceResponse> {
    Util.validateModel(request);
    return $tea.cast<RecognizeIifaaDeviceResponse>(await this.doRequest("1.0", "antsecuritytech.gateway.iifaa.device.recognize", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new RecognizeIifaaDeviceResponse({}));
  }

  /**
   * Description: 可信设备认证，设备验证
   * Summary: 可信设备认证，设备验证
   */
  async verifyIifaaDevice(request: VerifyIifaaDeviceRequest): Promise<VerifyIifaaDeviceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.verifyIifaaDeviceEx(request, headers, runtime);
  }

  /**
   * Description: 可信设备认证，设备验证
   * Summary: 可信设备认证，设备验证
   */
  async verifyIifaaDeviceEx(request: VerifyIifaaDeviceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<VerifyIifaaDeviceResponse> {
    Util.validateModel(request);
    return $tea.cast<VerifyIifaaDeviceResponse>(await this.doRequest("1.0", "antsecuritytech.gateway.iifaa.device.verify", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new VerifyIifaaDeviceResponse({}));
  }

  /**
   * Description: 可信设备认证，产商注册
   * Summary: 可信设备认证，产商注册
   */
  async registerIifaaCorp(request: RegisterIifaaCorpRequest): Promise<RegisterIifaaCorpResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.registerIifaaCorpEx(request, headers, runtime);
  }

  /**
   * Description: 可信设备认证，产商注册
   * Summary: 可信设备认证，产商注册
   */
  async registerIifaaCorpEx(request: RegisterIifaaCorpRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<RegisterIifaaCorpResponse> {
    Util.validateModel(request);
    return $tea.cast<RegisterIifaaCorpResponse>(await this.doRequest("1.0", "antsecuritytech.gateway.iifaa.corp.register", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new RegisterIifaaCorpResponse({}));
  }

  /**
   * Description: 可信设备认证，擦除设备信息
   * Summary: 可信设备认证，擦除设备信息
   */
  async deprecateIifaaDevice(request: DeprecateIifaaDeviceRequest): Promise<DeprecateIifaaDeviceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deprecateIifaaDeviceEx(request, headers, runtime);
  }

  /**
   * Description: 可信设备认证，擦除设备信息
   * Summary: 可信设备认证，擦除设备信息
   */
  async deprecateIifaaDeviceEx(request: DeprecateIifaaDeviceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeprecateIifaaDeviceResponse> {
    Util.validateModel(request);
    return $tea.cast<DeprecateIifaaDeviceResponse>(await this.doRequest("1.0", "antsecuritytech.gateway.iifaa.device.deprecate", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeprecateIifaaDeviceResponse({}));
  }

  /**
   * Description: 巡检商业化
   * Summary: 巡检商业化
   */
  async runXhunterSpi(request: RunXhunterSpiRequest): Promise<RunXhunterSpiResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.runXhunterSpiEx(request, headers, runtime);
  }

  /**
   * Description: 巡检商业化
   * Summary: 巡检商业化
   */
  async runXhunterSpiEx(request: RunXhunterSpiRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<RunXhunterSpiResponse> {
    Util.validateModel(request);
    return $tea.cast<RunXhunterSpiResponse>(await this.doRequest("1.0", "antsecuritytech.gateway.xhunter.spi.run", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new RunXhunterSpiResponse({}));
  }

  /**
   * Description: 租凭住房保险产品，接口开放给租房平台
   * Summary: 租凭住房保险产品，接口开放给租房平台
   */
  async execIifaaInsure(request: ExecIifaaInsureRequest): Promise<ExecIifaaInsureResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.execIifaaInsureEx(request, headers, runtime);
  }

  /**
   * Description: 租凭住房保险产品，接口开放给租房平台
   * Summary: 租凭住房保险产品，接口开放给租房平台
   */
  async execIifaaInsureEx(request: ExecIifaaInsureRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExecIifaaInsureResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecIifaaInsureResponse>(await this.doRequest("1.0", "antsecuritytech.gateway.iifaa.insure.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExecIifaaInsureResponse({}));
  }

  /**
   * Description: 内容安全图片同步检测
   * Summary: 内容安全图片同步检测
   */
  async queryCctPicture(request: QueryCctPictureRequest): Promise<QueryCctPictureResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryCctPictureEx(request, headers, runtime);
  }

  /**
   * Description: 内容安全图片同步检测
   * Summary: 内容安全图片同步检测
   */
  async queryCctPictureEx(request: QueryCctPictureRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryCctPictureResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryCctPictureResponse>(await this.doRequest("1.0", "antsecuritytech.gateway.cct.picture.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryCctPictureResponse({}));
  }

  /**
   * Description: 内容安全主站同步检测
   * Summary: 内容安全主站同步检测
   */
  async recognizeCctAnalyze(request: RecognizeCctAnalyzeRequest): Promise<RecognizeCctAnalyzeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.recognizeCctAnalyzeEx(request, headers, runtime);
  }

  /**
   * Description: 内容安全主站同步检测
   * Summary: 内容安全主站同步检测
   */
  async recognizeCctAnalyzeEx(request: RecognizeCctAnalyzeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<RecognizeCctAnalyzeResponse> {
    Util.validateModel(request);
    return $tea.cast<RecognizeCctAnalyzeResponse>(await this.doRequest("1.0", "antsecuritytech.gateway.cct.analyze.recognize", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new RecognizeCctAnalyzeResponse({}));
  }

  /**
   * Description: RAAS数据服务统一接口
   * Summary: RAAS数据服务统一接口
   */
  async queryRiskGeneral(request: QueryRiskGeneralRequest): Promise<QueryRiskGeneralResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryRiskGeneralEx(request, headers, runtime);
  }

  /**
   * Description: RAAS数据服务统一接口
   * Summary: RAAS数据服务统一接口
   */
  async queryRiskGeneralEx(request: QueryRiskGeneralRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryRiskGeneralResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryRiskGeneralResponse>(await this.doRequest("1.0", "antsecuritytech.gateway.risk.general.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryRiskGeneralResponse({}));
  }

  /**
   * Description: 设备指纹查询
   * Summary: 设备指纹查询
   */
  async queryDeviceriskFinger(request: QueryDeviceriskFingerRequest): Promise<QueryDeviceriskFingerResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryDeviceriskFingerEx(request, headers, runtime);
  }

  /**
   * Description: 设备指纹查询
   * Summary: 设备指纹查询
   */
  async queryDeviceriskFingerEx(request: QueryDeviceriskFingerRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryDeviceriskFingerResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDeviceriskFingerResponse>(await this.doRequest("1.0", "antsecuritytech.gateway.devicerisk.finger.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryDeviceriskFingerResponse({}));
  }

  /**
   * Description: 风险标签查询
   * Summary: 风险标签查询
   */
  async queryDeviceriskRisklabel(request: QueryDeviceriskRisklabelRequest): Promise<QueryDeviceriskRisklabelResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryDeviceriskRisklabelEx(request, headers, runtime);
  }

  /**
   * Description: 风险标签查询
   * Summary: 风险标签查询
   */
  async queryDeviceriskRisklabelEx(request: QueryDeviceriskRisklabelRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryDeviceriskRisklabelResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDeviceriskRisklabelResponse>(await this.doRequest("1.0", "antsecuritytech.gateway.devicerisk.risklabel.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryDeviceriskRisklabelResponse({}));
  }

  /**
   * Description: 设备风险查询
   * Summary: 设备风险查询
   */
  async queryDeviceriskDevicerisk(request: QueryDeviceriskDeviceriskRequest): Promise<QueryDeviceriskDeviceriskResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryDeviceriskDeviceriskEx(request, headers, runtime);
  }

  /**
   * Description: 设备风险查询
   * Summary: 设备风险查询
   */
  async queryDeviceriskDeviceriskEx(request: QueryDeviceriskDeviceriskRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryDeviceriskDeviceriskResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDeviceriskDeviceriskResponse>(await this.doRequest("1.0", "antsecuritytech.gateway.devicerisk.devicerisk.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryDeviceriskDeviceriskResponse({}));
  }

  /**
   * Description: 设备信息上报
   * Summary: 设备信息上报
   */
  async submitDeviceriskReport(request: SubmitDeviceriskReportRequest): Promise<SubmitDeviceriskReportResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.submitDeviceriskReportEx(request, headers, runtime);
  }

  /**
   * Description: 设备信息上报
   * Summary: 设备信息上报
   */
  async submitDeviceriskReportEx(request: SubmitDeviceriskReportRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SubmitDeviceriskReportResponse> {
    Util.validateModel(request);
    return $tea.cast<SubmitDeviceriskReportResponse>(await this.doRequest("1.0", "antsecuritytech.gateway.devicerisk.report.submit", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SubmitDeviceriskReportResponse({}));
  }

  /**
   * Description: eKYT风险评估服务-出行场景司机
   * Summary: eKYT风险评估服务-出行场景司机
   */
  async queryEkytDriver(request: QueryEkytDriverRequest): Promise<QueryEkytDriverResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryEkytDriverEx(request, headers, runtime);
  }

  /**
   * Description: eKYT风险评估服务-出行场景司机
   * Summary: eKYT风险评估服务-出行场景司机
   */
  async queryEkytDriverEx(request: QueryEkytDriverRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryEkytDriverResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryEkytDriverResponse>(await this.doRequest("1.0", "antsecuritytech.gateway.ekyt.driver.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryEkytDriverResponse({}));
  }

  /**
   * Description: 申请设备设备密钥
   * Summary: 申请设备设备密钥
   */
  async applyIifaaDevicekey(request: ApplyIifaaDevicekeyRequest): Promise<ApplyIifaaDevicekeyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.applyIifaaDevicekeyEx(request, headers, runtime);
  }

  /**
   * Description: 申请设备设备密钥
   * Summary: 申请设备设备密钥
   */
  async applyIifaaDevicekeyEx(request: ApplyIifaaDevicekeyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ApplyIifaaDevicekeyResponse> {
    Util.validateModel(request);
    return $tea.cast<ApplyIifaaDevicekeyResponse>(await this.doRequest("1.0", "antsecuritytech.gateway.iifaa.devicekey.apply", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ApplyIifaaDevicekeyResponse({}));
  }

  /**
   * Description: 设备风险咨询
   * Summary: 设备风险咨询
   */
  async queryDeviceplusRiskquery(request: QueryDeviceplusRiskqueryRequest): Promise<QueryDeviceplusRiskqueryResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryDeviceplusRiskqueryEx(request, headers, runtime);
  }

  /**
   * Description: 设备风险咨询
   * Summary: 设备风险咨询
   */
  async queryDeviceplusRiskqueryEx(request: QueryDeviceplusRiskqueryRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryDeviceplusRiskqueryResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDeviceplusRiskqueryResponse>(await this.doRequest("1.0", "antsecuritytech.gateway.deviceplus.riskquery.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryDeviceplusRiskqueryResponse({}));
  }

  /**
   * Description: 设备风险咨询mpaas
   * Summary: 设备风险咨询mpaas
   */
  async queryDeviceplusMpaas(request: QueryDeviceplusMpaasRequest): Promise<QueryDeviceplusMpaasResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryDeviceplusMpaasEx(request, headers, runtime);
  }

  /**
   * Description: 设备风险咨询mpaas
   * Summary: 设备风险咨询mpaas
   */
  async queryDeviceplusMpaasEx(request: QueryDeviceplusMpaasRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryDeviceplusMpaasResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDeviceplusMpaasResponse>(await this.doRequest("1.0", "antsecuritytech.gateway.deviceplus.mpaas.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryDeviceplusMpaasResponse({}));
  }

  /**
   * Description: 终端安全-Android应用加固-启动加固任务(包月)
   * Summary: 启动加固任务(包月)
   */
  async submitAshieldPeriodhardeningtask(request: SubmitAshieldPeriodhardeningtaskRequest): Promise<SubmitAshieldPeriodhardeningtaskResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.submitAshieldPeriodhardeningtaskEx(request, headers, runtime);
  }

  /**
   * Description: 终端安全-Android应用加固-启动加固任务(包月)
   * Summary: 启动加固任务(包月)
   */
  async submitAshieldPeriodhardeningtaskEx(request: SubmitAshieldPeriodhardeningtaskRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SubmitAshieldPeriodhardeningtaskResponse> {
    Util.validateModel(request);
    return $tea.cast<SubmitAshieldPeriodhardeningtaskResponse>(await this.doRequest("1.0", "antsecuritytech.gateway.ashield.periodhardeningtask.submit", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SubmitAshieldPeriodhardeningtaskResponse({}));
  }

  /**
   * Description: 终端安全-Android应用加固-获取上传文件的临时URL
   * Summary: 获取上传文件的临时URL
   */
  async getAshieldFiletoken(request: GetAshieldFiletokenRequest): Promise<GetAshieldFiletokenResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getAshieldFiletokenEx(request, headers, runtime);
  }

  /**
   * Description: 终端安全-Android应用加固-获取上传文件的临时URL
   * Summary: 获取上传文件的临时URL
   */
  async getAshieldFiletokenEx(request: GetAshieldFiletokenRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetAshieldFiletokenResponse> {
    Util.validateModel(request);
    return $tea.cast<GetAshieldFiletokenResponse>(await this.doRequest("1.0", "antsecuritytech.gateway.ashield.filetoken.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetAshieldFiletokenResponse({}));
  }

  /**
   * Description: 终端安全-Android应用加固-启动加固任务
   * Summary: 启动加固任务(按次计费)
   */
  async submitAshieldHardeningtask(request: SubmitAshieldHardeningtaskRequest): Promise<SubmitAshieldHardeningtaskResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.submitAshieldHardeningtaskEx(request, headers, runtime);
  }

  /**
   * Description: 终端安全-Android应用加固-启动加固任务
   * Summary: 启动加固任务(按次计费)
   */
  async submitAshieldHardeningtaskEx(request: SubmitAshieldHardeningtaskRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SubmitAshieldHardeningtaskResponse> {
    Util.validateModel(request);
    return $tea.cast<SubmitAshieldHardeningtaskResponse>(await this.doRequest("1.0", "antsecuritytech.gateway.ashield.hardeningtask.submit", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SubmitAshieldHardeningtaskResponse({}));
  }

  /**
   * Description: 终端安全-Android应用加固-查询加固任务进度
   * Summary: 查询加固任务进度
   */
  async getAshieldHardeningtaskprocess(request: GetAshieldHardeningtaskprocessRequest): Promise<GetAshieldHardeningtaskprocessResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getAshieldHardeningtaskprocessEx(request, headers, runtime);
  }

  /**
   * Description: 终端安全-Android应用加固-查询加固任务进度
   * Summary: 查询加固任务进度
   */
  async getAshieldHardeningtaskprocessEx(request: GetAshieldHardeningtaskprocessRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetAshieldHardeningtaskprocessResponse> {
    Util.validateModel(request);
    return $tea.cast<GetAshieldHardeningtaskprocessResponse>(await this.doRequest("1.0", "antsecuritytech.gateway.ashield.hardeningtaskprocess.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetAshieldHardeningtaskprocessResponse({}));
  }

  /**
   * Description: 终端安全-Android应用加固-查询加固后的产物下载链接
   * Summary: 查询加固后的产物下载链接
   */
  async getAshieldHardeningresult(request: GetAshieldHardeningresultRequest): Promise<GetAshieldHardeningresultResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getAshieldHardeningresultEx(request, headers, runtime);
  }

  /**
   * Description: 终端安全-Android应用加固-查询加固后的产物下载链接
   * Summary: 查询加固后的产物下载链接
   */
  async getAshieldHardeningresultEx(request: GetAshieldHardeningresultRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetAshieldHardeningresultResponse> {
    Util.validateModel(request);
    return $tea.cast<GetAshieldHardeningresultResponse>(await this.doRequest("1.0", "antsecuritytech.gateway.ashield.hardeningresult.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetAshieldHardeningresultResponse({}));
  }

  /**
   * Description: 终端安全-Android应用加固-查询加固后的日志下载链接
   * Summary: 查询加固后的日志下载链接
   */
  async getAshieldHardeninglog(request: GetAshieldHardeninglogRequest): Promise<GetAshieldHardeninglogResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getAshieldHardeninglogEx(request, headers, runtime);
  }

  /**
   * Description: 终端安全-Android应用加固-查询加固后的日志下载链接
   * Summary: 查询加固后的日志下载链接
   */
  async getAshieldHardeninglogEx(request: GetAshieldHardeninglogRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetAshieldHardeninglogResponse> {
    Util.validateModel(request);
    return $tea.cast<GetAshieldHardeninglogResponse>(await this.doRequest("1.0", "antsecuritytech.gateway.ashield.hardeninglog.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetAshieldHardeninglogResponse({}));
  }

  /**
   * Description: eKYT可信签约初始化
   * Summary: eKYT可信签约-初始化
   */
  async initEkytTrustsign(request: InitEkytTrustsignRequest): Promise<InitEkytTrustsignResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.initEkytTrustsignEx(request, headers, runtime);
  }

  /**
   * Description: eKYT可信签约初始化
   * Summary: eKYT可信签约-初始化
   */
  async initEkytTrustsignEx(request: InitEkytTrustsignRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<InitEkytTrustsignResponse> {
    Util.validateModel(request);
    return $tea.cast<InitEkytTrustsignResponse>(await this.doRequest("1.0", "antsecuritytech.gateway.ekyt.trustsign.init", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new InitEkytTrustsignResponse({}));
  }

  /**
   * Description: eKYT可信签约签约单查询
   * Summary: eKYT可信签约-签约单查询
   */
  async queryEkytTrustsign(request: QueryEkytTrustsignRequest): Promise<QueryEkytTrustsignResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryEkytTrustsignEx(request, headers, runtime);
  }

  /**
   * Description: eKYT可信签约签约单查询
   * Summary: eKYT可信签约-签约单查询
   */
  async queryEkytTrustsignEx(request: QueryEkytTrustsignRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryEkytTrustsignResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryEkytTrustsignResponse>(await this.doRequest("1.0", "antsecuritytech.gateway.ekyt.trustsign.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryEkytTrustsignResponse({}));
  }

  /**
   * Description: eKYT人脸核身初始化
   * Summary: eKYT人脸核身-初始化
   */
  async initEkytFaceverify(request: InitEkytFaceverifyRequest): Promise<InitEkytFaceverifyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.initEkytFaceverifyEx(request, headers, runtime);
  }

  /**
   * Description: eKYT人脸核身初始化
   * Summary: eKYT人脸核身-初始化
   */
  async initEkytFaceverifyEx(request: InitEkytFaceverifyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<InitEkytFaceverifyResponse> {
    Util.validateModel(request);
    return $tea.cast<InitEkytFaceverifyResponse>(await this.doRequest("1.0", "antsecuritytech.gateway.ekyt.faceverify.init", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new InitEkytFaceverifyResponse({}));
  }

  /**
   * Description: eKYT人脸核身结果查询
   * Summary: eKYT人脸核身-结果查询
   */
  async queryEkytFaceverify(request: QueryEkytFaceverifyRequest): Promise<QueryEkytFaceverifyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryEkytFaceverifyEx(request, headers, runtime);
  }

  /**
   * Description: eKYT人脸核身结果查询
   * Summary: eKYT人脸核身-结果查询
   */
  async queryEkytFaceverifyEx(request: QueryEkytFaceverifyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryEkytFaceverifyResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryEkytFaceverifyResponse>(await this.doRequest("1.0", "antsecuritytech.gateway.ekyt.faceverify.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryEkytFaceverifyResponse({}));
  }

  /**
   * Description: 友活来了创建任务api
   * Summary: 友活来了创建任务api
   */
  async importYhll(request: ImportYhllRequest): Promise<ImportYhllResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.importYhllEx(request, headers, runtime);
  }

  /**
   * Description: 友活来了创建任务api
   * Summary: 友活来了创建任务api
   */
  async importYhllEx(request: ImportYhllRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ImportYhllResponse> {
    Util.validateModel(request);
    return $tea.cast<ImportYhllResponse>(await this.doRequest("1.0", "antsecuritytech.gateway.yhll.import", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ImportYhllResponse({}));
  }

  /**
   * Description: 友活来了任务查询api
   * Summary: 友活来了任务查询api
   */
  async queryYhll(request: QueryYhllRequest): Promise<QueryYhllResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryYhllEx(request, headers, runtime);
  }

  /**
   * Description: 友活来了任务查询api
   * Summary: 友活来了任务查询api
   */
  async queryYhllEx(request: QueryYhllRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryYhllResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryYhllResponse>(await this.doRequest("1.0", "antsecuritytech.gateway.yhll.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryYhllResponse({}));
  }

  /**
   * Description: 天鉴ask接口
   * Summary: 天鉴ask接口
   */
  async queryGuardAsk(request: QueryGuardAskRequest): Promise<QueryGuardAskResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryGuardAskEx(request, headers, runtime);
  }

  /**
   * Description: 天鉴ask接口
   * Summary: 天鉴ask接口
   */
  async queryGuardAskEx(request: QueryGuardAskRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryGuardAskResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryGuardAskResponse>(await this.doRequest("1.0", "antsecuritytech.gateway.guard.ask.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryGuardAskResponse({}));
  }

  /**
   * Description: 天鉴answer接口
   * Summary: 天鉴answer接口
   */
  async queryGuardAnswer(request: QueryGuardAnswerRequest): Promise<QueryGuardAnswerResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryGuardAnswerEx(request, headers, runtime);
  }

  /**
   * Description: 天鉴answer接口
   * Summary: 天鉴answer接口
   */
  async queryGuardAnswerEx(request: QueryGuardAnswerRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryGuardAnswerResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryGuardAnswerResponse>(await this.doRequest("1.0", "antsecuritytech.gateway.guard.answer.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryGuardAnswerResponse({}));
  }

  /**
   * Description: 开放给设备产商，删除数字钥匙
   * Summary: 删除数字钥匙
   */
  async deleteIifaaDigitalkey(request: DeleteIifaaDigitalkeyRequest): Promise<DeleteIifaaDigitalkeyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteIifaaDigitalkeyEx(request, headers, runtime);
  }

  /**
   * Description: 开放给设备产商，删除数字钥匙
   * Summary: 删除数字钥匙
   */
  async deleteIifaaDigitalkeyEx(request: DeleteIifaaDigitalkeyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteIifaaDigitalkeyResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteIifaaDigitalkeyResponse>(await this.doRequest("1.0", "antsecuritytech.gateway.iifaa.digitalkey.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteIifaaDigitalkeyResponse({}));
  }

  /**
   * Description: 光鉴智能凭证
   * Summary: 光鉴智能凭证
   */
  async checkOpticalIdentify(request: CheckOpticalIdentifyRequest): Promise<CheckOpticalIdentifyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.checkOpticalIdentifyEx(request, headers, runtime);
  }

  /**
   * Description: 光鉴智能凭证
   * Summary: 光鉴智能凭证
   */
  async checkOpticalIdentifyEx(request: CheckOpticalIdentifyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CheckOpticalIdentifyResponse> {
    Util.validateModel(request);
    return $tea.cast<CheckOpticalIdentifyResponse>(await this.doRequest("1.0", "antsecuritytech.gateway.optical.identify.check", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CheckOpticalIdentifyResponse({}));
  }

}
