# -*- coding: utf-8 -*-
# This file is auto-generated, don't edit it. Thanks.
import time

from Tea.exceptions import TeaException, UnretryableException
from Tea.request import TeaRequest
from Tea.core import TeaCore

from alibabacloud_tea_util.client import Client as UtilClient
from antchain_alipay_util.client import Client as AlipayUtilClient
from alibabacloud_rpc_util.client import Client as RPCUtilClient
from antchain_sdk_shuziwuliu import models as shuziwuliu_models
from alibabacloud_tea_util import models as util_models


class Client(object):
    def __init__(self, config, _endpoint=None, _region_id=None, _access_key_id=None, _access_key_secret=None,
                 _protocol=None, _user_agent=None, _read_timeout=None, _connect_timeout=None, _http_proxy=None,
                 _https_proxy=None, _socks_5proxy=None, _socks_5net_work=None, _no_proxy=None, _max_idle_conns=None,
                 _security_token=None):
        """
        Init client with Config

        @param config: config contains the necessary information to create a client
        """
        self._endpoint = _endpoint      # type: str
        self._region_id = _region_id    # type: str
        self._access_key_id = _access_key_id  # type: str
        self._access_key_secret = _access_key_secret  # type: str
        self._protocol = _protocol      # type: str
        self._user_agent = _user_agent  # type: str
        self._read_timeout = _read_timeout  # type: int
        self._connect_timeout = _connect_timeout  # type: int
        self._http_proxy = _http_proxy  # type: str
        self._https_proxy = _https_proxy  # type: str
        self._socks_5proxy = _socks_5proxy  # type: str
        self._socks_5net_work = _socks_5net_work  # type: str
        self._no_proxy = _no_proxy      # type: str
        self._max_idle_conns = _max_idle_conns  # type: int
        self._security_token = _security_token  # type: str
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

        @type action: str
        @param action: api name

        @type protocol: str
        @param protocol: http or https

        @type method: str
        @param method: e.g. GET

        @type pathname: str
        @param pathname: pathname of every api

        @type request: dict
        @param request: which contains request params

        @param runtime: which controls some details of call api, such as retry times

        @rtype: dict
        @return: the response
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
                    "sdkVersion": "Tea-SDK-20201209"
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

        @rtype: str
        @return: user agent
        """
        user_agent = "TeaClient/1.0.0"
        return UtilClient.get_user_agent(user_agent)

    def create_digital_logistic_platform_did(self, request):
        """
        Description: 无车承运平台为自身申请DIS分布式数字身份
        Summary: 无车承运平台DIS分布式数字身份申请
        """
        runtime = util_models.RuntimeOptions()
        return self.create_digital_logistic_platform_did_ex(request, runtime)

    def create_digital_logistic_platform_did_ex(self, request, runtime):
        """
        Description: 无车承运平台为自身申请DIS分布式数字身份
        Summary: 无车承运平台DIS分布式数字身份申请
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.CreateDigitalLogisticPlatformDidResponse().from_map(self.do_request("1.0", "digital.logistic.platform.did.create", "HTTPS", "POST", '/gateway.do', request.to_map(), runtime))

    def create_digital_logistic_agent_did(self, request):
        """
        Description: 代理申请无车承运平台的DIS分布式数字身份。无车saas平台需要为平台中的各个无车承运平台创建dis时需要使用代理创建的模式为其创建分布式数字身份。代理申请分布式数字身份的前置条件为自身需已有分布式数字身份。
        Summary: 无车承运平台DIS分布式数字身份代理申请
        """
        runtime = util_models.RuntimeOptions()
        return self.create_digital_logistic_agent_did_ex(request, runtime)

    def create_digital_logistic_agent_did_ex(self, request, runtime):
        """
        Description: 代理申请无车承运平台的DIS分布式数字身份。无车saas平台需要为平台中的各个无车承运平台创建dis时需要使用代理创建的模式为其创建分布式数字身份。代理申请分布式数字身份的前置条件为自身需已有分布式数字身份。
        Summary: 无车承运平台DIS分布式数字身份代理申请
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.CreateDigitalLogisticAgentDidResponse().from_map(self.do_request("1.0", "digital.logistic.agent.did.create", "HTTPS", "POST", '/gateway.do', request.to_map(), runtime))

    def create_digital_logistic_consignor_dis(self, request):
        """
        Description: 无车承运平台为货主申请联盟中唯一标识货主的DIS分布式数字身份,会对企业信息做核验，同一个企业多次申请dis将会返回相同的分布式数字身份。为货主申请分布式数字身份的前置条件为无车承运平台需已有分布式数字身份。
        Summary: 货主DIS分布式数字身份申请
        """
        runtime = util_models.RuntimeOptions()
        return self.create_digital_logistic_consignor_dis_ex(request, runtime)

    def create_digital_logistic_consignor_dis_ex(self, request, runtime):
        """
        Description: 无车承运平台为货主申请联盟中唯一标识货主的DIS分布式数字身份,会对企业信息做核验，同一个企业多次申请dis将会返回相同的分布式数字身份。为货主申请分布式数字身份的前置条件为无车承运平台需已有分布式数字身份。
        Summary: 货主DIS分布式数字身份申请
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.CreateDigitalLogisticConsignorDisResponse().from_map(self.do_request("1.0", "digital.logistic.consignor.dis.create", "HTTPS", "POST", '/gateway.do', request.to_map(), runtime))

    def create_digital_logistic_driver_dis(self, request):
        """
        Description: 无车承运平台为司机申请DIS分布式数字身份,会对司机做实人认证，同一个司机多次申请dis会返回相同的分布式数字身份。为司机申请分布式数字身份的前置条件为无车承运平台需已有分布式数字身份。
        Summary: 司机DIS分布式数字身份申请
        """
        runtime = util_models.RuntimeOptions()
        return self.create_digital_logistic_driver_dis_ex(request, runtime)

    def create_digital_logistic_driver_dis_ex(self, request, runtime):
        """
        Description: 无车承运平台为司机申请DIS分布式数字身份,会对司机做实人认证，同一个司机多次申请dis会返回相同的分布式数字身份。为司机申请分布式数字身份的前置条件为无车承运平台需已有分布式数字身份。
        Summary: 司机DIS分布式数字身份申请
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.CreateDigitalLogisticDriverDisResponse().from_map(self.do_request("1.0", "digital.logistic.driver.dis.create", "HTTPS", "POST", '/gateway.do', request.to_map(), runtime))

    def create_digital_logistic_cargo_order(self, request):
        """
        Description: 货源订单创建，货主发货给平台时的订单信息
        Summary: 货源订单创建
        """
        runtime = util_models.RuntimeOptions()
        return self.create_digital_logistic_cargo_order_ex(request, runtime)

    def create_digital_logistic_cargo_order_ex(self, request, runtime):
        """
        Description: 货源订单创建，货主发货给平台时的订单信息
        Summary: 货源订单创建
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.CreateDigitalLogisticCargoOrderResponse().from_map(self.do_request("1.0", "digital.logistic.cargo.order.create", "HTTPS", "POST", '/gateway.do', request.to_map(), runtime))

    def create_digital_logistic_cargo_pay(self, request):
        """
        Description: 货源支付订单创建,货源订单需存在。
        Summary: 货源支付订单创建
        """
        runtime = util_models.RuntimeOptions()
        return self.create_digital_logistic_cargo_pay_ex(request, runtime)

    def create_digital_logistic_cargo_pay_ex(self, request, runtime):
        """
        Description: 货源支付订单创建,货源订单需存在。
        Summary: 货源支付订单创建
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.CreateDigitalLogisticCargoPayResponse().from_map(self.do_request("1.0", "digital.logistic.cargo.pay.create", "HTTPS", "POST", '/gateway.do', request.to_map(), runtime))

    def create_digital_logistic_waybill_order(self, request):
        """
        Description: 物流平台将运单指派给下游（承运商、司机）时产生
        Summary: 运单创建
        """
        runtime = util_models.RuntimeOptions()
        return self.create_digital_logistic_waybill_order_ex(request, runtime)

    def create_digital_logistic_waybill_order_ex(self, request, runtime):
        """
        Description: 物流平台将运单指派给下游（承运商、司机）时产生
        Summary: 运单创建
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.CreateDigitalLogisticWaybillOrderResponse().from_map(self.do_request("1.0", "digital.logistic.waybill.order.create", "HTTPS", "POST", '/gateway.do', request.to_map(), runtime))

    def create_digital_logistic_waybill_pay(self, request):
        """
        Description: 创建物流支付订单，运单需已存在并且未结束
        Summary: 运单支付订单创建
        """
        runtime = util_models.RuntimeOptions()
        return self.create_digital_logistic_waybill_pay_ex(request, runtime)

    def create_digital_logistic_waybill_pay_ex(self, request, runtime):
        """
        Description: 创建物流支付订单，运单需已存在并且未结束
        Summary: 运单支付订单创建
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.CreateDigitalLogisticWaybillPayResponse().from_map(self.do_request("1.0", "digital.logistic.waybill.pay.create", "HTTPS", "POST", '/gateway.do', request.to_map(), runtime))

    def import_digital_logistic_waybill_location(self, request):
        """
        Description: 用于上报第三方的轨迹位置信息，运单需已存在并且未结束
        Summary: 第三方位置信息上报
        """
        runtime = util_models.RuntimeOptions()
        return self.import_digital_logistic_waybill_location_ex(request, runtime)

    def import_digital_logistic_waybill_location_ex(self, request, runtime):
        """
        Description: 用于上报第三方的轨迹位置信息，运单需已存在并且未结束
        Summary: 第三方位置信息上报
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.ImportDigitalLogisticWaybillLocationResponse().from_map(self.do_request("1.0", "digital.logistic.waybill.location.import", "HTTPS", "POST", '/gateway.do', request.to_map(), runtime))

    def create_digital_logistic_waybill_bill(self, request):
        """
        Description: 发票订单创建
        Summary: 发票订单创建
        """
        runtime = util_models.RuntimeOptions()
        return self.create_digital_logistic_waybill_bill_ex(request, runtime)

    def create_digital_logistic_waybill_bill_ex(self, request, runtime):
        """
        Description: 发票订单创建
        Summary: 发票订单创建
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.CreateDigitalLogisticWaybillBillResponse().from_map(self.do_request("1.0", "digital.logistic.waybill.bill.create", "HTTPS", "POST", '/gateway.do', request.to_map(), runtime))

    def query_digital_logistic_waybill_status(self, request):
        """
        Description: 查询物流运单状态
        Summary: 查询运单状态
        """
        runtime = util_models.RuntimeOptions()
        return self.query_digital_logistic_waybill_status_ex(request, runtime)

    def query_digital_logistic_waybill_status_ex(self, request, runtime):
        """
        Description: 查询物流运单状态
        Summary: 查询运单状态
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.QueryDigitalLogisticWaybillStatusResponse().from_map(self.do_request("1.0", "digital.logistic.waybill.status.query", "HTTPS", "POST", '/gateway.do', request.to_map(), runtime))

    def finish_digital_logistic_waybill_order(self, request):
        """
        Description: 运单完成表示整个运单的生命周期结束的最终状态，一般为和司机已进行确认结算后调用
        完成后的运单无法再调用支付订单与轨迹位置上传接口。
        Summary: 运单完成
        """
        runtime = util_models.RuntimeOptions()
        return self.finish_digital_logistic_waybill_order_ex(request, runtime)

    def finish_digital_logistic_waybill_order_ex(self, request, runtime):
        """
        Description: 运单完成表示整个运单的生命周期结束的最终状态，一般为和司机已进行确认结算后调用
        完成后的运单无法再调用支付订单与轨迹位置上传接口。
        Summary: 运单完成
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.FinishDigitalLogisticWaybillOrderResponse().from_map(self.do_request("1.0", "digital.logistic.waybill.order.finish", "HTTPS", "POST", '/gateway.do', request.to_map(), runtime))

    def create_digital_logistic_cargo_payorder(self, request):
        """
        Description: 货源支付订单创建,货源订单需存在。
        Summary: 货源支付订单创建
        """
        runtime = util_models.RuntimeOptions()
        return self.create_digital_logistic_cargo_payorder_ex(request, runtime)

    def create_digital_logistic_cargo_payorder_ex(self, request, runtime):
        """
        Description: 货源支付订单创建,货源订单需存在。
        Summary: 货源支付订单创建
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.CreateDigitalLogisticCargoPayorderResponse().from_map(self.do_request("1.0", "digital.logistic.cargo.payorder.create", "HTTPS", "POST", '/gateway.do', request.to_map(), runtime))

    def save_digital_logistic_waybill_order(self, request):
        """
        Description: 当货物到达目的地时，调用此接口
        Summary: 运单运输完成
        """
        runtime = util_models.RuntimeOptions()
        return self.save_digital_logistic_waybill_order_ex(request, runtime)

    def save_digital_logistic_waybill_order_ex(self, request, runtime):
        """
        Description: 当货物到达目的地时，调用此接口
        Summary: 运单运输完成
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.SaveDigitalLogisticWaybillOrderResponse().from_map(self.do_request("1.0", "digital.logistic.waybill.order.save", "HTTPS", "POST", '/gateway.do', request.to_map(), runtime))

    def close_digital_logistic_waybill_order(self, request):
        """
        Description: 运单关闭
        Summary: 运单关闭
        """
        runtime = util_models.RuntimeOptions()
        return self.close_digital_logistic_waybill_order_ex(request, runtime)

    def close_digital_logistic_waybill_order_ex(self, request, runtime):
        """
        Description: 运单关闭
        Summary: 运单关闭
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.CloseDigitalLogisticWaybillOrderResponse().from_map(self.do_request("1.0", "digital.logistic.waybill.order.close", "HTTPS", "POST", '/gateway.do', request.to_map(), runtime))

    def finish_digital_logistic_finance_waybill(self, request):
        """
        Description: 完成物流运单
        Summary: 完成物流运单
        """
        runtime = util_models.RuntimeOptions()
        return self.finish_digital_logistic_finance_waybill_ex(request, runtime)

    def finish_digital_logistic_finance_waybill_ex(self, request, runtime):
        """
        Description: 完成物流运单
        Summary: 完成物流运单
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.FinishDigitalLogisticFinanceWaybillResponse().from_map(self.do_request("1.0", "digital.logistic.finance.waybill.finish", "HTTPS", "POST", '/gateway.do', request.to_map(), runtime))

    def finish_digital_logistic_finance_transport(self, request):
        """
        Description: 运输完成
        Summary: 运输完成
        """
        runtime = util_models.RuntimeOptions()
        return self.finish_digital_logistic_finance_transport_ex(request, runtime)

    def finish_digital_logistic_finance_transport_ex(self, request, runtime):
        """
        Description: 运输完成
        Summary: 运输完成
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.FinishDigitalLogisticFinanceTransportResponse().from_map(self.do_request("1.0", "digital.logistic.finance.transport.finish", "HTTPS", "POST", '/gateway.do', request.to_map(), runtime))

    def update_digital_logistic_finance_waybill(self, request):
        """
        Description: 对运单信息项需更新时调用
        Summary: 更新运单
        """
        runtime = util_models.RuntimeOptions()
        return self.update_digital_logistic_finance_waybill_ex(request, runtime)

    def update_digital_logistic_finance_waybill_ex(self, request, runtime):
        """
        Description: 对运单信息项需更新时调用
        Summary: 更新运单
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.UpdateDigitalLogisticFinanceWaybillResponse().from_map(self.do_request("1.0", "digital.logistic.finance.waybill.update", "HTTPS", "POST", '/gateway.do', request.to_map(), runtime))

    def start_digital_logistic_finance_waybill(self, request):
        """
        Description: 当司机到达货主装货地后，调用此接口
        Summary: 起运运单
        """
        runtime = util_models.RuntimeOptions()
        return self.start_digital_logistic_finance_waybill_ex(request, runtime)

    def start_digital_logistic_finance_waybill_ex(self, request, runtime):
        """
        Description: 当司机到达货主装货地后，调用此接口
        Summary: 起运运单
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.StartDigitalLogisticFinanceWaybillResponse().from_map(self.do_request("1.0", "digital.logistic.finance.waybill.start", "HTTPS", "POST", '/gateway.do', request.to_map(), runtime))

    def create_digital_logistic_captain_dis(self, request):
        """
        Description: 创建承运商账户
        Summary: 创建承运商账户
        """
        runtime = util_models.RuntimeOptions()
        return self.create_digital_logistic_captain_dis_ex(request, runtime)

    def create_digital_logistic_captain_dis_ex(self, request, runtime):
        """
        Description: 创建承运商账户
        Summary: 创建承运商账户
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.CreateDigitalLogisticCaptainDisResponse().from_map(self.do_request("1.0", "digital.logistic.captain.dis.create", "HTTPS", "POST", '/gateway.do', request.to_map(), runtime))

    def create_digital_logistic_cargowaybill_bill(self, request):
        """
        Description: 创建货主账单
        Summary: 货主账单创建
        """
        runtime = util_models.RuntimeOptions()
        return self.create_digital_logistic_cargowaybill_bill_ex(request, runtime)

    def create_digital_logistic_cargowaybill_bill_ex(self, request, runtime):
        """
        Description: 创建货主账单
        Summary: 货主账单创建
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.CreateDigitalLogisticCargowaybillBillResponse().from_map(self.do_request("1.0", "digital.logistic.cargowaybill.bill.create", "HTTPS", "POST", '/gateway.do', request.to_map(), runtime))

    def confirm_digital_logistic_cargowaybill_bill(self, request):
        """
        Description: 确认货主账单
        Summary: 货主账单确认
        """
        runtime = util_models.RuntimeOptions()
        return self.confirm_digital_logistic_cargowaybill_bill_ex(request, runtime)

    def confirm_digital_logistic_cargowaybill_bill_ex(self, request, runtime):
        """
        Description: 确认货主账单
        Summary: 货主账单确认
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.ConfirmDigitalLogisticCargowaybillBillResponse().from_map(self.do_request("1.0", "digital.logistic.cargowaybill.bill.confirm", "HTTPS", "POST", '/gateway.do', request.to_map(), runtime))

    def create_digital_logistic_cargowaybill_billsettle(self, request):
        """
        Description: 结算货主账单
        Summary: 货主账单结算
        """
        runtime = util_models.RuntimeOptions()
        return self.create_digital_logistic_cargowaybill_billsettle_ex(request, runtime)

    def create_digital_logistic_cargowaybill_billsettle_ex(self, request, runtime):
        """
        Description: 结算货主账单
        Summary: 货主账单结算
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.CreateDigitalLogisticCargowaybillBillsettleResponse().from_map(self.do_request("1.0", "digital.logistic.cargowaybill.billsettle.create", "HTTPS", "POST", '/gateway.do', request.to_map(), runtime))

    def update_digital_logistic_waybillorder_platformdid(self, request):
        """
        Description: 运单平台did更新
        Summary: 运单平台did更新
        """
        runtime = util_models.RuntimeOptions()
        return self.update_digital_logistic_waybillorder_platformdid_ex(request, runtime)

    def update_digital_logistic_waybillorder_platformdid_ex(self, request, runtime):
        """
        Description: 运单平台did更新
        Summary: 运单平台did更新
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.UpdateDigitalLogisticWaybillorderPlatformdidResponse().from_map(self.do_request("1.0", "digital.logistic.waybillorder.platformdid.update", "HTTPS", "POST", '/gateway.do', request.to_map(), runtime))

    def update_digital_logistic_cargowaybill_bill(self, request):
        """
        Description: 更新货主账单
        Summary: 货主账单更新
        """
        runtime = util_models.RuntimeOptions()
        return self.update_digital_logistic_cargowaybill_bill_ex(request, runtime)

    def update_digital_logistic_cargowaybill_bill_ex(self, request, runtime):
        """
        Description: 更新货主账单
        Summary: 货主账单更新
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.UpdateDigitalLogisticCargowaybillBillResponse().from_map(self.do_request("1.0", "digital.logistic.cargowaybill.bill.update", "HTTPS", "POST", '/gateway.do', request.to_map(), runtime))

    def create_digital_logistic_dis_did(self, request):
        """
        Description: 分布式申请did账户集合，可通过此接口申请个人类型角色为货主、承运商、司机的分布式数字身份did；可申请企业类型角色为货主、网络货运平台、道路运输企业/3pl、承运商、子平台的分布式数字身份did。注：接口可允许多次调用，但每次调用只允许申请一个角色，不允许一次调用申请多个角色
        Summary: 分布式数字身份申请did集合
        """
        runtime = util_models.RuntimeOptions()
        return self.create_digital_logistic_dis_did_ex(request, runtime)

    def create_digital_logistic_dis_did_ex(self, request, runtime):
        """
        Description: 分布式申请did账户集合，可通过此接口申请个人类型角色为货主、承运商、司机的分布式数字身份did；可申请企业类型角色为货主、网络货运平台、道路运输企业/3pl、承运商、子平台的分布式数字身份did。注：接口可允许多次调用，但每次调用只允许申请一个角色，不允许一次调用申请多个角色
        Summary: 分布式数字身份申请did集合
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.CreateDigitalLogisticDisDidResponse().from_map(self.do_request("1.0", "digital.logistic.dis.did.create", "HTTPS", "POST", '/gateway.do', request.to_map(), runtime))

    def upload_digital_logistic_transport_contract(self, request):
        """
        Description: 3PL运输合同上传
        Summary: 3PL运输合同上传
        """
        runtime = util_models.RuntimeOptions()
        return self.upload_digital_logistic_transport_contract_ex(request, runtime)

    def upload_digital_logistic_transport_contract_ex(self, request, runtime):
        """
        Description: 3PL运输合同上传
        Summary: 3PL运输合同上传
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.UploadDigitalLogisticTransportContractResponse().from_map(self.do_request("1.0", "digital.logistic.transport.contract.upload", "HTTPS", "POST", '/gateway.do', request.to_map(), runtime))

    def upload_digital_logistic_transport_route(self, request):
        """
        Description: 3PL运输线路上传
        Summary: 3PL运输线路上传
        """
        runtime = util_models.RuntimeOptions()
        return self.upload_digital_logistic_transport_route_ex(request, runtime)

    def upload_digital_logistic_transport_route_ex(self, request, runtime):
        """
        Description: 3PL运输线路上传
        Summary: 3PL运输线路上传
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.UploadDigitalLogisticTransportRouteResponse().from_map(self.do_request("1.0", "digital.logistic.transport.route.upload", "HTTPS", "POST", '/gateway.do', request.to_map(), runtime))

    def create_digital_logistic_transport_waybill(self, request):
        """
        Description: 3PL运单创建
        Summary: 3PL运单创建
        """
        runtime = util_models.RuntimeOptions()
        return self.create_digital_logistic_transport_waybill_ex(request, runtime)

    def create_digital_logistic_transport_waybill_ex(self, request, runtime):
        """
        Description: 3PL运单创建
        Summary: 3PL运单创建
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.CreateDigitalLogisticTransportWaybillResponse().from_map(self.do_request("1.0", "digital.logistic.transport.waybill.create", "HTTPS", "POST", '/gateway.do', request.to_map(), runtime))

    def update_digital_logistic_waybill_action(self, request):
        """
        Description: 3PL运单状态更新
        Summary: 3PL运单状态更新
        """
        runtime = util_models.RuntimeOptions()
        return self.update_digital_logistic_waybill_action_ex(request, runtime)

    def update_digital_logistic_waybill_action_ex(self, request, runtime):
        """
        Description: 3PL运单状态更新
        Summary: 3PL运单状态更新
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.UpdateDigitalLogisticWaybillActionResponse().from_map(self.do_request("1.0", "digital.logistic.waybill.action.update", "HTTPS", "POST", '/gateway.do', request.to_map(), runtime))

    def update_digital_logistic_transport_waybill(self, request):
        """
        Description: 3PL运单修改
        Summary: 3PL运单修改
        """
        runtime = util_models.RuntimeOptions()
        return self.update_digital_logistic_transport_waybill_ex(request, runtime)

    def update_digital_logistic_transport_waybill_ex(self, request, runtime):
        """
        Description: 3PL运单修改
        Summary: 3PL运单修改
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.UpdateDigitalLogisticTransportWaybillResponse().from_map(self.do_request("1.0", "digital.logistic.transport.waybill.update", "HTTPS", "POST", '/gateway.do', request.to_map(), runtime))

    def upload_digital_logistic_transport_receipt(self, request):
        """
        Description: 3PL回单上传
        Summary: 3PL回单上传
        """
        runtime = util_models.RuntimeOptions()
        return self.upload_digital_logistic_transport_receipt_ex(request, runtime)

    def upload_digital_logistic_transport_receipt_ex(self, request, runtime):
        """
        Description: 3PL回单上传
        Summary: 3PL回单上传
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.UploadDigitalLogisticTransportReceiptResponse().from_map(self.do_request("1.0", "digital.logistic.transport.receipt.upload", "HTTPS", "POST", '/gateway.do', request.to_map(), runtime))

    def create_digital_logistic_bill_receivablebill(self, request):
        """
        Description: 应收账单创建
        Summary: 应收账单创建
        """
        runtime = util_models.RuntimeOptions()
        return self.create_digital_logistic_bill_receivablebill_ex(request, runtime)

    def create_digital_logistic_bill_receivablebill_ex(self, request, runtime):
        """
        Description: 应收账单创建
        Summary: 应收账单创建
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.CreateDigitalLogisticBillReceivablebillResponse().from_map(self.do_request("1.0", "digital.logistic.bill.receivablebill.create", "HTTPS", "POST", '/gateway.do', request.to_map(), runtime))

    def update_digital_logistic_receivablebill_status(self, request):
        """
        Description: 应收账单状态更新
        Summary: 应收账单状态更新
        """
        runtime = util_models.RuntimeOptions()
        return self.update_digital_logistic_receivablebill_status_ex(request, runtime)

    def update_digital_logistic_receivablebill_status_ex(self, request, runtime):
        """
        Description: 应收账单状态更新
        Summary: 应收账单状态更新
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.UpdateDigitalLogisticReceivablebillStatusResponse().from_map(self.do_request("1.0", "digital.logistic.receivablebill.status.update", "HTTPS", "POST", '/gateway.do', request.to_map(), runtime))

    def update_digital_logistic_bill_receivablebill(self, request):
        """
        Description: 应收账单修改
        Summary: 应收账单修改
        """
        runtime = util_models.RuntimeOptions()
        return self.update_digital_logistic_bill_receivablebill_ex(request, runtime)

    def update_digital_logistic_bill_receivablebill_ex(self, request, runtime):
        """
        Description: 应收账单修改
        Summary: 应收账单修改
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.UpdateDigitalLogisticBillReceivablebillResponse().from_map(self.do_request("1.0", "digital.logistic.bill.receivablebill.update", "HTTPS", "POST", '/gateway.do', request.to_map(), runtime))

    def create_digital_logistic_highway_invoice(self, request):
        """
        Description: 路运发票创建
        Summary: 路运发票创建
        """
        runtime = util_models.RuntimeOptions()
        return self.create_digital_logistic_highway_invoice_ex(request, runtime)

    def create_digital_logistic_highway_invoice_ex(self, request, runtime):
        """
        Description: 路运发票创建
        Summary: 路运发票创建
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.CreateDigitalLogisticHighwayInvoiceResponse().from_map(self.do_request("1.0", "digital.logistic.highway.invoice.create", "HTTPS", "POST", '/gateway.do', request.to_map(), runtime))

    def open_digital_logistic_credit_driver(self, request):
        """
        Description: 司机信用流转协议签署并开通流转能力
        Summary: 司机信用流转协议签署并开通流转能力
        """
        runtime = util_models.RuntimeOptions()
        return self.open_digital_logistic_credit_driver_ex(request, runtime)

    def open_digital_logistic_credit_driver_ex(self, request, runtime):
        """
        Description: 司机信用流转协议签署并开通流转能力
        Summary: 司机信用流转协议签署并开通流转能力
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.OpenDigitalLogisticCreditDriverResponse().from_map(self.do_request("1.0", "digital.logistic.credit.driver.open", "HTTPS", "POST", '/gateway.do', request.to_map(), runtime))

    def query_digital_logistic_credit_driver(self, request):
        """
        Description: 查询司机信用流转能力开通情况
        Summary: 查询司机信用流转能力开通情况
        """
        runtime = util_models.RuntimeOptions()
        return self.query_digital_logistic_credit_driver_ex(request, runtime)

    def query_digital_logistic_credit_driver_ex(self, request, runtime):
        """
        Description: 查询司机信用流转能力开通情况
        Summary: 查询司机信用流转能力开通情况
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.QueryDigitalLogisticCreditDriverResponse().from_map(self.do_request("1.0", "digital.logistic.credit.driver.query", "HTTPS", "POST", '/gateway.do', request.to_map(), runtime))

    def query_digital_logistic_credit_consignor(self, request):
        """
        Description: 查询货主信用流转能力开通情况
        Summary: 查询货主信用流转能力开通情况
        """
        runtime = util_models.RuntimeOptions()
        return self.query_digital_logistic_credit_consignor_ex(request, runtime)

    def query_digital_logistic_credit_consignor_ex(self, request, runtime):
        """
        Description: 查询货主信用流转能力开通情况
        Summary: 查询货主信用流转能力开通情况
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.QueryDigitalLogisticCreditConsignorResponse().from_map(self.do_request("1.0", "digital.logistic.credit.consignor.query", "HTTPS", "POST", '/gateway.do', request.to_map(), runtime))

    def query_digital_logistic_credit_balance(self, request):
        """
        Description: 查询货主信用流转额度
        Summary: 查询货主信用流转额度
        """
        runtime = util_models.RuntimeOptions()
        return self.query_digital_logistic_credit_balance_ex(request, runtime)

    def query_digital_logistic_credit_balance_ex(self, request, runtime):
        """
        Description: 查询货主信用流转额度
        Summary: 查询货主信用流转额度
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.QueryDigitalLogisticCreditBalanceResponse().from_map(self.do_request("1.0", "digital.logistic.credit.balance.query", "HTTPS", "POST", '/gateway.do', request.to_map(), runtime))

    def upload_digital_logistic_credit_issue(self, request):
        """
        Description: 发行信用流转批次信息上传（只做信息上传，供真正web端发行时使用）
        Summary: 发行信用流转批次信息上传
        """
        runtime = util_models.RuntimeOptions()
        return self.upload_digital_logistic_credit_issue_ex(request, runtime)

    def upload_digital_logistic_credit_issue_ex(self, request, runtime):
        """
        Description: 发行信用流转批次信息上传（只做信息上传，供真正web端发行时使用）
        Summary: 发行信用流转批次信息上传
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.UploadDigitalLogisticCreditIssueResponse().from_map(self.do_request("1.0", "digital.logistic.credit.issue.upload", "HTTPS", "POST", '/gateway.do', request.to_map(), runtime))

    def query_digital_logistic_credit_issuebatchstatus(self, request):
        """
        Description: 信用流转批次状态查询
        Summary: 信用流转批次状态查询
        """
        runtime = util_models.RuntimeOptions()
        return self.query_digital_logistic_credit_issuebatchstatus_ex(request, runtime)

    def query_digital_logistic_credit_issuebatchstatus_ex(self, request, runtime):
        """
        Description: 信用流转批次状态查询
        Summary: 信用流转批次状态查询
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.QueryDigitalLogisticCreditIssuebatchstatusResponse().from_map(self.do_request("1.0", "digital.logistic.credit.issuebatchstatus.query", "HTTPS", "POST", '/gateway.do', request.to_map(), runtime))

    def cancel_digital_logistic_credit_issuebatch(self, request):
        """
        Description: 支付批次撤销
        Summary: 支付批次撤销
        """
        runtime = util_models.RuntimeOptions()
        return self.cancel_digital_logistic_credit_issuebatch_ex(request, runtime)

    def cancel_digital_logistic_credit_issuebatch_ex(self, request, runtime):
        """
        Description: 支付批次撤销
        Summary: 支付批次撤销
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.CancelDigitalLogisticCreditIssuebatchResponse().from_map(self.do_request("1.0", "digital.logistic.credit.issuebatch.cancel", "HTTPS", "POST", '/gateway.do', request.to_map(), runtime))

    def query_digital_logistic_credit_issuebyid(self, request):
        """
        Description: 根据id查询信用凭证信息
        Summary: 根据id查询信用凭证信息
        """
        runtime = util_models.RuntimeOptions()
        return self.query_digital_logistic_credit_issuebyid_ex(request, runtime)

    def query_digital_logistic_credit_issuebyid_ex(self, request, runtime):
        """
        Description: 根据id查询信用凭证信息
        Summary: 根据id查询信用凭证信息
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.QueryDigitalLogisticCreditIssuebyidResponse().from_map(self.do_request("1.0", "digital.logistic.credit.issuebyid.query", "HTTPS", "POST", '/gateway.do', request.to_map(), runtime))

    def query_digital_logistic_credit_issuebytime(self, request):
        """
        Description: 根据时间查询信用凭证信息
        Summary: 根据时间查询信用凭证信息
        """
        runtime = util_models.RuntimeOptions()
        return self.query_digital_logistic_credit_issuebytime_ex(request, runtime)

    def query_digital_logistic_credit_issuebytime_ex(self, request, runtime):
        """
        Description: 根据时间查询信用凭证信息
        Summary: 根据时间查询信用凭证信息
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.QueryDigitalLogisticCreditIssuebytimeResponse().from_map(self.do_request("1.0", "digital.logistic.credit.issuebytime.query", "HTTPS", "POST", '/gateway.do', request.to_map(), runtime))

    def query_digital_logistic_credit_userissue(self, request):
        """
        Description: 查询用户持有的信用凭证信息
        Summary: 查询用户持有的信用凭证信息
        """
        runtime = util_models.RuntimeOptions()
        return self.query_digital_logistic_credit_userissue_ex(request, runtime)

    def query_digital_logistic_credit_userissue_ex(self, request, runtime):
        """
        Description: 查询用户持有的信用凭证信息
        Summary: 查询用户持有的信用凭证信息
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.QueryDigitalLogisticCreditUserissueResponse().from_map(self.do_request("1.0", "digital.logistic.credit.userissue.query", "HTTPS", "POST", '/gateway.do', request.to_map(), runtime))

    def query_digital_logistic_credit_statement(self, request):
        """
        Description: 查询用户信用流转流水记录
        Summary: 查询用户信用流转流水记录
        """
        runtime = util_models.RuntimeOptions()
        return self.query_digital_logistic_credit_statement_ex(request, runtime)

    def query_digital_logistic_credit_statement_ex(self, request, runtime):
        """
        Description: 查询用户信用流转流水记录
        Summary: 查询用户信用流转流水记录
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.QueryDigitalLogisticCreditStatementResponse().from_map(self.do_request("1.0", "digital.logistic.credit.statement.query", "HTTPS", "POST", '/gateway.do', request.to_map(), runtime))

    def create_digital_logistic_credit_issuetransfer(self, request):
        """
        Description: 信用凭证拆分转让申请
        Summary: 信用凭证拆分转让申请
        """
        runtime = util_models.RuntimeOptions()
        return self.create_digital_logistic_credit_issuetransfer_ex(request, runtime)

    def create_digital_logistic_credit_issuetransfer_ex(self, request, runtime):
        """
        Description: 信用凭证拆分转让申请
        Summary: 信用凭证拆分转让申请
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.CreateDigitalLogisticCreditIssuetransferResponse().from_map(self.do_request("1.0", "digital.logistic.credit.issuetransfer.create", "HTTPS", "POST", '/gateway.do', request.to_map(), runtime))

    def query_digital_logistic_credit_issuetransfer(self, request):
        """
        Description: 信用凭证拆分转让结果查询
        Summary: 信用凭证拆分转让结果查询
        """
        runtime = util_models.RuntimeOptions()
        return self.query_digital_logistic_credit_issuetransfer_ex(request, runtime)

    def query_digital_logistic_credit_issuetransfer_ex(self, request, runtime):
        """
        Description: 信用凭证拆分转让结果查询
        Summary: 信用凭证拆分转让结果查询
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.QueryDigitalLogisticCreditIssuetransferResponse().from_map(self.do_request("1.0", "digital.logistic.credit.issuetransfer.query", "HTTPS", "POST", '/gateway.do', request.to_map(), runtime))

    def create_digital_logistic_credit_issuefinance(self, request):
        """
        Description: 信用凭证融资申请
        Summary: 信用凭证融资申请
        """
        runtime = util_models.RuntimeOptions()
        return self.create_digital_logistic_credit_issuefinance_ex(request, runtime)

    def create_digital_logistic_credit_issuefinance_ex(self, request, runtime):
        """
        Description: 信用凭证融资申请
        Summary: 信用凭证融资申请
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.CreateDigitalLogisticCreditIssuefinanceResponse().from_map(self.do_request("1.0", "digital.logistic.credit.issuefinance.create", "HTTPS", "POST", '/gateway.do', request.to_map(), runtime))

    def query_digital_logistic_credit_issuefinance(self, request):
        """
        Description: 信用凭证融资结果查询
        Summary: 信用凭证融资结果查询
        """
        runtime = util_models.RuntimeOptions()
        return self.query_digital_logistic_credit_issuefinance_ex(request, runtime)

    def query_digital_logistic_credit_issuefinance_ex(self, request, runtime):
        """
        Description: 信用凭证融资结果查询
        Summary: 信用凭证融资结果查询
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.QueryDigitalLogisticCreditIssuefinanceResponse().from_map(self.do_request("1.0", "digital.logistic.credit.issuefinance.query", "HTTPS", "POST", '/gateway.do', request.to_map(), runtime))

    def query_digital_logistic_credit_issuereceivable(self, request):
        """
        Description: 信用凭证清分信息查询
        Summary: 信用凭证清分信息查询
        """
        runtime = util_models.RuntimeOptions()
        return self.query_digital_logistic_credit_issuereceivable_ex(request, runtime)

    def query_digital_logistic_credit_issuereceivable_ex(self, request, runtime):
        """
        Description: 信用凭证清分信息查询
        Summary: 信用凭证清分信息查询
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.QueryDigitalLogisticCreditIssuereceivableResponse().from_map(self.do_request("1.0", "digital.logistic.credit.issuereceivable.query", "HTTPS", "POST", '/gateway.do', request.to_map(), runtime))

    def query_digital_logistic_credit_issueamount(self, request):
        """
        Description: 信用凭证资产查询
        Summary: 信用凭证资产查询
        """
        runtime = util_models.RuntimeOptions()
        return self.query_digital_logistic_credit_issueamount_ex(request, runtime)

    def query_digital_logistic_credit_issueamount_ex(self, request, runtime):
        """
        Description: 信用凭证资产查询
        Summary: 信用凭证资产查询
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.QueryDigitalLogisticCreditIssueamountResponse().from_map(self.do_request("1.0", "digital.logistic.credit.issueamount.query", "HTTPS", "POST", '/gateway.do', request.to_map(), runtime))

    def callback_digital_logistic_credit_common(self, request):
        """
        Description: 物流金融统一回调接口
        Summary: 物流金融统一回调接口
        """
        runtime = util_models.RuntimeOptions()
        return self.callback_digital_logistic_credit_common_ex(request, runtime)

    def callback_digital_logistic_credit_common_ex(self, request, runtime):
        """
        Description: 物流金融统一回调接口
        Summary: 物流金融统一回调接口
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.CallbackDigitalLogisticCreditCommonResponse().from_map(self.do_request("1.0", "digital.logistic.credit.common.callback", "HTTPS", "POST", '/gateway.do', request.to_map(), runtime))

    def apply_digital_logistic_credit_issueclear(self, request):
        """
        Description: 信用凭证主动清分
        Summary: 信用凭证主动清分
        """
        runtime = util_models.RuntimeOptions()
        return self.apply_digital_logistic_credit_issueclear_ex(request, runtime)

    def apply_digital_logistic_credit_issueclear_ex(self, request, runtime):
        """
        Description: 信用凭证主动清分
        Summary: 信用凭证主动清分
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.ApplyDigitalLogisticCreditIssueclearResponse().from_map(self.do_request("1.0", "digital.logistic.credit.issueclear.apply", "HTTPS", "POST", '/gateway.do', request.to_map(), runtime))

    def send_digital_logistic_credit_proxy(self, request):
        """
        Description: 物流金融代理消息
        Summary: 物流金融代理消息
        """
        runtime = util_models.RuntimeOptions()
        return self.send_digital_logistic_credit_proxy_ex(request, runtime)

    def send_digital_logistic_credit_proxy_ex(self, request, runtime):
        """
        Description: 物流金融代理消息
        Summary: 物流金融代理消息
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.SendDigitalLogisticCreditProxyResponse().from_map(self.do_request("1.0", "digital.logistic.credit.proxy.send", "HTTPS", "POST", '/gateway.do', request.to_map(), runtime))

    def check_digital_logistic_credit_waybill(self, request):
        """
        Description: 运单信用流转核验结果查询
        Summary: 运单信用流转核验结果查询
        """
        runtime = util_models.RuntimeOptions()
        return self.check_digital_logistic_credit_waybill_ex(request, runtime)

    def check_digital_logistic_credit_waybill_ex(self, request, runtime):
        """
        Description: 运单信用流转核验结果查询
        Summary: 运单信用流转核验结果查询
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.CheckDigitalLogisticCreditWaybillResponse().from_map(self.do_request("1.0", "digital.logistic.credit.waybill.check", "HTTPS", "POST", '/gateway.do', request.to_map(), runtime))

    def reopen_digital_logistic_credit_driver(self, request):
        """
        Description: 物流金融信用流转司机换绑
        Summary: 物流金融信用流转司机换绑
        """
        runtime = util_models.RuntimeOptions()
        return self.reopen_digital_logistic_credit_driver_ex(request, runtime)

    def reopen_digital_logistic_credit_driver_ex(self, request, runtime):
        """
        Description: 物流金融信用流转司机换绑
        Summary: 物流金融信用流转司机换绑
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.ReopenDigitalLogisticCreditDriverResponse().from_map(self.do_request("1.0", "digital.logistic.credit.driver.reopen", "HTTPS", "POST", '/gateway.do', request.to_map(), runtime))

    def upload_digital_logistic_credit_authorization(self, request):
        """
        Description: 线下协议授权关系上传
        Summary: 线下协议授权关系上传
        """
        runtime = util_models.RuntimeOptions()
        return self.upload_digital_logistic_credit_authorization_ex(request, runtime)

    def upload_digital_logistic_credit_authorization_ex(self, request, runtime):
        """
        Description: 线下协议授权关系上传
        Summary: 线下协议授权关系上传
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.UploadDigitalLogisticCreditAuthorizationResponse().from_map(self.do_request("1.0", "digital.logistic.credit.authorization.upload", "HTTPS", "POST", '/gateway.do', request.to_map(), runtime))

    def upload_digital_logistic_credit_confirm(self, request):
        """
        Description: 线上应收转让确认关系
        Summary: 线上应收转让确认关系
        """
        runtime = util_models.RuntimeOptions()
        return self.upload_digital_logistic_credit_confirm_ex(request, runtime)

    def upload_digital_logistic_credit_confirm_ex(self, request, runtime):
        """
        Description: 线上应收转让确认关系
        Summary: 线上应收转让确认关系
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.UploadDigitalLogisticCreditConfirmResponse().from_map(self.do_request("1.0", "digital.logistic.credit.confirm.upload", "HTTPS", "POST", '/gateway.do', request.to_map(), runtime))

    def batchcreate_digital_logistic_creditmode_issue(self, request):
        """
        Description: 物流信用流转凭证批量发行
        Summary: 物流信用流转凭证批量发行
        """
        runtime = util_models.RuntimeOptions()
        return self.batchcreate_digital_logistic_creditmode_issue_ex(request, runtime)

    def batchcreate_digital_logistic_creditmode_issue_ex(self, request, runtime):
        """
        Description: 物流信用流转凭证批量发行
        Summary: 物流信用流转凭证批量发行
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.BatchcreateDigitalLogisticCreditmodeIssueResponse().from_map(self.do_request("1.0", "digital.logistic.creditmode.issue.batchcreate", "HTTPS", "POST", '/gateway.do', request.to_map(), runtime))

    def apply_digital_logistic_creditmode_issueclear(self, request):
        """
        Description: 物流信用流转按模式主动清分
        Summary: 物流信用流转按模式主动清分
        """
        runtime = util_models.RuntimeOptions()
        return self.apply_digital_logistic_creditmode_issueclear_ex(request, runtime)

    def apply_digital_logistic_creditmode_issueclear_ex(self, request, runtime):
        """
        Description: 物流信用流转按模式主动清分
        Summary: 物流信用流转按模式主动清分
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.ApplyDigitalLogisticCreditmodeIssueclearResponse().from_map(self.do_request("1.0", "digital.logistic.creditmode.issueclear.apply", "HTTPS", "POST", '/gateway.do', request.to_map(), runtime))

    def upload_digital_logistic_credit_issuebysaas(self, request):
        """
        Description: 信用流转发行信息上传SAAS版
        Summary: 信用流转发行信息上传SAAS版
        """
        runtime = util_models.RuntimeOptions()
        return self.upload_digital_logistic_credit_issuebysaas_ex(request, runtime)

    def upload_digital_logistic_credit_issuebysaas_ex(self, request, runtime):
        """
        Description: 信用流转发行信息上传SAAS版
        Summary: 信用流转发行信息上传SAAS版
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.UploadDigitalLogisticCreditIssuebysaasResponse().from_map(self.do_request("1.0", "digital.logistic.credit.issuebysaas.upload", "HTTPS", "POST", '/gateway.do', request.to_map(), runtime))

    def cancel_digital_logistic_credit_issuebatchbysaas(self, request):
        """
        Description: 信用流转B模式发行批次撤销SAAS版
        Summary: 信用流转B模式发行批次撤销SAAS版
        """
        runtime = util_models.RuntimeOptions()
        return self.cancel_digital_logistic_credit_issuebatchbysaas_ex(request, runtime)

    def cancel_digital_logistic_credit_issuebatchbysaas_ex(self, request, runtime):
        """
        Description: 信用流转B模式发行批次撤销SAAS版
        Summary: 信用流转B模式发行批次撤销SAAS版
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.CancelDigitalLogisticCreditIssuebatchbysaasResponse().from_map(self.do_request("1.0", "digital.logistic.credit.issuebatchbysaas.cancel", "HTTPS", "POST", '/gateway.do', request.to_map(), runtime))

    def query_digital_logistic_credit_balancebysaas(self, request):
        """
        Description: 信用流转可用额度查询SAAS版
        Summary: 信用流转可用额度查询SAAS版
        """
        runtime = util_models.RuntimeOptions()
        return self.query_digital_logistic_credit_balancebysaas_ex(request, runtime)

    def query_digital_logistic_credit_balancebysaas_ex(self, request, runtime):
        """
        Description: 信用流转可用额度查询SAAS版
        Summary: 信用流转可用额度查询SAAS版
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.QueryDigitalLogisticCreditBalancebysaasResponse().from_map(self.do_request("1.0", "digital.logistic.credit.balancebysaas.query", "HTTPS", "POST", '/gateway.do', request.to_map(), runtime))

    def get_digital_logistic_credit_issuescpticket(self, request):
        """
        Description: 信用凭证电子回单获取
        Summary: 信用凭证电子回单获取
        """
        runtime = util_models.RuntimeOptions()
        return self.get_digital_logistic_credit_issuescpticket_ex(request, runtime)

    def get_digital_logistic_credit_issuescpticket_ex(self, request, runtime):
        """
        Description: 信用凭证电子回单获取
        Summary: 信用凭证电子回单获取
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.GetDigitalLogisticCreditIssuescpticketResponse().from_map(self.do_request("1.0", "digital.logistic.credit.issuescpticket.get", "HTTPS", "POST", '/gateway.do', request.to_map(), runtime))

    def query_digital_logistic_credit_issuescpticketresult(self, request):
        """
        Description: 信用凭证电子回单获取结果查询接口
        Summary: 信用凭证电子回单获取结果查询接口
        """
        runtime = util_models.RuntimeOptions()
        return self.query_digital_logistic_credit_issuescpticketresult_ex(request, runtime)

    def query_digital_logistic_credit_issuescpticketresult_ex(self, request, runtime):
        """
        Description: 信用凭证电子回单获取结果查询接口
        Summary: 信用凭证电子回单获取结果查询接口
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.QueryDigitalLogisticCreditIssuescpticketresultResponse().from_map(self.do_request("1.0", "digital.logistic.credit.issuescpticketresult.query", "HTTPS", "POST", '/gateway.do', request.to_map(), runtime))

    def upload_digital_logistic_credit_aplusissue(self, request):
        """
        Description: 信用流转A+模式发行信息上传
        Summary: 信用流转A+模式发行信息上传
        """
        runtime = util_models.RuntimeOptions()
        return self.upload_digital_logistic_credit_aplusissue_ex(request, runtime)

    def upload_digital_logistic_credit_aplusissue_ex(self, request, runtime):
        """
        Description: 信用流转A+模式发行信息上传
        Summary: 信用流转A+模式发行信息上传
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.UploadDigitalLogisticCreditAplusissueResponse().from_map(self.do_request("1.0", "digital.logistic.credit.aplusissue.upload", "HTTPS", "POST", '/gateway.do', request.to_map(), runtime))

    def query_digital_logistic_credit_creditamount(self, request):
        """
        Description: 信用流转可用额度查询接口
        Summary: 信用流转可用额度查询接口
        """
        runtime = util_models.RuntimeOptions()
        return self.query_digital_logistic_credit_creditamount_ex(request, runtime)

    def query_digital_logistic_credit_creditamount_ex(self, request, runtime):
        """
        Description: 信用流转可用额度查询接口
        Summary: 信用流转可用额度查询接口
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.QueryDigitalLogisticCreditCreditamountResponse().from_map(self.do_request("1.0", "digital.logistic.credit.creditamount.query", "HTTPS", "POST", '/gateway.do', request.to_map(), runtime))

    def create_digital_logistic_credit_commonsign(self, request):
        """
        Description: 信用流转非授信通用签约接口
        Summary: 信用流转非授信通用签约接口
        """
        runtime = util_models.RuntimeOptions()
        return self.create_digital_logistic_credit_commonsign_ex(request, runtime)

    def create_digital_logistic_credit_commonsign_ex(self, request, runtime):
        """
        Description: 信用流转非授信通用签约接口
        Summary: 信用流转非授信通用签约接口
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.CreateDigitalLogisticCreditCommonsignResponse().from_map(self.do_request("1.0", "digital.logistic.credit.commonsign.create", "HTTPS", "POST", '/gateway.do', request.to_map(), runtime))

    def query_digital_logistic_credit_commonsign(self, request):
        """
        Description: 信用流转非授信通用签约查询接口
        Summary: 信用流转非授信通用签约查询接口
        """
        runtime = util_models.RuntimeOptions()
        return self.query_digital_logistic_credit_commonsign_ex(request, runtime)

    def query_digital_logistic_credit_commonsign_ex(self, request, runtime):
        """
        Description: 信用流转非授信通用签约查询接口
        Summary: 信用流转非授信通用签约查询接口
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.QueryDigitalLogisticCreditCommonsignResponse().from_map(self.do_request("1.0", "digital.logistic.credit.commonsign.query", "HTTPS", "POST", '/gateway.do', request.to_map(), runtime))

    def batchcreate_digital_logistic_credit_issue(self, request):
        """
        Description: 信用流转凭证合并发行接口
        Summary: 信用流转凭证合并发行接口
        """
        runtime = util_models.RuntimeOptions()
        return self.batchcreate_digital_logistic_credit_issue_ex(request, runtime)

    def batchcreate_digital_logistic_credit_issue_ex(self, request, runtime):
        """
        Description: 信用流转凭证合并发行接口
        Summary: 信用流转凭证合并发行接口
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.BatchcreateDigitalLogisticCreditIssueResponse().from_map(self.do_request("1.0", "digital.logistic.credit.issue.batchcreate", "HTTPS", "POST", '/gateway.do', request.to_map(), runtime))

    def upload_digital_logistic_credit_issuebatch(self, request):
        """
        Description: 信用流转凭证合并发行信息上传接口
        Summary: 信用流转凭证合并发行信息上传接口
        """
        runtime = util_models.RuntimeOptions()
        return self.upload_digital_logistic_credit_issuebatch_ex(request, runtime)

    def upload_digital_logistic_credit_issuebatch_ex(self, request, runtime):
        """
        Description: 信用流转凭证合并发行信息上传接口
        Summary: 信用流转凭证合并发行信息上传接口
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.UploadDigitalLogisticCreditIssuebatchResponse().from_map(self.do_request("1.0", "digital.logistic.credit.issuebatch.upload", "HTTPS", "POST", '/gateway.do', request.to_map(), runtime))

    def get_digital_logistic_issue_transferfile(self, request):
        """
        Description: 信用凭证电子回单获取(新)，明确了凭证的转出方did和转入方did
        Summary: 信用凭证电子回单获取(新)
        """
        runtime = util_models.RuntimeOptions()
        return self.get_digital_logistic_issue_transferfile_ex(request, runtime)

    def get_digital_logistic_issue_transferfile_ex(self, request, runtime):
        """
        Description: 信用凭证电子回单获取(新)，明确了凭证的转出方did和转入方did
        Summary: 信用凭证电子回单获取(新)
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.GetDigitalLogisticIssueTransferfileResponse().from_map(self.do_request("1.0", "digital.logistic.issue.transferfile.get", "HTTPS", "POST", '/gateway.do', request.to_map(), runtime))

    def apply_digital_logistic_insurancepolicy_zhonghuacaixian(self, request):
        """
        Description: 保险服务，投保接口。接口提供幂等逻辑，请求后接口会返回成功、失败、处理中。其中处理中是极端场景，需要客户端使用相同的业务流水号发起重试，以免造成重复投保
        Summary: 投保接口-中华财险-承运人责任险
        """
        runtime = util_models.RuntimeOptions()
        return self.apply_digital_logistic_insurancepolicy_zhonghuacaixian_ex(request, runtime)

    def apply_digital_logistic_insurancepolicy_zhonghuacaixian_ex(self, request, runtime):
        """
        Description: 保险服务，投保接口。接口提供幂等逻辑，请求后接口会返回成功、失败、处理中。其中处理中是极端场景，需要客户端使用相同的业务流水号发起重试，以免造成重复投保
        Summary: 投保接口-中华财险-承运人责任险
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.ApplyDigitalLogisticInsurancepolicyZhonghuacaixianResponse().from_map(self.do_request("1.0", "digital.logistic.insurancepolicy.zhonghuacaixian.apply", "HTTPS", "POST", '/gateway.do', request.to_map(), runtime))

    def cancel_digital_logistic_insurancepolicy_zhonghuacaixian(self, request):
        """
        Description: 数字物流保险，退保接口
        Summary: 退保接口-中华财险-承运人责任险
        """
        runtime = util_models.RuntimeOptions()
        return self.cancel_digital_logistic_insurancepolicy_zhonghuacaixian_ex(request, runtime)

    def cancel_digital_logistic_insurancepolicy_zhonghuacaixian_ex(self, request, runtime):
        """
        Description: 数字物流保险，退保接口
        Summary: 退保接口-中华财险-承运人责任险
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.CancelDigitalLogisticInsurancepolicyZhonghuacaixianResponse().from_map(self.do_request("1.0", "digital.logistic.insurancepolicy.zhonghuacaixian.cancel", "HTTPS", "POST", '/gateway.do', request.to_map(), runtime))

    def push_digital_logistic_insurancenotify_claim(self, request):
        """
        Description: 保险理赔通知
        Summary: 保险理赔通知
        """
        runtime = util_models.RuntimeOptions()
        return self.push_digital_logistic_insurancenotify_claim_ex(request, runtime)

    def push_digital_logistic_insurancenotify_claim_ex(self, request, runtime):
        """
        Description: 保险理赔通知
        Summary: 保险理赔通知
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.PushDigitalLogisticInsurancenotifyClaimResponse().from_map(self.do_request("1.0", "digital.logistic.insurancenotify.claim.push", "HTTPS", "POST", '/gateway.do', request.to_map(), runtime))

    def apply_digital_logistic_insurance_fileurl(self, request):
        """
        Description: 系统会生成上传文件的连接，使用方使用该链接进行文件上传。该链接具有一定的时效性，因此建议按需按时申请使用
        Summary: 上传文件链接申请
        """
        runtime = util_models.RuntimeOptions()
        return self.apply_digital_logistic_insurance_fileurl_ex(request, runtime)

    def apply_digital_logistic_insurance_fileurl_ex(self, request, runtime):
        """
        Description: 系统会生成上传文件的连接，使用方使用该链接进行文件上传。该链接具有一定的时效性，因此建议按需按时申请使用
        Summary: 上传文件链接申请
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.ApplyDigitalLogisticInsuranceFileurlResponse().from_map(self.do_request("1.0", "digital.logistic.insurance.fileurl.apply", "HTTPS", "POST", '/gateway.do', request.to_map(), runtime))

    def apply_digital_logistic_insurancepolicy_universal(self, request):
        """
        Description: 保险服务-平台责任险投保接口。根据运输货物货值生成相应的保费。
        接口提供幂等逻辑，请求后接口会返回成功、失败、处理中。其中处理中是极端场景，需要客户端使用相同的业务流水号发起重试，以免造成重复投保
        Summary: 投保接口-承运人平台责任险
        """
        runtime = util_models.RuntimeOptions()
        return self.apply_digital_logistic_insurancepolicy_universal_ex(request, runtime)

    def apply_digital_logistic_insurancepolicy_universal_ex(self, request, runtime):
        """
        Description: 保险服务-平台责任险投保接口。根据运输货物货值生成相应的保费。
        接口提供幂等逻辑，请求后接口会返回成功、失败、处理中。其中处理中是极端场景，需要客户端使用相同的业务流水号发起重试，以免造成重复投保
        Summary: 投保接口-承运人平台责任险
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.ApplyDigitalLogisticInsurancepolicyUniversalResponse().from_map(self.do_request("1.0", "digital.logistic.insurancepolicy.universal.apply", "HTTPS", "POST", '/gateway.do', request.to_map(), runtime))

    def cancel_digital_logistic_insurancepolicy_universal(self, request):
        """
        Description: 数字物流保险，退保接口
        Summary: 退保接口-承运人平台责任险
        """
        runtime = util_models.RuntimeOptions()
        return self.cancel_digital_logistic_insurancepolicy_universal_ex(request, runtime)

    def cancel_digital_logistic_insurancepolicy_universal_ex(self, request, runtime):
        """
        Description: 数字物流保险，退保接口
        Summary: 退保接口-承运人平台责任险
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.CancelDigitalLogisticInsurancepolicyUniversalResponse().from_map(self.do_request("1.0", "digital.logistic.insurancepolicy.universal.cancel", "HTTPS", "POST", '/gateway.do', request.to_map(), runtime))

    def push_digital_logistic_insurance_olp(self, request):
        """
        Description: 利用区块链智能合约进行离线保单存证
        Summary: 离线保单存证推送
        """
        runtime = util_models.RuntimeOptions()
        return self.push_digital_logistic_insurance_olp_ex(request, runtime)

    def push_digital_logistic_insurance_olp_ex(self, request, runtime):
        """
        Description: 利用区块链智能合约进行离线保单存证
        Summary: 离线保单存证推送
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.PushDigitalLogisticInsuranceOlpResponse().from_map(self.do_request("1.0", "digital.logistic.insurance.olp.push", "HTTPS", "POST", '/gateway.do', request.to_map(), runtime))

    def update_digital_logistic_insurance_olp(self, request):
        """
        Description: 利用区块链智能合约进行离线保单信息更新追踪
        Summary: 离线保单更新
        """
        runtime = util_models.RuntimeOptions()
        return self.update_digital_logistic_insurance_olp_ex(request, runtime)

    def update_digital_logistic_insurance_olp_ex(self, request, runtime):
        """
        Description: 利用区块链智能合约进行离线保单信息更新追踪
        Summary: 离线保单更新
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.UpdateDigitalLogisticInsuranceOlpResponse().from_map(self.do_request("1.0", "digital.logistic.insurance.olp.update", "HTTPS", "POST", '/gateway.do', request.to_map(), runtime))

    def query_digital_logistic_pf_payment(self, request):
        """
        Description: 池融资委托支付入账查询
        Summary: 委托支付入账查询
        """
        runtime = util_models.RuntimeOptions()
        return self.query_digital_logistic_pf_payment_ex(request, runtime)

    def query_digital_logistic_pf_payment_ex(self, request, runtime):
        """
        Description: 池融资委托支付入账查询
        Summary: 委托支付入账查询
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.QueryDigitalLogisticPfPaymentResponse().from_map(self.do_request("1.0", "digital.logistic.pf.payment.query", "HTTPS", "POST", '/gateway.do', request.to_map(), runtime))

    def query_digital_logistic_pf_iou(self, request):
        """
        Description: 池融资借据信息查询
        Summary: 借据信息查询
        """
        runtime = util_models.RuntimeOptions()
        return self.query_digital_logistic_pf_iou_ex(request, runtime)

    def query_digital_logistic_pf_iou_ex(self, request, runtime):
        """
        Description: 池融资借据信息查询
        Summary: 借据信息查询
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.QueryDigitalLogisticPfIouResponse().from_map(self.do_request("1.0", "digital.logistic.pf.iou.query", "HTTPS", "POST", '/gateway.do', request.to_map(), runtime))

    def query_digital_logistic_pf_quota(self, request):
        """
        Description: 池融资授信额度查询
        Summary: 授信额度查询
        """
        runtime = util_models.RuntimeOptions()
        return self.query_digital_logistic_pf_quota_ex(request, runtime)

    def query_digital_logistic_pf_quota_ex(self, request, runtime):
        """
        Description: 池融资授信额度查询
        Summary: 授信额度查询
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.QueryDigitalLogisticPfQuotaResponse().from_map(self.do_request("1.0", "digital.logistic.pf.quota.query", "HTTPS", "POST", '/gateway.do', request.to_map(), runtime))

    def apply_digital_logistic_pf_waybillfinancing(self, request):
        """
        Description: 基于运单的融资申请
        Summary: 运单融资申请
        """
        runtime = util_models.RuntimeOptions()
        return self.apply_digital_logistic_pf_waybillfinancing_ex(request, runtime)

    def apply_digital_logistic_pf_waybillfinancing_ex(self, request, runtime):
        """
        Description: 基于运单的融资申请
        Summary: 运单融资申请
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.ApplyDigitalLogisticPfWaybillfinancingResponse().from_map(self.do_request("1.0", "digital.logistic.pf.waybillfinancing.apply", "HTTPS", "POST", '/gateway.do', request.to_map(), runtime))

    def push_digital_logistic_pf_pledge(self, request):
        """
        Description: 池融资账单质押，用于入池
        Summary: 池融资账单质押
        """
        runtime = util_models.RuntimeOptions()
        return self.push_digital_logistic_pf_pledge_ex(request, runtime)

    def push_digital_logistic_pf_pledge_ex(self, request, runtime):
        """
        Description: 池融资账单质押，用于入池
        Summary: 池融资账单质押
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.PushDigitalLogisticPfPledgeResponse().from_map(self.do_request("1.0", "digital.logistic.pf.pledge.push", "HTTPS", "POST", '/gateway.do', request.to_map(), runtime))

    def query_digital_logistic_pf_pledge(self, request):
        """
        Description: 入池账单质押状态查询
        Summary: 质押状态查询
        """
        runtime = util_models.RuntimeOptions()
        return self.query_digital_logistic_pf_pledge_ex(request, runtime)

    def query_digital_logistic_pf_pledge_ex(self, request, runtime):
        """
        Description: 入池账单质押状态查询
        Summary: 质押状态查询
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.QueryDigitalLogisticPfPledgeResponse().from_map(self.do_request("1.0", "digital.logistic.pf.pledge.query", "HTTPS", "POST", '/gateway.do', request.to_map(), runtime))

    def query_digital_logistic_pf_financing(self, request):
        """
        Description: 池融资融资支用状态查询
        Summary: 池融资融资支用状态查询
        """
        runtime = util_models.RuntimeOptions()
        return self.query_digital_logistic_pf_financing_ex(request, runtime)

    def query_digital_logistic_pf_financing_ex(self, request, runtime):
        """
        Description: 池融资融资支用状态查询
        Summary: 池融资融资支用状态查询
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.QueryDigitalLogisticPfFinancingResponse().from_map(self.do_request("1.0", "digital.logistic.pf.financing.query", "HTTPS", "POST", '/gateway.do', request.to_map(), runtime))

    def create_digital_logistic_did_forwarder(self, request):
        """
        Description: 创建货代did
        Summary: 创建货代did
        """
        runtime = util_models.RuntimeOptions()
        return self.create_digital_logistic_did_forwarder_ex(request, runtime)

    def create_digital_logistic_did_forwarder_ex(self, request, runtime):
        """
        Description: 创建货代did
        Summary: 创建货代did
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.CreateDigitalLogisticDidForwarderResponse().from_map(self.do_request("1.0", "digital.logistic.did.forwarder.create", "HTTPS", "POST", '/gateway.do', request.to_map(), runtime))

    def create_digital_logistic_did_saasplatform(self, request):
        """
        Description: 创建saas平台did
        Summary: 创建saas平台did
        """
        runtime = util_models.RuntimeOptions()
        return self.create_digital_logistic_did_saasplatform_ex(request, runtime)

    def create_digital_logistic_did_saasplatform_ex(self, request, runtime):
        """
        Description: 创建saas平台did
        Summary: 创建saas平台did
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.CreateDigitalLogisticDidSaasplatformResponse().from_map(self.do_request("1.0", "digital.logistic.did.saasplatform.create", "HTTPS", "POST", '/gateway.do', request.to_map(), runtime))

    def create_digital_logistic_did_client(self, request):
        """
        Description: 创建直客did
        Summary: 创建直客did
        """
        runtime = util_models.RuntimeOptions()
        return self.create_digital_logistic_did_client_ex(request, runtime)

    def create_digital_logistic_did_client_ex(self, request, runtime):
        """
        Description: 创建直客did
        Summary: 创建直客did
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.CreateDigitalLogisticDidClientResponse().from_map(self.do_request("1.0", "digital.logistic.did.client.create", "HTTPS", "POST", '/gateway.do', request.to_map(), runtime))

    def save_digital_logistic_biz_order(self, request):
        """
        Description: 保存订单
        Summary: 保存订单
        """
        runtime = util_models.RuntimeOptions()
        return self.save_digital_logistic_biz_order_ex(request, runtime)

    def save_digital_logistic_biz_order_ex(self, request, runtime):
        """
        Description: 保存订单
        Summary: 保存订单
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.SaveDigitalLogisticBizOrderResponse().from_map(self.do_request("1.0", "digital.logistic.biz.order.save", "HTTPS", "POST", '/gateway.do', request.to_map(), runtime))

    def save_digital_logistic_biz_consignorder(self, request):
        """
        Description: 保存托单文件
        Summary: 保存托单文件
        """
        runtime = util_models.RuntimeOptions()
        return self.save_digital_logistic_biz_consignorder_ex(request, runtime)

    def save_digital_logistic_biz_consignorder_ex(self, request, runtime):
        """
        Description: 保存托单文件
        Summary: 保存托单文件
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.SaveDigitalLogisticBizConsignorderResponse().from_map(self.do_request("1.0", "digital.logistic.biz.consignorder.save", "HTTPS", "POST", '/gateway.do', request.to_map(), runtime))

    def save_digital_logistic_biz_goods(self, request):
        """
        Description: 保存货物
        Summary: 保存货物
        """
        runtime = util_models.RuntimeOptions()
        return self.save_digital_logistic_biz_goods_ex(request, runtime)

    def save_digital_logistic_biz_goods_ex(self, request, runtime):
        """
        Description: 保存货物
        Summary: 保存货物
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.SaveDigitalLogisticBizGoodsResponse().from_map(self.do_request("1.0", "digital.logistic.biz.goods.save", "HTTPS", "POST", '/gateway.do', request.to_map(), runtime))

    def save_digital_logistic_biz_sonotify(self, request):
        """
        Description: 保存SO入货通知
        Summary: 保存SO入货通知
        """
        runtime = util_models.RuntimeOptions()
        return self.save_digital_logistic_biz_sonotify_ex(request, runtime)

    def save_digital_logistic_biz_sonotify_ex(self, request, runtime):
        """
        Description: 保存SO入货通知
        Summary: 保存SO入货通知
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.SaveDigitalLogisticBizSonotifyResponse().from_map(self.do_request("1.0", "digital.logistic.biz.sonotify.save", "HTTPS", "POST", '/gateway.do', request.to_map(), runtime))

    def save_digital_logistic_biz_bookingorder(self, request):
        """
        Description: 保存订舱单
        Summary: 保存订舱单
        """
        runtime = util_models.RuntimeOptions()
        return self.save_digital_logistic_biz_bookingorder_ex(request, runtime)

    def save_digital_logistic_biz_bookingorder_ex(self, request, runtime):
        """
        Description: 保存订舱单
        Summary: 保存订舱单
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.SaveDigitalLogisticBizBookingorderResponse().from_map(self.do_request("1.0", "digital.logistic.biz.bookingorder.save", "HTTPS", "POST", '/gateway.do', request.to_map(), runtime))

    def save_digital_logistic_biz_container(self, request):
        """
        Description: 保存集装箱
        Summary: 保存集装箱
        """
        runtime = util_models.RuntimeOptions()
        return self.save_digital_logistic_biz_container_ex(request, runtime)

    def save_digital_logistic_biz_container_ex(self, request, runtime):
        """
        Description: 保存集装箱
        Summary: 保存集装箱
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.SaveDigitalLogisticBizContainerResponse().from_map(self.do_request("1.0", "digital.logistic.biz.container.save", "HTTPS", "POST", '/gateway.do', request.to_map(), runtime))

    def save_digital_logistic_biz_customsorder(self, request):
        """
        Description: 保存报关单
        Summary: 保存报关单
        """
        runtime = util_models.RuntimeOptions()
        return self.save_digital_logistic_biz_customsorder_ex(request, runtime)

    def save_digital_logistic_biz_customsorder_ex(self, request, runtime):
        """
        Description: 保存报关单
        Summary: 保存报关单
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.SaveDigitalLogisticBizCustomsorderResponse().from_map(self.do_request("1.0", "digital.logistic.biz.customsorder.save", "HTTPS", "POST", '/gateway.do', request.to_map(), runtime))

    def save_digital_logistic_biz_vehicle(self, request):
        """
        Description: 保存拖车单
        Summary: 保存拖车单
        """
        runtime = util_models.RuntimeOptions()
        return self.save_digital_logistic_biz_vehicle_ex(request, runtime)

    def save_digital_logistic_biz_vehicle_ex(self, request, runtime):
        """
        Description: 保存拖车单
        Summary: 保存拖车单
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.SaveDigitalLogisticBizVehicleResponse().from_map(self.do_request("1.0", "digital.logistic.biz.vehicle.save", "HTTPS", "POST", '/gateway.do', request.to_map(), runtime))

    def save_digital_logistic_biz_masterbl(self, request):
        """
        Description: 保存master提单
        Summary: 保存master提单
        """
        runtime = util_models.RuntimeOptions()
        return self.save_digital_logistic_biz_masterbl_ex(request, runtime)

    def save_digital_logistic_biz_masterbl_ex(self, request, runtime):
        """
        Description: 保存master提单
        Summary: 保存master提单
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.SaveDigitalLogisticBizMasterblResponse().from_map(self.do_request("1.0", "digital.logistic.biz.masterbl.save", "HTTPS", "POST", '/gateway.do', request.to_map(), runtime))

    def finish_digital_logistic_biz_audit(self, request):
        """
        Description: 内审完成
        Summary: 内审完成
        """
        runtime = util_models.RuntimeOptions()
        return self.finish_digital_logistic_biz_audit_ex(request, runtime)

    def finish_digital_logistic_biz_audit_ex(self, request, runtime):
        """
        Description: 内审完成
        Summary: 内审完成
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.FinishDigitalLogisticBizAuditResponse().from_map(self.do_request("1.0", "digital.logistic.biz.audit.finish", "HTTPS", "POST", '/gateway.do', request.to_map(), runtime))

    def save_digital_logistic_biz_housebl(self, request):
        """
        Description: 保存house提单
        Summary: 保存house提单
        """
        runtime = util_models.RuntimeOptions()
        return self.save_digital_logistic_biz_housebl_ex(request, runtime)

    def save_digital_logistic_biz_housebl_ex(self, request, runtime):
        """
        Description: 保存house提单
        Summary: 保存house提单
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.SaveDigitalLogisticBizHouseblResponse().from_map(self.do_request("1.0", "digital.logistic.biz.housebl.save", "HTTPS", "POST", '/gateway.do', request.to_map(), runtime))

    def create_digital_logistic_bill_paybillorder(self, request):
        """
        Description: 创建应付账单
        Summary: 创建应付账单(已下)
        """
        runtime = util_models.RuntimeOptions()
        return self.create_digital_logistic_bill_paybillorder_ex(request, runtime)

    def create_digital_logistic_bill_paybillorder_ex(self, request, runtime):
        """
        Description: 创建应付账单
        Summary: 创建应付账单(已下)
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.CreateDigitalLogisticBillPaybillorderResponse().from_map(self.do_request("1.0", "digital.logistic.bill.paybillorder.create", "HTTPS", "POST", '/gateway.do', request.to_map(), runtime))

    def create_digital_logistic_bill_receiptbillorder(self, request):
        """
        Description: 创建应收账单
        Summary: 创建应收账单(已下)
        """
        runtime = util_models.RuntimeOptions()
        return self.create_digital_logistic_bill_receiptbillorder_ex(request, runtime)

    def create_digital_logistic_bill_receiptbillorder_ex(self, request, runtime):
        """
        Description: 创建应收账单
        Summary: 创建应收账单(已下)
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.CreateDigitalLogisticBillReceiptbillorderResponse().from_map(self.do_request("1.0", "digital.logistic.bill.receiptbillorder.create", "HTTPS", "POST", '/gateway.do', request.to_map(), runtime))

    def save_digital_logistic_bill_paybilltariff(self, request):
        """
        Description: 保存应付资费项
        Summary: 保存应付资费项
        """
        runtime = util_models.RuntimeOptions()
        return self.save_digital_logistic_bill_paybilltariff_ex(request, runtime)

    def save_digital_logistic_bill_paybilltariff_ex(self, request, runtime):
        """
        Description: 保存应付资费项
        Summary: 保存应付资费项
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.SaveDigitalLogisticBillPaybilltariffResponse().from_map(self.do_request("1.0", "digital.logistic.bill.paybilltariff.save", "HTTPS", "POST", '/gateway.do', request.to_map(), runtime))

    def save_digital_logistic_bill_receiptbilltariff(self, request):
        """
        Description: 保存应收资费项
        Summary: 保存应收资费项
        """
        runtime = util_models.RuntimeOptions()
        return self.save_digital_logistic_bill_receiptbilltariff_ex(request, runtime)

    def save_digital_logistic_bill_receiptbilltariff_ex(self, request, runtime):
        """
        Description: 保存应收资费项
        Summary: 保存应收资费项
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.SaveDigitalLogisticBillReceiptbilltariffResponse().from_map(self.do_request("1.0", "digital.logistic.bill.receiptbilltariff.save", "HTTPS", "POST", '/gateway.do', request.to_map(), runtime))

    def verify_digital_logistic_bill_paybill(self, request):
        """
        Description: 核销应付资费项
        Summary: 核销应付资费项
        """
        runtime = util_models.RuntimeOptions()
        return self.verify_digital_logistic_bill_paybill_ex(request, runtime)

    def verify_digital_logistic_bill_paybill_ex(self, request, runtime):
        """
        Description: 核销应付资费项
        Summary: 核销应付资费项
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.VerifyDigitalLogisticBillPaybillResponse().from_map(self.do_request("1.0", "digital.logistic.bill.paybill.verify", "HTTPS", "POST", '/gateway.do', request.to_map(), runtime))

    def verify_digital_logistic_bill_receiptbillorder(self, request):
        """
        Description: 核销应收资费项
        Summary: 核销应收资费项
        """
        runtime = util_models.RuntimeOptions()
        return self.verify_digital_logistic_bill_receiptbillorder_ex(request, runtime)

    def verify_digital_logistic_bill_receiptbillorder_ex(self, request, runtime):
        """
        Description: 核销应收资费项
        Summary: 核销应收资费项
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.VerifyDigitalLogisticBillReceiptbillorderResponse().from_map(self.do_request("1.0", "digital.logistic.bill.receiptbillorder.verify", "HTTPS", "POST", '/gateway.do', request.to_map(), runtime))

    def update_digital_logistic_bill_paybillorder(self, request):
        """
        Description: 更新应付账单
        Summary: 更新应付账单
        """
        runtime = util_models.RuntimeOptions()
        return self.update_digital_logistic_bill_paybillorder_ex(request, runtime)

    def update_digital_logistic_bill_paybillorder_ex(self, request, runtime):
        """
        Description: 更新应付账单
        Summary: 更新应付账单
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.UpdateDigitalLogisticBillPaybillorderResponse().from_map(self.do_request("1.0", "digital.logistic.bill.paybillorder.update", "HTTPS", "POST", '/gateway.do', request.to_map(), runtime))

    def update_digital_logistic_bill_receiptbillorder(self, request):
        """
        Description: 更新应收账单
        Summary: 更新应收账单
        """
        runtime = util_models.RuntimeOptions()
        return self.update_digital_logistic_bill_receiptbillorder_ex(request, runtime)

    def update_digital_logistic_bill_receiptbillorder_ex(self, request, runtime):
        """
        Description: 更新应收账单
        Summary: 更新应收账单
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.UpdateDigitalLogisticBillReceiptbillorderResponse().from_map(self.do_request("1.0", "digital.logistic.bill.receiptbillorder.update", "HTTPS", "POST", '/gateway.do', request.to_map(), runtime))

    def save_digital_logistic_bill_payinvoice(self, request):
        """
        Description: 保存应付发票
        Summary: 保存应付发票
        """
        runtime = util_models.RuntimeOptions()
        return self.save_digital_logistic_bill_payinvoice_ex(request, runtime)

    def save_digital_logistic_bill_payinvoice_ex(self, request, runtime):
        """
        Description: 保存应付发票
        Summary: 保存应付发票
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.SaveDigitalLogisticBillPayinvoiceResponse().from_map(self.do_request("1.0", "digital.logistic.bill.payinvoice.save", "HTTPS", "POST", '/gateway.do', request.to_map(), runtime))

    def save_digital_logistic_bill_receiptinvoice(self, request):
        """
        Description: 保存应收发票
        Summary: 保存应收发票
        """
        runtime = util_models.RuntimeOptions()
        return self.save_digital_logistic_bill_receiptinvoice_ex(request, runtime)

    def save_digital_logistic_bill_receiptinvoice_ex(self, request, runtime):
        """
        Description: 保存应收发票
        Summary: 保存应收发票
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.SaveDigitalLogisticBillReceiptinvoiceResponse().from_map(self.do_request("1.0", "digital.logistic.bill.receiptinvoice.save", "HTTPS", "POST", '/gateway.do', request.to_map(), runtime))

    def upload_digital_logistic_biz_financing(self, request):
        """
        Description: 上传历史数据
        Summary: 上传历史数据
        """
        runtime = util_models.RuntimeOptions()
        return self.upload_digital_logistic_biz_financing_ex(request, runtime)

    def upload_digital_logistic_biz_financing_ex(self, request, runtime):
        """
        Description: 上传历史数据
        Summary: 上传历史数据
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.UploadDigitalLogisticBizFinancingResponse().from_map(self.do_request("1.0", "digital.logistic.biz.financing.upload", "HTTPS", "POST", '/gateway.do', request.to_map(), runtime))

    def upload_digital_logistic_biz_order(self, request):
        """
        Description: 上传订单
        Summary: 上传订单
        """
        runtime = util_models.RuntimeOptions()
        return self.upload_digital_logistic_biz_order_ex(request, runtime)

    def upload_digital_logistic_biz_order_ex(self, request, runtime):
        """
        Description: 上传订单
        Summary: 上传订单
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.UploadDigitalLogisticBizOrderResponse().from_map(self.do_request("1.0", "digital.logistic.biz.order.upload", "HTTPS", "POST", '/gateway.do', request.to_map(), runtime))

    def create_digital_logistic_did_carrier(self, request):
        """
        Description: 创建船公司did账户
        Summary: 创建船公司did账户
        """
        runtime = util_models.RuntimeOptions()
        return self.create_digital_logistic_did_carrier_ex(request, runtime)

    def create_digital_logistic_did_carrier_ex(self, request, runtime):
        """
        Description: 创建船公司did账户
        Summary: 创建船公司did账户
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.CreateDigitalLogisticDidCarrierResponse().from_map(self.do_request("1.0", "digital.logistic.did.carrier.create", "HTTPS", "POST", '/gateway.do', request.to_map(), runtime))

    def auth_digital_logistic_sys_forwarder(self, request):
        """
        Description:  货代授权
        Summary:  货代授权
        """
        runtime = util_models.RuntimeOptions()
        return self.auth_digital_logistic_sys_forwarder_ex(request, runtime)

    def auth_digital_logistic_sys_forwarder_ex(self, request, runtime):
        """
        Description:  货代授权
        Summary:  货代授权
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.AuthDigitalLogisticSysForwarderResponse().from_map(self.do_request("1.0", "digital.logistic.sys.forwarder.auth", "HTTPS", "POST", '/gateway.do', request.to_map(), runtime))

    def query_digital_logistic_biz_masterbl(self, request):
        """
        Description: master提单信息查询
        Summary: master提单信息查询
        """
        runtime = util_models.RuntimeOptions()
        return self.query_digital_logistic_biz_masterbl_ex(request, runtime)

    def query_digital_logistic_biz_masterbl_ex(self, request, runtime):
        """
        Description: master提单信息查询
        Summary: master提单信息查询
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.QueryDigitalLogisticBizMasterblResponse().from_map(self.do_request("1.0", "digital.logistic.biz.masterbl.query", "HTTPS", "POST", '/gateway.do', request.to_map(), runtime))

    def save_digital_logistic_biz_payinvoicefile(self, request):
        """
        Description: 应付发票文件上传接口
        Summary: 应付发票文件上传接口
        """
        runtime = util_models.RuntimeOptions()
        return self.save_digital_logistic_biz_payinvoicefile_ex(request, runtime)

    def save_digital_logistic_biz_payinvoicefile_ex(self, request, runtime):
        """
        Description: 应付发票文件上传接口
        Summary: 应付发票文件上传接口
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.SaveDigitalLogisticBizPayinvoicefileResponse().from_map(self.do_request("1.0", "digital.logistic.biz.payinvoicefile.save", "HTTPS", "POST", '/gateway.do', request.to_map(), runtime))

    def upload_digital_logistic_shipping_ebl(self, request):
        """
        Description: 上传电子提单
        Summary: 上传电子提单
        """
        runtime = util_models.RuntimeOptions()
        return self.upload_digital_logistic_shipping_ebl_ex(request, runtime)

    def upload_digital_logistic_shipping_ebl_ex(self, request, runtime):
        """
        Description: 上传电子提单
        Summary: 上传电子提单
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.UploadDigitalLogisticShippingEblResponse().from_map(self.do_request("1.0", "digital.logistic.shipping.ebl.upload", "HTTPS", "POST", '/gateway.do', request.to_map(), runtime))

    def upload_digital_logistic_shipping_eblbatch(self, request):
        """
        Description: 电子提单批次上传，一个I批次下传递多个提单
        Summary: 电子提单批次上传
        """
        runtime = util_models.RuntimeOptions()
        return self.upload_digital_logistic_shipping_eblbatch_ex(request, runtime)

    def upload_digital_logistic_shipping_eblbatch_ex(self, request, runtime):
        """
        Description: 电子提单批次上传，一个I批次下传递多个提单
        Summary: 电子提单批次上传
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.UploadDigitalLogisticShippingEblbatchResponse().from_map(self.do_request("1.0", "digital.logistic.shipping.eblbatch.upload", "HTTPS", "POST", '/gateway.do', request.to_map(), runtime))

    def update_digital_logistic_shipping_eblbatchstatus(self, request):
        """
        Description: 感知收货人提单状态的变更
        Summary: 电子提单批次状态变更
        """
        runtime = util_models.RuntimeOptions()
        return self.update_digital_logistic_shipping_eblbatchstatus_ex(request, runtime)

    def update_digital_logistic_shipping_eblbatchstatus_ex(self, request, runtime):
        """
        Description: 感知收货人提单状态的变更
        Summary: 电子提单批次状态变更
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.UpdateDigitalLogisticShippingEblbatchstatusResponse().from_map(self.do_request("1.0", "digital.logistic.shipping.eblbatchstatus.update", "HTTPS", "POST", '/gateway.do', request.to_map(), runtime))
