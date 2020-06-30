# This file is auto-generated, don't edit it. Thanks.
import time

from antchain_sdk_ebc import models as _ebc_models
from alibabacloud_tea_util.client import Client as UtilClient
from Tea.exceptions import TeaException
from alibabacloud_tea_util import models as util_models
from Tea.request import TeaRequest
from Tea.core import TeaCore
from Tea.response import TeaResponse
from antchain_alipay_util.client import Client as AlipayUtilClient
from alibabacloud_rpc_util.client import Client as RPCUtilClient
from Tea.exceptions import UnretryableException


class Client:
    def __init__(self, config, _endpoint=None, _region_id=None, _access_key_id=None, _access_key_secret=None, _protocol=None, _user_agent=None, _read_timeout=None, _connect_timeout=None, _http_proxy=None, _https_proxy=None, _socks_5proxy=None, _socks_5net_work=None, _no_proxy=None, _max_idle_conns=None, _auth_token=None, _tenant=None, _workspace=None):
        """
        Init client with Config
        @param config: config contains the necessary information to create a client
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
        self._auth_token = _auth_token
        self._tenant = _tenant
        self._workspace = _workspace
        if UtilClient.is_unset(config.to_map()):
            raise TeaException({
                "code": "ParameterMissing",
                "message": "'config' can not be unset"
            })
        self._access_key_id = config.access_key_id
        self._access_key_secret = config.access_key_secret
        self._tenant = config.tenant
        self._workspace = config.workspace
        self._endpoint = config.endpoint
        self._auth_token = config.auth_token
        self._protocol = config.protocol
        self._region_id = config.region_id
        self._user_agent = config.user_agent
        self._read_timeout = config.read_timeout
        self._connect_timeout = config.connect_timeout
        self._http_proxy = config.http_proxy
        self._https_proxy = config.https_proxy
        self._no_proxy = config.no_proxy
        self._socks_5proxy = config.socks_5proxy
        self._socks_5net_work = config.socks_5net_work
        self._max_idle_conns = config.max_idle_conns

    def do_request(self, action, protocol, method, pathname, request, runtime):
        """
        Encapsulate the request and invoke the network
        @param action: api name
        @param protocol: http or https
        @param method: e.g. GET
        @param pathname: pathname of every api
        @param request: which contains request params
        @param runtime: which controls some details of call api, such as retry times
        @return the response
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
                    "version": "1.0",
                    "sign_type": "HmacSHA1",
                    "req_time": AlipayUtilClient.get_timestamp(),
                    "req_msg_id": UtilClient.get_nonce()
                }
                if not UtilClient.empty(self._tenant):
                    _request.query["tenant"] = self._tenant
                if not UtilClient.empty(self._workspace):
                    _request.query["workspace"] = self._workspace
                if not UtilClient.empty(self._auth_token):
                    _request.query["auth_token"] = self._auth_token
                else:
                    _request.query["access_key"] = self._access_key_id
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
        @return user agent
        """
        user_agent = UtilClient.get_user_agent(self._user_agent)
        return user_agent

    def delete_course_class(self, request):
        """
        Description: 删除课程中的班级
        Summary: 删除课程班级
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.delete_course_class_ex(request, runtime)

    def delete_course_class_ex(self, request, runtime):
        """
        Description: 删除课程中的班级
        Summary: 删除课程班级
        """
        UtilClient.validate_model(request)
        return _ebc_models.DeleteCourseClassResponse().from_map(self.do_request("baas.ebc.course.class.delete", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def apply_cert_url(self, request):
        """
        Description: 申请证书信息上传url，证书未发布则会返回证书图片、证书持有人、证书其他信息的文件上传url。
        证书已发布则会返回证书图片、证书其他信息的文件上传url。
        文件最大5M
        Summary: 申请证书信息上传url
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.apply_cert_url_ex(request, runtime)

    def apply_cert_url_ex(self, request, runtime):
        """
        Description: 申请证书信息上传url，证书未发布则会返回证书图片、证书持有人、证书其他信息的文件上传url。
        证书已发布则会返回证书图片、证书其他信息的文件上传url。
        文件最大5M
        Summary: 申请证书信息上传url
        """
        UtilClient.validate_model(request)
        return _ebc_models.ApplyCertUrlResponse().from_map(self.do_request("baas.ebc.cert.url.apply", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def add_course_class(self, request):
        """
        Description: 将班级添加到课程中
        Summary: 增加课程班级
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.add_course_class_ex(request, runtime)

    def add_course_class_ex(self, request, runtime):
        """
        Description: 将班级添加到课程中
        Summary: 增加课程班级
        """
        UtilClient.validate_model(request)
        return _ebc_models.AddCourseClassResponse().from_map(self.do_request("baas.ebc.course.class.add", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def add_class_user(self, request):
        """
        Description: 增加学员
        Summary: 增加学员
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.add_class_user_ex(request, runtime)

    def add_class_user_ex(self, request, runtime):
        """
        Description: 增加学员
        Summary: 增加学员
        """
        UtilClient.validate_model(request)
        return _ebc_models.AddClassUserResponse().from_map(self.do_request("baas.ebc.class.user.add", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def query_organization_cert(self, request):
        """
        Description: 查询证书
        Summary: 查询企业证书
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.query_organization_cert_ex(request, runtime)

    def query_organization_cert_ex(self, request, runtime):
        """
        Description: 查询证书
        Summary: 查询企业证书
        """
        UtilClient.validate_model(request)
        return _ebc_models.QueryOrganizationCertResponse().from_map(self.do_request("baas.ebc.organization.cert.query", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def add_course_user(self, request):
        """
        Description: 将学员添加到课程中
        Summary: 增加课程学员
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.add_course_user_ex(request, runtime)

    def add_course_user_ex(self, request, runtime):
        """
        Description: 将学员添加到课程中
        Summary: 增加课程学员
        """
        UtilClient.validate_model(request)
        return _ebc_models.AddCourseUserResponse().from_map(self.do_request("baas.ebc.course.user.add", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def delete_course_user(self, request):
        """
        Description: 删除课程中的学员
        Summary: 删除课程学员
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.delete_course_user_ex(request, runtime)

    def delete_course_user_ex(self, request, runtime):
        """
        Description: 删除课程中的学员
        Summary: 删除课程学员
        """
        UtilClient.validate_model(request)
        return _ebc_models.DeleteCourseUserResponse().from_map(self.do_request("baas.ebc.course.user.delete", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def create_organization_class(self, request):
        """
        Description: 创建班级
        Summary: 创建班级
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.create_organization_class_ex(request, runtime)

    def create_organization_class_ex(self, request, runtime):
        """
        Description: 创建班级
        Summary: 创建班级
        """
        UtilClient.validate_model(request)
        return _ebc_models.CreateOrganizationClassResponse().from_map(self.do_request("baas.ebc.organization.class.create", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def query_class_user(self, request):
        """
        Description: 班级明细查询
        Summary: 班级明细查询
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.query_class_user_ex(request, runtime)

    def query_class_user_ex(self, request, runtime):
        """
        Description: 班级明细查询
        Summary: 班级明细查询
        """
        UtilClient.validate_model(request)
        return _ebc_models.QueryClassUserResponse().from_map(self.do_request("baas.ebc.class.user.query", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def query_cert(self, request):
        """
        Description: 证书明细查询
        Summary: 证书明细查询
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.query_cert_ex(request, runtime)

    def query_cert_ex(self, request, runtime):
        """
        Description: 证书明细查询
        Summary: 证书明细查询
        """
        UtilClient.validate_model(request)
        return _ebc_models.QueryCertResponse().from_map(self.do_request("baas.ebc.cert.query", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def update_organization_course(self, request):
        """
        Description: 更新课程
        Summary: 更新课程
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.update_organization_course_ex(request, runtime)

    def update_organization_course_ex(self, request, runtime):
        """
        Description: 更新课程
        Summary: 更新课程
        """
        UtilClient.validate_model(request)
        return _ebc_models.UpdateOrganizationCourseResponse().from_map(self.do_request("baas.ebc.organization.course.update", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def cancel_person(self, request):
        """
        Description: 个人退出
        Summary: 个人退出
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.cancel_person_ex(request, runtime)

    def cancel_person_ex(self, request, runtime):
        """
        Description: 个人退出
        Summary: 个人退出
        """
        UtilClient.validate_model(request)
        return _ebc_models.CancelPersonResponse().from_map(self.do_request("baas.ebc.person.cancel", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def create_user_cert(self, request):
        """
        Description: 发布证书
        Summary: 发布证书
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.create_user_cert_ex(request, runtime)

    def create_user_cert_ex(self, request, runtime):
        """
        Description: 发布证书
        Summary: 发布证书
        """
        UtilClient.validate_model(request)
        return _ebc_models.CreateUserCertResponse().from_map(self.do_request("baas.ebc.user.cert.create", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def delete_class_user(self, request):
        """
        Description: 删除学员
        Summary: 删除学员
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.delete_class_user_ex(request, runtime)

    def delete_class_user_ex(self, request, runtime):
        """
        Description: 删除学员
        Summary: 删除学员
        """
        UtilClient.validate_model(request)
        return _ebc_models.DeleteClassUserResponse().from_map(self.do_request("baas.ebc.class.user.delete", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def create_person(self, request):
        """
        Description: 创建个人
        Summary: 创建个人
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.create_person_ex(request, runtime)

    def create_person_ex(self, request, runtime):
        """
        Description: 创建个人
        Summary: 创建个人
        """
        UtilClient.validate_model(request)
        return _ebc_models.CreatePersonResponse().from_map(self.do_request("baas.ebc.person.create", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def resume_person(self, request):
        """
        Description: 用户复入
        Summary: 用户复入
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.resume_person_ex(request, runtime)

    def resume_person_ex(self, request, runtime):
        """
        Description: 用户复入
        Summary: 用户复入
        """
        UtilClient.validate_model(request)
        return _ebc_models.ResumePersonResponse().from_map(self.do_request("baas.ebc.person.resume", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def query_organization_class(self, request):
        """
        Description: 班级查询
        Summary: 班级查询
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.query_organization_class_ex(request, runtime)

    def query_organization_class_ex(self, request, runtime):
        """
        Description: 班级查询
        Summary: 班级查询
        """
        UtilClient.validate_model(request)
        return _ebc_models.QueryOrganizationClassResponse().from_map(self.do_request("baas.ebc.organization.class.query", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def update_organization_class(self, request):
        """
        Description: 更新班级
        Summary: 更新班级
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.update_organization_class_ex(request, runtime)

    def update_organization_class_ex(self, request, runtime):
        """
        Description: 更新班级
        Summary: 更新班级
        """
        UtilClient.validate_model(request)
        return _ebc_models.UpdateOrganizationClassResponse().from_map(self.do_request("baas.ebc.organization.class.update", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def query_user_cert(self, request):
        """
        Description: 查询用户证书
        Summary: 查询用户证书
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.query_user_cert_ex(request, runtime)

    def query_user_cert_ex(self, request, runtime):
        """
        Description: 查询用户证书
        Summary: 查询用户证书
        """
        UtilClient.validate_model(request)
        return _ebc_models.QueryUserCertResponse().from_map(self.do_request("baas.ebc.user.cert.query", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def create_organization_course(self, request):
        """
        Description: 发布课程
        Summary: 发布课程
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.create_organization_course_ex(request, runtime)

    def create_organization_course_ex(self, request, runtime):
        """
        Description: 发布课程
        Summary: 发布课程
        """
        UtilClient.validate_model(request)
        return _ebc_models.CreateOrganizationCourseResponse().from_map(self.do_request("baas.ebc.organization.course.create", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def create_organization(self, request):
        """
        Description: 创建企业
        Summary: 创建企业
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.create_organization_ex(request, runtime)

    def create_organization_ex(self, request, runtime):
        """
        Description: 创建企业
        Summary: 创建企业
        """
        UtilClient.validate_model(request)
        return _ebc_models.CreateOrganizationResponse().from_map(self.do_request("baas.ebc.organization.create", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def create_organization_user(self, request):
        """
        Description: 企业用户注册
        Summary: 企业用户注册
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.create_organization_user_ex(request, runtime)

    def create_organization_user_ex(self, request, runtime):
        """
        Description: 企业用户注册
        Summary: 企业用户注册
        """
        UtilClient.validate_model(request)
        return _ebc_models.CreateOrganizationUserResponse().from_map(self.do_request("baas.ebc.organization.user.create", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))

