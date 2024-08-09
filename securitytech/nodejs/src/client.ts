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
  // 大模型提问护栏服务, 用于区分提供的服务类别，当前支持：TJ_QUESTION_BASIC、TJ_ANSWER_BASIC 两种
  serviceName: string;
  // 当前提问内容，最大长度10000个字符。
  question: string;
  // 用户ID，用于主体风险判断，如果是2088开头的阿里体系用户，请传入2088开头的用户ID
  userId: string;
  // 提问内容类型，纯文本: PLAINTEXT，图片url: PICTURE_URL
  questionFormat?: string;
  // 大模型ID，表示大模型版本
  modelCode?: string;
  // 扩展属性Map，key限定为：aigcType、serviceScene、triggerSource、bizOwner，对应的value取值为： aigcType： ● 文生文：text_text ● 文生图：text_pic ● 图生文：pic_text ● 图生图：pic_pic serviceScene: 根据业务使用的不同情况支持自定义入参做策略个性化配置，私域或者公域，以及不同的业务应用 比如领域： serviceScene = insurance 表示保险 serviceScene = medical 表示医疗 serviceScene = government 表示政务 比如业务活动应用： serviceScene = xiacu 表示夏促 serviceScene = qixi 表示七夕 triggerSource: 不同的来源，比如移动端、web端、API
  businessProperties?: KeyValueMap;
  // scene_code
  sceneCode?: string;
  // serviceCode
  serviceCode?: string;
  // app_code
  appCode?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      sessionId: 'session_id',
      requestId: 'request_id',
      serviceName: 'service_name',
      question: 'question',
      userId: 'user_id',
      questionFormat: 'question_format',
      modelCode: 'model_code',
      businessProperties: 'business_properties',
      sceneCode: 'scene_code',
      serviceCode: 'service_code',
      appCode: 'app_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      sessionId: 'string',
      requestId: 'string',
      serviceName: 'string',
      question: 'string',
      userId: 'string',
      questionFormat: 'string',
      modelCode: 'string',
      businessProperties: KeyValueMap,
      sceneCode: 'string',
      serviceCode: 'string',
      appCode: 'string',
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
          sdk_version: "1.2.27",
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

}
