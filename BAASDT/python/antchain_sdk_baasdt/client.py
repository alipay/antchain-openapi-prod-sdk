# This file is auto-generated, don't edit it. Thanks.
import time

from antchain_sdk_baasdt import models as _baasdt_models
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
    def __init__(self, config, _endpoint=None, _region_id=None, _access_key_id=None, _access_key_secret=None, _protocol=None, _user_agent=None, _read_timeout=None, _connect_timeout=None, _http_proxy=None, _https_proxy=None, _socks_5proxy=None, _socks_5net_work=None, _no_proxy=None, _max_idle_conns=None, _security_token=None):
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
        self._security_token = _security_token
        if UtilClient.is_unset(config.to_map()):
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
                    "version": version,
                    "sign_type": "HmacSHA1",
                    "req_time": AlipayUtilClient.get_timestamp(),
                    "req_msg_id": UtilClient.get_nonce(),
                    "access_key": self._access_key_id,
                    "charset": "UTF-8",
                    "baseSdkVersion": "Tea-SDK",
                    "sdkVersion": "Tea-SDK-20200713"
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
        @return user agent
        """
        user_agent = "TeaClient/1.0.0"
        return UtilClient.get_user_agent(user_agent)

    def exec_aas_antdao_card_create(self, request):
        """
        Description: 创建卡密，卡密托管服务调用，需要传入交易的签名
        Summary: 数字商品服务-消费卡服务-创建卡密
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.exec_aas_antdao_card_create_ex(request, runtime)

    def exec_aas_antdao_card_create_ex(self, request, runtime):
        """
        Description: 创建卡密，卡密托管服务调用，需要传入交易的签名
        Summary: 数字商品服务-消费卡服务-创建卡密
        """
        UtilClient.validate_model(request)
        return _baasdt_models.ExecAasAntdaoCardCreateResponse().from_map(self.do_request("1.0", "baas.antdao.card.create.exec", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def exec_aas_antdao_card_query(self, request):
        """
        Description: 查询卡密，卡密托管服务调用，需要传入交易的签名
        Summary: 数字商品服务-消费卡服务-查询卡密
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.exec_aas_antdao_card_query_ex(request, runtime)

    def exec_aas_antdao_card_query_ex(self, request, runtime):
        """
        Description: 查询卡密，卡密托管服务调用，需要传入交易的签名
        Summary: 数字商品服务-消费卡服务-查询卡密
        """
        UtilClient.validate_model(request)
        return _baasdt_models.ExecAasAntdaoCardQueryResponse().from_map(self.do_request("1.0", "baas.antdao.card.query.exec", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def exec_aas_antdao_card_bindname(self, request):
        """
        Description: 记名卡密，卡密托管服务调用，需要传入交易的签名
        Summary: 数字商品服务-消费卡服务-记名卡发行
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.exec_aas_antdao_card_bindname_ex(request, runtime)

    def exec_aas_antdao_card_bindname_ex(self, request, runtime):
        """
        Description: 记名卡密，卡密托管服务调用，需要传入交易的签名
        Summary: 数字商品服务-消费卡服务-记名卡发行
        """
        UtilClient.validate_model(request)
        return _baasdt_models.ExecAasAntdaoCardBindnameResponse().from_map(self.do_request("1.0", "baas.antdao.card.bindname.exec", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def exec_aas_antdao_card_charge(self, request):
        """
        Description: 充值卡密，卡密托管服务调用，需要传入交易的签名
        Summary: 数字商品服务-消费卡服务-充值卡密
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.exec_aas_antdao_card_charge_ex(request, runtime)

    def exec_aas_antdao_card_charge_ex(self, request, runtime):
        """
        Description: 充值卡密，卡密托管服务调用，需要传入交易的签名
        Summary: 数字商品服务-消费卡服务-充值卡密
        """
        UtilClient.validate_model(request)
        return _baasdt_models.ExecAasAntdaoCardChargeResponse().from_map(self.do_request("1.0", "baas.antdao.card.charge.exec", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def exec_aas_antdao_card_writeoff(self, request):
        """
        Description: 核销卡密，卡密托管服务调用，需要传入交易的签名
        Summary: 数字商品服务-消费卡服务-核销卡密
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.exec_aas_antdao_card_writeoff_ex(request, runtime)

    def exec_aas_antdao_card_writeoff_ex(self, request, runtime):
        """
        Description: 核销卡密，卡密托管服务调用，需要传入交易的签名
        Summary: 数字商品服务-消费卡服务-核销卡密
        """
        UtilClient.validate_model(request)
        return _baasdt_models.ExecAasAntdaoCardWriteoffResponse().from_map(self.do_request("1.0", "baas.antdao.card.writeoff.exec", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def exec_aas_antdao_card_expired(self, request):
        """
        Description: 过期卡密，卡密托管服务调用，需要传入交易的签名
        Summary: 数字商品服务-消费卡服务-过期卡密
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.exec_aas_antdao_card_expired_ex(request, runtime)

    def exec_aas_antdao_card_expired_ex(self, request, runtime):
        """
        Description: 过期卡密，卡密托管服务调用，需要传入交易的签名
        Summary: 数字商品服务-消费卡服务-过期卡密
        """
        UtilClient.validate_model(request)
        return _baasdt_models.ExecAasAntdaoCardExpiredResponse().from_map(self.do_request("1.0", "baas.antdao.card.expired.exec", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def exec_aas_antdao_card_forbidden(self, request):
        """
        Description: 风控禁用卡密，卡密托管服务调用，需要传入交易的签名
        Summary: 数字商品服务-消费卡服务-风控禁用卡密
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.exec_aas_antdao_card_forbidden_ex(request, runtime)

    def exec_aas_antdao_card_forbidden_ex(self, request, runtime):
        """
        Description: 风控禁用卡密，卡密托管服务调用，需要传入交易的签名
        Summary: 数字商品服务-消费卡服务-风控禁用卡密
        """
        UtilClient.validate_model(request)
        return _baasdt_models.ExecAasAntdaoCardForbiddenResponse().from_map(self.do_request("1.0", "baas.antdao.card.forbidden.exec", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def exec_aas_antdao_card_chargereset(self, request):
        """
        Description: 充值重置卡密，卡密托管服务调用，需要传入交易的签名
        Summary: 数字商品服务-消费卡服务-充值重置卡密
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.exec_aas_antdao_card_chargereset_ex(request, runtime)

    def exec_aas_antdao_card_chargereset_ex(self, request, runtime):
        """
        Description: 充值重置卡密，卡密托管服务调用，需要传入交易的签名
        Summary: 数字商品服务-消费卡服务-充值重置卡密
        """
        UtilClient.validate_model(request)
        return _baasdt_models.ExecAasAntdaoCardChargeresetResponse().from_map(self.do_request("1.0", "baas.antdao.card.chargereset.exec", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def query_aas_antdao_merchant_user(self, request):
        """
        Description: 查询调用商户下的用户信息
        Summary: 数字商品服务-商户管理-查询用户信息
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.query_aas_antdao_merchant_user_ex(request, runtime)

    def query_aas_antdao_merchant_user_ex(self, request, runtime):
        """
        Description: 查询调用商户下的用户信息
        Summary: 数字商品服务-商户管理-查询用户信息
        """
        UtilClient.validate_model(request)
        return _baasdt_models.QueryAasAntdaoMerchantUserResponse().from_map(self.do_request("1.0", "baas.antdao.merchant.user.query", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def create_aas_antdao_merchant_user(self, request):
        """
        Description: 创建商户管理下的用户
        Summary: 数字商品服务-商户管理-商户创建用户
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.create_aas_antdao_merchant_user_ex(request, runtime)

    def create_aas_antdao_merchant_user_ex(self, request, runtime):
        """
        Description: 创建商户管理下的用户
        Summary: 数字商品服务-商户管理-商户创建用户
        """
        UtilClient.validate_model(request)
        return _baasdt_models.CreateAasAntdaoMerchantUserResponse().from_map(self.do_request("1.0", "baas.antdao.merchant.user.create", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def query_aas_antdao_merchant(self, request):
        """
        Description: 查询管理员创建的商户信息（可查询自身的商户信息）
        Summary: 数字商品服务-商户管理-查询商户信息
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.query_aas_antdao_merchant_ex(request, runtime)

    def query_aas_antdao_merchant_ex(self, request, runtime):
        """
        Description: 查询管理员创建的商户信息（可查询自身的商户信息）
        Summary: 数字商品服务-商户管理-查询商户信息
        """
        UtilClient.validate_model(request)
        return _baasdt_models.QueryAasAntdaoMerchantResponse().from_map(self.do_request("1.0", "baas.antdao.merchant.query", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def upload_aas_antdao_image(self, request):
        """
        Description: 上传图片到OSS，以备风控检查。仅权益发行方可使用，采购方不可使用。上传的图片单张不超过1M。
        Summary: 数字商品服务-OSS服务-上传图片
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.upload_aas_antdao_image_ex(request, runtime)

    def upload_aas_antdao_image_ex(self, request, runtime):
        """
        Description: 上传图片到OSS，以备风控检查。仅权益发行方可使用，采购方不可使用。上传的图片单张不超过1M。
        Summary: 数字商品服务-OSS服务-上传图片
        """
        UtilClient.validate_model(request)
        return _baasdt_models.UploadAasAntdaoImageResponse().from_map(self.do_request("1.0", "baas.antdao.image.upload", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def get_aas_antdao_pki_publickey(self, request):
        """
        Description: 获取kms中对应用户的公钥
        Summary: 数字商品服务-密钥管理-获取用户公钥
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.get_aas_antdao_pki_publickey_ex(request, runtime)

    def get_aas_antdao_pki_publickey_ex(self, request, runtime):
        """
        Description: 获取kms中对应用户的公钥
        Summary: 数字商品服务-密钥管理-获取用户公钥
        """
        UtilClient.validate_model(request)
        return _baasdt_models.GetAasAntdaoPkiPublickeyResponse().from_map(self.do_request("1.0", "baas.antdao.pki.publickey.get", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def exec_aas_antdao_pki_encrypt(self, request):
        """
        Description: ECC公钥加密接口
        Summary: 数字商品服务-密钥管理-公钥加密
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.exec_aas_antdao_pki_encrypt_ex(request, runtime)

    def exec_aas_antdao_pki_encrypt_ex(self, request, runtime):
        """
        Description: ECC公钥加密接口
        Summary: 数字商品服务-密钥管理-公钥加密
        """
        UtilClient.validate_model(request)
        return _baasdt_models.ExecAasAntdaoPkiEncryptResponse().from_map(self.do_request("1.0", "baas.antdao.pki.encrypt.exec", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def exec_aas_antdao_pki_decrypt(self, request):
        """
        Description: ECC解密算法接口
        Summary: 数字商品服务-密钥管理-私钥解密
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.exec_aas_antdao_pki_decrypt_ex(request, runtime)

    def exec_aas_antdao_pki_decrypt_ex(self, request, runtime):
        """
        Description: ECC解密算法接口
        Summary: 数字商品服务-密钥管理-私钥解密
        """
        UtilClient.validate_model(request)
        return _baasdt_models.ExecAasAntdaoPkiDecryptResponse().from_map(self.do_request("1.0", "baas.antdao.pki.decrypt.exec", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def update_aas_antdao_merchant_friend(self, request):
        """
        Description: 更新商户的友商信息
        Summary: 数字商品服务-商户管理-更新商户友商
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.update_aas_antdao_merchant_friend_ex(request, runtime)

    def update_aas_antdao_merchant_friend_ex(self, request, runtime):
        """
        Description: 更新商户的友商信息
        Summary: 数字商品服务-商户管理-更新商户友商
        """
        UtilClient.validate_model(request)
        return _baasdt_models.UpdateAasAntdaoMerchantFriendResponse().from_map(self.do_request("1.0", "baas.antdao.merchant.friend.update", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def create_aas_antdao_equity(self, request):
        """
        Description: 商品供应商户发布一个商品
        Summary: 数字商品服务-商品服务-创建商品
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.create_aas_antdao_equity_ex(request, runtime)

    def create_aas_antdao_equity_ex(self, request, runtime):
        """
        Description: 商品供应商户发布一个商品
        Summary: 数字商品服务-商品服务-创建商品
        """
        UtilClient.validate_model(request)
        return _baasdt_models.CreateAasAntdaoEquityResponse().from_map(self.do_request("1.0", "baas.antdao.equity.create", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def offline_aas_antdao_equity(self, request):
        """
        Description: 该接口不使用，合并至 baas.antdao.equity.status.update
        下线商品
        Summary: 数字商品服务-商品服务-下线商品
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.offline_aas_antdao_equity_ex(request, runtime)

    def offline_aas_antdao_equity_ex(self, request, runtime):
        """
        Description: 该接口不使用，合并至 baas.antdao.equity.status.update
        下线商品
        Summary: 数字商品服务-商品服务-下线商品
        """
        UtilClient.validate_model(request)
        return _baasdt_models.OfflineAasAntdaoEquityResponse().from_map(self.do_request("1.0", "baas.antdao.equity.offline", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def freeze_aas_antdao_equity(self, request):
        """
        Description: 该接口不使用，合并至baas.antdao.equity.status.update
        冻结权益
        Summary: 数字商品服务-商品服务-冻结商品
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.freeze_aas_antdao_equity_ex(request, runtime)

    def freeze_aas_antdao_equity_ex(self, request, runtime):
        """
        Description: 该接口不使用，合并至baas.antdao.equity.status.update
        冻结权益
        Summary: 数字商品服务-商品服务-冻结商品
        """
        UtilClient.validate_model(request)
        return _baasdt_models.FreezeAasAntdaoEquityResponse().from_map(self.do_request("1.0", "baas.antdao.equity.freeze", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def open_aas_antdao_equity_merchant(self, request):
        """
        Description: 授权兑换—非公开商品商户配置
        Summary: 数字商品服务-商品服务-授权兑换
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.open_aas_antdao_equity_merchant_ex(request, runtime)

    def open_aas_antdao_equity_merchant_ex(self, request, runtime):
        """
        Description: 授权兑换—非公开商品商户配置
        Summary: 数字商品服务-商品服务-授权兑换
        """
        UtilClient.validate_model(request)
        return _baasdt_models.OpenAasAntdaoEquityMerchantResponse().from_map(self.do_request("1.0", "baas.antdao.equity.merchant.open", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def auth_aas_antdao_equity_merchantuserprice(self, request):
        """
        Description: 用户兑换价格设置
        Summary: 数字商品服务-商品服务-用户兑换价格设置
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.auth_aas_antdao_equity_merchantuserprice_ex(request, runtime)

    def auth_aas_antdao_equity_merchantuserprice_ex(self, request, runtime):
        """
        Description: 用户兑换价格设置
        Summary: 数字商品服务-商品服务-用户兑换价格设置
        """
        UtilClient.validate_model(request)
        return _baasdt_models.AuthAasAntdaoEquityMerchantuserpriceResponse().from_map(self.do_request("1.0", "baas.antdao.equity.merchantuserprice.auth", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def update_aas_antdao_equity_defaultprice(self, request):
        """
        Description: 该接口不使用，合并至 baas.antdao.equity.update 
        更新商品价格
        Summary: 数字商品服务-商品服务-更新商品价格
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.update_aas_antdao_equity_defaultprice_ex(request, runtime)

    def update_aas_antdao_equity_defaultprice_ex(self, request, runtime):
        """
        Description: 该接口不使用，合并至 baas.antdao.equity.update 
        更新商品价格
        Summary: 数字商品服务-商品服务-更新商品价格
        """
        UtilClient.validate_model(request)
        return _baasdt_models.UpdateAasAntdaoEquityDefaultpriceResponse().from_map(self.do_request("1.0", "baas.antdao.equity.defaultprice.update", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def update_aas_antdao_equity_tenantprice(self, request):
        """
        Description: 更新商品自定义定价
        Summary: 数字商品服务-商品服务-更新自定义定价
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.update_aas_antdao_equity_tenantprice_ex(request, runtime)

    def update_aas_antdao_equity_tenantprice_ex(self, request, runtime):
        """
        Description: 更新商品自定义定价
        Summary: 数字商品服务-商品服务-更新自定义定价
        """
        UtilClient.validate_model(request)
        return _baasdt_models.UpdateAasAntdaoEquityTenantpriceResponse().from_map(self.do_request("1.0", "baas.antdao.equity.tenantprice.update", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def add_aas_antdao_equity_count(self, request):
        """
        Description: 该接口不使用，合并至 baas.antdao.equity.update
        增加权益库存
        Summary: 数字商品服务-商品服务-增加权益库存
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.add_aas_antdao_equity_count_ex(request, runtime)

    def add_aas_antdao_equity_count_ex(self, request, runtime):
        """
        Description: 该接口不使用，合并至 baas.antdao.equity.update
        增加权益库存
        Summary: 数字商品服务-商品服务-增加权益库存
        """
        UtilClient.validate_model(request)
        return _baasdt_models.AddAasAntdaoEquityCountResponse().from_map(self.do_request("1.0", "baas.antdao.equity.count.add", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def update_aas_antdao_equity_exchangelimit(self, request):
        """
        Description: 该接口不使用，合并至 baas.antdao.equity.update
        更新兑换限制规则
        Summary: 数字商品服务-商品服务-更新兑换限制规则
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.update_aas_antdao_equity_exchangelimit_ex(request, runtime)

    def update_aas_antdao_equity_exchangelimit_ex(self, request, runtime):
        """
        Description: 该接口不使用，合并至 baas.antdao.equity.update
        更新兑换限制规则
        Summary: 数字商品服务-商品服务-更新兑换限制规则
        """
        UtilClient.validate_model(request)
        return _baasdt_models.UpdateAasAntdaoEquityExchangelimitResponse().from_map(self.do_request("1.0", "baas.antdao.equity.exchangelimit.update", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def update_aas_antdao_equity_validtime(self, request):
        """
        Description: 该接口不使用，合并至 baas.antdao.equity.update
        更新商品有效期
        Summary: 数字商品服务-商品服务-更新有效期
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.update_aas_antdao_equity_validtime_ex(request, runtime)

    def update_aas_antdao_equity_validtime_ex(self, request, runtime):
        """
        Description: 该接口不使用，合并至 baas.antdao.equity.update
        更新商品有效期
        Summary: 数字商品服务-商品服务-更新有效期
        """
        UtilClient.validate_model(request)
        return _baasdt_models.UpdateAasAntdaoEquityValidtimeResponse().from_map(self.do_request("1.0", "baas.antdao.equity.validtime.update", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def query_aas_antdao_equity(self, request):
        """
        Description: 查询商品信息
        Summary: 数字商品服务-商品服务-查询商品信息
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.query_aas_antdao_equity_ex(request, runtime)

    def query_aas_antdao_equity_ex(self, request, runtime):
        """
        Description: 查询商品信息
        Summary: 数字商品服务-商品服务-查询商品信息
        """
        UtilClient.validate_model(request)
        return _baasdt_models.QueryAasAntdaoEquityResponse().from_map(self.do_request("1.0", "baas.antdao.equity.query", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def exec_aas_antdao_exchange_byuser(self, request):
        """
        Description: 用户身份发起兑换
        Summary: 数字商品服务-兑换服务-用户身份发起兑换
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.exec_aas_antdao_exchange_byuser_ex(request, runtime)

    def exec_aas_antdao_exchange_byuser_ex(self, request, runtime):
        """
        Description: 用户身份发起兑换
        Summary: 数字商品服务-兑换服务-用户身份发起兑换
        """
        UtilClient.validate_model(request)
        return _baasdt_models.ExecAasAntdaoExchangeByuserResponse().from_map(self.do_request("1.0", "baas.antdao.exchange.byuser.exec", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def exec_aas_antdao_exchange_bymerchant(self, request):
        """
        Description: 商户身份发起兑换
        Summary: 数字商品服务-商品服务-商户身份发起兑换
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.exec_aas_antdao_exchange_bymerchant_ex(request, runtime)

    def exec_aas_antdao_exchange_bymerchant_ex(self, request, runtime):
        """
        Description: 商户身份发起兑换
        Summary: 数字商品服务-商品服务-商户身份发起兑换
        """
        UtilClient.validate_model(request)
        return _baasdt_models.ExecAasAntdaoExchangeBymerchantResponse().from_map(self.do_request("1.0", "baas.antdao.exchange.bymerchant.exec", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def confirm_aas_antdao_exchange(self, request):
        """
        Description: 确认接单接口。注意：若确认接单则必须发货！如果不能确保发货则直接调用缺货接口。
        Summary: 数字商品服务-兑换服务-确认接单
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.confirm_aas_antdao_exchange_ex(request, runtime)

    def confirm_aas_antdao_exchange_ex(self, request, runtime):
        """
        Description: 确认接单接口。注意：若确认接单则必须发货！如果不能确保发货则直接调用缺货接口。
        Summary: 数字商品服务-兑换服务-确认接单
        """
        UtilClient.validate_model(request)
        return _baasdt_models.ConfirmAasAntdaoExchangeResponse().from_map(self.do_request("1.0", "baas.antdao.exchange.confirm", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def exec_aas_antdao_exchange_outofstore(self, request):
        """
        Description: 拒绝发货。供应商可由于缺货，商品不满足发货条件，意外状态下使用。
        Summary: 数字商品服务-兑换服务-拒绝发货
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.exec_aas_antdao_exchange_outofstore_ex(request, runtime)

    def exec_aas_antdao_exchange_outofstore_ex(self, request, runtime):
        """
        Description: 拒绝发货。供应商可由于缺货，商品不满足发货条件，意外状态下使用。
        Summary: 数字商品服务-兑换服务-拒绝发货
        """
        UtilClient.validate_model(request)
        return _baasdt_models.ExecAasAntdaoExchangeOutofstoreResponse().from_map(self.do_request("1.0", "baas.antdao.exchange.outofstore.exec", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def send_aas_antdao_exchange(self, request):
        """
        Description: 兑换发货
        Summary: 数字商品服务-兑换服务-兑换发货
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.send_aas_antdao_exchange_ex(request, runtime)

    def send_aas_antdao_exchange_ex(self, request, runtime):
        """
        Description: 兑换发货
        Summary: 数字商品服务-兑换服务-兑换发货
        """
        UtilClient.validate_model(request)
        return _baasdt_models.SendAasAntdaoExchangeResponse().from_map(self.do_request("1.0", "baas.antdao.exchange.send", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def exec_aas_antdao_exchange_receivebyuser(self, request):
        """
        Description: 用户身份确认收货
        Summary: 数字商品服务-兑换服务-用户身份确认收货
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.exec_aas_antdao_exchange_receivebyuser_ex(request, runtime)

    def exec_aas_antdao_exchange_receivebyuser_ex(self, request, runtime):
        """
        Description: 用户身份确认收货
        Summary: 数字商品服务-兑换服务-用户身份确认收货
        """
        UtilClient.validate_model(request)
        return _baasdt_models.ExecAasAntdaoExchangeReceivebyuserResponse().from_map(self.do_request("1.0", "baas.antdao.exchange.receivebyuser.exec", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def exec_aas_antdao_asset_expire(self, request):
        """
        Description: 资产过期
        Summary: 数字商品服务-资产服务-资产过期
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.exec_aas_antdao_asset_expire_ex(request, runtime)

    def exec_aas_antdao_asset_expire_ex(self, request, runtime):
        """
        Description: 资产过期
        Summary: 数字商品服务-资产服务-资产过期
        """
        UtilClient.validate_model(request)
        return _baasdt_models.ExecAasAntdaoAssetExpireResponse().from_map(self.do_request("1.0", "baas.antdao.asset.expire.exec", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def query_aas_antdao_asset_instruction(self, request):
        """
        Description: 检索资产流转流水
        Summary: 数字商品服务-资产服务-查询资产流转流水
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.query_aas_antdao_asset_instruction_ex(request, runtime)

    def query_aas_antdao_asset_instruction_ex(self, request, runtime):
        """
        Description: 检索资产流转流水
        Summary: 数字商品服务-资产服务-查询资产流转流水
        """
        UtilClient.validate_model(request)
        return _baasdt_models.QueryAasAntdaoAssetInstructionResponse().from_map(self.do_request("1.0", "baas.antdao.asset.instruction.query", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def query_aas_antdao_exchange_instruction(self, request):
        """
        Description: 该接口废弃不用！！！
        查询商品兑换流水
        Summary: 数字商品服务-兑换服务-查询商品兑换流水
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.query_aas_antdao_exchange_instruction_ex(request, runtime)

    def query_aas_antdao_exchange_instruction_ex(self, request, runtime):
        """
        Description: 该接口废弃不用！！！
        查询商品兑换流水
        Summary: 数字商品服务-兑换服务-查询商品兑换流水
        """
        UtilClient.validate_model(request)
        return _baasdt_models.QueryAasAntdaoExchangeInstructionResponse().from_map(self.do_request("1.0", "baas.antdao.exchange.instruction.query", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def exec_aas_antdao_asset_issue(self, request):
        """
        Description: 资产初始化发行
        Summary: 数字商品服务-资产服务-资产初始化发行
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.exec_aas_antdao_asset_issue_ex(request, runtime)

    def exec_aas_antdao_asset_issue_ex(self, request, runtime):
        """
        Description: 资产初始化发行
        Summary: 数字商品服务-资产服务-资产初始化发行
        """
        UtilClient.validate_model(request)
        return _baasdt_models.ExecAasAntdaoAssetIssueResponse().from_map(self.do_request("1.0", "baas.antdao.asset.issue.exec", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def exec_aas_antdao_asset_redeem(self, request):
        """
        Description: 赎回资产
        Summary: 数字商品服务-资产服务-赎回资产
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.exec_aas_antdao_asset_redeem_ex(request, runtime)

    def exec_aas_antdao_asset_redeem_ex(self, request, runtime):
        """
        Description: 赎回资产
        Summary: 数字商品服务-资产服务-赎回资产
        """
        UtilClient.validate_model(request)
        return _baasdt_models.ExecAasAntdaoAssetRedeemResponse().from_map(self.do_request("1.0", "baas.antdao.asset.redeem.exec", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def exec_aas_antdao_asset_grant(self, request):
        """
        Description: 发放资产
        Summary: 数字商品服务-资产服务-发放资产
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.exec_aas_antdao_asset_grant_ex(request, runtime)

    def exec_aas_antdao_asset_grant_ex(self, request, runtime):
        """
        Description: 发放资产
        Summary: 数字商品服务-资产服务-发放资产
        """
        UtilClient.validate_model(request)
        return _baasdt_models.ExecAasAntdaoAssetGrantResponse().from_map(self.do_request("1.0", "baas.antdao.asset.grant.exec", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def exec_aas_antdao_asset_grantrefund(self, request):
        """
        Description: 发放回退资产
        Summary: 数字商品服务-资产服务-发放回退资产
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.exec_aas_antdao_asset_grantrefund_ex(request, runtime)

    def exec_aas_antdao_asset_grantrefund_ex(self, request, runtime):
        """
        Description: 发放回退资产
        Summary: 数字商品服务-资产服务-发放回退资产
        """
        UtilClient.validate_model(request)
        return _baasdt_models.ExecAasAntdaoAssetGrantrefundResponse().from_map(self.do_request("1.0", "baas.antdao.asset.grantrefund.exec", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def exec_aas_antdao_asset_adjust(self, request):
        """
        Description: 风控调整资产
        Summary: 数字商品服务-资产服务-风控调整资产
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.exec_aas_antdao_asset_adjust_ex(request, runtime)

    def exec_aas_antdao_asset_adjust_ex(self, request, runtime):
        """
        Description: 风控调整资产
        Summary: 数字商品服务-资产服务-风控调整资产
        """
        UtilClient.validate_model(request)
        return _baasdt_models.ExecAasAntdaoAssetAdjustResponse().from_map(self.do_request("1.0", "baas.antdao.asset.adjust.exec", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def query_aas_antdao_asset(self, request):
        """
        Description: 资产查询
        Summary: 数字商品服务-资产服务-资产查询
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.query_aas_antdao_asset_ex(request, runtime)

    def query_aas_antdao_asset_ex(self, request, runtime):
        """
        Description: 资产查询
        Summary: 数字商品服务-资产服务-资产查询
        """
        UtilClient.validate_model(request)
        return _baasdt_models.QueryAasAntdaoAssetResponse().from_map(self.do_request("1.0", "baas.antdao.asset.query", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def exec_aas_antdao_exchange_receivebymerchant(self, request):
        """
        Description: 商户身份确认收货
        Summary: 数字商品服务-兑换服务-商户身份确认收货
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.exec_aas_antdao_exchange_receivebymerchant_ex(request, runtime)

    def exec_aas_antdao_exchange_receivebymerchant_ex(self, request, runtime):
        """
        Description: 商户身份确认收货
        Summary: 数字商品服务-兑换服务-商户身份确认收货
        """
        UtilClient.validate_model(request)
        return _baasdt_models.ExecAasAntdaoExchangeReceivebymerchantResponse().from_map(self.do_request("1.0", "baas.antdao.exchange.receivebymerchant.exec", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def query_aas_antdao_block(self, request):
        """
        Description: 获取特定高度的区块信息
        Summary: 数字商品服务-拉块服务-获取区块信息
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.query_aas_antdao_block_ex(request, runtime)

    def query_aas_antdao_block_ex(self, request, runtime):
        """
        Description: 获取特定高度的区块信息
        Summary: 数字商品服务-拉块服务-获取区块信息
        """
        UtilClient.validate_model(request)
        return _baasdt_models.QueryAasAntdaoBlockResponse().from_map(self.do_request("1.0", "baas.antdao.block.query", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def query_aas_antdao_block_lastblocknumber(self, request):
        """
        Description: 获取区块链最新区块高度
        Summary: 数字商品服务-拉块服务-获取最新区块高度
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.query_aas_antdao_block_lastblocknumber_ex(request, runtime)

    def query_aas_antdao_block_lastblocknumber_ex(self, request, runtime):
        """
        Description: 获取区块链最新区块高度
        Summary: 数字商品服务-拉块服务-获取最新区块高度
        """
        UtilClient.validate_model(request)
        return _baasdt_models.QueryAasAntdaoBlockLastblocknumberResponse().from_map(self.do_request("1.0", "baas.antdao.block.lastblocknumber.query", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def update_aas_antdao_equity(self, request):
        """
        Description: 更新商品信息
        Summary: 数字商品服务-商品服务-更新商品属性信息
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.update_aas_antdao_equity_ex(request, runtime)

    def update_aas_antdao_equity_ex(self, request, runtime):
        """
        Description: 更新商品信息
        Summary: 数字商品服务-商品服务-更新商品属性信息
        """
        UtilClient.validate_model(request)
        return _baasdt_models.UpdateAasAntdaoEquityResponse().from_map(self.do_request("1.0", "baas.antdao.equity.update", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def query_aas_antdao_equity_createresult(self, request):
        """
        Description: 配合异步发布权益接口，查询发布权益商品结果。如查询无结果，判断错误类型，用户需要轮询。
        Summary: 数字商品服务-商品服务-发布商品结果查询
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.query_aas_antdao_equity_createresult_ex(request, runtime)

    def query_aas_antdao_equity_createresult_ex(self, request, runtime):
        """
        Description: 配合异步发布权益接口，查询发布权益商品结果。如查询无结果，判断错误类型，用户需要轮询。
        Summary: 数字商品服务-商品服务-发布商品结果查询
        """
        UtilClient.validate_model(request)
        return _baasdt_models.QueryAasAntdaoEquityCreateresultResponse().from_map(self.do_request("1.0", "baas.antdao.equity.createresult.query", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def query_aas_antdao_equity_instruction(self, request):
        """
        Description: 根据商品兑换流水交易号查询商品兑换流水详情
        Summary: 数字商品服务-商品服务-查询商品兑换流水
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.query_aas_antdao_equity_instruction_ex(request, runtime)

    def query_aas_antdao_equity_instruction_ex(self, request, runtime):
        """
        Description: 根据商品兑换流水交易号查询商品兑换流水详情
        Summary: 数字商品服务-商品服务-查询商品兑换流水
        """
        UtilClient.validate_model(request)
        return _baasdt_models.QueryAasAntdaoEquityInstructionResponse().from_map(self.do_request("1.0", "baas.antdao.equity.instruction.query", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def query_aas_antdao_image(self, request):
        """
        Description: 传入图片的不可访问URL，获取图片的临时可访问URL（支持批量查询）
        Summary: 数字商品服务-OSS服务-获取图片URL
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.query_aas_antdao_image_ex(request, runtime)

    def query_aas_antdao_image_ex(self, request, runtime):
        """
        Description: 传入图片的不可访问URL，获取图片的临时可访问URL（支持批量查询）
        Summary: 数字商品服务-OSS服务-获取图片URL
        """
        UtilClient.validate_model(request)
        return _baasdt_models.QueryAasAntdaoImageResponse().from_map(self.do_request("1.0", "baas.antdao.image.query", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def update_aas_antdao_equity_status(self, request):
        """
        Description: 更新商品状态（可用，冻结，下线）
        Summary: 数字商品服务-商品服务-更新商品状态
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.update_aas_antdao_equity_status_ex(request, runtime)

    def update_aas_antdao_equity_status_ex(self, request, runtime):
        """
        Description: 更新商品状态（可用，冻结，下线）
        Summary: 数字商品服务-商品服务-更新商品状态
        """
        UtilClient.validate_model(request)
        return _baasdt_models.UpdateAasAntdaoEquityStatusResponse().from_map(self.do_request("1.0", "baas.antdao.equity.status.update", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def set_aas_antdao_merchant_provision(self, request):
        """
        Description: 设置备付金金额（CAS接口）
        Summary: 数字商品服务-商户管理-设置备付金金额
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.set_aas_antdao_merchant_provision_ex(request, runtime)

    def set_aas_antdao_merchant_provision_ex(self, request, runtime):
        """
        Description: 设置备付金金额（CAS接口）
        Summary: 数字商品服务-商户管理-设置备付金金额
        """
        UtilClient.validate_model(request)
        return _baasdt_models.SetAasAntdaoMerchantProvisionResponse().from_map(self.do_request("1.0", "baas.antdao.merchant.provision.set", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def update_aas_antdao_merchant_provision(self, request):
        """
        Description: 更新商户的备付金金额，由资金管理员操作
        Summary: 数字商品服务-商户管理-更新备付金金额
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.update_aas_antdao_merchant_provision_ex(request, runtime)

    def update_aas_antdao_merchant_provision_ex(self, request, runtime):
        """
        Description: 更新商户的备付金金额，由资金管理员操作
        Summary: 数字商品服务-商户管理-更新备付金金额
        """
        UtilClient.validate_model(request)
        return _baasdt_models.UpdateAasAntdaoMerchantProvisionResponse().from_map(self.do_request("1.0", "baas.antdao.merchant.provision.update", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def exec_aas_antdao_equity_instructionwriteoff(self, request):
        """
        Description: 核销商品兑换交易，由资金管理员操作
        Summary: 数字商品服务-商品服务-核销商品兑换交易
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.exec_aas_antdao_equity_instructionwriteoff_ex(request, runtime)

    def exec_aas_antdao_equity_instructionwriteoff_ex(self, request, runtime):
        """
        Description: 核销商品兑换交易，由资金管理员操作
        Summary: 数字商品服务-商品服务-核销商品兑换交易
        """
        UtilClient.validate_model(request)
        return _baasdt_models.ExecAasAntdaoEquityInstructionwriteoffResponse().from_map(self.do_request("1.0", "baas.antdao.equity.instructionwriteoff.exec", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def query_aas_antdao_merchant_provisions(self, request):
        """
        Description: 查询租户的备付金列表
        Summary: 数字商品服务-商户管理-查租户备付金列表
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.query_aas_antdao_merchant_provisions_ex(request, runtime)

    def query_aas_antdao_merchant_provisions_ex(self, request, runtime):
        """
        Description: 查询租户的备付金列表
        Summary: 数字商品服务-商户管理-查租户备付金列表
        """
        UtilClient.validate_model(request)
        return _baasdt_models.QueryAasAntdaoMerchantProvisionsResponse().from_map(self.do_request("1.0", "baas.antdao.merchant.provisions.query", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def query_aas_antdao_merchant_exchangeableequitylist(self, request):
        """
        Description: 只有代理到数字商品管理后台的商户才能查询到信息。查询商户可兑换商品列表
        Summary: 数字商品服务-商户管理-查询可兑换商品
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.query_aas_antdao_merchant_exchangeableequitylist_ex(request, runtime)

    def query_aas_antdao_merchant_exchangeableequitylist_ex(self, request, runtime):
        """
        Description: 只有代理到数字商品管理后台的商户才能查询到信息。查询商户可兑换商品列表
        Summary: 数字商品服务-商户管理-查询可兑换商品
        """
        UtilClient.validate_model(request)
        return _baasdt_models.QueryAasAntdaoMerchantExchangeableequitylistResponse().from_map(self.do_request("1.0", "baas.antdao.merchant.exchangeableequitylist.query", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def query_aas_antdao_merchant_exchangeableequitydetail(self, request):
        """
        Description: 只有代理到数字商品管理后台的商户才能查询到信息。查询商户可兑换的商品明细信息
        Summary: 数字商品服务-商户管理-查询可兑商品明细
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.query_aas_antdao_merchant_exchangeableequitydetail_ex(request, runtime)

    def query_aas_antdao_merchant_exchangeableequitydetail_ex(self, request, runtime):
        """
        Description: 只有代理到数字商品管理后台的商户才能查询到信息。查询商户可兑换的商品明细信息
        Summary: 数字商品服务-商户管理-查询可兑商品明细
        """
        UtilClient.validate_model(request)
        return _baasdt_models.QueryAasAntdaoMerchantExchangeableequitydetailResponse().from_map(self.do_request("1.0", "baas.antdao.merchant.exchangeableequitydetail.query", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def exec_aas_antdao_asset_create(self, request):
        """
        Description: 创建新资产
        Summary: 数字商品服务-资产服务-创建资产
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.exec_aas_antdao_asset_create_ex(request, runtime)

    def exec_aas_antdao_asset_create_ex(self, request, runtime):
        """
        Description: 创建新资产
        Summary: 数字商品服务-资产服务-创建资产
        """
        UtilClient.validate_model(request)
        return _baasdt_models.ExecAasAntdaoAssetCreateResponse().from_map(self.do_request("1.0", "baas.antdao.asset.create.exec", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def exec_aas_antdao_asset_generate(self, request):
        """
        Description: 资产铸币(不扣减备付金)，合约管理员操作
        Summary: 数字商品服务-资产服务-资产铸币
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.exec_aas_antdao_asset_generate_ex(request, runtime)

    def exec_aas_antdao_asset_generate_ex(self, request, runtime):
        """
        Description: 资产铸币(不扣减备付金)，合约管理员操作
        Summary: 数字商品服务-资产服务-资产铸币
        """
        UtilClient.validate_model(request)
        return _baasdt_models.ExecAasAntdaoAssetGenerateResponse().from_map(self.do_request("1.0", "baas.antdao.asset.generate.exec", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def create_aas_antdao_merchant(self, request):
        """
        Description: 创建商户（合约管理员权限）
        Summary: 数字商品服务-商户管理-创建商户
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.create_aas_antdao_merchant_ex(request, runtime)

    def create_aas_antdao_merchant_ex(self, request, runtime):
        """
        Description: 创建商户（合约管理员权限）
        Summary: 数字商品服务-商户管理-创建商户
        """
        UtilClient.validate_model(request)
        return _baasdt_models.CreateAasAntdaoMerchantResponse().from_map(self.do_request("1.0", "baas.antdao.merchant.create", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def set_aas_antdao_merchant_fundmanager(self, request):
        """
        Description: 设置商户的资金管理员，重要权限，谨慎操作！
        Summary: 数字商品服务-商户管理-设置资金管理员
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.set_aas_antdao_merchant_fundmanager_ex(request, runtime)

    def set_aas_antdao_merchant_fundmanager_ex(self, request, runtime):
        """
        Description: 设置商户的资金管理员，重要权限，谨慎操作！
        Summary: 数字商品服务-商户管理-设置资金管理员
        """
        UtilClient.validate_model(request)
        return _baasdt_models.SetAasAntdaoMerchantFundmanagerResponse().from_map(self.do_request("1.0", "baas.antdao.merchant.fundmanager.set", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def create_aas_antdao_merchant_provision(self, request):
        """
        Description: 创建备付金账户，合约管理员权限
        Summary: 数字商品服务-商户管理-创建备付金账户
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.create_aas_antdao_merchant_provision_ex(request, runtime)

    def create_aas_antdao_merchant_provision_ex(self, request, runtime):
        """
        Description: 创建备付金账户，合约管理员权限
        Summary: 数字商品服务-商户管理-创建备付金账户
        """
        UtilClient.validate_model(request)
        return _baasdt_models.CreateAasAntdaoMerchantProvisionResponse().from_map(self.do_request("1.0", "baas.antdao.merchant.provision.create", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def query_aas_antdao_config_delegaterelation(self, request):
        """
        Description: 查询租户的授权代理权限
        Summary: 数字商品服务-管理服务-代理权限查询
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.query_aas_antdao_config_delegaterelation_ex(request, runtime)

    def query_aas_antdao_config_delegaterelation_ex(self, request, runtime):
        """
        Description: 查询租户的授权代理权限
        Summary: 数字商品服务-管理服务-代理权限查询
        """
        UtilClient.validate_model(request)
        return _baasdt_models.QueryAasAntdaoConfigDelegaterelationResponse().from_map(self.do_request("1.0", "baas.antdao.config.delegaterelation.query", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def update_aas_antdao_config_delegaterelation(self, request):
        """
        Description: 设置租户的授权代理权限。赋予 opt_tenant_id 代理 delegated_tenant_id 调用接口的权限，见可代理的接口详情单。
        Summary: 数字商品服务-管理服务-设置代理权限
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.update_aas_antdao_config_delegaterelation_ex(request, runtime)

    def update_aas_antdao_config_delegaterelation_ex(self, request, runtime):
        """
        Description: 设置租户的授权代理权限。赋予 opt_tenant_id 代理 delegated_tenant_id 调用接口的权限，见可代理的接口详情单。
        Summary: 数字商品服务-管理服务-设置代理权限
        """
        UtilClient.validate_model(request)
        return _baasdt_models.UpdateAasAntdaoConfigDelegaterelationResponse().from_map(self.do_request("1.0", "baas.antdao.config.delegaterelation.update", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def query_aas_antdao_config_whitelist(self, request):
        """
        Description: 查询接口访问白名单信息
        Summary: 数字商品服务-拉块服务-查询接口白名单
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.query_aas_antdao_config_whitelist_ex(request, runtime)

    def query_aas_antdao_config_whitelist_ex(self, request, runtime):
        """
        Description: 查询接口访问白名单信息
        Summary: 数字商品服务-拉块服务-查询接口白名单
        """
        UtilClient.validate_model(request)
        return _baasdt_models.QueryAasAntdaoConfigWhitelistResponse().from_map(self.do_request("1.0", "baas.antdao.config.whitelist.query", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def update_aas_antdao_config_whitelist(self, request):
        """
        Description: 设置接口访问白名单
        Summary: 数字商品服务-管理服务-设置访问白名单
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.update_aas_antdao_config_whitelist_ex(request, runtime)

    def update_aas_antdao_config_whitelist_ex(self, request, runtime):
        """
        Description: 设置接口访问白名单
        Summary: 数字商品服务-管理服务-设置访问白名单
        """
        UtilClient.validate_model(request)
        return _baasdt_models.UpdateAasAntdaoConfigWhitelistResponse().from_map(self.do_request("1.0", "baas.antdao.config.whitelist.update", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def apply_aas_antdao_exchange_aftersale(self, request):
        """
        Description: 兑换单申请售后（采购商）
        Summary: 数字商品服务-兑换服务-申请售后(商家)
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.apply_aas_antdao_exchange_aftersale_ex(request, runtime)

    def apply_aas_antdao_exchange_aftersale_ex(self, request, runtime):
        """
        Description: 兑换单申请售后（采购商）
        Summary: 数字商品服务-兑换服务-申请售后(商家)
        """
        UtilClient.validate_model(request)
        return _baasdt_models.ApplyAasAntdaoExchangeAftersaleResponse().from_map(self.do_request("1.0", "baas.antdao.exchange.aftersale.apply", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def exec_aas_antdao_exchange_agreeaftersale(self, request):
        """
        Description: 同意售后（供应商）
        Summary: 数字商品服务-兑换服务-同意售后
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.exec_aas_antdao_exchange_agreeaftersale_ex(request, runtime)

    def exec_aas_antdao_exchange_agreeaftersale_ex(self, request, runtime):
        """
        Description: 同意售后（供应商）
        Summary: 数字商品服务-兑换服务-同意售后
        """
        UtilClient.validate_model(request)
        return _baasdt_models.ExecAasAntdaoExchangeAgreeaftersaleResponse().from_map(self.do_request("1.0", "baas.antdao.exchange.agreeaftersale.exec", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def refuse_aas_antdao_exchange_aftersale(self, request):
        """
        Description: 拒绝售后（供应商）
        Summary: 数字商品服务-兑换服务-拒绝售后
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.refuse_aas_antdao_exchange_aftersale_ex(request, runtime)

    def refuse_aas_antdao_exchange_aftersale_ex(self, request, runtime):
        """
        Description: 拒绝售后（供应商）
        Summary: 数字商品服务-兑换服务-拒绝售后
        """
        UtilClient.validate_model(request)
        return _baasdt_models.RefuseAasAntdaoExchangeAftersaleResponse().from_map(self.do_request("1.0", "baas.antdao.exchange.aftersale.refuse", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def send_aas_antdao_exchange_aftersale(self, request):
        """
        Description: 重新发货（供应商）
        Summary: 数字商品服务-兑换服务-重新发货
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.send_aas_antdao_exchange_aftersale_ex(request, runtime)

    def send_aas_antdao_exchange_aftersale_ex(self, request, runtime):
        """
        Description: 重新发货（供应商）
        Summary: 数字商品服务-兑换服务-重新发货
        """
        UtilClient.validate_model(request)
        return _baasdt_models.SendAasAntdaoExchangeAftersaleResponse().from_map(self.do_request("1.0", "baas.antdao.exchange.aftersale.send", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def confirm_aas_antdao_exchange_aftersale(self, request):
        """
        Description: 商户确认售后（供应商）comfirmaftersale
        Summary:  数字商品服务-兑换服务-商户确认售后
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.confirm_aas_antdao_exchange_aftersale_ex(request, runtime)

    def confirm_aas_antdao_exchange_aftersale_ex(self, request, runtime):
        """
        Description: 商户确认售后（供应商）comfirmaftersale
        Summary:  数字商品服务-兑换服务-商户确认售后
        """
        UtilClient.validate_model(request)
        return _baasdt_models.ConfirmAasAntdaoExchangeAftersaleResponse().from_map(self.do_request("1.0", "baas.antdao.exchange.aftersale.confirm", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def exec_aas_antdao_data_deposit(self, request):
        """
        Description: 数字消费卡链上发布
        Summary: 数字商品服务-存证服务-消费卡链上发布
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.exec_aas_antdao_data_deposit_ex(request, runtime)

    def exec_aas_antdao_data_deposit_ex(self, request, runtime):
        """
        Description: 数字消费卡链上发布
        Summary: 数字商品服务-存证服务-消费卡链上发布
        """
        UtilClient.validate_model(request)
        return _baasdt_models.ExecAasAntdaoDataDepositResponse().from_map(self.do_request("1.0", "baas.antdao.data.deposit.exec", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def set_aas_antdao_commission(self, request):
        """
        Description: 设置商品兑换手续费
        Summary: 数字商品服务-商品服务-设置商品手续费
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.set_aas_antdao_commission_ex(request, runtime)

    def set_aas_antdao_commission_ex(self, request, runtime):
        """
        Description: 设置商品兑换手续费
        Summary: 数字商品服务-商品服务-设置商品手续费
        """
        UtilClient.validate_model(request)
        return _baasdt_models.SetAasAntdaoCommissionResponse().from_map(self.do_request("1.0", "baas.antdao.commission.set", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def query_aas_antdao_commission(self, request):
        """
        Description: 查询商品手续费（可查询 当前生效 和 全部 的手续费信息）
        Summary: 数字商品服务-商品服务-查询商品手续费
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.query_aas_antdao_commission_ex(request, runtime)

    def query_aas_antdao_commission_ex(self, request, runtime):
        """
        Description: 查询商品手续费（可查询 当前生效 和 全部 的手续费信息）
        Summary: 数字商品服务-商品服务-查询商品手续费
        """
        UtilClient.validate_model(request)
        return _baasdt_models.QueryAasAntdaoCommissionResponse().from_map(self.do_request("1.0", "baas.antdao.commission.query", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def set_aas_antdao_commission_merchant(self, request):
        """
        Description: 设置收取手续费的商户信息（合约管理员权限）
        Summary: 数字商品服务-商品服务-设置收手续费商户
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.set_aas_antdao_commission_merchant_ex(request, runtime)

    def set_aas_antdao_commission_merchant_ex(self, request, runtime):
        """
        Description: 设置收取手续费的商户信息（合约管理员权限）
        Summary: 数字商品服务-商品服务-设置收手续费商户
        """
        UtilClient.validate_model(request)
        return _baasdt_models.SetAasAntdaoCommissionMerchantResponse().from_map(self.do_request("1.0", "baas.antdao.commission.merchant.set", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def query_aas_antdao_commission_merchant(self, request):
        """
        Description: 查询收取手续费的商户信息
        Summary: 数字商品服务-商品服务-查询收手续费商户
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.query_aas_antdao_commission_merchant_ex(request, runtime)

    def query_aas_antdao_commission_merchant_ex(self, request, runtime):
        """
        Description: 查询收取手续费的商户信息
        Summary: 数字商品服务-商品服务-查询收手续费商户
        """
        UtilClient.validate_model(request)
        return _baasdt_models.QueryAasAntdaoCommissionMerchantResponse().from_map(self.do_request("1.0", "baas.antdao.commission.merchant.query", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def query_aas_antdao_blockanalysis_block(self, request):
        """
        Description: 获取特定高度的区块信息
        Summary: 数字商品服务-拉块服务-获取区块信息
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.query_aas_antdao_blockanalysis_block_ex(request, runtime)

    def query_aas_antdao_blockanalysis_block_ex(self, request, runtime):
        """
        Description: 获取特定高度的区块信息
        Summary: 数字商品服务-拉块服务-获取区块信息
        """
        UtilClient.validate_model(request)
        return _baasdt_models.QueryAasAntdaoBlockanalysisBlockResponse().from_map(self.do_request("1.0", "baas.antdao.blockanalysis.block.query", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def query_aas_antdao_blockanalysis_lastblocknumber(self, request):
        """
        Description: 获取最新区块高度
        Summary: 数字商品服务-拉块服务-获取最新区块高度
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.query_aas_antdao_blockanalysis_lastblocknumber_ex(request, runtime)

    def query_aas_antdao_blockanalysis_lastblocknumber_ex(self, request, runtime):
        """
        Description: 获取最新区块高度
        Summary: 数字商品服务-拉块服务-获取最新区块高度
        """
        UtilClient.validate_model(request)
        return _baasdt_models.QueryAasAntdaoBlockanalysisLastblocknumberResponse().from_map(self.do_request("1.0", "baas.antdao.blockanalysis.lastblocknumber.query", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def query_aas_antdao_blockanalysis_openedequities(self, request):
        """
        Description: 获取公开的或者已授权的权益商品信息
        Summary: 数字商品服务-拉块服务-获取已授权商品
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.query_aas_antdao_blockanalysis_openedequities_ex(request, runtime)

    def query_aas_antdao_blockanalysis_openedequities_ex(self, request, runtime):
        """
        Description: 获取公开的或者已授权的权益商品信息
        Summary: 数字商品服务-拉块服务-获取已授权商品
        """
        UtilClient.validate_model(request)
        return _baasdt_models.QueryAasAntdaoBlockanalysisOpenedequitiesResponse().from_map(self.do_request("1.0", "baas.antdao.blockanalysis.openedequities.query", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def query_aas_antdao_blockanalysis_userpriceupdatedequities(self, request):
        """
        Description: 查询已设置过用户价格的有效权益商品信息
        Summary: 数字商品服务-拉块服务-已设用户价格商品
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.query_aas_antdao_blockanalysis_userpriceupdatedequities_ex(request, runtime)

    def query_aas_antdao_blockanalysis_userpriceupdatedequities_ex(self, request, runtime):
        """
        Description: 查询已设置过用户价格的有效权益商品信息
        Summary: 数字商品服务-拉块服务-已设用户价格商品
        """
        UtilClient.validate_model(request)
        return _baasdt_models.QueryAasAntdaoBlockanalysisUserpriceupdatedequitiesResponse().from_map(self.do_request("1.0", "baas.antdao.blockanalysis.userpriceupdatedequities.query", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def query_aas_antdao_blockanalysis_unwriteoffvalue(self, request):
        """
        Description: 查询商户的可提现资产价值(单位:分)
        Summary: 数字商品服务-拉块服务-查询可提现资产
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.query_aas_antdao_blockanalysis_unwriteoffvalue_ex(request, runtime)

    def query_aas_antdao_blockanalysis_unwriteoffvalue_ex(self, request, runtime):
        """
        Description: 查询商户的可提现资产价值(单位:分)
        Summary: 数字商品服务-拉块服务-查询可提现资产
        """
        UtilClient.validate_model(request)
        return _baasdt_models.QueryAasAntdaoBlockanalysisUnwriteoffvalueResponse().from_map(self.do_request("1.0", "baas.antdao.blockanalysis.unwriteoffvalue.query", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def update_aas_antdao_blockanalysis_delegaterelation(self, request):
        """
        Description: 设置租户的授权代理权限。赋予 opt_tenant_id 代理 delegated_tenant_id 调用接口的权限，见可代理的接口详情单。
        Summary: 数字商品服务-拉块服务-设置代理权限
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.update_aas_antdao_blockanalysis_delegaterelation_ex(request, runtime)

    def update_aas_antdao_blockanalysis_delegaterelation_ex(self, request, runtime):
        """
        Description: 设置租户的授权代理权限。赋予 opt_tenant_id 代理 delegated_tenant_id 调用接口的权限，见可代理的接口详情单。
        Summary: 数字商品服务-拉块服务-设置代理权限
        """
        UtilClient.validate_model(request)
        return _baasdt_models.UpdateAasAntdaoBlockanalysisDelegaterelationResponse().from_map(self.do_request("1.0", "baas.antdao.blockanalysis.delegaterelation.update", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def update_aas_antdao_blockanalysis_whitelist(self, request):
        """
        Description: 设置接口访问白名单。
        Summary: 数字商品服务-拉块服务-设置访问白名单
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.update_aas_antdao_blockanalysis_whitelist_ex(request, runtime)

    def update_aas_antdao_blockanalysis_whitelist_ex(self, request, runtime):
        """
        Description: 设置接口访问白名单。
        Summary: 数字商品服务-拉块服务-设置访问白名单
        """
        UtilClient.validate_model(request)
        return _baasdt_models.UpdateAasAntdaoBlockanalysisWhitelistResponse().from_map(self.do_request("1.0", "baas.antdao.blockanalysis.whitelist.update", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def query_aas_antdao_blockanalysis_delegaterelation(self, request):
        """
        Description: 查询租户的授权代理权限
        Summary: 数字商品服务-拉块服务-代理权限查询
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.query_aas_antdao_blockanalysis_delegaterelation_ex(request, runtime)

    def query_aas_antdao_blockanalysis_delegaterelation_ex(self, request, runtime):
        """
        Description: 查询租户的授权代理权限
        Summary: 数字商品服务-拉块服务-代理权限查询
        """
        UtilClient.validate_model(request)
        return _baasdt_models.QueryAasAntdaoBlockanalysisDelegaterelationResponse().from_map(self.do_request("1.0", "baas.antdao.blockanalysis.delegaterelation.query", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def query_aas_antdao_blockanalysis_whitelist(self, request):
        """
        Description: 查询接口访问白名单信息
        Summary: 数字商品服务-拉块服务-查询接口白名单
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.query_aas_antdao_blockanalysis_whitelist_ex(request, runtime)

    def query_aas_antdao_blockanalysis_whitelist_ex(self, request, runtime):
        """
        Description: 查询接口访问白名单信息
        Summary: 数字商品服务-拉块服务-查询接口白名单
        """
        UtilClient.validate_model(request)
        return _baasdt_models.QueryAasAntdaoBlockanalysisWhitelistResponse().from_map(self.do_request("1.0", "baas.antdao.blockanalysis.whitelist.query", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def query_aas_antdao_blockanalysis_transaction(self, request):
        """
        Description: 根据交易hash获取交易信息
        Summary: 数字商品服务-拉块服务-获取交易信息
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.query_aas_antdao_blockanalysis_transaction_ex(request, runtime)

    def query_aas_antdao_blockanalysis_transaction_ex(self, request, runtime):
        """
        Description: 根据交易hash获取交易信息
        Summary: 数字商品服务-拉块服务-获取交易信息
        """
        UtilClient.validate_model(request)
        return _baasdt_models.QueryAasAntdaoBlockanalysisTransactionResponse().from_map(self.do_request("1.0", "baas.antdao.blockanalysis.transaction.query", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def query_aas_antdao_mypoints_sku(self, request):
        """
        Description: 可订购的SKU列表查询
        Summary: 数字商品服务-商品服务-商品列表查询
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.query_aas_antdao_mypoints_sku_ex(request, runtime)

    def query_aas_antdao_mypoints_sku_ex(self, request, runtime):
        """
        Description: 可订购的SKU列表查询
        Summary: 数字商品服务-商品服务-商品列表查询
        """
        UtilClient.validate_model(request)
        return _baasdt_models.QueryAasAntdaoMypointsSkuResponse().from_map(self.do_request("1.0", "baas.antdao.mypoints.sku.query", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def query_aas_antdao_mypoints_merchantbalance(self, request):
        """
        Description: 查询商户的积分库和预算库
        Summary: 数字商品服务-商品服务-积分预算库查询
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.query_aas_antdao_mypoints_merchantbalance_ex(request, runtime)

    def query_aas_antdao_mypoints_merchantbalance_ex(self, request, runtime):
        """
        Description: 查询商户的积分库和预算库
        Summary: 数字商品服务-商品服务-积分预算库查询
        """
        UtilClient.validate_model(request)
        return _baasdt_models.QueryAasAntdaoMypointsMerchantbalanceResponse().from_map(self.do_request("1.0", "baas.antdao.mypoints.merchantbalance.query", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def exec_aas_antdao_mypoints_preordersku(self, request):
        """
        Description: 预下单商品
        Summary: 数字商品服务-商品服务-商品预下单
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.exec_aas_antdao_mypoints_preordersku_ex(request, runtime)

    def exec_aas_antdao_mypoints_preordersku_ex(self, request, runtime):
        """
        Description: 预下单商品
        Summary: 数字商品服务-商品服务-商品预下单
        """
        UtilClient.validate_model(request)
        return _baasdt_models.ExecAasAntdaoMypointsPreorderskuResponse().from_map(self.do_request("1.0", "baas.antdao.mypoints.preordersku.exec", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def exec_aas_antdao_mypoints_ordersku(self, request):
        """
        Description: 商品下单
        Summary: 数字商品服务-商品服务-商品下单
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.exec_aas_antdao_mypoints_ordersku_ex(request, runtime)

    def exec_aas_antdao_mypoints_ordersku_ex(self, request, runtime):
        """
        Description: 商品下单
        Summary: 数字商品服务-商品服务-商品下单
        """
        UtilClient.validate_model(request)
        return _baasdt_models.ExecAasAntdaoMypointsOrderskuResponse().from_map(self.do_request("1.0", "baas.antdao.mypoints.ordersku.exec", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def query_aas_antdao_mypoints_skufee(self, request):
        """
        Description: 根据商品ID，查询批量购买的费率
        Summary: 数字商品服务-商品服务-商品费率查询
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.query_aas_antdao_mypoints_skufee_ex(request, runtime)

    def query_aas_antdao_mypoints_skufee_ex(self, request, runtime):
        """
        Description: 根据商品ID，查询批量购买的费率
        Summary: 数字商品服务-商品服务-商品费率查询
        """
        UtilClient.validate_model(request)
        return _baasdt_models.QueryAasAntdaoMypointsSkufeeResponse().from_map(self.do_request("1.0", "baas.antdao.mypoints.skufee.query", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def query_aas_antdao_mypoints_preorderinstruction(self, request):
        """
        Description: 查询集分宝SKU的预下单流水记录
        Summary: 数字商品服务-商品服务-预下单流水查询
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.query_aas_antdao_mypoints_preorderinstruction_ex(request, runtime)

    def query_aas_antdao_mypoints_preorderinstruction_ex(self, request, runtime):
        """
        Description: 查询集分宝SKU的预下单流水记录
        Summary: 数字商品服务-商品服务-预下单流水查询
        """
        UtilClient.validate_model(request)
        return _baasdt_models.QueryAasAntdaoMypointsPreorderinstructionResponse().from_map(self.do_request("1.0", "baas.antdao.mypoints.preorderinstruction.query", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))


    def query_aas_antdao_mypoints_orderinstruction(self, request):
        """
        Description: 查询下单流水信息
        Summary: 数字商品服务-商品服务-商品下单流水查询
        """
        runtime = util_models.RuntimeOptions(

        )
        return self.query_aas_antdao_mypoints_orderinstruction_ex(request, runtime)

    def query_aas_antdao_mypoints_orderinstruction_ex(self, request, runtime):
        """
        Description: 查询下单流水信息
        Summary: 数字商品服务-商品服务-商品下单流水查询
        """
        UtilClient.validate_model(request)
        return _baasdt_models.QueryAasAntdaoMypointsOrderinstructionResponse().from_map(self.do_request("1.0", "baas.antdao.mypoints.orderinstruction.query", "HTTPS", "POST", "/gateway.do", request.to_map(), runtime))

