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
// 
export class FaceShieldResult extends $tea.Model {
  // 设备token
  // 
  apdidToken: string;
  // 风险等级，-1参数异常，0无风险，1-3表示低、中、高
  // 
  riskLevel: number;
  // 风险描述，对风险等级的补充
  // 
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
  // ·
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

// aml_extend_data
export class ExtendData extends $tea.Model {
  // user_id
  userId: string;
  // cert_name
  certName: string;
  static names(): { [key: string]: string } {
    return {
      userId: 'user_id',
      certName: 'cert_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      userId: 'string',
      certName: 'string',
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

// 终端安全MarketingRiskData
export class MarketingRiskData extends $tea.Model {
  // risk_level
  riskLevel: number;
  // sug_action
  sugAction: string;
  // `
  riskLabels: string[];
  static names(): { [key: string]: string } {
    return {
      riskLevel: 'risk_level',
      sugAction: 'sug_action',
      riskLabels: 'risk_labels',
    };
  }

  static types(): { [key: string]: any } {
    return {
      riskLevel: 'number',
      sugAction: 'string',
      riskLabels: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// ZolozAlertTaskBO
export class ZolozAlertTaskBO extends $tea.Model {
  // request_id
  requestId: string;
  // decision
  decision: string;
  // status
  status: string;
  // taskId
  taskId: string;
  // type
  type: string;
  // userId
  userId: string;
  // source
  source: string;
  // crrRiskLevel
  crrRiskLevel: string;
  // createTime
  createTime: string;
  // updateTime
  updateTime: string;
  // modifier
  modifier: string;
  static names(): { [key: string]: string } {
    return {
      requestId: 'request_id',
      decision: 'decision',
      status: 'status',
      taskId: 'task_id',
      type: 'type',
      userId: 'user_id',
      source: 'source',
      crrRiskLevel: 'crr_risk_level',
      createTime: 'create_time',
      updateTime: 'update_time',
      modifier: 'modifier',
    };
  }

  static types(): { [key: string]: any } {
    return {
      requestId: 'string',
      decision: 'string',
      status: 'string',
      taskId: 'string',
      type: 'string',
      userId: 'string',
      source: 'string',
      crrRiskLevel: 'string',
      createTime: 'string',
      updateTime: 'string',
      modifier: 'string',
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
  // apdid
  apdidToken: string;
  // riskLevel
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

// 设备信息上报
export class DeviceRiskReportResult extends $tea.Model {
  // success
  success: boolean;
  // result_code
  resultCode: string;
  // result_status
  resultStatus: string;
  // apdid
  apdid: string;
  // token
  token: string;
  // current_time
  currentTime: string;
  // version
  version: string;
  // vkey_switch
  vkeySwitch: string;
  // bug_track_switch
  bugTrackSwitch: string;
  // app_list_ver
  appListVer: string;
  // dynamic_key
  dynamicKey: string;
  // result_data
  resultData: DeviceRiskReportResultData;
  static names(): { [key: string]: string } {
    return {
      success: 'success',
      resultCode: 'result_code',
      resultStatus: 'result_status',
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
      success: 'boolean',
      resultCode: 'string',
      resultStatus: 'string',
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

// Hit details
export class HitResults extends $tea.Model {
  // Reason for the screening decision. See more details in API-specific result codes. 
  resultCode: string;
  // Result status. Possible values and their meanings are as below: 
  // 
  // "S": successful
  // 
  // "F": failed
  // 
  // "U": unknown issue
  resultStatus: string;
  // Result message.
  // 
  // See more details in API-specific result codes.
  resultMessage: string;
  static names(): { [key: string]: string } {
    return {
      resultCode: 'result_code',
      resultStatus: 'result_status',
      resultMessage: 'result_message',
    };
  }

  static types(): { [key: string]: any } {
    return {
      resultCode: 'string',
      resultStatus: 'string',
      resultMessage: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// MarketingRiskSecurityData
export class MarketingRiskSecurityData extends $tea.Model {
  // apdid_token
  apdidToken: string;
  // signature
  signature: string;
  // solution_risk_code
  solutionRiskCode: string;
  static names(): { [key: string]: string } {
    return {
      apdidToken: 'apdid_token',
      signature: 'signature',
      solutionRiskCode: 'solution_risk_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      apdidToken: 'string',
      signature: 'string',
      solutionRiskCode: 'string',
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
  // 
  appName?: string;
  // 客户名
  // 
  clientName: string;
  // 操作系统
  // 
  osType: string;
  // 包名
  // 
  packageName: string;
  // 签名信息
  // 
  certSign?: string;
  // 签名秘钥内容
  // 
  appKeyData?: string;
  // 加密秘钥内容
  // 
  securityData?: string;
  // 自定义秘钥内容
  // 
  extraData?: string;
  // 白盒秘钥内容
  // 
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

export class CreateBlueshieldSecuritypictureResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 执行是否成功
  // 
  success?: boolean;
  // 生成的图片文件名
  // 
  fileName?: string;
  // body base 64
  // 
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
  // 
  clientId: string;
  // 设备token
  // 
  apdidToken?: string;
  // 切面数据（JSON，详见下方）
  aopData?: string;
  // 签名信息	否（和切面二选一即可）
  // 
  signature?: string;
  // 签名因子（和切面二选一即可）
  // 
  signFactor?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      clientId: 'client_id',
      apdidToken: 'apdid_token',
      aopData: 'aop_data',
      signature: 'signature',
      signFactor: 'sign_factor',
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

export class QueryFaceshieldWebRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 客户id，标识客户来源
  // 
  clientId: string;
  // apdid_token
  apdidToken?: string;
  // aop_data
  aopData?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      clientId: 'client_id',
      apdidToken: 'apdid_token',
      aopData: 'aop_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      clientId: 'string',
      apdidToken: 'string',
      aopData: 'string',
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
  // success
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
  // data
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

export class QueryEaglepromoMarketingriskRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // security_data
  securityData: MarketingRiskSecurityData;
  // sign_factor
  signFactor: string;
  // client_id
  clientId: string;
  // request_id
  requestId?: string;
  // biz_code
  bizCode?: string;
  // terminal_type
  terminalType?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      securityData: 'security_data',
      signFactor: 'sign_factor',
      clientId: 'client_id',
      requestId: 'request_id',
      bizCode: 'biz_code',
      terminalType: 'terminal_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      securityData: MarketingRiskSecurityData,
      signFactor: 'string',
      clientId: 'string',
      requestId: 'string',
      bizCode: 'string',
      terminalType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryEaglepromoMarketingriskResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // success
  success?: boolean;
  // message
  message?: string;
  // code
  code?: number;
  // data
  data?: MarketingRiskData;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      success: 'success',
      message: 'message',
      code: 'code',
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
      code: 'number',
      data: MarketingRiskData,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SubmitAmlcloudAnalyzeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // biz_code
  bizCode: string;
  // tenant_id
  tenantId: string;
  // tnt_inst_id
  tntInstId: string;
  // extendData
  extendData: ExtendData;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizCode: 'biz_code',
      tenantId: 'tenant_id',
      tntInstId: 'tnt_inst_id',
      extendData: 'extend_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizCode: 'string',
      tenantId: 'string',
      tntInstId: 'string',
      extendData: ExtendData,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SubmitAmlcloudAnalyzeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // Unique business ID for tracing purposes
  requestId?: string;
  // Screening decisions: 
  // 
  // ACCEPT: Did not hit any watchlist
  // 
  // REJECT: Hit some watchlists
  // 
  // REVIEW: Potentially hit some watchlists
  decision?: string;
  // Hit details
  hitResults?: HitResults;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      requestId: 'request_id',
      decision: 'decision',
      hitResults: 'hit_results',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      requestId: 'string',
      decision: 'string',
      hitResults: HitResults,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAmlcloudAnalyzeRequest extends $tea.Model {
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

export class QueryAmlcloudAnalyzeResponse extends $tea.Model {
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

export class QueryAmlcloudCheckcaseresultRequest extends $tea.Model {
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

export class QueryAmlcloudCheckcaseresultResponse extends $tea.Model {
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

export class SubmitAmlcloudCheckcaseresultRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 请求ID，业务的唯一标识，用于追踪业务。
  requestId: string;
  // 客户的租户ID
  tenantId: string;
  // 任务来源。取值如下：
  // ● REALTIME：来源于扫描信息接口。
  // ● BATCH：来源于数据仓库。
  // ● ALL：包含以上所有的任务来源
  source: string;
  // 任务类型。取值如下：
  // ● PEP：政治高风险人物。
  // ● SANCTION：制裁名单。
  // ● NEGATIVE_NEWS：负面新闻。
  // ● INTERNAL_LIST：自定义名单。
  // ● EDD：加强尽职调查。
  // ● ALL：包含以上所有的任务类型。
  type: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      requestId: 'request_id',
      tenantId: 'tenant_id',
      source: 'source',
      type: 'type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      requestId: 'string',
      tenantId: 'string',
      source: 'string',
      type: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SubmitAmlcloudCheckcaseresultResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 任务结果详情
  caseDetails?: ZolozAlertTaskBO[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      caseDetails: 'case_details',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      caseDetails: { 'type': 'array', 'itemType': ZolozAlertTaskBO },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAmlclouduatAnalyzeRequest extends $tea.Model {
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

export class QueryAmlclouduatAnalyzeResponse extends $tea.Model {
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

export class QueryAmlclouduatCheckcaseresultRequest extends $tea.Model {
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

export class QueryAmlclouduatCheckcaseresultResponse extends $tea.Model {
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
  // ·
  requestId?: string;
  // res_success
  resSuccess?: boolean;
  // res_code
  resCode?: string;
  // res_message
  resMessage?: string;
  // ·
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
    if (Util.isUnset($tea.toMap(config))) {
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
          sdk_version: "1.5.10",
          _prod_code: "HK_SECURITYTECH",
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
    return $tea.cast<CreateBlueshieldSecuritypictureResponse>(await this.doRequest("1.0", "hksecuritytech.gateway.blueshield.securitypicture.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateBlueshieldSecuritypictureResponse({}));
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
    return $tea.cast<QueryFaceshieldNativeResponse>(await this.doRequest("1.0", "hksecuritytech.gateway.faceshield.native.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryFaceshieldNativeResponse({}));
  }

  /**
   * Description: 终端安全-Android应用加固-启动加固任务
   * Summary: 启动加固任务
   */
  async submitAshieldHardeningtask(request: SubmitAshieldHardeningtaskRequest): Promise<SubmitAshieldHardeningtaskResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.submitAshieldHardeningtaskEx(request, headers, runtime);
  }

  /**
   * Description: 终端安全-Android应用加固-启动加固任务
   * Summary: 启动加固任务
   */
  async submitAshieldHardeningtaskEx(request: SubmitAshieldHardeningtaskRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SubmitAshieldHardeningtaskResponse> {
    Util.validateModel(request);
    return $tea.cast<SubmitAshieldHardeningtaskResponse>(await this.doRequest("1.0", "hksecuritytech.gateway.ashield.hardeningtask.submit", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SubmitAshieldHardeningtaskResponse({}));
  }

  /**
   * Description: 设备风险查询
   * Summary: 设备风险查询
   */
  async queryDeviceriskFinger(request: QueryDeviceriskFingerRequest): Promise<QueryDeviceriskFingerResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryDeviceriskFingerEx(request, headers, runtime);
  }

  /**
   * Description: 设备风险查询
   * Summary: 设备风险查询
   */
  async queryDeviceriskFingerEx(request: QueryDeviceriskFingerRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryDeviceriskFingerResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDeviceriskFingerResponse>(await this.doRequest("1.0", "hksecuritytech.gateway.devicerisk.finger.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryDeviceriskFingerResponse({}));
  }

  /**
   * Description: 终端安全-设备风险查询
   * Summary: 设备风险查询
   */
  async queryDeviceriskDevicerisk(request: QueryDeviceriskDeviceriskRequest): Promise<QueryDeviceriskDeviceriskResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryDeviceriskDeviceriskEx(request, headers, runtime);
  }

  /**
   * Description: 终端安全-设备风险查询
   * Summary: 设备风险查询
   */
  async queryDeviceriskDeviceriskEx(request: QueryDeviceriskDeviceriskRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryDeviceriskDeviceriskResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDeviceriskDeviceriskResponse>(await this.doRequest("1.0", "hksecuritytech.gateway.devicerisk.devicerisk.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryDeviceriskDeviceriskResponse({}));
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
    return $tea.cast<QueryFaceshieldWebResponse>(await this.doRequest("1.0", "hksecuritytech.gateway.faceshield.web.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryFaceshieldWebResponse({}));
  }

  /**
   * Description: 终端安全 设备信息上报
   * Summary: 设备信息上报
   */
  async submitDeviceriskReport(request: SubmitDeviceriskReportRequest): Promise<SubmitDeviceriskReportResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.submitDeviceriskReportEx(request, headers, runtime);
  }

  /**
   * Description: 终端安全 设备信息上报
   * Summary: 设备信息上报
   */
  async submitDeviceriskReportEx(request: SubmitDeviceriskReportRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SubmitDeviceriskReportResponse> {
    Util.validateModel(request);
    return $tea.cast<SubmitDeviceriskReportResponse>(await this.doRequest("1.0", "hksecuritytech.gateway.devicerisk.report.submit", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SubmitDeviceriskReportResponse({}));
  }

  /**
   * Description: 终端安全 EaglePromo
   * Summary: EaglePromo
   */
  async queryEaglepromoMarketingrisk(request: QueryEaglepromoMarketingriskRequest): Promise<QueryEaglepromoMarketingriskResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryEaglepromoMarketingriskEx(request, headers, runtime);
  }

  /**
   * Description: 终端安全 EaglePromo
   * Summary: EaglePromo
   */
  async queryEaglepromoMarketingriskEx(request: QueryEaglepromoMarketingriskRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryEaglepromoMarketingriskResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryEaglepromoMarketingriskResponse>(await this.doRequest("1.0", "hksecuritytech.gateway.eaglepromo.marketingrisk.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryEaglepromoMarketingriskResponse({}));
  }

  /**
   * Description: aml analyze v2 form
   * Summary: aml analyze v2 form
   */
  async submitAmlcloudAnalyze(request: SubmitAmlcloudAnalyzeRequest): Promise<SubmitAmlcloudAnalyzeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.submitAmlcloudAnalyzeEx(request, headers, runtime);
  }

  /**
   * Description: aml analyze v2 form
   * Summary: aml analyze v2 form
   */
  async submitAmlcloudAnalyzeEx(request: SubmitAmlcloudAnalyzeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SubmitAmlcloudAnalyzeResponse> {
    Util.validateModel(request);
    return $tea.cast<SubmitAmlcloudAnalyzeResponse>(await this.doRequest("1.0", "hksecuritytech.gateway.amlcloud.analyze.submit", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SubmitAmlcloudAnalyzeResponse({}));
  }

  /**
   * Description: aml analyze v2 rest风格，适配ekyc接口，适配已签约但未调用的aml租户
   * Summary: aml analyze v2 rest
   */
  async queryAmlcloudAnalyze(request: QueryAmlcloudAnalyzeRequest): Promise<QueryAmlcloudAnalyzeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAmlcloudAnalyzeEx(request, headers, runtime);
  }

  /**
   * Description: aml analyze v2 rest风格，适配ekyc接口，适配已签约但未调用的aml租户
   * Summary: aml analyze v2 rest
   */
  async queryAmlcloudAnalyzeEx(request: QueryAmlcloudAnalyzeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAmlcloudAnalyzeResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAmlcloudAnalyzeResponse>(await this.doRequest("1.0", "hksecuritytech.gateway.amlcloud.analyze.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAmlcloudAnalyzeResponse({}));
  }

  /**
   * Description: aml check v2 rest，适配ekyc接口，适配已签约但未调用的aml租户
   * Summary: aml check v2 rest
   */
  async queryAmlcloudCheckcaseresult(request: QueryAmlcloudCheckcaseresultRequest): Promise<QueryAmlcloudCheckcaseresultResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAmlcloudCheckcaseresultEx(request, headers, runtime);
  }

  /**
   * Description: aml check v2 rest，适配ekyc接口，适配已签约但未调用的aml租户
   * Summary: aml check v2 rest
   */
  async queryAmlcloudCheckcaseresultEx(request: QueryAmlcloudCheckcaseresultRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAmlcloudCheckcaseresultResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAmlcloudCheckcaseresultResponse>(await this.doRequest("1.0", "hksecuritytech.gateway.amlcloud.checkcaseresult.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAmlcloudCheckcaseresultResponse({}));
  }

  /**
   * Description: aml check v2 form
   * Summary: aml check v2 form
   */
  async submitAmlcloudCheckcaseresult(request: SubmitAmlcloudCheckcaseresultRequest): Promise<SubmitAmlcloudCheckcaseresultResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.submitAmlcloudCheckcaseresultEx(request, headers, runtime);
  }

  /**
   * Description: aml check v2 form
   * Summary: aml check v2 form
   */
  async submitAmlcloudCheckcaseresultEx(request: SubmitAmlcloudCheckcaseresultRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SubmitAmlcloudCheckcaseresultResponse> {
    Util.validateModel(request);
    return $tea.cast<SubmitAmlcloudCheckcaseresultResponse>(await this.doRequest("1.0", "hksecuritytech.gateway.amlcloud.checkcaseresult.submit", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SubmitAmlcloudCheckcaseresultResponse({}));
  }

  /**
   * Description: aml analyze v2 rest风格，适配ekyc接口，适配已签约但未调用的aml租户 - uat版本
   * Summary: aml analyze v2 rest
   */
  async queryAmlclouduatAnalyze(request: QueryAmlclouduatAnalyzeRequest): Promise<QueryAmlclouduatAnalyzeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAmlclouduatAnalyzeEx(request, headers, runtime);
  }

  /**
   * Description: aml analyze v2 rest风格，适配ekyc接口，适配已签约但未调用的aml租户 - uat版本
   * Summary: aml analyze v2 rest
   */
  async queryAmlclouduatAnalyzeEx(request: QueryAmlclouduatAnalyzeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAmlclouduatAnalyzeResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAmlclouduatAnalyzeResponse>(await this.doRequest("1.0", "hksecuritytech.gateway.amlclouduat.analyze.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAmlclouduatAnalyzeResponse({}));
  }

  /**
   * Description: aml check v2 rest，适配ekyc接口，适配已签约但未调用的aml租户 - uat版本
   * Summary: aml check v2 rest
   */
  async queryAmlclouduatCheckcaseresult(request: QueryAmlclouduatCheckcaseresultRequest): Promise<QueryAmlclouduatCheckcaseresultResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAmlclouduatCheckcaseresultEx(request, headers, runtime);
  }

  /**
   * Description: aml check v2 rest，适配ekyc接口，适配已签约但未调用的aml租户 - uat版本
   * Summary: aml check v2 rest
   */
  async queryAmlclouduatCheckcaseresultEx(request: QueryAmlclouduatCheckcaseresultRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAmlclouduatCheckcaseresultResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAmlclouduatCheckcaseresultResponse>(await this.doRequest("1.0", "hksecuritytech.gateway.amlclouduat.checkcaseresult.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAmlclouduatCheckcaseresultResponse({}));
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
    return $tea.cast<GetAshieldFiletokenResponse>(await this.doRequest("1.0", "hksecuritytech.gateway.ashield.filetoken.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetAshieldFiletokenResponse({}));
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
    return $tea.cast<GetAshieldHardeningtaskprocessResponse>(await this.doRequest("1.0", "hksecuritytech.gateway.ashield.hardeningtaskprocess.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetAshieldHardeningtaskprocessResponse({}));
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
    return $tea.cast<GetAshieldHardeningresultResponse>(await this.doRequest("1.0", "hksecuritytech.gateway.ashield.hardeningresult.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetAshieldHardeningresultResponse({}));
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
    return $tea.cast<GetAshieldHardeninglogResponse>(await this.doRequest("1.0", "hksecuritytech.gateway.ashield.hardeninglog.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetAshieldHardeninglogResponse({}));
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
    return $tea.cast<QueryDeviceriskRisklabelResponse>(await this.doRequest("1.0", "hksecuritytech.gateway.devicerisk.risklabel.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryDeviceriskRisklabelResponse({}));
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
    return $tea.cast<SubmitAshieldPeriodhardeningtaskResponse>(await this.doRequest("1.0", "hksecuritytech.gateway.ashield.periodhardeningtask.submit", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SubmitAshieldPeriodhardeningtaskResponse({}));
  }

}
