# -*- coding: utf-8 -*-
# This file is auto-generated, don't edit it. Thanks.
import time

from antchain_sdk_baasplus import models as baasplus_models
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

    def query_baas_plus_individualid_internalmask(self, request):
        """
        Description: 提供个人脱敏信息身份核验服务（1.姓名的一部分 2.手机号 3.身份证号码后四位）
        Summary: 个人脱敏信息身份核验（数据来自蚁盾）
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.query_baas_plus_individualid_internalmask_ex(request, runtime)

    def query_baas_plus_individualid_internalmask_ex(self, request, runtime):
        """
        Description: 提供个人脱敏信息身份核验服务（1.姓名的一部分 2.手机号 3.身份证号码后四位）
        Summary: 个人脱敏信息身份核验（数据来自蚁盾）
        """
        UtilClient.validate_model(request)
        return baasplus_models.QueryBaasPlusIndividualidInternalmaskResponse().from_map(self.do_request("1.0", "baas.plus.individualid.internalmask.query", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def query_baas_plus_enterpriseid_internalfourmeta(self, request):
        """
        Description: 企业认证四要素
        Summary: 企业认证四要素（数据来自数据枢纽）
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.query_baas_plus_enterpriseid_internalfourmeta_ex(request, runtime)

    def query_baas_plus_enterpriseid_internalfourmeta_ex(self, request, runtime):
        """
        Description: 企业认证四要素
        Summary: 企业认证四要素（数据来自数据枢纽）
        """
        UtilClient.validate_model(request)
        return baasplus_models.QueryBaasPlusEnterpriseidInternalfourmetaResponse().from_map(self.do_request("1.0", "baas.plus.enterpriseid.internalfourmeta.query", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def query_baas_plus_enterpriseid_internalthreemeta(self, request):
        """
        Description: 企业认证三要素
        Summary: 企业认证三要素（数据来自数据枢纽）
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.query_baas_plus_enterpriseid_internalthreemeta_ex(request, runtime)

    def query_baas_plus_enterpriseid_internalthreemeta_ex(self, request, runtime):
        """
        Description: 企业认证三要素
        Summary: 企业认证三要素（数据来自数据枢纽）
        """
        UtilClient.validate_model(request)
        return baasplus_models.QueryBaasPlusEnterpriseidInternalthreemetaResponse().from_map(self.do_request("1.0", "baas.plus.enterpriseid.internalthreemeta.query", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def query_baas_plus_enterpriseid_internaltwometa(self, request):
        """
        Description: 企业认证二要素
        Summary: 企业认证二要素（数据来自数据枢纽）
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.query_baas_plus_enterpriseid_internaltwometa_ex(request, runtime)

    def query_baas_plus_enterpriseid_internaltwometa_ex(self, request, runtime):
        """
        Description: 企业认证二要素
        Summary: 企业认证二要素（数据来自数据枢纽）
        """
        UtilClient.validate_model(request)
        return baasplus_models.QueryBaasPlusEnterpriseidInternaltwometaResponse().from_map(self.do_request("1.0", "baas.plus.enterpriseid.internaltwometa.query", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def init_baas_plus_enterpriseid_faceauth(self, request):
        """
        Description: 企业认证四要素-法人实人认证初始化
        Summary: 企业认证四要素-法人实人认证初始化
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.init_baas_plus_enterpriseid_faceauth_ex(request, runtime)

    def init_baas_plus_enterpriseid_faceauth_ex(self, request, runtime):
        """
        Description: 企业认证四要素-法人实人认证初始化
        Summary: 企业认证四要素-法人实人认证初始化
        """
        UtilClient.validate_model(request)
        return baasplus_models.InitBaasPlusEnterpriseidFaceauthResponse().from_map(self.do_request("1.0", "baas.plus.enterpriseid.faceauth.init", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def query_baas_plus_enterpriseid_faceauth(self, request):
        """
        Description: 查询企业认证四要素—法人实人认证结果
        Summary: 查询企业认证四要素—法人实人认证结果
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.query_baas_plus_enterpriseid_faceauth_ex(request, runtime)

    def query_baas_plus_enterpriseid_faceauth_ex(self, request, runtime):
        """
        Description: 查询企业认证四要素—法人实人认证结果
        Summary: 查询企业认证四要素—法人实人认证结果
        """
        UtilClient.validate_model(request)
        return baasplus_models.QueryBaasPlusEnterpriseidFaceauthResponse().from_map(self.do_request("1.0", "baas.plus.enterpriseid.faceauth.query", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def query_baas_plus_individualid_internalfourmeta(self, request):
        """
        Description: 个人实名认证四要素
        Summary: 个人实名认证四要素（数据来自蚁盾）
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.query_baas_plus_individualid_internalfourmeta_ex(request, runtime)

    def query_baas_plus_individualid_internalfourmeta_ex(self, request, runtime):
        """
        Description: 个人实名认证四要素
        Summary: 个人实名认证四要素（数据来自蚁盾）
        """
        UtilClient.validate_model(request)
        return baasplus_models.QueryBaasPlusIndividualidInternalfourmetaResponse().from_map(self.do_request("1.0", "baas.plus.individualid.internalfourmeta.query", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def query_baas_plus_individualid_internalthreemeta(self, request):
        """
        Description: 个人实名认证三要素
        Summary: 个人实名认证三要素（数据来自蚁盾）
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.query_baas_plus_individualid_internalthreemeta_ex(request, runtime)

    def query_baas_plus_individualid_internalthreemeta_ex(self, request, runtime):
        """
        Description: 个人实名认证三要素
        Summary: 个人实名认证三要素（数据来自蚁盾）
        """
        UtilClient.validate_model(request)
        return baasplus_models.QueryBaasPlusIndividualidInternalthreemetaResponse().from_map(self.do_request("1.0", "baas.plus.individualid.internalthreemeta.query", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def query_baas_plus_individualid_internaltwometa(self, request):
        """
        Description: 个人实名认证二要素
        Summary: 个人实名认证二要素
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.query_baas_plus_individualid_internaltwometa_ex(request, runtime)

    def query_baas_plus_individualid_internaltwometa_ex(self, request, runtime):
        """
        Description: 个人实名认证二要素
        Summary: 个人实名认证二要素
        """
        UtilClient.validate_model(request)
        return baasplus_models.QueryBaasPlusIndividualidInternaltwometaResponse().from_map(self.do_request("1.0", "baas.plus.individualid.internaltwometa.query", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def create_baas_plus_baicorp_internalevaluationasync(self, request):
        """
        Description: 发起内容评估（BAI），仅内部调用
        Summary: 发起内容评估
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.create_baas_plus_baicorp_internalevaluationasync_ex(request, runtime)

    def create_baas_plus_baicorp_internalevaluationasync_ex(self, request, runtime):
        """
        Description: 发起内容评估（BAI），仅内部调用
        Summary: 发起内容评估
        """
        UtilClient.validate_model(request)
        return baasplus_models.CreateBaasPlusBaicorpInternalevaluationasyncResponse().from_map(self.do_request("1.0", "baas.plus.baicorp.internalevaluationasync.create", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def create_baas_plus_baicorp_internalmonitorasync(self, request):
        """
        Description: 提交内容监测任务
        Summary: 提交内容监测任务接口
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.create_baas_plus_baicorp_internalmonitorasync_ex(request, runtime)

    def create_baas_plus_baicorp_internalmonitorasync_ex(self, request, runtime):
        """
        Description: 提交内容监测任务
        Summary: 提交内容监测任务接口
        """
        UtilClient.validate_model(request)
        return baasplus_models.CreateBaasPlusBaicorpInternalmonitorasyncResponse().from_map(self.do_request("1.0", "baas.plus.baicorp.internalmonitorasync.create", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def query_baas_plus_baicorp_internalevaluationasync(self, request):
        """
        Description: 查询内容评估结果
        Summary: 查询内容评估结果
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.query_baas_plus_baicorp_internalevaluationasync_ex(request, runtime)

    def query_baas_plus_baicorp_internalevaluationasync_ex(self, request, runtime):
        """
        Description: 查询内容评估结果
        Summary: 查询内容评估结果
        """
        UtilClient.validate_model(request)
        return baasplus_models.QueryBaasPlusBaicorpInternalevaluationasyncResponse().from_map(self.do_request("1.0", "baas.plus.baicorp.internalevaluationasync.query", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def query_baas_plus_baicorp_internalmonitorasync(self, request):
        """
        Description: 查询内容监测任务结果
        Summary: 查询内容监测任务结果
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.query_baas_plus_baicorp_internalmonitorasync_ex(request, runtime)

    def query_baas_plus_baicorp_internalmonitorasync_ex(self, request, runtime):
        """
        Description: 查询内容监测任务结果
        Summary: 查询内容监测任务结果
        """
        UtilClient.validate_model(request)
        return baasplus_models.QueryBaasPlusBaicorpInternalmonitorasyncResponse().from_map(self.do_request("1.0", "baas.plus.baicorp.internalmonitorasync.query", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def certify_baas_plus_enterpriseid_faceauth(self, request):
        """
        Description: 企业认证四要素-法人实人认证开始
        Summary: 企业认证四要素-法人实人认证开始
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.certify_baas_plus_enterpriseid_faceauth_ex(request, runtime)

    def certify_baas_plus_enterpriseid_faceauth_ex(self, request, runtime):
        """
        Description: 企业认证四要素-法人实人认证开始
        Summary: 企业认证四要素-法人实人认证开始
        """
        UtilClient.validate_model(request)
        return baasplus_models.CertifyBaasPlusEnterpriseidFaceauthResponse().from_map(self.do_request("1.0", "baas.plus.enterpriseid.faceauth.certify", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def init_baas_plus_individualid_faceauth(self, request):
        """
        Description: 个人实人刷脸认证——认证初始化
        Summary: 个人实人刷脸认证-认证初始化
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.init_baas_plus_individualid_faceauth_ex(request, runtime)

    def init_baas_plus_individualid_faceauth_ex(self, request, runtime):
        """
        Description: 个人实人刷脸认证——认证初始化
        Summary: 个人实人刷脸认证-认证初始化
        """
        UtilClient.validate_model(request)
        return baasplus_models.InitBaasPlusIndividualidFaceauthResponse().from_map(self.do_request("1.0", "baas.plus.individualid.faceauth.init", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def certify_baas_plus_individualid_faceauth(self, request):
        """
        Description: 个人实人刷脸认证——认证开始
        Summary: 个人实人刷脸认证-认证开始
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.certify_baas_plus_individualid_faceauth_ex(request, runtime)

    def certify_baas_plus_individualid_faceauth_ex(self, request, runtime):
        """
        Description: 个人实人刷脸认证——认证开始
        Summary: 个人实人刷脸认证-认证开始
        """
        UtilClient.validate_model(request)
        return baasplus_models.CertifyBaasPlusIndividualidFaceauthResponse().from_map(self.do_request("1.0", "baas.plus.individualid.faceauth.certify", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def query_baas_plus_individualid_faceauth(self, request):
        """
        Description: 个人实人刷脸认证——查询认证结果
        Summary: 个人实人刷脸认证-查询认证结果
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.query_baas_plus_individualid_faceauth_ex(request, runtime)

    def query_baas_plus_individualid_faceauth_ex(self, request, runtime):
        """
        Description: 个人实人刷脸认证——查询认证结果
        Summary: 个人实人刷脸认证-查询认证结果
        """
        UtilClient.validate_model(request)
        return baasplus_models.QueryBaasPlusIndividualidFaceauthResponse().from_map(self.do_request("1.0", "baas.plus.individualid.faceauth.query", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def get_baas_plus_dataservice_blockchainheight(self, request):
        """
        Description: 获取区块链当前块高
        Summary: 区块链数据服务-获取区块链当前块高
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.get_baas_plus_dataservice_blockchainheight_ex(request, runtime)

    def get_baas_plus_dataservice_blockchainheight_ex(self, request, runtime):
        """
        Description: 获取区块链当前块高
        Summary: 区块链数据服务-获取区块链当前块高
        """
        UtilClient.validate_model(request)
        return baasplus_models.GetBaasPlusDataserviceBlockchainheightResponse().from_map(self.do_request("1.0", "baas.plus.dataservice.blockchainheight.get", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def get_baas_plus_dataservice_transactioncount(self, request):
        """
        Description: 获取链交易总数
        Summary: 区块链数据服务-获取链交易总数
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.get_baas_plus_dataservice_transactioncount_ex(request, runtime)

    def get_baas_plus_dataservice_transactioncount_ex(self, request, runtime):
        """
        Description: 获取链交易总数
        Summary: 区块链数据服务-获取链交易总数
        """
        UtilClient.validate_model(request)
        return baasplus_models.GetBaasPlusDataserviceTransactioncountResponse().from_map(self.do_request("1.0", "baas.plus.dataservice.transactioncount.get", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def get_baas_plus_dataservice_transactioninfo(self, request):
        """
        Description: 根据交易hash获取交易详情
        Summary: 区块链数据服务-获取交易详情
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.get_baas_plus_dataservice_transactioninfo_ex(request, runtime)

    def get_baas_plus_dataservice_transactioninfo_ex(self, request, runtime):
        """
        Description: 根据交易hash获取交易详情
        Summary: 区块链数据服务-获取交易详情
        """
        UtilClient.validate_model(request)
        return baasplus_models.GetBaasPlusDataserviceTransactioninfoResponse().from_map(self.do_request("1.0", "baas.plus.dataservice.transactioninfo.get", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def list_baas_plus_dataservice_lastblocks(self, request):
        """
        Description: 获取链最近n条块信息
        Summary: 区块链数据服务-获取链最近n条块信息
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.list_baas_plus_dataservice_lastblocks_ex(request, runtime)

    def list_baas_plus_dataservice_lastblocks_ex(self, request, runtime):
        """
        Description: 获取链最近n条块信息
        Summary: 区块链数据服务-获取链最近n条块信息
        """
        UtilClient.validate_model(request)
        return baasplus_models.ListBaasPlusDataserviceLastblocksResponse().from_map(self.do_request("1.0", "baas.plus.dataservice.lastblocks.list", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def get_baas_plus_tas_attestation(self, request):
        """
        Description: 可信时间服务——获取时间凭证
        Summary: 可信时间凭证服务-获取时间凭证
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.get_baas_plus_tas_attestation_ex(request, runtime)

    def get_baas_plus_tas_attestation_ex(self, request, runtime):
        """
        Description: 可信时间服务——获取时间凭证
        Summary: 可信时间凭证服务-获取时间凭证
        """
        UtilClient.validate_model(request)
        return baasplus_models.GetBaasPlusTasAttestationResponse().from_map(self.do_request("1.0", "baas.plus.tas.attestation.get", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def verify_baas_plus_tas_ctsr(self, request):
        """
        Description: 可信时间 ——校验时间凭证接口
        Summary: 可信时间凭证服务-校验时间凭证接口
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.verify_baas_plus_tas_ctsr_ex(request, runtime)

    def verify_baas_plus_tas_ctsr_ex(self, request, runtime):
        """
        Description: 可信时间 ——校验时间凭证接口
        Summary: 可信时间凭证服务-校验时间凭证接口
        """
        UtilClient.validate_model(request)
        return baasplus_models.VerifyBaasPlusTasCtsrResponse().from_map(self.do_request("1.0", "baas.plus.tas.ctsr.verify", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def get_baas_plus_tas_certificate(self, request):
        """
        Description: 通过sn下载时间凭证证书（pdf格式）
        Summary: 可信时间凭证服务-下载时间凭证证书
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.get_baas_plus_tas_certificate_ex(request, runtime)

    def get_baas_plus_tas_certificate_ex(self, request, runtime):
        """
        Description: 通过sn下载时间凭证证书（pdf格式）
        Summary: 可信时间凭证服务-下载时间凭证证书
        """
        UtilClient.validate_model(request)
        return baasplus_models.GetBaasPlusTasCertificateResponse().from_map(self.do_request("1.0", "baas.plus.tas.certificate.get", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def get_baas_plus_tas_transactionattestation(self, request):
        """
        Description: 可信时间——获取带事务的时间凭证
        Summary: 可信时间——获取带事务的时间凭证
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.get_baas_plus_tas_transactionattestation_ex(request, runtime)

    def get_baas_plus_tas_transactionattestation_ex(self, request, runtime):
        """
        Description: 可信时间——获取带事务的时间凭证
        Summary: 可信时间——获取带事务的时间凭证
        """
        UtilClient.validate_model(request)
        return baasplus_models.GetBaasPlusTasTransactionattestationResponse().from_map(self.do_request("1.0", "baas.plus.tas.transactionattestation.get", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def query_baas_plus_everify_fourmeta(self, request):
        """
        Description: 企业认证四要素
        Summary: 企业认证四要素
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.query_baas_plus_everify_fourmeta_ex(request, runtime)

    def query_baas_plus_everify_fourmeta_ex(self, request, runtime):
        """
        Description: 企业认证四要素
        Summary: 企业认证四要素
        """
        UtilClient.validate_model(request)
        return baasplus_models.QueryBaasPlusEverifyFourmetaResponse().from_map(self.do_request("1.0", "baas.plus.everify.fourmeta.query", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def query_baas_plus_everify_threemeta(self, request):
        """
        Description: 企业认证三要素
        Summary: 企业认证三要素
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.query_baas_plus_everify_threemeta_ex(request, runtime)

    def query_baas_plus_everify_threemeta_ex(self, request, runtime):
        """
        Description: 企业认证三要素
        Summary: 企业认证三要素
        """
        UtilClient.validate_model(request)
        return baasplus_models.QueryBaasPlusEverifyThreemetaResponse().from_map(self.do_request("1.0", "baas.plus.everify.threemeta.query", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def query_baas_plus_everify_twometa(self, request):
        """
        Description: 企业认证二要素
        Summary: 企业认证二要素
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.query_baas_plus_everify_twometa_ex(request, runtime)

    def query_baas_plus_everify_twometa_ex(self, request, runtime):
        """
        Description: 企业认证二要素
        Summary: 企业认证二要素
        """
        UtilClient.validate_model(request)
        return baasplus_models.QueryBaasPlusEverifyTwometaResponse().from_map(self.do_request("1.0", "baas.plus.everify.twometa.query", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def query_baas_plus_baicorp_internalsearchlibrary(self, request):
        """
        Description: 内容搜索查询接口
        Summary: 内容搜索查询接口
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.query_baas_plus_baicorp_internalsearchlibrary_ex(request, runtime)

    def query_baas_plus_baicorp_internalsearchlibrary_ex(self, request, runtime):
        """
        Description: 内容搜索查询接口
        Summary: 内容搜索查询接口
        """
        UtilClient.validate_model(request)
        return baasplus_models.QueryBaasPlusBaicorpInternalsearchlibraryResponse().from_map(self.do_request("1.0", "baas.plus.baicorp.internalsearchlibrary.query", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def update_baas_plus_baicorp_internalsearchlibrary(self, request):
        """
        Description: 更新检索
        Summary: 更新检索
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.update_baas_plus_baicorp_internalsearchlibrary_ex(request, runtime)

    def update_baas_plus_baicorp_internalsearchlibrary_ex(self, request, runtime):
        """
        Description: 更新检索
        Summary: 更新检索
        """
        UtilClient.validate_model(request)
        return baasplus_models.UpdateBaasPlusBaicorpInternalsearchlibraryResponse().from_map(self.do_request("1.0", "baas.plus.baicorp.internalsearchlibrary.update", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def query_baas_plus_epayauth_rootbank(self, request):
        """
        Description: 对公打款-总行查询
        Summary: 对公打款-总行查询
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.query_baas_plus_epayauth_rootbank_ex(request, runtime)

    def query_baas_plus_epayauth_rootbank_ex(self, request, runtime):
        """
        Description: 对公打款-总行查询
        Summary: 对公打款-总行查询
        """
        UtilClient.validate_model(request)
        return baasplus_models.QueryBaasPlusEpayauthRootbankResponse().from_map(self.do_request("1.0", "baas.plus.epayauth.rootbank.query", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def query_baas_plus_ydapplyprot_ecapply(self, request):
        """
        Description: 利用信贷违约数据、多头数据、涉黑数据，刻画基于身份证、手机号、设备等多维度风险特征池、使用机器学习模型自动学习用户背后的风险信息和模式，获得信贷欺诈评分。
        Summary: 业务申请保护
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.query_baas_plus_ydapplyprot_ecapply_ex(request, runtime)

    def query_baas_plus_ydapplyprot_ecapply_ex(self, request, runtime):
        """
        Description: 利用信贷违约数据、多头数据、涉黑数据，刻画基于身份证、手机号、设备等多维度风险特征池、使用机器学习模型自动学习用户背后的风险信息和模式，获得信贷欺诈评分。
        Summary: 业务申请保护
        """
        UtilClient.validate_model(request)
        return baasplus_models.QueryBaasPlusYdapplyprotEcapplyResponse().from_map(self.do_request("1.0", "baas.plus.ydapplyprot.ecapply.query", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def query_baas_plus_ydpacprot_ecpac(self, request):
        """
        Description: 基于用户行为日志分析，有效识别逃单、恶意退款、无法履约等风险用户，在先享后付、消费金融、网约车先享后付场景有较好的识别效果
        Summary: 先享后付保护
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.query_baas_plus_ydpacprot_ecpac_ex(request, runtime)

    def query_baas_plus_ydpacprot_ecpac_ex(self, request, runtime):
        """
        Description: 基于用户行为日志分析，有效识别逃单、恶意退款、无法履约等风险用户，在先享后付、消费金融、网约车先享后付场景有较好的识别效果
        Summary: 先享后付保护
        """
        UtilClient.validate_model(request)
        return baasplus_models.QueryBaasPlusYdpacprotEcpacResponse().from_map(self.do_request("1.0", "baas.plus.ydpacprot.ecpac.query", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def query_baas_plus_ydauthprot_twometa(self, request):
        """
        Description: 支持二要素验证，，覆盖账户实名、银行卡绑定、海淘报关等场景，为电商、银行、互金行业提供真实身份验证。
        Summary: 身份认证保护
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.query_baas_plus_ydauthprot_twometa_ex(request, runtime)

    def query_baas_plus_ydauthprot_twometa_ex(self, request, runtime):
        """
        Description: 支持二要素验证，，覆盖账户实名、银行卡绑定、海淘报关等场景，为电商、银行、互金行业提供真实身份验证。
        Summary: 身份认证保护
        """
        UtilClient.validate_model(request)
        return baasplus_models.QueryBaasPlusYdauthprotTwometaResponse().from_map(self.do_request("1.0", "baas.plus.ydauthprot.twometa.query", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def query_baas_plus_ydauthprot_threemeta(self, request):
        """
        Description: 支持三要素验证，，覆盖账户实名、银行卡绑定、海淘报关等场景，为电商、银行、互金行业提供真实身份验证。
        Summary: 身份认证保护
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.query_baas_plus_ydauthprot_threemeta_ex(request, runtime)

    def query_baas_plus_ydauthprot_threemeta_ex(self, request, runtime):
        """
        Description: 支持三要素验证，，覆盖账户实名、银行卡绑定、海淘报关等场景，为电商、银行、互金行业提供真实身份验证。
        Summary: 身份认证保护
        """
        UtilClient.validate_model(request)
        return baasplus_models.QueryBaasPlusYdauthprotThreemetaResponse().from_map(self.do_request("1.0", "baas.plus.ydauthprot.threemeta.query", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def query_baas_plus_ydauthprot_fourmeta(self, request):
        """
        Description: 支持四要素验证，，覆盖账户实名、银行卡绑定、海淘报关等场景，为电商、银行、互金行业提供真实身份验证。
        Summary: 身份认证保护
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.query_baas_plus_ydauthprot_fourmeta_ex(request, runtime)

    def query_baas_plus_ydauthprot_fourmeta_ex(self, request, runtime):
        """
        Description: 支持四要素验证，，覆盖账户实名、银行卡绑定、海淘报关等场景，为电商、银行、互金行业提供真实身份验证。
        Summary: 身份认证保护
        """
        UtilClient.validate_model(request)
        return baasplus_models.QueryBaasPlusYdauthprotFourmetaResponse().from_map(self.do_request("1.0", "baas.plus.ydauthprot.fourmeta.query", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def query_baas_plus_ydmktprot_ecmarketcampaign(self, request):
        """
        Description: 营销保护
        Summary: 营销保护
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.query_baas_plus_ydmktprot_ecmarketcampaign_ex(request, runtime)

    def query_baas_plus_ydmktprot_ecmarketcampaign_ex(self, request, runtime):
        """
        Description: 营销保护
        Summary: 营销保护
        """
        UtilClient.validate_model(request)
        return baasplus_models.QueryBaasPlusYdmktprotEcmarketcampaignResponse().from_map(self.do_request("1.0", "baas.plus.ydmktprot.ecmarketcampaign.query", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def query_baas_plus_ydregprot_ecregister(self, request):
        """
        Description: 注册保护
        Summary: 注册保护
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.query_baas_plus_ydregprot_ecregister_ex(request, runtime)

    def query_baas_plus_ydregprot_ecregister_ex(self, request, runtime):
        """
        Description: 注册保护
        Summary: 注册保护
        """
        UtilClient.validate_model(request)
        return baasplus_models.QueryBaasPlusYdregprotEcregisterResponse().from_map(self.do_request("1.0", "baas.plus.ydregprot.ecregister.query", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def query_baas_plus_epayauth_branchbank(self, request):
        """
        Description: 用户需要选择支行时，业务平台调用此接口查询列表，供用户选择。
        Summary: 支行查询
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.query_baas_plus_epayauth_branchbank_ex(request, runtime)

    def query_baas_plus_epayauth_branchbank_ex(self, request, runtime):
        """
        Description: 用户需要选择支行时，业务平台调用此接口查询列表，供用户选择。
        Summary: 支行查询
        """
        UtilClient.validate_model(request)
        return baasplus_models.QueryBaasPlusEpayauthBranchbankResponse().from_map(self.do_request("1.0", "baas.plus.epayauth.branchbank.query", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def query_baas_plus_epayauth_district(self, request):
        """
        Description: 用户需要选择省市时，业务平台调用此接口查询列表，供用户选择。
        Summary: 行政地区编码查询
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.query_baas_plus_epayauth_district_ex(request, runtime)

    def query_baas_plus_epayauth_district_ex(self, request, runtime):
        """
        Description: 用户需要选择省市时，业务平台调用此接口查询列表，供用户选择。
        Summary: 行政地区编码查询
        """
        UtilClient.validate_model(request)
        return baasplus_models.QueryBaasPlusEpayauthDistrictResponse().from_map(self.do_request("1.0", "baas.plus.epayauth.district.query", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def init_baas_plus_epayauth_verify(self, request):
        """
        Description: 用户输入银行卡相关信息后，业务平台调用此接口申请打款验证，网商端收到请求后依预设规则向指定银行卡打款，金额随机。
        Summary: 发起打款验证申请
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.init_baas_plus_epayauth_verify_ex(request, runtime)

    def init_baas_plus_epayauth_verify_ex(self, request, runtime):
        """
        Description: 用户输入银行卡相关信息后，业务平台调用此接口申请打款验证，网商端收到请求后依预设规则向指定银行卡打款，金额随机。
        Summary: 发起打款验证申请
        """
        UtilClient.validate_model(request)
        return baasplus_models.InitBaasPlusEpayauthVerifyResponse().from_map(self.do_request("1.0", "baas.plus.epayauth.verify.init", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def query_baas_plus_epayauth_verify(self, request):
        """
        Description: 用户输入收到的打款金额后，业务平台调用此接口进行金额校验。
        Summary: 打款验证金额校验
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.query_baas_plus_epayauth_verify_ex(request, runtime)

    def query_baas_plus_epayauth_verify_ex(self, request, runtime):
        """
        Description: 用户输入收到的打款金额后，业务平台调用此接口进行金额校验。
        Summary: 打款验证金额校验
        """
        UtilClient.validate_model(request)
        return baasplus_models.QueryBaasPlusEpayauthVerifyResponse().from_map(self.do_request("1.0", "baas.plus.epayauth.verify.query", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def query_baas_plus_bmpbrowser_transactionqrcode(self, request):
        """
        Description: 依据入参，生成链上交易二维码，可通过支付宝端扫码查看交易详情
        Summary: 链上交易二维码生成
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.query_baas_plus_bmpbrowser_transactionqrcode_ex(request, runtime)

    def query_baas_plus_bmpbrowser_transactionqrcode_ex(self, request, runtime):
        """
        Description: 依据入参，生成链上交易二维码，可通过支付宝端扫码查看交易详情
        Summary: 链上交易二维码生成
        """
        UtilClient.validate_model(request)
        return baasplus_models.QueryBaasPlusBmpbrowserTransactionqrcodeResponse().from_map(self.do_request("1.0", "baas.plus.bmpbrowser.transactionqrcode.query", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def add_baas_plus_bmpbrowser_privilege(self, request):
        """
        Description: 依据入参手机号，开通对应支付宝账号查看链上交易的权限
        Summary: 批量开通 链上交易移动端查看权限
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.add_baas_plus_bmpbrowser_privilege_ex(request, runtime)

    def add_baas_plus_bmpbrowser_privilege_ex(self, request, runtime):
        """
        Description: 依据入参手机号，开通对应支付宝账号查看链上交易的权限
        Summary: 批量开通 链上交易移动端查看权限
        """
        UtilClient.validate_model(request)
        return baasplus_models.AddBaasPlusBmpbrowserPrivilegeResponse().from_map(self.do_request("1.0", "baas.plus.bmpbrowser.privilege.add", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def query_baas_plus_idcocr_idcard(self, request):
        """
        Description: 身份证信息识别
        Summary: 身份证信息识别
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.query_baas_plus_idcocr_idcard_ex(request, runtime)

    def query_baas_plus_idcocr_idcard_ex(self, request, runtime):
        """
        Description: 身份证信息识别
        Summary: 身份证信息识别
        """
        UtilClient.validate_model(request)
        return baasplus_models.QueryBaasPlusIdcocrIdcardResponse().from_map(self.do_request("1.0", "baas.plus.idcocr.idcard.query", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def init_baas_plus_ca_certificate(self, request):
        """
        Description: 申请证书
        Summary: 申请证书
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.init_baas_plus_ca_certificate_ex(request, runtime)

    def init_baas_plus_ca_certificate_ex(self, request, runtime):
        """
        Description: 申请证书
        Summary: 申请证书
        """
        UtilClient.validate_model(request)
        return baasplus_models.InitBaasPlusCaCertificateResponse().from_map(self.do_request("1.0", "baas.plus.ca.certificate.init", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def init_baas_plus_contentrisk_internal(self, request):
        """
        Description: 内容风险识别接口服务可提供针对垃圾广告、（钓鱼、广告）链接、暴恐政、黄赌毒等内容的风险识别服务。
        Summary: 内容风险识别接口服务
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.init_baas_plus_contentrisk_internal_ex(request, runtime)

    def init_baas_plus_contentrisk_internal_ex(self, request, runtime):
        """
        Description: 内容风险识别接口服务可提供针对垃圾广告、（钓鱼、广告）链接、暴恐政、黄赌毒等内容的风险识别服务。
        Summary: 内容风险识别接口服务
        """
        UtilClient.validate_model(request)
        return baasplus_models.InitBaasPlusContentriskInternalResponse().from_map(self.do_request("1.0", "baas.plus.contentrisk.internal.init", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def query_baas_plus_contentrisk_internal(self, request):
        """
        Description: 配合内容风险识别接口服务，进行图片、视频等针对暴恐政、黄赌毒等内容的异步识别结果查询接口。
        Summary: 内容风险识别结果查询接口服务
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.query_baas_plus_contentrisk_internal_ex(request, runtime)

    def query_baas_plus_contentrisk_internal_ex(self, request, runtime):
        """
        Description: 配合内容风险识别接口服务，进行图片、视频等针对暴恐政、黄赌毒等内容的异步识别结果查询接口。
        Summary: 内容风险识别结果查询接口服务
        """
        UtilClient.validate_model(request)
        return baasplus_models.QueryBaasPlusContentriskInternalResponse().from_map(self.do_request("1.0", "baas.plus.contentrisk.internal.query", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def init_baas_plus_individualid_imageauth(self, request):
        """
        Description: 个人实人认证服务端比对-认证开始
        Summary: 个人实人认证服务端比对-认证开始
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.init_baas_plus_individualid_imageauth_ex(request, runtime)

    def init_baas_plus_individualid_imageauth_ex(self, request, runtime):
        """
        Description: 个人实人认证服务端比对-认证开始
        Summary: 个人实人认证服务端比对-认证开始
        """
        UtilClient.validate_model(request)
        return baasplus_models.InitBaasPlusIndividualidImageauthResponse().from_map(self.do_request("1.0", "baas.plus.individualid.imageauth.init", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def add_baas_plus_iotcse_account(self, request):
        """
        Description: 访问账户生成
        Summary: 访问账户生成
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.add_baas_plus_iotcse_account_ex(request, runtime)

    def add_baas_plus_iotcse_account_ex(self, request, runtime):
        """
        Description: 访问账户生成
        Summary: 访问账户生成
        """
        UtilClient.validate_model(request)
        return baasplus_models.AddBaasPlusIotcseAccountResponse().from_map(self.do_request("1.0", "baas.plus.iotcse.account.add", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def save_baas_plus_iotcse_evidence(self, request):
        """
        Description: 存证上链
        Summary: 存证上链
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.save_baas_plus_iotcse_evidence_ex(request, runtime)

    def save_baas_plus_iotcse_evidence_ex(self, request, runtime):
        """
        Description: 存证上链
        Summary: 存证上链
        """
        UtilClient.validate_model(request)
        return baasplus_models.SaveBaasPlusIotcseEvidenceResponse().from_map(self.do_request("1.0", "baas.plus.iotcse.evidence.save", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def query_baas_plus_iotcse_evidence(self, request):
        """
        Description: 存证上链查询
        Summary: 存证上链查询
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.query_baas_plus_iotcse_evidence_ex(request, runtime)

    def query_baas_plus_iotcse_evidence_ex(self, request, runtime):
        """
        Description: 存证上链查询
        Summary: 存证上链查询
        """
        UtilClient.validate_model(request)
        return baasplus_models.QueryBaasPlusIotcseEvidenceResponse().from_map(self.do_request("1.0", "baas.plus.iotcse.evidence.query", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def create_baas_plus_did_corporatedidagent(self, request):
        """
        Description: 代理创建企业did
        Summary: 代理创建企业did
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.create_baas_plus_did_corporatedidagent_ex(request, runtime)

    def create_baas_plus_did_corporatedidagent_ex(self, request, runtime):
        """
        Description: 代理创建企业did
        Summary: 代理创建企业did
        """
        UtilClient.validate_model(request)
        return baasplus_models.CreateBaasPlusDidCorporatedidagentResponse().from_map(self.do_request("1.0", "baas.plus.did.corporatedidagent.create", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def init_baas_plus_individualid_faceauthinternal(self, request):
        """
        Description: 个人实人刷脸认证-认证初始化
        Summary: 个人实人刷脸认证-认证初始化
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.init_baas_plus_individualid_faceauthinternal_ex(request, runtime)

    def init_baas_plus_individualid_faceauthinternal_ex(self, request, runtime):
        """
        Description: 个人实人刷脸认证-认证初始化
        Summary: 个人实人刷脸认证-认证初始化
        """
        UtilClient.validate_model(request)
        return baasplus_models.InitBaasPlusIndividualidFaceauthinternalResponse().from_map(self.do_request("1.0", "baas.plus.individualid.faceauthinternal.init", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def certify_baas_plus_individualid_faceauthinternal(self, request):
        """
        Description: 个人实人刷脸认证-认证开始
        Summary: 个人实人刷脸认证-认证开始
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.certify_baas_plus_individualid_faceauthinternal_ex(request, runtime)

    def certify_baas_plus_individualid_faceauthinternal_ex(self, request, runtime):
        """
        Description: 个人实人刷脸认证-认证开始
        Summary: 个人实人刷脸认证-认证开始
        """
        UtilClient.validate_model(request)
        return baasplus_models.CertifyBaasPlusIndividualidFaceauthinternalResponse().from_map(self.do_request("1.0", "baas.plus.individualid.faceauthinternal.certify", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def query_baas_plus_individualid_faceauthinternal(self, request):
        """
        Description: 个人实人刷脸认证-查询认证结果
        Summary: 个人实人刷脸认证-查询认证结果
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.query_baas_plus_individualid_faceauthinternal_ex(request, runtime)

    def query_baas_plus_individualid_faceauthinternal_ex(self, request, runtime):
        """
        Description: 个人实人刷脸认证-查询认证结果
        Summary: 个人实人刷脸认证-查询认证结果
        """
        UtilClient.validate_model(request)
        return baasplus_models.QueryBaasPlusIndividualidFaceauthinternalResponse().from_map(self.do_request("1.0", "baas.plus.individualid.faceauthinternal.query", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def init_baas_plus_enterpriseid_faceauthinternal(self, request):
        """
        Description: 企业认证四要素-法人实人认证初始化
        Summary: 企业认证四要素-法人实人认证初始化
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.init_baas_plus_enterpriseid_faceauthinternal_ex(request, runtime)

    def init_baas_plus_enterpriseid_faceauthinternal_ex(self, request, runtime):
        """
        Description: 企业认证四要素-法人实人认证初始化
        Summary: 企业认证四要素-法人实人认证初始化
        """
        UtilClient.validate_model(request)
        return baasplus_models.InitBaasPlusEnterpriseidFaceauthinternalResponse().from_map(self.do_request("1.0", "baas.plus.enterpriseid.faceauthinternal.init", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def certify_baas_plus_enterpriseid_faceauthinternal(self, request):
        """
        Description: 企业认证四要素-法人实人认证开始
        Summary: 企业认证四要素-法人实人认证开始
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.certify_baas_plus_enterpriseid_faceauthinternal_ex(request, runtime)

    def certify_baas_plus_enterpriseid_faceauthinternal_ex(self, request, runtime):
        """
        Description: 企业认证四要素-法人实人认证开始
        Summary: 企业认证四要素-法人实人认证开始
        """
        UtilClient.validate_model(request)
        return baasplus_models.CertifyBaasPlusEnterpriseidFaceauthinternalResponse().from_map(self.do_request("1.0", "baas.plus.enterpriseid.faceauthinternal.certify", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def query_baas_plus_everify_twometainternal(self, request):
        """
        Description: 企业认证二要素
        Summary: 企业认证二要素
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.query_baas_plus_everify_twometainternal_ex(request, runtime)

    def query_baas_plus_everify_twometainternal_ex(self, request, runtime):
        """
        Description: 企业认证二要素
        Summary: 企业认证二要素
        """
        UtilClient.validate_model(request)
        return baasplus_models.QueryBaasPlusEverifyTwometainternalResponse().from_map(self.do_request("1.0", "baas.plus.everify.twometainternal.query", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def query_baas_plus_everify_threemetainternal(self, request):
        """
        Description: 企业认证三要素
        Summary: 企业认证三要素
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.query_baas_plus_everify_threemetainternal_ex(request, runtime)

    def query_baas_plus_everify_threemetainternal_ex(self, request, runtime):
        """
        Description: 企业认证三要素
        Summary: 企业认证三要素
        """
        UtilClient.validate_model(request)
        return baasplus_models.QueryBaasPlusEverifyThreemetainternalResponse().from_map(self.do_request("1.0", "baas.plus.everify.threemetainternal.query", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def query_baas_plus_everify_fourmetainternal(self, request):
        """
        Description: 企业认证四要素
        Summary: 企业认证四要素
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.query_baas_plus_everify_fourmetainternal_ex(request, runtime)

    def query_baas_plus_everify_fourmetainternal_ex(self, request, runtime):
        """
        Description: 企业认证四要素
        Summary: 企业认证四要素
        """
        UtilClient.validate_model(request)
        return baasplus_models.QueryBaasPlusEverifyFourmetainternalResponse().from_map(self.do_request("1.0", "baas.plus.everify.fourmetainternal.query", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def query_baas_plus_enterpriseid_faceauthinternal(self, request):
        """
        Description: 查询企业认证四要素—法人实人认证结果
        Summary: 查询企业认证四要素—法人实人认证结果
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.query_baas_plus_enterpriseid_faceauthinternal_ex(request, runtime)

    def query_baas_plus_enterpriseid_faceauthinternal_ex(self, request, runtime):
        """
        Description: 查询企业认证四要素—法人实人认证结果
        Summary: 查询企业认证四要素—法人实人认证结果
        """
        UtilClient.validate_model(request)
        return baasplus_models.QueryBaasPlusEnterpriseidFaceauthinternalResponse().from_map(self.do_request("1.0", "baas.plus.enterpriseid.faceauthinternal.query", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def add_baas_plus_iotcse_thingsdid(self, request):
        """
        Description: 物联网区块链身份注册
        Summary: 物联网区块链身份注册
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.add_baas_plus_iotcse_thingsdid_ex(request, runtime)

    def add_baas_plus_iotcse_thingsdid_ex(self, request, runtime):
        """
        Description: 物联网区块链身份注册
        Summary: 物联网区块链身份注册
        """
        UtilClient.validate_model(request)
        return baasplus_models.AddBaasPlusIotcseThingsdidResponse().from_map(self.do_request("1.0", "baas.plus.iotcse.thingsdid.add", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def update_baas_plus_iotcse_thingsdid(self, request):
        """
        Description: 物联网区块链身份更新
        Summary: 物联网区块链身份更新
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.update_baas_plus_iotcse_thingsdid_ex(request, runtime)

    def update_baas_plus_iotcse_thingsdid_ex(self, request, runtime):
        """
        Description: 物联网区块链身份更新
        Summary: 物联网区块链身份更新
        """
        UtilClient.validate_model(request)
        return baasplus_models.UpdateBaasPlusIotcseThingsdidResponse().from_map(self.do_request("1.0", "baas.plus.iotcse.thingsdid.update", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def query_baas_plus_iotcse_thingsdid(self, request):
        """
        Description: 物联网区块链身份查询
        Summary: 物联网区块链身份查询
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.query_baas_plus_iotcse_thingsdid_ex(request, runtime)

    def query_baas_plus_iotcse_thingsdid_ex(self, request, runtime):
        """
        Description: 物联网区块链身份查询
        Summary: 物联网区块链身份查询
        """
        UtilClient.validate_model(request)
        return baasplus_models.QueryBaasPlusIotcseThingsdidResponse().from_map(self.do_request("1.0", "baas.plus.iotcse.thingsdid.query", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def query_baas_plus_iotcse_asyncprocess(self, request):
        """
        Description: 异步轮询请求
        智能合约执行完后异步轮询
        Summary: 异步轮询请求
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.query_baas_plus_iotcse_asyncprocess_ex(request, runtime)

    def query_baas_plus_iotcse_asyncprocess_ex(self, request, runtime):
        """
        Description: 异步轮询请求
        智能合约执行完后异步轮询
        Summary: 异步轮询请求
        """
        UtilClient.validate_model(request)
        return baasplus_models.QueryBaasPlusIotcseAsyncprocessResponse().from_map(self.do_request("1.0", "baas.plus.iotcse.asyncprocess.query", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def exec_baas_plus_iotcse_group(self, request):
        """
        Description: 物联网区块链身份分组
        Summary: 物联网区块链身份分组
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.exec_baas_plus_iotcse_group_ex(request, runtime)

    def exec_baas_plus_iotcse_group_ex(self, request, runtime):
        """
        Description: 物联网区块链身份分组
        Summary: 物联网区块链身份分组
        """
        UtilClient.validate_model(request)
        return baasplus_models.ExecBaasPlusIotcseGroupResponse().from_map(self.do_request("1.0", "baas.plus.iotcse.group.exec", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def query_baas_plus_iotcse_groupdevice(self, request):
        """
        Description: 物联网区块链分组设备查询
        Summary: 物联网区块链分组设备查询
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.query_baas_plus_iotcse_groupdevice_ex(request, runtime)

    def query_baas_plus_iotcse_groupdevice_ex(self, request, runtime):
        """
        Description: 物联网区块链分组设备查询
        Summary: 物联网区块链分组设备查询
        """
        UtilClient.validate_model(request)
        return baasplus_models.QueryBaasPlusIotcseGroupdeviceResponse().from_map(self.do_request("1.0", "baas.plus.iotcse.groupdevice.query", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def query_baas_plus_iotcse_devicegroup(self, request):
        """
        Description: 物联网区块链身份设备分组查询
        Summary: 物联网区块链身份设备分组查询
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.query_baas_plus_iotcse_devicegroup_ex(request, runtime)

    def query_baas_plus_iotcse_devicegroup_ex(self, request, runtime):
        """
        Description: 物联网区块链身份设备分组查询
        Summary: 物联网区块链身份设备分组查询
        """
        UtilClient.validate_model(request)
        return baasplus_models.QueryBaasPlusIotcseDevicegroupResponse().from_map(self.do_request("1.0", "baas.plus.iotcse.devicegroup.query", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def query_baas_plus_iotcse_tenantdevice(self, request):
        """
        Description: 物联网区块链身份租户设备查询
        Summary: 物联网区块链身份租户设备查询
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.query_baas_plus_iotcse_tenantdevice_ex(request, runtime)

    def query_baas_plus_iotcse_tenantdevice_ex(self, request, runtime):
        """
        Description: 物联网区块链身份租户设备查询
        Summary: 物联网区块链身份租户设备查询
        """
        UtilClient.validate_model(request)
        return baasplus_models.QueryBaasPlusIotcseTenantdeviceResponse().from_map(self.do_request("1.0", "baas.plus.iotcse.tenantdevice.query", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def update_baas_plus_iotcse_devicestatus(self, request):
        """
        Description: 物联网区块链身份设备状态更新
        Summary: 物联网区块链身份设备状态更新
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.update_baas_plus_iotcse_devicestatus_ex(request, runtime)

    def update_baas_plus_iotcse_devicestatus_ex(self, request, runtime):
        """
        Description: 物联网区块链身份设备状态更新
        Summary: 物联网区块链身份设备状态更新
        """
        UtilClient.validate_model(request)
        return baasplus_models.UpdateBaasPlusIotcseDevicestatusResponse().from_map(self.do_request("1.0", "baas.plus.iotcse.devicestatus.update", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def query_baas_plus_iotcse_devicemodel(self, request):
        """
        Description: 物联网区块链身份设备物模型查询
        Summary: 物联网区块链身份设备物模型查询
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.query_baas_plus_iotcse_devicemodel_ex(request, runtime)

    def query_baas_plus_iotcse_devicemodel_ex(self, request, runtime):
        """
        Description: 物联网区块链身份设备物模型查询
        Summary: 物联网区块链身份设备物模型查询
        """
        UtilClient.validate_model(request)
        return baasplus_models.QueryBaasPlusIotcseDevicemodelResponse().from_map(self.do_request("1.0", "baas.plus.iotcse.devicemodel.query", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def update_baas_plus_iotcse_devicespace(self, request):
        """
        Description: 物联网区块链身份设备空间关联
        Summary: 物联网区块链身份设备空间关联
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.update_baas_plus_iotcse_devicespace_ex(request, runtime)

    def update_baas_plus_iotcse_devicespace_ex(self, request, runtime):
        """
        Description: 物联网区块链身份设备空间关联
        Summary: 物联网区块链身份设备空间关联
        """
        UtilClient.validate_model(request)
        return baasplus_models.UpdateBaasPlusIotcseDevicespaceResponse().from_map(self.do_request("1.0", "baas.plus.iotcse.devicespace.update", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def query_baas_plus_iotcse_evidencebatch(self, request):
        """
        Description: 物联网区块链身份批量存证数据读取
        Summary: 物联网区块链身份批量存证数据读取
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.query_baas_plus_iotcse_evidencebatch_ex(request, runtime)

    def query_baas_plus_iotcse_evidencebatch_ex(self, request, runtime):
        """
        Description: 物联网区块链身份批量存证数据读取
        Summary: 物联网区块链身份批量存证数据读取
        """
        UtilClient.validate_model(request)
        return baasplus_models.QueryBaasPlusIotcseEvidencebatchResponse().from_map(self.do_request("1.0", "baas.plus.iotcse.evidencebatch.query", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def query_baas_plus_blocr_businesslicense(self, request):
        """
        Description: AI认知服务营业执照ocr服务
        Summary: AI认知服务营业执照ocr服务
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.query_baas_plus_blocr_businesslicense_ex(request, runtime)

    def query_baas_plus_blocr_businesslicense_ex(self, request, runtime):
        """
        Description: AI认知服务营业执照ocr服务
        Summary: AI认知服务营业执照ocr服务
        """
        UtilClient.validate_model(request)
        return baasplus_models.QueryBaasPlusBlocrBusinesslicenseResponse().from_map(self.do_request("1.0", "baas.plus.blocr.businesslicense.query", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def query_baas_plus_invoicesocr_vatinvoice(self, request):
        """
        Description: AI认知服务增值税发票ocr识别
        Summary: AI认知服务增值税发票ocr识别
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.query_baas_plus_invoicesocr_vatinvoice_ex(request, runtime)

    def query_baas_plus_invoicesocr_vatinvoice_ex(self, request, runtime):
        """
        Description: AI认知服务增值税发票ocr识别
        Summary: AI认知服务增值税发票ocr识别
        """
        UtilClient.validate_model(request)
        return baasplus_models.QueryBaasPlusInvoicesocrVatinvoiceResponse().from_map(self.do_request("1.0", "baas.plus.invoicesocr.vatinvoice.query", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def query_baas_plus_bmpbrowser_privilege(self, request):
        """
        Description: 查询用户链上交易移动端查看权限
        Summary: 查询用户链上交易移动端查看权限
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.query_baas_plus_bmpbrowser_privilege_ex(request, runtime)

    def query_baas_plus_bmpbrowser_privilege_ex(self, request, runtime):
        """
        Description: 查询用户链上交易移动端查看权限
        Summary: 查询用户链上交易移动端查看权限
        """
        UtilClient.validate_model(request)
        return baasplus_models.QueryBaasPlusBmpbrowserPrivilegeResponse().from_map(self.do_request("1.0", "baas.plus.bmpbrowser.privilege.query", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def cancel_baas_plus_bmpbrowser_privilege(self, request):
        """
        Description: 批量取消 链上交易移动端查看权限
        Summary: 批量取消 链上交易移动端查看权限
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.cancel_baas_plus_bmpbrowser_privilege_ex(request, runtime)

    def cancel_baas_plus_bmpbrowser_privilege_ex(self, request, runtime):
        """
        Description: 批量取消 链上交易移动端查看权限
        Summary: 批量取消 链上交易移动端查看权限
        """
        UtilClient.validate_model(request)
        return baasplus_models.CancelBaasPlusBmpbrowserPrivilegeResponse().from_map(self.do_request("1.0", "baas.plus.bmpbrowser.privilege.cancel", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))

