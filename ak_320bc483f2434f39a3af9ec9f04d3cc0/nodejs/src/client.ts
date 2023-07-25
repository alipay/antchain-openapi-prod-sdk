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

// 签署方信息
export class SignatoryInfo extends $tea.Model {
  // 页码信息 （骑缝签署页码为1-2这种，其余情况都是数字）
  posPage: string;
  //  x坐标
  posX: string;
  //  y坐标
  posY: string;
  // 签署区宽 (默认为100)
  width?: string;
  static names(): { [key: string]: string } {
    return {
      posPage: 'pos_page',
      posX: 'pos_x',
      posY: 'pos_y',
      width: 'width',
    };
  }

  static types(): { [key: string]: any } {
    return {
      posPage: 'string',
      posX: 'string',
      posY: 'string',
      width: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 签署链接类
export class SignUrlResp extends $tea.Model {
  // 0-企业 1-用户
  type: number;
  // 企业名称或用户姓名
  name: string;
  // 社会信用代码或身份证号
  certNo: string;
  // 手动签署url（长链接）
  url?: string;
  // 手动签署url(端链接)
  shortUrl?: string;
  // 电子合同签署区id
  signFiledId: string;
  static names(): { [key: string]: string } {
    return {
      type: 'type',
      name: 'name',
      certNo: 'cert_no',
      url: 'url',
      shortUrl: 'short_url',
      signFiledId: 'sign_filed_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      type: 'number',
      name: 'string',
      certNo: 'string',
      url: 'string',
      shortUrl: 'string',
      signFiledId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 用户签署信息
export class SignUserInfo extends $tea.Model {
  // 身份证号
  idNumber: string;
  // 姓名
  name: string;
  // 签署区列表
  signAreaList: SignatoryInfo[];
  static names(): { [key: string]: string } {
    return {
      idNumber: 'id_number',
      name: 'name',
      signAreaList: 'sign_area_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      idNumber: 'string',
      name: 'string',
      signAreaList: { 'type': 'array', 'itemType': SignatoryInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 签署发起返回类
export class ContractSignResponse extends $tea.Model {
  // 流程id
  flowId: string;
  // 签署链接数组
  signUrlList: SignUrlResp[];
  static names(): { [key: string]: string } {
    return {
      flowId: 'flow_id',
      signUrlList: 'sign_url_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      flowId: 'string',
      signUrlList: { 'type': 'array', 'itemType': SignUrlResp },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 签约企业信息
export class SignEnterpriseInfo extends $tea.Model {
  // 公司名称
  organizationName: string;
  // 社会统一信用代码
  uscc: string;
  // 法人姓名
  name: string;
  // 法人身份证号码
  idNumber: string;
  // 签署模式0、自动签署1、手动签署（用户只能手动）
  // 
  signType: number;
  // 签署区列表
  signAreaList: SignatoryInfo[];
  static names(): { [key: string]: string } {
    return {
      organizationName: 'organization_name',
      uscc: 'uscc',
      name: 'name',
      idNumber: 'id_number',
      signType: 'sign_type',
      signAreaList: 'sign_area_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      organizationName: 'string',
      uscc: 'string',
      name: 'string',
      idNumber: 'string',
      signType: 'number',
      signAreaList: { 'type': 'array', 'itemType': SignatoryInfo },
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

export class SignAntsaasStaffingcContractSendRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 合同或模版文件
  fileObject?: Readable;
  fileObjectName?: string;
  fileId?: string;
  // 合同文件（base64格式）
  contractFile: string;
  // 合同类型（1合同文件 2合同模板）
  contractType: number;
  // 合同名称
  contractName: string;
  // 合同文件类型 （pdf、word）
  contractFileType: string;
  // 合同模版参数，json格式，以key value格式存储，合同类型属于模板必填
  simpleFormFields?: string;
  // 签署平台（ALIPAY或H5）
  signPlatform: string;
  // 合同用户信息列表
  signUserList: SignUserInfo[];
  // 合同企业信息列表
  signEnterpriseList: SignEnterpriseInfo[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      fileObject: 'fileObject',
      fileObjectName: 'fileObjectName',
      fileId: 'file_id',
      contractFile: 'contract_file',
      contractType: 'contract_type',
      contractName: 'contract_name',
      contractFileType: 'contract_file_type',
      simpleFormFields: 'simple_form_fields',
      signPlatform: 'sign_platform',
      signUserList: 'sign_user_list',
      signEnterpriseList: 'sign_enterprise_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      fileObject: 'Readable',
      fileObjectName: 'string',
      fileId: 'string',
      contractFile: 'string',
      contractType: 'number',
      contractName: 'string',
      contractFileType: 'string',
      simpleFormFields: 'string',
      signPlatform: 'string',
      signUserList: { 'type': 'array', 'itemType': SignUserInfo },
      signEnterpriseList: { 'type': 'array', 'itemType': SignEnterpriseInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SignAntsaasStaffingcContractSendResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 发起签约返回结果
  response?: ContractSignResponse;
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
      response: ContractSignResponse,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAntsaasStaffingcContractSignRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 流程id
  flowId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      flowId: 'flow_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      flowId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAntsaasStaffingcContractSignResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 流程id
  flowId?: string;
  // 文件有效截止日期
  contractValidity?: number;
  // 流程描述
  flowDesc?: string;
  // 流程开始时间
  flowStartTime?: string;
  // 流程结束时间
  flowEndTime?: string;
  // 流程状态（0-草稿、1-签署中、2-完成、3-撤销、4-终止、5-过期、6-删除、7-拒签）
  flowStatus?: number;
  // 合同文件id
  fileId?: string;
  // 合同文件名称
  fileName?: string;
  // 合同文件下载地址（1小时内有效）
  fileUrl?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      flowId: 'flow_id',
      contractValidity: 'contract_validity',
      flowDesc: 'flow_desc',
      flowStartTime: 'flow_start_time',
      flowEndTime: 'flow_end_time',
      flowStatus: 'flow_status',
      fileId: 'file_id',
      fileName: 'file_name',
      fileUrl: 'file_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      flowId: 'string',
      contractValidity: 'number',
      flowDesc: 'string',
      flowStartTime: 'string',
      flowEndTime: 'string',
      flowStatus: 'number',
      fileId: 'string',
      fileName: 'string',
      fileUrl: 'string',
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
          sdk_version: "1.0.0",
          _prod_code: "ak_320bc483f2434f39a3af9ec9f04d3cc0",
          _prod_channel: "saas",
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
   * Description: 发起签约调用接口
   * Summary: 发起签约
   */
  async signAntsaasStaffingcContractSend(request: SignAntsaasStaffingcContractSendRequest): Promise<SignAntsaasStaffingcContractSendResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.signAntsaasStaffingcContractSendEx(request, headers, runtime);
  }

  /**
   * Description: 发起签约调用接口
   * Summary: 发起签约
   */
  async signAntsaasStaffingcContractSendEx(request: SignAntsaasStaffingcContractSendRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SignAntsaasStaffingcContractSendResponse> {
    if (!Util.isUnset(request.fileObject)) {
      let uploadReq = new CreateAntcloudGatewayxFileUploadRequest({
        authToken: request.authToken,
        apiCode: "antsaas.staffingc.contract.send.sign",
        fileName: request.fileObjectName,
      });
      let uploadResp = await this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
      if (!AntchainUtil.isSuccess(uploadResp.resultCode, "ok")) {
        let signAntsaasStaffingcContractSendResponse = new SignAntsaasStaffingcContractSendResponse({
          reqMsgId: uploadResp.reqMsgId,
          resultCode: uploadResp.resultCode,
          resultMsg: uploadResp.resultMsg,
        });
        return signAntsaasStaffingcContractSendResponse;
      }

      let uploadHeaders = AntchainUtil.parseUploadHeaders(uploadResp.uploadHeaders);
      await AntchainUtil.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
      request.fileId = uploadResp.fileId;
    }

    Util.validateModel(request);
    return $tea.cast<SignAntsaasStaffingcContractSendResponse>(await this.doRequest("1.0", "antsaas.staffingc.contract.send.sign", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SignAntsaasStaffingcContractSendResponse({}));
  }

  /**
   * Description: 签约结果查询
   * Summary: 查询签约结果
   */
  async queryAntsaasStaffingcContractSign(request: QueryAntsaasStaffingcContractSignRequest): Promise<QueryAntsaasStaffingcContractSignResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAntsaasStaffingcContractSignEx(request, headers, runtime);
  }

  /**
   * Description: 签约结果查询
   * Summary: 查询签约结果
   */
  async queryAntsaasStaffingcContractSignEx(request: QueryAntsaasStaffingcContractSignRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAntsaasStaffingcContractSignResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAntsaasStaffingcContractSignResponse>(await this.doRequest("1.0", "antsaas.staffingc.contract.sign.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAntsaasStaffingcContractSignResponse({}));
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
