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

// 场所信息
export class SceneInfo extends $tea.Model {
  // 场所名称
  sceneName?: string;
  // 场所码
  sceneCode?: string;
  static names(): { [key: string]: string } {
    return {
      sceneName: 'scene_name',
      sceneCode: 'scene_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      sceneName: 'string',
      sceneCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 行程信息
export class TravelInfo extends $tea.Model {
  // 行程码信息
  // 1:没去过疫情区，绿码;
  // 2:去过疫情区，红码;
  // 3:其他，黄码;
  // 0:行程信息不全;
  // -1:查询失败
  travelCode?: string;
  // 行程码异常原因
  travelFactor?: string;
  static names(): { [key: string]: string } {
    return {
      travelCode: 'travel_code',
      travelFactor: 'travel_factor',
    };
  }

  static types(): { [key: string]: any } {
    return {
      travelCode: 'string',
      travelFactor: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 统计附加额外字段
export class StatisticsExtendArg extends $tea.Model {
  // 字段key
  key: string;
  // 数量
  number: number;
  static names(): { [key: string]: string } {
    return {
      key: 'key',
      number: 'number',
    };
  }

  static types(): { [key: string]: any } {
    return {
      key: 'string',
      number: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 户籍所在省分布
export class IdentityDistributed extends $tea.Model {
  // 户籍身份证号(前两位标识)
  // 11代表北京市，12天代表天津市，13河北省，14山代表山西省，15内代表蒙古自治区，21代表辽宁省，22代表吉林省，23代表黑龙江省，31代表上海市，32代表江苏省，33代表浙江省，34代表代表安徽省，35代表福建省，36代表江西省，37代表山东省，41代表河南省，42代表湖北省，43代表湖南省，44代表广东省，45代表广西壮族自治区，46代表海南省，50代表重庆市，51代表四川省，52代表贵州省，53代表云南省，54代表西藏自治区，61代表陕西省，62代表甘肃省，63代表青海省，64代表宁夏回族自治区，65代表新疆维吾尔自治区，71代表台湾省，81代表香港特别行政区，82代表澳门特别行政区
  key: string;
  // 户籍所在省分布数量
  number: number;
  static names(): { [key: string]: string } {
    return {
      key: 'key',
      number: 'number',
    };
  }

  static types(): { [key: string]: any } {
    return {
      key: 'string',
      number: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 抗原信息
export class AntigenInfo extends $tea.Model {
  // 抗原检测状态
  antigenResult?: string;
  // 抗原检测时间戳
  antigenTimestamp?: number;
  static names(): { [key: string]: string } {
    return {
      antigenResult: 'antigen_result',
      antigenTimestamp: 'antigen_timestamp',
    };
  }

  static types(): { [key: string]: any } {
    return {
      antigenResult: 'string',
      antigenTimestamp: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 核酸信息
export class NucleicAcidInfo extends $tea.Model {
  // 检测类型
  reportType?: string;
  // 检测结果
  reportResult?: string;
  // 检测机构
  reportOrganization?: string;
  // 检测时间戳(单位: ms)
  reportTimestamp?: number;
  static names(): { [key: string]: string } {
    return {
      reportType: 'report_type',
      reportResult: 'report_result',
      reportOrganization: 'report_organization',
      reportTimestamp: 'report_timestamp',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reportType: 'string',
      reportResult: 'string',
      reportOrganization: 'string',
      reportTimestamp: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 疫苗接种信息
export class VaccinationInfo extends $tea.Model {
  // 疫苗接种信息：
  // 0:查询失败 
  // 1:未接种
  // 2:已接种一针
  // 3:完成接种
  vaccinationCode?: string;
  // 疫苗接种信息
  vaccinationDesc?: string;
  // 疫苗接种时间戳（单位：ms）
  vaccinationTimestamp?: number;
  static names(): { [key: string]: string } {
    return {
      vaccinationCode: 'vaccination_code',
      vaccinationDesc: 'vaccination_desc',
      vaccinationTimestamp: 'vaccination_timestamp',
    };
  }

  static types(): { [key: string]: any } {
    return {
      vaccinationCode: 'string',
      vaccinationDesc: 'string',
      vaccinationTimestamp: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 抗原信息
export class AntigenInformation extends $tea.Model {
  // 抗原结果
  antigenResult: string;
  // 抗原时间
  antigenTime: string;
  static names(): { [key: string]: string } {
    return {
      antigenResult: 'antigen_result',
      antigenTime: 'antigen_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      antigenResult: 'string',
      antigenTime: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 核酸信息
export class NucleicAcidInformation extends $tea.Model {
  // 核酸结果
  nucleicAcidResult: string;
  // 核酸时间
  nucleicAcidTime: string;
  static names(): { [key: string]: string } {
    return {
      nucleicAcidResult: 'nucleic_acid_result',
      nucleicAcidTime: 'nucleic_acid_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      nucleicAcidResult: 'string',
      nucleicAcidTime: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 设备实时通行统计
export class DeviceStatistics extends $tea.Model {
  // 设备SN号
  serialNo: string;
  // 设备状态(初始化:init,在线:online,离线:offline,故障:fault)
  status: string;
  // 通行人次
  total: number;
  // 绿码人次
  green: number;
  // 黄码人次
  yellow: number;
  // 红码人次
  red: number;
  // 码值异常人次
  codeErr: number;
  // 刷脸人次
  face: number;
  // 刷健康码人次
  healthCode: number;
  // 刷身份证人次
  cert: number;
  // 其他方式人次
  otherMode: number;
  // 通行成功人次
  pass: number;
  // 通行失败人次
  stop: number;
  // 平均通行时间(ms)
  avgTime: number;
  // 疫苗未接种人次
  vaccineNo: number;
  // 疫苗接种一针人次
  vaccineFirst: number;
  // 疫苗接种两针人次
  vaccineSecond: number;
  // 疫苗接种三针人次
  vaccineThird: number;
  // 疫苗未查询人次
  vaccineUnknown: number;
  // 核酸有效期24h人次
  nucleicAcid24h: number;
  // 核酸有效期48h人次
  nucleicAcid48h: number;
  // 核酸有效期72h人次
  nucleicAcid72h: number;
  // 核酸有效期7d人次
  nucleicAcid7d: number;
  // 超过7D或无核酸人次
  nucleicAcidOther: number;
  // 体温小于35.5人次
  temperatureA: number;
  // 体温35.5-36度人次
  temperatureB: number;
  // 体温36.1-36.3度人次
  temperatureC: number;
  // 体温36.4-36.7度人次
  temperatureD: number;
  // 体温36.8-37度人次
  temperatureE: number;
  // 体温37.1-37.5度人次
  temperatureF: number;
  // 体温37.6-38度人次
  temperatureG: number;
  // 体温38.1-38.5度人次
  temperatureH: number;
  // 体温38.6-39度人次
  temperatureI: number;
  // 体温大于39人次
  temperatureJ: number;
  // 体温未获取人次
  temperatureK: number;
  // 户籍所在省分布
  identityDistributedList: IdentityDistributed[];
  // 扩展统计字段
  extendArgList: StatisticsExtendArg[];
  static names(): { [key: string]: string } {
    return {
      serialNo: 'serial_no',
      status: 'status',
      total: 'total',
      green: 'green',
      yellow: 'yellow',
      red: 'red',
      codeErr: 'code_err',
      face: 'face',
      healthCode: 'health_code',
      cert: 'cert',
      otherMode: 'other_mode',
      pass: 'pass',
      stop: 'stop',
      avgTime: 'avg_time',
      vaccineNo: 'vaccine_no',
      vaccineFirst: 'vaccine_first',
      vaccineSecond: 'vaccine_second',
      vaccineThird: 'vaccine_third',
      vaccineUnknown: 'vaccine_unknown',
      nucleicAcid24h: 'nucleic_acid24h',
      nucleicAcid48h: 'nucleic_acid48h',
      nucleicAcid72h: 'nucleic_acid72h',
      nucleicAcid7d: 'nucleic_acid7d',
      nucleicAcidOther: 'nucleic_acid_other',
      temperatureA: 'temperature_a',
      temperatureB: 'temperature_b',
      temperatureC: 'temperature_c',
      temperatureD: 'temperature_d',
      temperatureE: 'temperature_e',
      temperatureF: 'temperature_f',
      temperatureG: 'temperature_g',
      temperatureH: 'temperature_h',
      temperatureI: 'temperature_i',
      temperatureJ: 'temperature_j',
      temperatureK: 'temperature_k',
      identityDistributedList: 'identity_distributed_list',
      extendArgList: 'extend_arg_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      serialNo: 'string',
      status: 'string',
      total: 'number',
      green: 'number',
      yellow: 'number',
      red: 'number',
      codeErr: 'number',
      face: 'number',
      healthCode: 'number',
      cert: 'number',
      otherMode: 'number',
      pass: 'number',
      stop: 'number',
      avgTime: 'number',
      vaccineNo: 'number',
      vaccineFirst: 'number',
      vaccineSecond: 'number',
      vaccineThird: 'number',
      vaccineUnknown: 'number',
      nucleicAcid24h: 'number',
      nucleicAcid48h: 'number',
      nucleicAcid72h: 'number',
      nucleicAcid7d: 'number',
      nucleicAcidOther: 'number',
      temperatureA: 'number',
      temperatureB: 'number',
      temperatureC: 'number',
      temperatureD: 'number',
      temperatureE: 'number',
      temperatureF: 'number',
      temperatureG: 'number',
      temperatureH: 'number',
      temperatureI: 'number',
      temperatureJ: 'number',
      temperatureK: 'number',
      identityDistributedList: { 'type': 'array', 'itemType': IdentityDistributed },
      extendArgList: { 'type': 'array', 'itemType': StatisticsExtendArg },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 疫苗信息
export class VaccinationInformation extends $tea.Model {
  // 疫苗接种状态(0查询失败 1未接种 2已接种一针 3完成接种)
  vaccinationStatus: string;
  // 疫苗接种时间
  vaccinationTime: string;
  static names(): { [key: string]: string } {
    return {
      vaccinationStatus: 'vaccination_status',
      vaccinationTime: 'vaccination_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      vaccinationStatus: 'string',
      vaccinationTime: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 设备参数名称/key/value
export class ArgsNameValue extends $tea.Model {
  // 设备参数名称
  argsName?: string;
  // 设备参数key
  argsKey: string;
  // 设备参数value
  argsValue: string;
  // 设备参数标识(ip,mac,bizid)
  argsMark?: string;
  static names(): { [key: string]: string } {
    return {
      argsName: 'args_name',
      argsKey: 'args_key',
      argsValue: 'args_value',
      argsMark: 'args_mark',
    };
  }

  static types(): { [key: string]: any } {
    return {
      argsName: 'string',
      argsKey: 'string',
      argsValue: 'string',
      argsMark: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 查询健康信息扩展参数
export class QueryHealthInfoExtendedArg extends $tea.Model {
  // 参数名
  argKey?: string;
  // 参数值
  argValue?: string;
  static names(): { [key: string]: string } {
    return {
      argKey: 'arg_key',
      argValue: 'arg_value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      argKey: 'string',
      argValue: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 场所信息
export class SceneInformation extends $tea.Model {
  // 场所地址
  sceneAddress: string;
  // 场所ID
  sceneId: string;
  static names(): { [key: string]: string } {
    return {
      sceneAddress: 'scene_address',
      sceneId: 'scene_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      sceneAddress: 'string',
      sceneId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 通行记录
export class HealthInfoLog extends $tea.Model {
  // 身份证号
  certNo: string;
  // 姓名
  certName: string;
  // 健康码颜色(绿色:1,黄码:2,红码:3,灰码:4)
  healthCode: string;
  // 体温
  temperature: string;
  // 行程信息
  // 
  travelInfo: TravelInfo;
  // 核酸信息
  // 
  nucleicAcidInfo: NucleicAcidInfo;
  // 疫苗信息
  // 
  vaccinationInfo: VaccinationInfo;
  // 抗原信息
  // 
  antigenInfo: AntigenInfo;
  // 场所信息
  // 
  sceneInfo: SceneInfo;
  // 数据源通行状态 0:禁止通行,1:允许通行
  // 
  channelPassState: string;
  // 经度
  // 
  longitude: string;
  // 纬度
  latitude: string;
  // 通行方式（1:自动刷脸, 2:刷证非1:1, 3:刷证1:1, 4:反扫, 5:刷奥智定制卡, 6:手动刷脸, 99:刷苏州市民卡
  // 
  passMode: string;
  // 通行时长(单位:毫秒)
  // 
  passDuration: string;
  // 通行时间
  // 
  passTime: string;
  // 通行结果(0:禁止通行,1:允许通行)
  // 
  passResult: string;
  static names(): { [key: string]: string } {
    return {
      certNo: 'cert_no',
      certName: 'cert_name',
      healthCode: 'health_code',
      temperature: 'temperature',
      travelInfo: 'travel_info',
      nucleicAcidInfo: 'nucleic_acid_info',
      vaccinationInfo: 'vaccination_info',
      antigenInfo: 'antigen_info',
      sceneInfo: 'scene_info',
      channelPassState: 'channel_pass_state',
      longitude: 'longitude',
      latitude: 'latitude',
      passMode: 'pass_mode',
      passDuration: 'pass_duration',
      passTime: 'pass_time',
      passResult: 'pass_result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      certNo: 'string',
      certName: 'string',
      healthCode: 'string',
      temperature: 'string',
      travelInfo: TravelInfo,
      nucleicAcidInfo: NucleicAcidInfo,
      vaccinationInfo: VaccinationInfo,
      antigenInfo: AntigenInfo,
      sceneInfo: SceneInfo,
      channelPassState: 'string',
      longitude: 'string',
      latitude: 'string',
      passMode: 'string',
      passDuration: 'string',
      passTime: 'string',
      passResult: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 健康码信息
export class HealthInfo extends $tea.Model {
  // 健康码编码：
  // 1:绿色 ，
  // 2:黄色 ，
  // 3:红色 ，
  // 4.灰码 。
  healthCode?: string;
  // 健康码红色原因
  healthFactor?: string;
  static names(): { [key: string]: string } {
    return {
      healthCode: 'health_code',
      healthFactor: 'health_factor',
    };
  }

  static types(): { [key: string]: any } {
    return {
      healthCode: 'string',
      healthFactor: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 通行日结统计
export class HealthStatistics extends $tea.Model {
  // 统计日期
  statisticsDate: string;
  // 通行总数
  totalCount: number;
  // 刷证数
  certCount: number;
  // 刷脸数
  faceCount: number;
  // 二维码反扫数
  inverseCount: number;
  // 正常通行数
  passCount: number;
  // 禁止通行数
  stopCount: number;
  static names(): { [key: string]: string } {
    return {
      statisticsDate: 'statistics_date',
      totalCount: 'total_count',
      certCount: 'cert_count',
      faceCount: 'face_count',
      inverseCount: 'inverse_count',
      passCount: 'pass_count',
      stopCount: 'stop_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      statisticsDate: 'string',
      totalCount: 'number',
      certCount: 'number',
      faceCount: 'number',
      inverseCount: 'number',
      passCount: 'number',
      stopCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 行程信息
export class TravelInformation extends $tea.Model {
  // 1:没去过疫情区，绿码;
  // 2:去过疫情区，红码;
  // 3:其他，黄码;
  // 0:行程信息不全;
  // -1查询失败
  travelCode: string;
  // 行程途径地
  travelPath: string;
  static names(): { [key: string]: string } {
    return {
      travelCode: 'travel_code',
      travelPath: 'travel_path',
    };
  }

  static types(): { [key: string]: any } {
    return {
      travelCode: 'string',
      travelPath: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryHealthinfoRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 设备SN
  serialNo: string;
  // 设备厂商
  corpName: string;
  // 被查询人姓名
  name: string;
  // 被查询人身份证号
  certNo: string;
  // 防疫信息类型,枚举值如下：
  // 健康信息 health ,
  // 疫苗信息 vaccination ,
  // 核酸信息 nucleicAcid ,
  // 行程信息 travel ,
  // 抗原信息 antigen ,
  // 场景信息  scene .
  // 需要有多项信息类型时，用"|"分隔开。eg: "health|nucleicAcid"
  healthTypes: string;
  // 通行记录ID
  passId?: string;
  // 获取健康信息所需扩展参数列表：体温（temperature：36.5）
  extensionInfo?: QueryHealthInfoExtendedArg[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      serialNo: 'serial_no',
      corpName: 'corp_name',
      name: 'name',
      certNo: 'cert_no',
      healthTypes: 'health_types',
      passId: 'pass_id',
      extensionInfo: 'extension_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      serialNo: 'string',
      corpName: 'string',
      name: 'string',
      certNo: 'string',
      healthTypes: 'string',
      passId: 'string',
      extensionInfo: { 'type': 'array', 'itemType': QueryHealthInfoExtendedArg },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryHealthinfoResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 健康信息
  healthInfo?: HealthInfo;
  // 核酸信息
  nucleicAcidInfo?: NucleicAcidInfo;
  // 行程信息
  // 
  travelInfo?: TravelInfo;
  // 疫苗接种信息
  vaccinationInfo?: VaccinationInfo;
  // 抗原信息
  antigenInfo?: AntigenInfo;
  // 场所信息
  sceneInfo?: SceneInfo;
  // 通行记录ID
  passId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      healthInfo: 'health_info',
      nucleicAcidInfo: 'nucleic_acid_info',
      travelInfo: 'travel_info',
      vaccinationInfo: 'vaccination_info',
      antigenInfo: 'antigen_info',
      sceneInfo: 'scene_info',
      passId: 'pass_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      healthInfo: HealthInfo,
      nucleicAcidInfo: NucleicAcidInfo,
      travelInfo: TravelInfo,
      vaccinationInfo: VaccinationInfo,
      antigenInfo: AntigenInfo,
      sceneInfo: SceneInfo,
      passId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PushHealthinfologRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 通行记录ID
  passId: string;
  // 设备SN
  serialNo: string;
  // 设备厂商
  // 
  corpName: string;
  // 通行时长(ms)
  costTime: number;
  // 通行结果
  passResult?: string;
  // 被查询人姓名
  // 
  name?: string;
  // 被查询人身份证号
  certNo?: string;
  // 异常类型
  errorType?: string;
  // 错误码
  errorCode?: string;
  // 错误信息
  errorMsg?: string;
  // 体温
  temperature?: string;
  // 健康信息
  healthInfo?: HealthInfo;
  // 核酸信息
  nucleicAcidInfo?: NucleicAcidInfo;
  // 行程信息
  // 
  travelInfo?: TravelInfo;
  // 疫苗接种信息
  vaccinationInfo?: VaccinationInfo;
  // 抗原信息
  antigenInfo?: AntigenInfo;
  // 场所信息
  // 
  sceneInfo?: SceneInfo;
  // 通行方式(1:自动刷脸, 2:刷证非1:1, 3:刷证1:1, 4:反扫, 5:刷奥智定制卡, 6:手动刷脸)
  passMode?: string;
  // 经度
  longitude?: string;
  // 纬度
  latitude?: string;
  // 数据源通行状态 0:禁止通行,1:允许通行
  channelPassState?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      passId: 'pass_id',
      serialNo: 'serial_no',
      corpName: 'corp_name',
      costTime: 'cost_time',
      passResult: 'pass_result',
      name: 'name',
      certNo: 'cert_no',
      errorType: 'error_type',
      errorCode: 'error_code',
      errorMsg: 'error_msg',
      temperature: 'temperature',
      healthInfo: 'health_info',
      nucleicAcidInfo: 'nucleic_acid_info',
      travelInfo: 'travel_info',
      vaccinationInfo: 'vaccination_info',
      antigenInfo: 'antigen_info',
      sceneInfo: 'scene_info',
      passMode: 'pass_mode',
      longitude: 'longitude',
      latitude: 'latitude',
      channelPassState: 'channel_pass_state',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      passId: 'string',
      serialNo: 'string',
      corpName: 'string',
      costTime: 'number',
      passResult: 'string',
      name: 'string',
      certNo: 'string',
      errorType: 'string',
      errorCode: 'string',
      errorMsg: 'string',
      temperature: 'string',
      healthInfo: HealthInfo,
      nucleicAcidInfo: NucleicAcidInfo,
      travelInfo: TravelInfo,
      vaccinationInfo: VaccinationInfo,
      antigenInfo: AntigenInfo,
      sceneInfo: SceneInfo,
      passMode: 'string',
      longitude: 'string',
      latitude: 'string',
      channelPassState: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PushHealthinfologResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 通行记录ID
  passId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      passId: 'pass_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      passId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetHealthinfoRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 设备SN
  // 
  serialNo: string;
  // 设备厂商
  // 
  corpName: string;
  // 健康身份二维码
  qrCode: string;
  // 防疫信息类型,枚举值如下： 健康信息 health , 疫苗信息 vaccination , 核酸信息 nucleicAcid , 行程信息 travel , 抗原信息 antigen , 场景信息 scene . 需要有多项信息类型时，用"|"分隔开。eg: "health|nucleicAcid"
  healthTypes: string;
  // 通行记录ID
  // 
  passId?: string;
  // 获取健康信息所需扩展参数列表：体温（temperature：36.5）
  extensionInfo?: QueryHealthInfoExtendedArg[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      serialNo: 'serial_no',
      corpName: 'corp_name',
      qrCode: 'qr_code',
      healthTypes: 'health_types',
      passId: 'pass_id',
      extensionInfo: 'extension_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      serialNo: 'string',
      corpName: 'string',
      qrCode: 'string',
      healthTypes: 'string',
      passId: 'string',
      extensionInfo: { 'type': 'array', 'itemType': QueryHealthInfoExtendedArg },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetHealthinfoResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 健康信息
  // 
  healthInfo?: HealthInfo;
  // 核酸信息
  // 
  nucleicAcidInfo?: NucleicAcidInfo;
  // 行程信息
  // 
  travelInfo?: TravelInfo;
  // 疫苗接种信息
  // 
  vaccinationInfo?: VaccinationInfo;
  // 抗原信息
  // 
  antigenInfo?: AntigenInfo;
  // 场所信息
  // 
  sceneInfo?: SceneInfo;
  // 被查询人姓名
  name?: string;
  // 被查询人身份证号
  // 
  certNo?: string;
  // 通行记录ID
  passId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      healthInfo: 'health_info',
      nucleicAcidInfo: 'nucleic_acid_info',
      travelInfo: 'travel_info',
      vaccinationInfo: 'vaccination_info',
      antigenInfo: 'antigen_info',
      sceneInfo: 'scene_info',
      name: 'name',
      certNo: 'cert_no',
      passId: 'pass_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      healthInfo: HealthInfo,
      nucleicAcidInfo: NucleicAcidInfo,
      travelInfo: TravelInfo,
      vaccinationInfo: VaccinationInfo,
      antigenInfo: AntigenInfo,
      sceneInfo: SceneInfo,
      name: 'string',
      certNo: 'string',
      passId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDeviceargsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 设备SN
  serialNo: string;
  // 设备厂商
  corpName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      serialNo: 'serial_no',
      corpName: 'corp_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      serialNo: 'string',
      corpName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDeviceargsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 设备参数列表
  argsNameValueList?: ArgsNameValue[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      argsNameValueList: 'args_name_value_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      argsNameValueList: { 'type': 'array', 'itemType': ArgsNameValue },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class InitDeviceargsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 设备sn
  serialNo: string;
  // 设备厂商
  corpName: string;
  // 设备参数名称/key/value列表
  argsNameValueList: ArgsNameValue[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      serialNo: 'serial_no',
      corpName: 'corp_name',
      argsNameValueList: 'args_name_value_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      serialNo: 'string',
      corpName: 'string',
      argsNameValueList: { 'type': 'array', 'itemType': ArgsNameValue },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class InitDeviceargsResponse extends $tea.Model {
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

export class QueryHealthinfologRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 开始时间(开始时间-结束时间最大时间为7天)
  startTime: string;
  // 结束时间
  endTime: string;
  // 页码
  pageNum: number;
  // 每页条数
  pageSize: number;
  // 设备号
  serialNo?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      startTime: 'start_time',
      endTime: 'end_time',
      pageNum: 'page_num',
      pageSize: 'page_size',
      serialNo: 'serial_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      startTime: 'string',
      endTime: 'string',
      pageNum: 'number',
      pageSize: 'number',
      serialNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryHealthinfologResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 总条数
  total?: number;
  // 总页数
  pages?: number;
  // 列表数据
  dataList?: HealthInfoLog[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      total: 'total',
      pages: 'pages',
      dataList: 'data_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      total: 'number',
      pages: 'number',
      dataList: { 'type': 'array', 'itemType': HealthInfoLog },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryHealthstatisticsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 开始日期
  startDate: string;
  // 结束日期(为空或等于开始日期时为查询当天,时间范围最大可查询100天)
  endDate?: string;
  // 统计类型(通行人数统计：PERSON，通行次数统计：NUMBER)
  type: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      startDate: 'start_date',
      endDate: 'end_date',
      type: 'type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      startDate: 'string',
      endDate: 'string',
      type: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryHealthstatisticsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 日结统计数据
  dataList?: HealthStatistics[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      dataList: 'data_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      dataList: { 'type': 'array', 'itemType': HealthStatistics },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDevicestatisticsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 设备SN号(最大限制100条)
  serialNoList: string[];
  // 厂商名称
  // 为空时:默认值telpo(天波)
  // 可用枚举值:
  // telpo(天波) 
  // hemiao(禾苗)
  cropName?: string;
  // 开始时间(精确到ms)
  startTime: number;
  // 结束时间(精确到ms,时间跨度不能超过24h)
  endTime: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      serialNoList: 'serial_no_list',
      cropName: 'crop_name',
      startTime: 'start_time',
      endTime: 'end_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      serialNoList: { 'type': 'array', 'itemType': 'string' },
      cropName: 'string',
      startTime: 'number',
      endTime: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDevicestatisticsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 设备实时统计
  dataList?: DeviceStatistics[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      dataList: 'data_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      dataList: { 'type': 'array', 'itemType': DeviceStatistics },
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
      keepAliveDurationMillis: this._keepAliveDurationMillis,
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
          sdk_version: "1.0.18",
          _prod_code: "INTEGRATION_MACHINE",
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
   * Description: 查询防疫健康信息
   * Summary: 查询防疫健康信息
   */
  async queryHealthinfo(request: QueryHealthinfoRequest): Promise<QueryHealthinfoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryHealthinfoEx(request, headers, runtime);
  }

  /**
   * Description: 查询防疫健康信息
   * Summary: 查询防疫健康信息
   */
  async queryHealthinfoEx(request: QueryHealthinfoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryHealthinfoResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryHealthinfoResponse>(await this.doRequest("1.0", "antchain.antim.healthinfo.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryHealthinfoResponse({}));
  }

  /**
   * Description: 上报通行记录
   * Summary: 上报通行记录
   */
  async pushHealthinfolog(request: PushHealthinfologRequest): Promise<PushHealthinfologResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pushHealthinfologEx(request, headers, runtime);
  }

  /**
   * Description: 上报通行记录
   * Summary: 上报通行记录
   */
  async pushHealthinfologEx(request: PushHealthinfologRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PushHealthinfologResponse> {
    Util.validateModel(request);
    return $tea.cast<PushHealthinfologResponse>(await this.doRequest("1.0", "antchain.antim.healthinfolog.push", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PushHealthinfologResponse({}));
  }

  /**
   * Description: 健康身份二维码反查防疫健康信息
   * Summary: 健康身份二维码反查防疫健康信息
   */
  async getHealthinfo(request: GetHealthinfoRequest): Promise<GetHealthinfoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getHealthinfoEx(request, headers, runtime);
  }

  /**
   * Description: 健康身份二维码反查防疫健康信息
   * Summary: 健康身份二维码反查防疫健康信息
   */
  async getHealthinfoEx(request: GetHealthinfoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetHealthinfoResponse> {
    Util.validateModel(request);
    return $tea.cast<GetHealthinfoResponse>(await this.doRequest("1.0", "antchain.antim.healthinfo.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetHealthinfoResponse({}));
  }

  /**
   * Description: 健康码设备配置参数列表查询
   * Summary: 健康码设备配置参数列表查询
   */
  async queryDeviceargs(request: QueryDeviceargsRequest): Promise<QueryDeviceargsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryDeviceargsEx(request, headers, runtime);
  }

  /**
   * Description: 健康码设备配置参数列表查询
   * Summary: 健康码设备配置参数列表查询
   */
  async queryDeviceargsEx(request: QueryDeviceargsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryDeviceargsResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDeviceargsResponse>(await this.doRequest("1.0", "antchain.antim.deviceargs.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryDeviceargsResponse({}));
  }

  /**
   * Description: 健康码设备参数配置初始化
   * Summary: 健康码设备参数配置初始化
   */
  async initDeviceargs(request: InitDeviceargsRequest): Promise<InitDeviceargsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.initDeviceargsEx(request, headers, runtime);
  }

  /**
   * Description: 健康码设备参数配置初始化
   * Summary: 健康码设备参数配置初始化
   */
  async initDeviceargsEx(request: InitDeviceargsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<InitDeviceargsResponse> {
    Util.validateModel(request);
    return $tea.cast<InitDeviceargsResponse>(await this.doRequest("1.0", "antchain.antim.deviceargs.init", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new InitDeviceargsResponse({}));
  }

  /**
   * Description: 通行记录查询
   * Summary: 通行记录查询
   */
  async queryHealthinfolog(request: QueryHealthinfologRequest): Promise<QueryHealthinfologResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryHealthinfologEx(request, headers, runtime);
  }

  /**
   * Description: 通行记录查询
   * Summary: 通行记录查询
   */
  async queryHealthinfologEx(request: QueryHealthinfologRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryHealthinfologResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryHealthinfologResponse>(await this.doRequest("1.0", "antchain.antim.healthinfolog.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryHealthinfologResponse({}));
  }

  /**
   * Description: 通行日结统计查询
   * Summary: 通行日结统计查询
   */
  async queryHealthstatistics(request: QueryHealthstatisticsRequest): Promise<QueryHealthstatisticsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryHealthstatisticsEx(request, headers, runtime);
  }

  /**
   * Description: 通行日结统计查询
   * Summary: 通行日结统计查询
   */
  async queryHealthstatisticsEx(request: QueryHealthstatisticsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryHealthstatisticsResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryHealthstatisticsResponse>(await this.doRequest("1.0", "antchain.antim.healthstatistics.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryHealthstatisticsResponse({}));
  }

  /**
   * Description: 设备实时通行统计查询
   * Summary: 设备实时通行统计查询
   */
  async queryDevicestatistics(request: QueryDevicestatisticsRequest): Promise<QueryDevicestatisticsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryDevicestatisticsEx(request, headers, runtime);
  }

  /**
   * Description: 设备实时通行统计查询
   * Summary: 设备实时通行统计查询
   */
  async queryDevicestatisticsEx(request: QueryDevicestatisticsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryDevicestatisticsResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDevicestatisticsResponse>(await this.doRequest("1.0", "antchain.antim.devicestatistics.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryDevicestatisticsResponse({}));
  }

}
