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

// 数据源接口入参定义
export class InterfaceInput extends $tea.Model {
  // 接口入参名称
  name?: string;
  // 接口入参类型
  type?: string;
  // 接口入参描述
  description?: string;
  // 接口入参是否必填
  required?: boolean;
  static names(): { [key: string]: string } {
    return {
      name: 'name',
      type: 'type',
      description: 'description',
      required: 'required',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
      type: 'string',
      description: 'string',
      required: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 数据源接口出参定义
export class InterfaceOutput extends $tea.Model {
  // 接口出参名称
  name?: string;
  // 接口出参类型
  type?: string;
  // 接口出参描述
  description?: string;
  static names(): { [key: string]: string } {
    return {
      name: 'name',
      type: 'type',
      description: 'description',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
      type: 'string',
      description: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 数据源接口定义
export class DataSourceInterface extends $tea.Model {
  // 数据源接口访问地址
  address: string;
  // 数据源接口请求方法类型
  interfaceRequestMethod: string;
  // 数据源接口入参列表
  interfaceInput?: InterfaceInput[];
  // 数据源接口出参列表
  interfaceOutput?: InterfaceOutput[];
  static names(): { [key: string]: string } {
    return {
      address: 'address',
      interfaceRequestMethod: 'interface_request_method',
      interfaceInput: 'interface_input',
      interfaceOutput: 'interface_output',
    };
  }

  static types(): { [key: string]: any } {
    return {
      address: 'string',
      interfaceRequestMethod: 'string',
      interfaceInput: { 'type': 'array', 'itemType': InterfaceInput },
      interfaceOutput: { 'type': 'array', 'itemType': InterfaceOutput },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 授权人个人信息
export class AuthPersonIndividualInfo extends $tea.Model {
  // 姓名
  individualName: string;
  // 身份证号
  individualId: string;
  // 电话号码
  individualPhoneNum: number;
  static names(): { [key: string]: string } {
    return {
      individualName: 'individual_name',
      individualId: 'individual_id',
      individualPhoneNum: 'individual_phone_num',
    };
  }

  static types(): { [key: string]: any } {
    return {
      individualName: 'string',
      individualId: 'string',
      individualPhoneNum: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 数据源详细信息
export class DataSourceInfo extends $tea.Model {
  // 数据源ID
  id: string;
  // 数据源名称
  name: string;
  // 数据提供方
  provider: string;
  // 枚举值：ENTERPRISE、INDIVIDUAL
  dataOwnerType: string;
  // 数据源接口信息
  dataSourceInterfaceInfo: DataSourceInterface;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      name: 'name',
      provider: 'provider',
      dataOwnerType: 'data_owner_type',
      dataSourceInterfaceInfo: 'data_source_interface_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'string',
      name: 'string',
      provider: 'string',
      dataOwnerType: 'string',
      dataSourceInterfaceInfo: DataSourceInterface,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 授权人企业信息
export class AuthPersonEnterpriseInfo extends $tea.Model {
  // 企业名称
  enterpriseName: string;
  // 企业统一社会信用码
  enterpriseCreditNum: string;
  // 企业法人姓名
  enterpriseLegalPersonName: string;
  // 企业法人身份证号
  enterpriseLegalPersonId: string;
  // 企业法人电话号码
  enterpriseLegalPersonPhoneNum: number;
  static names(): { [key: string]: string } {
    return {
      enterpriseName: 'enterprise_name',
      enterpriseCreditNum: 'enterprise_credit_num',
      enterpriseLegalPersonName: 'enterprise_legal_person_name',
      enterpriseLegalPersonId: 'enterprise_legal_person_id',
      enterpriseLegalPersonPhoneNum: 'enterprise_legal_person_phone_num',
    };
  }

  static types(): { [key: string]: any } {
    return {
      enterpriseName: 'string',
      enterpriseCreditNum: 'string',
      enterpriseLegalPersonName: 'string',
      enterpriseLegalPersonId: 'string',
      enterpriseLegalPersonPhoneNum: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 被授权人信息
export class BeAuthedPersonInfo extends $tea.Model {
  // 企业名称
  enterpriseName: string;
  // 企业统一社会信用码
  enterpriseCreditNum: string;
  // 企业法人姓名
  enterpriseLegalPersonName: string;
  // 企业法人身份证号
  enterpriseLegalPersonId: string;
  static names(): { [key: string]: string } {
    return {
      enterpriseName: 'enterprise_name',
      enterpriseCreditNum: 'enterprise_credit_num',
      enterpriseLegalPersonName: 'enterprise_legal_person_name',
      enterpriseLegalPersonId: 'enterprise_legal_person_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      enterpriseName: 'string',
      enterpriseCreditNum: 'string',
      enterpriseLegalPersonName: 'string',
      enterpriseLegalPersonId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 数据源信息
export class DataSource extends $tea.Model {
  // 数据源ID
  id: string;
  // 数据源接口地址
  address: string;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      address: 'address',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'string',
      address: 'string',
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

export class GetDasLinkRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 被授权人接入应用id
  beAuthedPersonAppId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      beAuthedPersonAppId: 'be_authed_person_app_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      beAuthedPersonAppId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetDasLinkResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // H5应用身份认证信息
  token?: string;
  // 带有token 信息的H5页面链接
  link?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      token: 'token',
      link: 'link',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      token: 'string',
      link: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetDasEnterprisevcRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 授权实例ID
  authInstanceId: string;
  // 授权企业信息
  authPersonEnterpriseInfo: AuthPersonEnterpriseInfo;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      authInstanceId: 'auth_instance_id',
      authPersonEnterpriseInfo: 'auth_person_enterprise_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      authInstanceId: 'string',
      authPersonEnterpriseInfo: AuthPersonEnterpriseInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetDasEnterprisevcResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // VC 内容
  vc?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      vc: 'vc',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      vc: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetDasIndividualvcRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 授权实例ID
  authInstanceId: string;
  // 授权人个人信息
  authedPersonIndividualInfo: AuthPersonIndividualInfo;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      authInstanceId: 'auth_instance_id',
      authedPersonIndividualInfo: 'authed_person_individual_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      authInstanceId: 'string',
      authedPersonIndividualInfo: AuthPersonIndividualInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetDasIndividualvcResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // VC
  vc?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      vc: 'vc',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      vc: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SendDasSmsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 接收方电话号码
  receivePhoneNum: number;
  // 授权实例ID
  authInstanceId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      receivePhoneNum: 'receive_phone_num',
      authInstanceId: 'auth_instance_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      receivePhoneNum: 'number',
      authInstanceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SendDasSmsResponse extends $tea.Model {
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

export class AuthDasSmsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 手机验证码
  verificationCode: string;
  // 授权实例ID
  authInstanceId: string;
  // 被授权企业接入应用ID
  beAuthedPersonAppId: string;
  // 授权企业信息
  authPersonEnterpriseInfo?: AuthPersonEnterpriseInfo;
  // 授权人个人信息
  authPersonIndividualInfo?: AuthPersonIndividualInfo;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      verificationCode: 'verification_code',
      authInstanceId: 'auth_instance_id',
      beAuthedPersonAppId: 'be_authed_person_app_id',
      authPersonEnterpriseInfo: 'auth_person_enterprise_info',
      authPersonIndividualInfo: 'auth_person_individual_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      verificationCode: 'string',
      authInstanceId: 'string',
      beAuthedPersonAppId: 'string',
      authPersonEnterpriseInfo: AuthPersonEnterpriseInfo,
      authPersonIndividualInfo: AuthPersonIndividualInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AuthDasSmsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 授权状态
  authStatus?: string;
  // VC
  vc?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      authStatus: 'auth_status',
      vc: 'vc',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      authStatus: 'string',
      vc: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class VerifyDasEnterpriseRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 被授权企业接入应用ID
  authInstanceId: string;
  // VC完整内容
  vc: string;
  // 被授权企业信息
  beAuthedPersonInfo: BeAuthedPersonInfo;
  // 授权人企业信息
  authPersonEnterpriseInfo: AuthPersonEnterpriseInfo;
  // 需要访问的数据源信息列表
  dataSourceInfo: DataSource[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      authInstanceId: 'auth_instance_id',
      vc: 'vc',
      beAuthedPersonInfo: 'be_authed_person_info',
      authPersonEnterpriseInfo: 'auth_person_enterprise_info',
      dataSourceInfo: 'data_source_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      authInstanceId: 'string',
      vc: 'string',
      beAuthedPersonInfo: BeAuthedPersonInfo,
      authPersonEnterpriseInfo: AuthPersonEnterpriseInfo,
      dataSourceInfo: { 'type': 'array', 'itemType': DataSource },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class VerifyDasEnterpriseResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 核验结果
  success?: boolean;
  // 核验失败原因
  failedReason?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      success: 'success',
      failedReason: 'failed_reason',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      success: 'boolean',
      failedReason: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class VerifyDasIndividualRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 被授权企业接入应用ID
  authInstanceId: string;
  // VC完整内容
  vc: string;
  // 被授权企业信息
  beAuthedPersonInfo: BeAuthedPersonInfo;
  // 授权人个人信息
  authPersonIndividualInfo: AuthPersonIndividualInfo;
  // 需要访问的数据源信息列表
  dataSourceInfo: DataSource[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      authInstanceId: 'auth_instance_id',
      vc: 'vc',
      beAuthedPersonInfo: 'be_authed_person_info',
      authPersonIndividualInfo: 'auth_person_individual_info',
      dataSourceInfo: 'data_source_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      authInstanceId: 'string',
      vc: 'string',
      beAuthedPersonInfo: BeAuthedPersonInfo,
      authPersonIndividualInfo: AuthPersonIndividualInfo,
      dataSourceInfo: { 'type': 'array', 'itemType': DataSource },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class VerifyDasIndividualResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 核验结果
  success?: boolean;
  // 核验失败原因
  failedReason?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      success: 'success',
      failedReason: 'failed_reason',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      success: 'boolean',
      failedReason: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateDasDatasourceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 数据源名称
  name: string;
  // 数据源提供方
  provider: string;
  // 枚举值：ENTERPRISE、INDIVIDUAL
  dataOwnerType: string;
  // 数据源接口定义
  interface: DataSourceInterface;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      name: 'name',
      provider: 'provider',
      dataOwnerType: 'data_owner_type',
      interface: 'interface',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      name: 'string',
      provider: 'string',
      dataOwnerType: 'string',
      interface: DataSourceInterface,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateDasDatasourceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 数据源ID
  id?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      id: 'id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      id: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateDasDatasourceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 要修改的数据源ID
  id: string;
  // 数据源名称
  name: string;
  // 数据源提供方
  provider: string;
  // 枚举值：ENTERPRISE、INDIVIDUAL
  dataOwnerType: string;
  // 数据源接口定义
  interface: DataSourceInterface;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      id: 'id',
      name: 'name',
      provider: 'provider',
      dataOwnerType: 'data_owner_type',
      interface: 'interface',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      id: 'string',
      name: 'string',
      provider: 'string',
      dataOwnerType: 'string',
      interface: DataSourceInterface,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateDasDatasourceResponse extends $tea.Model {
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

export class DeleteDasDatasourceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 要删除的数据源ID
  id: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      id: 'id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      id: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteDasDatasourceResponse extends $tea.Model {
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

export class QueryDasDatasourceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 数据源名称
  name: string;
  // 数据源提供方
  provider?: string;
  // 枚举值：ENTERPRISE、INDIVIDUAL
  dataOwnerType?: string;
  // 数据源接口访问地址
  address?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      name: 'name',
      provider: 'provider',
      dataOwnerType: 'data_owner_type',
      address: 'address',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      name: 'string',
      provider: 'string',
      dataOwnerType: 'string',
      address: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDasDatasourceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 数据源信息列表
  dataSources?: DataSourceInfo[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      dataSources: 'data_sources',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      dataSources: { 'type': 'array', 'itemType': DataSourceInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class VerifyDasAuthresultRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 数据源ID列表
  dataSourceInfo: string[];
  // 被授权企业接入应用名称
  beAuthedPersonAppName: string;
  // 授权企业信息
  authPersonEnterpriseInfo?: AuthPersonEnterpriseInfo;
  // 授权人信息
  authPersonIndividualInfo?: AuthPersonIndividualInfo;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      dataSourceInfo: 'data_source_info',
      beAuthedPersonAppName: 'be_authed_person_app_name',
      authPersonEnterpriseInfo: 'auth_person_enterprise_info',
      authPersonIndividualInfo: 'auth_person_individual_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      dataSourceInfo: { 'type': 'array', 'itemType': 'string' },
      beAuthedPersonAppName: 'string',
      authPersonEnterpriseInfo: AuthPersonEnterpriseInfo,
      authPersonIndividualInfo: AuthPersonIndividualInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class VerifyDasAuthresultResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 授权状态: 已授权,已过期
  authStatus?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      authStatus: 'auth_status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      authStatus: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AuthDasAuthresultRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 数据源ID列表
  dataSourceIds: string[];
  // 被授权企业信息
  beAuthedPersonInfo: BeAuthedPersonInfo;
  // 被授权企业接入应用名称
  beAuthedPersonAppName: string;
  // 授权企业信息
  authPersonEnterpriseInfo?: AuthPersonEnterpriseInfo;
  // 授权人信息
  authPersonIndividualInfo?: AuthPersonIndividualInfo;
  // oss_path 列表
  protocols: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      dataSourceIds: 'data_source_ids',
      beAuthedPersonInfo: 'be_authed_person_info',
      beAuthedPersonAppName: 'be_authed_person_app_name',
      authPersonEnterpriseInfo: 'auth_person_enterprise_info',
      authPersonIndividualInfo: 'auth_person_individual_info',
      protocols: 'protocols',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      dataSourceIds: { 'type': 'array', 'itemType': 'string' },
      beAuthedPersonInfo: BeAuthedPersonInfo,
      beAuthedPersonAppName: 'string',
      authPersonEnterpriseInfo: AuthPersonEnterpriseInfo,
      authPersonIndividualInfo: AuthPersonIndividualInfo,
      protocols: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AuthDasAuthresultResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 被授权企业ID
  beAuthedPersonId?: string;
  // 被授权企业接入应用ID
  beAuthedPersonAppId?: string;
  // 授权实例ID
  authInstanceId?: string;
  // 授权详情ID
  authResultId?: string;
  // VC 完整信息
  vc?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      beAuthedPersonId: 'be_authed_person_id',
      beAuthedPersonAppId: 'be_authed_person_app_id',
      authInstanceId: 'auth_instance_id',
      authResultId: 'auth_result_id',
      vc: 'vc',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      beAuthedPersonId: 'string',
      beAuthedPersonAppId: 'string',
      authInstanceId: 'string',
      authResultId: 'string',
      vc: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UploadAuthinstanceFileRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 协议名称
  fileName: string;
  // 要上传的文件
  fileObject?: Readable;
  fileObjectName?: string;
  fileId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      fileName: 'file_name',
      fileObject: 'fileObject',
      fileObjectName: 'fileObjectName',
      fileId: 'file_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      fileName: 'string',
      fileObject: 'Readable',
      fileObjectName: 'string',
      fileId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UploadAuthinstanceFileResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // oss_path 
  ossPath?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      ossPath: 'oss_path',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      ossPath: 'string',
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
          sdk_version: "1.1.1",
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
   * Description: 获取授权H5页面链接
   * Summary: 获取授权H5页面链接
   */
  async getDasLink(request: GetDasLinkRequest): Promise<GetDasLinkResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getDasLinkEx(request, headers, runtime);
  }

  /**
   * Description: 获取授权H5页面链接
   * Summary: 获取授权H5页面链接
   */
  async getDasLinkEx(request: GetDasLinkRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetDasLinkResponse> {
    Util.validateModel(request);
    return $tea.cast<GetDasLinkResponse>(await this.doRequest("1.0", "antchain.das.das.link.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetDasLinkResponse({}));
  }

  /**
   * Description: 获取授权企业VC
   * Summary: 获取授权企业VC
   */
  async getDasEnterprisevc(request: GetDasEnterprisevcRequest): Promise<GetDasEnterprisevcResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getDasEnterprisevcEx(request, headers, runtime);
  }

  /**
   * Description: 获取授权企业VC
   * Summary: 获取授权企业VC
   */
  async getDasEnterprisevcEx(request: GetDasEnterprisevcRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetDasEnterprisevcResponse> {
    Util.validateModel(request);
    return $tea.cast<GetDasEnterprisevcResponse>(await this.doRequest("1.0", "antchain.das.das.enterprisevc.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetDasEnterprisevcResponse({}));
  }

  /**
   * Description: 获取个人VC
   * Summary: 获取个人VC
   */
  async getDasIndividualvc(request: GetDasIndividualvcRequest): Promise<GetDasIndividualvcResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getDasIndividualvcEx(request, headers, runtime);
  }

  /**
   * Description: 获取个人VC
   * Summary: 获取个人VC
   */
  async getDasIndividualvcEx(request: GetDasIndividualvcRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetDasIndividualvcResponse> {
    Util.validateModel(request);
    return $tea.cast<GetDasIndividualvcResponse>(await this.doRequest("1.0", "antchain.das.das.individualvc.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetDasIndividualvcResponse({}));
  }

  /**
   * Description: 发送短信验证码
   * Summary: 发送短信验证码
   */
  async sendDasSms(request: SendDasSmsRequest): Promise<SendDasSmsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.sendDasSmsEx(request, headers, runtime);
  }

  /**
   * Description: 发送短信验证码
   * Summary: 发送短信验证码
   */
  async sendDasSmsEx(request: SendDasSmsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SendDasSmsResponse> {
    Util.validateModel(request);
    return $tea.cast<SendDasSmsResponse>(await this.doRequest("1.0", "antchain.das.das.sms.send", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SendDasSmsResponse({}));
  }

  /**
   * Description: 通过短信验证码授权
   * Summary: 通过短信验证码授权
   */
  async authDasSms(request: AuthDasSmsRequest): Promise<AuthDasSmsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.authDasSmsEx(request, headers, runtime);
  }

  /**
   * Description: 通过短信验证码授权
   * Summary: 通过短信验证码授权
   */
  async authDasSmsEx(request: AuthDasSmsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AuthDasSmsResponse> {
    Util.validateModel(request);
    return $tea.cast<AuthDasSmsResponse>(await this.doRequest("1.0", "antchain.das.das.sms.auth", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AuthDasSmsResponse({}));
  }

  /**
   * Description: 根据VC针对提供的授权企业、被授权企业、授权数据做核验。
   * Summary: 企业信息核验
   */
  async verifyDasEnterprise(request: VerifyDasEnterpriseRequest): Promise<VerifyDasEnterpriseResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.verifyDasEnterpriseEx(request, headers, runtime);
  }

  /**
   * Description: 根据VC针对提供的授权企业、被授权企业、授权数据做核验。
   * Summary: 企业信息核验
   */
  async verifyDasEnterpriseEx(request: VerifyDasEnterpriseRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<VerifyDasEnterpriseResponse> {
    Util.validateModel(request);
    return $tea.cast<VerifyDasEnterpriseResponse>(await this.doRequest("1.0", "antchain.das.das.enterprise.verify", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new VerifyDasEnterpriseResponse({}));
  }

  /**
   * Description: 个人信息核验
   * Summary: 个人信息核验
   */
  async verifyDasIndividual(request: VerifyDasIndividualRequest): Promise<VerifyDasIndividualResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.verifyDasIndividualEx(request, headers, runtime);
  }

  /**
   * Description: 个人信息核验
   * Summary: 个人信息核验
   */
  async verifyDasIndividualEx(request: VerifyDasIndividualRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<VerifyDasIndividualResponse> {
    Util.validateModel(request);
    return $tea.cast<VerifyDasIndividualResponse>(await this.doRequest("1.0", "antchain.das.das.individual.verify", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new VerifyDasIndividualResponse({}));
  }

  /**
   * Description: 创建数据源
   * Summary: 创建数据源
   */
  async createDasDatasource(request: CreateDasDatasourceRequest): Promise<CreateDasDatasourceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createDasDatasourceEx(request, headers, runtime);
  }

  /**
   * Description: 创建数据源
   * Summary: 创建数据源
   */
  async createDasDatasourceEx(request: CreateDasDatasourceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateDasDatasourceResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateDasDatasourceResponse>(await this.doRequest("1.0", "antchain.das.das.datasource.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateDasDatasourceResponse({}));
  }

  /**
   * Description: 更新数据源
   * Summary: 更新数据源
   */
  async updateDasDatasource(request: UpdateDasDatasourceRequest): Promise<UpdateDasDatasourceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateDasDatasourceEx(request, headers, runtime);
  }

  /**
   * Description: 更新数据源
   * Summary: 更新数据源
   */
  async updateDasDatasourceEx(request: UpdateDasDatasourceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateDasDatasourceResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateDasDatasourceResponse>(await this.doRequest("1.0", "antchain.das.das.datasource.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateDasDatasourceResponse({}));
  }

  /**
   * Description: 删除数据源
   * Summary: 删除数据源
   */
  async deleteDasDatasource(request: DeleteDasDatasourceRequest): Promise<DeleteDasDatasourceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteDasDatasourceEx(request, headers, runtime);
  }

  /**
   * Description: 删除数据源
   * Summary: 删除数据源
   */
  async deleteDasDatasourceEx(request: DeleteDasDatasourceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteDasDatasourceResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteDasDatasourceResponse>(await this.doRequest("1.0", "antchain.das.das.datasource.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteDasDatasourceResponse({}));
  }

  /**
   * Description: 查询数据源信息
   * Summary: 查询数据源信息
   */
  async queryDasDatasource(request: QueryDasDatasourceRequest): Promise<QueryDasDatasourceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryDasDatasourceEx(request, headers, runtime);
  }

  /**
   * Description: 查询数据源信息
   * Summary: 查询数据源信息
   */
  async queryDasDatasourceEx(request: QueryDasDatasourceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryDasDatasourceResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDasDatasourceResponse>(await this.doRequest("1.0", "antchain.das.das.datasource.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryDasDatasourceResponse({}));
  }

  /**
   * Description: 校验授权结果
   * Summary: 校验授权结果
   */
  async verifyDasAuthresult(request: VerifyDasAuthresultRequest): Promise<VerifyDasAuthresultResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.verifyDasAuthresultEx(request, headers, runtime);
  }

  /**
   * Description: 校验授权结果
   * Summary: 校验授权结果
   */
  async verifyDasAuthresultEx(request: VerifyDasAuthresultRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<VerifyDasAuthresultResponse> {
    Util.validateModel(request);
    return $tea.cast<VerifyDasAuthresultResponse>(await this.doRequest("1.0", "antchain.das.das.authresult.verify", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new VerifyDasAuthresultResponse({}));
  }

  /**
   * Description: 根据授权三方信息做授权
   * Summary: 根据授权三方信息做授权
   */
  async authDasAuthresult(request: AuthDasAuthresultRequest): Promise<AuthDasAuthresultResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.authDasAuthresultEx(request, headers, runtime);
  }

  /**
   * Description: 根据授权三方信息做授权
   * Summary: 根据授权三方信息做授权
   */
  async authDasAuthresultEx(request: AuthDasAuthresultRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AuthDasAuthresultResponse> {
    Util.validateModel(request);
    return $tea.cast<AuthDasAuthresultResponse>(await this.doRequest("1.0", "antchain.das.das.authresult.auth", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AuthDasAuthresultResponse({}));
  }

  /**
   * Description: 授权协议上传
   * Summary: 授权协议上传
   */
  async uploadAuthinstanceFile(request: UploadAuthinstanceFileRequest): Promise<UploadAuthinstanceFileResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.uploadAuthinstanceFileEx(request, headers, runtime);
  }

  /**
   * Description: 授权协议上传
   * Summary: 授权协议上传
   */
  async uploadAuthinstanceFileEx(request: UploadAuthinstanceFileRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UploadAuthinstanceFileResponse> {
    if (!Util.isUnset(request.fileObject)) {
      let uploadReq = new CreateAntcloudGatewayxFileUploadRequest({
        authToken: request.authToken,
        apiCode: "antchain.das.authinstance.file.upload",
        fileName: request.fileObjectName,
      });
      let uploadResp = await this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
      if (!AntchainUtil.isSuccess(uploadResp.resultCode, "ok")) {
        let uploadAuthinstanceFileResponse = new UploadAuthinstanceFileResponse({
          reqMsgId: uploadResp.reqMsgId,
          resultCode: uploadResp.resultCode,
          resultMsg: uploadResp.resultMsg,
        });
        return uploadAuthinstanceFileResponse;
      }

      let uploadHeaders = AntchainUtil.parseUploadHeaders(uploadResp.uploadHeaders);
      await AntchainUtil.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
      request.fileId = uploadResp.fileId;
    }

    Util.validateModel(request);
    return $tea.cast<UploadAuthinstanceFileResponse>(await this.doRequest("1.0", "antchain.das.authinstance.file.upload", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UploadAuthinstanceFileResponse({}));
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
