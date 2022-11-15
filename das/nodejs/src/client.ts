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

// 商标共有人信息
export class TmCoownerInfo extends $tea.Model {
  // 共有人中文名称
  coownerNameCn?: string;
  // 共有人中文地址
  coownerAddrCn?: string;
  // 共有人英文名称
  coownerNameEn?: string;
  // 共有人英文地址
  coownerAddrEn?: string;
  static names(): { [key: string]: string } {
    return {
      coownerNameCn: 'coowner_name_cn',
      coownerAddrCn: 'coowner_addr_cn',
      coownerNameEn: 'coowner_name_en',
      coownerAddrEn: 'coowner_addr_en',
    };
  }

  static types(): { [key: string]: any } {
    return {
      coownerNameCn: 'string',
      coownerAddrCn: 'string',
      coownerNameEn: 'string',
      coownerAddrEn: 'string',
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

// 企业基本信息
export class EnterpriseBaseInfo extends $tea.Model {
  // 机构名称
  orgName: string;
  // 统一社会信用代码
  creditCode: string;
  // 企业公司注册证号
  regNumber: string;
  // 持股比例
  investRate?: string;
  // 查询人与这家企业的关联
  relationship?: string;
  static names(): { [key: string]: string } {
    return {
      orgName: 'org_name',
      creditCode: 'credit_code',
      regNumber: 'reg_number',
      investRate: 'invest_rate',
      relationship: 'relationship',
    };
  }

  static types(): { [key: string]: any } {
    return {
      orgName: 'string',
      creditCode: 'string',
      regNumber: 'string',
      investRate: 'string',
      relationship: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 企业案件信息
export class EnterpriseCaseInfo extends $tea.Model {
  // 立案信息
  caseInfo?: string;
  // 案件号
  caseCode?: string;
  // 立案时间
  caseCreateTime?: string;
  // 案件状态
  caseStatus?: string;
  // 公示状态
  publishStatus?: string;
  // 被执行人姓名
  execName?: string;
  // 执行法院
  execCourtName?: string;
  // 执行标的(元)
  execMoney?: string;
  // 关联裁判文书
  gistId?: string;
  // 案由
  caseType?: string;
  // 创建时间
  createTime?: string;
  static names(): { [key: string]: string } {
    return {
      caseInfo: 'case_info',
      caseCode: 'case_code',
      caseCreateTime: 'case_create_time',
      caseStatus: 'case_status',
      publishStatus: 'publish_status',
      execName: 'exec_name',
      execCourtName: 'exec_court_name',
      execMoney: 'exec_money',
      gistId: 'gist_id',
      caseType: 'case_type',
      createTime: 'create_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      caseInfo: 'string',
      caseCode: 'string',
      caseCreateTime: 'string',
      caseStatus: 'string',
      publishStatus: 'string',
      execName: 'string',
      execCourtName: 'string',
      execMoney: 'string',
      gistId: 'string',
      caseType: 'string',
      createTime: 'string',
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

// 国内商标信息
export class DomesticTmInfo extends $tea.Model {
  // 商标名称
  tmName?: string;
  // 注册证号
  tmRegNum?: string;
  // 国际分类
  intCls?: string;
  // 商标状态
  tmStatus?: string;
  // 专用期开始时间
  propertyBgnDate?: string;
  // 注册日期
  // 
  regDate?: string;
  // 是否共有商标
  isShare?: boolean;
  // 商标共有人信息(共有商标才有该数据)
  coownerInfos?: TmCoownerInfo[];
  // 专用期结束时间
  propertyEndDate?: string;
  // 商标类别
  formType?: string;
  // 权利人中文名称
  ownerNameCn?: string;
  // 权利人中文地址
  ownerAddrCn?: string;
  // 权利人英文名称
  ownerNameEn?: string;
  // 权利人英文地址
  ownerAddrEn?: string;
  // 申请人中文名称
  applicantNameCn?: string;
  // 申请人中文地址
  applicantAddrCn?: string;
  // 申请人外文名称
  applicantNameEn?: string;
  // 申请人英文地址
  applicantAddrEn?: string;
  // 权利人社会信用统一代码
  ownerUscc?: string;
  static names(): { [key: string]: string } {
    return {
      tmName: 'tm_name',
      tmRegNum: 'tm_reg_num',
      intCls: 'int_cls',
      tmStatus: 'tm_status',
      propertyBgnDate: 'property_bgn_date',
      regDate: 'reg_date',
      isShare: 'is_share',
      coownerInfos: 'coowner_infos',
      propertyEndDate: 'property_end_date',
      formType: 'form_type',
      ownerNameCn: 'owner_name_cn',
      ownerAddrCn: 'owner_addr_cn',
      ownerNameEn: 'owner_name_en',
      ownerAddrEn: 'owner_addr_en',
      applicantNameCn: 'applicant_name_cn',
      applicantAddrCn: 'applicant_addr_cn',
      applicantNameEn: 'applicant_name_en',
      applicantAddrEn: 'applicant_addr_en',
      ownerUscc: 'owner_uscc',
    };
  }

  static types(): { [key: string]: any } {
    return {
      tmName: 'string',
      tmRegNum: 'string',
      intCls: 'string',
      tmStatus: 'string',
      propertyBgnDate: 'string',
      regDate: 'string',
      isShare: 'boolean',
      coownerInfos: { 'type': 'array', 'itemType': TmCoownerInfo },
      propertyEndDate: 'string',
      formType: 'string',
      ownerNameCn: 'string',
      ownerAddrCn: 'string',
      ownerNameEn: 'string',
      ownerAddrEn: 'string',
      applicantNameCn: 'string',
      applicantAddrCn: 'string',
      applicantNameEn: 'string',
      applicantAddrEn: 'string',
      ownerUscc: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 数据源详细信息
export class DataSourceInfo extends $tea.Model {
  // 数据源biz_uuid
  bizUuid: string;
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
      bizUuid: 'biz_uuid',
      name: 'name',
      provider: 'provider',
      dataOwnerType: 'data_owner_type',
      dataSourceInterfaceInfo: 'data_source_interface_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      bizUuid: 'string',
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

export class UploadApplicationBatchqueryfileRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 文件md5
  fileMd5: string;
  // 文件id
  fileObject?: Readable;
  fileObjectName?: string;
  fileId: string;
  // 数据集id，开发者提供
  dataSetId: string;
  // 幂等id，同一批任务需使用相同的uniqueId，文件不一样但uniqueId一样，只会有一个任务，任务信息以第一次请求为准
  uniqueId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      fileMd5: 'file_md5',
      fileObject: 'fileObject',
      fileObjectName: 'fileObjectName',
      fileId: 'file_id',
      dataSetId: 'data_set_id',
      uniqueId: 'unique_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      fileMd5: 'string',
      fileObject: 'Readable',
      fileObjectName: 'string',
      fileId: 'string',
      dataSetId: 'string',
      uniqueId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UploadApplicationBatchqueryfileResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 离线任务查询id，批量任务结束后可通过该字段查询结果
  // 
  queryId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      queryId: 'query_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      queryId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryApplicationBatchqueryresultRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 上传待查询数据集文件后得到的查询id，在此接口进行结果查询
  // 
  queryId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      queryId: 'query_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      queryId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryApplicationBatchqueryresultResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 结果文件临时链接
  // 
  filePath?: string;
  // 描述结果文件完成进度：
  // 如：
  // 余额不足，部分内容查询完成
  message?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      filePath: 'file_path',
      message: 'message',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      filePath: 'string',
      message: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryApplicationDataRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 数据集id，开发者提供
  dataSetId: string;
  // 查询数据参数，json串
  index: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      dataSetId: 'data_set_id',
      index: 'index',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      dataSetId: 'string',
      index: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryApplicationDataResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 查询结果
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

export class QueryApplicationIpeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 数据集id，开发者提供
  dataSetId: string;
  // 企业信息
  index: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      dataSetId: 'data_set_id',
      index: 'index',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      dataSetId: 'string',
      index: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryApplicationIpeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 查询结果
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

export class QueryDomesticTrademarkRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 商标名称
  tmName?: string;
  // 商标注册证号
  tmRegNum?: string;
  // 商标所有人名称
  tmOwnerName?: string;
  // 商标所有人社会信用统一代码
  tmOwnerUscc?: string;
  // 数据集ID
  dataSetId: string;
  // 每页的数量
  pageSize: number;
  // 当前页码，从0开始。
  pageNum: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tmName: 'tm_name',
      tmRegNum: 'tm_reg_num',
      tmOwnerName: 'tm_owner_name',
      tmOwnerUscc: 'tm_owner_uscc',
      dataSetId: 'data_set_id',
      pageSize: 'page_size',
      pageNum: 'page_num',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tmName: 'string',
      tmRegNum: 'string',
      tmOwnerName: 'string',
      tmOwnerUscc: 'string',
      dataSetId: 'string',
      pageSize: 'number',
      pageNum: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDomesticTrademarkResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 商标信息列表
  tmInfos?: DomesticTmInfo[];
  // 商标总数
  tmTotal?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      tmInfos: 'tm_infos',
      tmTotal: 'tm_total',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      tmInfos: { 'type': 'array', 'itemType': DomesticTmInfo },
      tmTotal: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetDomesticTrademarklogoRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 数据集ID
  dataSetId: string;
  // 商标注册证号
  tmRegNum: string;
  // 商标类别
  tmFormType: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      dataSetId: 'data_set_id',
      tmRegNum: 'tm_reg_num',
      tmFormType: 'tm_form_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      dataSetId: 'string',
      tmRegNum: 'string',
      tmFormType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetDomesticTrademarklogoResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 商标logo下载地址
  tmLogoUrl?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      tmLogoUrl: 'tm_logo_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      tmLogoUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryEncryptEnterpriseinfoRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 数据集ID
  dataSetId: string;
  // 加密的查询参数
  encryptParameters: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      dataSetId: 'data_set_id',
      encryptParameters: 'encrypt_parameters',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      dataSetId: 'string',
      encryptParameters: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryEncryptEnterpriseinfoResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 加密的企业工商信息
  encryptData?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      encryptData: 'encrypt_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      encryptData: 'string',
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
  // 被授权人接入应用biz_uuid
  beAuthedPersonAppBizUuid: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      beAuthedPersonAppBizUuid: 'be_authed_person_app_biz_uuid',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      beAuthedPersonAppBizUuid: 'string',
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
  // 授权实例biz_uuid
  authInstanceBizUuid: string;
  // 授权企业信息
  authPersonEnterpriseInfo: AuthPersonEnterpriseInfo;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      authInstanceBizUuid: 'auth_instance_biz_uuid',
      authPersonEnterpriseInfo: 'auth_person_enterprise_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      authInstanceBizUuid: 'string',
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
  // 授权实例biz_uuid
  authInstanceBizUuid: string;
  // 授权人个人信息
  authedPersonIndividualInfo: AuthPersonIndividualInfo;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      authInstanceBizUuid: 'auth_instance_biz_uuid',
      authedPersonIndividualInfo: 'authed_person_individual_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      authInstanceBizUuid: 'string',
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
  // 授权实例biz_uuid
  authInstanceBizUuid: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      receivePhoneNum: 'receive_phone_num',
      authInstanceBizUuid: 'auth_instance_biz_uuid',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      receivePhoneNum: 'number',
      authInstanceBizUuid: 'string',
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
  // 授权实例biz_uuid
  authInstanceBizUuid: string;
  // 授权企业信息
  authPersonEnterpriseInfo?: AuthPersonEnterpriseInfo;
  // 授权人个人信息
  authPersonIndividualInfo?: AuthPersonIndividualInfo;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      verificationCode: 'verification_code',
      authInstanceBizUuid: 'auth_instance_biz_uuid',
      authPersonEnterpriseInfo: 'auth_person_enterprise_info',
      authPersonIndividualInfo: 'auth_person_individual_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      verificationCode: 'string',
      authInstanceBizUuid: 'string',
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
  authInstanceBizUuid: string;
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
      authInstanceBizUuid: 'auth_instance_biz_uuid',
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
      authInstanceBizUuid: 'string',
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
  // 授权实例biz_uuid
  authInstanceBizUuid: string;
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
      authInstanceBizUuid: 'auth_instance_biz_uuid',
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
      authInstanceBizUuid: 'string',
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
  dataSourceInterface: DataSourceInterface;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      name: 'name',
      provider: 'provider',
      dataOwnerType: 'data_owner_type',
      dataSourceInterface: 'data_source_interface',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      name: 'string',
      provider: 'string',
      dataOwnerType: 'string',
      dataSourceInterface: DataSourceInterface,
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
  // 数据源 biz_uuid
  bizUuid?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      bizUuid: 'biz_uuid',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      bizUuid: 'string',
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
  // 要修改的数据源biz_uuid
  bizUuid: string;
  // 数据源名称
  name: string;
  // 数据源提供方
  provider: string;
  // 枚举值：ENTERPRISE、INDIVIDUAL
  dataOwnerType: string;
  // 数据源接口定义
  dataSourceInterface: DataSourceInterface;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizUuid: 'biz_uuid',
      name: 'name',
      provider: 'provider',
      dataOwnerType: 'data_owner_type',
      dataSourceInterface: 'data_source_interface',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizUuid: 'string',
      name: 'string',
      provider: 'string',
      dataOwnerType: 'string',
      dataSourceInterface: DataSourceInterface,
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
  // 要删除的数据源biz_uuid
  bizUuid: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizUuid: 'biz_uuid',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizUuid: 'string',
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
  // 数据源biz_uuid列表
  dataSourceBizUuids: string[];
  // 被授权企业接入应用名称
  beAuthedPersonAppName: string;
  // 授权企业统一社会信用码
  authPersonEnterpriseCreditNum: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      dataSourceBizUuids: 'data_source_biz_uuids',
      beAuthedPersonAppName: 'be_authed_person_app_name',
      authPersonEnterpriseCreditNum: 'auth_person_enterprise_credit_num',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      dataSourceBizUuids: { 'type': 'array', 'itemType': 'string' },
      beAuthedPersonAppName: 'string',
      authPersonEnterpriseCreditNum: 'string',
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
  // 授权状态: 未授权，已授权
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
  // 数据源biz_uuid列表
  dataSourceBizUuids: string[];
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
      dataSourceBizUuids: 'data_source_biz_uuids',
      beAuthedPersonAppName: 'be_authed_person_app_name',
      authPersonEnterpriseInfo: 'auth_person_enterprise_info',
      authPersonIndividualInfo: 'auth_person_individual_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      dataSourceBizUuids: { 'type': 'array', 'itemType': 'string' },
      beAuthedPersonAppName: 'string',
      authPersonEnterpriseInfo: AuthPersonEnterpriseInfo,
      authPersonIndividualInfo: AuthPersonIndividualInfo,
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
  // 授权实例biz_uuid
  authInstanceBizUuid?: string;
  // 授权详情biz_uuid
  authResultBizUuid?: string;
  // VC 完整信息
  vc?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      authInstanceBizUuid: 'auth_instance_biz_uuid',
      authResultBizUuid: 'auth_result_biz_uuid',
      vc: 'vc',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      authInstanceBizUuid: 'string',
      authResultBizUuid: 'string',
      vc: 'string',
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
          sdk_version: "1.1.16",
          _prod_code: "DAS",
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
   * Description: 上传批量查询数据文件
   * Summary: 上传批量查询数据文件
   */
  async uploadApplicationBatchqueryfile(request: UploadApplicationBatchqueryfileRequest): Promise<UploadApplicationBatchqueryfileResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.uploadApplicationBatchqueryfileEx(request, headers, runtime);
  }

  /**
   * Description: 上传批量查询数据文件
   * Summary: 上传批量查询数据文件
   */
  async uploadApplicationBatchqueryfileEx(request: UploadApplicationBatchqueryfileRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UploadApplicationBatchqueryfileResponse> {
    if (!Util.isUnset(request.fileObject)) {
      let uploadReq = new CreateAntcloudGatewayxFileUploadRequest({
        authToken: request.authToken,
        apiCode: "antchain.das.application.batchqueryfile.upload",
        fileName: request.fileObjectName,
      });
      let uploadResp = await this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
      if (!AntchainUtil.isSuccess(uploadResp.resultCode, "ok")) {
        let uploadApplicationBatchqueryfileResponse = new UploadApplicationBatchqueryfileResponse({
          reqMsgId: uploadResp.reqMsgId,
          resultCode: uploadResp.resultCode,
          resultMsg: uploadResp.resultMsg,
        });
        return uploadApplicationBatchqueryfileResponse;
      }

      let uploadHeaders = AntchainUtil.parseUploadHeaders(uploadResp.uploadHeaders);
      await AntchainUtil.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
      request.fileId = uploadResp.fileId;
    }

    Util.validateModel(request);
    return $tea.cast<UploadApplicationBatchqueryfileResponse>(await this.doRequest("1.0", "antchain.das.application.batchqueryfile.upload", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UploadApplicationBatchqueryfileResponse({}));
  }

  /**
   * Description: 获取查询数据集任务结果
   * Summary: 获取查询数据集任务结果
   */
  async queryApplicationBatchqueryresult(request: QueryApplicationBatchqueryresultRequest): Promise<QueryApplicationBatchqueryresultResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryApplicationBatchqueryresultEx(request, headers, runtime);
  }

  /**
   * Description: 获取查询数据集任务结果
   * Summary: 获取查询数据集任务结果
   */
  async queryApplicationBatchqueryresultEx(request: QueryApplicationBatchqueryresultRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryApplicationBatchqueryresultResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryApplicationBatchqueryresultResponse>(await this.doRequest("1.0", "antchain.das.application.batchqueryresult.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryApplicationBatchqueryresultResponse({}));
  }

  /**
   * Description: 实时获取数据源数据
   * Summary: 实时查询数据
   */
  async queryApplicationData(request: QueryApplicationDataRequest): Promise<QueryApplicationDataResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryApplicationDataEx(request, headers, runtime);
  }

  /**
   * Description: 实时获取数据源数据
   * Summary: 实时查询数据
   */
  async queryApplicationDataEx(request: QueryApplicationDataRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryApplicationDataResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryApplicationDataResponse>(await this.doRequest("1.0", "antchain.das.application.data.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryApplicationDataResponse({}));
  }

  /**
   * Description: 知识产权实时接口
   * Summary: 知识产权实时接口
   */
  async queryApplicationIpe(request: QueryApplicationIpeRequest): Promise<QueryApplicationIpeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryApplicationIpeEx(request, headers, runtime);
  }

  /**
   * Description: 知识产权实时接口
   * Summary: 知识产权实时接口
   */
  async queryApplicationIpeEx(request: QueryApplicationIpeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryApplicationIpeResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryApplicationIpeResponse>(await this.doRequest("1.0", "antchain.das.application.ipe.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryApplicationIpeResponse({}));
  }

  /**
   * Description: 查询国内商标数据
   * Summary: 查询国内商标数据
   */
  async queryDomesticTrademark(request: QueryDomesticTrademarkRequest): Promise<QueryDomesticTrademarkResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryDomesticTrademarkEx(request, headers, runtime);
  }

  /**
   * Description: 查询国内商标数据
   * Summary: 查询国内商标数据
   */
  async queryDomesticTrademarkEx(request: QueryDomesticTrademarkRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryDomesticTrademarkResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDomesticTrademarkResponse>(await this.doRequest("1.0", "antchain.das.domestic.trademark.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryDomesticTrademarkResponse({}));
  }

  /**
   * Description: 获取国内商标LOGO文件
   * Summary: 获取国内商标LOGO文件
   */
  async getDomesticTrademarklogo(request: GetDomesticTrademarklogoRequest): Promise<GetDomesticTrademarklogoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getDomesticTrademarklogoEx(request, headers, runtime);
  }

  /**
   * Description: 获取国内商标LOGO文件
   * Summary: 获取国内商标LOGO文件
   */
  async getDomesticTrademarklogoEx(request: GetDomesticTrademarklogoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetDomesticTrademarklogoResponse> {
    Util.validateModel(request);
    return $tea.cast<GetDomesticTrademarklogoResponse>(await this.doRequest("1.0", "antchain.das.domestic.trademarklogo.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetDomesticTrademarklogoResponse({}));
  }

  /**
   * Description: 查询加密的企业工商信息
   * Summary: 查询加密的企业工商信息
   */
  async queryEncryptEnterpriseinfo(request: QueryEncryptEnterpriseinfoRequest): Promise<QueryEncryptEnterpriseinfoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryEncryptEnterpriseinfoEx(request, headers, runtime);
  }

  /**
   * Description: 查询加密的企业工商信息
   * Summary: 查询加密的企业工商信息
   */
  async queryEncryptEnterpriseinfoEx(request: QueryEncryptEnterpriseinfoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryEncryptEnterpriseinfoResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryEncryptEnterpriseinfoResponse>(await this.doRequest("1.0", "antchain.das.encrypt.enterpriseinfo.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryEncryptEnterpriseinfoResponse({}));
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
