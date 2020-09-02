# -*- coding: utf-8 -*-
# This file is auto-generated, don't edit it. Thanks.
import time

from antchain_sdk_twc import models as twc_models
from alibabacloud_tea_util.client import Client as UtilClient
from Tea.exceptions import TeaException
from alibabacloud_tea_util import models as util_models
from Tea.request import TeaRequest
from Tea.core import TeaCore
from Tea.response import TeaResponse
from antchain_alipay_util.client import Client as AlipayUtilClient
from alibabacloud_rpc_util.client import Client as RPCUtilClient
from Tea.exceptions import UnretryableException


class Client(object):
    def __init__(self, config, _endpoint=None, _region_id=None, _access_key_id=None, _access_key_secret=None,
                 _protocol=None, _user_agent=None, _read_timeout=None, _connect_timeout=None, _http_proxy=None,
                 _https_proxy=None, _socks_5proxy=None, _socks_5net_work=None, _no_proxy=None, _max_idle_conns=None,
                 _security_token=None):
        """
        Init client with Config

        :param config: config contains the necessary information to create a client
        """
        self._endpoint = _endpoint
        self._region_id = _region_id
        self._access_key_id = _access_key_id
        self._access_key_secret = _access_key_secret
        self._protocol = _protocol
        self._user_agent = _user_agent
        self._read_timeout = _read_timeout
        self._connect_timeout = _connect_timeout
        self._http_proxy = _http_proxy
        self._https_proxy = _https_proxy
        self._socks_5proxy = _socks_5proxy
        self._socks_5net_work = _socks_5net_work
        self._no_proxy = _no_proxy
        self._max_idle_conns = _max_idle_conns
        self._security_token = _security_token
        if UtilClient.is_unset(config):
            raise TeaException({
                "code": "ParameterMissing",
                "message": "'config' can not be unset"
            })
        self._access_key_id = config.access_key_id
        self._access_key_secret = config.access_key_secret
        self._security_token = config.security_token
        self._endpoint = config.endpoint
        self._protocol = config.protocol
        self._user_agent = config.user_agent
        self._read_timeout = config.read_timeout
        self._connect_timeout = config.connect_timeout
        self._http_proxy = config.http_proxy
        self._https_proxy = config.https_proxy
        self._no_proxy = config.no_proxy
        self._socks_5proxy = config.socks_5proxy
        self._socks_5net_work = config.socks_5net_work
        self._max_idle_conns = config.max_idle_conns

    def do_request(self, version, action, protocol, method, pathname, request, runtime):
        """
        Encapsulate the request and invoke the network

        :type action: str
        :param action: api name

        :type protocol: str
        :param protocol: http or https

        :type method: str
        :param method: e.g. GET

        :type pathname: str
        :param pathname: pathname of every api

        :type request: dict
        :param request: which contains request params

        :param runtime: which controls some details of call api, such as retry times

        :return: the response
        """
        runtime.validate()
        _runtime = {
            "timeouted": "retry",
            "readTimeout": UtilClient.default_number(runtime.read_timeout, self._read_timeout),
            "connectTimeout": UtilClient.default_number(runtime.connect_timeout, self._connect_timeout),
            "httpProxy": UtilClient.default_string(runtime.http_proxy, self._http_proxy),
            "httpsProxy": UtilClient.default_string(runtime.https_proxy, self._https_proxy),
            "noProxy": UtilClient.default_string(runtime.no_proxy, self._no_proxy),
            "maxIdleConns": UtilClient.default_number(runtime.max_idle_conns, self._max_idle_conns),
            "retry": {
                "retryable": runtime.autoretry,
                "maxAttempts": UtilClient.default_number(runtime.max_attempts, 3)
            },
            "backoff": {
                "policy": UtilClient.default_string(runtime.backoff_policy, "no"),
                "period": UtilClient.default_number(runtime.backoff_period, 1)
            },
            "ignoreSSL": runtime.ignore_ssl
        }
        _last_request = None
        _last_exception = None
        _now = time.time()
        _retry_times = 0
        while TeaCore.allow_retry(_runtime.get('retry'), _retry_times, _now):
            if _retry_times > 0:
                _backoff_time = TeaCore.get_backoff_time(_runtime.get('backoff'), _retry_times)
                if _backoff_time > 0:
                    TeaCore.sleep(_backoff_time)
            _retry_times = _retry_times + 1
            try:
                _request = TeaRequest()
                _request.protocol = UtilClient.default_string(self._protocol, protocol)
                _request.method = method
                _request.pathname = pathname
                _request.query = {
                    "method": action,
                    "version": version,
                    "sign_type": "HmacSHA1",
                    "req_time": AlipayUtilClient.get_timestamp(),
                    "req_msg_id": UtilClient.get_nonce(),
                    "access_key": self._access_key_id,
                    "charset": "UTF-8",
                    "baseSdkVersion": "Tea-SDK",
                    "sdkVersion": "Tea-SDK-20200902"
                }
                if not UtilClient.empty(self._security_token):
                    _request.query["security_token"] = self._security_token
                _request.headers = {
                    "host": self._endpoint,
                    "user-agent": self.get_user_agent()
                }
                tmp = UtilClient.anyify_map_value(RPCUtilClient.query(request))
                _request.body = UtilClient.to_form_string(tmp)
                _request.headers["content-type"] = "application/x-www-form-urlencoded"
                signed_param = TeaCore.merge(_request.query,
                    RPCUtilClient.query(request))
                _request.query["sign"] = AlipayUtilClient.get_signature(signed_param, self._access_key_secret)
                _last_request = _request
                _response = TeaCore.do_action(_request, _runtime)
                obj = UtilClient.read_as_json(_response.body)
                res = UtilClient.assert_as_map(obj)
                resp = UtilClient.assert_as_map(res.get('response'))
                if AlipayUtilClient.has_error(res):
                    raise TeaException({
                        "message": resp.get('result_msg'),
                        "data": resp,
                        "code": resp.get('result_code')
                    })
                return resp
            except Exception as e:
                if TeaCore.is_retryable(e):
                    _last_exception = e
                    continue
                raise e
        raise UnretryableException(_last_request, _last_exception)

    def get_user_agent(self):
        """
        Get user agent

        :return: user agent
        """
        user_agent = "TeaClient/1.0.0"
        return UtilClient.get_user_agent(user_agent)

    def callback_twc_notary_arbitration_status(self, request):
        """
        Description: 提供给第三方仲裁isv的仲裁申请状态变化回调接口
        Summary: 仲裁状态信息变更回调接口
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.callback_twc_notary_arbitration_status_ex(request, runtime)

    def callback_twc_notary_arbitration_status_ex(self, request, runtime):
        """
        Description: 提供给第三方仲裁isv的仲裁申请状态变化回调接口
        Summary: 仲裁状态信息变更回调接口
        """
        UtilClient.validate_model(request)
        return twc_models.CallbackTwcNotaryArbitrationStatusResponse().from_map(self.do_request("1.0", "twc.notary.arbitration.status.callback", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def create_twc_notary_contract_account(self, request):
        """
        Description: 调用本接口创建个人账号，后续有关该用户的所有操作都需使用该用户的accountId。如提供用户证件信息，则将根据提供的用户证件信息申请数字证书。
        Summary: 创建电子合同签署个人帐户
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.create_twc_notary_contract_account_ex(request, runtime)

    def create_twc_notary_contract_account_ex(self, request, runtime):
        """
        Description: 调用本接口创建个人账号，后续有关该用户的所有操作都需使用该用户的accountId。如提供用户证件信息，则将根据提供的用户证件信息申请数字证书。
        Summary: 创建电子合同签署个人帐户
        """
        UtilClient.validate_model(request)
        return twc_models.CreateTwcNotaryContractAccountResponse().from_map(self.do_request("1.0", "twc.notary.contract.account.create", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def create_twc_notary_contract_accountseal(self, request):
        """
        Description: 通过模版参数，创建个人印章
        Summary: 创建电子合同个人帐户印章
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.create_twc_notary_contract_accountseal_ex(request, runtime)

    def create_twc_notary_contract_accountseal_ex(self, request, runtime):
        """
        Description: 通过模版参数，创建个人印章
        Summary: 创建电子合同个人帐户印章
        """
        UtilClient.validate_model(request)
        return twc_models.CreateTwcNotaryContractAccountsealResponse().from_map(self.do_request("1.0", "twc.notary.contract.accountseal.create", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def create_twc_notary_contract_organization(self, request):
        """
        Description: 对接方调用本接口创建机构账号，后续有关该机构的所有操作都需使用该机构的orgId。如提供机构证件信息，则将根据提供的机构证件信息申请数字证书。
        创建机构账号前需要先创建一个个人账号并通过本接口传给服务器，该个人账号将作为该机构签署的经办人，代表企业完成实名认证和意愿认证，并完成签署操作。
        Summary: 创建电子合同签署机构帐户
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.create_twc_notary_contract_organization_ex(request, runtime)

    def create_twc_notary_contract_organization_ex(self, request, runtime):
        """
        Description: 对接方调用本接口创建机构账号，后续有关该机构的所有操作都需使用该机构的orgId。如提供机构证件信息，则将根据提供的机构证件信息申请数字证书。
        创建机构账号前需要先创建一个个人账号并通过本接口传给服务器，该个人账号将作为该机构签署的经办人，代表企业完成实名认证和意愿认证，并完成签署操作。
        Summary: 创建电子合同签署机构帐户
        """
        UtilClient.validate_model(request)
        return twc_models.CreateTwcNotaryContractOrganizationResponse().from_map(self.do_request("1.0", "twc.notary.contract.organization.create", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def create_twc_notary_contract_orgseal(self, request):
        """
        Description: 通过模版参数，创建机构印章
        Summary: 创建电子合同机构帐户印章
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.create_twc_notary_contract_orgseal_ex(request, runtime)

    def create_twc_notary_contract_orgseal_ex(self, request, runtime):
        """
        Description: 通过模版参数，创建机构印章
        Summary: 创建电子合同机构帐户印章
        """
        UtilClient.validate_model(request)
        return twc_models.CreateTwcNotaryContractOrgsealResponse().from_map(self.do_request("1.0", "twc.notary.contract.orgseal.create", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def auth_twc_notary_contract_sign(self, request):
        """
        Description: 静默签署授权
        Summary: 静默签署授权
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.auth_twc_notary_contract_sign_ex(request, runtime)

    def auth_twc_notary_contract_sign_ex(self, request, runtime):
        """
        Description: 静默签署授权
        Summary: 静默签署授权
        """
        UtilClient.validate_model(request)
        return twc_models.AuthTwcNotaryContractSignResponse().from_map(self.do_request("1.0", "twc.notary.contract.sign.auth", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def create_twc_notary_contract_template(self, request):
        """
        Description: 通过文件直传地址创建模板，创建模板后上传文件，上传方法请参考文件流上传方法
        Summary: 通过文件上传方式创建电子合同签署模板
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.create_twc_notary_contract_template_ex(request, runtime)

    def create_twc_notary_contract_template_ex(self, request, runtime):
        """
        Description: 通过文件直传地址创建模板，创建模板后上传文件，上传方法请参考文件流上传方法
        Summary: 通过文件上传方式创建电子合同签署模板
        """
        UtilClient.validate_model(request)
        return twc_models.CreateTwcNotaryContractTemplateResponse().from_map(self.do_request("1.0", "twc.notary.contract.template.create", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def create_twc_notary_contract_flow(self, request):
        """
        Description: 创建签署流程
        Summary: 创建电子合同签署流程
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.create_twc_notary_contract_flow_ex(request, runtime)

    def create_twc_notary_contract_flow_ex(self, request, runtime):
        """
        Description: 创建签署流程
        Summary: 创建电子合同签署流程
        """
        UtilClient.validate_model(request)
        return twc_models.CreateTwcNotaryContractFlowResponse().from_map(self.do_request("1.0", "twc.notary.contract.flow.create", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def add_twc_notary_contract_document(self, request):
        """
        Description: 向流程中添加待签署文档，文档必须先用文档管理接口创建，创建方式请参见文件管理接口文档。已经开启的流程不能再添加签署文档。
        Summary: 向电子合同签署流程中添加待签署文档
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.add_twc_notary_contract_document_ex(request, runtime)

    def add_twc_notary_contract_document_ex(self, request, runtime):
        """
        Description: 向流程中添加待签署文档，文档必须先用文档管理接口创建，创建方式请参见文件管理接口文档。已经开启的流程不能再添加签署文档。
        Summary: 向电子合同签署流程中添加待签署文档
        """
        UtilClient.validate_model(request)
        return twc_models.AddTwcNotaryContractDocumentResponse().from_map(self.do_request("1.0", "twc.notary.contract.document.add", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def add_twc_notary_contract_signfield(self, request):
        """
        Description: 向指定流程中创建签署区，每个签署区视为一个任务，系统会自动按照流程流转。 签署区的添加必须在签署文档添加之后, 签署区信息内部包含签署人、签署文档信息。 签署区创建完成，流程开启后，系统将自动完成“用户自动盖章签署区”的盖章。用户可全程无感完成本次签署。创建签署方自动盖章签署区前，需确定已完成账号静默签署授权。签署方自动盖章的合同，需要由对接平台方自行校验真实身份和真实意愿
        Summary: 添加电子合同签署方自动盖章签署区
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.add_twc_notary_contract_signfield_ex(request, runtime)

    def add_twc_notary_contract_signfield_ex(self, request, runtime):
        """
        Description: 向指定流程中创建签署区，每个签署区视为一个任务，系统会自动按照流程流转。 签署区的添加必须在签署文档添加之后, 签署区信息内部包含签署人、签署文档信息。 签署区创建完成，流程开启后，系统将自动完成“用户自动盖章签署区”的盖章。用户可全程无感完成本次签署。创建签署方自动盖章签署区前，需确定已完成账号静默签署授权。签署方自动盖章的合同，需要由对接平台方自行校验真实身份和真实意愿
        Summary: 添加电子合同签署方自动盖章签署区
        """
        UtilClient.validate_model(request)
        return twc_models.AddTwcNotaryContractSignfieldResponse().from_map(self.do_request("1.0", "twc.notary.contract.signfield.add", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def start_twc_notary_contract_flow(self, request):
        """
        Description: 开启签署流程，开启后流程文档不可再添加或修改文档，签署任务会自动按照设置开始流转。流程开启后，归档前，可随时追加签署区（指定签署人的签署信息）
        Summary: 电子合同签署流程开启
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.start_twc_notary_contract_flow_ex(request, runtime)

    def start_twc_notary_contract_flow_ex(self, request, runtime):
        """
        Description: 开启签署流程，开启后流程文档不可再添加或修改文档，签署任务会自动按照设置开始流转。流程开启后，归档前，可随时追加签署区（指定签署人的签署信息）
        Summary: 电子合同签署流程开启
        """
        UtilClient.validate_model(request)
        return twc_models.StartTwcNotaryContractFlowResponse().from_map(self.do_request("1.0", "twc.notary.contract.flow.start", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def save_twc_notary_contract_flow(self, request):
        """
        Description: 手动归档签署流程，归档后所有资源均不可修改。归档前签署流程中的所有签署人必须都签署完成。如创建流程时设置了自动归档，则无需调用本接口，签署完成后系统会自动调用
        Summary: 电子合同签署流程归档
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.save_twc_notary_contract_flow_ex(request, runtime)

    def save_twc_notary_contract_flow_ex(self, request, runtime):
        """
        Description: 手动归档签署流程，归档后所有资源均不可修改。归档前签署流程中的所有签署人必须都签署完成。如创建流程时设置了自动归档，则无需调用本接口，签署完成后系统会自动调用
        Summary: 电子合同签署流程归档
        """
        UtilClient.validate_model(request)
        return twc_models.SaveTwcNotaryContractFlowResponse().from_map(self.do_request("1.0", "twc.notary.contract.flow.save", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def download_twc_notary_contract_document(self, request):
        """
        Description: 流程归档后，查询和下载签署后的文件
        Summary: 电子合同流程文档下载
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.download_twc_notary_contract_document_ex(request, runtime)

    def download_twc_notary_contract_document_ex(self, request, runtime):
        """
        Description: 流程归档后，查询和下载签署后的文件
        Summary: 电子合同流程文档下载
        """
        UtilClient.validate_model(request)
        return twc_models.DownloadTwcNotaryContractDocumentResponse().from_map(self.do_request("1.0", "twc.notary.contract.document.download", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def add_twc_notary_contract_file(self, request):
        """
        Description: 基于文件模板生成待签文件用于后续文件，该文件可用用于签署，也可作为附件
        Summary: 通过电子合同模板添加文档
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.add_twc_notary_contract_file_ex(request, runtime)

    def add_twc_notary_contract_file_ex(self, request, runtime):
        """
        Description: 基于文件模板生成待签文件用于后续文件，该文件可用用于签署，也可作为附件
        Summary: 通过电子合同模板添加文档
        """
        UtilClient.validate_model(request)
        return twc_models.AddTwcNotaryContractFileResponse().from_map(self.do_request("1.0", "twc.notary.contract.file.add", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def create_twc_notary_contract_platform(self, request):
        """
        Description: 电子合同平台方发起注册，提供企业信息、合同签署的经办人信息，注册成为电子合同平台方用户
        Summary: 电子合同平台方注册
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.create_twc_notary_contract_platform_ex(request, runtime)

    def create_twc_notary_contract_platform_ex(self, request, runtime):
        """
        Description: 电子合同平台方发起注册，提供企业信息、合同签署的经办人信息，注册成为电子合同平台方用户
        Summary: 电子合同平台方注册
        """
        UtilClient.validate_model(request)
        return twc_models.CreateTwcNotaryContractPlatformResponse().from_map(self.do_request("1.0", "twc.notary.contract.platform.create", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def create_twc_notary_contract_user(self, request):
        """
        Description: 电子合同平台方提供用户信息，注册成为平台用户
        Summary: 电子合同平台方的用户注册
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.create_twc_notary_contract_user_ex(request, runtime)

    def create_twc_notary_contract_user_ex(self, request, runtime):
        """
        Description: 电子合同平台方提供用户信息，注册成为平台用户
        Summary: 电子合同平台方的用户注册
        """
        UtilClient.validate_model(request)
        return twc_models.CreateTwcNotaryContractUserResponse().from_map(self.do_request("1.0", "twc.notary.contract.user.create", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def start_twc_notary_contract_handsign(self, request):
        """
        Description: 电子合同平台方发起签署流程，用户在H5页面完成手动签署
        Summary: 电子合同平台方发起手动签署流程
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.start_twc_notary_contract_handsign_ex(request, runtime)

    def start_twc_notary_contract_handsign_ex(self, request, runtime):
        """
        Description: 电子合同平台方发起签署流程，用户在H5页面完成手动签署
        Summary: 电子合同平台方发起手动签署流程
        """
        UtilClient.validate_model(request)
        return twc_models.StartTwcNotaryContractHandsignResponse().from_map(self.do_request("1.0", "twc.notary.contract.handsign.start", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def query_twc_notary_contract_flow(self, request):
        """
        Description: 查询签署流程的详细信息，包括流程配置、签署状态等
        Summary: 签署流程查询
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.query_twc_notary_contract_flow_ex(request, runtime)

    def query_twc_notary_contract_flow_ex(self, request, runtime):
        """
        Description: 查询签署流程的详细信息，包括流程配置、签署状态等
        Summary: 签署流程查询
        """
        UtilClient.validate_model(request)
        return twc_models.QueryTwcNotaryContractFlowResponse().from_map(self.do_request("1.0", "twc.notary.contract.flow.query", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def create_twc_notary_contract_accountsealimage(self, request):
        """
        Description: 创建个人/机构图片印章
        Summary: 创建个人/机构图片印章
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.create_twc_notary_contract_accountsealimage_ex(request, runtime)

    def create_twc_notary_contract_accountsealimage_ex(self, request, runtime):
        """
        Description: 创建个人/机构图片印章
        Summary: 创建个人/机构图片印章
        """
        UtilClient.validate_model(request)
        return twc_models.CreateTwcNotaryContractAccountsealimageResponse().from_map(self.do_request("1.0", "twc.notary.contract.accountsealimage.create", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def get_twc_notary_contract_fileuploadurl(self, request):
        """
        Description: 采用文件直传的方式完成用户文件的上传。对接方通过该接口获取文件上传的授权地址
        Summary: 通过上传方式创建文件
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.get_twc_notary_contract_fileuploadurl_ex(request, runtime)

    def get_twc_notary_contract_fileuploadurl_ex(self, request, runtime):
        """
        Description: 采用文件直传的方式完成用户文件的上传。对接方通过该接口获取文件上传的授权地址
        Summary: 通过上传方式创建文件
        """
        UtilClient.validate_model(request)
        return twc_models.GetTwcNotaryContractFileuploadurlResponse().from_map(self.do_request("1.0", "twc.notary.contract.fileuploadurl.get", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def add_twc_notary_contract_platformsignfields(self, request):
        """
        Description: 向指定流程中创建签署区，每个签署区视为一个任务，系统会自动按照流程流转。 签署区的添加必须在签署文档添加之后, 签署区信息内部包含签署文档信息（平台自动签无需指定签署人信息，默认签署人是对接的企业）。
        签署区创建完成，流程开启后，系统将自动完成“对接平台自动盖章签署区”的盖章，对接平台可全程无感完成本次签署。
        Summary: 添加平台自动盖章签署区
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.add_twc_notary_contract_platformsignfields_ex(request, runtime)

    def add_twc_notary_contract_platformsignfields_ex(self, request, runtime):
        """
        Description: 向指定流程中创建签署区，每个签署区视为一个任务，系统会自动按照流程流转。 签署区的添加必须在签署文档添加之后, 签署区信息内部包含签署文档信息（平台自动签无需指定签署人信息，默认签署人是对接的企业）。
        签署区创建完成，流程开启后，系统将自动完成“对接平台自动盖章签署区”的盖章，对接平台可全程无感完成本次签署。
        Summary: 添加平台自动盖章签署区
        """
        UtilClient.validate_model(request)
        return twc_models.AddTwcNotaryContractPlatformsignfieldsResponse().from_map(self.do_request("1.0", "twc.notary.contract.platformsignfields.add", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def get_twc_notary_contract_file(self, request):
        """
        Description: 查询文件详情，包括文件名称、大小、下载地址等
        Summary: 查询文件详情
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.get_twc_notary_contract_file_ex(request, runtime)

    def get_twc_notary_contract_file_ex(self, request, runtime):
        """
        Description: 查询文件详情，包括文件名称、大小、下载地址等
        Summary: 查询文件详情
        """
        UtilClient.validate_model(request)
        return twc_models.GetTwcNotaryContractFileResponse().from_map(self.do_request("1.0", "twc.notary.contract.file.get", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def query_twc_notary_contract_accountseals(self, request):
        """
        Description: 查询个人所有印章
        Summary: 查询个人印章
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.query_twc_notary_contract_accountseals_ex(request, runtime)

    def query_twc_notary_contract_accountseals_ex(self, request, runtime):
        """
        Description: 查询个人所有印章
        Summary: 查询个人印章
        """
        UtilClient.validate_model(request)
        return twc_models.QueryTwcNotaryContractAccountsealsResponse().from_map(self.do_request("1.0", "twc.notary.contract.accountseals.query", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def query_twc_notary_contract_organizationseals(self, request):
        """
        Description: 查询机构所有印章
        Summary: 查询机构印章
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.query_twc_notary_contract_organizationseals_ex(request, runtime)

    def query_twc_notary_contract_organizationseals_ex(self, request, runtime):
        """
        Description: 查询机构所有印章
        Summary: 查询机构印章
        """
        UtilClient.validate_model(request)
        return twc_models.QueryTwcNotaryContractOrganizationsealsResponse().from_map(self.do_request("1.0", "twc.notary.contract.organizationseals.query", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def query_twc_notary_contract_flowsigner(self, request):
        """
        Description: 查询流程所有签署人列表。
        Summary: 查询流程签署人列表
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.query_twc_notary_contract_flowsigner_ex(request, runtime)

    def query_twc_notary_contract_flowsigner_ex(self, request, runtime):
        """
        Description: 查询流程所有签署人列表。
        Summary: 查询流程签署人列表
        """
        UtilClient.validate_model(request)
        return twc_models.QueryTwcNotaryContractFlowsignerResponse().from_map(self.do_request("1.0", "twc.notary.contract.flowsigner.query", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def query_twc_notary_contract_signfields(self, request):
        """
        Description: 查询流程签署区列表，可以查询指定指定id或者签署人所属的签署区
        Summary: 查询签署区列表
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.query_twc_notary_contract_signfields_ex(request, runtime)

    def query_twc_notary_contract_signfields_ex(self, request, runtime):
        """
        Description: 查询流程签署区列表，可以查询指定指定id或者签署人所属的签署区
        Summary: 查询签署区列表
        """
        UtilClient.validate_model(request)
        return twc_models.QueryTwcNotaryContractSignfieldsResponse().from_map(self.do_request("1.0", "twc.notary.contract.signfields.query", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def query_twc_notary_contract_account(self, request):
        """
        Description: 使用创建账号返回的账号id查询用户的账号。
        Summary: 查询个人账号
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.query_twc_notary_contract_account_ex(request, runtime)

    def query_twc_notary_contract_account_ex(self, request, runtime):
        """
        Description: 使用创建账号返回的账号id查询用户的账号。
        Summary: 查询个人账号
        """
        UtilClient.validate_model(request)
        return twc_models.QueryTwcNotaryContractAccountResponse().from_map(self.do_request("1.0", "twc.notary.contract.account.query", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def query_twc_notary_contract_organization(self, request):
        """
        Description: 使用创建账号返回的账号id查询机构账号。
        Summary: 查询机构账号
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.query_twc_notary_contract_organization_ex(request, runtime)

    def query_twc_notary_contract_organization_ex(self, request, runtime):
        """
        Description: 使用创建账号返回的账号id查询机构账号。
        Summary: 查询机构账号
        """
        UtilClient.validate_model(request)
        return twc_models.QueryTwcNotaryContractOrganizationResponse().from_map(self.do_request("1.0", "twc.notary.contract.organization.query", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def query_twc_notary_contract_template(self, request):
        """
        Description: 查询模板详情，包括文件模板基本信息和输入项组件信息
        Summary: 查询模板详情详情
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.query_twc_notary_contract_template_ex(request, runtime)

    def query_twc_notary_contract_template_ex(self, request, runtime):
        """
        Description: 查询模板详情，包括文件模板基本信息和输入项组件信息
        Summary: 查询模板详情详情
        """
        UtilClient.validate_model(request)
        return twc_models.QueryTwcNotaryContractTemplateResponse().from_map(self.do_request("1.0", "twc.notary.contract.template.query", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def create_twc_notary_contract_signflow(self, request):
        """
        Description: 平台方制定签约模板和用户，发起手动签署流程，获得签署流程ID
        Summary: 创建签署流程
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.create_twc_notary_contract_signflow_ex(request, runtime)

    def create_twc_notary_contract_signflow_ex(self, request, runtime):
        """
        Description: 平台方制定签约模板和用户，发起手动签署流程，获得签署流程ID
        Summary: 创建签署流程
        """
        UtilClient.validate_model(request)
        return twc_models.CreateTwcNotaryContractSignflowResponse().from_map(self.do_request("1.0", "twc.notary.contract.signflow.create", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def create_twc_notary_contract_registerzft(self, request):
        """
        Description: 商户签署直付通协议
        Summary: 商户签署直付通协议
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.create_twc_notary_contract_registerzft_ex(request, runtime)

    def create_twc_notary_contract_registerzft_ex(self, request, runtime):
        """
        Description: 商户签署直付通协议
        Summary: 商户签署直付通协议
        """
        UtilClient.validate_model(request)
        return twc_models.CreateTwcNotaryContractRegisterzftResponse().from_map(self.do_request("1.0", "twc.notary.contract.registerzft.create", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def create_twc_notary_contract_platformtemplate(self, request):
        """
        Description: 创建模板的同时，指定平台方签署信息，完成智能合同模板创建
        Summary: 创建智能合同模板
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.create_twc_notary_contract_platformtemplate_ex(request, runtime)

    def create_twc_notary_contract_platformtemplate_ex(self, request, runtime):
        """
        Description: 创建模板的同时，指定平台方签署信息，完成智能合同模板创建
        Summary: 创建智能合同模板
        """
        UtilClient.validate_model(request)
        return twc_models.CreateTwcNotaryContractPlatformtemplateResponse().from_map(self.do_request("1.0", "twc.notary.contract.platformtemplate.create", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def query_twc_notary_contract_merchantzft(self, request):
        """
        Description: 查询商户直付通入驻信息
        Summary: 查询商户直付通入驻信息
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.query_twc_notary_contract_merchantzft_ex(request, runtime)

    def query_twc_notary_contract_merchantzft_ex(self, request, runtime):
        """
        Description: 查询商户直付通入驻信息
        Summary: 查询商户直付通入驻信息
        """
        UtilClient.validate_model(request)
        return twc_models.QueryTwcNotaryContractMerchantzftResponse().from_map(self.do_request("1.0", "twc.notary.contract.merchantzft.query", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def list_twc_notary_contract_outtradeid(self, request):
        """
        Description: 列举本租户合同相关交易
        Summary: 列举本租户合同相关交易
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.list_twc_notary_contract_outtradeid_ex(request, runtime)

    def list_twc_notary_contract_outtradeid_ex(self, request, runtime):
        """
        Description: 列举本租户合同相关交易
        Summary: 列举本租户合同相关交易
        """
        UtilClient.validate_model(request)
        return twc_models.ListTwcNotaryContractOuttradeidResponse().from_map(self.do_request("1.0", "twc.notary.contract.outtradeid.list", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def query_twc_notary_contract_tradedetail(self, request):
        """
        Description: 根据订单id查询订单代扣详情
        Summary: 根据订单id查询订单代扣详情
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.query_twc_notary_contract_tradedetail_ex(request, runtime)

    def query_twc_notary_contract_tradedetail_ex(self, request, runtime):
        """
        Description: 根据订单id查询订单代扣详情
        Summary: 根据订单id查询订单代扣详情
        """
        UtilClient.validate_model(request)
        return twc_models.QueryTwcNotaryContractTradedetailResponse().from_map(self.do_request("1.0", "twc.notary.contract.tradedetail.query", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def create_twc_notary_contract_merchantrefund(self, request):
        """
        Description: 商户根据订单id退款
        Summary: 商户根据订单id退款
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.create_twc_notary_contract_merchantrefund_ex(request, runtime)

    def create_twc_notary_contract_merchantrefund_ex(self, request, runtime):
        """
        Description: 商户根据订单id退款
        Summary: 商户根据订单id退款
        """
        UtilClient.validate_model(request)
        return twc_models.CreateTwcNotaryContractMerchantrefundResponse().from_map(self.do_request("1.0", "twc.notary.contract.merchantrefund.create", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def create_twc_notary_contract_adminaccount(self, request):
        """
        Description: 创建蚂蚁区块链账户
        Summary: 创建蚂蚁区块链账户
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.create_twc_notary_contract_adminaccount_ex(request, runtime)

    def create_twc_notary_contract_adminaccount_ex(self, request, runtime):
        """
        Description: 创建蚂蚁区块链账户
        Summary: 创建蚂蚁区块链账户
        """
        UtilClient.validate_model(request)
        return twc_models.CreateTwcNotaryContractAdminaccountResponse().from_map(self.do_request("1.0", "twc.notary.contract.adminaccount.create", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def list_twc_notary_contract_tradeids(self, request):
        """
        Description: 商户根据合同id列举所有的tradeId
        Summary: 商户根据合同id列举所有的tradeId
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.list_twc_notary_contract_tradeids_ex(request, runtime)

    def list_twc_notary_contract_tradeids_ex(self, request, runtime):
        """
        Description: 商户根据合同id列举所有的tradeId
        Summary: 商户根据合同id列举所有的tradeId
        """
        UtilClient.validate_model(request)
        return twc_models.ListTwcNotaryContractTradeidsResponse().from_map(self.do_request("1.0", "twc.notary.contract.tradeids.list", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def create_twc_notary_contract_commontrigger(self, request):
        """
        Description: 商户上传代扣规则
        Summary: 商户上传代扣规则
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.create_twc_notary_contract_commontrigger_ex(request, runtime)

    def create_twc_notary_contract_commontrigger_ex(self, request, runtime):
        """
        Description: 商户上传代扣规则
        Summary: 商户上传代扣规则
        """
        UtilClient.validate_model(request)
        return twc_models.CreateTwcNotaryContractCommontriggerResponse().from_map(self.do_request("1.0", "twc.notary.contract.commontrigger.create", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def create_twc_notary_contract_merchantindirectzft(self, request):
        """
        Description: 商户入驻直付通，仅供管理员调用
        Summary: 商户入驻直付通，仅供管理员调用
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.create_twc_notary_contract_merchantindirectzft_ex(request, runtime)

    def create_twc_notary_contract_merchantindirectzft_ex(self, request, runtime):
        """
        Description: 商户入驻直付通，仅供管理员调用
        Summary: 商户入驻直付通，仅供管理员调用
        """
        UtilClient.validate_model(request)
        return twc_models.CreateTwcNotaryContractMerchantindirectzftResponse().from_map(self.do_request("1.0", "twc.notary.contract.merchantindirectzft.create", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def query_twc_notary_contract_merchantindirectzft(self, request):
        """
        Description: 根据订单id查询直付通商户入驻信息
        Summary: 根据订单id查询直付通商户入驻信息
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.query_twc_notary_contract_merchantindirectzft_ex(request, runtime)

    def query_twc_notary_contract_merchantindirectzft_ex(self, request, runtime):
        """
        Description: 根据订单id查询直付通商户入驻信息
        Summary: 根据订单id查询直付通商户入驻信息
        """
        UtilClient.validate_model(request)
        return twc_models.QueryTwcNotaryContractMerchantindirectzftResponse().from_map(self.do_request("1.0", "twc.notary.contract.merchantindirectzft.query", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def query_twc_notary_payresultfileurl(self, request):
        """
        Description: 获取支付对账文件的url
        Summary: 获取支付对账文件的url
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.query_twc_notary_payresultfileurl_ex(request, runtime)

    def query_twc_notary_payresultfileurl_ex(self, request, runtime):
        """
        Description: 获取支付对账文件的url
        Summary: 获取支付对账文件的url
        """
        UtilClient.validate_model(request)
        return twc_models.QueryTwcNotaryPayresultfileurlResponse().from_map(self.do_request("1.0", "twc.notary.payresultfileurl.query", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def create_twc_notary_contract_merchantimage(self, request):
        """
        Description: 智能合同图片上传
        Summary: 智能合同图片上传
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.create_twc_notary_contract_merchantimage_ex(request, runtime)

    def create_twc_notary_contract_merchantimage_ex(self, request, runtime):
        """
        Description: 智能合同图片上传
        Summary: 智能合同图片上传
        """
        UtilClient.validate_model(request)
        return twc_models.CreateTwcNotaryContractMerchantimageResponse().from_map(self.do_request("1.0", "twc.notary.contract.merchantimage.create", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def cancel_twc_notary_contract_paytrade(self, request):
        """
        Description: 取消智能合同剩余代扣条目
        Summary: 取消智能合同剩余代扣条目
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.cancel_twc_notary_contract_paytrade_ex(request, runtime)

    def cancel_twc_notary_contract_paytrade_ex(self, request, runtime):
        """
        Description: 取消智能合同剩余代扣条目
        Summary: 取消智能合同剩余代扣条目
        """
        UtilClient.validate_model(request)
        return twc_models.CancelTwcNotaryContractPaytradeResponse().from_map(self.do_request("1.0", "twc.notary.contract.paytrade.cancel", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def create_twc_notary_contract_handsignflow(self, request):
        """
        Description: 创建手动签署流程
        Summary: 创建手动签署流程
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.create_twc_notary_contract_handsignflow_ex(request, runtime)

    def create_twc_notary_contract_handsignflow_ex(self, request, runtime):
        """
        Description: 创建手动签署流程
        Summary: 创建手动签署流程
        """
        UtilClient.validate_model(request)
        return twc_models.CreateTwcNotaryContractHandsignflowResponse().from_map(self.do_request("1.0", "twc.notary.contract.handsignflow.create", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def create_twc_notary_contract_handsignfield(self, request):
        """
        Description: 向指定流程中创建签署区，每个签署区视为一个任务，系统会自动按照流程流转。 签署区的添加必须在签署文档添加之后, 签署区信息内部包含签署文档信息。签署区创建完成，流程开启后，通过获取签署地址接口，可获取用户手动签署链接，通过此链接可打开文件签署页面，进行人工确认签署。
        Summary: 添加电子合同签署方手动盖章签署区
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.create_twc_notary_contract_handsignfield_ex(request, runtime)

    def create_twc_notary_contract_handsignfield_ex(self, request, runtime):
        """
        Description: 向指定流程中创建签署区，每个签署区视为一个任务，系统会自动按照流程流转。 签署区的添加必须在签署文档添加之后, 签署区信息内部包含签署文档信息。签署区创建完成，流程开启后，通过获取签署地址接口，可获取用户手动签署链接，通过此链接可打开文件签署页面，进行人工确认签署。
        Summary: 添加电子合同签署方手动盖章签署区
        """
        UtilClient.validate_model(request)
        return twc_models.CreateTwcNotaryContractHandsignfieldResponse().from_map(self.do_request("1.0", "twc.notary.contract.handsignfield.create", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def get_twc_notary_contract_signurl(self, request):
        """
        Description: 流程开启后，获取指定签署人的签署链接地址，如仅传入签署人账号id，则获取的签署任务链接仅包含本人的签署任务；如同时签署人账号id+机构id，则获取的签署任务链接包含机构与个人的签署任务；organizeId传入0，则返回的任务链接包含签署人“本人+所有代签机构”的签署任务。
        Summary: 获取签署地址
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.get_twc_notary_contract_signurl_ex(request, runtime)

    def get_twc_notary_contract_signurl_ex(self, request, runtime):
        """
        Description: 流程开启后，获取指定签署人的签署链接地址，如仅传入签署人账号id，则获取的签署任务链接仅包含本人的签署任务；如同时签署人账号id+机构id，则获取的签署任务链接包含机构与个人的签署任务；organizeId传入0，则返回的任务链接包含签署人“本人+所有代签机构”的签署任务。
        Summary: 获取签署地址
        """
        UtilClient.validate_model(request)
        return twc_models.GetTwcNotaryContractSignurlResponse().from_map(self.do_request("1.0", "twc.notary.contract.signurl.get", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def create_twc_notary_withhold_agreement(self, request):
        """
        Description: 可信付代扣规则内容创建
        Summary: 可信付代扣规则内容创建
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.create_twc_notary_withhold_agreement_ex(request, runtime)

    def create_twc_notary_withhold_agreement_ex(self, request, runtime):
        """
        Description: 可信付代扣规则内容创建
        Summary: 可信付代扣规则内容创建
        """
        UtilClient.validate_model(request)
        return twc_models.CreateTwcNotaryWithholdAgreementResponse().from_map(self.do_request("1.0", "twc.notary.withhold.agreement.create", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def query_twc_notary_withhold_agreement(self, request):
        """
        Description: 查询消金代扣协议
        Summary: 查询可信付代扣协议内容
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.query_twc_notary_withhold_agreement_ex(request, runtime)

    def query_twc_notary_withhold_agreement_ex(self, request, runtime):
        """
        Description: 查询消金代扣协议
        Summary: 查询可信付代扣协议内容
        """
        UtilClient.validate_model(request)
        return twc_models.QueryTwcNotaryWithholdAgreementResponse().from_map(self.do_request("1.0", "twc.notary.withhold.agreement.query", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def query_twc_notary_withhold_agreementurl(self, request):
        """
        Description: 查询可信付协议的入口
        Summary: 查询可信付协议的入口
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.query_twc_notary_withhold_agreementurl_ex(request, runtime)

    def query_twc_notary_withhold_agreementurl_ex(self, request, runtime):
        """
        Description: 查询可信付协议的入口
        Summary: 查询可信付协议的入口
        """
        UtilClient.validate_model(request)
        return twc_models.QueryTwcNotaryWithholdAgreementurlResponse().from_map(self.do_request("1.0", "twc.notary.withhold.agreementurl.query", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def create_twc_notary_withhold_overduetime(self, request):
        """
        Description: 后台录入商家的产品的逾期日
        Summary: 后台录入商家的产品的逾期日
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.create_twc_notary_withhold_overduetime_ex(request, runtime)

    def create_twc_notary_withhold_overduetime_ex(self, request, runtime):
        """
        Description: 后台录入商家的产品的逾期日
        Summary: 后台录入商家的产品的逾期日
        """
        UtilClient.validate_model(request)
        return twc_models.CreateTwcNotaryWithholdOverduetimeResponse().from_map(self.do_request("1.0", "twc.notary.withhold.overduetime.create", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def send_twc_notary_withhold_deduct(self, request):
        """
        Description: 可信付代扣的扣费请求
        Summary: 发送代扣请求
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.send_twc_notary_withhold_deduct_ex(request, runtime)

    def send_twc_notary_withhold_deduct_ex(self, request, runtime):
        """
        Description: 可信付代扣的扣费请求
        Summary: 发送代扣请求
        """
        UtilClient.validate_model(request)
        return twc_models.SendTwcNotaryWithholdDeductResponse().from_map(self.do_request("1.0", "twc.notary.withhold.deduct.send", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def query_twc_notary_withhold_payresult(self, request):
        """
        Description: 可信付代扣结果查询
        Summary: 可信付代扣结果查询
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.query_twc_notary_withhold_payresult_ex(request, runtime)

    def query_twc_notary_withhold_payresult_ex(self, request, runtime):
        """
        Description: 可信付代扣结果查询
        Summary: 可信付代扣结果查询
        """
        UtilClient.validate_model(request)
        return twc_models.QueryTwcNotaryWithholdPayresultResponse().from_map(self.do_request("1.0", "twc.notary.withhold.payresult.query", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def send_twc_notary_withhold_refund(self, request):
        """
        Description: 可信付退款请求
        Summary: 可信付退款请求
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.send_twc_notary_withhold_refund_ex(request, runtime)

    def send_twc_notary_withhold_refund_ex(self, request, runtime):
        """
        Description: 可信付退款请求
        Summary: 可信付退款请求
        """
        UtilClient.validate_model(request)
        return twc_models.SendTwcNotaryWithholdRefundResponse().from_map(self.do_request("1.0", "twc.notary.withhold.refund.send", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def send_twc_notary_contract_invitation(self, request):
        """
        Description: 创建邀请任务，被邀请人收到通知后需要注册并完成实名认证方可开通电子签名服务。
        Summary: 创建注册邀请任务
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.send_twc_notary_contract_invitation_ex(request, runtime)

    def send_twc_notary_contract_invitation_ex(self, request, runtime):
        """
        Description: 创建邀请任务，被邀请人收到通知后需要注册并完成实名认证方可开通电子签名服务。
        Summary: 创建注册邀请任务
        """
        UtilClient.validate_model(request)
        return twc_models.SendTwcNotaryContractInvitationResponse().from_map(self.do_request("1.0", "twc.notary.contract.invitation.send", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def list_twc_notary_contract_payrule(self, request):
        """
        Description: 查询代扣规则
        Summary: 查询代扣规则
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.list_twc_notary_contract_payrule_ex(request, runtime)

    def list_twc_notary_contract_payrule_ex(self, request, runtime):
        """
        Description: 查询代扣规则
        Summary: 查询代扣规则
        """
        UtilClient.validate_model(request)
        return twc_models.ListTwcNotaryContractPayruleResponse().from_map(self.do_request("1.0", "twc.notary.contract.payrule.list", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def create_twc_notary_withhold_qrcode(self, request):
        """
        Description: 获取可信付免签协议的二维码
        Summary: 获取可信付免签协议的二维码
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.create_twc_notary_withhold_qrcode_ex(request, runtime)

    def create_twc_notary_withhold_qrcode_ex(self, request, runtime):
        """
        Description: 获取可信付免签协议的二维码
        Summary: 获取可信付免签协议的二维码
        """
        UtilClient.validate_model(request)
        return twc_models.CreateTwcNotaryWithholdQrcodeResponse().from_map(self.do_request("1.0", "twc.notary.withhold.qrcode.create", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def cancel_twc_notary_contract_paysingletrade(self, request):
        """
        Description: 取消某一期的代扣规则
        Summary: 取消某一期的代扣规则
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.cancel_twc_notary_contract_paysingletrade_ex(request, runtime)

    def cancel_twc_notary_contract_paysingletrade_ex(self, request, runtime):
        """
        Description: 取消某一期的代扣规则
        Summary: 取消某一期的代扣规则
        """
        UtilClient.validate_model(request)
        return twc_models.CancelTwcNotaryContractPaysingletradeResponse().from_map(self.do_request("1.0", "twc.notary.contract.paysingletrade.cancel", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def apply_twc_notary_contract_callbackkey(self, request):
        """
        Description: 使用区块链合同回调服务，需要申请加签时使用的key。该key每个平台方对应一个，不可变更，多次申请结果幂等。
        Summary: 申请区块链合同回调加签key
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.apply_twc_notary_contract_callbackkey_ex(request, runtime)

    def apply_twc_notary_contract_callbackkey_ex(self, request, runtime):
        """
        Description: 使用区块链合同回调服务，需要申请加签时使用的key。该key每个平台方对应一个，不可变更，多次申请结果幂等。
        Summary: 申请区块链合同回调加签key
        """
        UtilClient.validate_model(request)
        return twc_models.ApplyTwcNotaryContractCallbackkeyResponse().from_map(self.do_request("1.0", "twc.notary.contract.callbackkey.apply", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def deploy_twc_notary_mytf_tapp(self, request):
        """
        Description: mytf的tapp部署
        Summary: mytf的tapp部署
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.deploy_twc_notary_mytf_tapp_ex(request, runtime)

    def deploy_twc_notary_mytf_tapp_ex(self, request, runtime):
        """
        Description: mytf的tapp部署
        Summary: mytf的tapp部署
        """
        UtilClient.validate_model(request)
        return twc_models.DeployTwcNotaryMytfTappResponse().from_map(self.do_request("1.0", "twc.notary.mytf.tapp.deploy", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def check_twc_notary_epidentity_twometa(self, request):
        """
        Description: 输入企业名+证件号，发起企业二要素认证请求。
        Summary: 企业二要素认证
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.check_twc_notary_epidentity_twometa_ex(request, runtime)

    def check_twc_notary_epidentity_twometa_ex(self, request, runtime):
        """
        Description: 输入企业名+证件号，发起企业二要素认证请求。
        Summary: 企业二要素认证
        """
        UtilClient.validate_model(request)
        return twc_models.CheckTwcNotaryEpidentityTwometaResponse().from_map(self.do_request("1.0", "twc.notary.epidentity.twometa.check", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def check_twc_notary_epidentity_threemeta(self, request):
        """
        Description: 输入企业名+证件号+企业法人姓名，发起企业三要素认证请求。
        Summary: 企业三要素认证
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.check_twc_notary_epidentity_threemeta_ex(request, runtime)

    def check_twc_notary_epidentity_threemeta_ex(self, request, runtime):
        """
        Description: 输入企业名+证件号+企业法人姓名，发起企业三要素认证请求。
        Summary: 企业三要素认证
        """
        UtilClient.validate_model(request)
        return twc_models.CheckTwcNotaryEpidentityThreemetaResponse().from_map(self.do_request("1.0", "twc.notary.epidentity.threemeta.check", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def check_twc_notary_epidentity_fourmeta(self, request):
        """
        Description: 输入企业名+证件号+企业法人姓+法人证件号，发起企业四要素认证请求。
        Summary: 企业四要素认证
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.check_twc_notary_epidentity_fourmeta_ex(request, runtime)

    def check_twc_notary_epidentity_fourmeta_ex(self, request, runtime):
        """
        Description: 输入企业名+证件号+企业法人姓+法人证件号，发起企业四要素认证请求。
        Summary: 企业四要素认证
        """
        UtilClient.validate_model(request)
        return twc_models.CheckTwcNotaryEpidentityFourmetaResponse().from_map(self.do_request("1.0", "twc.notary.epidentity.fourmeta.check", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def check_twc_notary_notarization_order(self, request):
        """
        Description: 查询公证订单的有效性
        Summary: 查询公证订单的有效性
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.check_twc_notary_notarization_order_ex(request, runtime)

    def check_twc_notary_notarization_order_ex(self, request, runtime):
        """
        Description: 查询公证订单的有效性
        Summary: 查询公证订单的有效性
        """
        UtilClient.validate_model(request)
        return twc_models.CheckTwcNotaryNotarizationOrderResponse().from_map(self.do_request("1.0", "twc.notary.notarization.order.check", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def update_twc_notary_notarization_order(self, request):
        """
        Description: 更新公证订单状态
        Summary: 更新公证订单状态
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.update_twc_notary_notarization_order_ex(request, runtime)

    def update_twc_notary_notarization_order_ex(self, request, runtime):
        """
        Description: 更新公证订单状态
        Summary: 更新公证订单状态
        """
        UtilClient.validate_model(request)
        return twc_models.UpdateTwcNotaryNotarizationOrderResponse().from_map(self.do_request("1.0", "twc.notary.notarization.order.update", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def set_twc_notary_notarization_order(self, request):
        """
        Description: 设置订单属性
        Summary: 设置订单属性
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.set_twc_notary_notarization_order_ex(request, runtime)

    def set_twc_notary_notarization_order_ex(self, request, runtime):
        """
        Description: 设置订单属性
        Summary: 设置订单属性
        """
        UtilClient.validate_model(request)
        return twc_models.SetTwcNotaryNotarizationOrderResponse().from_map(self.do_request("1.0", "twc.notary.notarization.order.set", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def init_twc_notary_identification_faceauth(self, request):
        """
        Description: 实人认证初始化
        Summary: 实人认证初始化
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.init_twc_notary_identification_faceauth_ex(request, runtime)

    def init_twc_notary_identification_faceauth_ex(self, request, runtime):
        """
        Description: 实人认证初始化
        Summary: 实人认证初始化
        """
        UtilClient.validate_model(request)
        return twc_models.InitTwcNotaryIdentificationFaceauthResponse().from_map(self.do_request("1.0", "twc.notary.identification.faceauth.init", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def certify_twc_notary_identification_faceauth(self, request):
        """
        Description: 发起实人认证
        Summary: 发起实人认证
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.certify_twc_notary_identification_faceauth_ex(request, runtime)

    def certify_twc_notary_identification_faceauth_ex(self, request, runtime):
        """
        Description: 发起实人认证
        Summary: 发起实人认证
        """
        UtilClient.validate_model(request)
        return twc_models.CertifyTwcNotaryIdentificationFaceauthResponse().from_map(self.do_request("1.0", "twc.notary.identification.faceauth.certify", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def query_twc_notary_identification_faceauth(self, request):
        """
        Description: 查询实人认证结果
        Summary: 查询实人认证结果
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.query_twc_notary_identification_faceauth_ex(request, runtime)

    def query_twc_notary_identification_faceauth_ex(self, request, runtime):
        """
        Description: 查询实人认证结果
        Summary: 查询实人认证结果
        """
        UtilClient.validate_model(request)
        return twc_models.QueryTwcNotaryIdentificationFaceauthResponse().from_map(self.do_request("1.0", "twc.notary.identification.faceauth.query", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def query_twc_notary_enterprise_faceauth(self, request):
        """
        Description: 企业法人认证查询结果接口
        Summary: 企业法人认证查询
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.query_twc_notary_enterprise_faceauth_ex(request, runtime)

    def query_twc_notary_enterprise_faceauth_ex(self, request, runtime):
        """
        Description: 企业法人认证查询结果接口
        Summary: 企业法人认证查询
        """
        UtilClient.validate_model(request)
        return twc_models.QueryTwcNotaryEnterpriseFaceauthResponse().from_map(self.do_request("1.0", "twc.notary.enterprise.faceauth.query", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def init_twc_notary_enterprise_faceauth(self, request):
        """
        Description: 企业法人认证初始化接口
        Summary: 企业法人认证初始化
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.init_twc_notary_enterprise_faceauth_ex(request, runtime)

    def init_twc_notary_enterprise_faceauth_ex(self, request, runtime):
        """
        Description: 企业法人认证初始化接口
        Summary: 企业法人认证初始化
        """
        UtilClient.validate_model(request)
        return twc_models.InitTwcNotaryEnterpriseFaceauthResponse().from_map(self.do_request("1.0", "twc.notary.enterprise.faceauth.init", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def certify_twc_notary_enterprise_faceauth(self, request):
        """
        Description: 企业法人认证开始接口
        Summary: 企业法人认证开始
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.certify_twc_notary_enterprise_faceauth_ex(request, runtime)

    def certify_twc_notary_enterprise_faceauth_ex(self, request, runtime):
        """
        Description: 企业法人认证开始接口
        Summary: 企业法人认证开始
        """
        UtilClient.validate_model(request)
        return twc_models.CertifyTwcNotaryEnterpriseFaceauthResponse().from_map(self.do_request("1.0", "twc.notary.enterprise.faceauth.certify", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def create_twc_notary_lease_order(self, request):
        """
        Description: 创建租赁订单
        Summary: 租赁订单创建
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.create_twc_notary_lease_order_ex(request, runtime)

    def create_twc_notary_lease_order_ex(self, request, runtime):
        """
        Description: 创建租赁订单
        Summary: 租赁订单创建
        """
        UtilClient.validate_model(request)
        return twc_models.CreateTwcNotaryLeaseOrderResponse().from_map(self.do_request("1.0", "twc.notary.lease.order.create", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def create_twc_notary_notarization_bill(self, request):
        """
        Description: 电子公证或存证证明场景中，用户通过回传相关信息创建收费订单。
        Summary: 公证场景创建收费订单
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.create_twc_notary_notarization_bill_ex(request, runtime)

    def create_twc_notary_notarization_bill_ex(self, request, runtime):
        """
        Description: 电子公证或存证证明场景中，用户通过回传相关信息创建收费订单。
        Summary: 公证场景创建收费订单
        """
        UtilClient.validate_model(request)
        return twc_models.CreateTwcNotaryNotarizationBillResponse().from_map(self.do_request("1.0", "twc.notary.notarization.bill.create", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def init_twc_notary_certification(self, request):
        """
        Description: 提供必要的存证信息，初始化一个存证证明的订单，提交公证处审核，并返回订单号
        Summary: 初始化存证证明订单
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.init_twc_notary_certification_ex(request, runtime)

    def init_twc_notary_certification_ex(self, request, runtime):
        """
        Description: 提供必要的存证信息，初始化一个存证证明的订单，提交公证处审核，并返回订单号
        Summary: 初始化存证证明订单
        """
        UtilClient.validate_model(request)
        return twc_models.InitTwcNotaryCertificationResponse().from_map(self.do_request("1.0", "twc.notary.certification.init", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def query_twc_notary_certification(self, request):
        """
        Description: 输入申请ID，查询存证证明申请状态，成功后返回下载地址等信息
        Summary: 查询存证证明申请状态
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.query_twc_notary_certification_ex(request, runtime)

    def query_twc_notary_certification_ex(self, request, runtime):
        """
        Description: 输入申请ID，查询存证证明申请状态，成功后返回下载地址等信息
        Summary: 查询存证证明申请状态
        """
        UtilClient.validate_model(request)
        return twc_models.QueryTwcNotaryCertificationResponse().from_map(self.do_request("1.0", "twc.notary.certification.query", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def get_twc_notary_tsr_certificate(self, request):
        """
        Description: 可以根据存证过程中获得当可信时间戳凭证，获取国家授时中心颁发的PDF格式可信时间证书
        Summary: 可信时间凭证服务 - 获取时间凭证证书
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.get_twc_notary_tsr_certificate_ex(request, runtime)

    def get_twc_notary_tsr_certificate_ex(self, request, runtime):
        """
        Description: 可以根据存证过程中获得当可信时间戳凭证，获取国家授时中心颁发的PDF格式可信时间证书
        Summary: 可信时间凭证服务 - 获取时间凭证证书
        """
        UtilClient.validate_model(request)
        return twc_models.GetTwcNotaryTsrCertificateResponse().from_map(self.do_request("1.0", "twc.notary.tsr.certificate.get", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def save_twc_notary_jointconstraint_record(self, request):
        """
        Description: 新增/修改履行记录，依据contractCode与contractFulfillmentCode判断唯一性
        Summary: 联合执行履行记录新增/修改接口
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.save_twc_notary_jointconstraint_record_ex(request, runtime)

    def save_twc_notary_jointconstraint_record_ex(self, request, runtime):
        """
        Description: 新增/修改履行记录，依据contractCode与contractFulfillmentCode判断唯一性
        Summary: 联合执行履行记录新增/修改接口
        """
        UtilClient.validate_model(request)
        return twc_models.SaveTwcNotaryJointconstraintRecordResponse().from_map(self.do_request("1.0", "twc.notary.jointconstraint.record.save", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def delete_twc_notary_jointconstraint_record(self, request):
        """
        Description: 删除履行记录
        Summary: 履行记录删除接口
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.delete_twc_notary_jointconstraint_record_ex(request, runtime)

    def delete_twc_notary_jointconstraint_record_ex(self, request, runtime):
        """
        Description: 删除履行记录
        Summary: 履行记录删除接口
        """
        UtilClient.validate_model(request)
        return twc_models.DeleteTwcNotaryJointconstraintRecordResponse().from_map(self.do_request("1.0", "twc.notary.jointconstraint.record.delete", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def query_twc_notary_jointconstraint_breachrecord(self, request):
        """
        Description: 查询违约记录
        Summary: 违约记录查询接口
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.query_twc_notary_jointconstraint_breachrecord_ex(request, runtime)

    def query_twc_notary_jointconstraint_breachrecord_ex(self, request, runtime):
        """
        Description: 查询违约记录
        Summary: 违约记录查询接口
        """
        UtilClient.validate_model(request)
        return twc_models.QueryTwcNotaryJointconstraintBreachrecordResponse().from_map(self.do_request("1.0", "twc.notary.jointconstraint.breachrecord.query", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def create_twc_notary_trans(self, request):
        """
        Description: 获取存证事务ID
        Summary: 获取存证事务ID
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.create_twc_notary_trans_ex(request, runtime)

    def create_twc_notary_trans_ex(self, request, runtime):
        """
        Description: 获取存证事务ID
        Summary: 获取存证事务ID
        """
        UtilClient.validate_model(request)
        return twc_models.CreateTwcNotaryTransResponse().from_map(self.do_request("1.0", "twc.notary.trans.create", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def get_twc_notary_trans(self, request):
        """
        Description: 通过存证事务Token，获取事务中所有的存证信息
        Summary: 获取事务中所有的存证信息
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.get_twc_notary_trans_ex(request, runtime)

    def get_twc_notary_trans_ex(self, request, runtime):
        """
        Description: 通过存证事务Token，获取事务中所有的存证信息
        Summary: 获取事务中所有的存证信息
        """
        UtilClient.validate_model(request)
        return twc_models.GetTwcNotaryTransResponse().from_map(self.do_request("1.0", "twc.notary.trans.get", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def create_twc_notary_text(self, request):
        """
        Description: 发起文本存证，将文本内容存证上链
        Summary: 文本存证，将文本内容存证上链
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.create_twc_notary_text_ex(request, runtime)

    def create_twc_notary_text_ex(self, request, runtime):
        """
        Description: 发起文本存证，将文本内容存证上链
        Summary: 文本存证，将文本内容存证上链
        """
        UtilClient.validate_model(request)
        return twc_models.CreateTwcNotaryTextResponse().from_map(self.do_request("1.0", "twc.notary.text.create", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def get_twc_notary_text(self, request):
        """
        Description: 用户通过交易哈希获取自己上传的文本存证内容
        Summary: 获取文本存证内容
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.get_twc_notary_text_ex(request, runtime)

    def get_twc_notary_text_ex(self, request, runtime):
        """
        Description: 用户通过交易哈希获取自己上传的文本存证内容
        Summary: 获取文本存证内容
        """
        UtilClient.validate_model(request)
        return twc_models.GetTwcNotaryTextResponse().from_map(self.do_request("1.0", "twc.notary.text.get", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def create_twc_notary_file(self, request):
        """
        Description: 发起文件存证，将文件内容存证上链
        Summary: 文件内容存证上链
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.create_twc_notary_file_ex(request, runtime)

    def create_twc_notary_file_ex(self, request, runtime):
        """
        Description: 发起文件存证，将文件内容存证上链
        Summary: 文件内容存证上链
        """
        UtilClient.validate_model(request)
        return twc_models.CreateTwcNotaryFileResponse().from_map(self.do_request("1.0", "twc.notary.file.create", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def get_twc_notary_file(self, request):
        """
        Description: 用户通过交易哈希获取自己上传的文件存证oss下载地址
        Summary: 获取文件存证oss下载地址
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.get_twc_notary_file_ex(request, runtime)

    def get_twc_notary_file_ex(self, request, runtime):
        """
        Description: 用户通过交易哈希获取自己上传的文件存证oss下载地址
        Summary: 获取文件存证oss下载地址
        """
        UtilClient.validate_model(request)
        return twc_models.GetTwcNotaryFileResponse().from_map(self.do_request("1.0", "twc.notary.file.get", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def create_twc_notary_source(self, request):
        """
        Description: 发起原文存证，将原文内容存证上链
        Summary: 原文内容存证
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.create_twc_notary_source_ex(request, runtime)

    def create_twc_notary_source_ex(self, request, runtime):
        """
        Description: 发起原文存证，将原文内容存证上链
        Summary: 原文内容存证
        """
        UtilClient.validate_model(request)
        return twc_models.CreateTwcNotarySourceResponse().from_map(self.do_request("1.0", "twc.notary.source.create", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def get_twc_notary_source(self, request):
        """
        Description: 用户通过交易哈希获取自己上传的原文存证oss下载地址
        Summary: 获取原文存证oss下载地址
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.get_twc_notary_source_ex(request, runtime)

    def get_twc_notary_source_ex(self, request, runtime):
        """
        Description: 用户通过交易哈希获取自己上传的原文存证oss下载地址
        Summary: 获取原文存证oss下载地址
        """
        UtilClient.validate_model(request)
        return twc_models.GetTwcNotarySourceResponse().from_map(self.do_request("1.0", "twc.notary.source.get", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def check_twc_notary_status(self, request):
        """
        Description: 创建存证后，使用存证凭据核验存证状态。
        Summary: 存证内容核验
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.check_twc_notary_status_ex(request, runtime)

    def check_twc_notary_status_ex(self, request, runtime):
        """
        Description: 创建存证后，使用存证凭据核验存证状态。
        Summary: 存证内容核验
        """
        UtilClient.validate_model(request)
        return twc_models.CheckTwcNotaryStatusResponse().from_map(self.do_request("1.0", "twc.notary.status.check", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def deploy_twc_notary_lease_contract(self, request):
        """
        Description: 融资服务平台部署合约
        Summary: 融资服务平台部署合约
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.deploy_twc_notary_lease_contract_ex(request, runtime)

    def deploy_twc_notary_lease_contract_ex(self, request, runtime):
        """
        Description: 融资服务平台部署合约
        Summary: 融资服务平台部署合约
        """
        UtilClient.validate_model(request)
        return twc_models.DeployTwcNotaryLeaseContractResponse().from_map(self.do_request("1.0", "twc.notary.lease.contract.deploy", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def create_twc_notary_lease_productinfo(self, request):
        """
        Description: 融资服务平台上传商品类别信息
        Summary: 融资服务平台上传商品类别信息
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.create_twc_notary_lease_productinfo_ex(request, runtime)

    def create_twc_notary_lease_productinfo_ex(self, request, runtime):
        """
        Description: 融资服务平台上传商品类别信息
        Summary: 融资服务平台上传商品类别信息
        """
        UtilClient.validate_model(request)
        return twc_models.CreateTwcNotaryLeaseProductinfoResponse().from_map(self.do_request("1.0", "twc.notary.lease.productinfo.create", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def auth_twc_notary_lease_contract(self, request):
        """
        Description: 租赁服务平台授权融资服务平台
        Summary: 租赁服务平台授权融资服务平台
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.auth_twc_notary_lease_contract_ex(request, runtime)

    def auth_twc_notary_lease_contract_ex(self, request, runtime):
        """
        Description: 租赁服务平台授权融资服务平台
        Summary: 租赁服务平台授权融资服务平台
        """
        UtilClient.validate_model(request)
        return twc_models.AuthTwcNotaryLeaseContractResponse().from_map(self.do_request("1.0", "twc.notary.lease.contract.auth", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def create_twc_notary_lease_userinfo(self, request):
        """
        Description: 租赁服务平台上传用户信息
        Summary: 租赁服务平台上传用户信息
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.create_twc_notary_lease_userinfo_ex(request, runtime)

    def create_twc_notary_lease_userinfo_ex(self, request, runtime):
        """
        Description: 租赁服务平台上传用户信息
        Summary: 租赁服务平台上传用户信息
        """
        UtilClient.validate_model(request)
        return twc_models.CreateTwcNotaryLeaseUserinfoResponse().from_map(self.do_request("1.0", "twc.notary.lease.userinfo.create", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def create_twc_notary_lease_orderinfo(self, request):
        """
        Description: 租赁服务平台上传订单产品/服务信息
        Summary: 租赁服务平台上传订单产品/服务信息
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.create_twc_notary_lease_orderinfo_ex(request, runtime)

    def create_twc_notary_lease_orderinfo_ex(self, request, runtime):
        """
        Description: 租赁服务平台上传订单产品/服务信息
        Summary: 租赁服务平台上传订单产品/服务信息
        """
        UtilClient.validate_model(request)
        return twc_models.CreateTwcNotaryLeaseOrderinfoResponse().from_map(self.do_request("1.0", "twc.notary.lease.orderinfo.create", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def create_twc_notary_lease_promise(self, request):
        """
        Description: 租赁服务平台上传承诺信息
        Summary: 租赁服务平台上传承诺信息
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.create_twc_notary_lease_promise_ex(request, runtime)

    def create_twc_notary_lease_promise_ex(self, request, runtime):
        """
        Description: 租赁服务平台上传承诺信息
        Summary: 租赁服务平台上传承诺信息
        """
        UtilClient.validate_model(request)
        return twc_models.CreateTwcNotaryLeasePromiseResponse().from_map(self.do_request("1.0", "twc.notary.lease.promise.create", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def create_twc_notary_lease_verifyinfo(self, request):
        """
        Description: 融资平台上传租赁物购买贷款订单信息
        Summary: 融资平台上传租赁物购买贷款订单信息
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.create_twc_notary_lease_verifyinfo_ex(request, runtime)

    def create_twc_notary_lease_verifyinfo_ex(self, request, runtime):
        """
        Description: 融资平台上传租赁物购买贷款订单信息
        Summary: 融资平台上传租赁物购买贷款订单信息
        """
        UtilClient.validate_model(request)
        return twc_models.CreateTwcNotaryLeaseVerifyinfoResponse().from_map(self.do_request("1.0", "twc.notary.lease.verifyinfo.create", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def create_twc_notary_lease_creditpromise(self, request):
        """
        Description: 融资方上传承诺信息
        Summary: 融资方上传承诺信息
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.create_twc_notary_lease_creditpromise_ex(request, runtime)

    def create_twc_notary_lease_creditpromise_ex(self, request, runtime):
        """
        Description: 融资方上传承诺信息
        Summary: 融资方上传承诺信息
        """
        UtilClient.validate_model(request)
        return twc_models.CreateTwcNotaryLeaseCreditpromiseResponse().from_map(self.do_request("1.0", "twc.notary.lease.creditpromise.create", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def create_twc_notary_lease_disburseinfo(self, request):
        """
        Description: 租赁平台上传支用/还款信息
        Summary: 租赁平台上传支用/还款信息
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.create_twc_notary_lease_disburseinfo_ex(request, runtime)

    def create_twc_notary_lease_disburseinfo_ex(self, request, runtime):
        """
        Description: 租赁平台上传支用/还款信息
        Summary: 租赁平台上传支用/还款信息
        """
        UtilClient.validate_model(request)
        return twc_models.CreateTwcNotaryLeaseDisburseinfoResponse().from_map(self.do_request("1.0", "twc.notary.lease.disburseinfo.create", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def query_twc_notary_lease_orderinfo(self, request):
        """
        Description:  查询订单详细信息
        Summary:  查询订单详细信息
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.query_twc_notary_lease_orderinfo_ex(request, runtime)

    def query_twc_notary_lease_orderinfo_ex(self, request, runtime):
        """
        Description:  查询订单详细信息
        Summary:  查询订单详细信息
        """
        UtilClient.validate_model(request)
        return twc_models.QueryTwcNotaryLeaseOrderinfoResponse().from_map(self.do_request("1.0", "twc.notary.lease.orderinfo.query", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def create_twc_notary_finance_textnotary(self, request):
        """
        Description: 创建金融行业标准文本存证
        Summary: 创建金融行业文本存证
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.create_twc_notary_finance_textnotary_ex(request, runtime)

    def create_twc_notary_finance_textnotary_ex(self, request, runtime):
        """
        Description: 创建金融行业标准文本存证
        Summary: 创建金融行业文本存证
        """
        UtilClient.validate_model(request)
        return twc_models.CreateTwcNotaryFinanceTextnotaryResponse().from_map(self.do_request("1.0", "twc.notary.finance.textnotary.create", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def get_twc_notary_finance_textnotary(self, request):
        """
        Description: 获取金融行业文本存证接口描述
        Summary: 获取金融行业文本存证
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.get_twc_notary_finance_textnotary_ex(request, runtime)

    def get_twc_notary_finance_textnotary_ex(self, request, runtime):
        """
        Description: 获取金融行业文本存证接口描述
        Summary: 获取金融行业文本存证
        """
        UtilClient.validate_model(request)
        return twc_models.GetTwcNotaryFinanceTextnotaryResponse().from_map(self.do_request("1.0", "twc.notary.finance.textnotary.get", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def create_twc_notary_finance_filenotary(self, request):
        """
        Description: 创建金融行业文件存证接口描述
        Summary: 创建金融行业文件存证
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.create_twc_notary_finance_filenotary_ex(request, runtime)

    def create_twc_notary_finance_filenotary_ex(self, request, runtime):
        """
        Description: 创建金融行业文件存证接口描述
        Summary: 创建金融行业文件存证
        """
        UtilClient.validate_model(request)
        return twc_models.CreateTwcNotaryFinanceFilenotaryResponse().from_map(self.do_request("1.0", "twc.notary.finance.filenotary.create", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def get_twc_notary_finance_filenotary(self, request):
        """
        Description: 获取金融行业文件存证接口描述
        Summary: 获取金融行业文件存证
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.get_twc_notary_finance_filenotary_ex(request, runtime)

    def get_twc_notary_finance_filenotary_ex(self, request, runtime):
        """
        Description: 获取金融行业文件存证接口描述
        Summary: 获取金融行业文件存证
        """
        UtilClient.validate_model(request)
        return twc_models.GetTwcNotaryFinanceFilenotaryResponse().from_map(self.do_request("1.0", "twc.notary.finance.filenotary.get", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def check_twc_notary_industry_notary(self, request):
        """
        Description: 统一存证核验接口
        Summary: 统一存证核验接口（已下架）
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.check_twc_notary_industry_notary_ex(request, runtime)

    def check_twc_notary_industry_notary_ex(self, request, runtime):
        """
        Description: 统一存证核验接口
        Summary: 统一存证核验接口（已下架）
        """
        UtilClient.validate_model(request)
        return twc_models.CheckTwcNotaryIndustryNotaryResponse().from_map(self.do_request("1.0", "twc.notary.industry.notary.check", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def update_twc_notary_lease_contract(self, request):
        """
        Description: 升级融资租赁合约
        Summary: 升级融资租赁合约
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.update_twc_notary_lease_contract_ex(request, runtime)

    def update_twc_notary_lease_contract_ex(self, request, runtime):
        """
        Description: 升级融资租赁合约
        Summary: 升级融资租赁合约
        """
        UtilClient.validate_model(request)
        return twc_models.UpdateTwcNotaryLeaseContractResponse().from_map(self.do_request("1.0", "twc.notary.lease.contract.update", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def create_twc_notary_sue_breakpromiseinfo(self, request):
        """
        Description: 违约案件信息提交服务
        Summary: 违约案件信息提交服务
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.create_twc_notary_sue_breakpromiseinfo_ex(request, runtime)

    def create_twc_notary_sue_breakpromiseinfo_ex(self, request, runtime):
        """
        Description: 违约案件信息提交服务
        Summary: 违约案件信息提交服务
        """
        UtilClient.validate_model(request)
        return twc_models.CreateTwcNotarySueBreakpromiseinfoResponse().from_map(self.do_request("1.0", "twc.notary.sue.breakpromiseinfo.create", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def update_twc_notary_sue_breakpromiseinfo(self, request):
        """
        Description: 违约案件信息修改服务
        Summary: 违约案件信息修改服务
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.update_twc_notary_sue_breakpromiseinfo_ex(request, runtime)

    def update_twc_notary_sue_breakpromiseinfo_ex(self, request, runtime):
        """
        Description: 违约案件信息修改服务
        Summary: 违约案件信息修改服务
        """
        UtilClient.validate_model(request)
        return twc_models.UpdateTwcNotarySueBreakpromiseinfoResponse().from_map(self.do_request("1.0", "twc.notary.sue.breakpromiseinfo.update", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def delete_twc_notary_sue_breakpromiseinfo(self, request):
        """
        Description: 违约案件信息删除服务
        Summary: 违约案件信息删除服务
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.delete_twc_notary_sue_breakpromiseinfo_ex(request, runtime)

    def delete_twc_notary_sue_breakpromiseinfo_ex(self, request, runtime):
        """
        Description: 违约案件信息删除服务
        Summary: 违约案件信息删除服务
        """
        UtilClient.validate_model(request)
        return twc_models.DeleteTwcNotarySueBreakpromiseinfoResponse().from_map(self.do_request("1.0", "twc.notary.sue.breakpromiseinfo.delete", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def query_twc_notary_sue_userinfo(self, request):
        """
        Description: 查询惩戒信息
        Summary: 查询惩戒信息
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.query_twc_notary_sue_userinfo_ex(request, runtime)

    def query_twc_notary_sue_userinfo_ex(self, request, runtime):
        """
        Description: 查询惩戒信息
        Summary: 查询惩戒信息
        """
        UtilClient.validate_model(request)
        return twc_models.QueryTwcNotarySueUserinfoResponse().from_map(self.do_request("1.0", "twc.notary.sue.userinfo.query", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def update_twc_notary_sue_exeplarycontract(self, request):
        """
        Description: 升级用户管理合约
        Summary: 升级用户管理合约
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.update_twc_notary_sue_exeplarycontract_ex(request, runtime)

    def update_twc_notary_sue_exeplarycontract_ex(self, request, runtime):
        """
        Description: 升级用户管理合约
        Summary: 升级用户管理合约
        """
        UtilClient.validate_model(request)
        return twc_models.UpdateTwcNotarySueExeplarycontractResponse().from_map(self.do_request("1.0", "twc.notary.sue.exeplarycontract.update", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def update_twc_notary_sue_exemplaryrevert(self, request):
        """
        Description: 回退用户管理合约
        Summary: 回退用户管理合约
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.update_twc_notary_sue_exemplaryrevert_ex(request, runtime)

    def update_twc_notary_sue_exemplaryrevert_ex(self, request, runtime):
        """
        Description: 回退用户管理合约
        Summary: 回退用户管理合约
        """
        UtilClient.validate_model(request)
        return twc_models.UpdateTwcNotarySueExemplaryrevertResponse().from_map(self.do_request("1.0", "twc.notary.sue.exemplaryrevert.update", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def create_twc_notary_lease_audit(self, request):
        """
        Description: 融资平台审核订单信息
        Summary: 融资平台审核订单信息
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.create_twc_notary_lease_audit_ex(request, runtime)

    def create_twc_notary_lease_audit_ex(self, request, runtime):
        """
        Description: 融资平台审核订单信息
        Summary: 融资平台审核订单信息
        """
        UtilClient.validate_model(request)
        return twc_models.CreateTwcNotaryLeaseAuditResponse().from_map(self.do_request("1.0", "twc.notary.lease.audit.create", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def create_twc_notary_lease_paymentfile(self, request):
        """
        Description: 租赁平台上传付款通知信息
        Summary: 租赁平台上传付款通知信息
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.create_twc_notary_lease_paymentfile_ex(request, runtime)

    def create_twc_notary_lease_paymentfile_ex(self, request, runtime):
        """
        Description: 租赁平台上传付款通知信息
        Summary: 租赁平台上传付款通知信息
        """
        UtilClient.validate_model(request)
        return twc_models.CreateTwcNotaryLeasePaymentfileResponse().from_map(self.do_request("1.0", "twc.notary.lease.paymentfile.create", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def create_twc_notary_lease_rental(self, request):
        """
        Description: 租赁系统上传租金归还记录 分期调用
        Summary: 租赁系统上传租金归还记录 分期调用
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.create_twc_notary_lease_rental_ex(request, runtime)

    def create_twc_notary_lease_rental_ex(self, request, runtime):
        """
        Description: 租赁系统上传租金归还记录 分期调用
        Summary: 租赁系统上传租金归还记录 分期调用
        """
        UtilClient.validate_model(request)
        return twc_models.CreateTwcNotaryLeaseRentalResponse().from_map(self.do_request("1.0", "twc.notary.lease.rental.create", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def create_twc_notary_lease_clearing(self, request):
        """
        Description: 清分服务机构上传资金清算记录，分期
        Summary: 清分服务机构上传资金清算记录，分期
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.create_twc_notary_lease_clearing_ex(request, runtime)

    def create_twc_notary_lease_clearing_ex(self, request, runtime):
        """
        Description: 清分服务机构上传资金清算记录，分期
        Summary: 清分服务机构上传资金清算记录，分期
        """
        UtilClient.validate_model(request)
        return twc_models.CreateTwcNotaryLeaseClearingResponse().from_map(self.do_request("1.0", "twc.notary.lease.clearing.create", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def create_twc_notary_lease_repayment(self, request):
        """
        Description: 融资金融机构上传还款信息 每期
        Summary: 融资金融机构上传还款信息 每期
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.create_twc_notary_lease_repayment_ex(request, runtime)

    def create_twc_notary_lease_repayment_ex(self, request, runtime):
        """
        Description: 融资金融机构上传还款信息 每期
        Summary: 融资金融机构上传还款信息 每期
        """
        UtilClient.validate_model(request)
        return twc_models.CreateTwcNotaryLeaseRepaymentResponse().from_map(self.do_request("1.0", "twc.notary.lease.repayment.create", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def create_twc_notary_lease_notifyregister(self, request):
        """
        Description: 融资租赁通知系统注册
        Summary: 融资租赁通知系统注册
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.create_twc_notary_lease_notifyregister_ex(request, runtime)

    def create_twc_notary_lease_notifyregister_ex(self, request, runtime):
        """
        Description: 融资租赁通知系统注册
        Summary: 融资租赁通知系统注册
        """
        UtilClient.validate_model(request)
        return twc_models.CreateTwcNotaryLeaseNotifyregisterResponse().from_map(self.do_request("1.0", "twc.notary.lease.notifyregister.create", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def query_twc_notary_lease_iotinfo(self, request):
        """
        Description: 根据imeiID查询iot设备的详情
        Summary: 根据imeiID查询iot设备的详情
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.query_twc_notary_lease_iotinfo_ex(request, runtime)

    def query_twc_notary_lease_iotinfo_ex(self, request, runtime):
        """
        Description: 根据imeiID查询iot设备的详情
        Summary: 根据imeiID查询iot设备的详情
        """
        UtilClient.validate_model(request)
        return twc_models.QueryTwcNotaryLeaseIotinfoResponse().from_map(self.do_request("1.0", "twc.notary.lease.iotinfo.query", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def create_twc_notary_court_textnotary(self, request):
        """
        Description: 创建法院通用文本存证
        Summary: 法院通用文本存证创建接口
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.create_twc_notary_court_textnotary_ex(request, runtime)

    def create_twc_notary_court_textnotary_ex(self, request, runtime):
        """
        Description: 创建法院通用文本存证
        Summary: 法院通用文本存证创建接口
        """
        UtilClient.validate_model(request)
        return twc_models.CreateTwcNotaryCourtTextnotaryResponse().from_map(self.do_request("1.0", "twc.notary.court.textnotary.create", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def get_twc_notary_court_textnotary(self, request):
        """
        Description: 获取法院通用文本存证
        Summary: 法院通用文本存证获取接口
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.get_twc_notary_court_textnotary_ex(request, runtime)

    def get_twc_notary_court_textnotary_ex(self, request, runtime):
        """
        Description: 获取法院通用文本存证
        Summary: 法院通用文本存证获取接口
        """
        UtilClient.validate_model(request)
        return twc_models.GetTwcNotaryCourtTextnotaryResponse().from_map(self.do_request("1.0", "twc.notary.court.textnotary.get", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def create_twc_notary_court_filenotary(self, request):
        """
        Description: 创建法院通用文件存证接口
        Summary: 法院通用文件存证创建接口
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.create_twc_notary_court_filenotary_ex(request, runtime)

    def create_twc_notary_court_filenotary_ex(self, request, runtime):
        """
        Description: 创建法院通用文件存证接口
        Summary: 法院通用文件存证创建接口
        """
        UtilClient.validate_model(request)
        return twc_models.CreateTwcNotaryCourtFilenotaryResponse().from_map(self.do_request("1.0", "twc.notary.court.filenotary.create", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def get_twc_notary_court_filenotary(self, request):
        """
        Description: 获取法院通用文件存证
        Summary: 法院通用文件存证获取接口
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.get_twc_notary_court_filenotary_ex(request, runtime)

    def get_twc_notary_court_filenotary_ex(self, request, runtime):
        """
        Description: 获取法院通用文件存证
        Summary: 法院通用文件存证获取接口
        """
        UtilClient.validate_model(request)
        return twc_models.GetTwcNotaryCourtFilenotaryResponse().from_map(self.do_request("1.0", "twc.notary.court.filenotary.get", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def create_twc_notary_lease_route(self, request):
        """
        Description: 融资租赁定制化统一入口
        Summary: 融资租赁定制化统一入口
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.create_twc_notary_lease_route_ex(request, runtime)

    def create_twc_notary_lease_route_ex(self, request, runtime):
        """
        Description: 融资租赁定制化统一入口
        Summary: 融资租赁定制化统一入口
        """
        UtilClient.validate_model(request)
        return twc_models.CreateTwcNotaryLeaseRouteResponse().from_map(self.do_request("1.0", "twc.notary.lease.route.create", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def query_twc_notary_lease_encryptedinfo(self, request):
        """
        Description: 查询用户等加密信息，返回加密后的结果，用户自己进行解密
        Summary: 查询用户等加密信息
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.query_twc_notary_lease_encryptedinfo_ex(request, runtime)

    def query_twc_notary_lease_encryptedinfo_ex(self, request, runtime):
        """
        Description: 查询用户等加密信息，返回加密后的结果，用户自己进行解密
        Summary: 查询用户等加密信息
        """
        UtilClient.validate_model(request)
        return twc_models.QueryTwcNotaryLeaseEncryptedinfoResponse().from_map(self.do_request("1.0", "twc.notary.lease.encryptedinfo.query", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def create_twc_notary_contract_text(self, request):
        """
        Description: 电子合同文本存证
        Summary: 电子合同文本存证
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.create_twc_notary_contract_text_ex(request, runtime)

    def create_twc_notary_contract_text_ex(self, request, runtime):
        """
        Description: 电子合同文本存证
        Summary: 电子合同文本存证
        """
        UtilClient.validate_model(request)
        return twc_models.CreateTwcNotaryContractTextResponse().from_map(self.do_request("1.0", "twc.notary.contract.text.create", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def apply_twc_notary_contract_report(self, request):
        """
        Description: 全流程存证后，批量提交全流程核验信息，申请出证报告授权码。成功后可生成全流程上链报告
        Summary: 申请电子合同存证报告
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.apply_twc_notary_contract_report_ex(request, runtime)

    def apply_twc_notary_contract_report_ex(self, request, runtime):
        """
        Description: 全流程存证后，批量提交全流程核验信息，申请出证报告授权码。成功后可生成全流程上链报告
        Summary: 申请电子合同存证报告
        """
        UtilClient.validate_model(request)
        return twc_models.ApplyTwcNotaryContractReportResponse().from_map(self.do_request("1.0", "twc.notary.contract.report.apply", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def get_twc_notary_contract_text(self, request):
        """
        Description: 下载合同存证某个环节的内容，得到存证信息对象最终上链的JSON序列化形式，该内容可用于统一核验
        Summary: 下载合同存证
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.get_twc_notary_contract_text_ex(request, runtime)

    def get_twc_notary_contract_text_ex(self, request, runtime):
        """
        Description: 下载合同存证某个环节的内容，得到存证信息对象最终上链的JSON序列化形式，该内容可用于统一核验
        Summary: 下载合同存证
        """
        UtilClient.validate_model(request)
        return twc_models.GetTwcNotaryContractTextResponse().from_map(self.do_request("1.0", "twc.notary.contract.text.get", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def create_twc_notary_internal_trans(self, request):
        """
        Description: 获取存证事务ID内部接口
        Summary: 获取存证事务ID内部接口
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.create_twc_notary_internal_trans_ex(request, runtime)

    def create_twc_notary_internal_trans_ex(self, request, runtime):
        """
        Description: 获取存证事务ID内部接口
        Summary: 获取存证事务ID内部接口
        """
        UtilClient.validate_model(request)
        return twc_models.CreateTwcNotaryInternalTransResponse().from_map(self.do_request("1.0", "twc.notary.internal.trans.create", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def create_twc_notary_internal_text(self, request):
        """
        Description: 文本存证内部接口，将文本内容存证上链
        Summary: 文本存证内部接口，将文本内容存证上链
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.create_twc_notary_internal_text_ex(request, runtime)

    def create_twc_notary_internal_text_ex(self, request, runtime):
        """
        Description: 文本存证内部接口，将文本内容存证上链
        Summary: 文本存证内部接口，将文本内容存证上链
        """
        UtilClient.validate_model(request)
        return twc_models.CreateTwcNotaryInternalTextResponse().from_map(self.do_request("1.0", "twc.notary.internal.text.create", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def create_twc_notary_lease_text(self, request):
        """
        Description: 发起文本存证，将文本内容存证上链，租赁业务专用。
        Summary: 租赁业务文本存证，将文本内容存证上链
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.create_twc_notary_lease_text_ex(request, runtime)

    def create_twc_notary_lease_text_ex(self, request, runtime):
        """
        Description: 发起文本存证，将文本内容存证上链，租赁业务专用。
        Summary: 租赁业务文本存证，将文本内容存证上链
        """
        UtilClient.validate_model(request)
        return twc_models.CreateTwcNotaryLeaseTextResponse().from_map(self.do_request("1.0", "twc.notary.lease.text.create", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def create_twc_notary_lease_file(self, request):
        """
        Description: 发起文件存证，将文件内容存证上链，租赁业务专用。
        Summary: 租赁业务文件内容存证上链
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.create_twc_notary_lease_file_ex(request, runtime)

    def create_twc_notary_lease_file_ex(self, request, runtime):
        """
        Description: 发起文件存证，将文件内容存证上链，租赁业务专用。
        Summary: 租赁业务文件内容存证上链
        """
        UtilClient.validate_model(request)
        return twc_models.CreateTwcNotaryLeaseFileResponse().from_map(self.do_request("1.0", "twc.notary.lease.file.create", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def list_twc_notary_lease_notary(self, request):
        """
        Description: 使用接口查询订单存证的信息，需要在完成订单回传后才可返回。获取到txhash后，用户可使用 获取文本存证、存证核验 等存证服务功能。
        Summary: 租赁业务获取订单存证列表
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.list_twc_notary_lease_notary_ex(request, runtime)

    def list_twc_notary_lease_notary_ex(self, request, runtime):
        """
        Description: 使用接口查询订单存证的信息，需要在完成订单回传后才可返回。获取到txhash后，用户可使用 获取文本存证、存证核验 等存证服务功能。
        Summary: 租赁业务获取订单存证列表
        """
        UtilClient.validate_model(request)
        return twc_models.ListTwcNotaryLeaseNotaryResponse().from_map(self.do_request("1.0", "twc.notary.lease.notary.list", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def query_twc_notary_lease_application(self, request):
        """
        Description: 查询融资租赁application
        Summary: 查询融资租赁application
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.query_twc_notary_lease_application_ex(request, runtime)

    def query_twc_notary_lease_application_ex(self, request, runtime):
        """
        Description: 查询融资租赁application
        Summary: 查询融资租赁application
        """
        UtilClient.validate_model(request)
        return twc_models.QueryTwcNotaryLeaseApplicationResponse().from_map(self.do_request("1.0", "twc.notary.lease.application.query", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def query_twc_notary_lease_applicationdetailinfo(self, request):
        """
        Description: 查询融资租赁application的定义详情
        Summary: 查询application的定义详情
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.query_twc_notary_lease_applicationdetailinfo_ex(request, runtime)

    def query_twc_notary_lease_applicationdetailinfo_ex(self, request, runtime):
        """
        Description: 查询融资租赁application的定义详情
        Summary: 查询application的定义详情
        """
        UtilClient.validate_model(request)
        return twc_models.QueryTwcNotaryLeaseApplicationdetailinfoResponse().from_map(self.do_request("1.0", "twc.notary.lease.applicationdetailinfo.query", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def set_twc_notary_lease_repaymentstatus(self, request):
        """
        Description: 融资租赁资方重置订单状态
        Summary: 融资租赁资方重置订单状态
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.set_twc_notary_lease_repaymentstatus_ex(request, runtime)

    def set_twc_notary_lease_repaymentstatus_ex(self, request, runtime):
        """
        Description: 融资租赁资方重置订单状态
        Summary: 融资租赁资方重置订单状态
        """
        UtilClient.validate_model(request)
        return twc_models.SetTwcNotaryLeaseRepaymentstatusResponse().from_map(self.do_request("1.0", "twc.notary.lease.repaymentstatus.set", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def create_twc_notary_lease_supplierinfo(self, request):
        """
        Description: 供应商上传采购等相关信息
        Summary: 供应商上传采购等相关信息
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.create_twc_notary_lease_supplierinfo_ex(request, runtime)

    def create_twc_notary_lease_supplierinfo_ex(self, request, runtime):
        """
        Description: 供应商上传采购等相关信息
        Summary: 供应商上传采购等相关信息
        """
        UtilClient.validate_model(request)
        return twc_models.CreateTwcNotaryLeaseSupplierinfoResponse().from_map(self.do_request("1.0", "twc.notary.lease.supplierinfo.create", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))

